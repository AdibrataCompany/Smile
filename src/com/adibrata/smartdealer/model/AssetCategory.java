
package com.adibrata.smartdealer.model;
// Generated Aug 19, 2015 4:50:54 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AssetCategory generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AssetCategory", catalog = "SmartDealer")
public class AssetCategory implements java.io.Serializable
	{
		
		private long id;
		private Long assetTypeId;
		private String insAssetCategoryCode;
		private String description;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public AssetCategory()
			{
			}
			
		public AssetCategory(long id)
			{
				this.id = id;
			}
			
		public AssetCategory(long id, Long assetTypeId, String insAssetCategoryCode, String description, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.assetTypeId = assetTypeId;
				this.insAssetCategoryCode = insAssetCategoryCode;
				this.description = description;
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
			
		@Column(name = "AssetTypeId")
		public Long getAssetTypeId()
			{
				return this.assetTypeId;
			}
			
		public void setAssetTypeId(Long assetTypeId)
			{
				this.assetTypeId = assetTypeId;
			}
			
		@Column(name = "InsAssetCategoryCode", length = 20)
		public String getInsAssetCategoryCode()
			{
				return this.insAssetCategoryCode;
			}
			
		public void setInsAssetCategoryCode(String insAssetCategoryCode)
			{
				this.insAssetCategoryCode = insAssetCategoryCode;
			}
			
		@Column(name = "Description", length = 500)
		public String getDescription()
			{
				return this.description;
			}
			
		public void setDescription(String description)
			{
				this.description = description;
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
