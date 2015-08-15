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
public interface ZipCodeService extends SeviceBase {
	public void SaveAdd(ZipCode zipcode) throws Exception;

	public void SaveEdit(ZipCode zipcode) throws Exception;

	public void SaveDel(ZipCode zipcode) throws Exception;

	public List<ZipCode> Paging(int CurrentPage, String WhereCond, String SortBy)
			throws Exception;

	public List<ZipCode> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public ZipCode View(Long id) throws Exception;

}
