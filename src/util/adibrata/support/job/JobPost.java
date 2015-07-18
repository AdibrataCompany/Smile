/**
 * 
 */
package util.adibrata.support.job;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.support.transno.GetTransNo;

import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.TransJob;

/**
 * @author Henry
 *
 */
public class JobPost {
	private static Calendar dtmupd = Calendar.getInstance();
	static Session session;

	public JobPost() {
		session = HibernateHelper.getSessionFactory().openSession();
	}

	@SuppressWarnings("static-access")
	public JobPost(Session session) {
		this.session = session;
	}

	public enum JobCode {
		accountpayable("APD"), advancerequest("ADV"), advancereturn("ADR"), danatunai(
				"DTN"), entrustout("ENTO"), entrustreceive("ENTR"), otherdisburse(
				"OTD"), otherreceive("OTR"), paymentrequest("PYR"), paymentvoucher(
				"PVD"), pettycashcorretion("PCO"), pettycashreimburse("PCR"), pettycashtransaction(
				"PCT"), prepaidreceive("PRV"), purchaseinvoice("PRI"), purchaseorder(
				"PRO"), purchasereturn("PRR"), salesorder("SAO"), salesorderreturn(
				"SAR"), service("SVC");

		private String statusCode;

		private JobCode(String s) {
			statusCode = s;
		}

		public String getJobCode() {
			return statusCode;
		}

	}

	public static TransJob JobSave(Session session, String partnercode,
			long officeid, JobCode jobcode, String coaSchemeCode,
			Date valueDate, Date postingDate, String userCrt) throws Exception {

		TransJob transjob = new TransJob();
		Partner partner = new Partner();
		String transno = GetTransNo.GenerateTransactionNo(session, partnercode,
				officeid, "JOB", postingDate);

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
		transjob.setDtmCrt(dtmupd.getTime());
		transjob.setDtmUpd(dtmupd.getTime());

		session.getTransaction().begin();
		try {
			session.save(transjob);
			session.getTransaction().commit();
		} catch (Exception exp) {
			session.getTransaction().rollback();
		}
		return transjob;
	}
}
