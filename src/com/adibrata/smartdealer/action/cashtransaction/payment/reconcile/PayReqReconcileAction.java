
package com.adibrata.smartdealer.action.cashtransaction.payment.reconcile;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.opensymphony.xwork2.Preparable;

public class PayReqReconcileAction extends BaseAction implements Preparable
	{
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		Long id;
		Partner partner;
		Office office;
		String message;

		public PayReqReconcileAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.office = new Office();
				this.office.setId(BaseAction.sesOfficeId());
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				
			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

			}
			
		/**
		 * @return the id
		 */
		public Long getId()
			{
				return this.id;
			}
			
		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final Long id)
			{
				this.id = id;
			}
			
		/**
		 * @return the partner
		 */
		public Partner getPartner()
			{
				return this.partner;
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
		 * @return the office
		 */
		public Office getOffice()
			{
				return this.office;
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
		 * @return the message
		 */
		public String getMessage()
			{
				return this.message;
			}
			
		/**
		 * @param message
		 *            the message to set
		 */
		public void setMessage(final String message)
			{
				this.message = message;
			}
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

	}
