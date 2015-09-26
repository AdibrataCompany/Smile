
package com.adibrata.smartdealer.action.amendment.partialasset.execute;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.opensymphony.xwork2.Preparable;

public class PartialAssetExecuteAction extends BaseAction implements Preparable
	{
		private Partner partner;
		private Office office;
		private static final long serialVersionUID = 1L;
		
		public PartialAssetExecuteAction() throws Exception
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
			
	}
