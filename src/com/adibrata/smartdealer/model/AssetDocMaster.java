
package com.adibrata.smartdealer.model;
// Generated Jul 27, 2015 12:24:25 PM by Hibernate Tools 4.3.1

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
 * AssetDocMaster generated by hbm2java
 */
@Entity
@Table(name = "AssetDocMaster", catalog = "SmartDealer")
public class AssetDocMaster implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private String documentCode;
		private String documentName;
		private String assetType;
		private Short isActive;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<StockDocument> stockDocuments = new HashSet<StockDocument>(0);
		
		public AssetDocMaster()
			{
			}
			
		public AssetDocMaster(long id)
			{
				this.id = id;
			}
			
		public AssetDocMaster(long id, Partner partner, String documentCode, String documentName, String assetType, Short isActive, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<StockDocument> stockDocuments)
			{
				this.id = id;
				this.partner = partner;
				this.documentCode = documentCode;
				this.documentName = documentName;
				this.assetType = assetType;
				this.isActive = isActive;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.stockDocuments = stockDocuments;
			}
			
		@Id
		
		@Column(name = "ID", unique = true, nullable = false)
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
			
		@Column(name = "AssetType", length = 20)
		public String getAssetType()
			{
				return this.assetType;
			}
			
		public void setAssetType(String assetType)
			{
				this.assetType = assetType;
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
