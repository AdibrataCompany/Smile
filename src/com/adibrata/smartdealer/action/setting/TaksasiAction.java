
package com.adibrata.smartdealer.action.setting;

/**
 * @author Henry
 */
import java.util.List;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.Taksasi;
import com.adibrata.smartdealer.service.setting.TaksasiService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class TaksasiAction extends ActionSupport implements Preparable
	{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private String mode;
		private Taksasi taksasi;
		private TaksasiService taksasiService;
		private Partner partner;
		private Office office;
		private List<Taksasi> lstTaksasi;
		private String searchcriteria;
		private String searchvalue;
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private String message;
		private long id;
		
		private String assetMasterCode;
		private String taksasiCode;
		private String taksasiName;
		private double taksasiPriceMin;
		
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
							
						this.lstTaksasi = this.taksasiService.Paging(this.getPageNumber(), wherecond, "");
						
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
						final Taksasi taksasi = new Taksasi();
						taksasi.setTaksasiCode(this.getTaksasiCode());
						taksasi.setTaksasiName(this.getTaksasiName());
						taksasi.setTaksasiPriceMin(this.getTaksasiPriceMin());
						
						this.taksasiService.SaveAdd(taksasi);
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
						final Taksasi taksasi = new Taksasi();
						taksasi.setTaksasiCode(this.getTaksasiCode());
						taksasi.setTaksasiName(this.getTaksasiName());
						taksasi.setTaksasiPriceMin(this.getTaksasiPriceMin());
						
						this.taksasiService.SaveEdit(taksasi);
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
						final Taksasi taksasi = new Taksasi();
						taksasi.setTaksasiCode(this.getTaksasiCode());
						taksasi.setTaksasiName(this.getTaksasiName());
						taksasi.setTaksasiPriceMin(this.getTaksasiPriceMin());
						
						this.taksasiService.SaveDel(taksasi);
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
		 * @return the taksasi
		 */
		public Taksasi getTaksasi()
			{
				return this.taksasi;
			}
			
		/**
		 * @return the taksasiService
		 */
		public TaksasiService getTaksasiService()
			{
				return this.taksasiService;
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
		 * @return the lstTaksasi
		 */
		public List<Taksasi> getLstTaksasi()
			{
				return this.lstTaksasi;
			}
			
		/**
		 * @param taksasi
		 *            the taksasi to set
		 */
		public void setTaksasi(final Taksasi taksasi)
			{
				this.taksasi = taksasi;
			}
			
		/**
		 * @param taksasiService
		 *            the taksasiService to set
		 */
		public void setTaksasiService(final TaksasiService taksasiService)
			{
				this.taksasiService = taksasiService;
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
		 * @param lstTaksasi
		 *            the lstTaksasi to set
		 */
		public void setLstTaksasi(final List<Taksasi> lstTaksasi)
			{
				this.lstTaksasi = lstTaksasi;
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
		 * @return the id
		 */
		public long getId()
			{
				return this.id;
			}
			
		/**
		 * @return the assetMasterCode
		 */
		public String getAssetMasterCode()
			{
				return this.assetMasterCode;
			}
			
		/**
		 * @return the taksasiCode
		 */
		public String getTaksasiCode()
			{
				return this.taksasiCode;
			}
			
		/**
		 * @return the taksasiName
		 */
		public String getTaksasiName()
			{
				return this.taksasiName;
			}
			
		/**
		 * @return the taksasiPriceMin
		 */
		public double getTaksasiPriceMin()
			{
				return this.taksasiPriceMin;
			}
			
		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final long id)
			{
				this.id = id;
			}
			
		/**
		 * @param assetMasterCode
		 *            the assetMasterCode to set
		 */
		public void setAssetMasterCode(final String assetMasterCode)
			{
				this.assetMasterCode = assetMasterCode;
			}
			
		/**
		 * @param taksasiCode
		 *            the taksasiCode to set
		 */
		public void setTaksasiCode(final String taksasiCode)
			{
				this.taksasiCode = taksasiCode;
			}
			
		/**
		 * @param taksasiName
		 *            the taksasiName to set
		 */
		public void setTaksasiName(final String taksasiName)
			{
				this.taksasiName = taksasiName;
			}
			
		/**
		 * @param taksasiPriceMin
		 *            the taksasiPriceMin to set
		 */
		public void setTaksasiPriceMin(final double taksasiPriceMin)
			{
				this.taksasiPriceMin = taksasiPriceMin;
			}
			
	}
