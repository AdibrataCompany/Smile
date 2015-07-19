/**
 *
 */
package util.adibrata.support.job;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.transno.GetTransNo;

import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.TransJob;

/**
 * @author Henry
 */
public class JobPost
	{
		public enum JobCode
			{
				accountpayable("APD"), advancerequest("ADV"), advancereturn(
				        "ADR"), danatunai("DTN"), entrustout("ENTO"), entrustreceive(
				        "ENTR"), otherdisburse("OTD"), otherreceive("OTR"), paymentrequest(
				        "PYR"), paymentvoucher("PVD"), pettycashcorretion("PCO"), pettycashreimburse(
				        "PCR"), pettycashtransaction("PCT"), prepaidreceive(
				        "PRV"), purchaseinvoice("PRI"), purchaseorder("PRO"), purchasereturn(
				        "PRR"), salesorder("SAO"), salesorderreturn("SAR"), service(
				        "SVC");
				
				private String statusCode;
				
				private JobCode(String s)
					{
						this.statusCode = s;
					}
				
				public String getJobCode()
					{
						return this.statusCode;
					}
				
			}
		private static Calendar dtmupd = Calendar.getInstance();
		
		static Session session;
		
		public static TransJob JobSave(Session session, String partnercode,
		        long officeid, JobCode jobcode, String coaSchemeCode,
		        Date valueDate, Date postingDate, String userCrt)
		        throws Exception
			{
				
				final TransJob transjob = new TransJob();
				final Partner partner = new Partner();
				final String transno = GetTransNo.GenerateTransactionNo(
				        session, partnercode, officeid, "JOB", postingDate);
				
				partner.setPartnerCode(partnercode);
				transjob.setPartner(partner);
				transjob.setOfficeId(officeid);
				
				transjob.setJobNo(transno);
				transjob.setCoaSchmCode(coaSchemeCode);
				transjob.setJobDate(valueDate);
				transjob.setJobPost(postingDate);
				
				transjob.setJobStatus("NE");
				transjob.setUsrUpd(userCrt);
				transjob.setUsrCrt(userCrt);
				transjob.setTrxConfigCode(jobcode.getJobCode());
				transjob.setDtmCrt(JobPost.dtmupd.getTime());
				transjob.setDtmUpd(JobPost.dtmupd.getTime());
				
				session.getTransaction().begin();
				try
					{
						session.save(transjob);
						session.getTransaction().commit();
					}
				catch (final Exception exp)
					{
						session.getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread()
							.getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread()
							.getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return transjob;
			}
		
		public JobPost()
			{
				JobPost.session = HibernateHelper.getSessionFactory()
				        .openSession();
			}
		
		public JobPost(Session session)
			{
				JobPost.session = session;
			}
	}
