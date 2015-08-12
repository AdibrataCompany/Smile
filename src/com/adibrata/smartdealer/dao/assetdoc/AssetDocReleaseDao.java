
package com.adibrata.smartdealer.dao.assetdoc;

import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;

public class AssetDocReleaseDao
	{
		Session session;
		int pagesize;

		public AssetDocReleaseDao()
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
				this.pagesize = HibernateHelper.getPagesize();
			}
			
	}
