/**
 *
 */

package com.adibrata.smartdealer.service.accmaint;

import java.util.List;

import com.adibrata.smartdealer.model.CashierHistory;
import com.adibrata.smartdealer.model.HeadCashier;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 */
public interface OpenCashierService extends SeviceBase
	{
		/**
		 * parameter CashierHistory
		 * field partnercode, officeid, employeeid, currencyid, openingamount
		 *
		 * @throws Exception
		 */
		public void CashierOpen(CashierHistory cashierHistory) throws Exception;

		public List<HeadCashier> ListCashierStatus(String partnercode, String officeId) throws Exception;

		public void CashierClose(CashierHistory cashierhistory) throws Exception;

		public Boolean CheckHeadCashier(String partnercode, String officeid, Long employeeid) throws Exception;

	}
