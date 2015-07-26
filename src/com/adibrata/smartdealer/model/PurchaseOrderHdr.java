
package com.adibrata.smartdealer.model;
// Generated Jul 26, 2015 5:46:46 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PurchaseOrderHdr generated by hbm2java
 */
@Entity
@Table(name = "PurchaseOrderHdr", catalog = "SmartDealer")
public class PurchaseOrderHdr implements java.io.Serializable
	{
		
		private long id;
		private Office office;
		private Partner partner;
		private Supplier supplier;
		private String pono;
		private Date podate;
		private Long currencyId;
		private Double currencyRate;
		private Double poamount;
		private Long jobId;
		private String bankCode;
		private String bankBranch;
		private String accountName;
		private String accountNo;
		private Short isMainPo;
		private Date pooriginalExpiredDate;
		private Date poexpiredDate;
		private Short isExpired;
		private Short isEmailSupplier;
		private String emailSupplier;
		private String supplierFaxAreaCode;
		private Short isFaxSupplier;
		private String supplierFaxNumber;
		private Short isEmailInsCo;
		private String emailInsCo;
		private Short isFaxInsCo;
		private String insCoFaxAreaCode;
		private String insCoFaxNumber;
		private Date supplierBillingDate;
		private Date deliveryDate;
		private Short isCancelled;
		private Date cancellationDate;
		private Integer poextendCounter;
		private Short isRcaagain;
		private String notes;
		private Long apid;
		private Double contractPrepaidAmount;
		private Long supplierBankId;
		private String supplierBankBranch;
		private String supplierAccountNo;
		private String supplierAccountName;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<ReturPurchaseHdr> returPurchaseHdrs = new HashSet<ReturPurchaseHdr>(0);
		private Set<PurchaseInvoice> purchaseInvoices = new HashSet<PurchaseInvoice>(0);
		private Set<PurchaseOrderDtl> purchaseOrderDtls = new HashSet<PurchaseOrderDtl>(0);
		
		public PurchaseOrderHdr()
			{
			}
			
		public PurchaseOrderHdr(long id)
			{
				this.id = id;
			}
			
		public PurchaseOrderHdr(long id, Office office, Partner partner, Supplier supplier, String pono, Date podate, Long currencyId, Double currencyRate, Double poamount, Long jobId, String bankCode, String bankBranch, String accountName,
		        String accountNo, Short isMainPo, Date pooriginalExpiredDate, Date poexpiredDate, Short isExpired, Short isEmailSupplier, String emailSupplier, String supplierFaxAreaCode, Short isFaxSupplier, String supplierFaxNumber,
		        Short isEmailInsCo, String emailInsCo, Short isFaxInsCo, String insCoFaxAreaCode, String insCoFaxNumber, Date supplierBillingDate, Date deliveryDate, Short isCancelled, Date cancellationDate, Integer poextendCounter, Short isRcaagain,
		        String notes, Long apid, Double contractPrepaidAmount, Long supplierBankId, String supplierBankBranch, String supplierAccountNo, String supplierAccountName, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt,
		        Set<ReturPurchaseHdr> returPurchaseHdrs, Set<PurchaseInvoice> purchaseInvoices, Set<PurchaseOrderDtl> purchaseOrderDtls)
			{
				this.id = id;
				this.office = office;
				this.partner = partner;
				this.supplier = supplier;
				this.pono = pono;
				this.podate = podate;
				this.currencyId = currencyId;
				this.currencyRate = currencyRate;
				this.poamount = poamount;
				this.jobId = jobId;
				this.bankCode = bankCode;
				this.bankBranch = bankBranch;
				this.accountName = accountName;
				this.accountNo = accountNo;
				this.isMainPo = isMainPo;
				this.pooriginalExpiredDate = pooriginalExpiredDate;
				this.poexpiredDate = poexpiredDate;
				this.isExpired = isExpired;
				this.isEmailSupplier = isEmailSupplier;
				this.emailSupplier = emailSupplier;
				this.supplierFaxAreaCode = supplierFaxAreaCode;
				this.isFaxSupplier = isFaxSupplier;
				this.supplierFaxNumber = supplierFaxNumber;
				this.isEmailInsCo = isEmailInsCo;
				this.emailInsCo = emailInsCo;
				this.isFaxInsCo = isFaxInsCo;
				this.insCoFaxAreaCode = insCoFaxAreaCode;
				this.insCoFaxNumber = insCoFaxNumber;
				this.supplierBillingDate = supplierBillingDate;
				this.deliveryDate = deliveryDate;
				this.isCancelled = isCancelled;
				this.cancellationDate = cancellationDate;
				this.poextendCounter = poextendCounter;
				this.isRcaagain = isRcaagain;
				this.notes = notes;
				this.apid = apid;
				this.contractPrepaidAmount = contractPrepaidAmount;
				this.supplierBankId = supplierBankId;
				this.supplierBankBranch = supplierBankBranch;
				this.supplierAccountNo = supplierAccountNo;
				this.supplierAccountName = supplierAccountName;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.returPurchaseHdrs = returPurchaseHdrs;
				this.purchaseInvoices = purchaseInvoices;
				this.purchaseOrderDtls = purchaseOrderDtls;
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
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "SupplierId")
		public Supplier getSupplier()
			{
				return this.supplier;
			}
			
		public void setSupplier(Supplier supplier)
			{
				this.supplier = supplier;
			}
			
		@Column(name = "PONo", length = 50)
		public String getPono()
			{
				return this.pono;
			}
			
		public void setPono(String pono)
			{
				this.pono = pono;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "PODate", length = 16)
		public Date getPodate()
			{
				return this.podate;
			}
			
		public void setPodate(Date podate)
			{
				this.podate = podate;
			}
			
		@Column(name = "CurrencyID")
		public Long getCurrencyId()
			{
				return this.currencyId;
			}
			
		public void setCurrencyId(Long currencyId)
			{
				this.currencyId = currencyId;
			}
			
		@Column(name = "CurrencyRate", precision = 53, scale = 0)
		public Double getCurrencyRate()
			{
				return this.currencyRate;
			}
			
		public void setCurrencyRate(Double currencyRate)
			{
				this.currencyRate = currencyRate;
			}
			
		@Column(name = "POAmount", precision = 53, scale = 0)
		public Double getPoamount()
			{
				return this.poamount;
			}
			
		public void setPoamount(Double poamount)
			{
				this.poamount = poamount;
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
			
		@Column(name = "BankCode", length = 50)
		public String getBankCode()
			{
				return this.bankCode;
			}
			
		public void setBankCode(String bankCode)
			{
				this.bankCode = bankCode;
			}
			
		@Column(name = "BankBranch", length = 50)
		public String getBankBranch()
			{
				return this.bankBranch;
			}
			
		public void setBankBranch(String bankBranch)
			{
				this.bankBranch = bankBranch;
			}
			
		@Column(name = "AccountName", length = 50)
		public String getAccountName()
			{
				return this.accountName;
			}
			
		public void setAccountName(String accountName)
			{
				this.accountName = accountName;
			}
			
		@Column(name = "AccountNo", length = 25)
		public String getAccountNo()
			{
				return this.accountNo;
			}
			
		public void setAccountNo(String accountNo)
			{
				this.accountNo = accountNo;
			}
			
		@Column(name = "IsMainPO")
		public Short getIsMainPo()
			{
				return this.isMainPo;
			}
			
		public void setIsMainPo(Short isMainPo)
			{
				this.isMainPo = isMainPo;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "POOriginalExpiredDate", length = 23)
		public Date getPooriginalExpiredDate()
			{
				return this.pooriginalExpiredDate;
			}
			
		public void setPooriginalExpiredDate(Date pooriginalExpiredDate)
			{
				this.pooriginalExpiredDate = pooriginalExpiredDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "POExpiredDate", length = 23)
		public Date getPoexpiredDate()
			{
				return this.poexpiredDate;
			}
			
		public void setPoexpiredDate(Date poexpiredDate)
			{
				this.poexpiredDate = poexpiredDate;
			}
			
		@Column(name = "IsExpired")
		public Short getIsExpired()
			{
				return this.isExpired;
			}
			
		public void setIsExpired(Short isExpired)
			{
				this.isExpired = isExpired;
			}
			
		@Column(name = "IsEmailSupplier")
		public Short getIsEmailSupplier()
			{
				return this.isEmailSupplier;
			}
			
		public void setIsEmailSupplier(Short isEmailSupplier)
			{
				this.isEmailSupplier = isEmailSupplier;
			}
			
		@Column(name = "EmailSupplier", length = 50)
		public String getEmailSupplier()
			{
				return this.emailSupplier;
			}
			
		public void setEmailSupplier(String emailSupplier)
			{
				this.emailSupplier = emailSupplier;
			}
			
		@Column(name = "SupplierFaxAreaCode", length = 4)
		public String getSupplierFaxAreaCode()
			{
				return this.supplierFaxAreaCode;
			}
			
		public void setSupplierFaxAreaCode(String supplierFaxAreaCode)
			{
				this.supplierFaxAreaCode = supplierFaxAreaCode;
			}
			
		@Column(name = "IsFaxSupplier")
		public Short getIsFaxSupplier()
			{
				return this.isFaxSupplier;
			}
			
		public void setIsFaxSupplier(Short isFaxSupplier)
			{
				this.isFaxSupplier = isFaxSupplier;
			}
			
		@Column(name = "SupplierFaxNumber", length = 15)
		public String getSupplierFaxNumber()
			{
				return this.supplierFaxNumber;
			}
			
		public void setSupplierFaxNumber(String supplierFaxNumber)
			{
				this.supplierFaxNumber = supplierFaxNumber;
			}
			
		@Column(name = "IsEmailInsCo")
		public Short getIsEmailInsCo()
			{
				return this.isEmailInsCo;
			}
			
		public void setIsEmailInsCo(Short isEmailInsCo)
			{
				this.isEmailInsCo = isEmailInsCo;
			}
			
		@Column(name = "EmailInsCo", length = 50)
		public String getEmailInsCo()
			{
				return this.emailInsCo;
			}
			
		public void setEmailInsCo(String emailInsCo)
			{
				this.emailInsCo = emailInsCo;
			}
			
		@Column(name = "IsFaxInsCo")
		public Short getIsFaxInsCo()
			{
				return this.isFaxInsCo;
			}
			
		public void setIsFaxInsCo(Short isFaxInsCo)
			{
				this.isFaxInsCo = isFaxInsCo;
			}
			
		@Column(name = "InsCoFaxAreaCode", length = 4)
		public String getInsCoFaxAreaCode()
			{
				return this.insCoFaxAreaCode;
			}
			
		public void setInsCoFaxAreaCode(String insCoFaxAreaCode)
			{
				this.insCoFaxAreaCode = insCoFaxAreaCode;
			}
			
		@Column(name = "InsCoFaxNumber", length = 15)
		public String getInsCoFaxNumber()
			{
				return this.insCoFaxNumber;
			}
			
		public void setInsCoFaxNumber(String insCoFaxNumber)
			{
				this.insCoFaxNumber = insCoFaxNumber;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "SupplierBillingDate", length = 23)
		public Date getSupplierBillingDate()
			{
				return this.supplierBillingDate;
			}
			
		public void setSupplierBillingDate(Date supplierBillingDate)
			{
				this.supplierBillingDate = supplierBillingDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DeliveryDate", length = 23)
		public Date getDeliveryDate()
			{
				return this.deliveryDate;
			}
			
		public void setDeliveryDate(Date deliveryDate)
			{
				this.deliveryDate = deliveryDate;
			}
			
		@Column(name = "IsCancelled")
		public Short getIsCancelled()
			{
				return this.isCancelled;
			}
			
		public void setIsCancelled(Short isCancelled)
			{
				this.isCancelled = isCancelled;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "CancellationDate", length = 23)
		public Date getCancellationDate()
			{
				return this.cancellationDate;
			}
			
		public void setCancellationDate(Date cancellationDate)
			{
				this.cancellationDate = cancellationDate;
			}
			
		@Column(name = "POExtendCounter")
		public Integer getPoextendCounter()
			{
				return this.poextendCounter;
			}
			
		public void setPoextendCounter(Integer poextendCounter)
			{
				this.poextendCounter = poextendCounter;
			}
			
		@Column(name = "IsRCAAgain")
		public Short getIsRcaagain()
			{
				return this.isRcaagain;
			}
			
		public void setIsRcaagain(Short isRcaagain)
			{
				this.isRcaagain = isRcaagain;
			}
			
		@Column(name = "Notes", length = 8000)
		public String getNotes()
			{
				return this.notes;
			}
			
		public void setNotes(String notes)
			{
				this.notes = notes;
			}
			
		@Column(name = "APId")
		public Long getApid()
			{
				return this.apid;
			}
			
		public void setApid(Long apid)
			{
				this.apid = apid;
			}
			
		@Column(name = "ContractPrepaidAmount", precision = 53, scale = 0)
		public Double getContractPrepaidAmount()
			{
				return this.contractPrepaidAmount;
			}
			
		public void setContractPrepaidAmount(Double contractPrepaidAmount)
			{
				this.contractPrepaidAmount = contractPrepaidAmount;
			}
			
		@Column(name = "SupplierBankID")
		public Long getSupplierBankId()
			{
				return this.supplierBankId;
			}
			
		public void setSupplierBankId(Long supplierBankId)
			{
				this.supplierBankId = supplierBankId;
			}
			
		@Column(name = "SupplierBankBranch", length = 30)
		public String getSupplierBankBranch()
			{
				return this.supplierBankBranch;
			}
			
		public void setSupplierBankBranch(String supplierBankBranch)
			{
				this.supplierBankBranch = supplierBankBranch;
			}
			
		@Column(name = "SupplierAccountNo", length = 25)
		public String getSupplierAccountNo()
			{
				return this.supplierAccountNo;
			}
			
		public void setSupplierAccountNo(String supplierAccountNo)
			{
				this.supplierAccountNo = supplierAccountNo;
			}
			
		@Column(name = "SupplierAccountName", length = 50)
		public String getSupplierAccountName()
			{
				return this.supplierAccountName;
			}
			
		public void setSupplierAccountName(String supplierAccountName)
			{
				this.supplierAccountName = supplierAccountName;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "purchaseOrderHdr")
		public Set<ReturPurchaseHdr> getReturPurchaseHdrs()
			{
				return this.returPurchaseHdrs;
			}
			
		public void setReturPurchaseHdrs(Set<ReturPurchaseHdr> returPurchaseHdrs)
			{
				this.returPurchaseHdrs = returPurchaseHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "purchaseOrderHdr")
		public Set<PurchaseInvoice> getPurchaseInvoices()
			{
				return this.purchaseInvoices;
			}
			
		public void setPurchaseInvoices(Set<PurchaseInvoice> purchaseInvoices)
			{
				this.purchaseInvoices = purchaseInvoices;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "purchaseOrderHdr")
		public Set<PurchaseOrderDtl> getPurchaseOrderDtls()
			{
				return this.purchaseOrderDtls;
			}
			
		public void setPurchaseOrderDtls(Set<PurchaseOrderDtl> purchaseOrderDtls)
			{
				this.purchaseOrderDtls = purchaseOrderDtls;
			}
			
	}
