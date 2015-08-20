
package com.adibrata.smartdealer.action.setting.workshop;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.WorkshopDao;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.Workshop;
import com.adibrata.smartdealer.service.setting.WorkshopService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class WorkshopAction extends BaseAction implements Preparable
	{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		private String mode;
		private Workshop workshop;
		private WorkshopService workshopService;
		private Partner partner;
		private Office office;
		private List<Workshop> lstWorkshop;
		private String searchcriteria;
		private String searchvalue;
		private int pagenumber;
		private String usrUpd;
		private String usrCrt;
		private String message;
		private Long id;

		private String name;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String city;
		private String zipcode;
		private String type;
		private String areaphone1;
		private String phoneno1;
		private String areaphone2;
		private String phoneno2;
		private String areafax;
		private String faxno;
		private String handphone;

		public WorkshopAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());

				this.office = new Office();
				this.setOffice(this.office);

				this.workshopService = new WorkshopDao();
				this.workshop = new Workshop();

				if (this.pagenumber == 0)
					{
						this.pagenumber = 1;
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
								case "edit" :
									try
										{
											strMode = this.ViewData();
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "savedel" :
									try
										{
											strMode = this.SaveDelete();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "first" :
									this.pagenumber = 1;
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
									this.pagenumber -= 1;
									if (this.pagenumber <= 1)
										{
											this.pagenumber = 1;
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
									this.pagenumber += 1;
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
						this.pagenumber = 1;
						try
							{
								this.Paging();
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

		public String save()
			{
				String strMode;
				strMode = this.mode;
				if (this.mode != null)
					{
						switch (strMode)
							{
								case "saveadd" :
									try
										{
											strMode = this.SaveAdd();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "saveedit" :
									try
										{
											strMode = this.SaveEdit();
										}
									catch (final Exception e1)
										{
											// TODO Auto-generated catch block
											e1.printStackTrace();
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
								strMode = "input";
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
						this.lstWorkshop = this.workshopService.Paging(this.getPagenumber(), this.WhereCond(), "");
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
						this.lstWorkshop = this.workshopService.Paging(this.getPagenumber(), this.WhereCond(), "", true);
						this.pagenumber = this.workshopService.getCurrentpage();
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

			}

		public String ViewData() throws Exception
			{
				this.workshop = new Workshop();
				try
					{
						if (this.getId() != null)
							{
								this.workshop = this.workshopService.View(this.id);
								this.partner = this.workshop.getPartner();
								this.name = this.workshop.getName();
								this.address = this.workshop.getAddress();
								this.rt = this.workshop.getRt();
								this.rw = this.workshop.getRw();
								this.kelurahan = this.workshop.getKelurahan();
								this.city = this.workshop.getCity();
								this.zipcode = this.workshop.getZipCode();
								this.areaphone1 = this.workshop.getAreaPhone1();
								this.areaphone2 = this.workshop.getAreaPhone2();
								this.phoneno1 = this.workshop.getPhoneNo1();
								this.phoneno2 = this.workshop.getPhoneNo2();
								this.areafax = this.workshop.getAreaFax();
								this.faxno = this.workshop.getFaxNo();
								this.handphone = this.workshop.getHandphone();
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
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.mode;
			}

		private String SaveAdd() throws Exception
			{
				try
					{
						final Workshop workshop = new Workshop();

						workshop.setName(this.getName());
						workshop.setAddress(this.getAddress());
						workshop.setRt(this.getRt());
						workshop.setRw(this.getRw());
						workshop.setKelurahan(this.getKelurahan());
						workshop.setCity(this.getCity());
						workshop.setZipCode(this.getZipcode());
						workshop.setAreaPhone1(this.getAreafax());
						workshop.setAreaPhone2(this.getAreafax());
						workshop.setPhoneNo1(this.getPhoneno1());
						workshop.setPhoneNo2(this.getPhoneno2());
						workshop.setAreaFax(this.getAreafax());
						workshop.setFaxNo(this.getFaxno());
						workshop.setHandphone(this.getHandphone());
						workshop.setPartner(this.partner);
						this.workshopService.SaveAdd(workshop);
						this.setMessage(BaseAction.SuccessMessage());
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

		private String SaveEdit() throws Exception
			{
				try
					{
						final Workshop workshop = new Workshop();

						workshop.setId(this.getId());
						workshop.setName(this.getName());
						workshop.setAddress(this.getAddress());
						workshop.setRt(this.getRt());
						workshop.setRw(this.getRw());
						workshop.setKelurahan(this.getKelurahan());
						workshop.setCity(this.getCity());
						workshop.setZipCode(this.getZipcode());
						workshop.setAreaPhone1(this.getAreaphone1());
						workshop.setAreaPhone2(this.getAreaphone2());
						workshop.setPhoneNo1(this.getPhoneno1());
						workshop.setPhoneNo2(this.getPhoneno2());
						workshop.setAreaFax(this.getAreafax());
						workshop.setFaxNo(this.getFaxno());
						workshop.setHandphone(this.getHandphone());
						workshop.setPartner(this.partner);
						workshop.setUsrUpd(this.usrUpd);
						this.workshopService.SaveEdit(workshop);
						this.setMessage(BaseAction.SuccessMessage());
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

		private String SaveDelete() throws Exception
			{
				try
					{
						if (this.getId() != null)
							{
								final Workshop workshop = new Workshop();

								workshop.setId(this.getId());
								this.workshopService.SaveDel(workshop);
								this.setMessage(BaseAction.SuccessMessage());
							}
						else
							{
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

		public String getMode()
			{
				return this.mode;
			}

		public void setMode(final String mode)
			{
				this.mode = mode;
			}

		/**
		 * @return the searchcriteria
		 */
		public String getSearchcriteria()
			{
				return this.searchcriteria;
			}

		/**
		 * @return the searchvalue
		 */
		public String getSearchvalue()
			{
				return this.searchvalue;
			}

		/**
		 * @return the usrUpd
		 */
		public String getUsrUpd()
			{
				return this.usrUpd;
			}

		/**
		 * @return the usrCrt
		 */
		public String getUsrCrt()
			{
				return this.usrCrt;
			}

		/**
		 * @return the message
		 */
		public String getMessage()
			{
				return this.message;
			}

		/**
		 * @param searchcriteria
		 *            the searchcriteria to set
		 */
		public void setSearchcriteria(final String searchcriteria)
			{
				this.searchcriteria = searchcriteria;
			}

		/**
		 * @param searchvalue
		 *            the searchvalue to set
		 */
		public void setSearchvalue(final String searchvalue)
			{
				this.searchvalue = searchvalue;
			}

		/**
		 * @param usrUpd
		 *            the usrUpd to set
		 */
		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}

		/**
		 * @param usrCrt
		 *            the usrCrt to set
		 */
		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
			}

		/**
		 * @param message
		 *            the message to set
		 */
		public void setMessage(final String message)
			{
				this.message = message;
			}

		/**
		 * @return the name
		 */
		public String getName()
			{
				return this.name;
			}

		/**
		 * @return the address
		 */
		public String getAddress()
			{
				return this.address;
			}

		/**
		 * @return the rt
		 */
		public String getRt()
			{
				return this.rt;
			}

		/**
		 * @return the rw
		 */
		public String getRw()
			{
				return this.rw;
			}

		/**
		 * @return the kelurahan
		 */
		public String getKelurahan()
			{
				return this.kelurahan;
			}

		/**
		 * @return the city
		 */
		public String getCity()
			{
				return this.city;
			}

		/**
		 * @return the type
		 */
		public String getType()
			{
				return this.type;
			}

		/**
		 * @return the handphone
		 */
		public String getHandphone()
			{
				return this.handphone;
			}

		/**
		 * @param name
		 *            the name to set
		 */
		public void setName(final String name)
			{
				this.name = name;
			}

		/**
		 * @param address
		 *            the address to set
		 */
		public void setAddress(final String address)
			{
				this.address = address;
			}

		/**
		 * @param rt
		 *            the rt to set
		 */
		public void setRt(final String rt)
			{
				this.rt = rt;
			}

		/**
		 * @param rw
		 *            the rw to set
		 */
		public void setRw(final String rw)
			{
				this.rw = rw;
			}

		/**
		 * @param kelurahan
		 *            the kelurahan to set
		 */
		public void setKelurahan(final String kelurahan)
			{
				this.kelurahan = kelurahan;
			}

		/**
		 * @param city
		 *            the city to set
		 */
		public void setCity(final String city)
			{
				this.city = city;
			}

		/**
		 * @param type
		 *            the type to set
		 */
		public void setType(final String type)
			{
				this.type = type;
			}

		/**
		 * @param handphone
		 *            the handphone to set
		 */
		public void setHandphone(final String handphone)
			{
				this.handphone = handphone;
			}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

		/**
		 * @return the workshop
		 */
		public Workshop getWorkshop()
			{
				return this.workshop;
			}

		/**
		 * @return the workshopService
		 */
		public WorkshopService getWorkshopService()
			{
				return this.workshopService;
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
		 * @return the lstWorkshop
		 */
		public List<Workshop> getLstWorkshop()
			{
				return this.lstWorkshop;
			}

		/**
		 * @param workshop
		 *            the workshop to set
		 */
		public void setWorkshop(final Workshop workshop)
			{
				this.workshop = workshop;
			}

		/**
		 * @param workshopService
		 *            the workshopService to set
		 */
		public void setWorkshopService(final WorkshopService workshopService)
			{
				this.workshopService = workshopService;
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
		 * @param lstWorkshop
		 *            the lstWorkshop to set
		 */
		public void setLstWorkshop(final List<Workshop> lstWorkshop)
			{
				this.lstWorkshop = lstWorkshop;
			}

		public String getZipcode()
			{
				return this.zipcode;
			}

		public void setZipcode(final String zipcode)
			{
				this.zipcode = zipcode;
			}

		public int getPagenumber()
			{
				return this.pagenumber;
			}

		public void setPagenumber(final int pagenumber)
			{
				this.pagenumber = pagenumber;
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

		public Long getId()
			{
				return this.id;
			}

		public void setId(final Long id)
			{
				this.id = id;
			}

	}
