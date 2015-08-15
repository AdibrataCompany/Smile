/**
 * 
 */
package com.adibrata.smartdealer.service.sales;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */
public interface SalesOrderService extends SeviceBase {
	public void Save(String usrupd, SalesOrderHdr salesOrderHdr,
			List<SalesOrderDtl> salesOrderDtl) throws Exception;

	public List<Customer> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<Customer> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public Customer viewCustomer(Long id) throws Exception;

	public SalesOrderHdr viewSalesOrderHdr(Long id) throws Exception;

	public List<SalesOrderDtl> viewSalesOrderDtls(SalesOrderHdr salesOrderHdr)
			throws Exception;
}
