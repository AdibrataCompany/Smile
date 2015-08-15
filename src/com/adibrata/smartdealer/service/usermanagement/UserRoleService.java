package com.adibrata.smartdealer.service.usermanagement;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
public interface UserRoleService  extends SeviceBase {
	public void SaveAdd(MsUserRole msUserRole);
	public void SaveEdit(MsUserRole msUserRole);
	public void SaveDel(MsUserRole msUserRole);
	
	public List<MsRole>  Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<MsRole> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	
	public MsUserRole View(Long Id);
}
