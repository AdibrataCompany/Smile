/**
 * Prepaid.java
 */

package util.adibrata.support.payhist;

import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;

/**
 * @author Henry
 */
public class Prepaid
{

	/**
	 *
	 */
		Session session;
		
		public Prepaid()
		{
			// TODO Auto-generated constructor stub
			this.session = HibernateHelper.getSessionFactory().openSession();
		}
		
		public Prepaid(final Session session)
		{
			this.session = session;
		}

}
