
package com.adibrata.smartdealer.dao.amendment;

import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;

import util.adibrata.framework.dataaccess.HibernateHelper;

public class AssetReplacementDao extends DaoBase
	{

		Session session;
		int pagesize;

		public AssetReplacementDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
				this.pagesize = HibernateHelper.getPagesize();

			}

	}
