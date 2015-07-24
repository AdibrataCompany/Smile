
package com.adibrata.smartdealer.model;

import java.util.Date;

public class HeadCashier
	{
		String EmployeeName;
		Date OpeningDate;
		String CurrencyCode;
		Double OpeningAmount;
		Double OnHandAmount;
		String CashierStatus;
		Date CloseDate;
		
		public HeadCashier()
			{
				// TODO Auto-generated constructor stub
			}
			
		/**
		 * @return the employeeName
		 */
		public String getEmployeeName()
			{
				return this.EmployeeName;
			}
			
		/**
		 * @param employeeName
		 *            the employeeName to set
		 */
		public void setEmployeeName(final String employeeName)
			{
				this.EmployeeName = employeeName;
			}
			
		/**
		 * @return the openingDate
		 */
		public Date getOpeningDate()
			{
				return this.OpeningDate;
			}
			
		/**
		 * @param openingDate
		 *            the openingDate to set
		 */
		public void setOpeningDate(final Date openingDate)
			{
				this.OpeningDate = openingDate;
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
		 * @return the openingAmount
		 */
		public Double getOpeningAmount()
			{
				return this.OpeningAmount;
			}
			
		/**
		 * @param openingAmount
		 *            the openingAmount to set
		 */
		public void setOpeningAmount(final Double openingAmount)
			{
				this.OpeningAmount = openingAmount;
			}
			
		/**
		 * @return the onHandAmount
		 */
		public Double getOnHandAmount()
			{
				return this.OnHandAmount;
			}
			
		/**
		 * @param onHandAmount
		 *            the onHandAmount to set
		 */
		public void setOnHandAmount(final Double onHandAmount)
			{
				this.OnHandAmount = onHandAmount;
			}
			
		/**
		 * @return the cashierStatus
		 */
		public String getCashierStatus()
			{
				return this.CashierStatus;
			}
			
		/**
		 * @param cashierStatus
		 *            the cashierStatus to set
		 */
		public void setCashierStatus(final String cashierStatus)
			{
				this.CashierStatus = cashierStatus;
			}
			
		/**
		 * @return the closeDate
		 */
		public Date getCloseDate()
			{
				return this.CloseDate;
			}
			
		/**
		 * @param closeDate
		 *            the closeDate to set
		 */
		public void setCloseDate(final Date closeDate)
			{
				this.CloseDate = closeDate;
			}

	}
