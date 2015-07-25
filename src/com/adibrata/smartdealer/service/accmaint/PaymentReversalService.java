/**
 *
 */

package com.adibrata.smartdealer.service.accmaint;

import java.util.List;

import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.PayHistDtl;
import com.adibrata.smartdealer.model.PayHistHdr;
import com.adibrata.smartdealer.model.PaymentReversal;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 */
public interface PaymentReversalService extends SeviceBase
	{

		public void PaymentReversalSave(final String usrupd, final Agrmnt agrmnt, final PayHistHdr payHistHdr, final PaymentReversal paymentReversal) throws Exception;

		public List<PayHistHdr> PaymentHistoryHeader(Agrmnt agrmnt) throws Exception;

		public List<PayHistDtl> PaymentHistoryDetail(PayHistHdr payhistdtl) throws Exception;

	}
