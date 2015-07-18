package com.adibrata.smartdealer.model;
// Generated Jul 16, 2015 1:10:05 AM by Hibernate Tools 4.3.1

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
import javax.persistence.UniqueConstraint;

/**
 * TrxConfigHdr generated by hbm2java
 */
@Entity
@Table(name = "TrxConfigHdr", schema = "dbo", catalog = "SmartDealer", uniqueConstraints = @UniqueConstraint(columnNames = "TrxConfigCode"))
public class TrxConfigHdr implements java.io.Serializable {

	private long id;
	private String trxConfigCode;
	private String trxConfigDesc;
	private String trxNo;
	private String trxTable;
	private String officeIdX;
	private String jrnlNoCode;
	private String reffNo;
	private String bankAccId;
	private String currId;
	private String currRate;
	private String bankPortion;
	private String rcvDisbFlag;
	private String cashierId;
	private String cashierOpen;
	private String amountTrx;
	private String wop;
	private String receivedFrom;
	private String receiptNo;
	private Short isCreatePaymentHistory;
	private Short isCreateJournal;
	private Short isCreateCashBankMutation;
	private String usrCrt;
	private Date dtmCrt;
	private String usrUpd;
	private Date dtmUpd;
	private Set<TrxConfigDtl> trxConfigDtls = new HashSet<TrxConfigDtl>(0);

	public TrxConfigHdr() {
	}

	public TrxConfigHdr(long id, String trxConfigCode) {
		this.id = id;
		this.trxConfigCode = trxConfigCode;
	}
	public TrxConfigHdr(long id, String trxConfigCode, String trxConfigDesc,
			String trxNo, String trxTable, String officeIdX, String jrnlNoCode,
			String reffNo, String bankAccId, String currId, String currRate,
			String bankPortion, String rcvDisbFlag, String cashierId,
			String cashierOpen, String amountTrx, String wop,
			String receivedFrom, String receiptNo,
			Short isCreatePaymentHistory, Short isCreateJournal,
			Short isCreateCashBankMutation, String usrCrt, Date dtmCrt,
			String usrUpd, Date dtmUpd, Set<TrxConfigDtl> trxConfigDtls) {
		this.id = id;
		this.trxConfigCode = trxConfigCode;
		this.trxConfigDesc = trxConfigDesc;
		this.trxNo = trxNo;
		this.trxTable = trxTable;
		this.officeIdX = officeIdX;
		this.jrnlNoCode = jrnlNoCode;
		this.reffNo = reffNo;
		this.bankAccId = bankAccId;
		this.currId = currId;
		this.currRate = currRate;
		this.bankPortion = bankPortion;
		this.rcvDisbFlag = rcvDisbFlag;
		this.cashierId = cashierId;
		this.cashierOpen = cashierOpen;
		this.amountTrx = amountTrx;
		this.wop = wop;
		this.receivedFrom = receivedFrom;
		this.receiptNo = receiptNo;
		this.isCreatePaymentHistory = isCreatePaymentHistory;
		this.isCreateJournal = isCreateJournal;
		this.isCreateCashBankMutation = isCreateCashBankMutation;
		this.usrCrt = usrCrt;
		this.dtmCrt = dtmCrt;
		this.usrUpd = usrUpd;
		this.dtmUpd = dtmUpd;
		this.trxConfigDtls = trxConfigDtls;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "TrxConfigCode", unique = true, nullable = false, length = 20)
	public String getTrxConfigCode() {
		return this.trxConfigCode;
	}

	public void setTrxConfigCode(String trxConfigCode) {
		this.trxConfigCode = trxConfigCode;
	}

	@Column(name = "TrxConfigDesc", length = 50)
	public String getTrxConfigDesc() {
		return this.trxConfigDesc;
	}

	public void setTrxConfigDesc(String trxConfigDesc) {
		this.trxConfigDesc = trxConfigDesc;
	}

	@Column(name = "TrxNo", length = 20)
	public String getTrxNo() {
		return this.trxNo;
	}

	public void setTrxNo(String trxNo) {
		this.trxNo = trxNo;
	}

	@Column(name = "TrxTable", length = 100)
	public String getTrxTable() {
		return this.trxTable;
	}

	public void setTrxTable(String trxTable) {
		this.trxTable = trxTable;
	}

	@Column(name = "OfficeID_X", length = 50)
	public String getOfficeIdX() {
		return this.officeIdX;
	}

	public void setOfficeIdX(String officeIdX) {
		this.officeIdX = officeIdX;
	}

	@Column(name = "JrnlNoCode", length = 10)
	public String getJrnlNoCode() {
		return this.jrnlNoCode;
	}

