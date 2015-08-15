
package com.adibrata.smartdealer.model;

public class InsCoyList
	{
		private Long id;
		private Long inscoyid;
		private Long inscoyofficeid;
		private String insurancename;

		public InsCoyList()
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
		 * @return the inscoyid
		 */
		public Long getInscoyid()
			{
				return this.inscoyid;
			}
			
		/**
		 * @param inscoyid
		 *            the inscoyid to set
		 */
		public void setInscoyid(final Long inscoyid)
			{
				this.inscoyid = inscoyid;
			}
			
		/**
		 * @return the inscoyofficeid
		 */
		public Long getInscoyofficeid()
			{
				return this.inscoyofficeid;
			}
			
		/**
		 * @param inscoyofficeid
		 *            the inscoyofficeid to set
		 */
		public void setInscoyofficeid(final Long inscoyofficeid)
			{
				this.inscoyofficeid = inscoyofficeid;
			}
			
		/**
		 * @return the insurancename
		 */
		public String getInsurancename()
			{
				return this.insurancename;
			}
			
		/**
		 * @param insurancename
		 *            the insurancename to set
		 */
		public void setInsurancename(final String insurancename)
			{
				this.insurancename = insurancename;
			}

	}
