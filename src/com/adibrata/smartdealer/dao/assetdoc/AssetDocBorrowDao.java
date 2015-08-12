
package com.adibrata.smartdealer.dao.assetdoc;

import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;

public class AssetDocBorrowDao
	{
		Session session;
		int pagesize;

		public AssetDocBorrowDao()
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
				
				this.pagesize = HibernateHelper.getPagesize();
			}
			
	}
