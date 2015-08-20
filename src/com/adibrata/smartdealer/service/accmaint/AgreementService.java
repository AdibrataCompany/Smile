
package com.adibrata.smartdealer.service.accmaint;

import java.util.List;

import com.adibrata.smartdealer.model.AgreementList;
import com.adibrata.smartdealer.service.SeviceBase;

public interface AgreementService extends SeviceBase
	{
		public List<AgreementList> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;

		public List<AgreementList> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;
		
	}
