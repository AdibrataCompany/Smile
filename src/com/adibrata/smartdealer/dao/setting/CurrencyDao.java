
package com.adibrata.smartdealer.dao.setting;

import java.util.List;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Currency;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.CurrencyService;

public class CurrencyDao extends DaoBase implements CurrencyService
	{

		public CurrencyDao() throws Exception
			{
				// TODO Auto-generated constructor stub
			}
			
		@Override
		public List<Currency> CurrencyList(final Partner partner) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public void SaveAdd(final Currency currency) throws Exception
			{
				// TODO Auto-generated method stub

			}
			
		@Override
		public void SaveEdit(final Currency currency) throws Exception
			{
				// TODO Auto-generated method stub

			}
			
		@Override
		public void SaveDel(final Currency currency) throws Exception
			{
				// TODO Auto-generated method stub

			}
			
		@Override
		public List<Currency> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public List<Currency> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public Currency View(final Long id) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}

	}
