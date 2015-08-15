
package com.adibrata.smartdealer.model;
// Generated Aug 15, 2015 10:59:05 PM by Hibernate Tools 4.3.1

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
 * MsTable generated by hbm2java
 */
@Entity
@Table(name = "MsTable", catalog = "SmartDealer")
public class MsTable implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private String masterCode;
		private String masterTypeCode;
		private String masterValue;
		private Integer isActive;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public MsTable()
			{
			}
			
		public MsTable(long id)
			{
				this.id = id;
			}
			
		public MsTable(long id, Partner partner, String masterCode, String masterTypeCode, String masterValue, Integer isActive, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.partner = partner;
				this.masterCode = masterCode;
				this.masterTypeCode = masterTypeCode;
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
			
		@Column(name = "MasterTypeCode", length = 20)
		public String getMasterTypeCode()
			{
				return this.masterTypeCode;
			}
			
		public void setMasterTypeCode(String masterTypeCode)
			{
				this.masterTypeCode = masterTypeCode;
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
