
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
 * MsMenu generated by hbm2java
 */
@Entity
@Table(name = "MsMenu", catalog = "SmartDealer")
public class MsMenu implements java.io.Serializable
	{
		
		private long id;
		private String menuCode;
		private Long parentMenuId;
		private Short isActive;
		private String urlString;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<MsMenuRole> msMenuRoles = new HashSet<MsMenuRole>(0);
		
		public MsMenu()
			{
			}
			
		public MsMenu(long id)
			{
				this.id = id;
			}
			
		public MsMenu(long id, String menuCode, Long parentMenuId, Short isActive, String urlString, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<MsMenuRole> msMenuRoles)
			{
				this.id = id;
				this.menuCode = menuCode;
				this.parentMenuId = parentMenuId;
				this.isActive = isActive;
				this.urlString = urlString;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.msMenuRoles = msMenuRoles;
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
			
		@Column(name = "MenuCode", length = 50)
		public String getMenuCode()
			{
				return this.menuCode;
			}
			
		public void setMenuCode(String menuCode)
			{
				this.menuCode = menuCode;
			}
			
		@Column(name = "ParentMenuId")
		public Long getParentMenuId()
			{
				return this.parentMenuId;
			}
			
		public void setParentMenuId(Long parentMenuId)
			{
				this.parentMenuId = parentMenuId;
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
			
		@Column(name = "UrlString", length = 1000)
		public String getUrlString()
			{
				return this.urlString;
			}
			
		public void setUrlString(String urlString)
			{
				this.urlString = urlString;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "msMenu")
		public Set<MsMenuRole> getMsMenuRoles()
			{
				return this.msMenuRoles;
			}
			
		public void setMsMenuRoles(Set<MsMenuRole> msMenuRoles)
			{
				this.msMenuRoles = msMenuRoles;
			}
			
	}
