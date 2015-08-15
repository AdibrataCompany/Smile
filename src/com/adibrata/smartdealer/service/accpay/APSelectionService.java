/**
 * 
 */
package com.adibrata.smartdealer.service.accpay;

import java.util.List;

import com.adibrata.smartdealer.model.AccountPayable;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */

public interface APSelectionService extends SeviceBase {
	public List<AccountPayable> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public void Save(AccountPayable accountPayable) throws Exception;

	public AccountPayable View(Long id) throws Exception;

}
