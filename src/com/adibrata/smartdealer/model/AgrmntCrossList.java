
package com.adibrata.smartdealer.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AgrmntCrossList implements java.io.Serializable
	{

		/**
		*
		*/
		private static final long serialVersionUID = 1L;

		private long id;
		private Agrmnt agrmntByAgrmntId;
		private Agrmnt agrmntByCrossAgrmntId;
		private String status;
		private String usrUpd;
		private String usrCrt;

		public AgrmntCrossList()
			{
				// TODO Auto-generated constructor stub
			}

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		public long getId()
			{
				return this.id;
			}

		public void setId(final long id)
			{
				this.id = id;
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

		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

	}
