/**
 * 
 */
package com.adibrata.smartdealer.service.customer;

import java.util.List;

/**
 * @author Henry
 *
 */
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.service.SeviceBase;

public interface DuplicateCustomerService extends SeviceBase {

	public List<Customer> Paging(int CurrentPage, String WhereCond,
			String SortBy);

	public List<Customer> SearchDuplicate(String name, String IdNo,
			String MotherName);

	public List<Customer> View(long id);

}
