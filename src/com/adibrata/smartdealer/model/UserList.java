/**
 * UserList.java
 */

package com.adibrata.smartdealer.model;

/**
 * @author Henry
 */
public class UserList
	{
		
		/**
		 *
		 */
		Long Id;
		String UserName;
		String EmployeeName;
		String Position;
		
		public UserList()
			{
				// TODO Auto-generated constructor stub
			}

		/**
		 * @return the userName
		 */
		public String getUserName()
			{
				return this.UserName;
			}

		/**
		 * @param userName
		 *            the userName to set
		 */
		public void setUserName(final String userName)
			{
				this.UserName = userName;
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
		 * @return the position
		 */
		public String getPosition()
			{
				return this.Position;
			}
			
		/**
		 * @param position
		 *            the position to set
		 */
		public void setPosition(final String position)
			{
				this.Position = position;
			}
			
	}
