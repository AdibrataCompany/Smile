
package com.adibrata.smartdealer.model;

public class AgrmntCrossList implements java.io.Serializable
	{
		
		/**
		*
		*/
		private Long Id;
		private Agrmnt agrmntByAgrmntId;
		private Agrmnt agrmntByCrossAgrmntId;
		private String status;
		private String usrUpd;
		private String usrCrt;
		
		public AgrmntCrossList()
			{
				// TODO Auto-generated constructor stub
			}
			
		public Agrmnt getAgrmntByAgrmntId()
			{
				return this.agrmntByAgrmntId;
			}
			
		public void setAgrmntByAgrmntId(final Agrmnt agrmntByAgrmntId)
			{
				this.agrmntByAgrmntId = agrmntByAgrmntId;
			}
			
		public Agrmnt getAgrmntByCrossAgrmntId()
			{
				return this.agrmntByCrossAgrmntId;
			}
			
		public void setAgrmntByCrossAgrmntId(final Agrmnt agrmntByCrossAgrmntId)
			{
				this.agrmntByCrossAgrmntId = agrmntByCrossAgrmntId;
			}
			
		public String getStatus()
			{
				return this.status;
			}
			
		public void setStatus(final String status)
			{
				this.status = status;
			}
			
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
			
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
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
		 * @return the id
		 */
		public Long getId()
			{
				return this.Id;
			}
			
	}
