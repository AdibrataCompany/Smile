
package com.adibrata.smartdealer.model;

public class BankMaster
	{
		private String BankName;
		private String BankCode;
		
		public BankMaster()
			{
				// TODO Auto-generated constructor stub
			}
			
		/**
		 * @return the bankName
		 */
		public String getBankName()
			{
				return this.BankName;
			}
			
		/**
		 * @param bankName
		 *            the bankName to set
		 */
		public void setBankName(final String bankName)
			{
				this.BankName = bankName;
			}
			
		/**
		 * @return the bankCode
		 */
		public String getBankCode()
			{
				return this.BankCode;
			}
			
		/**
		 * @param bankCode
		 *            the bankCode to set
		 */
		public void setBankCode(final String bankCode)
			{
				this.BankCode = bankCode;
			}

	}
