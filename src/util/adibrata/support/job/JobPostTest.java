/**
 * 
 */
package util.adibrata.support.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;

/**
 * @author Henry
 *
 */
public class JobPostTest {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		final Session session = HibernateHelper.getSessionFactory()
				.openSession();

		final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		final String strDate = "2012-12-26";
		final Date trxdate = formatter.parse(strDate);

		JobPost.JobSave(session, "001", 1, JobPost.JobCode.accountpayable,
				"Default", trxdate, trxdate, "Henry");
	}

}
