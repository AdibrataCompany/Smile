/**
 * 
 */
package com.adibrata.smartdealer.service.accpay;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */

public interface SelectionService extends SeviceBase {
	public void Save(AccountPayable accountPayable) throws Exception;

	public List<AccountPayable> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public AccountPayable View(long id) throws Exception;

}
