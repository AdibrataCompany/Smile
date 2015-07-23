
package com.adibrata.smartdealer.action.setting;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.AssetDocMasterDao;
import com.adibrata.smartdealer.model.AssetDocMaster;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.AssetDocMasterService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AssetDocAction extends BaseAction implements Preparable
	{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private String mode;
		
		private AssetDocMasterService assetDocMasterService;
		private AssetDocMaster assetDocMaster;
		private Partner partner;
		private Office office;
		private List<AssetDocMaster> lstAssetDocMasters;
		private String searchcriteria;
		private String searchvalue;
		private long id;
		private String usrUpd;
		private String usrCrt;
		private int pageNumber;
		private String message;
		private String assetdocumentcode;
		private String assetdocumentname;
		private String assetType;
		
		/**
		 * @throws Exception
		 */
		public AssetDocAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				final AssetDocMasterService assetdocmasterservice = new AssetDocMasterDao();
				
				this.assetDocMasterService = assetdocmasterservice;
				final Partner partner = new Partner();
				final Office office = new Office();
				final AssetDocMaster assetDocMaster = new AssetDocMaster();
				
				this.setPartner(partner);
				this.setOffice(office);
				this.setAssetDocMaster(assetDocMaster);
				if (this.pageNumber == 0)
					{
						this.pageNumber = 1;
					}
					
			}
			
		/**
		 * 
		 */
		/*
		 * public AssetDocAction(AssetDocMasterService assetDocMasterService) {
		 * this.assetDocMasterService = assetDocMasterService; // TODO
		 * Auto-generated constructor stub }
		 */
		
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
									;
									
								case "first" :
									this.pageNumber -= 1;
									this.Paging();
								case "prev" :
									this.pageNumber -= 1;
									if (this.pageNumber <= 1)
										{
											this.pageNumber = 1;
										}
									this.Paging();
								case "next" :
									this.pageNumber += 1;
									this.Paging();
								case "last" :
									this.LastPage();
								default :
									return ERROR;
							}
					}
				else
					{
						strMode = "start";
					}
				return strMode;
				/*
				 * if (mode != null) {
				 * if (mode.equals("search")) { Paging(); } else if
				 * (mode.equals(SUCCESS)) { strMode = mode; } else if
				 * (mode.equals(ERROR)) { Paging(); } else if (mode.equals("add")) {
				 * Paging(); } else if (mode.equals("edit")) { Paging(); } else if
				 * (mode.equals("saveadd")) { mode = SaveAdd(); } else if
				 * (mode.equals("saveedit")) { mode = SaveEdit(); } else if
				 * (mode.equals("savedel")) { mode = SaveDelete(); } else mode = ERROR;
				 * } else { mode = "start"; }
				 * return mode;
				 */
			}
			
		/**
		 * 
		 */
		private String WhereCond()
			{
				String wherecond = "";
				if ((this.getSearchvalue() != null) && !this.getSearchcriteria().equals(""))
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
			
		private void LastPage() throws Exception
			{
				try
					{
						/* int lastPageNumber = (int) ((countResults / pageSize) + 1); */
						
						this.pageNumber = (int) ((this.assetDocMasterService.TotalRecord(this.WhereCond()) / BaseAction.PageRecord()) + 1);
						this.Paging();
					}
					
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
			
		private void Paging() throws Exception
			{
				try
					{
						this.lstAssetDocMasters = this.assetDocMasterService.Paging(this.getPageNumber(), this.WhereCond(), "");
						
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
						final AssetDocMaster assetDocMaster = new AssetDocMaster();
						assetDocMaster.setDocumentCode(this.getAssetdocumentcode());
						assetDocMaster.setDocumentName(this.getAssetdocumentname());
						this.assetDocMasterService.SaveAdd(assetDocMaster);
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
						final AssetDocMaster assetDocMaster = new AssetDocMaster();
						assetDocMaster.setId(this.getId());
						assetDocMaster.setDocumentCode(this.getAssetdocumentcode());
						assetDocMaster.setDocumentName(this.getAssetdocumentname());
						this.assetDocMasterService.SaveEdit(assetDocMaster);
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
						final AssetDocMaster assetDocMaster = new AssetDocMaster();
						assetDocMaster.setId(this.getId());
						
						this.assetDocMasterService.SaveDel(assetDocMaster);
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
			
		/** Getter Setter */
		
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
		/**
		 * @return the assetDocMasterService
		 */
		public AssetDocMasterService getAssetDocMasterService()
			{
				return this.assetDocMasterService;
			}
			
		/**
		 * @return the assetDocMaster
		 */
		public AssetDocMaster getAssetDocMaster()
			{
				return this.assetDocMaster;
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
		 * @return the lstassetAssetDocMasters
		 */
		public List<AssetDocMaster> getLstAssetDocMasters()
			{
				return this.lstAssetDocMasters;
			}
			
		/**
		 * @param assetDocMasterService
		 *            the assetDocMasterService to set
		 */
		public void setAssetDocMasterService(final AssetDocMasterService assetDocMasterService)
			{
				this.assetDocMasterService = assetDocMasterService;
			}
			
		/**
		 * @param assetDocMaster
		 *            the assetDocMaster to set
		 */
		public void setAssetDocMaster(final AssetDocMaster assetDocMaster)
			{
				this.assetDocMaster = assetDocMaster;
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
		 * @param lstassetAssetDocMasters
		 *            the lstassetAssetDocMasters to set
		 */
		public void setLstAssetDocMasters(final List<AssetDocMaster> lstAssetDocMasters)
			{
				this.lstAssetDocMasters = lstAssetDocMasters;
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
		 * @return the id
		 */
		public long getId()
			{
				return this.id;
			}
			
		/**
		 * @return the documentCode
		 */
		
		/**
		 * @return the usrUpd
		 */
		public String getUsrUpd()
			{
				return this.usrUpd;
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
		 * @param documentCode
		 *            the documentCode to set
		 */
		public void setDocumentCode(final String documentCode)
			{
				this.assetdocumentcode = documentCode;
			}
			
		/**
		 * @param documentName
		 *            the documentName to set
		 */
		public void setDocumentName(final String documentName)
			{
				this.assetdocumentname = documentName;
			}
			
		/**
		 * @param usrUpd
		 *            the usrUpd to set
		 */
		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
			
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
			}
			
		/**
		 * @return the pageNumber
		 */
		public int getPageNumber()
			{
				return this.pageNumber;
			}
			
		/**
		 * @return the searchBy
		 */
		
		/**
		 * @param pageNumber
		 *            the pageNumber to set
		 */
		public void setPageNumber(final int pageNumber)
			{
				this.pageNumber = pageNumber;
			}
			
		/**
		 * @return the assetdocumentcode
		 */
		public String getAssetdocumentcode()
			{
				return this.assetdocumentcode;
			}
			
		/**
		 * @param assetdocumentcode
		 *            the assetdocumentcode to set
		 */
		public void setAssetdocumentcode(final String assetdocumentcode)
			{
				this.assetdocumentcode = assetdocumentcode;
			}
			
		/**
		 * @return the assetdocumentname
		 */
		public String getAssetdocumentname()
			{
				return this.assetdocumentname;
			}
			
		/**
		 * @param assetdocumentname
		 *            the assetdocumentname to set
		 */
		public void setAssetdocumentname(final String assetdocumentname)
			{
				this.assetdocumentname = assetdocumentname;
			}
			
		public String getAssetType()
			{
				return this.assetType;
			}
			
		public void setAssetType(final String assetType)
			{
				this.assetType = assetType;
			}
			
		/**
		 * @return the message
		 */
		public String getMessage()
			{
				return this.message;
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
		 * @return the wherecond
		 */
		// endregion
		
	}
