
package com.adibrata.smartdealer.model;
// Generated Aug 21, 2015 12:01:27 PM by Hibernate Tools 4.3.1

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
 * Coamaster generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "COAMaster", catalog = "SmartDealer")
public class Coamaster implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private String coaName;
		private String coaDescription;
		private String coacode;
		private Short isSystem;
		private Short isActive;
		private Short isScheme;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<CoaSchmDtl> coaSchmDtls = new HashSet<CoaSchmDtl>(0);
		
		public Coamaster()
			{
			}
			
		public Coamaster(long id)
			{
				this.id = id;
			}
			
		public Coamaster(long id, Partner partner, String coaName, String coaDescription, String coacode, Short isSystem, Short isActive, Short isScheme, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<CoaSchmDtl> coaSchmDtls)
			{
				this.id = id;
				this.partner = partner;
				this.coaName = coaName;
				this.coaDescription = coaDescription;
				this.coacode = coacode;
				this.isSystem = isSystem;
				this.isActive = isActive;
				this.isScheme = isScheme;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.coaSchmDtls = coaSchmDtls;
			}
			
		@Id @GeneratedValue(strategy=GenerationType.AUTO)
		
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
			
		@Column(name = "CoaName", length = 20)
		public String getCoaName()
			{
				return this.coaName;
			}
			
		public void setCoaName(String coaName)
			{
				this.coaName = coaName;
			}
			
		@Column(name = "CoaDescription", length = 50)
		public String getCoaDescription()
			{
				return this.coaDescription;
			}
			
		public void setCoaDescription(String coaDescription)
			{
				this.coaDescription = coaDescription;
			}
			
		@Column(name = "COACode", length = 50)
		public String getCoacode()
			{
				return this.coacode;
			}
			
		public void setCoacode(String coacode)
			{
				this.coacode = coacode;
			}
			
		@Column(name = "IsSystem")
		public Short getIsSystem()
			{
				return this.isSystem;
			}
			
		public void setIsSystem(Short isSystem)
			{
				this.isSystem = isSystem;
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
			
		@Column(name = "IsScheme")
		public Short getIsScheme()
			{
				return this.isScheme;
			}
			
		public void setIsScheme(Short isScheme)
			{
				this.isScheme = isScheme;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "coamaster")
		public Set<CoaSchmDtl> getCoaSchmDtls()
			{
				return this.coaSchmDtls;
			}
			
		public void setCoaSchmDtls(Set<CoaSchmDtl> coaSchmDtls)
			{
				this.coaSchmDtls = coaSchmDtls;
			}
			
	}
