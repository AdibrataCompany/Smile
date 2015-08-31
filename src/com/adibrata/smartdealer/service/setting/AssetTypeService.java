
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.AssetDocMaster;
import com.adibrata.smartdealer.model.AssetType;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.SeviceBase;

public interface AssetTypeService extends SeviceBase
	{
		public void SaveAdd(AssetDocMaster assetDocMaster) throws Exception;
		
		public void Save(AssetType assettype) throws Exception;
		
		public void SaveDel(AssetType assetDocMaster) throws Exception;
		
		public List<AssetType> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;
		
		public List<AssetType> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;
		
		public AssetType View(Long id) throws Exception;

		public List<AssetType> ListAssetType(Partner partner) throws Exception;
		
	}
