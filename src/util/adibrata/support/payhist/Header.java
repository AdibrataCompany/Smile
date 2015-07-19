
package util.adibrata.support.payhist;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.job.JobPost;

import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.AgrmntMnt;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PayHistHdr;
import com.adibrata.smartdealer.model.PaymentReceive;

public class Header
	{
		
		static Session session;
		
		private static short GetMaxPayHistSeqNo(Session session, Agrmnt agrmnt)
			{
				return 0;
				
			}
		
		private final Date dtmUpd = Calendar.getInstance().getTime();
		
		public Header()
			{
				// TODO Auto-generated constructor stub
				session = HibernateHelper.getSessionFactory().openSession();
			}
		
		public Header(Session session)
			{
				Header.session = session;
			}
		
		public long SavePayHistHeader(String UsrUpd, PaymentReceive paymentReceive) throws Exception
			{
				long jobid = 0;
				
				Partner partner = new Partner();
				Office office = new Office();
				partner = paymentReceive.getAgrmnt().getPartner();
				
				office = paymentReceive.getAgrmnt().getOffice();
				session.getTransaction().begin();
				try
					{
						jobid = JobPost.JobSave(Header.session, partner.getPartnerCode(), office.getId(), JobPost.JobCode.salesorder, paymentReceive.getAgrmnt().getCoaSchmCode(), paymentReceive.getValueDate(), paymentReceive.getPostingDate(), UsrUpd).getId();
						
						final AgrmntMnt mnt = new AgrmntMnt();
						final PayHistHdr hdr = new PayHistHdr();
						
						// Get Seq No
						hdr.setHistSeqNo(GetMaxPayHistSeqNo(session, paymentReceive.getAgrmnt()));
						
						hdr.setAgrmnt(paymentReceive.getAgrmnt());
						hdr.setPostingDt(paymentReceive.getPostingDate());
						hdr.setValueDt(paymentReceive.getValueDate());
						hdr.setBankAccId(paymentReceive.getBankAccId());
						hdr.setWop(paymentReceive.getWop());
						hdr.setCorrHistSeq((short) 0);
						hdr.setIsCorrection((short) 0);
						hdr.setJobId(jobid);
						
						hdr.setAmountReceive(paymentReceive.getTotalPayment());
						
						hdr.setUsrCrt(UsrUpd);
						hdr.setUsrUpd(UsrUpd);
						
						hdr.setDtmCrt(this.dtmUpd);
						hdr.setDtmUpd(this.dtmUpd);
						
						mnt.setAgrmnt(paymentReceive.getAgrmnt());
						if (paymentReceive.getInssAmt() > 0)
							{
								final Insurance inss = new Insurance(session);
								
								inss.SaveDetail(UsrUpd, paymentReceive, hdr);
							}
						if (paymentReceive.getInstAmt() > 0)
							{
								final Installment inst = new Installment(session);
								
								inst.SaveDetail(UsrUpd, paymentReceive, hdr);
							}
						if (paymentReceive.getLcamt() > 0)
							{
								final Installment inst = new Installment(session);
								
								inst.SaveDetail(UsrUpd, paymentReceive, hdr);
							}
						if (paymentReceive.getLcinss() > 0)
							{
								final Installment inst = new Installment(session);
								
								inst.SaveDetail(UsrUpd, paymentReceive, hdr);
							}
						if (paymentReceive.getPrepaidAmt() > 0)
							{
								final Installment inst = new Installment(session);
								
								inst.SaveDetail(UsrUpd, paymentReceive, hdr);
							}
						session.getTransaction().commit();
					}
				catch (final Exception exp)
					{
						session.getTransaction().rollback();
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return jobid;
			}
	}
