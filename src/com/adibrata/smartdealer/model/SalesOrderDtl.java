
package com.adibrata.smartdealer.model;
// Generated Aug 22, 2015 3:49:51 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SalesOrderDtl generated by hbm2java
 */
@Entity
@Table(name = "SalesOrderDtl", catalog = "SmartDealer")
public class SalesOrderDtl implements java.io.Serializable
	{
		
		private long id;
		private SalesOrderHdr salesOrderHdr;
		private Stock stock;
		private Double assetPrice;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public SalesOrderDtl()
			{
			}
			
		public SalesOrderDtl(long id)
			{
				this.id = id;
			}
			
		public SalesOrderDtl(long id, SalesOrderHdr salesOrderHdr, Stock stock, Double assetPrice, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.salesOrderHdr = salesOrderHdr;
				this.stock = stock;
				this.assetPrice = assetPrice;
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
		@JoinColumn(name = "SOHdrID")
		public SalesOrderHdr getSalesOrderHdr()
			{
				return this.salesOrderHdr;
			}
			
		public void setSalesOrderHdr(SalesOrderHdr salesOrderHdr)
			{
				this.salesOrderHdr = salesOrderHdr;
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
			
		@Column(name = "AssetPrice", precision = 53, scale = 0)
		public Double getAssetPrice()
			{
				return this.assetPrice;
			}
			
		public void setAssetPrice(Double assetPrice)
			{
				this.assetPrice = assetPrice;
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
