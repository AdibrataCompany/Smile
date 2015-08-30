/**
 *
 */

package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.CoaSchmDtl;
import com.adibrata.smartdealer.model.CoaSchmHdr;
import com.adibrata.smartdealer.model.ListCoaSchmDtl;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 */
public interface JournalSchemeService extends SeviceBase
	{
		
		public List<ListCoaSchmDtl> ListCoaSchmDtl(CoaSchmHdr coaSchmHdr) throws Exception;
		
		public List<CoaSchmHdr> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;
		
		public List<CoaSchmHdr> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;
		
		public void Save(String usrupd, CoaSchmHdr coaSchmHdr, List<ListCoaSchmDtl> lstcoaschmdtl) throws Exception;
		
		public void Delete(CoaSchmHdr coaSchmHdr) throws Exception;
		
		public List<CoaSchmDtl> ViewDetail(CoaSchmHdr coaSchmHdr) throws Exception;
		
		public CoaSchmHdr ViewHeader(Long id) throws Exception;
		
	}
