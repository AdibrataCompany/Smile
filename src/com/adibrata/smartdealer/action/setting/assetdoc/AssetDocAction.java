
package com.adibrata.smartdealer.action.setting.assetdoc;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.AssetDocMasterDao;
import com.adibrata.smartdealer.dao.setting.AssetTypeMasterDao;
import com.adibrata.smartdealer.model.AssetDocMaster;
import com.adibrata.smartdealer.model.AssetType;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.AssetDocMasterService;
import com.adibrata.smartdealer.service.setting.AssetTypeService;
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
		private AssetType assettype;
		private int pageNumber;
		private String message;

		private String documentcode;
		private String documentname;
		private Long assettypeid;
		private String assettypecode;
		private Short isactive;
		private String status;
		private String lbltest;
		private String assettypedescription;
		
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
								if (this.assettypeid != null)
									{
										this.assettype = new AssetType();
										this.assettype.setId(this.assettypeid);
										AssetTypeService assetservice;
										assetservice = new AssetTypeMasterDao();
										this.assettype = assetservice.View(this.assettypeid);
										this.assettypecode = this.assettype.getAssetTypeCode();
										this.assettypedescription = this.assettype.getDescription();
									}
								else
									{
										strMode = "end";
									}
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

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
						this.assetdocmasterservice = new AssetDocMasterDao();

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
						this.assetdocmasterservice = new AssetDocMasterDao();

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
								this.assetdocmasterservice = new AssetDocMasterDao();

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
								this.assetdocmasterservice = new AssetDocMasterDao();

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
						this.assetdocmaster = new AssetDocMaster();
						
						this.assetdocmaster.setDocumentCode(this.getDocumentcode());
						this.assetdocmaster.setDocumentName(this.getDocumentname());
						this.assetdocmaster.setAssetType(this.getAssettype());
						this.assetdocmaster.setPartner(this.getPartner());
						this.assetdocmaster.setUsrUpd(BaseAction.sesLoginName());
						this.assetdocmasterservice = new AssetDocMasterDao();

						this.assetdocmasterservice.SaveAdd(this.assetdocmaster);
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

		private String SaveEdit() throws Exception
			{
				try
					{
						this.assetdocmaster = new AssetDocMaster();
						this.assetdocmaster.setId(this.getId());
						this.assetdocmaster.setDocumentCode(this.getDocumentcode());
						this.assetdocmaster.setDocumentName(this.getDocumentname());
						this.assetdocmaster.setAssetType(this.getAssettype());
						this.assetdocmaster.setPartner(this.getPartner());
						this.assetdocmaster.setUsrUpd(BaseAction.sesLoginName());
						this.assetdocmasterservice = new AssetDocMasterDao();

						this.assetdocmasterservice.SaveEdit(this.assetdocmaster);
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
		 * @return the assetdocmasterservice
		 */
		public AssetDocMasterService getAssetdocmasterservice()
			{
				return this.assetdocmasterservice;
			}

		/**
		 * @param assetdocmasterservice
		 *            the assetdocmasterservice to set
		 */
		public void setAssetdocmasterservice(final AssetDocMasterService assetdocmasterservice)
			{
				this.assetdocmasterservice = assetdocmasterservice;
			}

		/**
		 * @return the assetdocmaster
		 */
		public AssetDocMaster getAssetdocmaster()
			{
				return this.assetdocmaster;
			}

		/**
		 * @param assetdocmaster
		 *            the assetdocmaster to set
		 */
		public void setAssetdocmaster(final AssetDocMaster assetdocmaster)
			{
				this.assetdocmaster = assetdocmaster;
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
		 * @return the lstassetdocmasters
		 */
		public List<AssetDocMaster> getLstassetdocmasters()
			{
				return this.lstassetdocmasters;
			}

		/**
		 * @param lstassetdocmasters
		 *            the lstassetdocmasters to set
		 */
		public void setLstassetdocmasters(final List<AssetDocMaster> lstassetdocmasters)
			{
				this.lstassetdocmasters = lstassetdocmasters;
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
		 * @return the documentcode
		 */
		public String getDocumentcode()
			{
				return this.documentcode;
			}

		/**
		 * @param documentcode
		 *            the documentcode to set
		 */
		public void setDocumentcode(final String documentcode)
			{
				this.documentcode = documentcode;
			}

		/**
		 * @return the documentname
		 */
		public String getDocumentname()
			{
				return this.documentname;
			}

		/**
		 * @param documentname
		 *            the documentname to set
		 */
		public void setDocumentname(final String documentname)
			{
				this.documentname = documentname;
			}

		/**
		 * @return the assettypeid
		 */
		public Long getAssettypeid()
			{
				return this.assettypeid;
			}

		/**
		 * @param assettypeid
		 *            the assettypeid to set
		 */
		public void setAssettypeid(final Long assettypeid)
			{
				this.assettypeid = assettypeid;
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
		 * @return the isactive
		 */
		public Short getIsactive()
			{
				return this.isactive;
			}

		/**
		 * @param isactive
		 *            the isactive to set
		 */
		public void setIsactive(final Short isactive)
			{
				this.isactive = isactive;
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
		 * @return the lbltest
		 */
		public String getLbltest()
			{
				return this.lbltest;
			}

		/**
		 * @param lbltest
		 *            the lbltest to set
		 */
		public void setLbltest(final String lbltest)
			{
				this.lbltest = lbltest;
			}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

			}
			
		/**
		 * @return the assettypedescription
		 */
		public String getAssettypedescription()
			{
				return this.assettypedescription;
			}
			
		/**
		 * @param assettypedescription
		 *            the assettypedescription to set
		 */
		public void setAssettypedescription(final String assettypedescription)
			{
				this.assettypedescription = assettypedescription;
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
