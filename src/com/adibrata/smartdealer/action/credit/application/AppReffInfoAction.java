
package com.adibrata.smartdealer.action.credit.application;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.credit.ApplicationDataDao;
import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.AgrmntReffInfo;
import com.adibrata.smartdealer.service.credit.ApplicationDataService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AppReffInfoAction extends BaseAction implements Preparable
	{

		/**
		*
		*/
		private static final long serialVersionUID = 1L;

		private String message;
		private String mode;
		private String usrUpd;
		private String usrCrt;

		private Agrmnt agrmnt;
		private AgrmntReffInfo reffinfo;
		private ApplicationDataService service;

		private static final long serialVersionUID = 1L; private long id;
		private Long agrmntid;

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

		public AppReffInfoAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.service = new ApplicationDataDao();

				this.agrmnt = new Agrmnt();
				this.agrmnt.setId(this.getAgrmntid());
			}

		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

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

		public String Save() throws Exception
			{
				try
					{
						this.reffinfo = new AgrmntReffInfo();
						this.reffinfo.setAgrmnt(this.getAgrmnt());
						this.reffinfo.setAddress(this.getAddress());
						this.reffinfo.setRt(this.getRt());
						this.reffinfo.setRw(this.getRw());
						this.reffinfo.setKelurahan(this.getKelurahan());
						this.reffinfo.setKecamatan(this.getKecamatan());
						this.reffinfo.setCity(this.getCity());
						this.reffinfo.setZipcode(this.getZipcode());
						this.reffinfo.setAreaPhone1(this.getAreaphone1());
						this.reffinfo.setPhoneNo1(this.getPhoneno1());
						this.reffinfo.setAreaPhone2(this.getAreaphone2());
						this.reffinfo.setPhoneNo2(this.getPhoneno2());
						this.reffinfo.setAreaFax(this.getAreafax());
						this.reffinfo.setFaxNo(this.getFaxno());
						this.reffinfo.setHandphone(this.getHandphone());
						this.reffinfo.setUsrUpd(BaseAction.sesLoginName());

						this.setMessage(BaseAction.SuccessMessage());
						this.mode = SUCCESS;
					}
				catch (final Exception exp)

					{
						this.mode = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

				return this.mode;
			}

		public String getMessage()
			{
				return this.message;
			}

		public void setMessage(final String message)
			{
				this.message = message;
			}

		public String getMode()
			{
				return this.mode;
			}

		public void setMode(final String mode)
			{
				this.mode = mode;
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

		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}

		public void setAgrmnt(final Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}

		public AgrmntReffInfo getReffinfo()
			{
				return this.reffinfo;
			}

		public void setReffinfo(final AgrmntReffInfo reffinfo)
			{
				this.reffinfo = reffinfo;
			}

		public ApplicationDataService getService()
			{
				return this.service;
			}

		public void setService(final ApplicationDataService service)
			{
				this.service = service;
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

		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

		public Long getId()
			{
				return this.id;
			}

		public void setId(final Long id)
			{
				this.id = id;
			}

		public Long getAgrmntid()
			{
				return this.agrmntid;
			}

		public void setAgrmntid(final Long agrmntid)
			{
				this.agrmntid = agrmntid;
			}

	}
