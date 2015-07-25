
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
		private String documentCode;
		private String documentName;
		private String assetType;
		private String status;

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
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.setAssetDocMaster(assetDocMaster);
				if (this.pageNumber == 0)
					{
						this.pageNumber = 1;
					}

			}

		/**
		 * @throws Exception
		 */
		/*
		 * public AssetDocAction(AssetDocMasterService assetDocMasterService) {
		 * this.assetDocMasterService = assetDocMasterService; // TODO
		 * Auto-generated constructor stub }
		 */

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

		/**
		 *
		 */

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

		private void Paging(final int islast) throws Exception
			{
				try
					{

						this.lstAssetDocMasters = this.assetDocMasterService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
						this.pageNumber = this.assetDocMasterService.getCurrentpage();
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
				this.assetDocMaster = new AssetDocMaster();
				try
					{
						this.assetDocMaster = this.assetDocMasterService.View(this.id);
						this.documentCode = this.assetDocMaster.getDocumentCode();
						this.documentName = this.assetDocMaster.getDocumentName();
						this.assetType = this.assetDocMaster.getAssetType();
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
						final AssetDocMaster assetDocMaster = new AssetDocMaster();
						assetDocMaster.setDocumentCode(this.documentCode);
						assetDocMaster.setDocumentName(this.documentName);
						assetDocMaster.setPartner(this.partner);

						this.assetDocMasterService.SaveAdd(assetDocMaster);
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
				try
					{
						this.status = "";
						final AssetDocMaster assetDocMaster = new AssetDocMaster();
						assetDocMaster.setId(this.getId());
						assetDocMaster.setDocumentCode(this.documentCode);
						assetDocMaster.setDocumentName(this.documentName);
						assetDocMaster.setPartner(this.partner);
						assetDocMaster.setUsrUpd(this.usrUpd);
						this.assetDocMasterService.SaveEdit(assetDocMaster);
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
				try
					{
						this.status = "";
						final AssetDocMaster assetDocMaster = new AssetDocMaster();
						assetDocMaster.setId(this.getId());

						this.assetDocMasterService.SaveDel(assetDocMaster);
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

		public String getStatus()
			{
				return this.status;
			}

		public void setStatus(final String status)
			{
				this.status = status;
			}

		public String getDocumentCode()
			{
				return this.documentCode;
			}

		public void setDocumentCode(final String documentCode)
			{
				this.documentCode = documentCode;
			}

		public String getDocumentName()
			{
				return this.documentName;
			}

		public void setDocumentName(final String documentName)
			{
				this.documentName = documentName;
			}

		/**
		 * @return the wherecond
		 */

		/**
		 * @param searchBy
		 *            the searchBy to set
		 */

	}
