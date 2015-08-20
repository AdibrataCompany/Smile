
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.SeviceBase;

public interface OfficeService extends SeviceBase
	{
		public void SaveAdd(Office office) throws Exception;
		
		public void SaveEdit(Office office) throws Exception;
		
		public void SaveDel(Office office) throws Exception;
		
		public List<Office> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;
		
		public List<Office> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;
		
		public Office View(Long id) throws Exception;
		
		public List<Office> ListOffice(Partner partner) throws Exception;
	}
