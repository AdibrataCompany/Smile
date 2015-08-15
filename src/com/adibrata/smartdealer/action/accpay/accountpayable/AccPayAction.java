/**
 *
 */

package com.adibrata.smartdealer.action.accpay.accountpayable;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.model.AccountPayable;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.accpay.APSelectionService;
import com.opensymphony.xwork2.Preparable;

/**
 * @author Henry
 */
public class AccPayAction extends BaseAction implements Preparable
	{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private List<AccountPayable> lstAccountPayable;
		/**
		 *
		 */
		private String mode;
		private Office office;
		private Partner partner;
		private APSelectionService selectionService;

		public AccPayAction() throws Exception
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
		 * @return the lstAccountPayable
		 */
		public List<AccountPayable> getLstAccountPayable()
			{
				return this.lstAccountPayable;
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

		/**
		 * @return the selectionService
		 */
		public APSelectionService getSelectionService()
			{
				return this.selectionService;
			}

		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

			}

		/**
		 * @param lstAccountPayable
		 *            the lstAccountPayable to set
		 */
		public void setLstAccountPayable(final List<AccountPayable> lstAccountPayable)
			{
				this.lstAccountPayable = lstAccountPayable;
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
		 * @param selectionService
		 *            the selectionService to set
		 */
		public void setSelectionService(final APSelectionService selectionService)
			{
				this.selectionService = selectionService;
			}

	}
