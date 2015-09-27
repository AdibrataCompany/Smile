
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
 * InsRateFromInscoDtl generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "InsRateFromInscoDtl", catalog = "SmartDealer")
public class InsRateFromInscoDtl implements java.io.Serializable
	{
		
		private long id;
		private InsRateFromInsco insRateFromInsco;
		private String coverTypeCode;
		private Integer yearNum;
		private Double premiumAmt;
		private Double srccRate;
		private Double floodRate;
		private Double sumInsured;
		private Double aogRate;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public InsRateFromInscoDtl()
			{
			}
			
		public InsRateFromInscoDtl(long id)
			{
				this.id = id;
			}
			
		public InsRateFromInscoDtl(long id, InsRateFromInsco insRateFromInsco, String coverTypeCode, Integer yearNum, Double premiumAmt, Double srccRate, Double floodRate, Double sumInsured, Double aogRate, Date dtmUpd, String usrUpd, Date dtmCrt,
		        String usrCrt)
			{
				this.id = id;
				this.insRateFromInsco = insRateFromInsco;
				this.coverTypeCode = coverTypeCode;
				this.yearNum = yearNum;
				this.premiumAmt = premiumAmt;
				this.srccRate = srccRate;
				this.floodRate = floodRate;
				this.sumInsured = sumInsured;
				this.aogRate = aogRate;
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
		@JoinColumn(name = "InsRateFromInscoId")
		public InsRateFromInsco getInsRateFromInsco()
			{
				return this.insRateFromInsco;
			}
			
		public void setInsRateFromInsco(InsRateFromInsco insRateFromInsco)
			{
				this.insRateFromInsco = insRateFromInsco;
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
			
		@Column(name = "AogRate", precision = 53, scale = 0)
		public Double getAogRate()
			{
				return this.aogRate;
			}
			
		public void setAogRate(Double aogRate)
			{
				this.aogRate = aogRate;
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
