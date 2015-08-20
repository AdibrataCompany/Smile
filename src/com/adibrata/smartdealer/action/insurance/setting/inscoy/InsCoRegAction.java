
package com.adibrata.smartdealer.action.insurance.setting.inscoy;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.inssurance.InsuranceCompanyRegisterDao;
import com.adibrata.smartdealer.model.InsCompany;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.insurance.InsuranceCompanyRegisterService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class InsCoRegAction extends BaseAction implements Preparable
	{
		private static final long serialVersionUID = 1L;
		// Mandatory
		private String mode;
		private Partner partner;
		private Office office;
		private Long id;
		private int pagenumber;
		private String searchcriteria;
		private String searchvalue;
		String message;
		// Mandatory

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
		private Boolean active;

		private List<InsCompany> lstinsco;
		private InsuranceCompanyRegisterService service;
		private InsCompany inscompany;

		public InsCoRegAction() throws Exception
			{
				try
					{
						// TODO Auto-generated constructor stub
						this.partner = new Partner();
						this.partner.setPartnerCode(BaseAction.sesPartnerCode());

						this.office = new Office();
						this.office.setId(BaseAction.sesOfficeId());

						this.service = new InsuranceCompanyRegisterDao();
						this.inscompany = new InsCompany();
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
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
									catch (final Exception e1)
										{
											// TODO Auto-generated catch block
											e1.printStackTrace();
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
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						strMode = "input";
					}
				return strMode;
			}

		/**
		 *
		 */
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
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						strMode = "input";
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
						this.lstinsco = this.service.Paging(this.getPagenumber(), this.WhereCond(), "");
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

						this.lstinsco = this.service.Paging(this.getPagenumber(), this.WhereCond(), "", true);
						this.pagenumber = this.service.getCurrentpage();
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
				this.inscompany = new InsCompany();
				try
					{
							{
								if (this.getId() != null)
									{
										
										this.inscompany = this.service.View(this.id);
										this.name = this.inscompany.getName();
										this.address = this.inscompany.getAddress();
										this.rt = this.inscompany.getRt();
										this.rw = this.inscompany.getRw();
										this.kelurahan = this.inscompany.getKelurahan();
										this.kecamatan = this.inscompany.getKecamatan();
										this.city = this.inscompany.getCity();
										this.zipcode = this.inscompany.getZipcode();
										this.type = this.inscompany.getType();
										this.areaphone1 = this.inscompany.getAreaPhone1();
										this.phoneno1 = this.inscompany.getPhoneNo1();
										this.areaphone2 = this.inscompany.getAreaPhone2();
										this.phoneno2 = this.inscompany.getPhoneNo2();
										this.areafax = this.inscompany.getAreaFax();
										this.faxno = this.inscompany.getFaxNo();
										//
										// this.documentCode = this.inscompany.getDocumentCode();
										// this.documentName = this.inscompany.getDocumentName();
										// this.assetType = this.inscompany.getAssetType();
									}
								else
									{
										this.mode = "end";
										this.setMessage(BaseAction.SelectFirst());
									}
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
			}
			
		private String SaveAdd() throws Exception
			{
				try
					{
						final InsCompany insCompany = new InsCompany();
						this.inscompany.setPartner(this.getPartner());
						
						this.inscompany.setName(this.getName());
						this.inscompany.setAddress(this.getAddress());
						this.inscompany.setRt(this.getRt());
						this.inscompany.setRw(this.getRw());
						this.inscompany.setKelurahan(this.getKelurahan());
						this.inscompany.setKecamatan(this.getKecamatan());
						this.inscompany.setCity(this.getCity());
						this.inscompany.setType(this.getType());
						this.inscompany.setAreaPhone1(this.getAreaphone1());
						this.inscompany.setPhoneNo1(this.getPhoneno1());
						this.inscompany.setAreaPhone2(this.getAreaphone2());
						this.inscompany.setPhoneNo2(this.getPhoneno2());
						this.inscompany.setAreaFax(this.getAreafax());
						this.inscompany.setFaxNo(this.getFaxno());
						this.inscompany.setUsrCrt(BaseAction.sesLoginName());
						this.inscompany.setUsrUpd(BaseAction.sesLoginName());
						
						this.service.SaveAdd(insCompany);
						this.mode = SUCCESS;
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
						final InsCompany insCompany = new InsCompany();
						this.inscompany.setId(this.getId());
						this.inscompany.setPartner(this.getPartner());
						this.inscompany.setName(this.getName());
						this.inscompany.setAddress(this.getAddress());
						this.inscompany.setRt(this.getRt());
						this.inscompany.setRw(this.getRw());
						this.inscompany.setKelurahan(this.getKelurahan());
						this.inscompany.setKecamatan(this.getKecamatan());
						this.inscompany.setCity(this.getCity());
						this.inscompany.setType(this.getType());
						this.inscompany.setAreaPhone1(this.getAreaphone1());
						this.inscompany.setPhoneNo1(this.getPhoneno1());
						this.inscompany.setAreaPhone2(this.getAreaphone2());
						this.inscompany.setPhoneNo2(this.getPhoneno2());
						this.inscompany.setAreaFax(this.getAreafax());
						this.inscompany.setFaxNo(this.getFaxno());
						this.inscompany.setUsrUpd(BaseAction.sesLoginName());
						this.service.SaveEdit(insCompany);
						this.mode = SUCCESS;
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
						this.mode = "";
						if (this.getId() == null)
							{
								final InsCompany insCompany = new InsCompany();

								insCompany.setId(this.getId());

								this.service.SaveDel(insCompany);
								this.mode = SUCCESS;
								this.setMessage(BaseAction.SuccessMessage());
							}
						else
							{
								this.mode = "end";
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
			
		public Partner getPartner()
			{
				return this.partner;
			}
			
		public void setPartner(final Partner partner)
			{
				this.partner = partner;
			}
			
		public Office getOffice()
			{
				return this.office;
			}
			
		public void setOffice(final Office office)
			{
				this.office = office;
			}
			
		public Long getId()
			{
				return this.id;
			}
			
		public void setId(final Long id)
			{
				this.id = id;
			}
			
		public int getPagenumber()
			{
				return this.pagenumber;
			}
			
		public void setPagenumber(final int pagenumber)
			{
				this.pagenumber = pagenumber;
			}
			
		public String getMessage()
			{
				return this.message;
			}
			
		public void setMessage(final String message)
			{
				this.message = message;
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
			
		public String getType()
			{
				return this.type;
			}
			
		public void setType(final String type)
			{
				this.type = type;
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
			
		public List<InsCompany> getLstinsco()
			{
				return this.lstinsco;
			}
			
		public void setLstinsco(final List<InsCompany> lstinsco)
			{
				this.lstinsco = lstinsco;
			}
			
		public InsuranceCompanyRegisterService getService()
			{
				return this.service;
			}
			
		public void setService(final InsuranceCompanyRegisterService service)
			{
				this.service = service;
			}
			
		public InsCompany getInscompany()
			{
				return this.inscompany;
			}
			
		public void setInscompany(final InsCompany inscompany)
			{
				this.inscompany = inscompany;
			}
			
		public static long getSerialversionuid()
			{
				return serialVersionUID;
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

		public Boolean getActive()
			{
				return this.active;
			}

		public void setActive(Boolean active)
			{
				this.active = active;
			}

	}
