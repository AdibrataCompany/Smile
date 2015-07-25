
package com.adibrata.smartdealer.action.setting;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.AssetMasterDao;
import com.adibrata.smartdealer.model.AssetMaster;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.AssetMasterService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AssetMasterAction extends BaseAction implements Preparable
	{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private String mode;
		private AssetMasterService assetMasterService;
		private AssetMaster assetmaster;
		private Partner partner;
		private Office office;
		private List<AssetMaster> lstAssetMaster;
		private String searchcriteria;
		private String searchvalue;
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private String message;
		private String status;
		
		private long id;
		private String assetType;
		private String assetBrand;
		private String assetModel;
		private String assetCode;
		private Integer assetLevel;
		
		public AssetMasterAction() throws Exception
			{
				final AssetMasterService assetmasterservice = new AssetMasterDao();
				
				this.assetMasterService = assetmasterservice;
				final Partner partner = new Partner();
				final Office office = new Office();
				final AssetMaster assetMaster = new AssetMaster();
				
				this.setPartner(partner);
				this.setOffice(office);
				this.setAssetmaster(assetMaster);
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
						this.lstAssetMaster = this.assetMasterService.Paging(this.getPageNumber(), this.WhereCond(), "");
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
						this.lstAssetMaster = this.assetMasterService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
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
				this.assetmaster = new AssetMaster();
				try
					{
						this.assetmaster = this.assetMasterService.View(this.id);
						this.assetBrand = this.assetmaster.getAssetBrand();
						this.assetType = this.assetmaster.getAssetType();
						this.assetModel = this.assetmaster.getAssetModel();
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
						this.status = "";
						final AssetMaster assetMaster = new AssetMaster();
						assetMaster.setAssetBrand(this.assetBrand);
						assetMaster.setAssetType(this.assetType);
						assetMaster.setAssetModel(this.assetModel);
						assetMaster.setPartner(this.partner);
						this.assetMasterService.SaveAdd(assetMaster);
						this.status = SUCCESS;
						this.setMessage(BaseAction.SuccessMessage());
					}
				catch (final Exception exp)
					{
						this.status = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.status;
			}
			
		private String SaveEdit() throws Exception
			{
				this.status = "";
				try
					{
						final AssetMaster assetMaster = new AssetMaster();
						assetMaster.setId(this.getId());
						assetMaster.setAssetBrand(this.assetBrand);
						assetMaster.setAssetType(this.assetType);
						assetMaster.setAssetModel(this.assetModel);
						assetMaster.setPartner(this.partner);
						assetMaster.setUsrUpd(this.usrUpd);
						this.assetMasterService.SaveAdd(assetMaster);
						this.status = SUCCESS;
						this.setMessage(BaseAction.SuccessMessage());
					}
				catch (final Exception exp)
					{
						this.status = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.status;
			}
			
		private String SaveDelete() throws Exception
			{
				this.status = "";
				try
					{
						final AssetMaster assetMaster = new AssetMaster();
						
						assetMaster.setId(this.getId());
						this.assetMasterService.SaveDel(assetMaster);
						this.status = SUCCESS;
						this.setMessage(BaseAction.SuccessMessage());
					}
				catch (final Exception exp)
					{
						this.status = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.status;
			}
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
		/**
		 * @return the assetMasterService
		 */
		public AssetMasterService getAssetMasterService()
			{
				return this.assetMasterService;
			}
			
		/**
		 * @return the assetmaster
		 */
		public AssetMaster getAssetmaster()
			{
				return this.assetmaster;
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
		 * @return the lstAssetMaster
		 */
		public List<AssetMaster> getLstAssetMaster()
			{
				return this.lstAssetMaster;
			}
			
		/**
		 * @param assetMasterService
		 *            the assetMasterService to set
		 */
		public void setAssetMasterService(final AssetMasterService assetMasterService)
			{
				this.assetMasterService = assetMasterService;
			}
			
		/**
		 * @param assetmaster
		 *            the assetmaster to set
		 */
		public void setAssetmaster(final AssetMaster assetmaster)
			{
				this.assetmaster = assetmaster;
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
		 * @param lstAssetMaster
		 *            the lstAssetMaster to set
		 */
		public void setLstAssetMaster(final List<AssetMaster> lstAssetMaster)
			{
				this.lstAssetMaster = lstAssetMaster;
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
		 * @return the id
		 */
		public long getId()
			{
				return this.id;
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
		 * @return the pageNumber
		 */
		public int getPageNumber()
			{
				return this.pageNumber;
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
		 * @param id
		 *            the id to set
		 */
		public void setId(final long id)
			{
				this.id = id;
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
		 * @param pageNumber
		 *            the pageNumber to set
		 */
		public void setPageNumber(final int pageNumber)
			{
				this.pageNumber = pageNumber;
			}
			
		/**
		 * @return the assetType
		 */
		public String getAssetType()
			{
				return this.assetType;
			}
			
		/**
		 * @return the assetBrand
		 */
		public String getAssetBrand()
			{
				return this.assetBrand;
			}
			
		/**
		 * @return the assetModel
		 */
		public String getAssetModel()
			{
				return this.assetModel;
			}
			
		/**
		 * @return the assetCode
		 */
		public String getAssetCode()
			{
				return this.assetCode;
			}
			
		/**
		 * @return the assetLevel
		 */
		public Integer getAssetLevel()
			{
				return this.assetLevel;
			}
			
		/**
		 * @param assetType
		 *            the assetType to set
		 */
		public void setAssetType(final String assetType)
			{
				this.assetType = assetType;
			}
			
		/**
		 * @param assetBrand
		 *            the assetBrand to set
		 */
		public void setAssetBrand(final String assetBrand)
			{
				this.assetBrand = assetBrand;
			}
			
		/**
		 * @param assetModel
		 *            the assetModel to set
		 */
		public void setAssetModel(final String assetModel)
			{
				this.assetModel = assetModel;
			}
			
		/**
		 * @param assetCode
		 *            the assetCode to set
		 */
		public void setAssetCode(final String assetCode)
			{
				this.assetCode = assetCode;
			}
			
		/**
		 * @param assetLevel
		 *            the assetLevel to set
		 */
		public void setAssetLevel(final Integer assetLevel)
			{
				this.assetLevel = assetLevel;
			}
			
		public String getMessage()
			{
				return this.message;
			}
			
		public void setMessage(final String message)
			{
				this.message = message;
			}
			
		public String getStatus()
			{
				return this.status;
			}
			
		public void setStatus(final String status)
			{
				this.status = status;
			}
			
	}
