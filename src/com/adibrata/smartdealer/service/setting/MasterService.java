/**
 * 
 */
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */
public interface MasterService extends SeviceBase {
	public void SaveAdd(MasterType masterType, MasterTable masterTable)
			throws Exception;

	public void SaveEdit(MasterType masterType, MasterTable masterTable)
			throws Exception;

	public void SaveDel(MasterTable masterTable) throws Exception;

	public List<MasterTable> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<MasterTable> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public List<MasterType> ListMasterType() throws Exception;

	public MasterTable View(long id) throws Exception;
}
