
package com.adibrata.smartdealer.action.customer;

import java.util.ArrayList;
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
		private Partner partner;
		private Customer customer;
		
		private CustomerMaintService customerMaintService;
		private List<Customer> lstcustomer;
		
		private String searchcriteria;
		private String searchvalue;
		private String mode;
		private String message;
		private String usrUpd;
		private String usrCrt;
		private int pageNumber;
		private Long id;
		
		private String type;
		private String name;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String kecamatan;
		private String city;
		private String zipcode;
		private String areaphone1;
		private String phoneno1;
		private String areaphone2;
		private String phoneno2;
		private String areafax;
		private String faxno;
		private String handphone;
		private Double prepaidamount;
		private Double aramount;
		private Double arpaid;
		private Double arwaived;
		private String custtag;
		
		public CustomerAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				
				this.customerMaintService = new CustomerDao();
				this.customer = new Customer();
				
				this.Initialisasi();
				
				if (this.pageNumber == 0)
					{
						this.pageNumber = 1;
					}
			}
			
		@Override
		public void prepare() throws Exception
			{
				try
					{
						// TODO Auto-generated method stub
					}
				catch (final Exception e)
					{
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			
		private void Initialisasi()
			{
				
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				
				this.lstcustomer = new ArrayList<Customer>();
				this.customer = new Customer();
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
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "appdata" :
									try
										{
											strMode = this.View();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "first" :
									this.pageNumber = 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "prev" :
									this.pageNumber -= 1;
									if (this.pageNumber <= 1)
										{
											this.pageNumber = 1;
										}
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "next" :
									this.pageNumber += 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "last" :
									try
										{
											this.Paging(1);
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								default :
									break;
							}
					}
				else
					{
						this.pageNumber = 1;
						try
							{
								strMode = "start";
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				return strMode;
			}
			
		private String WhereCond()
			{
				String wherecond = " partnercode = '" + BaseAction.sesPartnerCode() + "'";
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
						this.lstcustomer = this.customerMaintService.Paging(this.getPageNumber(), this.WhereCond(), "");
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
						this.lstcustomer = this.customerMaintService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
						this.pageNumber = this.customerMaintService.getCurrentpage();
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
					
			}
			
		public String View() throws Exception
			{
				this.customer = new Customer();
				try
					{
						if (this.getId() != null)
							{
								this.customer = this.customerMaintService.ViewCustomer(this.getId());
								this.name = this.customer.getName();
							}
						else
							{
								this.Paging();
								this.mode = "start";
								this.setMessage(BaseAction.SelectFirst());
							}
					}
				catch (final Exception exp)
					{
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.mode;
				
			}
			
		public Partner getPartner()
			{
				return this.partner;
			}
			
		public void setPartner(final Partner partner)
			{
				this.partner = partner;
			}
			
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(final Customer customer)
			{
				this.customer = customer;
			}
			
		public CustomerMaintService getCustomerMaintService()
			{
				return this.customerMaintService;
			}
			
		public void setCustomerMaintService(final CustomerMaintService customerMaintService)
			{
				this.customerMaintService = customerMaintService;
			}
			
		public List<Customer> getLstcustomer()
			{
				return this.lstcustomer;
			}
			
		public void setLstcustomer(final List<Customer> lstcustomer)
			{
				this.lstcustomer = lstcustomer;
			}
			
		public String getMode()
			{
				return this.mode;
			}
			
		public void setMode(final String mode)
			{
				this.mode = mode;
			}
			
		public String getMessage()
			{
				return this.message;
			}
			
		public void setMessage(final String message)
			{
				this.message = message;
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
			
		public int getPageNumber()
			{
				return this.pageNumber;
			}
			
		public void setPageNumber(final int pageNumber)
			{
				this.pageNumber = pageNumber;
			}
			
		public String getType()
			{
				return this.type;
			}
			
		public void setType(final String type)
			{
				this.type = type;
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
			
		public String getKecamatan()
			{
				return this.kecamatan;
			}
			
		public void setKecamatan(final String kecamatan)
			{
				this.kecamatan = kecamatan;
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
			
		public String getAreaphone1()
			{
				return this.areaphone1;
			}
			
		public void setAreaphone1(final String areaphone1)
			{
				this.areaphone1 = areaphone1;
			}
			
		public String getPhoneno1()
			{
				return this.phoneno1;
			}
			
		public void setPhoneno1(final String phoneno1)
			{
				this.phoneno1 = phoneno1;
			}
			
		public String getAreaphone2()
			{
				return this.areaphone2;
			}
			
		public void setAreaphone2(final String areaphone2)
			{
				this.areaphone2 = areaphone2;
			}
			
		public String getPhoneno2()
			{
				return this.phoneno2;
			}
			
		public void setPhoneno2(final String phoneno2)
			{
				this.phoneno2 = phoneno2;
			}
			
		public String getAreafax()
			{
				return this.areafax;
			}
			
		public void setAreafax(final String areafax)
			{
				this.areafax = areafax;
			}
			
		public String getFaxno()
			{
				return this.faxno;
			}
			
		public void setFaxno(final String faxno)
			{
				this.faxno = faxno;
			}
			
		public String getHandphone()
			{
				return this.handphone;
			}
			
		public void setHandphone(final String handphone)
			{
				this.handphone = handphone;
			}
			
		public Double getPrepaidamount()
			{
				return this.prepaidamount;
			}
			
		public void setPrepaidamount(final Double prepaidamount)
			{
				this.prepaidamount = prepaidamount;
			}
			
		public Double getAramount()
			{
				return this.aramount;
			}
			
		public void setAramount(final Double aramount)
			{
				this.aramount = aramount;
			}
			
		public Double getArpaid()
			{
				return this.arpaid;
			}
			
		public void setArpaid(final Double arpaid)
			{
				this.arpaid = arpaid;
			}
			
		public Double getArwaived()
			{
				return this.arwaived;
			}
			
		public void setArwaived(final Double arwaived)
			{
				this.arwaived = arwaived;
			}
			
		public String getCusttag()
			{
				return this.custtag;
			}
			
		public void setCusttag(final String custtag)
			{
				this.custtag = custtag;
			}
			
		public Long getId()
			{
				return this.id;
			}
			
		public void setId(final Long id)
			{
				this.id = id;
			}
			
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
	}
