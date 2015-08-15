
package com.adibrata.smartdealer.action.setting;

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
		private MsTable msTable;
		private final MasterService masterService;

		private Partner partner;
		private Office office;
		
		private Map<String, String> lstMasterType;
		private List<MsTable> lstMsTable;
		private String searchcriteria;
		private String searchvalue;
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private String message;
		private Long id;
		
		private String mastercode;
		private String mastervalue;
		private String mastertypecode;
		private Integer isActive;
		
		public MasterAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				
				this.office = new Office();
				this.setOffice(this.office);

				this.masterService = new MasterDao();
				this.msTable = new MsTable();

				if (this.pageNumber == 0)
					{
						this.pageNumber = 1;
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
									this.Paging();
									break;
								case "edit" :
									this.ViewData();
									break;
								case "savedel" :
									strMode = this.SaveDelete();
									break;
								case "saveadd" :
									strMode = this.SaveAdd();
									break;
								case "saveedit" :
									strMode = this.SaveEdit();
									break;
								case "first" :
									this.pageNumber = 1;
									this.Paging();
									break;
								case "prev" :
									this.pageNumber -= 1;
									if (this.pageNumber <= 1)
										{
											this.pageNumber = 1;
										}
									this.Paging();
									break;
								case "next" :
									this.pageNumber += 1;
									this.Paging();
									break;
								case "last" :
									this.Paging(1);
									break;
								default :
									break;
							}
					}
				else
					{
						this.pageNumber = 1;
						this.Paging();

						strMode = "start";
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
						this.lstMsTable = this.masterService.Paging(this.getPageNumber(), this.WhereCond(), "");
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
						this.lstMsTable = this.masterService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
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
				this.msTable = new MsTable();
				try
					{
						if (this.getId() != null)
							{
								this.msTable = this.masterService.View(this.getId());
								this.partner = this.msTable.getPartner();
								this.mastercode = this.msTable.getMasterCode();
								this.mastervalue = this.msTable.getMasterValue();
								this.mastertypecode = this.msTable.getMasterTypeCode();
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
			
		private String SaveAdd() throws Exception
			{
				String status = "";
				try
					{
						final MsTable MsTable = new MsTable();
						
						MsTable.setMasterCode(this.getMastercode());
						MsTable.setMasterValue(this.getMastervalue());
						
						MsTable.setUsrUpd(this.getUsrUpd());
						MsTable.setMasterTypeCode(this.getMastertypecode());
						MsTable.setPartner(this.getPartner());
						
						this.masterService.SaveAdd(MsTable);
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
						final MsTable MsTable = new MsTable();
						MsTable.setId(this.getId());
						MsTable.setMasterCode(this.getMastercode());
						MsTable.setMasterValue(this.getMastervalue());
						
						MsTable.setUsrUpd(this.getUsrUpd());
						MsTable.setMasterTypeCode(this.getMastertypecode());
						MsTable.setPartner(this.getPartner());
						
						this.masterService.SaveAdd(MsTable);
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
						final MsTable MsTable = new MsTable();
						MsTable.setId(this.getId());
						
						this.masterService.SaveDel(MsTable);
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
			
		private void ListMasterType() throws Exception
			{
				try
					{
						final List<MasterType> lst = this.masterService.ListMasterType();
						
						this.lstMasterType = new HashMap<String, String>();
						for (final MasterType row : lst)
							{
								this.lstMasterType.put(row.getMasterTypeCode(), row.getMasterTypeCode().trim());
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
		 * @return the lstMsTable
		 */
		public List<MsTable> getLstMsTable()
			{
				return this.lstMsTable;
			}
			
		/**
		 * @param lstMsTable
		 *            the lstMsTable to set
		 */
		public void setLstMsTable(final List<MsTable> lstMsTable)
			{
				this.lstMsTable = lstMsTable;
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
		 * @return the usrUpd
		 */
		public String getUsrUpd()
			{
				return this.usrUpd;
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
		 * @return the usrCrt
		 */
		public String getUsrCrt()
			{
				return this.usrCrt;
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
		 * @return the isActive
		 */
		public Integer getIsActive()
			{
				return this.isActive;
			}
			
		/**
		 * @param isActive
		 *            the isActive to set
		 */
		public void setIsActive(final Integer isActive)
			{
				this.isActive = isActive;
			}
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
		/**
		 * @return the masterService
		 */
		public MasterService getMasterService()
			{
				return this.masterService;
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

		/**
		 * @return the lstMasterType
		 */
		public Map<String, String> getLstMasterType()
			{
				return this.lstMasterType;
			}

		/**
		 * @param lstMasterType
		 *            the lstMasterType to set
		 */
		public void setLstMasterType(final Map<String, String> lstMasterType)
			{
				this.lstMasterType = lstMasterType;
			}
			
		/**
		 * @return the msTable
		 */
		public MsTable getMsTable()
			{
				return this.msTable;
			}
			
		/**
		 * @param msTable
		 *            the msTable to set
		 */
		public void setMsTable(final MsTable msTable)
			{
				this.msTable = msTable;
			}

	}
