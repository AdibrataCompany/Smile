/**
 * OpenCashierDao.java
 */

package com.adibrata.smartdealer.dao.accmaint;

import java.util.List;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.CashierHistory;
import com.adibrata.smartdealer.model.HeadCashier;
import com.adibrata.smartdealer.service.accmaint.OpenCashierService;

/**
 * @author Henry
 */
public class OpenCashierDao extends DaoBase implements OpenCashierService
	{

		/**
		 *
		 */
		public OpenCashierDao() throws Exception
			{
				// TODO Auto-generated constructor stub

			}
			
		@Override
		public void CashierOpen(final CashierHistory cashierHistory) throws Exception
			{
				// TODO Auto-generated method stub

			}
			
		@Override
		public List<HeadCashier> ListCashierStatus(final String partnercode, final String officeId) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public void CashierClose(final CashierHistory cashierhistory) throws Exception
			{
				// TODO Auto-generated method stub

			}
			
		@Override
		public Boolean CheckHeadCashier(final String partnercode, final String officeid, final Long employeeid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}

	}
