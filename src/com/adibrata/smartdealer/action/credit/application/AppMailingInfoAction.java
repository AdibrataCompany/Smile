
package com.adibrata.smartdealer.action.credit.application;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.credit.ApplicationDataDao;
import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.AgrmntMailingInfo;
import com.adibrata.smartdealer.service.credit.ApplicationDataService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AppMailingInfoAction extends BaseAction implements Preparable
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
		private AgrmntMailingInfo mailinginfo;

		private ApplicationDataService service;

		private Long id;
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

		public AppMailingInfoAction() throws Exception
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
						this.mailinginfo = new AgrmntMailingInfo();
						this.mailinginfo.setAgrmnt(this.getAgrmnt());
						this.mailinginfo.setAddress(this.getAddress());
						this.mailinginfo.setRt(this.getRt());
						this.mailinginfo.setRw(this.getRw());
						this.mailinginfo.setKelurahan(this.getKelurahan());
						this.mailinginfo.setKecamatan(this.getKecamatan());
						this.mailinginfo.setCity(this.getCity());
						this.mailinginfo.setZipcode(this.getZipcode());
						this.mailinginfo.setAreaPhone1(this.getAreaphone1());
						this.mailinginfo.setPhoneNo1(this.getPhoneno1());
						this.mailinginfo.setAreaPhone2(this.getAreaphone2());
						this.mailinginfo.setPhoneNo2(this.getPhoneno2());
						this.mailinginfo.setAreaFax(this.getAreafax());
						this.mailinginfo.setFaxNo(this.getFaxno());
						this.mailinginfo.setHandphone(this.getHandphone());
						this.mailinginfo.setUsrUpd(BaseAction.sesLoginName());

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

		public AgrmntMailingInfo getMailinginfo()
			{
				return this.mailinginfo;
			}

		public void setMailinginfo(final AgrmntMailingInfo mailinginfo)
			{
				this.mailinginfo = mailinginfo;
			}

		public ApplicationDataService getService()
			{
				return this.service;
			}

		public void setService(final ApplicationDataService service)
			{
				this.service = service;
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

	}
