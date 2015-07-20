
package com.adibrata.smartdealer.model;

// Generated Jul 20, 2015 11:55:15 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CashBankHdr generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "CashBankHdr", catalog = "SmartDealer")
public class CashBankHdr implements java.io.Serializable
	{
		
		private long id;
		private BankAccount bankAccount;
		private Office office;
		private Partner partner;
		private String voucherNo;
		private Date valueDt;
		private Date postingDt;
		private String description;
		private String rcvDsbFlag;
		private String wop;
		private Double amount;
		private String rcvFrom;
		private String reffNo;
		private String receiptNo;
		private Long currId;
		private Long cashierId;
		private Integer openingSequence;
		private Long officeIdX;
		private String isReconcile;
		private Date reconcileDate;
		private String reconcileBy;
		private Integer jrnlTrxId;
		private Long agrmntId;
		private Long jobId;
		private String usrUpd;
		private Date dtmUpd;
		private String usrCrt;
		private Date dtmCrt;
		private Set<CashBankDtl> cashBankDtls = new HashSet<CashBankDtl>(0);
		
		public CashBankHdr()
			{
			}
		
		public CashBankHdr(long id)
			{
				this.id = id;
			}
		
		public CashBankHdr(long id, BankAccount bankAccount, Office office, Partner partner, String voucherNo, Date valueDt, Date postingDt, String description, String rcvDsbFlag, String wop, Double amount, String rcvFrom, String reffNo,
		        String receiptNo, Long currId, Long cashierId, Integer openingSequence, Long officeIdX, String isReconcile, Date reconcileDate, String reconcileBy, Integer jrnlTrxId, Long agrmntId, Long jobId, String usrUpd, Date dtmUpd,
		        String usrCrt, Date dtmCrt, Set<CashBankDtl> cashBankDtls)
			{
				this.id = id;
				this.bankAccount = bankAccount;
				this.office = office;
				this.partner = partner;
				this.voucherNo = voucherNo;
				this.valueDt = valueDt;
				this.postingDt = postingDt;
				this.description = description;
				this.rcvDsbFlag = rcvDsbFlag;
				this.wop = wop;
				this.amount = amount;
				this.rcvFrom = rcvFrom;
				this.reffNo = reffNo;
				this.receiptNo = receiptNo;
				this.currId = currId;
				this.cashierId = cashierId;
				this.openingSequence = openingSequence;
				this.officeIdX = officeIdX;
				this.isReconcile = isReconcile;
				this.reconcileDate = reconcileDate;
				this.reconcileBy = reconcileBy;
				this.jrnlTrxId = jrnlTrxId;
				this.agrmntId = agrmntId;
				this.jobId = jobId;
				this.usrUpd = usrUpd;
				this.dtmUpd = dtmUpd;
				this.usrCrt = usrCrt;
				this.dtmCrt = dtmCrt;
				this.cashBankDtls = cashBankDtls;
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
		@JoinColumn(name = "BankAccID")
		public BankAccount getBankAccount()
			{
				return this.bankAccount;
			}
		
		public void setBankAccount(BankAccount bankAccount)
			{
				this.bankAccount = bankAccount;
			}
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "OfficeID")
		public Office getOffice()
			{
				return this.office;
			}
		
		public void setOffice(Office office)
			{
				this.office = office;
			}
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "PartnerCode")
		public Partner getPartner()
			{
				return this.partner;
			}
		
		public void setPartner(Partner partner)
			{
				this.partner = partner;
			}
		
		@Column(name = "VoucherNo", length = 50)
		public String getVoucherNo()
			{
				return this.voucherNo;
			}
		
		public void setVoucherNo(String voucherNo)
			{
				this.voucherNo = voucherNo;
			}
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ValueDt", length = 16)
		public Date getValueDt()
			{
				return this.valueDt;
			}
		
		public void setValueDt(Date valueDt)
			{
				this.valueDt = valueDt;
			}
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "PostingDt", length = 16)
		public Date getPostingDt()
			{
				return this.postingDt;
			}
		
		public void setPostingDt(Date postingDt)
			{
				this.postingDt = postingDt;
			}
		
		@Column(name = "Description", length = 100)
		public String getDescription()
			{
				return this.description;
			}
		
		public void setDescription(String description)
			{
				this.description = description;
			}
		
		@Column(name = "RcvDsbFlag", length = 1)
		public String getRcvDsbFlag()
			{
				return this.rcvDsbFlag;
			}
		
		public void setRcvDsbFlag(String rcvDsbFlag)
			{
				this.rcvDsbFlag = rcvDsbFlag;
			}
		
		@Column(name = "WOP", length = 5)
		public String getWop()
			{
				return this.wop;
			}
		
		public void setWop(String wop)
			{
				this.wop = wop;
			}
		
		@Column(name = "Amount", precision = 53, scale = 0)
		public Double getAmount()
			{
				return this.amount;
			}
		
		public void setAmount(Double amount)
			{
				this.amount = amount;
			}
		
		@Column(name = "RcvFrom", length = 50)
		public String getRcvFrom()
			{
				return this.rcvFrom;
			}
		
		public void setRcvFrom(String rcvFrom)
			{
				this.rcvFrom = rcvFrom;
			}
		
		@Column(name = "ReffNo", length = 50)
		public String getReffNo()
			{
				return this.reffNo;
			}
		
		public void setReffNo(String reffNo)
			{
				this.reffNo = reffNo;
			}
		
		@Column(name = "ReceiptNo", length = 50)
		public String getReceiptNo()
			{
				return this.receiptNo;
			}
		
		public void setReceiptNo(String receiptNo)
			{
				this.receiptNo = receiptNo;
			}
		
		@Column(name = "CurrID")
		public Long getCurrId()
			{
				return this.currId;
			}
		
		public void setCurrId(Long currId)
			{
				this.currId = currId;
			}
		
		@Column(name = "CashierId")
		public Long getCashierId()
			{
				return this.cashierId;
			}
		
		public void setCashierId(Long cashierId)
			{
				this.cashierId = cashierId;
			}
		
		@Column(name = "OpeningSequence")
		public Integer getOpeningSequence()
			{
				return this.openingSequence;
			}
		
		public void setOpeningSequence(Integer openingSequence)
			{
				this.openingSequence = openingSequence;
			}
		
		@Column(name = "OfficeID_X")
		public Long getOfficeIdX()
			{
				return this.officeIdX;
			}
		
		public void setOfficeIdX(Long officeIdX)
			{
				this.officeIdX = officeIdX;
			}
		
		@Column(name = "IsReconcile", length = 1)
		public String getIsReconcile()
			{
				return this.isReconcile;
			}
		
		public void setIsReconcile(String isReconcile)
			{
				this.isReconcile = isReconcile;
			}
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ReconcileDate", length = 16)
		public Date getReconcileDate()
			{
				return this.reconcileDate;
			}
		
		public void setReconcileDate(Date reconcileDate)
			{
				this.reconcileDate = reconcileDate;
			}
		
		@Column(name = "ReconcileBy", length = 50)
		public String getReconcileBy()
			{
				return this.reconcileBy;
			}
		
		public void setReconcileBy(String reconcileBy)
			{
				this.reconcileBy = reconcileBy;
			}
		
		@Column(name = "JrnlTrxID")
		public Integer getJrnlTrxId()
			{
				return this.jrnlTrxId;
			}
		
		public void setJrnlTrxId(Integer jrnlTrxId)
			{
				this.jrnlTrxId = jrnlTrxId;
			}
		
		@Column(name = "AgrmntID")
		public Long getAgrmntId()
			{
				return this.agrmntId;
			}
		
		public void setAgrmntId(Long agrmntId)
			{
				this.agrmntId = agrmntId;
			}
		
		@Column(name = "JobId")
		public Long getJobId()
			{
				return this.jobId;
			}
		
		public void setJobId(Long jobId)
			{
				this.jobId = jobId;
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
		@Column(name = "DtmUpd", length = 16)
		public Date getDtmUpd()
			{
				return this.dtmUpd;
			}
		
		public void setDtmUpd(Date dtmUpd)
			{
				this.dtmUpd = dtmUpd;
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
		@Column(name = "DtmCrt", length = 16)
		public Date getDtmCrt()
			{
				return this.dtmCrt;
			}
		
		public void setDtmCrt(Date dtmCrt)
			{
				this.dtmCrt = dtmCrt;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "cashBankHdr")
		public Set<CashBankDtl> getCashBankDtls()
			{
				return this.cashBankDtls;
			}
		
		public void setCashBankDtls(Set<CashBankDtl> cashBankDtls)
			{
				this.cashBankDtls = cashBankDtls;
			}
		
	}
