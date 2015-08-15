
package com.adibrata.smartdealer.action.setting;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.ZipCodeDao;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.ZipCode;
import com.adibrata.smartdealer.service.setting.ZipCodeService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class ZipCodeAction extends BaseAction implements Preparable
	{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private String mode;
		private ZipCode zipcode;
		private Partner partner;
		private Office office;
		private List<ZipCode> lstZipCode;
		
		private ZipCodeService zipCodeService;
		private String searchcriteria;
		private String searchvalue;
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private String message;
		private Long id;
		private String kelurahan;
		private String kecamatan;
		private String city;
		private String zipCode;
		
		public ZipCodeAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				final ZipCodeService zipcodeservice = new ZipCodeDao();
				
				this.zipCodeService = zipcodeservice;
				final Partner partner = new Partner();
				final Office office = new Office();
				final ZipCode zipcode = new ZipCode();
				
				this.setPartner(partner);
				this.setOffice(office);
				this.setZipcode(zipcode);
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
				try
					{
						if (this.mode != null)
							{
								switch (strMode)
									{
										case "search" :
											this.Paging();
											break;
										case "edit" :
											this.ViewData();
											break;
										case "savedel" :
											strMode = this.SaveDelete();
											break;
										case "saveadd" :
											strMode = this.SaveAdd();
											break;
										case "saveedit" :
											strMode = this.SaveEdit();
											break;
										case "first" :
											this.pageNumber = 1;
											this.Paging();
											break;
										case "prev" :
											this.pageNumber -= 1;
											if (this.pageNumber <= 1)
												{
													this.pageNumber = 1;
												}
											this.Paging();
											break;
										case "next" :
											this.pageNumber += 1;
											this.Paging();
											break;
										case "last" :
											this.Paging(1);
											break;
										default :
											break;
									}
							}
						else
							{
								this.pageNumber = 1;
								this.Paging();
								strMode = "start";
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return strMode;
			}
			
		private String WhereCond()
			{
				String wherecond = "";
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
						this.lstZipCode = this.zipCodeService.Paging(this.getPageNumber(), this.WhereCond(), "");
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
						this.lstZipCode = this.zipCodeService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
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
				this.zipcode = new ZipCode();
				try
					{
						this.zipcode = this.zipCodeService.View(this.id);
						this.kelurahan = this.zipcode.getKelurahan();
						this.kecamatan = this.zipcode.getKecamatan();
						this.city = this.zipcode.getCity();
						this.zipCode = this.zipcode.getZipCode();
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
				String status = "";
				try
					{
						final ZipCode zipcode = new ZipCode();
						zipcode.setId(this.getId());
						zipcode.setKelurahan(this.kelurahan);
						zipcode.setKecamatan(this.kecamatan);
						zipcode.setCity(this.city);
						zipcode.setZipCode(this.zipCode);
						this.zipCodeService.SaveDel(zipcode);
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
			
		private String SaveEdit() throws Exception
			{
				String status = "";
				try
					{
						final ZipCode zipcode = new ZipCode();
						zipcode.setId(this.getId());
						zipcode.setKelurahan(this.kelurahan);
						zipcode.setKecamatan(this.kecamatan);
						zipcode.setCity(this.city);
						zipcode.setZipCode(this.zipCode);
						zipcode.setUsrUpd(this.usrUpd);
						this.zipCodeService.SaveDel(zipcode);
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
			
		private String SaveDelete() throws Exception
			{
				String status = "";
				try
					{
						final ZipCode zipcode = new ZipCode();
						zipcode.setId(this.getId());
						
						this.zipCodeService.SaveDel(zipcode);
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
		public Long getId()
			{
				return this.id;
			}
			
		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final Long id)
			{
				this.id = id;
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
			
		public List<ZipCode> getLstZipCode()
			{
				return this.lstZipCode;
			}
			
		public void setLstZipCode(final List<ZipCode> lstZipCode)
			{
				this.lstZipCode = lstZipCode;
			}
			
		public ZipCodeService getZipCodeService()
			{
				return this.zipCodeService;
			}
			
		public void setZipCodeService(final ZipCodeService zipCodeService)
			{
				this.zipCodeService = zipCodeService;
			}
			
		public ZipCode getZipcode()
			{
				return this.zipcode;
			}
			
		public void setZipcode(final ZipCode zipcode)
			{
				this.zipcode = zipcode;
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
			
		public String getZipCode()
			{
				return this.zipCode;
			}
			
		public void setZipCode(final String zipCode)
			{
				this.zipCode = zipCode;
			}
			
	}
