
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.Currency;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.SeviceBase;

public interface CurrencyService extends SeviceBase
	{
		public List<Currency> CurrencyList(Partner partner) throws Exception;

		public void SaveAdd(Currency currency) throws Exception;

		public void SaveEdit(Currency currency) throws Exception;

		public void SaveDel(Currency currency) throws Exception;
		
		public List<Currency> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;
		
		public List<Currency> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;
		
		public Currency View(Long id) throws Exception;
	}
