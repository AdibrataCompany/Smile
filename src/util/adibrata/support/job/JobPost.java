/**
 *
 */

package util.adibrata.support.job;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;

import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.TransJob;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.transno.GetTransNo;

/**
 * @author Henry
 */
public class JobPost
	{
		public enum JobCode
			{
				accountpayable("APD"), advancerequest("ADV"), advancereturn("ADR"), danatunai("DTN"), entrustout("ENTO"), entrustreceive("ENTR"), otherdisburse("OTD"), otherreceive("OTR"), paymentrequest("PYR"), paymentvoucher(
				        "PVD"), pettycashcorretion("PCO"), pettycashreimburse("PCR"), pettycashtransaction("PCT"), prepaidreceive("PRV"), purchaseinvoice("PRI"), purchaseorder("PRO"), purchasereturn("PRR"), salesorder("SAO"), salesorderreturn(
				                "SAR"), service("SVC"), suspendallocation("SUA"), suspendreverse("SUC"), suspendreceive("SUR"), paymentreceive("PAR"), paymentreverse("PAC"), PDCClearing("PDC"), GoLive("GLV");
								
				private String statusCode;
				
				private JobCode(final String s)
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
		
		public static TransJob JobSave(final Session session, final String partnercode, final long officeid, final JobCode jobcode, final String coaSchemeCode, final Date valueDate, final Date postingDate, final String userCrt) throws Exception
			{
				
				final TransJob transjob = new TransJob();
				final Partner partner = new Partner();
				final String transno = GetTransNo.GenerateTransactionNo(session, partnercode, officeid, "JOB", postingDate);
				
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
				try
					{
						session.save(transjob);
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				finally
					{
						session.flush();
						session.clear();
					}
				return transjob;
			}

		public JobPost()
			{
				JobPost.session = HibernateHelper.getSessionFactory().openSession();
			}

		public JobPost(final Session session)
			{
				JobPost.session = session;
			}
	}
