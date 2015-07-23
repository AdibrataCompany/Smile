
package com.adibrata.smartdealer.action.cashtransaction;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.model.AdvanceCash;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.cashtransactions.AdvanceCashService;
import com.opensymphony.xwork2.Preparable;

public class AdvanceRequestAction extends BaseAction implements Preparable
	{
		/**
		 *
		 */
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

		private Office office;
		private Partner partner;
		
		public AdvanceRequestAction()
			{
				// TODO Auto-generated constructor stub
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
			
		/**
		 * @return the advanceCash
		 */
		public AdvanceCash getAdvanceCash()
			{
				return this.advanceCash;
			}
			
		/**
		 * @return the advanceCashService
		 */
		public AdvanceCashService getAdvanceCashService()
			{
				return this.advanceCashService;
			}
			
		/**
		 * @return the mode
		 */
		public String getMode()
			{
				return this.mode;
			}
			
		/**
		 * @return the office
		 */
		public Office getOffice()
			{
				return this.office;
			}
			
		/**
		 * @return the partner
		 */
		public Partner getPartner()
			{
				return this.partner;
			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
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
		 * @param advanceCashService
		 *            the advanceCashService to set
		 */
		public void setAdvanceCashService(final AdvanceCashService advanceCashService)
			{
				this.advanceCashService = advanceCashService;
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
		 * @param office
		 *            the office to set
		 */
		public void setOffice(final Office office)
			{
				this.office = office;
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
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
	}
