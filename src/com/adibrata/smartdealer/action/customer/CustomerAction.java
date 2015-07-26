
package com.adibrata.smartdealer.action.customer;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class CustomerAction extends BaseAction implements Preparable
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String mode;
		private CustomerMaintService customerMaintService;
		private Partner partner;
		private Customer customer;
		private List<Customer> lstCustomer;
		private String searchcriteria;
		private String searchvalue;
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private long id;
		private String message;
		
		private String customerNo;
		private String name;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String city;
		private String zipcode;
		private String type;
		private String areaPhone1;
		private String phoneNo1;
		private String areaPhone2;
		private String phoneNo2;
		private String areaFax;
		private String faxNo;
		private String handphone;
		private double prepaidAmount;
		private double aramount;
		private double arpaid;
		private double arwaived;
		
		public CustomerAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				final CustomerMaintService customermaintservice = new CustomerDao();
				
				this.customerMaintService = customermaintservice;
				final Partner partner = new Partner();
				this.setPartner(partner);
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.setCustomer(this.customer);
				if (this.pageNumber == 0)
					{
						this.pageNumber = 1;
					}
			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
			}
			
		@Override
		public String execute() throws Exception
			{
				String strMode;
				strMode = this.mode;
				if (this.mode != null)
					{
						switch (strMode)
							{
								case "search" :
									this.Paging();
									break;
								case "entry" :
									this.ViewData();
									break;
								case "save" :
									strMode = this.Save();
									break;
								case "first" :
									this.pageNumber = 1;
									this.Paging();
									break;
								case "prev" :
									this.pageNumber -= 1;
									if (this.pageNumber <= 1)
										{
											this.pageNumber = 1;
										}
									this.Paging();
									break;
								case "next" :
									this.pageNumber += 1;
									this.Paging();
									break;
								case "last" :
									this.Paging(1);
									break;
								default :
									break;
							}
					}
				else
					{
						this.pageNumber = 1;
						strMode = "start";
					}
				return strMode;
			}
			
		private String WhereCond()
			{
				String wherecond = "";
				if ((this.getSearchvalue() != null) && !this.getSearchcriteria().equals("") && !this.getSearchcriteria().equals("0"))
					{
						if (this.getSearchcriteria().contains("%"))
							{
								wherecond = this.getSearchvalue() + " like '" + this.getSearchcriteria() + "' ";
							}
						else
							{
								wherecond = this.getSearchcriteria() + " = '" + this.getSearchvalue() + "' ";
							}
					}
				return wherecond;
			}
			
		private void Paging() throws Exception
			{
				try
					{
						this.lstCustomer = this.customerMaintService.Paging(this.getPageNumber(), this.WhereCond(), "");
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
					
			}
			
		private void Paging(final int islast) throws Exception
			{
				try
					{
						this.lstCustomer = this.customerMaintService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
					
			}
			
		public void ViewData() throws Exception
			{
				this.customer = new Customer();
				try
					{
						this.customer = this.customerMaintService.View(this.id);
						this.customerNo = this.customer.getCustomerNo();
						this.name = this.customer.getName();
						this.address = this.customer.getAddress();
						this.rt = this.customer.getRt();
						this.rw = this.customer.getRw();
						this.kelurahan = this.customer.getKelurahan();
						this.city = this.customer.getCity();
						this.zipcode = this.customer.getZipcode();
						this.areaPhone1 = this.customer.getAreaPhone1();
						this.areaPhone2 = this.customer.getAreaPhone2();
						this.phoneNo1 = this.customer.getPhoneNo1();
						this.phoneNo2 = this.customer.getPhoneNo2();
						this.areaFax = this.customer.getAreaFax();
						this.faxNo = this.customer.getFaxNo();
						this.handphone = this.customer.getHandphone();
						this.prepaidAmount = this.customer.getPrepaidAmount();
						this.aramount = this.customer.getAramount();
						this.arpaid = this.customer.getArpaid();
						this.arwaived = this.customer.getArwaived();
					}
				catch (final Exception exp)
					{
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
			
		private String Save() throws Exception
			{
				String status = "";
				try
					{
						final Customer customer = new Customer();
						customer.setCustomerNo(this.customerNo);
						customer.setName(this.name);
						customer.setAddress(this.address);
						customer.setRt(this.rt);
						customer.setRw(this.rw);
						customer.setKelurahan(this.kelurahan);
						customer.setCity(this.city);
						customer.setZipcode(this.zipcode);
						customer.setAreaPhone1(this.areaPhone1);
						customer.setAreaPhone2(this.areaPhone2);
						customer.setPhoneNo1(this.phoneNo1);
						customer.setPhoneNo2(this.phoneNo2);
						customer.setAreaFax(this.areaFax);
						customer.setFaxNo(this.faxNo);
						customer.setHandphone(this.handphone);
						customer.setPrepaidAmount(this.prepaidAmount);
						customer.setAramount(this.aramount);
						customer.setArpaid(this.arpaid);
						customer.setArwaived(this.arwaived);
						this.customerMaintService.Save(this.usrUpd, customer);
						status = SUCCESS;
						this.setMessage(BaseAction.SuccessMessage());
					}
				catch (final Exception exp)
					{
						status = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
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
			
		public String getSearchcriteria()
			{
				return this.searchcriteria;
			}
			
		public void setSearchcriteria(final String searchcriteria)
			{
				this.searchcriteria = searchcriteria;
			}
			
		public String getSearchvalue()
			{
				return this.searchvalue;
			}
			
		public void setSearchvalue(final String searchvalue)
			{
				this.searchvalue = searchvalue;
			}
			
		public int getPageNumber()
			{
				return this.pageNumber;
			}
			
		public void setPageNumber(final int pageNumber)
			{
				this.pageNumber = pageNumber;
			}
			
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
			
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
			}
			
		public long getId()
			{
				return this.id;
			}
			
		public void setId(final long id)
			{
				this.id = id;
			}
			
		public String getMessage()
			{
				return this.message;
			}
			
		public void setMessage(final String message)
			{
				this.message = message;
			}
			
		public String getCustomerNo()
			{
				return this.customerNo;
			}
			
		public void setCustomerNo(final String customerNo)
			{
				this.customerNo = customerNo;
			}
			
		public String getName()
			{
				return this.name;
			}
			
		public void setName(final String name)
			{
				this.name = name;
			}
			
		public String getAddress()
			{
				return this.address;
			}
			
		public void setAddress(final String address)
			{
				this.address = address;
			}
			
		public String getRt()
			{
				return this.rt;
			}
			
		public void setRt(final String rt)
			{
				this.rt = rt;
			}
			
		public String getRw()
			{
				return this.rw;
			}
			
		public void setRw(final String rw)
			{
				this.rw = rw;
			}
			
		public String getKelurahan()
			{
				return this.kelurahan;
			}
			
		public void setKelurahan(final String kelurahan)
			{
				this.kelurahan = kelurahan;
			}
			
		public String getCity()
			{
				return this.city;
			}
			
		public void setCity(final String city)
			{
				this.city = city;
			}
			
		public String getZipcode()
			{
				return this.zipcode;
			}
			
		public void setZipcode(final String zipcode)
			{
				this.zipcode = zipcode;
			}
			
		public String getType()
			{
				return this.type;
			}
			
		public void setType(final String type)
			{
				this.type = type;
			}
			
		public String getAreaPhone1()
			{
				return this.areaPhone1;
			}
			
		public void setAreaPhone1(final String areaPhone1)
			{
				this.areaPhone1 = areaPhone1;
			}
			
		public String getPhoneNo1()
			{
				return this.phoneNo1;
			}
			
		public void setPhoneNo1(final String phoneNo1)
			{
				this.phoneNo1 = phoneNo1;
			}
			
		public String getAreaPhone2()
			{
				return this.areaPhone2;
			}
			
		public void setAreaPhone2(final String areaPhone2)
			{
				this.areaPhone2 = areaPhone2;
			}
			
		public String getPhoneNo2()
			{
				return this.phoneNo2;
			}
			
		public void setPhoneNo2(final String phoneNo2)
			{
				this.phoneNo2 = phoneNo2;
			}
			
		public String getAreaFax()
			{
				return this.areaFax;
			}
			
		public void setAreaFax(final String areaFax)
			{
				this.areaFax = areaFax;
			}
			
		public String getFaxNo()
			{
				return this.faxNo;
			}
			
		public void setFaxNo(final String faxNo)
			{
				this.faxNo = faxNo;
			}
			
		public String getHandphone()
			{
				return this.handphone;
			}
			
		public void setHandphone(final String handphone)
			{
				this.handphone = handphone;
			}
			
		public double getPrepaidAmount()
			{
				return this.prepaidAmount;
			}
			
		public void setPrepaidAmount(final double prepaidAmount)
			{
				this.prepaidAmount = prepaidAmount;
			}
			
		public double getAramount()
			{
				return this.aramount;
			}
			
		public void setAramount(final double aramount)
			{
				this.aramount = aramount;
			}
			
		public double getArpaid()
			{
				return this.arpaid;
			}
			
		public void setArpaid(final double arpaid)
			{
				this.arpaid = arpaid;
			}
			
		public double getArwaived()
			{
				return this.arwaived;
			}
			
		public void setArwaived(final double arwaived)
			{
				this.arwaived = arwaived;
			}
			
	}
