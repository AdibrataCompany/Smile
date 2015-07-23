
package com.adibrata.smartdealer.action.setting;

import java.util.List;

import com.adibrata.smartdealer.model.MasterTable;
import com.adibrata.smartdealer.model.MasterType;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.MasterService;
/**
 * @author Henry
 */
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class MasterAction extends ActionSupport implements Preparable
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
		
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
			}
			
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
											strMode = this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								case "edit" :
								
								case "del" :
									try
										{
											return this.SaveDelete();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								case "add" :
									
									try
										{
											strMode = this.SaveAdd();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
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
								case "back" :
								
								default :
									return "failed";
							}
					}
				else
					{
						strMode = "start";
					}
				return strMode;
			}
			
		private String Paging() throws Exception
			{
				
				String status = "";
				try
					{
						String wherecond = "";
						if (this.getSearchcriteria().contains("%"))
							{
								wherecond = this.getSearchvalue() + " like " + this.getSearchcriteria();
							}
						else
							{
								wherecond = this.getSearchvalue() + " = " + this.getSearchcriteria();
							}
							
						this.lstMasterTable = this.masterService.Paging(this.getPageNumber(), wherecond, "");
						
						status = "Success";
					}
				catch (final Exception exp)
					{
						status = "Failed";
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}
			
		private String SaveAdd() throws Exception
			{
				String status = "";
				try
					{
						final MasterTable masterTable = new MasterTable();
						
						masterTable.setMasterCode(this.getMasterCode());
						masterTable.setMasterValue(this.getMasterValue());
						masterTable.setMasterType(this.getMasterType());
						
						final MasterType mastertype = new MasterType();
						
						this.masterService.SaveAdd(mastertype, masterTable);
						status = SUCCESS;
					}
				catch (final Exception exp)
					{
						status = ERROR;
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
						masterTable.setMasterType(this.getMasterType());
						
						final MasterType mastertype = new MasterType();
						
						this.masterService.SaveAdd(mastertype, masterTable);
						status = SUCCESS;
					}
				catch (final Exception exp)
					{
						status = ERROR;
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
					}
				catch (final Exception exp)
					{
						status = ERROR;
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
