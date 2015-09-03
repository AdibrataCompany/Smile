
package com.adibrata.smartdealer.model;
// Generated Sep 3, 2015 3:22:49 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AssetMaster generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AssetMaster", catalog = "SmartDealer")
public class AssetMaster implements java.io.Serializable
	{
		
		private long id;
		private AssetType assetType;
		private Partner partner;
		private String assetBrand;
		private String assetType_1;
		private String assetModel;
		private String assetCode;
		private Integer assetLevel;
		private Double resaleValue;
		private Short isActive;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<AgrmntAsset> agrmntAssets = new HashSet<AgrmntAsset>(0);
		private Set<AgrmntAssetLevelInfo> agrmntAssetLevelInfos = new HashSet<AgrmntAssetLevelInfo>(0);
		private Set<ServiceHdr> serviceHdrs = new HashSet<ServiceHdr>(0);
		private Set<PurchaseOrderDtl> purchaseOrderDtls = new HashSet<PurchaseOrderDtl>(0);
		private Set<Stock> stocks = new HashSet<Stock>(0);
		
		public AssetMaster()
			{
			}
			
		public AssetMaster(long id)
			{
				this.id = id;
			}
			
		public AssetMaster(long id, AssetType assetType, Partner partner, String assetBrand, String assetType_1, String assetModel, String assetCode, Integer assetLevel, Double resaleValue, Short isActive, Date dtmUpd, String usrUpd, Date dtmCrt,
		        String usrCrt, Set<AgrmntAsset> agrmntAssets, Set<AgrmntAssetLevelInfo> agrmntAssetLevelInfos, Set<ServiceHdr> serviceHdrs, Set<PurchaseOrderDtl> purchaseOrderDtls, Set<Stock> stocks)
			{
				this.id = id;
				this.assetType = assetType;
				this.partner = partner;
				this.assetBrand = assetBrand;
				this.assetType_1 = assetType_1;
				this.assetModel = assetModel;
				this.assetCode = assetCode;
				this.assetLevel = assetLevel;
				this.resaleValue = resaleValue;
				this.isActive = isActive;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.agrmntAssets = agrmntAssets;
				this.agrmntAssetLevelInfos = agrmntAssetLevelInfos;
				this.serviceHdrs = serviceHdrs;
				this.purchaseOrderDtls = purchaseOrderDtls;
				this.stocks = stocks;
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
			
		@Column(name = "AssetBrand", length = 20)
		public String getAssetBrand()
			{
				return this.assetBrand;
			}
			
		public void setAssetBrand(String assetBrand)
			{
				this.assetBrand = assetBrand;
			}
			
		@Column(name = "AssetType", length = 50)
		public String getAssetType_1()
			{
				return this.assetType_1;
			}
			
		public void setAssetType_1(String assetType_1)
			{
				this.assetType_1 = assetType_1;
			}
			
		@Column(name = "AssetModel", length = 20)
		public String getAssetModel()
			{
				return this.assetModel;
			}
			
		public void setAssetModel(String assetModel)
			{
				this.assetModel = assetModel;
			}
			
		@Column(name = "AssetCode", length = 200)
		public String getAssetCode()
			{
				return this.assetCode;
			}
			
		public void setAssetCode(String assetCode)
			{
				this.assetCode = assetCode;
			}
			
		@Column(name = "AssetLevel")
		public Integer getAssetLevel()
			{
				return this.assetLevel;
			}
			
		public void setAssetLevel(Integer assetLevel)
			{
				this.assetLevel = assetLevel;
			}
			
		@Column(name = "ResaleValue", precision = 53, scale = 0)
		public Double getResaleValue()
			{
				return this.resaleValue;
			}
			
		public void setResaleValue(Double resaleValue)
			{
				this.resaleValue = resaleValue;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "assetMaster")
		public Set<AgrmntAsset> getAgrmntAssets()
			{
				return this.agrmntAssets;
			}
			
		public void setAgrmntAssets(Set<AgrmntAsset> agrmntAssets)
			{
				this.agrmntAssets = agrmntAssets;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "assetMaster")
		public Set<AgrmntAssetLevelInfo> getAgrmntAssetLevelInfos()
			{
				return this.agrmntAssetLevelInfos;
			}
			
		public void setAgrmntAssetLevelInfos(Set<AgrmntAssetLevelInfo> agrmntAssetLevelInfos)
			{
				this.agrmntAssetLevelInfos = agrmntAssetLevelInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "assetMaster")
		public Set<ServiceHdr> getServiceHdrs()
			{
				return this.serviceHdrs;
			}
			
		public void setServiceHdrs(Set<ServiceHdr> serviceHdrs)
			{
				this.serviceHdrs = serviceHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "assetMaster")
		public Set<PurchaseOrderDtl> getPurchaseOrderDtls()
			{
				return this.purchaseOrderDtls;
			}
			
		public void setPurchaseOrderDtls(Set<PurchaseOrderDtl> purchaseOrderDtls)
			{
				this.purchaseOrderDtls = purchaseOrderDtls;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "assetMaster")
		public Set<Stock> getStocks()
			{
				return this.stocks;
			}
			
		public void setStocks(Set<Stock> stocks)
			{
				this.stocks = stocks;
			}
			
	}
