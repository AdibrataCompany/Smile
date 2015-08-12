
package com.adibrata.smartdealer.dao.assetdoc;

import org.hibernate.Session;

import com.adibrata.smartdealer.model.AgrmntAssetDoc;

import util.adibrata.framework.dataaccess.HibernateHelper;

public class AssetDocReceiveDao
	{
		
		Session session;
		int pagesize;

		public AssetDocReceiveDao()
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
				this.pagesize = HibernateHelper.getPagesize();

			}

		public void SaveAssetDoc(final AgrmntAssetDoc assetDoc)
			{

			}
	}
