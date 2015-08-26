
package com.adibrata.smartdealer.model;
// Generated Aug 26, 2015 2:55:57 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PdcHdr generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "PdcHdr", catalog = "SmartDealer")
public class PdcHdr implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private BankAccount bankAccount;
		private Office office;
		private Partner partner;
		private Pdcreceipt pdcreceipt;
		private String bankCode;
		private String pdcname;
		private Date pdcDuedate;
		private Double pdcAmount;
		private Double clearAmount;
		private String type;
		private String status;
		private String fisikStatus;
		private Short isReconcile;
		private Date reconcileDate;
		private Date holdUntildate;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<PdcHistory> pdcHistories = new HashSet<PdcHistory>(0);
		private Set<PdcDtl> pdcDtls = new HashSet<PdcDtl>(0);
		private Set<PdcClear> pdcClears = new HashSet<PdcClear>(0);
		
		public PdcHdr()
			{
			}
			
		public PdcHdr(long id)
			{
				this.id = id;
			}
			
		public PdcHdr(long id, Agrmnt agrmnt, BankAccount bankAccount, Office office, Partner partner, Pdcreceipt pdcreceipt, String bankCode, String pdcname, Date pdcDuedate, Double pdcAmount, Double clearAmount, String type, String status,
		        String fisikStatus, Short isReconcile, Date reconcileDate, Date holdUntildate, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<PdcHistory> pdcHistories, Set<PdcDtl> pdcDtls, Set<PdcClear> pdcClears)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.bankAccount = bankAccount;
				this.office = office;
				this.partner = partner;
				this.pdcreceipt = pdcreceipt;
				this.bankCode = bankCode;
				this.pdcname = pdcname;
				this.pdcDuedate = pdcDuedate;
				this.pdcAmount = pdcAmount;
				this.clearAmount = clearAmount;
				this.type = type;
				this.status = status;
				this.fisikStatus = fisikStatus;
				this.isReconcile = isReconcile;
				this.reconcileDate = reconcileDate;
				this.holdUntildate = holdUntildate;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.pdcHistories = pdcHistories;
				this.pdcDtls = pdcDtls;
				this.pdcClears = pdcClears;
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
		@JoinColumn(name = "AgrmntId")
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		public void setAgrmnt(Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "BankAccountId")
		public BankAccount getBankAccount()
			{
				return this.bankAccount;
			}
			
		public void setBankAccount(BankAccount bankAccount)
			{
				this.bankAccount = bankAccount;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "OfficeId")
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
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "PDCReceiptId")
		public Pdcreceipt getPdcreceipt()
			{
				return this.pdcreceipt;
			}
			
		public void setPdcreceipt(Pdcreceipt pdcreceipt)
			{
				this.pdcreceipt = pdcreceipt;
			}
			
		@Column(name = "BankCode", length = 20)
		public String getBankCode()
			{
				return this.bankCode;
			}
			
		public void setBankCode(String bankCode)
			{
				this.bankCode = bankCode;
			}
			
		@Column(name = "PDCName", length = 50)
		public String getPdcname()
			{
				return this.pdcname;
			}
			
		public void setPdcname(String pdcname)
			{
				this.pdcname = pdcname;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "PdcDuedate", length = 23)
		public Date getPdcDuedate()
			{
				return this.pdcDuedate;
			}
			
		public void setPdcDuedate(Date pdcDuedate)
			{
				this.pdcDuedate = pdcDuedate;
			}
			
		@Column(name = "PdcAmount", precision = 53, scale = 0)
		public Double getPdcAmount()
			{
				return this.pdcAmount;
			}
			
		public void setPdcAmount(Double pdcAmount)
			{
				this.pdcAmount = pdcAmount;
			}
			
		@Column(name = "ClearAmount", precision = 53, scale = 0)
		public Double getClearAmount()
			{
				return this.clearAmount;
			}
			
		public void setClearAmount(Double clearAmount)
			{
				this.clearAmount = clearAmount;
			}
			
		@Column(name = "Type", length = 10)
		public String getType()
			{
				return this.type;
			}
			
		public void setType(String type)
			{
				this.type = type;
			}
			
		@Column(name = "Status", length = 5)
		public String getStatus()
			{
				return this.status;
			}
			
		public void setStatus(String status)
			{
				this.status = status;
			}
			
		@Column(name = "FisikStatus", length = 5)
		public String getFisikStatus()
			{
				return this.fisikStatus;
			}
			
		public void setFisikStatus(String fisikStatus)
			{
				this.fisikStatus = fisikStatus;
			}
			
		@Column(name = "IsReconcile")
		public Short getIsReconcile()
			{
				return this.isReconcile;
			}
			
		public void setIsReconcile(Short isReconcile)
			{
				this.isReconcile = isReconcile;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ReconcileDate", length = 23)
		public Date getReconcileDate()
			{
				return this.reconcileDate;
			}
			
		public void setReconcileDate(Date reconcileDate)
			{
				this.reconcileDate = reconcileDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "HoldUntildate", length = 23)
		public Date getHoldUntildate()
			{
				return this.holdUntildate;
			}
			
		public void setHoldUntildate(Date holdUntildate)
			{
				this.holdUntildate = holdUntildate;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdcHdr")
		public Set<PdcHistory> getPdcHistories()
			{
				return this.pdcHistories;
			}
			
		public void setPdcHistories(Set<PdcHistory> pdcHistories)
			{
				this.pdcHistories = pdcHistories;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdcHdr")
		public Set<PdcDtl> getPdcDtls()
			{
				return this.pdcDtls;
			}
			
		public void setPdcDtls(Set<PdcDtl> pdcDtls)
			{
				this.pdcDtls = pdcDtls;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdcHdr")
		public Set<PdcClear> getPdcClears()
			{
				return this.pdcClears;
			}
			
		public void setPdcClears(Set<PdcClear> pdcClears)
			{
				this.pdcClears = pdcClears;
			}
			
	}
