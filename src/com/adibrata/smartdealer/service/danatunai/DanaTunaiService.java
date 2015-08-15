/**
 * 
 */
package com.adibrata.smartdealer.service.danatunai;

/**
 * @author Henry
 *
 */

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
public interface DanaTunaiService  extends SeviceBase {
	public void Save(String usrupd, DanaTunai danaTunai) throws Exception;

	public List<DanaTunai> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;
	public List<DanaTunai> Paging(int CurrentPage, String WhereCond, String SortBy, boolean isLast)throws Exception ;
	
	public DanaTunai viewDanaTunai(Long id) throws Exception;
}
