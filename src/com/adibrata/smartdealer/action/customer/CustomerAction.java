
package com.adibrata.smartdealer.action.customer;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.Preparable;

public class CustomerAction extends BaseAction implements Preparable
	{
		/**
		* 
		*/
		private static final long serialVersionUID = 1L;
		private String mode;
		private CustomerMaintService customerMaintService;
		private Partner partner;
		private Office office;
		private Customer customer;
		private List<Customer> lstCustomer;

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
		 * @return the customerMaintService
		 */
		public CustomerMaintService getCustomerMaintService()
			{
				return this.customerMaintService;
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
		 * @return the customer
		 */
		public Customer getCustomer()
			{
				return this.customer;
			}

		/**
		 * @return the lstCustomer
		 */
		public List<Customer> getLstCustomer()
			{
				return this.lstCustomer;
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
		 * @param customerMaintService
		 *            the customerMaintService to set
		 */
		public void setCustomerMaintService(final CustomerMaintService customerMaintService)
			{
				this.customerMaintService = customerMaintService;
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
		 * @param customer
		 *            the customer to set
		 */
		public void setCustomer(final Customer customer)
			{
				this.customer = customer;
			}

		/**
		 * @param lstCustomer
		 *            the lstCustomer to set
		 */
		public void setLstCustomer(final List<Customer> lstCustomer)
			{
				this.lstCustomer = lstCustomer;
			}

		public CustomerAction()
			{
				// TODO Auto-generated constructor stub
			}

		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

			}

	}
