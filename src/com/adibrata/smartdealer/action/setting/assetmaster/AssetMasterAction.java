
package com.adibrata.smartdealer.action.setting.assetmaster;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.AssetMasterDao;
import com.adibrata.smartdealer.dao.setting.AssetTypeMasterDao;
import com.adibrata.smartdealer.model.AssetMaster;
import com.adibrata.smartdealer.model.AssetType;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.AssetMasterService;
import com.adibrata.smartdealer.service.setting.AssetTypeService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AssetMasterAction extends BaseAction implements Preparable, SessionAware
	{
		
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private Map<String, Object> sesassettype;
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
		
		private AssetType assettype;
		private Long assettypeid;
		private String assettypecode;
		private String assettypedescription;
		
		private String brand;
		private String model;
		private String type;
		private String assetcode;
		private Integer assetlevel;
		
		public AssetMasterAction() throws Exception
			{
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
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
			}
			
		@Override
		public String execute() throws Exception
			{

				if (this.mode != null)
					{
						switch (this.mode)
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
											this.mode = this.ViewData();
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
											this.mode = this.SaveDelete();
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
										this.mode = INPUT;
										
										if (this.sesassettype.containsKey("AssetMasterSetting"))
											{
												this.sesassettype.remove("AssetMasterSetting");
											}
										this.sesassettype.put("AssetMasterSetting", this.assettype);
									}
								// else
								// {
								// if (this.sesassettype.containsKey("AssetMasterSetting"))
								// {
								// this.assettype = (AssetType) this.sesassettype.get("AssetMasterSetting");
								// this.assettypeid = this.assettype.getId();
								// this.assettype = new AssetType();
								// this.assettype.setId(this.assettypeid);
								// AssetTypeService assetservice;
								// assetservice = new AssetTypeMasterDao();
								// this.assettype = assetservice.View(this.assettypeid);
								// this.assettypecode = this.assettype.getAssetTypeCode();
								// this.assettypedescription = this.assettype.getDescription();
								// this.mode = INPUT;
								//
								// if (this.sesassettype.containsKey("AssetMasterSetting"))
								// {
								// this.sesassettype.remove("AssetMasterSetting");
								// }
								// this.sesassettype.put("AssetMasterSetting", this.assettype);
								// this.mode = INPUT;
								// }
								// }
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
					}
				return this.mode;
			}
			
		@Override
		public void setSession(final Map<String, Object> session)
			{
				// TODO Auto-generated method stub
				this.sesassettype = session;

			}

		public String save()
			{
				
				if (this.mode != null)
					{
						switch (this.mode)
							{
								case "saveadd" :
									try
										{
											this.mode = this.SaveAdd();
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
											this.mode = this.SaveEdit();
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
								this.mode = INPUT;
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				return this.mode;
			}
			
		private String WhereCond()
			{
				final StringBuilder wherecond = new StringBuilder();
				wherecond.append(" partnercode = '" + BaseAction.sesPartnerCode() + "' ");
				if (this.assettypeid != null)
					{
						wherecond.append("and assettypeid = ");
						wherecond.append(this.assettypeid);
						wherecond.append(" and isactive = 1 ");
					}
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

						this.assetmasterservice = new AssetMasterDao();

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
						this.assetmasterservice = new AssetMasterDao();
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
								this.assetmasterservice = new AssetMasterDao();
								this.assetmaster = this.assetmasterservice.View(this.getId());
								this.partner = this.assetmaster.getPartner();
								this.brand = this.assetmaster.getBrand();
								this.type = this.assetmaster.getType();
								this.model = this.assetmaster.getModel();
								
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
						this.assettype = new AssetType();
						this.assettype.setId(this.assettypeid);

						this.assetmaster.setPartner(this.getPartner());
						this.assetmaster.setAssetType(this.assettype);

						this.assetmaster.setBrand(this.getBrand());
						this.assetmaster.setType(this.getType());
						this.assetmaster.setModel(this.getModel());
						this.assetmaster.setPartner(this.getPartner());
						this.assetmaster.setIsActive((short) (this.isIsactive() ? 1 : 0));
						this.assetmaster.setUsrCrt(BaseAction.sesLoginName());
						this.assetmaster.setUsrUpd(BaseAction.sesLoginName());
						this.assetmasterservice = new AssetMasterDao();
						this.assetmasterservice.SaveAdd(this.assetmaster);
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
						this.assetmasterservice = new AssetMasterDao();
						// this.assetmaster = this.assetmasterservice.View(this.getId());
						this.assetmaster = new AssetMaster();
						this.assetmaster.setPartner(this.getPartner());
						
						this.assettype.setId(this.assettypeid);
						
						this.assetmaster.setId(this.getId());
						this.assetmaster.setAssetType(this.assettype);
						this.assetmaster.setBrand(this.getBrand());
						this.assetmaster.setType(this.getType());
						this.assetmaster.setModel(this.getModel());
						this.assetmaster.setIsActive((short) (this.isIsactive() ? 1 : 0));
						
						this.assetmaster.setUsrUpd(BaseAction.sesLoginName());
						this.assetmasterservice.SaveEdit(this.assetmaster);

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
			
		private String SaveDelete() throws Exception
			{
				try
					{
						if (this.getId() != null)
							{
								this.assetmaster = new AssetMaster();
								
								this.assetmaster.setId(this.getId());
								this.assetmasterservice = new AssetMasterDao();
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
		 * @return the sesassettype
		 */
		public Map<String, Object> getSesassettype()
			{
				return this.sesassettype;
			}
			
		/**
		 * @param sesassettype
		 *            the sesassettype to set
		 */
		public void setSesassettype(final Map<String, Object> sesassettype)
			{
				this.sesassettype = sesassettype;
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
		 * @return the assetmasterservice
		 */
		public AssetMasterService getAssetmasterservice()
			{
				return this.assetmasterservice;
			}
			
		/**
		 * @param assetmasterservice
		 *            the assetmasterservice to set
		 */
		public void setAssetmasterservice(final AssetMasterService assetmasterservice)
			{
				this.assetmasterservice = assetmasterservice;
			}
			
		/**
		 * @return the assetmaster
		 */
		public AssetMaster getAssetmaster()
			{
				return this.assetmaster;
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
		 * @return the lstassetmaster
		 */
		public List<AssetMaster> getLstassetmaster()
			{
				return this.lstassetmaster;
			}
			
		/**
		 * @param lstassetmaster
		 *            the lstassetmaster to set
		 */
		public void setLstassetmaster(final List<AssetMaster> lstassetmaster)
			{
				this.lstassetmaster = lstassetmaster;
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
		 * @return the pagenumber
		 */
		public int getPagenumber()
			{
				return this.pagenumber;
			}
			
		/**
		 * @param pagenumber
		 *            the pagenumber to set
		 */
		public void setPagenumber(final int pagenumber)
			{
				this.pagenumber = pagenumber;
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
		 * @return the isactive
		 */
		public boolean isIsactive()
			{
				return this.isactive;
			}
			
		/**
		 * @param isactive
		 *            the isactive to set
		 */
		public void setIsactive(final boolean isactive)
			{
				this.isactive = isactive;
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
			
		/**
		 * @return the brand
		 */
		public String getBrand()
			{
				return this.brand;
			}
			
		/**
		 * @param brand
		 *            the brand to set
		 */
		public void setBrand(final String brand)
			{
				this.brand = brand;
			}
			
		/**
		 * @return the model
		 */
		public String getModel()
			{
				return this.model;
			}
			
		/**
		 * @param model
		 *            the model to set
		 */
		public void setModel(final String model)
			{
				this.model = model;
			}
			
		/**
		 * @return the type
		 */
		public String getType()
			{
				return this.type;
			}
			
		/**
		 * @param type
		 *            the type to set
		 */
		public void setType(final String type)
			{
				this.type = type;
			}
			
		/**
		 * @return the assetcode
		 */
		public String getAssetcode()
			{
				return this.assetcode;
			}
			
		/**
		 * @param assetcode
		 *            the assetcode to set
		 */
		public void setAssetcode(final String assetcode)
			{
				this.assetcode = assetcode;
			}
			
		/**
		 * @return the assetlevel
		 */
		public Integer getAssetlevel()
			{
				return this.assetlevel;
			}
			
		/**
		 * @param assetlevel
		 *            the assetlevel to set
		 */
		public void setAssetlevel(final Integer assetlevel)
			{
				this.assetlevel = assetlevel;
			}
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

	}
