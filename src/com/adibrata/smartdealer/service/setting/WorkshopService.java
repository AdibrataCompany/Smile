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
public interface WorkshopService extends SeviceBase {
	public void SaveAdd(Workshop workshop) throws Exception;

	public void SaveEdit(Workshop workshop) throws Exception;

	public void SaveDel(Workshop workshop) throws Exception;

	public List<Workshop> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<Workshop> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public Workshop View(Long id) throws Exception;
}
