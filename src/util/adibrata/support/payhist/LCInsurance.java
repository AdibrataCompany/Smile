package util.adibrata.support.payhist;

import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;

public class LCInsurance
	{
		static Session session;
		public LCInsurance()
			{
				// TODO Auto-generated constructor stub
				session = HibernateHelper.getSessionFactory().openSession();
			}
		public LCInsurance(Session session)
			{
				LCInstallment.session = session;
			}
		
	}
