/**
 * DeskCollDao.java
 */

package com.adibrata.smartdealer.dao.collection;

import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;

import util.adibrata.framework.dataaccess.HibernateHelper;

/**
 * @author Henry
 */
public class DeskCollDao extends DaoBase
	{

		/**
		 *
		 */
		Session session;
		int pagesize;

		public DeskCollDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
				this.pagesize = HibernateHelper.getPagesize();
			}

	}
