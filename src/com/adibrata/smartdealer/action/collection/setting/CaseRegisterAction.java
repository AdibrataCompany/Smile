
package com.adibrata.smartdealer.action.collection.setting;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.model.AdvanceCash;
import com.adibrata.smartdealer.service.cashtransactions.AdvanceCashService;
import com.opensymphony.xwork2.Preparable;

public class CaseRegisterAction extends BaseAction implements Preparable
	{
		private static final long serialVersionUID = 1L;
		private String mode;
		private String searchcriteria;
		private String searchvalue;
		private long id;
		private String usrUpd;
		private String usrCrt;
		private int pageNumber;
		private String message;
		private AdvanceCash advanceCash;
		private AdvanceCashService advanceCashService;
		
		public CaseRegisterAction()
			{
				// TODO Auto-generated constructor stub
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
								case "edit" :
								
								case "del" :
									return this.SaveDelete();
								case "add" :
									strMode = this.SaveAdd();
								case "saveadd" :
									strMode = this.SaveAdd();
								case "saveedit" :
									strMode = this.SaveEdit();
								case "back" :
									;
									
								case "first" :
									this.pageNumber -= 1;
									this.Paging();
								case "prev" :
									this.pageNumber -= 1;
									if (this.pageNumber <= 1)
										{
											this.pageNumber = 1;
										}
									this.Paging();
								case "next" :
									this.pageNumber += 1;
									this.Paging();
								case "last" :
									this.LastPage();
								default :
									return ERROR;
							}
					}
				else
					{
						strMode = "start";
					}
				return strMode;
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
		 * @return the advanceCash
		 */
		public AdvanceCash getAdvanceCash()
			{
				return this.advanceCash;
			}
			
		/**
		 * @param advanceCash
		 *            the advanceCash to set
		 */
		public void setAdvanceCash(final AdvanceCash advanceCash)
			{
				this.advanceCash = advanceCash;
			}
			
		/**
		 * @return the advanceCashService
		 */
		public AdvanceCashService getAdvanceCashService()
			{
				return this.advanceCashService;
			}
			
		/**
		 * @param advanceCashService
		 *            the advanceCashService to set
		 */
		public void setAdvanceCashService(final AdvanceCashService advanceCashService)
			{
				this.advanceCashService = advanceCashService;
			}
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
	}
