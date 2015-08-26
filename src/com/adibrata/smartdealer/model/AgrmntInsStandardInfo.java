
package com.adibrata.smartdealer.model;
// Generated Aug 26, 2015 9:54:19 AM by Hibernate Tools 4.3.1

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
 * AgrmntInsStandardInfo generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntInsStandardInfo", catalog = "SmartDealer")
public class AgrmntInsStandardInfo implements java.io.Serializable
	{
		
		private long id;
		private AgrmntIns agrmntIns;
		private double mainStdPremium;
		private double srccstdPremium;
		private double floodStdPremium;
		private double tplstdPremium;
		private double tplstdAmount;
		private double totalStdPremium;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public AgrmntInsStandardInfo()
			{
			}
			
		public AgrmntInsStandardInfo(long id, double mainStdPremium, double srccstdPremium, double floodStdPremium, double tplstdPremium, double tplstdAmount, double totalStdPremium)
			{
				this.id = id;
				this.mainStdPremium = mainStdPremium;
				this.srccstdPremium = srccstdPremium;
				this.floodStdPremium = floodStdPremium;
				this.tplstdPremium = tplstdPremium;
				this.tplstdAmount = tplstdAmount;
				this.totalStdPremium = totalStdPremium;
			}
			
		public AgrmntInsStandardInfo(long id, AgrmntIns agrmntIns, double mainStdPremium, double srccstdPremium, double floodStdPremium, double tplstdPremium, double tplstdAmount, double totalStdPremium, String usrCrt, Date dtmUpd, String usrUpd,
		        Date dtmCrt)
			{
				this.id = id;
				this.agrmntIns = agrmntIns;
				this.mainStdPremium = mainStdPremium;
				this.srccstdPremium = srccstdPremium;
				this.floodStdPremium = floodStdPremium;
				this.tplstdPremium = tplstdPremium;
				this.tplstdAmount = tplstdAmount;
				this.totalStdPremium = totalStdPremium;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
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
		@JoinColumn(name = "AgrmntInsId")
		public AgrmntIns getAgrmntIns()
			{
				return this.agrmntIns;
			}
			
		public void setAgrmntIns(AgrmntIns agrmntIns)
			{
				this.agrmntIns = agrmntIns;
			}
			
		@Column(name = "MainStdPremium", nullable = false, precision = 53, scale = 0)
		public double getMainStdPremium()
			{
				return this.mainStdPremium;
			}
			
		public void setMainStdPremium(double mainStdPremium)
			{
				this.mainStdPremium = mainStdPremium;
			}
			
		@Column(name = "SRCCStdPremium", nullable = false, precision = 53, scale = 0)
		public double getSrccstdPremium()
			{
				return this.srccstdPremium;
			}
			
		public void setSrccstdPremium(double srccstdPremium)
			{
				this.srccstdPremium = srccstdPremium;
			}
			
		@Column(name = "FloodStdPremium", nullable = false, precision = 53, scale = 0)
		public double getFloodStdPremium()
			{
				return this.floodStdPremium;
			}
			
		public void setFloodStdPremium(double floodStdPremium)
			{
				this.floodStdPremium = floodStdPremium;
			}
			
		@Column(name = "TPLStdPremium", nullable = false, precision = 53, scale = 0)
		public double getTplstdPremium()
			{
				return this.tplstdPremium;
			}
			
		public void setTplstdPremium(double tplstdPremium)
			{
				this.tplstdPremium = tplstdPremium;
			}
			
		@Column(name = "TPLStdAmount", nullable = false, precision = 53, scale = 0)
		public double getTplstdAmount()
			{
				return this.tplstdAmount;
			}
			
		public void setTplstdAmount(double tplstdAmount)
			{
				this.tplstdAmount = tplstdAmount;
			}
			
		@Column(name = "TotalStdPremium", nullable = false, precision = 53, scale = 0)
		public double getTotalStdPremium()
			{
				return this.totalStdPremium;
			}
			
		public void setTotalStdPremium(double totalStdPremium)
			{
				this.totalStdPremium = totalStdPremium;
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
			
	}
