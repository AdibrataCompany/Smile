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
		static Session session;
		public Prepaid()
			{
				// TODO Auto-generated constructor stub
				session = HibernateHelper.getSessionFactory().openSession();
			}
		public Prepaid(Session session)
			{
				Header.session = session;
			}
		
	}
