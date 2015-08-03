/**
 * PettyCashList.java
 */

package com.adibrata.smartdealer.model;

/**
 * @author Henry
 */
public class PettyCashList
	{

		/**
		 *
		 */
		String employeename;
		String valuedate;
		String postingdate;
		String bankaccountname;
		Double amount;

		public PettyCashList()
			{
				// TODO Auto-generated constructor stub
			}
			
		/**
		 * @return the employeename
		 */
		public String getEmployeename()
			{
				return this.employeename;
			}
			
		/**
		 * @param employeename
		 *            the employeename to set
		 */
		public void setEmployeename(final String employeename)
			{
				this.employeename = employeename;
			}
			
		/**
		 * @return the valuedate
		 */
		public String getValuedate()
			{
				return this.valuedate;
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
		 * @return the postingdate
		 */
		public String getPostingdate()
			{
				return this.postingdate;
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
		 * @return the bankaccountname
		 */
		public String getBankaccountname()
			{
				return this.bankaccountname;
			}
			
		/**
		 * @param bankaccountname
		 *            the bankaccountname to set
		 */
		public void setBankaccountname(final String bankaccountname)
			{
				this.bankaccountname = bankaccountname;
			}
			
		/**
		 * @return the amount
		 */
		public Double getAmount()
			{
				return this.amount;
			}
			
		/**
		 * @param amount
		 *            the amount to set
		 */
		public void setAmount(final Double amount)
			{
				this.amount = amount;
			}

	}
