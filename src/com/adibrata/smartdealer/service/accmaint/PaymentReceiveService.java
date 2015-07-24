/**
 *
 */

package com.adibrata.smartdealer.service.accmaint;

import java.util.Date;

import com.adibrata.smartdealer.model.PaymentInfo;
import com.adibrata.smartdealer.model.PaymentReceive;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 */
public interface PaymentReceiveService extends SeviceBase
	{
		public PaymentInfo PaymentAllocation(long AgrmntId, double amountreceive, Date valuedate) throws Exception;

		public void PaymentReceiveSave(String usrupd, PaymentReceive paymentreceive) throws Exception;

	}
