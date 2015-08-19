
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
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private String message;
		private long id;

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

		public WorkshopAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());

				this.office = new Office();
				this.setOffice(this.office);

				this.workshopService = new WorkshopDao();
				this.workshop = new Workshop();

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
											this.ViewData();
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
						this.lstWorkshop = this.workshopService.Paging(this.getPageNumber(), this.WhereCond(), "");
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
						this.lstWorkshop = this.workshopService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
						this.pageNumber = this.workshopService.getCurrentpage();
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
				this.workshop = new Workshop();
				try
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
						this.areaPhone1 = this.workshop.getAreaPhone1();
						this.areaPhone2 = this.workshop.getAreaPhone2();
						this.phoneNo1 = this.workshop.getPhoneNo1();
						this.phoneNo2 = this.workshop.getPhoneNo2();
						this.areaFax = this.workshop.getAreaFax();
						this.faxNo = this.workshop.getFaxNo();
						this.handphone = this.workshop.getHandphone();
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
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
						workshop.setAreaPhone1(this.getAreaPhone1());
						workshop.setAreaPhone2(this.getAreaPhone2());
						workshop.setPhoneNo1(this.getPhoneNo1());
						workshop.setPhoneNo2(this.getPhoneNo2());
						workshop.setAreaFax(this.getAreaFax());
						workshop.setFaxNo(this.getFaxNo());
						workshop.setHandphone(this.getHandphone());
						workshop.setPartner(this.partner);
						this.workshopService.SaveAdd(workshop);
						this.setMessage(BaseAction.SuccessMessage());
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
						workshop.setAreaPhone1(this.getAreaPhone1());
						workshop.setAreaPhone2(this.getAreaPhone2());
						workshop.setPhoneNo1(this.getPhoneNo1());
						workshop.setPhoneNo2(this.getPhoneNo2());
						workshop.setAreaFax(this.getAreaFax());
						workshop.setFaxNo(this.getFaxNo());
						workshop.setHandphone(this.getHandphone());
						workshop.setPartner(this.partner);
						workshop.setUsrUpd(this.usrUpd);
						this.workshopService.SaveEdit(workshop);
						this.setMessage(BaseAction.SuccessMessage());
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

		private String SaveDelete() throws Exception
			{
				try
					{
						final Workshop workshop = new Workshop();

						workshop.setId(this.getId());
						this.workshopService.SaveDel(workshop);
						this.setMessage(BaseAction.SuccessMessage());
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
		 * @return the pageNumber
		 */
		public int getPageNumber()
			{
				return this.pageNumber;
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
		 * @param pageNumber
		 *            the pageNumber to set
		 */
		public void setPageNumber(final int pageNumber)
			{
				this.pageNumber = pageNumber;
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
		 * @return the id
		 */
		public long getId()
			{
				return this.id;
			}

		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final long id)
			{
				this.id = id;
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
		 * @return the areaPhone1
		 */
		public String getAreaPhone1()
			{
				return this.areaPhone1;
			}

		/**
		 * @return the phoneNo1
		 */
		public String getPhoneNo1()
			{
				return this.phoneNo1;
			}

		/**
		 * @return the areaPhone2
		 */
		public String getAreaPhone2()
			{
				return this.areaPhone2;
			}

		/**
		 * @return the phoneNo2
		 */
		public String getPhoneNo2()
			{
				return this.phoneNo2;
			}

		/**
		 * @return the areaFax
		 */
		public String getAreaFax()
			{
				return this.areaFax;
			}

		/**
		 * @return the faxNo
		 */
		public String getFaxNo()
			{
				return this.faxNo;
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
		 * @param areaPhone1
		 *            the areaPhone1 to set
		 */
		public void setAreaPhone1(final String areaPhone1)
			{
				this.areaPhone1 = areaPhone1;
			}

		/**
		 * @param phoneNo1
		 *            the phoneNo1 to set
		 */
		public void setPhoneNo1(final String phoneNo1)
			{
				this.phoneNo1 = phoneNo1;
			}

		/**
		 * @param areaPhone2
		 *            the areaPhone2 to set
		 */
		public void setAreaPhone2(final String areaPhone2)
			{
				this.areaPhone2 = areaPhone2;
			}

		/**
		 * @param phoneNo2
		 *            the phoneNo2 to set
		 */
		public void setPhoneNo2(final String phoneNo2)
			{
				this.phoneNo2 = phoneNo2;
			}

		/**
		 * @param areaFax
		 *            the areaFax to set
		 */
		public void setAreaFax(final String areaFax)
			{
				this.areaFax = areaFax;
			}

		/**
		 * @param faxNo
		 *            the faxNo to set
		 */
		public void setFaxNo(final String faxNo)
			{
				this.faxNo = faxNo;
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

	}
