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
public interface BankAccountService  extends SeviceBase {
	public void SaveAdd(BankAccount bankAccount) throws Exception;

	public void SaveEdit(BankAccount bankAccount) throws Exception;

	public void SaveDel(BankAccount bankAccount) throws Exception;

	public List<BankAccount> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<BankAccount> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public BankAccount View(long id) throws Exception;
}
