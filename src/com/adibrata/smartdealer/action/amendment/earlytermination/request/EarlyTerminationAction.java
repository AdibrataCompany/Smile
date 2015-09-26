
package com.adibrata.smartdealer.action.amendment.earlytermination.request;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.opensymphony.xwork2.Preparable;

public class EarlyTerminationAction extends BaseAction implements Preparable
	{
		
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		private String mode;
		Partner partner;
		Office office;
		
		public EarlyTerminationAction() throws Exception
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
			
		@Override
		public String execute() throws Exception
			{

				return this.mode;
			}
			
	}
