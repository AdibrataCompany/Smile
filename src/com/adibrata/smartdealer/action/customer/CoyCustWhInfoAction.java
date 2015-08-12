
package com.adibrata.smartdealer.action.customer;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.CoyCustWhInfo;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class CoyCustWhInfoAction extends BaseAction implements Preparable
	{

		/**
		*
		*/
		private static final long serialVersionUID = 1L;

		private CustomerMaintService customermaintservice;
		private Customer customer;
		private CoyCustWhInfo whinfo;

		private String mode;
		private String message;
		private String usrUpd;
		private String usrCrt;
		private long id;
		private long customerid;

		private String werehousestatus;
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

		public CoyCustWhInfoAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				RenderMenu();

				this.customermaintservice = new CustomerDao();
				this.customer = new Customer();
				this.whinfo = new CoyCustWhInfo();

				this.customer.setId(this.getCustomerid());
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

		public void Save() throws Exception
			{
				try
					{
						this.whinfo = new CoyCustWhInfo();

						this.whinfo.setCustomer(this.getCustomer());
						this.whinfo.setWereHouseStatus(this.getWerehousestatus());
						this.whinfo.setAddress(this.getAddress());
						this.whinfo.setRt(this.getRt());
						this.whinfo.setRw(this.getRw());
						this.whinfo.setKelurahan(this.getKelurahan());
						this.whinfo.setKecamatan(this.getKecamatan());
						this.whinfo.setCity(this.getCity());
						this.whinfo.setZipcode(this.getZipcode());
						this.whinfo.setAreaPhone1(this.getAreaphone1());
						this.whinfo.setPhoneNo1(this.getPhoneno1());
						this.whinfo.setAreaPhone2(this.getAreaphone2());
						this.whinfo.setPhoneNo2(this.getPhoneno2());
						this.whinfo.setAreaFax(this.getAreafax());
						this.whinfo.setFaxNo(this.getFaxno());
						this.whinfo.setHandphone(this.getHandphone());

						this.customermaintservice.SaveCompanyCustomer(sesLoginName(), this.whinfo);
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

		public CoyCustWhInfo getWhinfo()
			{
				return this.whinfo;
			}

		public void setWhinfo(final CoyCustWhInfo whinfo)
			{
				this.whinfo = whinfo;
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

		public String getWerehousestatus()
			{
				return this.werehousestatus;
			}

		public void setWerehousestatus(final String werehousestatus)
			{
				this.werehousestatus = werehousestatus;
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
