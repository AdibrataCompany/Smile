
package com.adibrata.smartdealer.model;
// Generated Sep 27, 2015 10:48:45 AM by Hibernate Tools 4.3.1.Final

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
 * AgrmntSuppEmplInfo generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntSuppEmplInfo", catalog = "SmartDealer")
public class AgrmntSuppEmplInfo implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private SuppEmplInfo suppEmplInfo;
		private Long branchManagerId;
		private Long adhId;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public AgrmntSuppEmplInfo()
			{
			}
			
		public AgrmntSuppEmplInfo(long id)
			{
				this.id = id;
			}
			
		public AgrmntSuppEmplInfo(long id, Agrmnt agrmnt, SuppEmplInfo suppEmplInfo, Long branchManagerId, Long adhId, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.suppEmplInfo = suppEmplInfo;
				this.branchManagerId = branchManagerId;
				this.adhId = adhId;
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
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		public void setAgrmnt(Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "GeneralManagerId")
		public SuppEmplInfo getSuppEmplInfo()
			{
				return this.suppEmplInfo;
			}
			
		public void setSuppEmplInfo(SuppEmplInfo suppEmplInfo)
			{
				this.suppEmplInfo = suppEmplInfo;
			}
			
		@Column(name = "BranchManagerId")
		public Long getBranchManagerId()
			{
				return this.branchManagerId;
			}
			
		public void setBranchManagerId(Long branchManagerId)
			{
				this.branchManagerId = branchManagerId;
			}
			
		@Column(name = "AdhId")
		public Long getAdhId()
			{
				return this.adhId;
			}
			
		public void setAdhId(Long adhId)
			{
				this.adhId = adhId;
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