	public void setJrnlNoCode(String jrnlNoCode) {
		this.jrnlNoCode = jrnlNoCode;
	}

	@Column(name = "ReffNo", length = 50)
	public String getReffNo() {
		return this.reffNo;
	}

	public void setReffNo(String reffNo) {
		this.reffNo = reffNo;
	}

	@Column(name = "BankAccId", length = 50)
	public String getBankAccId() {
		return this.bankAccId;
	}

	public void setBankAccId(String bankAccId) {
		this.bankAccId = bankAccId;
	}

	@Column(name = "CurrID", length = 50)
	public String getCurrId() {
		return this.currId;
	}

	public void setCurrId(String currId) {
		this.currId = currId;
	}

	@Column(name = "CurrRate", length = 50)
	public String getCurrRate() {
		return this.currRate;
	}

	public void setCurrRate(String currRate) {
		this.currRate = currRate;
	}

	@Column(name = "BankPortion", length = 50)
	public String getBankPortion() {
		return this.bankPortion;
	}

	public void setBankPortion(String bankPortion) {
		this.bankPortion = bankPortion;
	}

	@Column(name = "RcvDisbFlag", length = 50)
	public String getRcvDisbFlag() {
		return this.rcvDisbFlag;
	}

	public void setRcvDisbFlag(String rcvDisbFlag) {
		this.rcvDisbFlag = rcvDisbFlag;
	}

	@Column(name = "CashierID", length = 50)
	public String getCashierId() {
		return this.cashierId;
	}

	public void setCashierId(String cashierId) {
		this.cashierId = cashierId;
	}

	@Column(name = "CashierOpen", length = 50)
	public String getCashierOpen() {
		return this.cashierOpen;
	}

	public void setCashierOpen(String cashierOpen) {
		this.cashierOpen = cashierOpen;
	}

	@Column(name = "AmountTrx", length = 50)
	public String getAmountTrx() {
		return this.amountTrx;
	}

	public void setAmountTrx(String amountTrx) {
		this.amountTrx = amountTrx;
	}

	@Column(name = "WOP", length = 50)
	public String getWop() {
		return this.wop;
	}

	public void setWop(String wop) {
		this.wop = wop;
	}

	@Column(name = "ReceivedFrom", length = 50)
	public String getReceivedFrom() {
		return this.receivedFrom;
	}

	public void setReceivedFrom(String receivedFrom) {
		this.receivedFrom = receivedFrom;
	}

	@Column(name = "ReceiptNo", length = 50)
	public String getReceiptNo() {
		return this.receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	@Column(name = "IsCreatePaymentHistory")
	public Short getIsCreatePaymentHistory() {
		return this.isCreatePaymentHistory;
	}

	public void setIsCreatePaymentHistory(Short isCreatePaymentHistory) {
		this.isCreatePaymentHistory = isCreatePaymentHistory;
	}

	@Column(name = "IsCreateJournal")
	public Short getIsCreateJournal() {
		return this.isCreateJournal;
	}

	public void setIsCreateJournal(Short isCreateJournal) {
		this.isCreateJournal = isCreateJournal;
	}

	@Column(name = "IsCreateCashBankMutation")
	public Short getIsCreateCashBankMutation() {
		return this.isCreateCashBankMutation;
	}

	public void setIsCreateCashBankMutation(Short isCreateCashBankMutation) {
		this.isCreateCashBankMutation = isCreateCashBankMutation;
	}

	@Column(name = "UsrCrt", length = 50)
	public String getUsrCrt() {
		return this.usrCrt;
	}

	public void setUsrCrt(String usrCrt) {
		this.usrCrt = usrCrt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DtmCrt", length = 16)
	public Date getDtmCrt() {
		return this.dtmCrt;
	}

	public void setDtmCrt(Date dtmCrt) {
		this.dtmCrt = dtmCrt;
	}

	@Column(name = "UsrUpd", length = 50)
	public String getUsrUpd() {
		return this.usrUpd;
	}

	public void setUsrUpd(String usrUpd) {
		this.usrUpd = usrUpd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DtmUpd", length = 16)
	public Date getDtmUpd() {
		return this.dtmUpd;
	}

	public void setDtmUpd(Date dtmUpd) {
		this.dtmUpd = dtmUpd;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trxConfigHdr")
	public Set<TrxConfigDtl> getTrxConfigDtls() {
		return this.trxConfigDtls;
	}

	public void setTrxConfigDtls(Set<TrxConfigDtl> trxConfigDtls) {
		this.trxConfigDtls = trxConfigDtls;
	}

}
