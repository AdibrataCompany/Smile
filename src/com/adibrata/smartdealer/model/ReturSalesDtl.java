package com.adibrata.smartdealer.model;
// Generated Jul 16, 2015 1:10:05 AM by Hibernate Tools 4.3.1

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
 * ReturSalesDtl generated by hbm2java
 */
@Entity
@Table(name = "ReturSalesDtl", schema = "dbo", catalog = "SmartDealer")
public class ReturSalesDtl implements java.io.Serializable {

	private long id;
	private ReturSalesHdr returSalesHdr;
	private Stock stock;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;

	public ReturSalesDtl() {
	}

	public ReturSalesDtl(long id) {
		this.id = id;
	}
	public ReturSalesDtl(long id, ReturSalesHdr returSalesHdr, Stock stock,
			Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt) {
		this.id = id;
		this.returSalesHdr = returSalesHdr;
		this.stock = stock;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RtrSalesHdrID")
	public ReturSalesHdr getReturSalesHdr() {
		return this.returSalesHdr;
	}

	public void setReturSalesHdr(ReturSalesHdr returSalesHdr) {
		this.returSalesHdr = returSalesHdr;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "StockID")
	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DtmUpd", length = 16)
	public Date getDtmUpd() {
		return this.dtmUpd;
	}

	public void setDtmUpd(Date dtmUpd) {
		this.dtmUpd = dtmUpd;
	}

	@Column(name = "UsrUpd", length = 50)
	public String getUsrUpd() {
		return this.usrUpd;
	}

	public void setUsrUpd(String usrUpd) {
		this.usrUpd = usrUpd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DtmCrt", length = 16)
	public Date getDtmCrt() {
		return this.dtmCrt;
	}

	public void setDtmCrt(Date dtmCrt) {
		this.dtmCrt = dtmCrt;
	}

	@Column(name = "UsrCrt", length = 50)
	public String getUsrCrt() {
		return this.usrCrt;
	}

	public void setUsrCrt(String usrCrt) {
		this.usrCrt = usrCrt;
	}

}