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
 * StockDocument generated by hbm2java
 */
@Entity
@Table(name = "StockDocument", schema = "dbo", catalog = "SmartDealer")
public class StockDocument implements java.io.Serializable {

	private long id;
	private AssetDocMaster assetDocMaster;
	private Stock stock;
	private byte[] assetDocumentBinary;
	private String documentNo;
	private Date documentDate;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;

	public StockDocument() {
	}

	public StockDocument(long id) {
		this.id = id;
	}
	public StockDocument(long id, AssetDocMaster assetDocMaster, Stock stock,
			byte[] assetDocumentBinary, String documentNo, Date documentDate,
			Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt) {
		this.id = id;
		this.assetDocMaster = assetDocMaster;
		this.stock = stock;
		this.assetDocumentBinary = assetDocumentBinary;
		this.documentNo = documentNo;
		this.documentDate = documentDate;
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
	@JoinColumn(name = "AssetDocMasterID")
	public AssetDocMaster getAssetDocMaster() {
		return this.assetDocMaster;
	}

	public void setAssetDocMaster(AssetDocMaster assetDocMaster) {
		this.assetDocMaster = assetDocMaster;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "StockID")
	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Column(name = "AssetDocumentBinary")
	public byte[] getAssetDocumentBinary() {
		return this.assetDocumentBinary;
	}

	public void setAssetDocumentBinary(byte[] assetDocumentBinary) {
		this.assetDocumentBinary = assetDocumentBinary;
	}

	@Column(name = "DocumentNo", length = 50)
	public String getDocumentNo() {
		return this.documentNo;
	}

	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DocumentDate", length = 16)
	public Date getDocumentDate() {
		return this.documentDate;
	}

	public void setDocumentDate(Date documentDate) {
		this.documentDate = documentDate;
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