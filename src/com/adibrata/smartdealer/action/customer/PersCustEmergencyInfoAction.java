
package com.adibrata.smartdealer.action.customer;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.PersCustEmergencyInfo;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PersCustEmergencyInfoAction extends BaseAction implements Preparable
	{

		/**
		*
		*/
		private static final long serialVersionUID = 1L;

		private CustomerMaintService customermaintservice;
		private Customer customer;
		private PersCustEmergencyInfo emergencyinfo;

		private String mode;
		private String message;
		private String usrUpd;
		private String usrCrt;
		private long customerid;
		private long id;

		private String contactname;
		private String relationship;
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

		public PersCustEmergencyInfoAction() throws Exception
			{
				try
					{
						// TODO Auto-generated constructor stub
						RenderMenu();

						this.customermaintservice = new CustomerDao();
						this.customer = new Customer();
						this.emergencyinfo = new PersCustEmergencyInfo();

						this.customerid = this.customer.getId();
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
											this.Save();
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

		public void Save() throws Exception
			{
				try
					{
						this.emergencyinfo = new PersCustEmergencyInfo();

						this.emergencyinfo.setCustomer(this.getCustomer());
						this.emergencyinfo.setContactName(this.getContactname());
						this.emergencyinfo.setRelationship(this.getRelationship());
						this.emergencyinfo.setAddress(this.getAddress());
						this.emergencyinfo.setRt(this.getRt());
						this.emergencyinfo.setRw(this.getRw());
						this.emergencyinfo.setKelurahan(this.getKelurahan());
						this.emergencyinfo.setKecamatan(this.getKecamatan());
						this.emergencyinfo.setCity(this.getCity());
						this.emergencyinfo.setZipcode(this.getZipcode());
						this.emergencyinfo.setAreaPhone1(this.getAreaphone1());
						this.emergencyinfo.setPhoneNo1(this.getPhoneno1());
						this.emergencyinfo.setAreaPhone2(this.getAreaphone2());
						this.emergencyinfo.setPhoneNo2(this.getPhoneno2());
						this.emergencyinfo.setAreaFax(this.getAreafax());
						this.emergencyinfo.setFaxNo(this.getFaxno());
						this.emergencyinfo.setHandphone(this.getHandphone());

						this.customermaintservice.SavePersonalCustomer(sesLoginName(), this.emergencyinfo);
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

		public PersCustEmergencyInfo getEmergencyinfo()
			{
				return this.emergencyinfo;
			}

		public void setEmergencyinfo(final PersCustEmergencyInfo emergencyinfo)
			{
				this.emergencyinfo = emergencyinfo;
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

		public String getContactname()
			{
				return this.contactname;
			}

		public void setContactname(final String contactname)
			{
				this.contactname = contactname;
			}

		public String getRelationship()
			{
				return this.relationship;
			}

		public void setRelationship(final String relationship)
			{
				this.relationship = relationship;
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

		public long getCustomerid()
			{
				return this.customerid;
			}

		public void setCustomerid(final long customerid)
			{
				this.customerid = customerid;
			}

	}
