
package com.adibrata.smartdealer.model;
// Generated Aug 21, 2015 12:46:23 PM by Hibernate Tools 4.3.1

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
 * CoyCustComptInfo generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "CoyCustComptInfo", catalog = "SmartDealer")
public class CoyCustComptInfo implements java.io.Serializable
	{
		
		private long id;
		private Customer customer;
		private Short seqNo;
		private String mainCompetitor;
		private String location;
		private String concernedGoods;
		private double marketShare;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public CoyCustComptInfo()
			{
			}
			
		public CoyCustComptInfo(long id, String mainCompetitor, String location, String concernedGoods, double marketShare)
			{
				this.id = id;
				this.mainCompetitor = mainCompetitor;
				this.location = location;
				this.concernedGoods = concernedGoods;
				this.marketShare = marketShare;
			}
			
		public CoyCustComptInfo(long id, Customer customer, Short seqNo, String mainCompetitor, String location, String concernedGoods, double marketShare, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.customer = customer;
				this.seqNo = seqNo;
				this.mainCompetitor = mainCompetitor;
				this.location = location;
				this.concernedGoods = concernedGoods;
				this.marketShare = marketShare;
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
		@JoinColumn(name = "CustomerId")
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(Customer customer)
			{
				this.customer = customer;
			}
			
		@Column(name = "SeqNo")
		public Short getSeqNo()
			{
				return this.seqNo;
			}
			
		public void setSeqNo(Short seqNo)
			{
				this.seqNo = seqNo;
			}
			
		@Column(name = "MainCompetitor", nullable = false, length = 50)
		public String getMainCompetitor()
			{
				return this.mainCompetitor;
			}
			
		public void setMainCompetitor(String mainCompetitor)
			{
				this.mainCompetitor = mainCompetitor;
			}
			
		@Column(name = "Location", nullable = false, length = 50)
		public String getLocation()
			{
				return this.location;
			}
			
		public void setLocation(String location)
			{
				this.location = location;
			}
			
		@Column(name = "ConcernedGoods", nullable = false, length = 50)
		public String getConcernedGoods()
			{
				return this.concernedGoods;
			}
			
		public void setConcernedGoods(String concernedGoods)
			{
				this.concernedGoods = concernedGoods;
			}
			
		@Column(name = "MarketShare", nullable = false, precision = 53, scale = 0)
		public double getMarketShare()
			{
				return this.marketShare;
			}
			
		public void setMarketShare(double marketShare)
			{
				this.marketShare = marketShare;
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
