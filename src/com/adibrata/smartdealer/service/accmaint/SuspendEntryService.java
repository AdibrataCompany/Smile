/**
 *
 */

package com.adibrata.smartdealer.service.accmaint;

import java.util.List;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.SuspendReceive;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 */
public interface SuspendEntryService extends SeviceBase
	{
		public void SuspendEntrySave(final String usrupd, final Partner partner, final Office office, final SuspendReceive suspend) throws Exception;
		
		public List<SuspendReceive> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;
		
		public List<SuspendReceive> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;
		
		public SuspendReceive View(Long id) throws Exception;
	}
