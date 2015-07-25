
package com.adibrata.smartdealer.action.setting;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.MasterDao;
import com.adibrata.smartdealer.model.MasterTable;
import com.adibrata.smartdealer.model.MasterType;
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
		private MasterType masterType;
		private MasterTable masterTable;
		private MasterService masterService;
		private Partner partner;
		private Office office;
		private List<MasterType> lstMasterType;
		
		private List<MasterTable> lstMasterTable;
		private String searchcriteria;
		private String searchvalue;
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private String message;
		private long id;
		
		private String masterCode;
		private String masterValue;
		private Integer isActive;
		
		public MasterAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				final MasterService masterservice = new MasterDao();
				
				this.masterService = masterservice;
				final Partner partner = new Partner();
				final Office office = new Office();
				final MasterTable masterTable = new MasterTable();
				
				this.setPartner(partner);
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.setOffice(office);
				this.setMasterTable(masterTable);
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
						this.lstMasterTable = this.masterService.Paging(this.getPageNumber(), this.WhereCond(), "");
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
						this.lstMasterTable = this.masterService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
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
				this.masterTable = new MasterTable();
				try
					{
						this.masterTable = this.masterService.View(this.id);
						this.masterCode = this.masterTable.getMasterCode();
						this.masterValue = this.masterTable.getMasterValue();
						this.masterType = this.masterTable.getMasterType();
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
						final MasterTable masterTable = new MasterTable();
						
						masterTable.setMasterCode(this.masterCode);
						masterTable.setMasterValue(this.masterValue);
						masterTable.setMasterType(this.masterType);
						masterTable.setPartner(this.partner);
						final MasterType mastertype = new MasterType();
						
						this.masterService.SaveAdd(mastertype, masterTable);
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
						final MasterTable masterTable = new MasterTable();
						masterTable.setId(this.getId());
						masterTable.setMasterCode(this.getMasterCode());
						masterTable.setMasterValue(this.getMasterValue());
						masterTable.setUsrUpd(this.usrUpd);
						masterTable.setMasterType(this.getMasterType());
						masterTable.setPartner(this.partner);
						final MasterType mastertype = new MasterType();
						
						this.masterService.SaveAdd(mastertype, masterTable);
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
						final MasterTable masterTable = new MasterTable();
						masterTable.setId(this.getId());
						
						this.masterService.SaveDel(masterTable);
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
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
		/**
		 * @return the masterType
		 */
		public MasterType getMasterType()
			{
				return this.masterType;
			}
			
		/**
		 * @return the masterTable
		 */
		public MasterTable getMasterTable()
			{
				return this.masterTable;
			}
			
		/**
		 * @return the masterService
		 */
		public MasterService getMasterService()
			{
				return this.masterService;
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
		 * @return the lstMasterType
		 */
		public List<MasterType> getLstMasterType()
			{
				return this.lstMasterType;
			}
			
		/**
		 * @return the lstMasterTable
		 */
		public List<MasterTable> getLstMasterTable()
			{
				return this.lstMasterTable;
			}
			
		/**
		 * @param masterType
		 *            the masterType to set
		 */
		public void setMasterType(final MasterType masterType)
			{
				this.masterType = masterType;
			}
			
		/**
		 * @param masterTable
		 *            the masterTable to set
		 */
		public void setMasterTable(final MasterTable masterTable)
			{
				this.masterTable = masterTable;
			}
			
		/**
		 * @param masterService
		 *            the masterService to set
		 */
		public void setMasterService(final MasterService masterService)
			{
				this.masterService = masterService;
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
		 * @param lstMasterType
		 *            the lstMasterType to set
		 */
		public void setLstMasterType(final List<MasterType> lstMasterType)
			{
				this.lstMasterType = lstMasterType;
			}
			
		/**
		 * @param lstMasterTable
		 *            the lstMasterTable to set
		 */
		public void setLstMasterTable(final List<MasterTable> lstMasterTable)
			{
				this.lstMasterTable = lstMasterTable;
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
		 * @return the pageNumber
		 */
		public int getPageNumber()
			{
				return this.pageNumber;
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
		 * @return the message
		 */
		public String getMessage()
			{
				return this.message;
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
		 * @param pageNumber
		 *            the pageNumber to set
		 */
		public void setPageNumber(final int pageNumber)
			{
				this.pageNumber = pageNumber;
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
		 * @param message
		 *            the message to set
		 */
		public void setMessage(final String message)
			{
				this.message = message;
			}
			
		/**
		 * @return the masterCode
		 */
		public String getMasterCode()
			{
				return this.masterCode;
			}
			
		/**
		 * @return the masterValue
		 */
		public String getMasterValue()
			{
				return this.masterValue;
			}
			
		/**
		 * @return the isActive
		 */
		public Integer getIsActive()
			{
				return this.isActive;
			}
			
		/**
		 * @param masterCode
		 *            the masterCode to set
		 */
		public void setMasterCode(final String masterCode)
			{
				this.masterCode = masterCode;
			}
			
		/**
		 * @param masterValue
		 *            the masterValue to set
		 */
		public void setMasterValue(final String masterValue)
			{
				this.masterValue = masterValue;
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
		 * @return the id
		 */
		public long getId()
			{
				return this.id;
			}
			
		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final long id)
			{
				this.id = id;
			}
			
	}
