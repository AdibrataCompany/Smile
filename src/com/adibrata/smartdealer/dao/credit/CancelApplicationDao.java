
package com.adibrata.smartdealer.dao.credit;

import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;

import util.adibrata.framework.dataaccess.HibernateHelper;

public class CancelApplicationDao extends DaoBase
	{
		Session session;
		int pagesize;
		
		public CancelApplicationDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
				this.pagesize = HibernateHelper.getPagesize();
			}
			
	}
