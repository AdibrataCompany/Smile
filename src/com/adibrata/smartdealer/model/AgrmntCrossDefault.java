
package com.adibrata.smartdealer.model;
// Generated Aug 31, 2015 2:44:17 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AgrmntCrossDefault generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntCrossDefault", catalog = "SmartDealer")
public class AgrmntCrossDefault implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmntByAgrmntId;
		private Agrmnt agrmntByCrossAgrmntId;
		private String status;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public AgrmntCrossDefault()
			{
			}
			
		public AgrmntCrossDefault(long id)
			{
				this.id = id;
			}
			
		public AgrmntCrossDefault(long id, Agrmnt agrmntByAgrmntId, Agrmnt agrmntByCrossAgrmntId, String status, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.agrmntByAgrmntId = agrmntByAgrmntId;
				this.agrmntByCrossAgrmntId = agrmntByCrossAgrmntId;
				this.status = status;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
			}
			
		@Id @GeneratedValue(strategy=GenerationType.AUTO)
		
		@Column(name = "Id", unique = true, nullable = false)
		public long getId()
			{
				return this.id;
			}
			
		public void setId(long id)
			{
				this.id = id;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "AgrmntId")
		public Agrmnt getAgrmntByAgrmntId()
			{
				return this.agrmntByAgrmntId;
			}
			
		public void setAgrmntByAgrmntId(Agrmnt agrmntByAgrmntId)
			{
				this.agrmntByAgrmntId = agrmntByAgrmntId;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "CrossAgrmntId")
		public Agrmnt getAgrmntByCrossAgrmntId()
			{
				return this.agrmntByCrossAgrmntId;
			}
			
		public void setAgrmntByCrossAgrmntId(Agrmnt agrmntByCrossAgrmntId)
			{
				this.agrmntByCrossAgrmntId = agrmntByCrossAgrmntId;
			}
			
		@Column(name = "Status", length = 5)
		public String getStatus()
			{
				return this.status;
			}
			
		public void setStatus(String status)
			{
				this.status = status;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmUpd", length = 23)
		public Date getDtmUpd()
			{
				return this.dtmUpd;
			}
			
		public void setDtmUpd(Date dtmUpd)
			{
				this.dtmUpd = dtmUpd;
			}
			
		@Column(name = "UsrUpd", length = 50)
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		public void setUsrUpd(String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmCrt", length = 23)
		public Date getDtmCrt()
			{
				return this.dtmCrt;
			}
			
		public void setDtmCrt(Date dtmCrt)
			{
				this.dtmCrt = dtmCrt;
			}
			
		@Column(name = "UsrCrt", length = 50)
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		public void setUsrCrt(String usrCrt)
			{
				this.usrCrt = usrCrt;
			}
			
	}
