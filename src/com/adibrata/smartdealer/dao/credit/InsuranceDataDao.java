
package com.adibrata.smartdealer.dao.credit;

import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;

import util.adibrata.framework.dataaccess.HibernateHelper;

public class InsuranceDataDao extends DaoBase
	{
		Session session;
		int pagesize;
		
		public InsuranceDataDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
				this.pagesize = HibernateHelper.getPagesize();
			}

	}
