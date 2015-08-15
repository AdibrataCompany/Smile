/**
 * 
 */
package com.adibrata.smartdealer.service.accpay;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
/**
 * @author Henry
 *
 */

public interface PVDisbursementService extends SeviceBase{
	public void Save(PaymentVoucher paymentVoucher)throws Exception;

	public List<PaymentVoucher>  Paging(int CurrentPage, String WhereCond, String SortBy)throws Exception;

		public PaymentVoucher View(Long id)throws Exception;
}
