/**
 *
 */

package com.adibrata.smartdealer.action.othertrans.disburse;

import java.util.List;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.OtherDsbDtl;
import com.adibrata.smartdealer.model.OtherDsbHdr;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.othertransactions.OtherDisburseService;
/**
 * @author Henry
 */
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class OtherDisbAction extends ActionSupport implements Preparable
	{
		
		/**
		 *
		 */
		private String mode;
		private Partner partner;
		private Office office;
		private OtherDsbHdr otherDsbHdr;
		private OtherDsbDtl otherDsbDtl;
		private List<OtherDsbHdr> lstOtherDisHdr;
		private List<OtherDsbDtl> lstOtherDisbDtl;
		
		private OtherDisburseService otherDisburseService;
		
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
						strMode = "start";
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
		 * @return the partner
		 */
		public Partner getPartner()
			{
				return this.partner;
			}
			
		/**
		 * @return the office
		 */
		public Office getOffice()
			{
				return this.office;
			}
			
		/**
		 * @return the otherDsbHdr
		 */
		public OtherDsbHdr getOtherDsbHdr()
			{
				return this.otherDsbHdr;
			}
			
		/**
		 * @return the otherDsbDtl
		 */
		public OtherDsbDtl getOtherDsbDtl()
			{
				return this.otherDsbDtl;
			}
			
		/**
		 * @return the lstOtherDisHdr
		 */
		public List<OtherDsbHdr> getLstOtherDisHdr()
			{
				return this.lstOtherDisHdr;
			}
			
		/**
		 * @return the lstOtherDisbDtl
		 */
		public List<OtherDsbDtl> getLstOtherDisbDtl()
			{
				return this.lstOtherDisbDtl;
			}
			
		/**
		 * @return the otherDisburseService
		 */
		public OtherDisburseService getOtherDisburseService()
			{
				return this.otherDisburseService;
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
		 * @param partner
		 *            the partner to set
		 */
		public void setPartner(final Partner partner)
			{
				this.partner = partner;
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
		 * @param otherDsbHdr
		 *            the otherDsbHdr to set
		 */
		public void setOtherDsbHdr(final OtherDsbHdr otherDsbHdr)
			{
				this.otherDsbHdr = otherDsbHdr;
			}
			
		/**
		 * @param otherDsbDtl
		 *            the otherDsbDtl to set
		 */
		public void setOtherDsbDtl(final OtherDsbDtl otherDsbDtl)
			{
				this.otherDsbDtl = otherDsbDtl;
			}
			
		/**
		 * @param lstOtherDisHdr
		 *            the lstOtherDisHdr to set
		 */
		public void setLstOtherDisHdr(final List<OtherDsbHdr> lstOtherDisHdr)
			{
				this.lstOtherDisHdr = lstOtherDisHdr;
			}
			
		/**
		 * @param lstOtherDisbDtl
		 *            the lstOtherDisbDtl to set
		 */
		public void setLstOtherDisbDtl(final List<OtherDsbDtl> lstOtherDisbDtl)
			{
				this.lstOtherDisbDtl = lstOtherDisbDtl;
			}
			
		/**
		 * @param otherDisburseService
		 *            the otherDisburseService to set
		 */
		public void setOtherDisburseService(final OtherDisburseService otherDisburseService)
			{
				this.otherDisburseService = otherDisburseService;
			}
			
		public OtherDisbAction()
			{
				// TODO Auto-generated constructor stub
			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
			}
			
	}
