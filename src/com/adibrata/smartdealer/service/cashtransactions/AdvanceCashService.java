/**
 *
 */

package com.adibrata.smartdealer.service.cashtransactions;

import java.util.List;

import com.adibrata.smartdealer.model.AdvanceCash;
import com.adibrata.smartdealer.model.AdvanceCashReversal;
import com.adibrata.smartdealer.model.AdvanceTransaction;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 */
public interface AdvanceCashService extends SeviceBase
	{
		public void Save(String usrupd, AdvanceCash advancecash) throws Exception;
		
		public List<AdvanceTransaction> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;
		
		public List<AdvanceTransaction> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;
		
		public AdvanceCash View(Long id) throws Exception;
		
		public void Save(String usrupd, AdvanceCashReversal advancecash) throws Exception;
		
	}
