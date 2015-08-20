/**
 *
 */

package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.MasterType;
import com.adibrata.smartdealer.model.MsTable;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 */
public interface MasterService extends SeviceBase
	{
		public void SaveAdd(MsTable masterTable) throws Exception;

		public void SaveEdit(MsTable masterTable) throws Exception;

		public void SaveDel(MsTable masterTable) throws Exception;

		public List<MsTable> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;

		public List<MsTable> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;

		public List<MasterType> ListMasterType() throws Exception;

		public MsTable View(Long id) throws Exception;
	}
