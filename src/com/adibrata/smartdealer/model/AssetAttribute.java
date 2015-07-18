package com.adibrata.smartdealer.model;
// Generated Jul 18, 2015 2:43:49 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AssetAttribute generated by hbm2java
 */
@Entity
@Table(name = "AssetAttribute", catalog = "SmartDealer")
public class AssetAttribute implements java.io.Serializable
	{
		
		private long id;
		private String partnerCode;
		private Long officeId;
		private Long assetTypeId;
		private String attributeCode;
		private String attributeDescription;
		private boolean attributeType;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public AssetAttribute()
			{
			}
		
		public AssetAttribute(long id)
			{
				this.id = id;
			}
		public AssetAttribute(long id, String partnerCode, Long officeId,
		        Long assetTypeId, String attributeCode,
		        String attributeDescription, boolean attributeType,
		        Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.partnerCode = partnerCode;
				this.officeId = officeId;
				this.assetTypeId = assetTypeId;
				this.attributeCode = attributeCode;
				this.attributeDescription = attributeDescription;
				this.attributeType = attributeType;
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
		
		@Column(name = "PartnerCode", length = 20)
		public String getPartnerCode()
			{
				return this.partnerCode;
			}
		
		public void setPartnerCode(String partnerCode)
			{
				this.partnerCode = partnerCode;
			}
		
		@Column(name = "OfficeId")
		public Long getOfficeId()
			{
				return this.officeId;
			}
		
		public void setOfficeId(Long officeId)
			{
				this.officeId = officeId;
			}
		
		@Column(name = "AssetTypeId")
		public Long getAssetTypeId()
			{
				return this.assetTypeId;
			}
		
		public void setAssetTypeId(Long assetTypeId)
			{
				this.assetTypeId = assetTypeId;
			}
		
		@Column(name = "AttributeCode", length = 20)
		public String getAttributeCode()
			{
				return this.attributeCode;
			}
		
		public void setAttributeCode(String attributeCode)
			{
				this.attributeCode = attributeCode;
			}
		
		@Column(name = "AttributeDescription", length = 50)
		public String getAttributeDescription()
			{
				return this.attributeDescription;
			}
		
		public void setAttributeDescription(String attributeDescription)
			{
				this.attributeDescription = attributeDescription;
			}
		
		@Column(name = "AttributeType", length = 1)
		public boolean isAttributeType()
			{
				return this.attributeType;
			}
		
		public void setAttributeType(boolean attributeType)
			{
				this.attributeType = attributeType;
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
