
package com.adibrata.smartdealer.model;
// Generated Aug 21, 2015 4:05:17 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * InsRateFromInsco generated by hbm2java
 */
@Entity
@Table(name = "InsRateFromInsco", catalog = "SmartDealer")
public class InsRateFromInsco implements java.io.Serializable
	{
		
		private long id;
		private InsCoOffice insCoOffice;
		private String insTypeCode;
		private String coverTypeCode;
		private String usageCode;
		private Short newUsed;
		private Long currencyId;
		private Integer yearNum;
		private Double premiumAmt;
		private Double srccRate;
		private Double floodRate;
		private Double sumInsured;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public InsRateFromInsco()
			{
			}
			
		public InsRateFromInsco(long id)
			{
				this.id = id;
			}
			
		public InsRateFromInsco(long id, InsCoOffice insCoOffice, String insTypeCode, String coverTypeCode, String usageCode, Short newUsed, Long currencyId, Integer yearNum, Double premiumAmt, Double srccRate, Double floodRate, Double sumInsured,
		        Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.insCoOffice = insCoOffice;
				this.insTypeCode = insTypeCode;
				this.coverTypeCode = coverTypeCode;
				this.usageCode = usageCode;
				this.newUsed = newUsed;
				this.currencyId = currencyId;
				this.yearNum = yearNum;
				this.premiumAmt = premiumAmt;
				this.srccRate = srccRate;
				this.floodRate = floodRate;
				this.sumInsured = sumInsured;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
			}
			
		@Id
		
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
		@JoinColumn(name = "InsCompanyOfficeId")
		public InsCoOffice getInsCoOffice()
			{
				return this.insCoOffice;
			}
			
		public void setInsCoOffice(InsCoOffice insCoOffice)
			{
				this.insCoOffice = insCoOffice;
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
			
		@Column(name = "PremiumAmt", precision = 53, scale = 0)
		public Double getPremiumAmt()
			{
				return this.premiumAmt;
			}
			
		public void setPremiumAmt(Double premiumAmt)
			{
				this.premiumAmt = premiumAmt;
			}
			
		@Column(name = "SrccRate", precision = 53, scale = 0)
		public Double getSrccRate()
			{
				return this.srccRate;
			}
			
		public void setSrccRate(Double srccRate)
			{
				this.srccRate = srccRate;
			}
			
		@Column(name = "FloodRate", precision = 53, scale = 0)
		public Double getFloodRate()
			{
				return this.floodRate;
			}
			
		public void setFloodRate(Double floodRate)
			{
				this.floodRate = floodRate;
			}
			
		@Column(name = "SumInsured", precision = 53, scale = 0)
		public Double getSumInsured()
			{
				return this.sumInsured;
			}
			
		public void setSumInsured(Double sumInsured)
			{
				this.sumInsured = sumInsured;
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
