
package com.adibrata.smartdealer.action.setting;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.TaksasiDao;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.Taksasi;
import com.adibrata.smartdealer.service.setting.TaksasiService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class TaksasiAction extends BaseAction implements Preparable
	{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private String mode;
		private Taksasi taksasi;
		private TaksasiService taksasiService;
		private Partner partner;
		private Office office;
		private List<Taksasi> lstTaksasi;
		private String searchcriteria;
		private String searchvalue;
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private String message;
		private Long id;
		
		private String assetMasterCode;
		private String taksasiCode;
		private String taksasiName;
		private double taksasiPriceMin;
		
		public TaksasiAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				final TaksasiService taksasiservice = new TaksasiDao();
				
				this.taksasiService = taksasiservice;
				final Partner partner = new Partner();
				final Office office = new Office();
				final Taksasi taksasi = new Taksasi();
				
				this.setPartner(partner);
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.setOffice(office);
				this.setTaksasi(taksasi);
				if (this.pageNumber == 0)
					{
						this.pageNumber = 1;
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
						this.lstTaksasi = this.taksasiService.Paging(this.getPageNumber(), this.WhereCond(), "");
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
						this.lstTaksasi = this.taksasiService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
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
				this.taksasi = new Taksasi();
				try
					{
						this.taksasi = this.taksasiService.View(this.id);
						this.taksasiCode = this.taksasi.getTaksasiCode();
						this.taksasiName = this.taksasi.getTaksasiName();
						this.taksasiPriceMin = this.taksasi.getTaksasiPriceMin();
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
						final Taksasi taksasi = new Taksasi();
						taksasi.setTaksasiCode(this.getTaksasiCode());
						taksasi.setTaksasiName(this.getTaksasiName());
						taksasi.setTaksasiPriceMin(this.getTaksasiPriceMin());
						taksasi.setPartner(this.partner);
						this.taksasiService.SaveAdd(taksasi);
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
						final Taksasi taksasi = new Taksasi();
						taksasi.setTaksasiCode(this.getTaksasiCode());
						taksasi.setTaksasiName(this.getTaksasiName());
						taksasi.setTaksasiPriceMin(this.getTaksasiPriceMin());
						taksasi.setUsrUpd(this.usrUpd);
						taksasi.setPartner(this.partner);
						this.taksasiService.SaveEdit(taksasi);
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
						final Taksasi taksasi = new Taksasi();
						taksasi.setTaksasiCode(this.getTaksasiCode());
						taksasi.setTaksasiName(this.getTaksasiName());
						taksasi.setTaksasiPriceMin(this.getTaksasiPriceMin());
						
						this.taksasiService.SaveDel(taksasi);
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
		public static Long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
		/**
		 * @return the taksasi
		 */
		public Taksasi getTaksasi()
			{
				return this.taksasi;
			}
			
		/**
		 * @return the taksasiService
		 */
		public TaksasiService getTaksasiService()
			{
				return this.taksasiService;
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
		 * @return the lstTaksasi
		 */
		public List<Taksasi> getLstTaksasi()
			{
				return this.lstTaksasi;
			}
			
		/**
		 * @param taksasi
		 *            the taksasi to set
		 */
		public void setTaksasi(final Taksasi taksasi)
			{
				this.taksasi = taksasi;
			}
			
		/**
		 * @param taksasiService
		 *            the taksasiService to set
		 */
		public void setTaksasiService(final TaksasiService taksasiService)
			{
				this.taksasiService = taksasiService;
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
		 * @param lstTaksasi
		 *            the lstTaksasi to set
		 */
		public void setLstTaksasi(final List<Taksasi> lstTaksasi)
			{
				this.lstTaksasi = lstTaksasi;
			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
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
		 * @return the assetMasterCode
		 */
		public String getAssetMasterCode()
			{
				return this.assetMasterCode;
			}
			
		/**
		 * @return the taksasiCode
		 */
		public String getTaksasiCode()
			{
				return this.taksasiCode;
			}
			
		/**
		 * @return the taksasiName
		 */
		public String getTaksasiName()
			{
				return this.taksasiName;
			}
			
		/**
		 * @return the taksasiPriceMin
		 */
		public double getTaksasiPriceMin()
			{
				return this.taksasiPriceMin;
			}
			
		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final Long id)
			{
				this.id = id;
			}
			
		/**
		 * @param assetMasterCode
		 *            the assetMasterCode to set
		 */
		public void setAssetMasterCode(final String assetMasterCode)
			{
				this.assetMasterCode = assetMasterCode;
			}
			
		/**
		 * @param taksasiCode
		 *            the taksasiCode to set
		 */
		public void setTaksasiCode(final String taksasiCode)
			{
				this.taksasiCode = taksasiCode;
			}
			
		/**
		 * @param taksasiName
		 *            the taksasiName to set
		 */
		public void setTaksasiName(final String taksasiName)
			{
				this.taksasiName = taksasiName;
			}
			
		/**
		 * @param taksasiPriceMin
		 *            the taksasiPriceMin to set
		 */
		public void setTaksasiPriceMin(final double taksasiPriceMin)
			{
				this.taksasiPriceMin = taksasiPriceMin;
			}
			
	}
