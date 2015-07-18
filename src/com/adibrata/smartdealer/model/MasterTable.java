package com.adibrata.smartdealer.model;
// Generated Jul 18, 2015 2:19:06 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MasterTable generated by hbm2java
 */
@Entity
@Table(name = "MasterTable", catalog = "SmartDealer")
public class MasterTable implements java.io.Serializable
	{
		
		private long id;
		private MasterType masterType;
		private Partner partner;
		private String masterCode;
		private String masterValue;
		private Integer isActive;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public MasterTable()
			{
			}
		
		public MasterTable(long id)
			{
				this.id = id;
			}
		public MasterTable(long id, MasterType masterType, Partner partner,
		        String masterCode, String masterValue, Integer isActive,
		        Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.masterType = masterType;
				this.partner = partner;
				this.masterCode = masterCode;
				this.masterValue = masterValue;
				this.isActive = isActive;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
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
		@JoinColumn(name = "MasterTypeCode")
		public MasterType getMasterType()
			{
				return this.masterType;
			}
		
		public void setMasterType(MasterType masterType)
			{
				this.masterType = masterType;
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
		
		@Column(name = "MasterCode", length = 20)
		public String getMasterCode()
			{
				return this.masterCode;
			}
		
		public void setMasterCode(String masterCode)
			{
				this.masterCode = masterCode;
			}
		
		@Column(name = "MasterValue", length = 50)
		public String getMasterValue()
			{
				return this.masterValue;
			}
		
		public void setMasterValue(String masterValue)
			{
				this.masterValue = masterValue;
			}
		
		@Column(name = "IsActive")
		public Integer getIsActive()
			{
				return this.isActive;
			}
		
		public void setIsActive(Integer isActive)
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
		
	}
