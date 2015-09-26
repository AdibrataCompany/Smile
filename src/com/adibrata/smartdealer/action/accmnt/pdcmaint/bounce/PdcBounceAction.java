
package com.adibrata.smartdealer.action.accmnt.pdcmaint.bounce;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.opensymphony.xwork2.Preparable;

public class PdcBounceAction extends BaseAction implements Preparable
	{
		/**
		* 
		*/
		private static final long serialVersionUID = 1L;
		Partner partner;
		Office office;
		Long id;
		
		public PdcBounceAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.office = new Office();

				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.office.setId(BaseAction.sesOfficeId());
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
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

			}

	}
