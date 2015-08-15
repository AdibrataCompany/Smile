
package com.adibrata.smartdealer.model;
// Generated Aug 12, 2015 1:15:10 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
		
		private Long id;
		private String assetTypeCode;
		private String description;
		private String labelNo1;
		private String labelNo2;
		private String sandiBils;
		private String sandiBicf;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public AssetType()
			{
			}
			
		public AssetType(Long id)
			{
				this.id = id;
			}
			
		public AssetType(Long id, String assetTypeCode, String description, String labelNo1, String labelNo2, String sandiBils, String sandiBicf, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.assetTypeCode = assetTypeCode;
				this.description = description;
				this.labelNo1 = labelNo1;
				this.labelNo2 = labelNo2;
				this.sandiBils = sandiBils;
				this.sandiBicf = sandiBicf;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
			}
			
		@Id
		
		@Column(name = "Id", unique = true, nullable = false)
		public Long getId()
			{
				return this.id;
			}
			
		public void setId(Long id)
			{
				this.id = id;
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
			
		@Column(name = "SandiBILS", length = 50)
		public String getSandiBils()
			{
				return this.sandiBils;
			}
			
		public void setSandiBils(String sandiBils)
			{
				this.sandiBils = sandiBils;
			}
			
		@Column(name = "SandiBICF", length = 50)
		public String getSandiBicf()
			{
				return this.sandiBicf;
			}
			
		public void setSandiBicf(String sandiBicf)
			{
				this.sandiBicf = sandiBicf;
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
			
	}
