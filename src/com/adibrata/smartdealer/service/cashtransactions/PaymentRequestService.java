/**
 * 
 */
package com.adibrata.smartdealer.service.cashtransactions;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
/**
 * @author Henry
 *
 */

public interface PaymentRequestService  extends SeviceBase {
	public void SavePaymentRequest (String usrupd, PayReqHdr payReqHdr, List<PayReqDtl> payReqDtl)throws Exception;
	public List<PayReqHdr> Paging(int CurrentPage, String WhereCond, String SortBy)throws Exception;
	public List<PayReqHdr> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast)throws Exception;
	public List<PayReqDtl> lstPayReqDtl(int CurrentPage, String WhereCond, String SortBy)throws Exception;
	public PayReqDtl View (Long id)throws Exception;

	
}
