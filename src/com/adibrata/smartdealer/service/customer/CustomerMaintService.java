/**
 *
 */

package com.adibrata.smartdealer.service.customer;

import java.util.List;

import com.adibrata.smartdealer.model.CoyCust;
import com.adibrata.smartdealer.model.CoyCustComptInfo;
import com.adibrata.smartdealer.model.CoyCustShareInfo;
import com.adibrata.smartdealer.model.CoyCustWhInfo;
/**
 * @author Henry
 */
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.PersCust;
import com.adibrata.smartdealer.model.PersCustCcinfo;
import com.adibrata.smartdealer.model.PersCustEmergencyInfo;
import com.adibrata.smartdealer.model.PersCustEntInfo;
import com.adibrata.smartdealer.model.PersCustFamilyInfo;
import com.adibrata.smartdealer.model.PersCustFinancialData;
import com.adibrata.smartdealer.model.PersCustJobInfo;
import com.adibrata.smartdealer.model.PersCustLegalInfo;
import com.adibrata.smartdealer.model.PersCustOmsetInfo;
import com.adibrata.smartdealer.model.PersCustOtherBussinessInfo;
import com.adibrata.smartdealer.model.PersCustResidenceInfo;
import com.adibrata.smartdealer.model.PersCustTrusteeInfo;
import com.adibrata.smartdealer.service.SeviceBase;

public interface CustomerMaintService extends SeviceBase
	{

		public List<Customer> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;
		
		public List<Customer> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;
		
		public void SaveCompanyCustomer(String usrupd, CoyCust customer) throws Exception;
		
		public void SaveCompanyCustomer(String usrupd, CoyCustWhInfo customer) throws Exception;
		
		public void SaveCompanyCustomerCompetitor(String usrupd, List<CoyCustComptInfo> customer) throws Exception;
		
		public void SaveCompanyCustomerShare(String usrupd, List<CoyCustShareInfo> customer) throws Exception;
		
		public void SaveCustomer(String usrupd, Customer customer) throws Exception;

		public void SavePersonalCustomer(String usrupd, PersCust customer) throws Exception;
		
		public void SavePersonalCustomer(String usrupd, PersCustEmergencyInfo customer) throws Exception;
		
		public void SavePersonalCustomer(String usrupd, PersCustEntInfo customer) throws Exception;
		
		public void SavePersonalCustomer(String usrupd, PersCustFinancialData customer) throws Exception;
		
		public void SavePersonalCustomer(String usrupd, PersCustJobInfo customer) throws Exception;
		
		public void SavePersonalCustomer(String usrupd, PersCustLegalInfo customer) throws Exception;

		public void SavePersonalCustomer(String usrupd, PersCustOtherBussinessInfo customer) throws Exception;
		
		public void SavePersonalCustomer(String usrupd, PersCustResidenceInfo customer) throws Exception;

		public void SavePersonalCustomer(String usrupd, PersCustTrusteeInfo customer) throws Exception;
		
		public void SavePersonalCustomerCreditCard(String usrupd, List<PersCustCcinfo> customer) throws Exception;
		
		public void SavePersonalCustomerFamily(String usrupd, List<PersCustFamilyInfo> customer) throws Exception;
		
		public void SavePersonalCustomerOmset(String usrupd, List<PersCustOmsetInfo> customer) throws Exception;
		
		public CoyCust ViewCompanyCustomer(long customerid) throws Exception;

		public List<CoyCustComptInfo> ViewCompanyCustomerCompetitorInfo(long customerid) throws Exception;
		
		public CoyCustWhInfo ViewCompanyCustomerWereHouse(long customerid) throws Exception;
		
		public List<CoyCustShareInfo> ViewCompanyShareInfo(long customerid) throws Exception;
		
		public Customer ViewCustomer(long customerid) throws Exception;
		
		public PersCust ViewPersonalCustomer(long customerid) throws Exception;

		public PersCustEmergencyInfo ViewPersonalCustomerEmeregencyInfo(long customerid) throws Exception;
		
		public PersCustJobInfo ViewPersonalCustomerJobInfo(long customerid) throws Exception;

		public PersCustLegalInfo ViewPersonalCustomerLegalInfo(long customerid) throws Exception;
		
		public PersCustOtherBussinessInfo ViewPersonalCustomerOtherBussinessInfo(long customerid) throws Exception;

		public PersCustResidenceInfo ViewPersonalCustomerResidenceInfo(long customerid) throws Exception;
		
		public PersCust ViewPersonalCustomerTrusteeInfo(long customerid) throws Exception;

		public List<PersCustFamilyInfo> ViewPersonalCustomerFamilyInfo(long customerid) throws Exception;
		
		public List<PersCustCcinfo> ViewPersonalCustomerCcInfo(long customerid) throws Exception;

		public PersCustEntInfo ViewPersonalCustomerEnterpreneurInfo(long customerid) throws Exception;

		public PersCustFinancialData ViewPersonalCustomerFinancialData(long customerid) throws Exception;
		
		public List<PersCustOmsetInfo> ViewPersonalCustomerOmset(long customerid) throws Exception;

		public PersCustOtherBussinessInfo ViewPersonalCustomerBussinessInfo(long customerid) throws Exception;
		
	}
