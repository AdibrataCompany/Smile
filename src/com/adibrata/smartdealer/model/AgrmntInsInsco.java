
package com.adibrata.smartdealer.model;
// Generated Sep 27, 2015 10:48:45 AM by Hibernate Tools 4.3.1.Final

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
 * AgrmntInsInsco generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntInsInsco", catalog = "SmartDealer")
public class AgrmntInsInsco implements java.io.Serializable
	{
		
		private long id;
		private AgrmntIns agrmntIns;
		private double srcctoInsco;
		private double tpltoInsco;
		private double floodToInsCo;
		private double loadingFeeToInsCo;
		private double mainPremiumToInsCo;
		private double premiumAmountToInsCo;
		private double paidAmountToInsco;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public AgrmntInsInsco()
			{
			}
			
		public AgrmntInsInsco(long id, double srcctoInsco, double tpltoInsco, double floodToInsCo, double loadingFeeToInsCo, double mainPremiumToInsCo, double premiumAmountToInsCo, double paidAmountToInsco)
			{
				this.id = id;
				this.srcctoInsco = srcctoInsco;
				this.tpltoInsco = tpltoInsco;
				this.floodToInsCo = floodToInsCo;
				this.loadingFeeToInsCo = loadingFeeToInsCo;
				this.mainPremiumToInsCo = mainPremiumToInsCo;
				this.premiumAmountToInsCo = premiumAmountToInsCo;
				this.paidAmountToInsco = paidAmountToInsco;
			}
			
		public AgrmntInsInsco(long id, AgrmntIns agrmntIns, double srcctoInsco, double tpltoInsco, double floodToInsCo, double loadingFeeToInsCo, double mainPremiumToInsCo, double premiumAmountToInsCo, double paidAmountToInsco, String usrCrt,
		        Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.agrmntIns = agrmntIns;
				this.srcctoInsco = srcctoInsco;
				this.tpltoInsco = tpltoInsco;
				this.floodToInsCo = floodToInsCo;
				this.loadingFeeToInsCo = loadingFeeToInsCo;
				this.mainPremiumToInsCo = mainPremiumToInsCo;
				this.premiumAmountToInsCo = premiumAmountToInsCo;
				this.paidAmountToInsco = paidAmountToInsco;
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
			
		@Column(name = "SRCCToInsco", nullable = false, precision = 53, scale = 0)
		public double getSrcctoInsco()
			{
				return this.srcctoInsco;
			}
			
		public void setSrcctoInsco(double srcctoInsco)
			{
				this.srcctoInsco = srcctoInsco;
			}
			
		@Column(name = "TPLToInsco", nullable = false, precision = 53, scale = 0)
		public double getTpltoInsco()
			{
				return this.tpltoInsco;
			}
			
		public void setTpltoInsco(double tpltoInsco)
			{
				this.tpltoInsco = tpltoInsco;
			}
			
		@Column(name = "FloodToInsCo", nullable = false, precision = 53, scale = 0)
		public double getFloodToInsCo()
			{
				return this.floodToInsCo;
			}
			
		public void setFloodToInsCo(double floodToInsCo)
			{
				this.floodToInsCo = floodToInsCo;
			}
			
		@Column(name = "LoadingFeeToInsCo", nullable = false, precision = 53, scale = 0)
		public double getLoadingFeeToInsCo()
			{
				return this.loadingFeeToInsCo;
			}
			
		public void setLoadingFeeToInsCo(double loadingFeeToInsCo)
			{
				this.loadingFeeToInsCo = loadingFeeToInsCo;
			}
			
		@Column(name = "MainPremiumToInsCo", nullable = false, precision = 53, scale = 0)
		public double getMainPremiumToInsCo()
			{
				return this.mainPremiumToInsCo;
			}
			
		public void setMainPremiumToInsCo(double mainPremiumToInsCo)
			{
				this.mainPremiumToInsCo = mainPremiumToInsCo;
			}
			
		@Column(name = "PremiumAmountToInsCo", nullable = false, precision = 53, scale = 0)
		public double getPremiumAmountToInsCo()
			{
				return this.premiumAmountToInsCo;
			}
			
		public void setPremiumAmountToInsCo(double premiumAmountToInsCo)
			{
				this.premiumAmountToInsCo = premiumAmountToInsCo;
			}
			
		@Column(name = "PaidAmountToInsco", nullable = false, precision = 53, scale = 0)
		public double getPaidAmountToInsco()
			{
				return this.paidAmountToInsco;
			}
			
		public void setPaidAmountToInsco(double paidAmountToInsco)
			{
				this.paidAmountToInsco = paidAmountToInsco;
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
