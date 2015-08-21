
package com.adibrata.smartdealer.model;
// Generated Aug 21, 2015 12:33:53 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
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
		private Long agrmntAssetId;
		private Long assetDocMasterId;
		private String documentNo;
		private Short isMainDoc;
		private Date receivedDate;
		private String receivedFrom;
		private String fileName;
		private byte[] fileBinary;
		
		public AgrmntAssetDoc()
			{
			}
			
		public AgrmntAssetDoc(long id)
			{
				this.id = id;
			}
			
		public AgrmntAssetDoc(long id, Long agrmntAssetId, Long assetDocMasterId, String documentNo, Short isMainDoc, Date receivedDate, String receivedFrom, String fileName, byte[] fileBinary)
			{
				this.id = id;
				this.agrmntAssetId = agrmntAssetId;
				this.assetDocMasterId = assetDocMasterId;
				this.documentNo = documentNo;
				this.isMainDoc = isMainDoc;
				this.receivedDate = receivedDate;
				this.receivedFrom = receivedFrom;
				this.fileName = fileName;
				this.fileBinary = fileBinary;
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
			
		@Column(name = "AgrmntAssetId")
		public Long getAgrmntAssetId()
			{
				return this.agrmntAssetId;
			}
			
		public void setAgrmntAssetId(Long agrmntAssetId)
			{
				this.agrmntAssetId = agrmntAssetId;
			}
			
		@Column(name = "AssetDocMasterId")
		public Long getAssetDocMasterId()
			{
				return this.assetDocMasterId;
			}
			
		public void setAssetDocMasterId(Long assetDocMasterId)
			{
				this.assetDocMasterId = assetDocMasterId;
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
			
	}
