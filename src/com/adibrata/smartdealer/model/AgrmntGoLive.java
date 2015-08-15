
package com.adibrata.smartdealer.model;
// Generated Aug 16, 2015 1:08:17 AM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AgrmntGoLive generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntGoLive", catalog = "SmartDealer")
public class AgrmntGoLive implements java.io.Serializable
	{
		
		private long id;
		private Long agrmntId;
		private Date postingDate;
		private Date effectiveDate;
		private Long fundingCoyId;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public AgrmntGoLive()
			{
			}
			
		public AgrmntGoLive(long id)
			{
				this.id = id;
			}
			
		public AgrmntGoLive(long id, Long agrmntId, Date postingDate, Date effectiveDate, Long fundingCoyId, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.agrmntId = agrmntId;
				this.postingDate = postingDate;
				this.effectiveDate = effectiveDate;
				this.fundingCoyId = fundingCoyId;
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
			
		@Column(name = "AgrmntId")
		public Long getAgrmntId()
			{
				return this.agrmntId;
			}
			
		public void setAgrmntId(Long agrmntId)
			{
				this.agrmntId = agrmntId;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "PostingDate", length = 23)
		public Date getPostingDate()
			{
				return this.postingDate;
			}
			
		public void setPostingDate(Date postingDate)
			{
				this.postingDate = postingDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "EffectiveDate", length = 23)
		public Date getEffectiveDate()
			{
				return this.effectiveDate;
			}
			
		public void setEffectiveDate(Date effectiveDate)
			{
				this.effectiveDate = effectiveDate;
			}
			
		@Column(name = "FundingCoyId")
		public Long getFundingCoyId()
			{
				return this.fundingCoyId;
			}
			
		public void setFundingCoyId(Long fundingCoyId)
			{
				this.fundingCoyId = fundingCoyId;
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
