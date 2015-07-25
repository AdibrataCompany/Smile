/**
 *
 */

package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.AssetDocMaster;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 */
public interface AssetDocMasterService extends SeviceBase
	{
		
		public void SaveAdd(AssetDocMaster assetDocMaster) throws Exception;
		
		public void SaveEdit(AssetDocMaster assetDocMaster) throws Exception;
		
		public void SaveDel(AssetDocMaster assetDocMaster) throws Exception;
		
		public List<AssetDocMaster> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;
		
		public List<AssetDocMaster> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;
		
		public AssetDocMaster View(long id) throws Exception;
		
	}
