
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

	private String WhereCond() {
		String wherecond = "";
		if (this.getSearchvalue() != null
				&& !this.getSearchcriteria().equals("")
				&& !this.getSearchcriteria().equals("0")) {
			if (this.getSearchcriteria().contains("%"))
				wherecond = this.getSearchvalue() + " like '"
						+ this.getSearchcriteria() + "' ";
			else
				wherecond = this.getSearchcriteria() + " = '"
						+ this.getSearchvalue() + "' ";
		}
		return wherecond;
	}

	private void Paging() throws Exception {
		try {
			this.lstCustomer = this.customerMaintService.Paging(this.getPageNumber(),
					this.WhereCond(), "");
		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}

	}

	private void Paging(int islast) throws Exception {
		try {
			this.lstCustomer = this.customerMaintService.Paging(this.getPageNumber(),
					this.WhereCond(), "", true);
		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}

	}

	public void ViewData() throws Exception {
		customer = new Customer();
		try {
			customer = this.customerMaintService.View(id);
			customerNo = customer.getCustomerNo();
			name = customer.getName();
			address = customer.getAddress();
			rt = customer.getRt();
			rw = customer.getRw();
			kelurahan = customer.getKelurahan();
			city = customer.getCity();
			zipcode = customer.getZipcode();
			areaPhone1 = customer.getAreaPhone1();
			areaPhone2 = customer.getAreaPhone2();
			phoneNo1 = customer.getPhoneNo1();
			phoneNo2 = customer.getPhoneNo2();
			areaFax = customer.getAreaFax();
			faxNo = customer.getFaxNo();
			handphone = customer.getHandphone();
			prepaidAmount = customer.getPrepaidAmount();
			aramount = customer.getAramount();
			arpaid = customer.getArpaid();
			arwaived = customer.getArwaived();
		} catch (Exception exp) {
			this.setMessage(BaseAction.ErrorMessage());
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}
	
	private String Save() throws Exception {
		String status = "";
		try {
			Customer customer = new Customer();
			customer.setCustomerNo(customerNo);
			customer.setName(name);
			customer.setAddress(address);
			customer.setRt(rt);
			customer.setRw(rw);
			customer.setKelurahan(kelurahan);
			customer.setCity(city);
			customer.setZipcode(zipcode);
			customer.setAreaPhone1(areaPhone1);
			customer.setAreaPhone2(areaPhone2);
			customer.setPhoneNo1(phoneNo1);
			customer.setPhoneNo2(phoneNo2);
			customer.setAreaFax(areaFax);
			customer.setFaxNo(faxNo);
			customer.setHandphone(handphone);
			customer.setPrepaidAmount(prepaidAmount);
			customer.setAramount(aramount);
			customer.setArpaid(arpaid);
			customer.setArwaived(arwaived);
			this.customerMaintService.Save(usrUpd,customer);
			status = SUCCESS;
			this.setMessage(BaseAction.SuccessMessage());
		} catch (Exception exp) {
			status = ERROR;
			this.setMessage(BaseAction.ErrorMessage());
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return status;
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
