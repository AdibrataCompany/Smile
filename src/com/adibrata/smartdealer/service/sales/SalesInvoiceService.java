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
public interface SalesInvoiceService extends SeviceBase {
	public void Save(String usrupd, SalesInvoice salesInvoice) throws Exception;

	public List<SalesOrderHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<SalesOrderHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public SalesOrderHdr View(Long id) throws Exception;
}
