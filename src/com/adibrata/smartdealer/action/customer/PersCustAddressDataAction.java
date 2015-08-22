
package com.adibrata.smartdealer.action.customer;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.PersCust;
import com.adibrata.smartdealer.model.PersCustLegalInfo;
import com.adibrata.smartdealer.model.PersCustResidenceInfo;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PersCustAddressDataAction extends BaseAction implements Preparable
	{
		
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		
		private CustomerMaintService customermaintservice;
		private Customer customer;
		private PersCust perscust;
		private PersCustLegalInfo legalinfo;
		private PersCustResidenceInfo residenceinfo;
		
		private String mode;
		private String message;
		private String usrUpd;
		private String usrCrt;
		private long customerid;
		private static final long serialVersionUID = 1L; private long id;
		
		private String legaladdress;
		private String legalrt;
		private String legalrw;
		private String legalkelurahan;
		private String legalkecamatan;
		private String legalcity;
		private String legalzipcode;
		
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
		
		public PersCustAddressDataAction() throws Exception
			{
				try
					{
						// TODO Auto-generated constructor stub
						RenderMenu();
						
						this.customermaintservice = new CustomerDao();
						this.customer = new Customer();
						this.legalinfo = new PersCustLegalInfo();
						this.residenceinfo = new PersCustResidenceInfo();
						
						this.customer.setId(this.getCustomerid());
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
			
		@Override
		public String execute() throws Exception
			{
				String strMode;
				strMode = this.mode;
				if (this.mode != null)
					{
						switch (strMode)
							{
								case "save" :
									try
										{
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
			
		public void SaveLegal() throws Exception
			{
				try
					{
						this.legalinfo = new PersCustLegalInfo();
						
						this.legalinfo.setCustomer(this.getCustomer());
						this.legalinfo.setAddress(this.getLegaladdress());
						this.legalinfo.setRt(this.getLegalrt());
						this.legalinfo.setRw(this.getLegalrw());
						this.legalinfo.setKelurahan(this.getLegalkelurahan());
						this.legalinfo.setKecamatan(this.getLegalkecamatan());
						this.legalinfo.setCity(this.getLegalcity());
						this.legalinfo.setZipcode(this.getLegalzipcode());
						this.legalinfo.setAreaPhone1(this.getAreaphone1());
						this.legalinfo.setPhoneNo1(this.getPhoneno1());
						this.legalinfo.setAreaPhone2(this.getAreaphone2());
						this.legalinfo.setPhoneNo2(this.getPhoneno2());
						this.legalinfo.setAreaFax(this.getAreafax());
						this.legalinfo.setFaxNo(this.getFaxno());
						this.legalinfo.setHandphone(this.getHandphone());
						
						this.customermaintservice.SavePersonalCustomer(sesLoginName(), this.legalinfo);
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
			
		public void SaveResidence() throws Exception
			{
				try
					{
						this.residenceinfo = new PersCustResidenceInfo();
						
						this.residenceinfo.setAddress(this.getAddress());
						this.residenceinfo.setRt(this.getRt());
						this.residenceinfo.setRw(this.getRw());
						this.residenceinfo.setKelurahan(this.getKelurahan());
						this.residenceinfo.setKecamatan(this.getKecamatan());
						this.residenceinfo.setCity(this.getCity());
						this.residenceinfo.setZipcode(this.getZipcode());
						this.residenceinfo.setAreaPhone1(this.getAreaphone1());
						this.residenceinfo.setPhoneNo1(this.getPhoneno1());
						this.residenceinfo.setAreaPhone2(this.getAreaphone2());
						this.residenceinfo.setPhoneNo2(this.getPhoneno2());
						this.residenceinfo.setAreaFax(this.getAreafax());
						this.residenceinfo.setFaxNo(this.getFaxno());
						this.residenceinfo.setHandphone(this.getHandphone());
						
						this.customermaintservice.SavePersonalCustomer(sesLoginName(), this.residenceinfo);
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
			
		public void SaveCustomer() throws Exception
			{
				try
					{
						this.customer = new Customer();
						
						this.customer.setId(this.getCustomerid());
						this.customer.setRt(this.getRt());
						this.customer.setRw(this.getRw());
						this.customer.setKelurahan(this.getKelurahan());
						this.customer.setKecamatan(this.getKecamatan());
						this.customer.setCity(this.getCity());
						this.customer.setZipcode(this.getZipcode());
						this.customer.setAreaPhone1(this.getAreaphone1());
						this.customer.setPhoneNo1(this.getPhoneno1());
						this.customer.setAreaPhone2(this.getAreaphone2());
						this.customer.setPhoneNo2(this.getPhoneno2());
						this.customer.setAreaFax(this.getAreafax());
						this.customer.setFaxNo(this.getFaxno());
						this.customer.setHandphone(this.getHandphone());
						
						this.customermaintservice.SaveCustomer(sesLoginName(), this.customer);
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
			
		public CustomerMaintService getCustomermaintservice()
			{
				return this.customermaintservice;
			}
			
		public void setCustomermaintservice(final CustomerMaintService customermaintservice)
			{
				this.customermaintservice = customermaintservice;
			}
			
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(final Customer customer)
			{
				this.customer = customer;
			}
			
		public PersCustLegalInfo getLegalinfo()
			{
				return this.legalinfo;
			}
			
		public void setLegalinfo(final PersCustLegalInfo legalinfo)
			{
				this.legalinfo = legalinfo;
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
			
		public PersCustResidenceInfo getResidenceinfo()
			{
				return this.residenceinfo;
			}
			
		public void setResidenceinfo(final PersCustResidenceInfo residenceinfo)
			{
				this.residenceinfo = residenceinfo;
			}
			
		public String getLegaladdress()
			{
				return this.legaladdress;
			}
			
		public void setLegaladdress(final String legaladdress)
			{
				this.legaladdress = legaladdress;
			}
			
		public String getLegalrt()
			{
				return this.legalrt;
			}
			
		public void setLegalrt(final String legalrt)
			{
				this.legalrt = legalrt;
			}
			
		public String getLegalrw()
			{
				return this.legalrw;
			}
			
		public void setLegalrw(final String legalrw)
			{
				this.legalrw = legalrw;
			}
			
		public String getLegalkelurahan()
			{
				return this.legalkelurahan;
			}
			
		public void setLegalkelurahan(final String legalkelurahan)
			{
				this.legalkelurahan = legalkelurahan;
			}
			
		public String getLegalkecamatan()
			{
				return this.legalkecamatan;
			}
			
		public void setLegalkecamatan(final String legalkecamatan)
			{
				this.legalkecamatan = legalkecamatan;
			}
			
		public String getLegalcity()
			{
				return this.legalcity;
			}
			
		public void setLegalcity(final String legalcity)
			{
				this.legalcity = legalcity;
			}
			
		public String getLegalzipcode()
			{
				return this.legalzipcode;
			}
			
		public void setLegalzipcode(final String legalzipcode)
			{
				this.legalzipcode = legalzipcode;
			}
			
		public long getCustomerid()
			{
				return this.customerid;
			}
			
		public void setCustomerid(final long customerid)
			{
				this.customerid = customerid;
			}
			
		public PersCust getPerscust()
			{
				return this.perscust;
			}
			
		public void setPerscust(final PersCust perscust)
			{
				this.perscust = perscust;
			}
			
	}
