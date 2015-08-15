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

public interface PurchaseReturnService extends SeviceBase {
	public void Save(String usrupd, ReturPurchaseHdr returPurchaseHdr,
			List<ReturPurchaseDtl> returPurchaseDtl) throws Exception;

	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast);

	public PurchaseOrderHdr viewPurchaseOrderHdr(Long id) throws Exception;
}
