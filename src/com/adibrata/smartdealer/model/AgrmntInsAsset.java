
package com.adibrata.smartdealer.model;
// Generated Jul 21, 2015 2:45:30 PM by Hibernate Tools 4.3.1

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
 * AgrmntInsAsset generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntInsAsset", catalog = "SmartDealer")
public class AgrmntInsAsset implements java.io.Serializable
	{
		
		private long id;
		private AgrmntAsset agrmntAsset;
		private AgrmntIns agrmntIns;
		private String flagInsStatus;
		private Date flagInsStatusDate;
		private Long assetTypeId;
		private Short isUsed;
		private String usageId;
		private Double sumInsured;
		private short isValid;
		private short isValidAssetYear;
		private short isValidSerialNo1;
		private short isValidSerialNo2;
		private short isValidAttribute;
		private short isValidSumInsured;
		private String flagReNew;
		private String renewalDocNo;
		private Date renewalDocDate;
		private Double endorsAdditionalPremium;
		private Double endorsToInscoPremium;
		private String endorsDocNo;
		private String bdendorsDocNo;
		private Date bdendorsDate;
		private Short isAssetReplacement;
		private String sppano;
		private String insuranceType;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public AgrmntInsAsset()
			{
			}
			
		public AgrmntInsAsset(long id, String flagInsStatus, short isValid, short isValidAssetYear, short isValidSerialNo1, short isValidSerialNo2, short isValidAttribute, short isValidSumInsured, String flagReNew, String renewalDocNo,
		        String insuranceType)
			{
				this.id = id;
				this.flagInsStatus = flagInsStatus;
				this.isValid = isValid;
				this.isValidAssetYear = isValidAssetYear;
				this.isValidSerialNo1 = isValidSerialNo1;
				this.isValidSerialNo2 = isValidSerialNo2;
				this.isValidAttribute = isValidAttribute;
				this.isValidSumInsured = isValidSumInsured;
				this.flagReNew = flagReNew;
				this.renewalDocNo = renewalDocNo;
				this.insuranceType = insuranceType;
			}
			
		public AgrmntInsAsset(long id, AgrmntAsset agrmntAsset, AgrmntIns agrmntIns, String flagInsStatus, Date flagInsStatusDate, Long assetTypeId, Short isUsed, String usageId, Double sumInsured, short isValid, short isValidAssetYear,
		        short isValidSerialNo1, short isValidSerialNo2, short isValidAttribute, short isValidSumInsured, String flagReNew, String renewalDocNo, Date renewalDocDate, Double endorsAdditionalPremium, Double endorsToInscoPremium,
		        String endorsDocNo, String bdendorsDocNo, Date bdendorsDate, Short isAssetReplacement, String sppano, String insuranceType, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.agrmntAsset = agrmntAsset;
				this.agrmntIns = agrmntIns;
				this.flagInsStatus = flagInsStatus;
				this.flagInsStatusDate = flagInsStatusDate;
				this.assetTypeId = assetTypeId;
				this.isUsed = isUsed;
				this.usageId = usageId;
				this.sumInsured = sumInsured;
				this.isValid = isValid;
				this.isValidAssetYear = isValidAssetYear;
				this.isValidSerialNo1 = isValidSerialNo1;
				this.isValidSerialNo2 = isValidSerialNo2;
				this.isValidAttribute = isValidAttribute;
				this.isValidSumInsured = isValidSumInsured;
				this.flagReNew = flagReNew;
				this.renewalDocNo = renewalDocNo;
				this.renewalDocDate = renewalDocDate;
				this.endorsAdditionalPremium = endorsAdditionalPremium;
				this.endorsToInscoPremium = endorsToInscoPremium;
				this.endorsDocNo = endorsDocNo;
				this.bdendorsDocNo = bdendorsDocNo;
				this.bdendorsDate = bdendorsDate;
				this.isAssetReplacement = isAssetReplacement;
				this.sppano = sppano;
				this.insuranceType = insuranceType;
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
		@JoinColumn(name = "AgrmntAssetId")
		public AgrmntAsset getAgrmntAsset()
			{
				return this.agrmntAsset;
			}
			
		public void setAgrmntAsset(AgrmntAsset agrmntAsset)
			{
				this.agrmntAsset = agrmntAsset;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "AgmrntInsId")
		public AgrmntIns getAgrmntIns()
			{
				return this.agrmntIns;
			}
			
		public void setAgrmntIns(AgrmntIns agrmntIns)
			{
				this.agrmntIns = agrmntIns;
			}
			
		@Column(name = "FlagInsStatus", nullable = false, length = 1)
		public String getFlagInsStatus()
			{
				return this.flagInsStatus;
			}
			
		public void setFlagInsStatus(String flagInsStatus)
			{
				this.flagInsStatus = flagInsStatus;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "FlagInsStatusDate", length = 23)
		public Date getFlagInsStatusDate()
			{
				return this.flagInsStatusDate;
			}
			
		public void setFlagInsStatusDate(Date flagInsStatusDate)
			{
				this.flagInsStatusDate = flagInsStatusDate;
			}
			
		@Column(name = "AssetTypeID")
		public Long getAssetTypeId()
			{
				return this.assetTypeId;
			}
			
		public void setAssetTypeId(Long assetTypeId)
			{
				this.assetTypeId = assetTypeId;
			}
			
		@Column(name = "IsUsed")
		public Short getIsUsed()
			{
				return this.isUsed;
			}
			
		public void setIsUsed(Short isUsed)
			{
				this.isUsed = isUsed;
			}
			
		@Column(name = "UsageID", length = 10)
		public String getUsageId()
			{
				return this.usageId;
			}
			
		public void setUsageId(String usageId)
			{
				this.usageId = usageId;
			}
			
		@Column(name = "SumInsured", precision = 17)
		public Double getSumInsured()
			{
				return this.sumInsured;
			}
			
		public void setSumInsured(Double sumInsured)
			{
				this.sumInsured = sumInsured;
			}
			
		@Column(name = "IsValid", nullable = false)
		public short getIsValid()
			{
				return this.isValid;
			}
			
		public void setIsValid(short isValid)
			{
				this.isValid = isValid;
			}
			
		@Column(name = "IsValidAssetYear", nullable = false)
		public short getIsValidAssetYear()
			{
				return this.isValidAssetYear;
			}
			
		public void setIsValidAssetYear(short isValidAssetYear)
			{
				this.isValidAssetYear = isValidAssetYear;
			}
			
		@Column(name = "IsValidSerialNo1", nullable = false)
		public short getIsValidSerialNo1()
			{
				return this.isValidSerialNo1;
			}
			
		public void setIsValidSerialNo1(short isValidSerialNo1)
			{
				this.isValidSerialNo1 = isValidSerialNo1;
			}
			
		@Column(name = "IsValidSerialNo2", nullable = false)
		public short getIsValidSerialNo2()
			{
				return this.isValidSerialNo2;
			}
			
		public void setIsValidSerialNo2(short isValidSerialNo2)
			{
				this.isValidSerialNo2 = isValidSerialNo2;
			}
			
		@Column(name = "IsValidAttribute", nullable = false)
		public short getIsValidAttribute()
			{
				return this.isValidAttribute;
			}
			
		public void setIsValidAttribute(short isValidAttribute)
			{
				this.isValidAttribute = isValidAttribute;
			}
			
		@Column(name = "IsValidSumInsured", nullable = false)
		public short getIsValidSumInsured()
			{
				return this.isValidSumInsured;
			}
			
		public void setIsValidSumInsured(short isValidSumInsured)
			{
				this.isValidSumInsured = isValidSumInsured;
			}
			
		@Column(name = "FlagReNew", nullable = false, length = 1)
		public String getFlagReNew()
			{
				return this.flagReNew;
			}
			
		public void setFlagReNew(String flagReNew)
			{
				this.flagReNew = flagReNew;
			}
			
		@Column(name = "RenewalDocNo", nullable = false, length = 20)
		public String getRenewalDocNo()
			{
				return this.renewalDocNo;
			}
			
		public void setRenewalDocNo(String renewalDocNo)
			{
				this.renewalDocNo = renewalDocNo;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "RenewalDocDate", length = 23)
		public Date getRenewalDocDate()
			{
				return this.renewalDocDate;
			}
			
		public void setRenewalDocDate(Date renewalDocDate)
			{
				this.renewalDocDate = renewalDocDate;
			}
			
		@Column(name = "EndorsAdditionalPremium", precision = 53, scale = 0)
		public Double getEndorsAdditionalPremium()
			{
				return this.endorsAdditionalPremium;
			}
			
		public void setEndorsAdditionalPremium(Double endorsAdditionalPremium)
			{
				this.endorsAdditionalPremium = endorsAdditionalPremium;
			}
			
		@Column(name = "EndorsToInscoPremium", precision = 53, scale = 0)
		public Double getEndorsToInscoPremium()
			{
				return this.endorsToInscoPremium;
			}
			
		public void setEndorsToInscoPremium(Double endorsToInscoPremium)
			{
				this.endorsToInscoPremium = endorsToInscoPremium;
			}
			
		@Column(name = "EndorsDocNo", length = 20)
		public String getEndorsDocNo()
			{
				return this.endorsDocNo;
			}
			
		public void setEndorsDocNo(String endorsDocNo)
			{
				this.endorsDocNo = endorsDocNo;
			}
			
		@Column(name = "BDEndorsDocNo", length = 20)
		public String getBdendorsDocNo()
			{
				return this.bdendorsDocNo;
			}
			
		public void setBdendorsDocNo(String bdendorsDocNo)
			{
				this.bdendorsDocNo = bdendorsDocNo;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "BDEndorsDate", length = 23)
		public Date getBdendorsDate()
			{
				return this.bdendorsDate;
			}
			
		public void setBdendorsDate(Date bdendorsDate)
			{
				this.bdendorsDate = bdendorsDate;
			}
			
		@Column(name = "IsAssetReplacement")
		public Short getIsAssetReplacement()
			{
				return this.isAssetReplacement;
			}
			
		public void setIsAssetReplacement(Short isAssetReplacement)
			{
				this.isAssetReplacement = isAssetReplacement;
			}
			
		@Column(name = "SPPANo", length = 30)
		public String getSppano()
			{
				return this.sppano;
			}
			
		public void setSppano(String sppano)
			{
				this.sppano = sppano;
			}
			
		@Column(name = "InsuranceType", nullable = false, length = 2)
		public String getInsuranceType()
			{
				return this.insuranceType;
			}
			
		public void setInsuranceType(String insuranceType)
			{
				this.insuranceType = insuranceType;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmUpd", length = 16)
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
		@Column(name = "DtmCrt", length = 16)
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
