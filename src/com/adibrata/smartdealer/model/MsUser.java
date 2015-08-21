
package com.adibrata.smartdealer.model;
<<<<<<< Upstream, based on branch 'master' of https://github.com/AdibrataCompany/Smile
// Generated Aug 19, 2015 4:50:54 PM by Hibernate Tools 4.3.1
=======
// Generated Jul 22, 2015 4:44:54 PM by Hibernate Tools 4.3.1
>>>>>>> 5851c81 new Model

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
 * MsUser generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "MsUser", catalog = "SmartDealer")
public class MsUser implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private String userName;
		private String password;
		private Long employeeId;
		private Short isActive;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public MsUser()
			{
			}
			
		public MsUser(long id)
			{
				this.id = id;
			}
			
		public MsUser(long id, Partner partner, String userName, String password, Long employeeId, Short isActive, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.partner = partner;
				this.userName = userName;
				this.password = password;
				this.employeeId = employeeId;
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
			
		@Column(name = "UserName", length = 50)
		public String getUserName()
			{
				return this.userName;
			}
			
		public void setUserName(String userName)
			{
				this.userName = userName;
			}
			
		@Column(name = "Password", length = 400)
		public String getPassword()
			{
				return this.password;
			}
			
		public void setPassword(String password)
			{
				this.password = password;
			}
			
		@Column(name = "EmployeeID")
		public Long getEmployeeId()
			{
				return this.employeeId;
			}
			
		public void setEmployeeId(Long employeeId)
			{
				this.employeeId = employeeId;
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
			
	}
