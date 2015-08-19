
package com.adibrata.smartdealer.action.setting.assetmaster;

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
		private Long id;

		private boolean isactive;
		private String assettype;
		private String assetbrand;
		private String assetmodel;
		private String assetcode;
		private Integer assetlevel;

		public AssetMasterAction() throws Exception
			{
				final AssetMasterService assetmasterservice = new AssetMasterDao();

				this.assetMasterService = assetmasterservice;
				final AssetMaster assetMaster = new AssetMaster();

				final Partner partner = new Partner();
				final Office office = new Office();
				partner.setPartnerCode(BaseAction.sesPartnerCode());
				office.setId(BaseAction.sesOfficeId());

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
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
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
								e.printStackTrace();
							}
					}
				return strMode;
			}

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
						this.pageNumber = this.assetMasterService.getCurrentpage();
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
				this.assetmaster = new AssetMaster();
				try
					{
						if (this.getId() != null)
							{
								this.assetmaster = this.assetMasterService.View(this.getId());
								this.partner = this.assetmaster.getPartner();
								this.assetbrand = this.assetmaster.getAssetBrand();
								this.assettype = this.assetmaster.getAssetType();
								this.assetmodel = this.assetmaster.getAssetModel();
								this.isactive = this.assetmaster.getIsActive() > 0 ? true : false;
							}
						else
							{
								this.Paging();
								this.status = "start";
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

		private String SaveAdd() throws Exception
			{
				try
					{
						final AssetMaster assetMaster = new AssetMaster();
						assetMaster.setAssetBrand(this.getAssetbrand());
						assetMaster.setAssetType(this.getAssettype());
						assetMaster.setAssetModel(this.getAssetmodel());
						assetMaster.setPartner(this.getPartner());
						assetMaster.setIsActive((short) (this.isIsactive() ? 1 : 0));
						this.assetMasterService.SaveAdd(assetMaster);
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
						final AssetMaster assetMaster = new AssetMaster();
						assetMaster.setId(this.getId());
						assetMaster.setAssetBrand(this.getAssetbrand());
						assetMaster.setAssetType(this.getAssettype());
						assetMaster.setAssetModel(this.getAssetmodel());
						assetMaster.setIsActive((short) (this.isIsactive() ? 1 : 0));
						assetMaster.setPartner(this.getPartner());
						assetMaster.setUsrUpd(this.usrUpd);
						this.assetMasterService.SaveEdit(assetMaster);
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

		private String SaveDelete() throws Exception
			{
				try
					{
						if (this.getId() != null)
							{
								final AssetMaster assetMaster = new AssetMaster();

								assetMaster.setId(this.getId());
								this.assetMasterService.SaveDel(assetMaster);
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
		public Long getId()
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

		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final Long id)
			{
				this.id = id;
			}

		public boolean isIsactive()
			{
				return this.isactive;
			}

		public void setIsactive(final boolean isactive)
			{
				this.isactive = isactive;
			}

		public String getAssettype()
			{
				return this.assettype;
			}

		public void setAssettype(final String assettype)
			{
				this.assettype = assettype;
			}

		public String getAssetbrand()
			{
				return this.assetbrand;
			}

		public void setAssetbrand(final String assetbrand)
			{
				this.assetbrand = assetbrand;
			}

		public String getAssetmodel()
			{
				return this.assetmodel;
			}

		public void setAssetmodel(final String assetmodel)
			{
				this.assetmodel = assetmodel;
			}

		public String getAssetcode()
			{
				return this.assetcode;
			}

		public void setAssetcode(final String assetcode)
			{
				this.assetcode = assetcode;
			}

		public Integer getAssetlevel()
			{
				return this.assetlevel;
			}

		public void setAssetlevel(final Integer assetlevel)
			{
				this.assetlevel = assetlevel;
			}

	}
