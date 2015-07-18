/**
 * 
 */
package com.adibrata.smartdealer.service.purchase;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */
public interface PurchaseOrderService extends SeviceBase {

	public void Save(String usrupd, PurchaseOrderHdr purchaseOrderHdr,
			List<PurchaseOrderDtl> lstpurchaseOrderDtl) throws Exception;

	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public List<PurchaseOrderDtl> viewPurchaseOrderDtls(
			PurchaseOrderHdr purchaseOrderHdr) throws Exception;

	public PurchaseOrderHdr viewPurchaseOrderHdr(long id) throws Exception;
}
