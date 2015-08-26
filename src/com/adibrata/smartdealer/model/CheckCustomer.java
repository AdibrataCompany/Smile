
package com.adibrata.smartdealer.model;

import java.util.Date;
import java.util.List;

public class CheckCustomer
	{
		private String name;

		private String BiologicalMothersName;
		private Date birthdate;
		private String birthplace;
		private String idnumber;
		private List<Customer> lstnegativecustomer;
		private List<Customer> lstduplicatecustomer;

		public CheckCustomer()
			{
				// TODO Auto-generated constructor stub
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
		 * @return the biologicalMothersName
		 */
		public String getBiologicalMothersName()
			{
				return this.BiologicalMothersName;
			}
			
		/**
		 * @param biologicalMothersName
		 *            the biologicalMothersName to set
		 */
		public void setBiologicalMothersName(final String biologicalMothersName)
			{
				this.BiologicalMothersName = biologicalMothersName;
			}
			
		/**
		 * @return the birthdate
		 */
		public Date getBirthdate()
			{
				return this.birthdate;
			}
			
		/**
		 * @param birthdate
		 *            the birthdate to set
		 */
		public void setBirthdate(final Date birthdate)
			{
				this.birthdate = birthdate;
			}
			
		/**
		 * @return the birthplace
		 */
		public String getBirthplace()
			{
				return this.birthplace;
			}
			
		/**
		 * @param birthplace
		 *            the birthplace to set
		 */
		public void setBirthplace(final String birthplace)
			{
				this.birthplace = birthplace;
			}
			
		/**
		 * @return the idnumber
		 */
		public String getIdnumber()
			{
				return this.idnumber;
			}
			
		/**
		 * @param idnumber
		 *            the idnumber to set
		 */
		public void setIdnumber(final String idnumber)
			{
				this.idnumber = idnumber;
			}
			
		/**
		 * @return the lstnegativecustomer
		 */
		public List<Customer> getLstnegativecustomer()
			{
				return this.lstnegativecustomer;
			}
			
		/**
		 * @param lstnegativecustomer
		 *            the lstnegativecustomer to set
		 */
		public void setLstnegativecustomer(final List<Customer> lstnegativecustomer)
			{
				this.lstnegativecustomer = lstnegativecustomer;
			}
			
		/**
		 * @return the lstduplicatecustomer
		 */
		public List<Customer> getLstduplicatecustomer()
			{
				return this.lstduplicatecustomer;
			}
			
		/**
		 * @param lstduplicatecustomer
		 *            the lstduplicatecustomer to set
		 */
		public void setLstduplicatecustomer(final List<Customer> lstduplicatecustomer)
			{
				this.lstduplicatecustomer = lstduplicatecustomer;
			}
			
	}
