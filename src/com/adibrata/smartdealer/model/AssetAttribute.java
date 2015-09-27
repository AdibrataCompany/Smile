
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
 * AssetAttribute generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AssetAttribute", catalog = "SmartDealer")
public class AssetAttribute implements java.io.Serializable
	{
		
		private long id;
		private AssetType assetType;
		private String partnerCode;
		private Long officeId;
		private String attributeCode;
		private String attributeDescription;
		private String attributeType;
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
			
		public AssetAttribute(long id, AssetType assetType, String partnerCode, Long officeId, String attributeCode, String attributeDescription, String attributeType, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.assetType = assetType;
				this.partnerCode = partnerCode;
				this.officeId = officeId;
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
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "AssetTypeId")
		public AssetType getAssetType()
			{
				return this.assetType;
			}
			
		public void setAssetType(AssetType assetType)
			{
				this.assetType = assetType;
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
		public String getAttributeType()
			{
				return this.attributeType;
			}
			
		public void setAttributeType(String attributeType)
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
