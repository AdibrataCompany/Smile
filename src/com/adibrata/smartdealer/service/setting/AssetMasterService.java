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
public interface AssetMasterService extends SeviceBase {
	public void SaveAdd(AssetMaster stock) throws Exception;

	public void SaveEdit(AssetMaster stock) throws Exception;

	public void SaveDel(AssetMaster stock) throws Exception;

	public List<AssetMaster> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<AssetMaster> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public AssetMaster View(long id) throws Exception;
}
