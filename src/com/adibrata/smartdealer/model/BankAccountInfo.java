
package com.adibrata.smartdealer.model;

public class BankAccountInfo
	{
		Long id;
		String name;
		String currency;
		String purpose;
		String type;
		
		public BankAccountInfo()
			{
				// TODO Auto-generated constructor stub
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
		 * @return the name
		 */
		public String getName()
			{
				return this.name;
			}

		/**
		 * @param name
		 *            the name to set
		 */
		public void setName(final String name)
			{
				this.name = name;
			}

		/**
		 * @return the currency
		 */
		public String getCurrency()
			{
				return this.currency;
			}

		/**
		 * @param currency
		 *            the currency to set
		 */
		public void setCurrency(final String currency)
			{
				this.currency = currency;
			}

		/**
		 * @return the purpose
		 */
		public String getPurpose()
			{
				return this.purpose;
			}

		/**
		 * @param purpose
		 *            the purpose to set
		 */
		public void setPurpose(final String purpose)
			{
				this.purpose = purpose;
			}

		/**
		 * @return the type
		 */
		public String getType()
			{
				return this.type;
			}

		/**
		 * @param type
		 *            the type to set
		 */
		public void setType(final String type)
			{
				this.type = type;
			}
			
	}
