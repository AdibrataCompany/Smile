/**
 * 
 */
package com.adibrata.smartdealer.service.customer;

import java.util.List;






/**
 * @author Henry
 *
 */
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

public interface NegativeCustomerService  extends SeviceBase {
	public void Save(String usrupd, Customer customer);

	public List<Customer>  Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<Customer> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	
	public List<Object[]> View(long id);
}
