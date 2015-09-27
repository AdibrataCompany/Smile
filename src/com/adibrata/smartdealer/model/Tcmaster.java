
package com.adibrata.smartdealer.model;
// Generated Sep 27, 2015 10:48:45 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tcmaster generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "TCMaster", catalog = "SmartDealer")
public class Tcmaster implements java.io.Serializable
	{
		
		private long id;
		private String partnerCode;
		private String name;
		private short personalTc;
		private short employeeTc;
		private short proffesionalTc;
		private short enterpreneurTc;
		private short companyTc;
		private short isActive;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<AgrmntTc> agrmntTcs = new HashSet<AgrmntTc>(0);
		
		public Tcmaster()
			{
			}
			
		public Tcmaster(long id, short personalTc, short employeeTc, short proffesionalTc, short enterpreneurTc, short companyTc, short isActive)
			{
				this.id = id;
				this.personalTc = personalTc;
				this.employeeTc = employeeTc;
				this.proffesionalTc = proffesionalTc;
				this.enterpreneurTc = enterpreneurTc;
				this.companyTc = companyTc;
				this.isActive = isActive;
			}
			
		public Tcmaster(long id, String partnerCode, String name, short personalTc, short employeeTc, short proffesionalTc, short enterpreneurTc, short companyTc, short isActive, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt,
		        Set<AgrmntTc> agrmntTcs)
			{
				this.id = id;
				this.partnerCode = partnerCode;
				this.name = name;
				this.personalTc = personalTc;
				this.employeeTc = employeeTc;
				this.proffesionalTc = proffesionalTc;
				this.enterpreneurTc = enterpreneurTc;
				this.companyTc = companyTc;
				this.isActive = isActive;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.agrmntTcs = agrmntTcs;
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
			
		@Column(name = "PartnerCode", length = 20)
		public String getPartnerCode()
			{
				return this.partnerCode;
			}
			
		public void setPartnerCode(String partnerCode)
			{
				this.partnerCode = partnerCode;
			}
			
		@Column(name = "Name", length = 20)
		public String getName()
			{
				return this.name;
			}
			
		public void setName(String name)
			{
				this.name = name;
			}
			
		@Column(name = "PersonalTC", nullable = false)
		public short getPersonalTc()
			{
				return this.personalTc;
			}
			
		public void setPersonalTc(short personalTc)
			{
				this.personalTc = personalTc;
			}
			
		@Column(name = "EmployeeTC", nullable = false)
		public short getEmployeeTc()
			{
				return this.employeeTc;
			}
			
		public void setEmployeeTc(short employeeTc)
			{
				this.employeeTc = employeeTc;
			}
			
		@Column(name = "ProffesionalTC", nullable = false)
		public short getProffesionalTc()
			{
				return this.proffesionalTc;
			}
			
		public void setProffesionalTc(short proffesionalTc)
			{
				this.proffesionalTc = proffesionalTc;
			}
			
		@Column(name = "EnterpreneurTC", nullable = false)
		public short getEnterpreneurTc()
			{
				return this.enterpreneurTc;
			}
			
		public void setEnterpreneurTc(short enterpreneurTc)
			{
				this.enterpreneurTc = enterpreneurTc;
			}
			
		@Column(name = "CompanyTC", nullable = false)
		public short getCompanyTc()
			{
				return this.companyTc;
			}
			
		public void setCompanyTc(short companyTc)
			{
				this.companyTc = companyTc;
			}
			
		@Column(name = "IsActive", nullable = false)
		public short getIsActive()
			{
				return this.isActive;
			}
			
		public void setIsActive(short isActive)
			{
				this.isActive = isActive;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "tcmaster")
		public Set<AgrmntTc> getAgrmntTcs()
			{
				return this.agrmntTcs;
			}
			
		public void setAgrmntTcs(Set<AgrmntTc> agrmntTcs)
			{
				this.agrmntTcs = agrmntTcs;
			}
			
	}
