package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

public interface TaksasiService extends SeviceBase {
	public void SaveAdd(Taksasi taksasi) throws Exception;

	public void SaveEdit(Taksasi taksasi) throws Exception;

	public void SaveDel(Taksasi taksasi) throws Exception;

	public List<Taksasi> Paging(int CurrentPage, String WhereCond, String SortBy)
			throws Exception;

	public List<Taksasi> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public Taksasi View(long id) throws Exception;
}
