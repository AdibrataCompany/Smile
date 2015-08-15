/**
 *
 */

package com.adibrata.smartdealer.service.accmaint;

import java.util.Date;
import java.util.List;

import com.adibrata.smartdealer.model.CashierHistory;
import com.adibrata.smartdealer.model.Currency;
import com.adibrata.smartdealer.model.Employee;
import com.adibrata.smartdealer.model.HeadCashier;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
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

		public List<HeadCashier> ListCashierStatus(final Partner partner, Office office, Date valuedate) throws Exception;

		public List<Employee> ListCashier(final Partner partner, Office office) throws Exception;
		
		public void CashierClose(CashierHistory cashierhistory) throws Exception;

		public Boolean CheckCashierClose(Partner partner, Office office, Currency currency, Employee employee, Date valuedate) throws Exception;

		public Boolean CheckCashierOpen(Partner partner, Office office, Currency currency, Employee employee, Date valuedate) throws Exception;

		public Boolean CheckHeadCashier(Employee employee) throws Exception;

		public CashierHistory View(Long id) throws Exception;

		public Long IdCashierOpen(final Partner partner, final Office office, final Employee employee, final Currency currency, final Date valuedate) throws Exception;

	}
