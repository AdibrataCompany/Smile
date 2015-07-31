
package com.adibrata.smartdealer.model;
// Generated Jul 31, 2015 2:16:00 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Application generated by hbm2java
 */
@Entity
@Table(name = "Application", catalog = "SmartDealer")
public class Application implements java.io.Serializable
	{
		
		private long id;
		private String partnerCode;
		private Long officeId;
		private Long customerId;
		private String appCode;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private Set<Agrmnt> agrmnts = new HashSet<Agrmnt>(0);
		
		public Application()
			{
			}
			
		public Application(long id)
			{
				this.id = id;
			}
			
		public Application(long id, String partnerCode, Long officeId, Long customerId, String appCode, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt, Set<Agrmnt> agrmnts)
			{
				this.id = id;
				this.partnerCode = partnerCode;
				this.officeId = officeId;
				this.customerId = customerId;
				this.appCode = appCode;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.agrmnts = agrmnts;
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
			
		@Column(name = "PartnerCode", length = 20)
		public String getPartnerCode()
			{
				return this.partnerCode;
			}
			
		public void setPartnerCode(String partnerCode)
			{
				this.partnerCode = partnerCode;
			}
			
		@Column(name = "OfficeId")
		public Long getOfficeId()
			{
				return this.officeId;
			}
			
		public void setOfficeId(Long officeId)
			{
				this.officeId = officeId;
			}
			
		@Column(name = "CustomerId")
		public Long getCustomerId()
			{
				return this.customerId;
			}
			
		public void setCustomerId(Long customerId)
			{
				this.customerId = customerId;
			}
			
		@Column(name = "AppCode", length = 20)
		public String getAppCode()
			{
				return this.appCode;
			}
			
		public void setAppCode(String appCode)
			{
				this.appCode = appCode;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "application")
		public Set<Agrmnt> getAgrmnts()
			{
				return this.agrmnts;
			}
			
		public void setAgrmnts(Set<Agrmnt> agrmnts)
			{
				this.agrmnts = agrmnts;
			}
			
	}
