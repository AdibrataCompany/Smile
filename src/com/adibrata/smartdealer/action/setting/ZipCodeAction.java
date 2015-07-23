
package com.adibrata.smartdealer.action.setting;

/**
 * @author Henry
 */
import java.util.List;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.ZipCode;
import com.adibrata.smartdealer.service.setting.ZipCodeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class ZipCodeAction extends ActionSupport implements Preparable
	{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private String mode;
		private ZipCode zipCode;
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
		private long id;
		
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
		/**
		 * @return the zipCode
		 */
		public ZipCode getZipCode()
			{
				return this.zipCode;
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
		 * @return the lstZipCode
		 */
		public List<ZipCode> getLstZipCode()
			{
				return this.lstZipCode;
			}
			
		/**
		 * @return the zipCodeService
		 */
		public ZipCodeService getZipCodeService()
			{
				return this.zipCodeService;
			}
			
		/**
		 * @param zipCode
		 *            the zipCode to set
		 */
		public void setZipCode(final ZipCode zipCode)
			{
				this.zipCode = zipCode;
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
		 * @param lstZipCode
		 *            the lstZipCode to set
		 */
		public void setLstZipCode(final List<ZipCode> lstZipCode)
			{
				this.lstZipCode = lstZipCode;
			}
			
		/**
		 * @param zipCodeService
		 *            the zipCodeService to set
		 */
		public void setZipCodeService(final ZipCodeService zipCodeService)
			{
				this.zipCodeService = zipCodeService;
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
								case "search" :
									try
										{
											strMode = this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								case "edit" :
								
								case "del" :
									try
										{
											return this.SaveDelete();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								case "add" :
									
									try
										{
											strMode = this.SaveAdd();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
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
								case "back" :
								
								default :
									return "failed";
							}
					}
				else
					{
						strMode = "start";
					}
				return strMode;
			}
			
		private String Paging() throws Exception
			{
				
				String status = "";
				try
					{
						String wherecond = "";
						if (this.getSearchcriteria().contains("%"))
							{
								wherecond = this.getSearchvalue() + " like " + this.getSearchcriteria();
							}
						else
							{
								wherecond = this.getSearchvalue() + " = " + this.getSearchcriteria();
							}
							
						this.lstZipCode = this.zipCodeService.Paging(this.getPageNumber(), wherecond, "");
						
						status = "Success";
					}
				catch (final Exception exp)
					{
						status = "Failed";
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}
			
		private String SaveAdd() throws Exception
			{
				String status = "";
				try
					{
						final ZipCode zipCode = new ZipCode();
						zipCode.setId(this.getId());
						
						this.zipCodeService.SaveDel(zipCode);
						status = SUCCESS;
					}
				catch (final Exception exp)
					{
						status = ERROR;
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
						final ZipCode zipCode = new ZipCode();
						zipCode.setId(this.getId());
						
						this.zipCodeService.SaveDel(zipCode);
						status = SUCCESS;
					}
				catch (final Exception exp)
					{
						status = ERROR;
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
						final ZipCode zipCode = new ZipCode();
						zipCode.setId(this.getId());
						
						this.zipCodeService.SaveDel(zipCode);
						status = SUCCESS;
					}
				catch (final Exception exp)
					{
						status = ERROR;
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
			
	}
