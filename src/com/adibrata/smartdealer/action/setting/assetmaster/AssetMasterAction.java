
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
		private AssetMasterService assetmasterservice;
		private AssetMaster assetmaster;
		private Partner partner;
		private Office office;
		private List<AssetMaster> lstassetmaster;
		private String searchcriteria;
		private String searchvalue;
		private int pagenumber;
		
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
				this.assetmasterservice = new AssetMasterDao();
				this.assetmaster = new AssetMaster();
				
				final Partner partner = new Partner();
				final Office office = new Office();
				partner.setPartnerCode(BaseAction.sesPartnerCode());
				office.setId(BaseAction.sesOfficeId());
				if (this.pagenumber == 0)
					{
						this.pagenumber = 1;
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
									this.pagenumber = 1;
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
									this.pagenumber -= 1;
									if (this.pagenumber <= 1)
										{
											this.pagenumber = 1;
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
									this.pagenumber += 1;
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
						this.pagenumber = 1;
						
						strMode = INPUT;
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
						this.lstassetmaster = this.assetmasterservice.Paging(this.getPagenumber(), this.WhereCond(), "");
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
						this.lstassetmaster = this.assetmasterservice.Paging(this.getPagenumber(), this.WhereCond(), "", true);
						this.pagenumber = this.assetmasterservice.getCurrentpage();
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
								this.assetmaster = this.assetmasterservice.View(this.getId());
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
						this.assetmaster = new AssetMaster();
						this.assetmaster.setPartner(this.getPartner());
						this.assetmaster.setAssetBrand(this.getAssetbrand());
						this.assetmaster.setAssetType(this.getAssettype());
						this.assetmaster.setAssetModel(this.getAssetmodel());
						this.assetmaster.setPartner(this.getPartner());
						this.assetmaster.setIsActive((short) (this.isIsactive() ? 1 : 0));
						this.assetmaster.setUsrCrt(BaseAction.sesLoginName());
						this.assetmaster.setUsrUpd(BaseAction.sesLoginName());
						this.assetmasterservice.SaveAdd(this.assetmaster);
						this.setMessage(BaseAction.SuccessMessage());
						this.mode = "SUCCESS";
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
						this.assetmaster = new AssetMaster();
						this.assetmaster.setPartner(this.getPartner());
						this.assetmaster.setId(this.getId());
						this.assetmaster.setAssetBrand(this.getAssetbrand());
						this.assetmaster.setAssetType(this.getAssettype());
						this.assetmaster.setAssetModel(this.getAssetmodel());
						this.assetmaster.setIsActive((short) (this.isIsactive() ? 1 : 0));
						
						this.assetmaster.setUsrUpd(BaseAction.sesLoginName());
						this.assetmasterservice.SaveEdit(this.assetmaster);
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
								this.assetmaster = new AssetMaster();
								
								this.assetmaster.setId(this.getId());
								this.assetmasterservice.SaveDel(this.assetmaster);
								this.setMessage(BaseAction.SuccessMessage());
								this.mode = SUCCESS;
							}
						else
							{
								this.mode = "input";
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
			
		public AssetMasterService getAssetmasterservice()
			{
				return this.assetmasterservice;
			}
			
		public void setAssetmasterservice(final AssetMasterService assetmasterservice)
			{
				this.assetmasterservice = assetmasterservice;
			}
			
		public List<AssetMaster> getLstassetmaster()
			{
				return this.lstassetmaster;
			}
			
		public void setLstassetmaster(final List<AssetMaster> lstassetmaster)
			{
				this.lstassetmaster = lstassetmaster;
			}
			
		public int getPagenumber()
			{
				return this.pagenumber;
			}
			
		public void setPagenumber(final int pagenumber)
			{
				this.pagenumber = pagenumber;
			}
			
	}
