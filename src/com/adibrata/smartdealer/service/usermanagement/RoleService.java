/**
 * 
 */
package com.adibrata.smartdealer.service.usermanagement;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
/**
 * @author Henry
 *
 */
public interface RoleService  extends SeviceBase {
	public void SaveAdd(MsRole msRole)throws Exception;
	public void SaveEdit(MsRole msRole)throws Exception;
	public void SaveDel(MsRole msRole)throws Exception;
	public List<MsRole>  Paging(int CurrentPage, String WhereCond, String SortBy)throws Exception;
	public List<MsRole> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;
	
	public MsRole View(long Id)throws Exception;
}
