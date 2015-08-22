
package com.adibrata.smartdealer.action.setting.master;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.MasterDao;
import com.adibrata.smartdealer.model.MasterType;
import com.adibrata.smartdealer.model.MsTable;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.MasterService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class MasterAction extends BaseAction implements Preparable
	{
		
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		
		private String mode;
		private MsTable mstable;
		private final MasterService masterservice;
		
		private Partner partner;
		private Office office;
		
		private Map<String, String> lstmastertype;
		private List<MsTable> lstmstable;
		private String searchcriteria;
		private String searchvalue;
		private int pagenumber;
		private String usrupd;
		private String usrcrt;
		private String message;
		private Long id;
		
		private String mastercode;
		private String mastervalue;
		private String mastertypecode;
		private Integer isactive;
		
		public MasterAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				
				this.office = new Office();
				this.setOffice(this.office);
				
				this.masterservice = new MasterDao();
				this.mstable = new MsTable();
				
				if (this.pagenumber == 0)
					{
						this.pagenumber = 1;
					}
			}
			
		@Override
		public void prepare() throws Exception
			{
			
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
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "first" :
									try
										{
											this.pagenumber = 1;
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
									try
										{
											if (this.pagenumber <= 1)
												{
													this.pagenumber = 1;
												}
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

						strMode = "input";
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
				String wherecond = " mastertypecode = '" + this.getMastertypecode() + "' ";
				
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
						this.ListMasterType();
						this.lstmstable = this.masterservice.Paging(this.getPagenumber(), this.WhereCond(), "");
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
						this.ListMasterType();
						this.lstmstable = this.masterservice.Paging(this.getPagenumber(), this.WhereCond(), "", true);
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
				this.mstable = new MsTable();
				try
					{
						if (this.getId() != null)
							{
								this.mstable = this.masterservice.View(this.getId());
								this.partner = this.mstable.getPartner();
								this.mastercode = this.mstable.getMasterCode();
								this.mastervalue = this.mstable.getMasterValue();
								this.mastertypecode = this.mstable.getMasterTypeCode();
							}
						else
							{
								this.Paging();
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
			
		private String SaveAdd() throws Exception
			{
				try
					{
						this.mstable = new MsTable();
						
						this.mstable.setMasterCode(this.getMastercode());
						this.mstable.setMasterValue(this.getMastervalue());
						
						this.mstable.setUsrUpd(this.getUsrupd());
						this.mstable.setMasterTypeCode(this.getMastertypecode());
						this.mstable.setPartner(this.getPartner());
						
						this.masterservice.SaveAdd(this.mstable);
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
						this.mstable = new MsTable();
						this.mstable.setId(this.getId());
						this.mstable.setMasterCode(this.getMastercode());
						this.mstable.setMasterValue(this.getMastervalue());
						
						this.mstable.setUsrUpd(BaseAction.sesLoginName());
						this.mstable.setMasterTypeCode(this.getMastertypecode());
						this.mstable.setPartner(this.getPartner());
						
						this.masterservice.SaveAdd(this.mstable);
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
				
				this.mstable = new MsTable();
				try
					{
						if (this.getId() != null)
							{
								
								this.mstable.setId(this.getId());
								this.masterservice.SaveDel(this.mstable);
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
						this.mode = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.mode;
			}
			
		private void ListMasterType() throws Exception
			{
				try
					{
						final List<MasterType> lst = this.masterservice.ListMasterType();
						
						this.lstmastertype = new HashMap<String, String>();
						for (final MasterType row : lst)
							{
								this.lstmastertype.put(row.getMasterTypeCode(), row.getMasterTypeCode().trim());
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
		 * @return the mastercode
		 */
		public String getMastercode()
			{
				return this.mastercode;
			}
			
		/**
		 * @param mastercode
		 *            the mastercode to set
		 */
		public void setMastercode(final String mastercode)
			{
				this.mastercode = mastercode;
			}
			
		/**
		 * @return the mastervalue
		 */
		public String getMastervalue()
			{
				return this.mastervalue;
			}
			
		/**
		 * @param mastervalue
		 *            the mastervalue to set
		 */
		public void setMastervalue(final String mastervalue)
			{
				this.mastervalue = mastervalue;
			}
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
		/**
		 * @return the mastertypecode
		 */
		public String getMastertypecode()
			{
				return this.mastertypecode;
			}
			
		/**
		 * @param mastertypecode
		 *            the mastertypecode to set
		 */
		public void setMastertypecode(final String mastertypecode)
			{
				this.mastertypecode = mastertypecode;
			}
			
		public MsTable getMstable()
			{
				return this.mstable;
			}
			
		public void setMstable(final MsTable mstable)
			{
				this.mstable = mstable;
			}
			
		public Map<String, String> getLstmastertype()
			{
				return this.lstmastertype;
			}
			
		public void setLstmastertype(final Map<String, String> lstmastertype)
			{
				this.lstmastertype = lstmastertype;
			}
			
		public List<MsTable> getLstmstable()
			{
				return this.lstmstable;
			}
			
		public void setLstmstable(final List<MsTable> lstmstable)
			{
				this.lstmstable = lstmstable;
			}
			
		public int getPagenumber()
			{
				return this.pagenumber;
			}
			
		public void setPagenumber(final int pagenumber)
			{
				this.pagenumber = pagenumber;
			}
			
		public String getUsrupd()
			{
				return this.usrupd;
			}
			
		public void setUsrupd(final String usrupd)
			{
				this.usrupd = usrupd;
			}
			
		public String getUsrcrt()
			{
				return this.usrcrt;
			}
			
		public void setUsrcrt(final String usrcrt)
			{
				this.usrcrt = usrcrt;
			}
			
		public Integer getIsactive()
			{
				return this.isactive;
			}
			
		public void setIsactive(final Integer isactive)
			{
				this.isactive = isactive;
			}
			
		public MasterService getMasterservice()
			{
				return this.masterservice;
			}
			
	}
