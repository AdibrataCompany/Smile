/**
 * SuspendList.java
 */

package com.adibrata.smartdealer.model;

/**
 * @author Henry
 */

public class SuspendList
	{

		/**
		 *
		 */
		Long Id;
		String BankAccountName;
		String valuedate;
		String postingdate;
		String SuspendCode;
		String CurrencyCode;
		Double Amount;
		Double CurrencyRate;
		
		public SuspendList()
			{
				// TODO Auto-generated constructor stub
			}
			
		/**
		 * @return the id
		 */
		/**
		 * @return the id
		 */
		public Long getId()
			{
				return this.Id;
			}
			
		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final Long id)
			{
				this.Id = id;
			}
			
		/**
		 * @return the bankAccountName
		 */
		public String getBankAccountName()
			{
				return this.BankAccountName;
			}
			
		/**
		 * @param bankAccountName
		 *            the bankAccountName to set
		 */
		public void setBankAccountName(final String bankAccountName)
			{
				this.BankAccountName = bankAccountName;
			}

		/**
		 * @return the currencyCode
		 */
		public String getCurrencyCode()
			{
				return this.CurrencyCode;
			}
			
		/**
		 * @param currencyCode
		 *            the currencyCode to set
		 */
		public void setCurrencyCode(final String currencyCode)
			{
				this.CurrencyCode = currencyCode;
			}
			
		/**
		 * @return the amount
		 */
		public Double getAmount()
			{
				return this.Amount;
			}
			
		/**
		 * @param amount
		 *            the amount to set
		 */
		public void setAmount(final Double amount)
			{
				this.Amount = amount;
			}
			
		/**
		 * @return the currencyRate
		 */
		public Double getCurrencyRate()
			{
				return this.CurrencyRate;
			}
			
		/**
		 * @param currencyRate
		 *            the currencyRate to set
		 */
		public void setCurrencyRate(final Double currencyRate)
			{
				this.CurrencyRate = currencyRate;
			}
			
		/**
		 * @return the suspendCode
		 */
		public String getSuspendCode()
			{
				return this.SuspendCode;
			}
			
		/**
		 * @param suspendCode
		 *            the suspendCode to set
		 */
		public void setSuspendCode(final String suspendCode)
			{
				this.SuspendCode = suspendCode;
			}
			
		/**
		 * @param valuedate
		 *            the valuedate to set
		 */
		public void setValuedate(final String valuedate)
			{
				this.valuedate = valuedate;
			}
			
		/**
		 * @param postingdate
		 *            the postingdate to set
		 */
		public void setPostingdate(final String postingdate)
			{
				this.postingdate = postingdate;
			}
			
		/**
		 * @return the valuedate
		 */
		public String getValuedate()
			{
				return this.valuedate;
			}
			
		/**
		 * @return the postingdate
		 */
		public String getPostingdate()
			{
				return this.postingdate;
			}
			
	}
