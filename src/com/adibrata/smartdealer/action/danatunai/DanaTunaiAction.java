
package com.adibrata.smartdealer.action.danatunai;

import java.util.List;

import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.DanaTunai;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.danatunai.DanaTunaiService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class DanaTunaiAction extends ActionSupport implements Preparable
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private DanaTunaiService danaTunaiService;
		private List<Customer> lstCustomer;
		private List<DanaTunai> lstDanaTunai;
		private String mode;
		private Office office;
		private Partner partner;
		
		public DanaTunaiAction()
			{
				// TODO Auto-generated constructor stub
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
						strMode = "start";
					}
				return strMode;
			}
			
		/**
		 * @return the danaTunaiService
		 */
		public DanaTunaiService getDanaTunaiService()
			{
				return this.danaTunaiService;
			}
			
		/**
		 * @return the lstCustomer
		 */
		public List<Customer> getLstCustomer()
			{
				return this.lstCustomer;
			}
			
		/**
		 * @return the lstDanaTunai
		 */
		public List<DanaTunai> getLstDanaTunai()
			{
				return this.lstDanaTunai;
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
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
			}
			
		/**
		 * @param danaTunaiService
		 *            the danaTunaiService to set
		 */
		public void setDanaTunaiService(final DanaTunaiService danaTunaiService)
			{
				this.danaTunaiService = danaTunaiService;
			}
			
		/**
		 * @param lstCustomer
		 *            the lstCustomer to set
		 */
		public void setLstCustomer(final List<Customer> lstCustomer)
			{
				this.lstCustomer = lstCustomer;
			}
			
		/**
		 * @param lstDanaTunai
		 *            the lstDanaTunai to set
		 */
		public void setLstDanaTunai(final List<DanaTunai> lstDanaTunai)
			{
				this.lstDanaTunai = lstDanaTunai;
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
			
	}
