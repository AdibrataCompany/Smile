
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
 * ReturPurchaseDtl generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "ReturPurchaseDtl", catalog = "SmartDealer")
public class ReturPurchaseDtl implements java.io.Serializable
	{
		
		private long id;
		private ReturPurchaseHdr returPurchaseHdr;
		private Stock stock;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public ReturPurchaseDtl()
			{
			}
			
		public ReturPurchaseDtl(long id)
			{
				this.id = id;
			}
			
		public ReturPurchaseDtl(long id, ReturPurchaseHdr returPurchaseHdr, Stock stock, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.returPurchaseHdr = returPurchaseHdr;
				this.stock = stock;
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
		@JoinColumn(name = "RtrPurHdrID")
		public ReturPurchaseHdr getReturPurchaseHdr()
			{
				return this.returPurchaseHdr;
			}
			
		public void setReturPurchaseHdr(ReturPurchaseHdr returPurchaseHdr)
			{
				this.returPurchaseHdr = returPurchaseHdr;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "StockID")
		public Stock getStock()
			{
				return this.stock;
			}
			
		public void setStock(Stock stock)
			{
				this.stock = stock;
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
