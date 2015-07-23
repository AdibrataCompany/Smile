
package com.adibrata.smartdealer.action.setting;

import java.util.List;

import com.adibrata.smartdealer.model.AssetMaster;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.AssetMasterService;
/**
 * @author Henry
 */
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AssetMasterAction extends ActionSupport implements Preparable
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
		private long id;
		private String assetType;
		private String assetBrand;
		private String assetModel;
		private String assetCode;
		private Integer assetLevel;
		
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
									strMode = this.Paging();
								case "edit" :
								
								case "del" :
									return this.SaveDelete();
								case "add" :
									
									strMode = this.SaveAdd();
								case "saveadd" :
									strMode = this.SaveAdd();
								case "saveedit" :
									strMode = this.SaveEdit();
								case "back" :
								
								default :
									return ERROR;
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
							
						this.lstAssetMaster = this.assetMasterService.Paging(this.getPageNumber(), wherecond, "");
						
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
						final AssetMaster assetMaster = new AssetMaster();
						assetMaster.setAssetBrand(this.getAssetBrand());
						assetMaster.setAssetType(this.getAssetType());
						assetMaster.setAssetModel(this.getAssetModel());
						
						this.assetMasterService.SaveAdd(assetMaster);
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
						final AssetMaster assetMaster = new AssetMaster();
						assetMaster.setAssetBrand(this.getAssetBrand());
						assetMaster.setAssetType(this.getAssetType());
						assetMaster.setAssetModel(this.getAssetModel());
						assetMaster.setId(this.getId());
						this.assetMasterService.SaveAdd(assetMaster);
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
						final AssetMaster assetMaster = new AssetMaster();
						
						assetMaster.setId(this.getId());
						this.assetMasterService.SaveDel(assetMaster);
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
			
	}
