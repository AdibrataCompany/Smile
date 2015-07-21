
package com.adibrata.smartdealer.model;
// Generated Jul 21, 2015 2:45:30 PM by Hibernate Tools 4.3.1

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
 * ResetPasswordLog generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "ResetPasswordLog", catalog = "SmartDealer")
public class ResetPasswordLog implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private String userName;
		private Date resetPasswordTime;
		private String resetBy;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public ResetPasswordLog()
			{
			}
			
		public ResetPasswordLog(long id)
			{
				this.id = id;
			}
			
		public ResetPasswordLog(long id, Partner partner, String userName, Date resetPasswordTime, String resetBy, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.partner = partner;
				this.userName = userName;
				this.resetPasswordTime = resetPasswordTime;
				this.resetBy = resetBy;
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
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ResetPasswordTime", length = 23)
		public Date getResetPasswordTime()
			{
				return this.resetPasswordTime;
			}
			
		public void setResetPasswordTime(Date resetPasswordTime)
			{
				this.resetPasswordTime = resetPasswordTime;
			}
			
		@Column(name = "ResetBy", length = 50)
		public String getResetBy()
			{
				return this.resetBy;
			}
			
		public void setResetBy(String resetBy)
			{
				this.resetBy = resetBy;
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
