
package com.adibrata.smartdealer.model;
// Generated Aug 10, 2015 3:51:21 PM by Hibernate Tools 4.3.1

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
 * AgrmntInsCust generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntInsCust", catalog = "SmartDealer")
public class AgrmntInsCust implements java.io.Serializable
	{
		
		private long id;
		private AgrmntIns agrmntIns;
		private double mainPremiumToCust;
		private double loadingFeeToCust;
		private double tpltoCust;
		private double floodToCust;
		private double srcctoCust;
		private double premiumAmountByCustBeforeDisc;
		private double discToCustAmount;
		private double premiumAmountByCust;
		private double adminFeeToCust;
		private double meteraiFeeToCust;
		private double capitalizedAmount;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public AgrmntInsCust()
			{
			}
			
		public AgrmntInsCust(long id, double mainPremiumToCust, double loadingFeeToCust, double tpltoCust, double floodToCust, double srcctoCust, double premiumAmountByCustBeforeDisc, double discToCustAmount, double premiumAmountByCust,
		        double adminFeeToCust, double meteraiFeeToCust, double capitalizedAmount)
			{
				this.id = id;
				this.mainPremiumToCust = mainPremiumToCust;
				this.loadingFeeToCust = loadingFeeToCust;
				this.tpltoCust = tpltoCust;
				this.floodToCust = floodToCust;
				this.srcctoCust = srcctoCust;
				this.premiumAmountByCustBeforeDisc = premiumAmountByCustBeforeDisc;
				this.discToCustAmount = discToCustAmount;
				this.premiumAmountByCust = premiumAmountByCust;
				this.adminFeeToCust = adminFeeToCust;
				this.meteraiFeeToCust = meteraiFeeToCust;
				this.capitalizedAmount = capitalizedAmount;
			}
			
		public AgrmntInsCust(long id, AgrmntIns agrmntIns, double mainPremiumToCust, double loadingFeeToCust, double tpltoCust, double floodToCust, double srcctoCust, double premiumAmountByCustBeforeDisc, double discToCustAmount,
		        double premiumAmountByCust, double adminFeeToCust, double meteraiFeeToCust, double capitalizedAmount, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.agrmntIns = agrmntIns;
				this.mainPremiumToCust = mainPremiumToCust;
				this.loadingFeeToCust = loadingFeeToCust;
				this.tpltoCust = tpltoCust;
				this.floodToCust = floodToCust;
				this.srcctoCust = srcctoCust;
				this.premiumAmountByCustBeforeDisc = premiumAmountByCustBeforeDisc;
				this.discToCustAmount = discToCustAmount;
				this.premiumAmountByCust = premiumAmountByCust;
				this.adminFeeToCust = adminFeeToCust;
				this.meteraiFeeToCust = meteraiFeeToCust;
				this.capitalizedAmount = capitalizedAmount;
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
			
		@Column(name = "MainPremiumToCust", nullable = false, precision = 53, scale = 0)
		public double getMainPremiumToCust()
			{
				return this.mainPremiumToCust;
			}
			
		public void setMainPremiumToCust(double mainPremiumToCust)
			{
				this.mainPremiumToCust = mainPremiumToCust;
			}
			
		@Column(name = "LoadingFeeToCust", nullable = false, precision = 53, scale = 0)
		public double getLoadingFeeToCust()
			{
				return this.loadingFeeToCust;
			}
			
		public void setLoadingFeeToCust(double loadingFeeToCust)
			{
				this.loadingFeeToCust = loadingFeeToCust;
			}
			
		@Column(name = "TPLToCust", nullable = false, precision = 53, scale = 0)
		public double getTpltoCust()
			{
				return this.tpltoCust;
			}
			
		public void setTpltoCust(double tpltoCust)
			{
				this.tpltoCust = tpltoCust;
			}
			
		@Column(name = "FloodToCust", nullable = false, precision = 53, scale = 0)
		public double getFloodToCust()
			{
				return this.floodToCust;
			}
			
		public void setFloodToCust(double floodToCust)
			{
				this.floodToCust = floodToCust;
			}
			
		@Column(name = "SRCCToCust", nullable = false, precision = 53, scale = 0)
		public double getSrcctoCust()
			{
				return this.srcctoCust;
			}
			
		public void setSrcctoCust(double srcctoCust)
			{
				this.srcctoCust = srcctoCust;
			}
			
		@Column(name = "PremiumAmountByCustBeforeDisc", nullable = false, precision = 53, scale = 0)
		public double getPremiumAmountByCustBeforeDisc()
			{
				return this.premiumAmountByCustBeforeDisc;
			}
			
		public void setPremiumAmountByCustBeforeDisc(double premiumAmountByCustBeforeDisc)
			{
				this.premiumAmountByCustBeforeDisc = premiumAmountByCustBeforeDisc;
			}
			
		@Column(name = "DiscToCustAmount", nullable = false, precision = 53, scale = 0)
		public double getDiscToCustAmount()
			{
				return this.discToCustAmount;
			}
			
		public void setDiscToCustAmount(double discToCustAmount)
			{
				this.discToCustAmount = discToCustAmount;
			}
			
		@Column(name = "PremiumAmountByCust", nullable = false, precision = 53, scale = 0)
		public double getPremiumAmountByCust()
			{
				return this.premiumAmountByCust;
			}
			
		public void setPremiumAmountByCust(double premiumAmountByCust)
			{
				this.premiumAmountByCust = premiumAmountByCust;
			}
			
		@Column(name = "AdminFeeToCust", nullable = false, precision = 53, scale = 0)
		public double getAdminFeeToCust()
			{
				return this.adminFeeToCust;
			}
			
		public void setAdminFeeToCust(double adminFeeToCust)
			{
				this.adminFeeToCust = adminFeeToCust;
			}
			
		@Column(name = "MeteraiFeeToCust", nullable = false, precision = 53, scale = 0)
		public double getMeteraiFeeToCust()
			{
				return this.meteraiFeeToCust;
			}
			
		public void setMeteraiFeeToCust(double meteraiFeeToCust)
			{
				this.meteraiFeeToCust = meteraiFeeToCust;
			}
			
		@Column(name = "CapitalizedAmount", nullable = false, precision = 53, scale = 0)
		public double getCapitalizedAmount()
			{
				return this.capitalizedAmount;
			}
			
		public void setCapitalizedAmount(double capitalizedAmount)
			{
				this.capitalizedAmount = capitalizedAmount;
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
