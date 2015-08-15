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
public interface COAMasterService extends SeviceBase {

	public void SaveAdd(Coamaster coamaster) throws Exception;

	public void SaveEdit(Coamaster coamaster) throws Exception;

	public void SaveDel(Coamaster coamaster) throws Exception;

	public List<Coamaster> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<Coamaster> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public Coamaster View(Long id) throws Exception;
}
