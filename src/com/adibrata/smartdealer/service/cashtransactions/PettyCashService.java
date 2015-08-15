/**
 *
 */

package com.adibrata.smartdealer.service.cashtransactions;

import java.util.List;

/**
 * @author Henry
 */
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PettyCashDtl;
import com.adibrata.smartdealer.model.PettyCashHdr;
import com.adibrata.smartdealer.model.PettyCashList;
import com.adibrata.smartdealer.service.SeviceBase;

public interface PettyCashService extends SeviceBase
	{
		public void SavePettyCash(String usrupd, Partner partner, Office office, PettyCashHdr pettycashhdr, List<PettyCashDtl> pettycashdtl) throws Exception;

		public List<PettyCashList> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;

		public List<PettyCashList> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;

		public PettyCashHdr View(Long id) throws Exception;

		public List<PettyCashDtl> ViewDetail(PettyCashHdr pettyCashHdr) throws Exception;

	}
