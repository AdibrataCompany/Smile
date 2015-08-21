
package com.adibrata.smartdealer.model;
// Generated Aug 21, 2015 12:33:53 PM by Hibernate Tools 4.3.1

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
 * InsRateToCust generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "InsRateToCust", catalog = "SmartDealer")
public class InsRateToCust implements java.io.Serializable
	{
		
		private long id;
		private Office office;
		private Partner partner;
		private String insTypeCode;
		private String coverTypeCode;
		private String usageCode;
		private Short newUsed;
		private Long currencyId;
		private Integer yearNum;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public InsRateToCust()
			{
			}
			
		public InsRateToCust(long id)
			{
				this.id = id;
			}
			
		public InsRateToCust(long id, Office office, Partner partner, String insTypeCode, String coverTypeCode, String usageCode, Short newUsed, Long currencyId, Integer yearNum, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.office = office;
				this.partner = partner;
				this.insTypeCode = insTypeCode;
				this.coverTypeCode = coverTypeCode;
				this.usageCode = usageCode;
				this.newUsed = newUsed;
				this.currencyId = currencyId;
				this.yearNum = yearNum;
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
		@JoinColumn(name = "OfficeId")
		public Office getOffice()
			{
				return this.office;
			}
			
		public void setOffice(Office office)
			{
				this.office = office;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "PartnerCode")
		public Partner getPartner()
			{
				return this.partner;
			}
			
		public void setPartner(Partner partner)
			{
				this.partner = partner;
			}
			
		@Column(name = "InsTypeCode", length = 20)
		public String getInsTypeCode()
			{
				return this.insTypeCode;
			}
			
		public void setInsTypeCode(String insTypeCode)
			{
				this.insTypeCode = insTypeCode;
			}
			
		@Column(name = "CoverTypeCode", length = 20)
		public String getCoverTypeCode()
			{
				return this.coverTypeCode;
			}
			
		public void setCoverTypeCode(String coverTypeCode)
			{
				this.coverTypeCode = coverTypeCode;
			}
			
		@Column(name = "UsageCode", length = 20)
		public String getUsageCode()
			{
				return this.usageCode;
			}
			
		public void setUsageCode(String usageCode)
			{
				this.usageCode = usageCode;
			}
			
		@Column(name = "NewUsed")
		public Short getNewUsed()
			{
				return this.newUsed;
			}
			
		public void setNewUsed(Short newUsed)
			{
				this.newUsed = newUsed;
			}
			
		@Column(name = "CurrencyId")
		public Long getCurrencyId()
			{
				return this.currencyId;
			}
			
		public void setCurrencyId(Long currencyId)
			{
				this.currencyId = currencyId;
			}
			
		@Column(name = "YearNum")
		public Integer getYearNum()
			{
				return this.yearNum;
			}
			
		public void setYearNum(Integer yearNum)
			{
				this.yearNum = yearNum;
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
			
		@Column(name = "UsrUpd")
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
			
		@Column(name = "UsrCrt")
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		public void setUsrCrt(String usrCrt)
			{
				this.usrCrt = usrCrt;
			}
			
	}
