
package com.adibrata.smartdealer.action.setting.assettype;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.AssetTypeMasterDao;
import com.adibrata.smartdealer.model.AssetType;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.AssetTypeService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AssetTypeAction extends BaseAction implements Preparable
	{
		
		private static final long serialVersionUID = 1L;
		
		private String mode;
		
		private AssetTypeService service;
		private AssetType assettype;
		private Partner partner;
		private Office office;
		private List<AssetType> lstassettype;
		private String searchcriteria;
		private String searchvalue;
		private Long id;

		private int pageNumber;
		private String message;
		
		private String assettypecode;
		private String assertypedescription;

		private Boolean isactive;
		private String status;
		
		/**
		 * @throws Exception
		 */
		public AssetTypeAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.office = new Office();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.office.setId(BaseAction.sesOfficeId());
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
						
						strMode = INPUT;
					}
				return strMode;
			}
			
		/**
		 *
		 */
		
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
						this.service = new AssetTypeMasterDao();
						this.lstassettype = this.service.Paging(this.getPageNumber(), this.WhereCond(), "");
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
						this.service = new AssetTypeMasterDao();
						this.lstassettype = this.service.Paging(this.getPageNumber(), this.WhereCond(), "", true);
						this.pageNumber = this.service.getCurrentpage();
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
				this.assettype = new AssetType();
				try
					{
						if (this.getId() != null)
							{
								this.service = new AssetTypeMasterDao();
								this.assettype = this.service.View(this.id);
								this.partner = this.assettype.getPartner();
								this.assettypecode = this.assettype.getAssetTypeCode();
								this.assertypedescription = this.assettype.getDescription();
								if (this.assettype.getIsActive() == 1)
									{
										this.isactive = true;
									}
								else
									{
										this.isactive = false;
										
									}
							}
						else
							{
								this.Paging();
								this.mode = INPUT;
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
								this.assettype = new AssetType();
								
								this.assettype.setId(this.getId());
								this.service = new AssetTypeMasterDao();
								this.service.SaveDel(this.assettype);
								this.setMessage(BaseAction.SuccessMessage());
							}
						else
							{
								this.mode = INPUT;
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
			
		public String entry()
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
											strMode = this.Save();
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
											strMode = this.Save();
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
			
		private String Save() throws Exception
			{
				try
					{
						this.assettype = new AssetType();
						if (this.mode.equals("saveedit"))
							{
								this.assettype.setId(this.getId());
							}
						this.assettype.setAssetTypeCode(this.assettypecode);
						this.assettype.setDescription(this.assertypedescription);
						if (this.isactive)
							{
								this.assettype.setIsActive((short) 1);
							}
						else
							{
								this.assettype.setIsActive((short) 0);
							}
							
						this.assettype.setPartner(this.getPartner());
						this.assettype.setUsrUpd(BaseAction.sesLoginName());
						this.assettype.setUsrCrt(BaseAction.sesLoginName());
						this.service = new AssetTypeMasterDao();
						this.service.Save(this.assettype);
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

		/**
		 * @return the mode
		 */
		public String getMode()
			{
				return this.mode;
			}
			
		/**
		 * @param mode
		 *            the mode to set
		 */
		public void setMode(final String mode)
			{
				this.mode = mode;
			}
			
		/**
		 * @return the service
		 */
		public AssetTypeService getService()
			{
				return this.service;
			}
			
		/**
		 * @param service
		 *            the service to set
		 */
		public void setService(final AssetTypeService service)
			{
				this.service = service;
			}
			
		/**
		 * @return the assettype
		 */
		public AssetType getAssettype()
			{
				return this.assettype;
			}
			
		/**
		 * @param assettype
		 *            the assettype to set
		 */
		public void setAssettype(final AssetType assettype)
			{
				this.assettype = assettype;
			}
			
		/**
		 * @return the partner
		 */
		public Partner getPartner()
			{
				return this.partner;
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
		 * @return the office
		 */
		public Office getOffice()
			{
				return this.office;
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
		 * @return the lstassettype
		 */
		public List<AssetType> getLstassettype()
			{
				return this.lstassettype;
			}
			
		/**
		 * @param lstassettype
		 *            the lstassettype to set
		 */
		public void setLstassettype(final List<AssetType> lstassettype)
			{
				this.lstassettype = lstassettype;
			}
			
		/**
		 * @return the searchcriteria
		 */
		public String getSearchcriteria()
			{
				return this.searchcriteria;
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
		 * @return the searchvalue
		 */
		public String getSearchvalue()
			{
				return this.searchvalue;
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
			
		/**
		 * @return the pageNumber
		 */
		public int getPageNumber()
			{
				return this.pageNumber;
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
		 * @return the assettypecode
		 */
		public String getAssettypecode()
			{
				return this.assettypecode;
			}
			
		/**
		 * @param assettypecode
		 *            the assettypecode to set
		 */
		public void setAssettypecode(final String assettypecode)
			{
				this.assettypecode = assettypecode;
			}
			
		/**
		 * @return the assertypedescription
		 */
		public String getAssertypedescription()
			{
				return this.assertypedescription;
			}
			
		/**
		 * @param assertypedescription
		 *            the assertypedescription to set
		 */
		public void setAssertypedescription(final String assertypedescription)
			{
				this.assertypedescription = assertypedescription;
			}
			
		/**
		 * @return the status
		 */
		public String getStatus()
			{
				return this.status;
			}
			
		/**
		 * @param status
		 *            the status to set
		 */
		public void setStatus(final String status)
			{
				this.status = status;
			}
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
		/**
		 * @return the isactive
		 */
		public Boolean getIsactive()
			{
				return this.isactive;
			}
			
		/**
		 * @param isactive
		 *            the isactive to set
		 */
		public void setIsactive(final Boolean isactive)
			{
				this.isactive = isactive;
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
		
	}
