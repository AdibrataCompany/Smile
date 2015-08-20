
package com.adibrata.smartdealer.action.setting.assetdoc;

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
		
		private AssetDocMasterService assetdocmasterservice;
		private AssetDocMaster assetdocmaster;
		private Partner partner;
		private Office office;
		private List<AssetDocMaster> lstassetdocmasters;
		private String searchcriteria;
		private String searchvalue;
		private Long id;
		
		private int pageNumber;
		private String message;
		
		private String documentcode;
		private String documentname;
		private String assettype;
		private Short isactive;
		private String status;
		private String lbltest;
		
		/**
		 * @throws Exception
		 */
		public AssetDocAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.office = new Office();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.office.setId(BaseAction.sesOfficeId());
				
				this.assetdocmasterservice = new AssetDocMasterDao();
				this.assetdocmaster = new AssetDocMaster();
				
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
											strMode = this.ViewData();
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
											this.Paging();
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
						this.lstassetdocmasters = this.assetdocmasterservice.Paging(this.getPageNumber(), this.WhereCond(), "");
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
						
						this.lstassetdocmasters = this.assetdocmasterservice.Paging(this.getPageNumber(), this.WhereCond(), "", true);
						this.pageNumber = this.assetdocmasterservice.getCurrentpage();
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
				this.assetdocmaster = new AssetDocMaster();
				try
					{
						if (this.getId() != null)
							{
								this.assetdocmaster = this.assetdocmasterservice.View(this.id);
								this.partner = this.assetdocmaster.getPartner();
								this.documentcode = this.assetdocmaster.getDocumentCode();
								this.documentname = this.assetdocmaster.getDocumentName();
								this.assettype = this.assetdocmaster.getAssetType();
							}
						else
							{
								this.Paging();
								this.mode = "start";
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
			
		private String SaveDelete() throws Exception
			{
				try
					{
						
						if (this.getId() != null)
							{
								final AssetDocMaster assetDocMaster = new AssetDocMaster();
								
								assetDocMaster.setId(this.getId());
								
								this.assetdocmasterservice.SaveDel(assetDocMaster);
								this.setMessage(BaseAction.SuccessMessage());
							}
						else
							{
								this.mode = "start";
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
											strMode = ERROR;
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
											strMode = ERROR;
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
								strMode = ERROR;
								e.printStackTrace();
							}
					}
				return strMode;
			}
			
		private String SaveAdd() throws Exception
			{
				try
					{
						final AssetDocMaster assetDocMaster = new AssetDocMaster();
						assetDocMaster.setDocumentCode(this.getDocumentcode());
						assetDocMaster.setDocumentName(this.getDocumentname());
						assetDocMaster.setAssetType(this.getAssettype());
						assetDocMaster.setPartner(this.getPartner());
						assetDocMaster.setUsrUpd(BaseAction.sesLoginName());
						
						this.assetdocmasterservice.SaveAdd(assetDocMaster);
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
						final AssetDocMaster assetDocMaster = new AssetDocMaster();
						assetDocMaster.setId(this.getId());
						assetDocMaster.setDocumentCode(this.getDocumentcode());
						assetDocMaster.setDocumentName(this.getDocumentname());
						assetDocMaster.setAssetType(this.getAssettype());
						assetDocMaster.setPartner(this.getPartner());
						assetDocMaster.setUsrUpd(BaseAction.sesLoginName());
						
						this.assetdocmasterservice.SaveEdit(assetDocMaster);
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
			
		// @Override
		// public void validate()
		// {
		// if (this.getDocumentCode().length() == 0)
		// {
		// this.addFieldError("documentCode", "Document Code id Required");
		// }
		// if (this.getDocumentName().length() == 0)
		// {
		// this.addFieldError("documentName", "Document Name id Required");
		// }
		// if (this.getAssetType().length() == 0)
		// {
		// this.addFieldError("this.assetType", "Asset Type is required");
		// }
		// }
		
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
		 * @return the documentCode
		 */

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
			
		public Long getId()
			{
				return this.id;
			}
			
		public void setId(final Long id)
			{
				this.id = id;
			}
			
		public String getLbltest()
			{
				return this.lbltest;
			}
			
		public void setLbltest(final String lbltest)
			{
				this.lbltest = lbltest;
			}
			
		public String getDocumentcode()
			{
				return this.documentcode;
			}
			
		public void setDocumentcode(final String documentcode)
			{
				this.documentcode = documentcode;
			}
			
		public String getDocumentname()
			{
				return this.documentname;
			}
			
		public void setDocumentname(final String documentname)
			{
				this.documentname = documentname;
			}
			
		public String getAssettype()
			{
				return this.assettype;
			}
			
		public void setAssettype(final String assettype)
			{
				this.assettype = assettype;
			}
			
		public Short getIsactive()
			{
				return this.isactive;
			}
			
		public void setIsactive(final Short isactive)
			{
				this.isactive = isactive;
			}
			
		public AssetDocMasterService getAssetdocmasterservice()
			{
				return this.assetdocmasterservice;
			}
			
		public void setAssetdocmasterservice(final AssetDocMasterService assetdocmasterservice)
			{
				this.assetdocmasterservice = assetdocmasterservice;
			}
			
		public AssetDocMaster getAssetdocmaster()
			{
				return this.assetdocmaster;
			}
			
		public void setAssetdocmaster(final AssetDocMaster assetdocmaster)
			{
				this.assetdocmaster = assetdocmaster;
			}
			
		public List<AssetDocMaster> getLstassetdocmasters()
			{
				return this.lstassetdocmasters;
			}
			
		public void setLstassetdocmasters(final List<AssetDocMaster> lstassetdocmasters)
			{
				this.lstassetdocmasters = lstassetdocmasters;
			}
			
	}
