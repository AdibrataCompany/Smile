/**
 * OpenCashierDao.java
 */

package com.adibrata.smartdealer.dao.accmaint;

import com.adibrata.smartdealer.dao.DaoBase;

import util.adibrata.framework.dataaccess.HibernateHelper;

/**
 * @author Henry
 */
public class OpenCashierDao extends DaoBase
	{
		
		/**
		 *
		 */
		public OpenCashierDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
				
				this.pagesize = HibernateHelper.getPagesize();
			}
			
	}
