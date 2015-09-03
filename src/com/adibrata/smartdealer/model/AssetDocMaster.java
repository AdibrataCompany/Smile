
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
 * AssetDocMaster generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AssetDocMaster", catalog = "SmartDealer")
public class AssetDocMaster implements java.io.Serializable
	{
		
		private long id;
		private AssetType assetType;
		private Partner partner;
		private String documentCode;
		private String documentName;
		private Short isActive;
		private Short isMandatory;
		private Short newAssetMandatory;
		private Short usedAssetMandatory;
		private Short mainDoc;
		private Short exCbumandatory;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<AgrmntAssetDoc> agrmntAssetDocs = new HashSet<AgrmntAssetDoc>(0);
		private Set<StockDocument> stockDocuments = new HashSet<StockDocument>(0);
		
		public AssetDocMaster()
			{
			}
			
		public AssetDocMaster(long id)
			{
				this.id = id;
			}
			
		public AssetDocMaster(long id, AssetType assetType, Partner partner, String documentCode, String documentName, Short isActive, Short isMandatory, Short newAssetMandatory, Short usedAssetMandatory, Short mainDoc, Short exCbumandatory,
		        Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<AgrmntAssetDoc> agrmntAssetDocs, Set<StockDocument> stockDocuments)
			{
				this.id = id;
				this.assetType = assetType;
				this.partner = partner;
				this.documentCode = documentCode;
				this.documentName = documentName;
				this.isActive = isActive;
				this.isMandatory = isMandatory;
				this.newAssetMandatory = newAssetMandatory;
				this.usedAssetMandatory = usedAssetMandatory;
				this.mainDoc = mainDoc;
				this.exCbumandatory = exCbumandatory;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.agrmntAssetDocs = agrmntAssetDocs;
				this.stockDocuments = stockDocuments;
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
			
		@Column(name = "DocumentCode", length = 20)
		public String getDocumentCode()
			{
				return this.documentCode;
			}
			
		public void setDocumentCode(String documentCode)
			{
				this.documentCode = documentCode;
			}
			
		@Column(name = "DocumentName", length = 50)
		public String getDocumentName()
			{
				return this.documentName;
			}
			
		public void setDocumentName(String documentName)
			{
				this.documentName = documentName;
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
			
		@Column(name = "IsMandatory")
		public Short getIsMandatory()
			{
				return this.isMandatory;
			}
			
		public void setIsMandatory(Short isMandatory)
			{
				this.isMandatory = isMandatory;
			}
			
		@Column(name = "NewAssetMandatory")
		public Short getNewAssetMandatory()
			{
				return this.newAssetMandatory;
			}
			
		public void setNewAssetMandatory(Short newAssetMandatory)
			{
				this.newAssetMandatory = newAssetMandatory;
			}
			
		@Column(name = "UsedAssetMandatory")
		public Short getUsedAssetMandatory()
			{
				return this.usedAssetMandatory;
			}
			
		public void setUsedAssetMandatory(Short usedAssetMandatory)
			{
				this.usedAssetMandatory = usedAssetMandatory;
			}
			
		@Column(name = "MainDoc")
		public Short getMainDoc()
			{
				return this.mainDoc;
			}
			
		public void setMainDoc(Short mainDoc)
			{
				this.mainDoc = mainDoc;
			}
			
		@Column(name = "ExCBUMandatory")
		public Short getExCbumandatory()
			{
				return this.exCbumandatory;
			}
			
		public void setExCbumandatory(Short exCbumandatory)
			{
				this.exCbumandatory = exCbumandatory;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "assetDocMaster")
		public Set<AgrmntAssetDoc> getAgrmntAssetDocs()
			{
				return this.agrmntAssetDocs;
			}
			
		public void setAgrmntAssetDocs(Set<AgrmntAssetDoc> agrmntAssetDocs)
			{
				this.agrmntAssetDocs = agrmntAssetDocs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "assetDocMaster")
		public Set<StockDocument> getStockDocuments()
			{
				return this.stockDocuments;
			}
			
		public void setStockDocuments(Set<StockDocument> stockDocuments)
			{
				this.stockDocuments = stockDocuments;
			}
			
	}
