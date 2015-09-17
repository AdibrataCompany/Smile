
package com.adibrata.smartdealer.model;
// Generated Sep 10, 2015 12:03:09 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AssetType generated by hbm2java
 */
@Entity
@Table(name = "AssetType", catalog = "SmartDealer")
public class AssetType implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private String assetTypeCode;
		private String description;
		private String labelNo1;
		private String labelNo2;
		private String biLsCode;
		private String biCfCode;
		private Short isActive;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private Set<AssetDocMaster> assetDocMasters = new HashSet<AssetDocMaster>(0);
		private Set<AssetAttribute> assetAttributes = new HashSet<AssetAttribute>(0);
		private Set<AssetMaster> assetMasters = new HashSet<AssetMaster>(0);
		private Set<AssetCategory> assetCategories = new HashSet<AssetCategory>(0);
		private Set<InsAsset> insAssets = new HashSet<InsAsset>(0);
		
		public AssetType()
			{
			}
			
		public AssetType(long id)
			{
				this.id = id;
			}
			
		public AssetType(long id, Partner partner, String assetTypeCode, String description, String labelNo1, String labelNo2, String biLsCode, String biCfCode, Short isActive, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt,
		        Set<AssetDocMaster> assetDocMasters, Set<AssetAttribute> assetAttributes, Set<AssetMaster> assetMasters, Set<AssetCategory> assetCategories, Set<InsAsset> insAssets)
			{
				this.id = id;
				this.partner = partner;
				this.assetTypeCode = assetTypeCode;
				this.description = description;
				this.labelNo1 = labelNo1;
				this.labelNo2 = labelNo2;
				this.biLsCode = biLsCode;
				this.biCfCode = biCfCode;
				this.isActive = isActive;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.assetDocMasters = assetDocMasters;
				this.assetAttributes = assetAttributes;
				this.assetMasters = assetMasters;
				this.assetCategories = assetCategories;
				this.insAssets = insAssets;
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
		@JoinColumn(name = "PartnerCode")
		public Partner getPartner()
			{
				return this.partner;
			}
			
		public void setPartner(Partner partner)
			{
				this.partner = partner;
			}
			
		@Column(name = "AssetTypeCode", length = 50)
		public String getAssetTypeCode()
			{
				return this.assetTypeCode;
			}
			
		public void setAssetTypeCode(String assetTypeCode)
			{
				this.assetTypeCode = assetTypeCode;
			}
			
		@Column(name = "Description", length = 100)
		public String getDescription()
			{
				return this.description;
			}
			
		public void setDescription(String description)
			{
				this.description = description;
			}
			
		@Column(name = "LabelNo1", length = 50)
		public String getLabelNo1()
			{
				return this.labelNo1;
			}
			
		public void setLabelNo1(String labelNo1)
			{
				this.labelNo1 = labelNo1;
			}
			
		@Column(name = "LabelNo2", length = 50)
		public String getLabelNo2()
			{
				return this.labelNo2;
			}
			
		public void setLabelNo2(String labelNo2)
			{
				this.labelNo2 = labelNo2;
			}
			
		@Column(name = "BI_LS_Code", length = 50)
		public String getBiLsCode()
			{
				return this.biLsCode;
			}
			
		public void setBiLsCode(String biLsCode)
			{
				this.biLsCode = biLsCode;
			}
			
		@Column(name = "BI_CF_Code", length = 50)
		public String getBiCfCode()
			{
				return this.biCfCode;
			}
			
		public void setBiCfCode(String biCfCode)
			{
				this.biCfCode = biCfCode;
			}
			
		@Column(name = "IsActive")
		public Short getIsActive()
			{
				return this.isActive;
			}
			
		public void setIsActive(Short isActive)
			{
				this.isActive = isActive;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "assetType")
		public Set<AssetDocMaster> getAssetDocMasters()
			{
				return this.assetDocMasters;
			}
			
		public void setAssetDocMasters(Set<AssetDocMaster> assetDocMasters)
			{
				this.assetDocMasters = assetDocMasters;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "assetType")
		public Set<AssetAttribute> getAssetAttributes()
			{
				return this.assetAttributes;
			}
			
		public void setAssetAttributes(Set<AssetAttribute> assetAttributes)
			{
				this.assetAttributes = assetAttributes;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "assetType")
		public Set<AssetMaster> getAssetMasters()
			{
				return this.assetMasters;
			}
			
		public void setAssetMasters(Set<AssetMaster> assetMasters)
			{
				this.assetMasters = assetMasters;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "assetType")
		public Set<AssetCategory> getAssetCategories()
			{
				return this.assetCategories;
			}
			
		public void setAssetCategories(Set<AssetCategory> assetCategories)
			{
				this.assetCategories = assetCategories;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "assetType")
		public Set<InsAsset> getInsAssets()
			{
				return this.insAssets;
			}
			
		public void setInsAssets(Set<InsAsset> insAssets)
			{
				this.insAssets = insAssets;
			}
			
	}
