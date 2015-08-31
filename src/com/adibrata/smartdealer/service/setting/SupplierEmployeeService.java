
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.SuppEmplInfo;
import com.adibrata.smartdealer.service.SeviceBase;

public interface SupplierEmployeeService extends SeviceBase
	{
		public List<SuppEmplInfo> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;

		public List<SuppEmplInfo> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;

		public void Save(SuppEmplInfo supplier) throws Exception;

		public void SaveDel(SuppEmplInfo supplier) throws Exception;

		public SuppEmplInfo View(Long id) throws Exception;
	}
