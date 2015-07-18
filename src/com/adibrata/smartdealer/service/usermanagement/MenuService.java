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
public interface MenuService  extends SeviceBase {
	public void SaveAdd(MsMenu msMenu)throws Exception;
	public void SaveEdit(MsMenu msMenu)throws Exception;
	public void SaveDel(MsMenu msMenu) throws Exception;
	public List<MsMenu>  Paging(int CurrentPage, String WhereCond, String SortBy)throws Exception;
	
	public String MenuRender ()throws Exception;
}
