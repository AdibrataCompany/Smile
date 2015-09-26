
package com.adibrata.smartdealer.action.accpay.paymentvoucher.approval;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.opensymphony.xwork2.Preparable;

public class PaymentVoucherApprovalAction extends BaseAction implements Preparable
	{
		/**
		* 
		*/
		private static final long serialVersionUID = 1L;
		Partner partner;
		Office office;
		Long id;
		String message;
		
		public PaymentVoucherApprovalAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.office = new Office();
				
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.office.setId(BaseAction.sesOfficeId());
			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

			}

	}
