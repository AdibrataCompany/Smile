/**
 *
 */

package com.adibrata.smartdealer.action.accpay.paymentvoucher.disburse;

import com.adibrata.smartdealer.action.BaseAction;
/**
 * @author Henry
 */
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PaymentVoucher;
import com.adibrata.smartdealer.service.accpay.PVDisbursementService;
import com.opensymphony.xwork2.Preparable;

public class PaymentVoucherAction extends BaseAction implements Preparable
	{
		
		/**
		 *
		 */
		private String mode;
		private Office office;
		private Partner partner;
		private PaymentVoucher paymentVoucher;
		private PVDisbursementService PVDisbursementService;
		
		public PaymentVoucherAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.office = new Office();

				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.office.setId(BaseAction.sesOfficeId());
			}
			
		@Override
		public String execute()
			{
				String strMode;
				strMode = this.mode;
				
				if (this.mode != null)
					{
						switch (strMode)
							{
								case "search" :
								default :
									return "failed";
							}
					}
				else
					{
						strMode = INPUT;
					}
				return strMode;
			}
			
		/**
		 * @return the mode
		 */
		public String getMode()
			{
				return this.mode;
			}
			
		/**
		 * @return the office
		 */
		public Office getOffice()
			{
				return this.office;
			}
			
		/**
		 * @return the partner
		 */
		public Partner getPartner()
			{
				return this.partner;
			}
			
		/**
		 * @return the paymentVoucher
		 */
		public PaymentVoucher getPaymentVoucher()
			{
				return this.paymentVoucher;
			}
			
		/**
		 * @return the pVDisbursementService
		 */
		public PVDisbursementService getPVDisbursementService()
			{
				return this.PVDisbursementService;
			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
			}
			
		/**
		 * @param mode
		 *            the mode to set
		 */
		public void setMode(final String mode)
			{
				this.mode = mode;
			}
			
		/**
		 * @param office
		 *            the office to set
		 */
		public void setOffice(final Office office)
			{
				this.office = office;
			}
			
		/**
		 * @param partner
		 *            the partner to set
		 */
		public void setPartner(final Partner partner)
			{
				this.partner = partner;
			}
			
		/**
		 * @param paymentVoucher
		 *            the paymentVoucher to set
		 */
		public void setPaymentVoucher(final PaymentVoucher paymentVoucher)
			{
				this.paymentVoucher = paymentVoucher;
			}
			
		/**
		 * @param pVDisbursementService
		 *            the pVDisbursementService to set
		 */
		public void setPVDisbursementService(final PVDisbursementService pVDisbursementService)
			{
				this.PVDisbursementService = pVDisbursementService;
			}
			
	}
