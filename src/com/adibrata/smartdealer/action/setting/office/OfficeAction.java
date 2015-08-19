
package com.adibrata.smartdealer.action.setting.office;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.OfficeDao;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.OfficeService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class OfficeAction extends BaseAction implements Preparable
	{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		private String mode;
		private Partner partner;
		private Office office;
		private List<Office> lstoffice;
		private OfficeService officeService;
		private List<Office> lstOffice;
		private String searchcriteria;
		private String searchvalue;
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private long id;

		private String message;

		private String officeCode;
		private String name;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String kecamatan;
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
		// private String fullAddress; save di dao office
		private Character isActive;

		public OfficeAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());

				this.office = new Office();
				this.setOffice(this.office);

				this.officeService = new OfficeDao();
				this.office = new Office();

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
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						strMode = "start";
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
						this.lstOffice = this.officeService.Paging(this.getPageNumber(), this.WhereCond(), "");
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
						this.lstOffice = this.officeService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
						this.pageNumber = this.officeService.getCurrentpage();
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
				this.office = new Office();
				try
					{
						this.office = this.officeService.View(this.id);
						this.partner = this.office.getPartner();
						this.officeCode = this.office.getOfficeCode();
						this.name = this.office.getName();
						this.address = this.office.getAddress();
						this.rt = this.office.getRt();
						this.rw = this.office.getRw();
						this.kelurahan = this.office.getKelurahan();
						this.kecamatan = this.office.getKecamatan();
						this.city = this.office.getCity();
						this.zipcode = this.office.getZipcode();
						this.areaphone1 = this.office.getAreaPhone1();
						this.areaphone2 = this.office.getAreaPhone2();
						this.phoneno1 = this.office.getPhoneNo1();
						this.phoneno2 = this.office.getPhoneNo2();
						this.areafax = this.office.getAreaFax();
						this.faxno = this.office.getFaxNo();
						this.handphone = this.office.getHandphone();
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

		private String SaveAdd() throws Exception
			{
				try
					{
						final Office office = new Office();
						office.setOfficeCode(this.getOfficeCode());
						office.setName(this.getName());
						office.setAddress(this.getAddress());
						office.setRt(this.getRt());
						office.setRw(this.getRw());
						office.setKelurahan(this.getKelurahan());
						office.setKecamatan(this.getKecamatan());

						office.setCity(this.getCity());
						office.setZipcode(this.getZipcode());
						office.setAreaPhone1(this.getAreaphone1());
						office.setAreaPhone2(this.getAreaphone1());
						office.setPhoneNo1(this.getPhoneno2());
						office.setPhoneNo2(this.getPhoneno2());
						office.setAreaFax(this.getAreafax());
						office.setFaxNo(this.getFaxno());
						office.setHandphone(this.handphone);
						office.setPartner(this.partner);
						this.officeService.SaveAdd(office);
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
						final Office office = new Office();
						office.setId(this.getId());
						office.setOfficeCode(this.getOfficeCode());
						office.setName(this.getName());
						office.setAddress(this.getAddress());
						office.setRt(this.getRt());
						office.setRw(this.getRw());
						office.setKelurahan(this.getKelurahan());
						office.setKecamatan(this.getKecamatan());
						office.setCity(this.getCity());
						office.setZipcode(this.getZipcode());
						office.setAreaPhone1(this.getAreaphone1());
						office.setAreaPhone2(this.getAreaphone1());
						office.setPhoneNo1(this.getPhoneno2());
						office.setPhoneNo2(this.getPhoneno2());
						office.setAreaFax(this.getAreafax());
						office.setFaxNo(this.getFaxno());
						office.setPartner(this.partner);
						office.setUsrUpd(this.usrUpd);
						this.officeService.SaveEdit(office);
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
				String status = "";
				try
					{
						final Office office = new Office();
						office.setId(this.getId());
						this.officeService.SaveDel(office);
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
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
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
		 * @return the lstoffice
		 */
		public List<Office> getLstoffice()
			{
				return this.lstoffice;
			}

		/**
		 * @return the officeService
		 */
		public OfficeService getOfficeService()
			{
				return this.officeService;
			}

		/**
		 * @return the lstOffice
		 */
		public List<Office> getLstOffice()
			{
				return this.lstOffice;
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
		 * @param lstoffice
		 *            the lstoffice to set
		 */
		public void setLstoffice(final List<Office> lstoffice)
			{
				this.lstoffice = lstoffice;
			}

		/**
		 * @param officeService
		 *            the officeService to set
		 */
		public void setOfficeService(final OfficeService officeService)
			{
				this.officeService = officeService;
			}

		/**
		 * @param lstOffice
		 *            the lstOffice to set
		 */
		public void setLstOffice(final List<Office> lstOffice)
			{
				this.lstOffice = lstOffice;
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
		 * @return the officeCode
		 */
		public String getOfficeCode()
			{
				return this.officeCode;
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
		 * @return the zipcode
		 */
		public String getZipcode()
			{
				return this.zipcode;
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
		 * @return the isActive
		 */
		public Character getIsActive()
			{
				return this.isActive;
			}

		/**
		 * @param officeCode
		 *            the officeCode to set
		 */
		public void setOfficeCode(final String officeCode)
			{
				this.officeCode = officeCode;
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
		 * @param zipcode
		 *            the zipcode to set
		 */
		public void setZipcode(final String zipcode)
			{
				this.zipcode = zipcode;
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
		 * @param isActive
		 *            the isActive to set
		 */
		public void setIsActive(final Character isActive)
			{
				this.isActive = isActive;
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
		 * @return the areaphone1
		 */
		public String getAreaphone1()
			{
				return this.areaphone1;
			}

		/**
		 * @param areaphone1
		 *            the areaphone1 to set
		 */
		public void setAreaphone1(final String areaphone1)
			{
				this.areaphone1 = areaphone1;
			}

		/**
		 * @return the areaphone2
		 */
		public String getAreaphone2()
			{
				return this.areaphone2;
			}

		/**
		 * @param areaphone2
		 *            the areaphone2 to set
		 */
		public void setAreaphone2(final String areaphone2)
			{
				this.areaphone2 = areaphone2;
			}

		/**
		 * @return the phoneno2
		 */
		public String getPhoneno2()
			{
				return this.phoneno2;
			}

		/**
		 * @param phoneno2
		 *            the phoneno2 to set
		 */
		public void setPhoneno2(final String phoneno2)
			{
				this.phoneno2 = phoneno2;
			}

		/**
		 * @return the faxno
		 */
		public String getFaxno()
			{
				return this.faxno;
			}

		/**
		 * @param faxno
		 *            the faxno to set
		 */
		public void setFaxno(final String faxno)
			{
				this.faxno = faxno;
			}

		/**
		 * @return the areafax
		 */
		public String getAreafax()
			{
				return this.areafax;
			}

		/**
		 * @param areafax
		 *            the areafax to set
		 */
		public void setAreafax(final String areafax)
			{
				this.areafax = areafax;
			}

		/**
		 * @return the phoneno1
		 */
		public String getPhoneno1()
			{
				return this.phoneno1;
			}

		/**
		 * @param phoneno1
		 *            the phoneno1 to set
		 */
		public void setPhoneno1(final String phoneno1)
			{
				this.phoneno1 = phoneno1;
			}

		/**
		 * @return the kecamatan
		 */
		public String getKecamatan()
			{
				return this.kecamatan;
			}

		/**
		 * @param kecamatan
		 *            the kecamatan to set
		 */
		public void setKecamatan(final String kecamatan)
			{
				this.kecamatan = kecamatan;
			}

	}
