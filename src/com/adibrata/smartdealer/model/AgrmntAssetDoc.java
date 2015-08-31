
package com.adibrata.smartdealer.model;
// Generated Aug 31, 2015 2:44:17 PM by Hibernate Tools 4.3.1

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
 * AgrmntAssetDoc generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntAssetDoc", catalog = "SmartDealer")
public class AgrmntAssetDoc implements java.io.Serializable
	{
		
		private long id;
		private AgrmntAsset agrmntAsset;
		private AssetDocMaster assetDocMaster;
		private String documentNo;
		private Short isMainDoc;
		private Date receivedDate;
		private String receivedFrom;
		private String fileName;
		private byte[] fileBinary;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public AgrmntAssetDoc()
			{
			}
			
		public AgrmntAssetDoc(long id)
			{
				this.id = id;
			}
			
		public AgrmntAssetDoc(long id, AgrmntAsset agrmntAsset, AssetDocMaster assetDocMaster, String documentNo, Short isMainDoc, Date receivedDate, String receivedFrom, String fileName, byte[] fileBinary, Date dtmUpd, String usrUpd, Date dtmCrt,
		        String usrCrt)
			{
				this.id = id;
				this.agrmntAsset = agrmntAsset;
				this.assetDocMaster = assetDocMaster;
				this.documentNo = documentNo;
				this.isMainDoc = isMainDoc;
				this.receivedDate = receivedDate;
				this.receivedFrom = receivedFrom;
				this.fileName = fileName;
				this.fileBinary = fileBinary;
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
		@JoinColumn(name = "AssetDocMasterId")
		public AssetDocMaster getAssetDocMaster()
			{
				return this.assetDocMaster;
			}
			
		public void setAssetDocMaster(AssetDocMaster assetDocMaster)
			{
				this.assetDocMaster = assetDocMaster;
			}
			
		@Column(name = "DocumentNo", length = 50)
		public String getDocumentNo()
			{
				return this.documentNo;
			}
			
		public void setDocumentNo(String documentNo)
			{
				this.documentNo = documentNo;
			}
			
		@Column(name = "IsMainDoc")
		public Short getIsMainDoc()
			{
				return this.isMainDoc;
			}
			
		public void setIsMainDoc(Short isMainDoc)
			{
				this.isMainDoc = isMainDoc;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ReceivedDate", length = 23)
		public Date getReceivedDate()
			{
				return this.receivedDate;
			}
			
		public void setReceivedDate(Date receivedDate)
			{
				this.receivedDate = receivedDate;
			}
			
		@Column(name = "ReceivedFrom", length = 50)
		public String getReceivedFrom()
			{
				return this.receivedFrom;
			}
			
		public void setReceivedFrom(String receivedFrom)
			{
				this.receivedFrom = receivedFrom;
			}
			
		@Column(name = "FileName", length = 50)
		public String getFileName()
			{
				return this.fileName;
			}
			
		public void setFileName(String fileName)
			{
				this.fileName = fileName;
			}
			
		@Column(name = "FileBinary")
		public byte[] getFileBinary()
			{
				return this.fileBinary;
			}
			
		public void setFileBinary(byte[] fileBinary)
			{
				this.fileBinary = fileBinary;
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
