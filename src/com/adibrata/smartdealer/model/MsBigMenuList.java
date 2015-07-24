
package com.adibrata.smartdealer.model;
// Generated Jul 24, 2015 11:34:06 AM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MsBigMenuList generated by hbm2java
 */
@Entity
@Table(name = "MsBigMenuList", catalog = "SmartDealer")
public class MsBigMenuList implements java.io.Serializable
	{
		
		private long id;
		private String menuGroup;
		private String menuDescription;
		private String menuUrl;
		private String menuImage;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public MsBigMenuList()
			{
			}
			
		public MsBigMenuList(long id)
			{
				this.id = id;
			}
			
		public MsBigMenuList(long id, String menuGroup, String menuDescription, String menuUrl, String menuImage, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.menuGroup = menuGroup;
				this.menuDescription = menuDescription;
				this.menuUrl = menuUrl;
				this.menuImage = menuImage;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
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
			
		@Column(name = "MenuGroup", length = 50)
		public String getMenuGroup()
			{
				return this.menuGroup;
			}
			
		public void setMenuGroup(String menuGroup)
			{
				this.menuGroup = menuGroup;
			}
			
		@Column(name = "MenuDescription", length = 50)
		public String getMenuDescription()
			{
				return this.menuDescription;
			}
			
		public void setMenuDescription(String menuDescription)
			{
				this.menuDescription = menuDescription;
			}
			
		@Column(name = "MenuUrl", length = 500)
		public String getMenuUrl()
			{
				return this.menuUrl;
			}
			
		public void setMenuUrl(String menuUrl)
			{
				this.menuUrl = menuUrl;
			}
			
		@Column(name = "MenuImage", length = 500)
		public String getMenuImage()
			{
				return this.menuImage;
			}
			
		public void setMenuImage(String menuImage)
			{
				this.menuImage = menuImage;
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
