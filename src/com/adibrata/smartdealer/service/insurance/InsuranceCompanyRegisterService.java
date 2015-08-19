
package com.adibrata.smartdealer.service.insurance;

import java.util.List;

import com.adibrata.smartdealer.model.InsCompany;
import com.adibrata.smartdealer.service.SeviceBase;

public interface InsuranceCompanyRegisterService extends SeviceBase
	{
		public void SaveAdd(InsCompany inscoy) throws Exception;

		public void SaveEdit(InsCompany inscoy) throws Exception;

		public void SaveDel(InsCompany inscoy) throws Exception;

		public List<InsCompany> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;

		public List<InsCompany> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;

		public InsCompany View(Long id) throws Exception;

	}
