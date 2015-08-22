
package com.adibrata.smartdealer.model;

import java.util.Date;

public class AdvanceTransaction
	{
		private static final long serialVersionUID = 1L; private long id;

		private String AdvanceCode;
		private String EmployeeName;
		private String Notes;
		private String Currency;
		private Double CurrencyRate;
		private Double Amount;
		private Long Aging;
		private Date ValueDate;
		private String BankAccountName;
		private String valuedate;
		private String postingdate;

		public AdvanceTransaction()
			{
				// TODO Auto-generated constructor stub
			}

		/**
		 * @return the advanceCode
		 */
		public String getAdvanceCode()
			{
				return this.AdvanceCode;
			}

		/**
		 * @param advanceCode
		 *            the advanceCode to set
		 */
		public void setAdvanceCode(final String advanceCode)
			{
				this.AdvanceCode = advanceCode;
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
		 * @return the notes
		 */
		public String getNotes()
			{
				return this.Notes;
			}

		/**
		 * @param notes
		 *            the notes to set
		 */
		public void setNotes(final String notes)
			{
				this.Notes = notes;
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
		 * @return the aging
		 */
		public Long getAging()
			{
				return this.Aging;
			}

		/**
		 * @param aging
		 *            the aging to set
		 */
		public void setAging(final Long aging)
			{
				this.Aging = aging;
			}

		/**
		 * @return the valueDate
		 */
		public Date getValueDate()
			{
				return this.ValueDate;
			}

		/**
		 * @param valueDate
		 *            the valueDate to set
		 */
		public void setValueDate(final Date valueDate)
			{
				this.ValueDate = valueDate;
			}

		/**
		 * @return the id
		 */
		public Long getId()
			{
				return this.id;
			}

		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final Long id)
			{
				this.id = id;
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

	}
