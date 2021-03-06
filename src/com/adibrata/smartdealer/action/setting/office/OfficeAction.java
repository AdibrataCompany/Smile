
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
		private OfficeService officeservice;
		private List<Office> lstoffice;
		private String searchcriteria;
		private String searchvalue;
		private int pagenumber;

		private Long id;
		
		private String message;
		
		private String officecode;
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
		private Character isactive;
		
		public OfficeAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				
				this.office = new Office();
				this.setOffice(this.office);

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
											this.Paging();
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
						
						strMode = INPUT;
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
								strMode = INPUT;
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
				final StringBuilder wherecond = new StringBuilder();
				wherecond.append(" partnercode = '" + BaseAction.sesPartnerCode() + "'");
				if ((this.getSearchvalue() != null) && !this.getSearchcriteria().equals("") && !this.getSearchcriteria().equals("0"))
					{
						wherecond.append(" and ");
						
						if (this.getSearchvalue().contains("%"))
							{
								
								wherecond.append(this.getSearchcriteria() + " like '" + this.getSearchvalue() + "' ");
							}
						else
							{
								wherecond.append(this.getSearchcriteria() + " = '" + this.getSearchvalue() + "' ");
							}
					}
				return wherecond.toString();
			}
			
		private void Paging() throws Exception
			{
				try
					{
						this.officeservice = new OfficeDao();
						
						this.lstoffice = this.officeservice.Paging(this.getPagenumber(), this.WhereCond(), "");
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
						this.officeservice = new OfficeDao();
						
						this.lstoffice = this.officeservice.Paging(this.getPagenumber(), this.WhereCond(), "", true);
						this.pagenumber = this.officeservice.getCurrentpage();
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
				
				try
					{
						if (this.getId() != null)
							{
								this.officeservice = new OfficeDao();
								this.office = new Office();
								this.office = this.officeservice.View(this.id);
								this.partner = this.office.getPartner();
								this.officecode = this.office.getOfficeCode();
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
						else
							{
								this.Paging();
								this.mode = "input";
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
			
		private String SaveAdd() throws Exception
			{
				try
					{

						this.office = new Office();
						this.office.setPartner(this.partner);

						this.office.setOfficeCode(this.getOfficecode());
						this.office.setName(this.getName());
						this.office.setAddress(this.getAddress());
						this.office.setRt(this.getRt());
						this.office.setRw(this.getRw());
						this.office.setKelurahan(this.getKelurahan());
						this.office.setKecamatan(this.getKecamatan());

						this.office.setCity(this.getCity());
						this.office.setZipcode(this.getZipcode());
						this.office.setAreaPhone1(this.getAreaphone1());
						this.office.setAreaPhone2(this.getAreaphone1());
						this.office.setPhoneNo1(this.getPhoneno2());
						this.office.setPhoneNo2(this.getPhoneno2());
						this.office.setAreaFax(this.getAreafax());
						this.office.setFaxNo(this.getFaxno());
						this.office.setHandphone(this.handphone);
						this.office.setUsrCrt(BaseAction.sesLoginName());
						this.office.setUsrUpd(BaseAction.sesLoginName());
						this.officeservice = new OfficeDao();
						this.officeservice.SaveAdd(this.office);
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

		private String SaveEdit() throws Exception
			{
				try
					{
						this.office = new Office();
						this.office = this.officeservice.View(this.id);

						this.office.setPartner(this.partner);
						this.office.setOfficeCode(this.getOfficecode());
						this.office.setName(this.getName());
						this.office.setAddress(this.getAddress());
						this.office.setRt(this.getRt());
						this.office.setRw(this.getRw());
						this.office.setKelurahan(this.getKelurahan());
						this.office.setKecamatan(this.getKecamatan());
						this.office.setCity(this.getCity());
						this.office.setZipcode(this.getZipcode());
						this.office.setAreaPhone1(this.getAreaphone1());
						this.office.setAreaPhone2(this.getAreaphone1());
						this.office.setPhoneNo1(this.getPhoneno2());
						this.office.setPhoneNo2(this.getPhoneno2());
						this.office.setAreaFax(this.getAreafax());
						this.office.setFaxNo(this.getFaxno());
						this.office.setUsrUpd(BaseAction.sesLoginName());
						this.office.setUsrCrt(BaseAction.sesLoginName());

						this.officeservice = new OfficeDao();
						this.officeservice.SaveEdit(this.office);
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
			
		private String SaveDelete() throws Exception
			{
				final String status = "";
				try
					{
						if (this.getId() != null)
							{
								this.office = new Office();
								this.office.setId(this.getId());
								this.officeservice = new OfficeDao();
								this.officeservice.SaveDel(this.office);
								this.setMessage(BaseAction.SuccessMessage());
								this.mode = SUCCESS;
							}
						else
							{
								this.mode = INPUT;
								this.setMessage(BaseAction.SelectFirst());
							}
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
			
		public OfficeService getOfficeservice()
			{
				return this.officeservice;
			}
			
		public void setOfficeservice(final OfficeService officeservice)
			{
				this.officeservice = officeservice;
			}
			
		public int getPagenumber()
			{
				return this.pagenumber;
			}
			
		public void setPagenumber(final int pagenumber)
			{
				this.pagenumber = pagenumber;
			}
			
		public String getOfficecode()
			{
				return this.officecode;
			}
			
		public void setOfficecode(final String officecode)
			{
				this.officecode = officecode;
			}
			
		public Character getIsactive()
			{
				return this.isactive;
			}
			
		public void setIsactive(final Character isactive)
			{
				this.isactive = isactive;
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
