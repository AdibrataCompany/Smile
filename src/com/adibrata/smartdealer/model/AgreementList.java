/**
 * AgreementList.java
 */

package com.adibrata.smartdealer.model;

/**
 * @author Henry
 */
public class AgreementList
	{

		/**
		 *
		 */
		private String AgmntCode;
		private String CustomerName;
		private String CustomerAddress;
		private String ContractStatus;
		private Double InstallmentAmount;
		private String Currency;

		public AgreementList()
			{
				// TODO Auto-generated constructor stub
			}
			
		/**
		 * @return the agmntCode
		 */
		public String getAgmntCode()
			{
				return this.AgmntCode;
			}
			
		/**
		 * @param agmntCode
		 *            the agmntCode to set
		 */
		public void setAgmntCode(final String agmntCode)
			{
				this.AgmntCode = agmntCode;
			}
			
		/**
		 * @return the customerName
		 */
		public String getCustomerName()
			{
				return this.CustomerName;
			}
			
		/**
		 * @param customerName
		 *            the customerName to set
		 */
		public void setCustomerName(final String customerName)
			{
				this.CustomerName = customerName;
			}
			
		/**
		 * @return the customerAddress
		 */
		public String getCustomerAddress()
			{
				return this.CustomerAddress;
			}
			
		/**
		 * @param customerAddress
		 *            the customerAddress to set
		 */
		public void setCustomerAddress(final String customerAddress)
			{
				this.CustomerAddress = customerAddress;
			}
			
		/**
		 * @return the contractStatus
		 */
		public String getContractStatus()
			{
				return this.ContractStatus;
			}
			
		/**
		 * @param contractStatus
		 *            the contractStatus to set
		 */
		public void setContractStatus(final String contractStatus)
			{
				this.ContractStatus = contractStatus;
			}
			
		/**
		 * @return the installmentAmount
		 */
		public Double getInstallmentAmount()
			{
				return this.InstallmentAmount;
			}
			
		/**
		 * @param installmentAmount
		 *            the installmentAmount to set
		 */
		public void setInstallmentAmount(final Double installmentAmount)
			{
				this.InstallmentAmount = installmentAmount;
			}
			
		/**
		 * @return the currency
		 */
		public String getCurrency()
			{
				return this.Currency;
			}
			
		/**
		 * @param currency
		 *            the currency to set
		 */
		public void setCurrency(final String currency)
			{
				this.Currency = currency;
			}

	}
