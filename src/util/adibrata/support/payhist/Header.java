
package util.adibrata.support.payhist;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.AgrmntMnt;
import com.adibrata.smartdealer.model.PayHistHdr;
import com.adibrata.smartdealer.model.PaymentReceive;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class Header
	{

		Session session;

		private short GetMaxPayHistSeqNo(final Agrmnt agrmnt) throws Exception
			{
				short histseqno = 0;
				try
					{
						final Criteria criteria = this.session.createCriteria(PayHistHdr.class).setProjection(Projections.max("histSeqNo"));
						histseqno = (short) criteria.uniqueResult();
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return histseqno;

			}

		private final Date dtmUpd = Calendar.getInstance().getTime();

		public Header()
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
			}

		public Header(final Session session)
			{
				this.session = session;
			}

		public short SavePayHistHeader(final String UsrUpd, final PaymentReceive paymentReceive) throws Exception
			{

				short histseqno = 0;

				final AgrmntMnt mnt = new AgrmntMnt();
				final PayHistHdr hdr = new PayHistHdr();
				try
					{
						// Get Seq No
						histseqno = this.GetMaxPayHistSeqNo(paymentReceive.getAgrmnt());
						hdr.setHistSeqNo(histseqno);
						hdr.setAgrmnt(paymentReceive.getAgrmnt());
						hdr.setPostingDt(paymentReceive.getPostingDate());
						hdr.setValueDt(paymentReceive.getValueDate());
						hdr.setBankAccId(paymentReceive.getBankAccId());
						hdr.setWop(paymentReceive.getWop());
						hdr.setCorrHistSeq((short) 0);
						hdr.setIsCorrection((short) 0);
						hdr.setJobId(paymentReceive.getJobId());

						hdr.setAmountReceive(paymentReceive.getTotalPayment());

						hdr.setUsrCrt(UsrUpd);
						hdr.setUsrUpd(UsrUpd);

						hdr.setDtmCrt(this.dtmUpd);
						hdr.setDtmUpd(this.dtmUpd);

						mnt.setAgrmnt(paymentReceive.getAgrmnt());
						if (paymentReceive.getInssAmt() > 0)
							{
								final Insurance inss = new Insurance(this.session);

								inss.SaveDetail(UsrUpd, paymentReceive, hdr);
							}
						if (paymentReceive.getInstAmt() > 0)
							{
								final Installment inst = new Installment(this.session);

								inst.SaveDetail(UsrUpd, paymentReceive, hdr);
							}
						if (paymentReceive.getLcamt() > 0)
							{
								final Installment inst = new Installment(this.session);

								inst.SaveDetail(UsrUpd, paymentReceive, hdr);
							}
						if (paymentReceive.getLcinss() > 0)
							{
								final Installment inst = new Installment(this.session);

								inst.SaveDetail(UsrUpd, paymentReceive, hdr);
							}
						if (paymentReceive.getPrepaidAmt() > 0)
							{
								final Installment inst = new Installment(this.session);

								inst.SaveDetail(UsrUpd, paymentReceive, hdr);
							}
						
						
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return histseqno;
			}

	}
