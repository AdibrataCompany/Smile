/**
 * 
 */
package com.adibrata.smartdealer.service.customer;

import java.util.List;

import com.adibrata.smartdealer.model.CoyCust;
import com.adibrata.smartdealer.model.CoyCustWhInfo;
/**
 * @author Henry
 *
 */
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.PersCust;
import com.adibrata.smartdealer.model.PersCustEmergencyInfo;
import com.adibrata.smartdealer.model.PersCustJobInfo;
import com.adibrata.smartdealer.model.PersCustLegalInfo;
import com.adibrata.smartdealer.model.PersCustResidenceInfo;
import com.adibrata.smartdealer.model.PersCustTrusteeInfo;
import com.adibrata.smartdealer.service.SeviceBase;

public interface CustomerMaintService extends SeviceBase {

	public List<Customer> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<Customer> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;
	public void Save(String usrupd, Customer customer) throws Exception;

	public void SaveCompanyCustomer(String usrupd, CoyCust customer)
			throws Exception;

	public void SaveCompanyCustomer(String usrupd, CoyCustWhInfo customer)
			throws Exception;

	public void SavePersonalCustomer(String usrupd, PersCust customer)
			throws Exception;

	public void SavePersonalCustomer(String usrupd,
			PersCustEmergencyInfo customer) throws Exception;

	public void SavePersonalCustomer(String usrupd, PersCustJobInfo customer)
			throws Exception;

	public void SavePersonalCustomer(String usrupd, PersCustLegalInfo customer)
			throws Exception;

	public void SavePersonalCustomer(String usrupd,
			PersCustResidenceInfo customer) throws Exception;

	public void SavePersonalCustomer(String usrupd, PersCustTrusteeInfo customer)
			throws Exception;

	public Customer View(long id) throws Exception;
}
