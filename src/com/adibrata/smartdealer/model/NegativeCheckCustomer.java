/**
 * NegativeCheckCustomer.java
 */

package com.adibrata.smartdealer.model;

import java.util.Date;

/**
 * @author Henry
 */
public class NegativeCheckCustomer
	{

		/**
		 *
		 */
		private String Name;

		private String IdType;
		private String IDNumber;
		private Date Birthdate;
		private String BiologicalMothers;
		private String DuplicateType;
		
		public NegativeCheckCustomer()
			{
				// TODO Auto-generated constructor stub
			}
			
		/**
		 * @return the name
		 */
		public String getName()
			{
				return this.Name;
			}
			
		/**
		 * @param name
		 *            the name to set
		 */
		public void setName(final String name)
			{
				this.Name = name;
			}
			
		/**
		 * @return the idType
		 */
		public String getIdType()
			{
				return this.IdType;
			}
			
		/**
		 * @param idType
		 *            the idType to set
		 */
		public void setIdType(final String idType)
			{
				this.IdType = idType;
			}
			
		/**
		 * @return the iDNumber
		 */
		public String getIDNumber()
			{
				return this.IDNumber;
			}
			
		/**
		 * @param iDNumber
		 *            the iDNumber to set
		 */
		public void setIDNumber(final String iDNumber)
			{
				this.IDNumber = iDNumber;
			}
			
		/**
		 * @return the birthdate
		 */
		public Date getBirthdate()
			{
				return this.Birthdate;
			}
			
		/**
		 * @param birthdate
		 *            the birthdate to set
		 */
		public void setBirthdate(final Date birthdate)
			{
				this.Birthdate = birthdate;
			}
			
		/**
		 * @return the biologicalMothers
		 */
		public String getBiologicalMothers()
			{
				return this.BiologicalMothers;
			}
			
		/**
		 * @param biologicalMothers
		 *            the biologicalMothers to set
		 */
		public void setBiologicalMothers(final String biologicalMothers)
			{
				this.BiologicalMothers = biologicalMothers;
			}
			
		/**
		 * @return the duplicateType
		 */
		public String getDuplicateType()
			{
				return this.DuplicateType;
			}
			
		/**
		 * @param duplicateType
		 *            the duplicateType to set
		 */
		public void setDuplicateType(final String duplicateType)
			{
				this.DuplicateType = duplicateType;
			}

	}
