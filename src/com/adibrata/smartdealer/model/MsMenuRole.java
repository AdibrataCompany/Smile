package com.adibrata.smartdealer.model;
// Generated Jul 18, 2015 2:43:49 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MsMenuRole generated by hbm2java
 */
@Entity
@Table(name = "MsMenuRole", catalog = "SmartDealer")
public class MsMenuRole implements java.io.Serializable
	{
		
		private long id;
		private MsMenu msMenu;
		private MsRole msRole;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public MsMenuRole()
			{
			}
		
		public MsMenuRole(long id)
			{
				this.id = id;
			}
		public MsMenuRole(long id, MsMenu msMenu, MsRole msRole, Date dtmUpd,
		        String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.msMenu = msMenu;
				this.msRole = msRole;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
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
		@JoinColumn(name = "MenuID")
		public MsMenu getMsMenu()
			{
				return this.msMenu;
			}
		
		public void setMsMenu(MsMenu msMenu)
			{
				this.msMenu = msMenu;
			}
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "RoleID")
		public MsRole getMsRole()
			{
				return this.msRole;
			}
		
		public void setMsRole(MsRole msRole)
			{
				this.msRole = msRole;
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
