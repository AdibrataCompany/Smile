/**
 * 
 */
package util.adibrata.support.cashbank;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;

/**
 * @author Henry
 *
 */
public class BankAccEndBalance {
	private final Date dtmUpd = Calendar.getInstance().getTime();

	/**
	 * 
	 */
	public BankAccEndBalance() {
		// TODO Auto-generated constructor stub
	}

	public BankAccEndBalance(Session session) {

	}

	public int Update(Session session, Partner partner, Office office,
			long bankaccid, float amount, String usrupd) throws Exception {
		// TODO Auto-generated constructor stub
		int result = 0;
		try {

			final Query qryUpd = session
					.createQuery(
							"update BankAccount set EndongBalance = EndingBalance + :amount, UsrUpd = :usrupd, DtmUpd = :dtmupd "
									+ " Where  PartnerCode  = :partnercode"
									+ " and officeId = :officeid and a.id = :id")
									.setParameter("partnercode", partner.getPartnerCode())
									.setParameter("officeid", office.getId())
									.setParameter("amount", amount)
									.setParameter("id", bankaccid)
									.setParameter("usrupd", usrupd)
									.setParameter("dtmupd", this.dtmUpd);
			result = qryUpd.executeUpdate();
			if (result == 0) {
				throw new Exception("No Record Update in Bank Account");
			}
		} catch (final Exception exp) {
			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return result;

	}
}
