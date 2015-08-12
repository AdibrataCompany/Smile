
package com.adibrata.smartdealer.dao.cashtransactions;

import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;

import util.adibrata.framework.dataaccess.HibernateHelper;

public class TransferAccountDao extends DaoBase
	{
		Session session;
		int pagesize;
		
		public TransferAccountDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
				this.pagesize = HibernateHelper.getPagesize();
			}
			
	}
