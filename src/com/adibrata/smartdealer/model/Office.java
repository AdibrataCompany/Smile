
package com.adibrata.smartdealer.model;
// Generated Aug 31, 2015 2:44:17 PM by Hibernate Tools 4.3.1

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
 * Office generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "Office", catalog = "SmartDealer")
public class Office implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private String officeCode;
		private String name;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String kecamatan;
		private String city;
		private String zipcode;
		private String type;
		private String areaPhone1;
		private String phoneNo1;
		private String areaPhone2;
		private String phoneNo2;
		private String areaFax;
		private String faxNo;
		private String handphone;
		private String fullAddress;
		private String isActive;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<PurchaseOrderHdr> purchaseOrderHdrs = new HashSet<PurchaseOrderHdr>(0);
		private Set<PaymentVoucher> paymentVouchers = new HashSet<PaymentVoucher>(0);
		private Set<SalesInvoice> salesInvoices = new HashSet<SalesInvoice>(0);
		private Set<SalesOrderHdr> salesOrderHdrs = new HashSet<SalesOrderHdr>(0);
		private Set<PdcHdr> pdcHdrs = new HashSet<PdcHdr>(0);
		private Set<ReturSalesHdr> returSalesHdrs = new HashSet<ReturSalesHdr>(0);
		private Set<Employee> employees = new HashSet<Employee>(0);
		private Set<IncoBranchOffice> incoBranchOffices = new HashSet<IncoBranchOffice>(0);
		private Set<Agrmnt> agrmnts = new HashSet<Agrmnt>(0);
		private Set<InsRateToCust> insRateToCusts = new HashSet<InsRateToCust>(0);
		private Set<BankAccount> bankAccounts = new HashSet<BankAccount>(0);
		private Set<AdvanceCash> advanceCashes = new HashSet<AdvanceCash>(0);
		private Set<PettyCashHdr> pettyCashHdrs = new HashSet<PettyCashHdr>(0);
		private Set<ReturPurchaseHdr> returPurchaseHdrs = new HashSet<ReturPurchaseHdr>(0);
		private Set<OtherRcvHdr> otherRcvHdrs = new HashSet<OtherRcvHdr>(0);
		private Set<EntrustHdr> entrustHdrs = new HashSet<EntrustHdr>(0);
		private Set<Invoice> invoices = new HashSet<Invoice>(0);
		private Set<Pdcreceipt> pdcreceipts = new HashSet<Pdcreceipt>(0);
		private Set<SuspendReceive> suspendReceives = new HashSet<SuspendReceive>(0);
		private Set<OtherDsbHdr> otherDsbHdrs = new HashSet<OtherDsbHdr>(0);
		private Set<PurchaseInvoice> purchaseInvoices = new HashSet<PurchaseInvoice>(0);
		private Set<ProductOffering> productOfferings = new HashSet<ProductOffering>(0);
		private Set<CashBankHdr> cashBankHdrs = new HashSet<CashBankHdr>(0);
		private Set<CashierHistory> cashierHistories = new HashSet<CashierHistory>(0);
		private Set<Stock> stocks = new HashSet<Stock>(0);
		private Set<DanaTunai> danaTunais = new HashSet<DanaTunai>(0);
		private Set<PayReqHdr> payReqHdrs = new HashSet<PayReqHdr>(0);
		private Set<AccountPayable> accountPayables = new HashSet<AccountPayable>(0);
		private Set<SuppOfficeInfo> suppOfficeInfos = new HashSet<SuppOfficeInfo>(0);
		private Set<ServiceHdr> serviceHdrs = new HashSet<ServiceHdr>(0);
		
		public Office()
			{
			}
			
		public Office(long id)
			{
				this.id = id;
			}
			
		public Office(long id, Partner partner, String officeCode, String name, String address, String rt, String rw, String kelurahan, String kecamatan, String city, String zipcode, String type, String areaPhone1, String phoneNo1, String areaPhone2,
		        String phoneNo2, String areaFax, String faxNo, String handphone, String fullAddress, String isActive, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<PurchaseOrderHdr> purchaseOrderHdrs,
		        Set<PaymentVoucher> paymentVouchers, Set<SalesInvoice> salesInvoices, Set<SalesOrderHdr> salesOrderHdrs, Set<PdcHdr> pdcHdrs, Set<ReturSalesHdr> returSalesHdrs, Set<Employee> employees, Set<IncoBranchOffice> incoBranchOffices,
		        Set<Agrmnt> agrmnts, Set<InsRateToCust> insRateToCusts, Set<BankAccount> bankAccounts, Set<AdvanceCash> advanceCashes, Set<PettyCashHdr> pettyCashHdrs, Set<ReturPurchaseHdr> returPurchaseHdrs, Set<OtherRcvHdr> otherRcvHdrs,
		        Set<EntrustHdr> entrustHdrs, Set<Invoice> invoices, Set<Pdcreceipt> pdcreceipts, Set<SuspendReceive> suspendReceives, Set<OtherDsbHdr> otherDsbHdrs, Set<PurchaseInvoice> purchaseInvoices, Set<ProductOffering> productOfferings,
		        Set<CashBankHdr> cashBankHdrs, Set<CashierHistory> cashierHistories, Set<Stock> stocks, Set<DanaTunai> danaTunais, Set<PayReqHdr> payReqHdrs, Set<AccountPayable> accountPayables, Set<SuppOfficeInfo> suppOfficeInfos,
		        Set<ServiceHdr> serviceHdrs)
			{
				this.id = id;
				this.partner = partner;
				this.officeCode = officeCode;
				this.name = name;
				this.address = address;
				this.rt = rt;
				this.rw = rw;
				this.kelurahan = kelurahan;
				this.kecamatan = kecamatan;
				this.city = city;
				this.zipcode = zipcode;
				this.type = type;
				this.areaPhone1 = areaPhone1;
				this.phoneNo1 = phoneNo1;
				this.areaPhone2 = areaPhone2;
				this.phoneNo2 = phoneNo2;
				this.areaFax = areaFax;
				this.faxNo = faxNo;
				this.handphone = handphone;
				this.fullAddress = fullAddress;
				this.isActive = isActive;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.purchaseOrderHdrs = purchaseOrderHdrs;
				this.paymentVouchers = paymentVouchers;
				this.salesInvoices = salesInvoices;
				this.salesOrderHdrs = salesOrderHdrs;
				this.pdcHdrs = pdcHdrs;
				this.returSalesHdrs = returSalesHdrs;
				this.employees = employees;
				this.incoBranchOffices = incoBranchOffices;
				this.agrmnts = agrmnts;
				this.insRateToCusts = insRateToCusts;
				this.bankAccounts = bankAccounts;
				this.advanceCashes = advanceCashes;
				this.pettyCashHdrs = pettyCashHdrs;
				this.returPurchaseHdrs = returPurchaseHdrs;
				this.otherRcvHdrs = otherRcvHdrs;
				this.entrustHdrs = entrustHdrs;
				this.invoices = invoices;
				this.pdcreceipts = pdcreceipts;
				this.suspendReceives = suspendReceives;
				this.otherDsbHdrs = otherDsbHdrs;
				this.purchaseInvoices = purchaseInvoices;
				this.productOfferings = productOfferings;
				this.cashBankHdrs = cashBankHdrs;
				this.cashierHistories = cashierHistories;
				this.stocks = stocks;
				this.danaTunais = danaTunais;
				this.payReqHdrs = payReqHdrs;
				this.accountPayables = accountPayables;
				this.suppOfficeInfos = suppOfficeInfos;
				this.serviceHdrs = serviceHdrs;
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
		@JoinColumn(name = "PartnerCode")
		public Partner getPartner()
			{
				return this.partner;
			}
			
		public void setPartner(Partner partner)
			{
				this.partner = partner;
			}
			
		@Column(name = "OfficeCode", length = 50)
		public String getOfficeCode()
			{
				return this.officeCode;
			}
			
		public void setOfficeCode(String officeCode)
			{
				this.officeCode = officeCode;
			}
			
		@Column(name = "Name", length = 50)
		public String getName()
			{
				return this.name;
			}
			
		public void setName(String name)
			{
				this.name = name;
			}
			
		@Column(name = "Address")
		public String getAddress()
			{
				return this.address;
			}
			
		public void setAddress(String address)
			{
				this.address = address;
			}
			
		@Column(name = "RT", length = 4)
		public String getRt()
			{
				return this.rt;
			}
			
		public void setRt(String rt)
			{
				this.rt = rt;
			}
			
		@Column(name = "RW", length = 4)
		public String getRw()
			{
				return this.rw;
			}
			
		public void setRw(String rw)
			{
				this.rw = rw;
			}
			
		@Column(name = "Kelurahan", length = 50)
		public String getKelurahan()
			{
				return this.kelurahan;
			}
			
		public void setKelurahan(String kelurahan)
			{
				this.kelurahan = kelurahan;
			}
			
		@Column(name = "Kecamatan", length = 20)
		public String getKecamatan()
			{
				return this.kecamatan;
			}
			
		public void setKecamatan(String kecamatan)
			{
				this.kecamatan = kecamatan;
			}
			
		@Column(name = "City", length = 50)
		public String getCity()
			{
				return this.city;
			}
			
		public void setCity(String city)
			{
				this.city = city;
			}
			
		@Column(name = "Zipcode", length = 50)
		public String getZipcode()
			{
				return this.zipcode;
			}
			
		public void setZipcode(String zipcode)
			{
				this.zipcode = zipcode;
			}
			
		@Column(name = "Type", length = 2)
		public String getType()
			{
				return this.type;
			}
			
		public void setType(String type)
			{
				this.type = type;
			}
			
		@Column(name = "AreaPhone1", length = 4)
		public String getAreaPhone1()
			{
				return this.areaPhone1;
			}
			
		public void setAreaPhone1(String areaPhone1)
			{
				this.areaPhone1 = areaPhone1;
			}
			
		@Column(name = "PhoneNo1", length = 20)
		public String getPhoneNo1()
			{
				return this.phoneNo1;
			}
			
		public void setPhoneNo1(String phoneNo1)
			{
				this.phoneNo1 = phoneNo1;
			}
			
		@Column(name = "AreaPhone2", length = 4)
		public String getAreaPhone2()
			{
				return this.areaPhone2;
			}
			
		public void setAreaPhone2(String areaPhone2)
			{
				this.areaPhone2 = areaPhone2;
			}
			
		@Column(name = "PhoneNo2", length = 20)
		public String getPhoneNo2()
			{
				return this.phoneNo2;
			}
			
		public void setPhoneNo2(String phoneNo2)
			{
				this.phoneNo2 = phoneNo2;
			}
			
		@Column(name = "AreaFax", length = 4)
		public String getAreaFax()
			{
				return this.areaFax;
			}
			
		public void setAreaFax(String areaFax)
			{
				this.areaFax = areaFax;
			}
			
		@Column(name = "FaxNo", length = 20)
		public String getFaxNo()
			{
				return this.faxNo;
			}
			
		public void setFaxNo(String faxNo)
			{
				this.faxNo = faxNo;
			}
			
		@Column(name = "Handphone", length = 20)
		public String getHandphone()
			{
				return this.handphone;
			}
			
		public void setHandphone(String handphone)
			{
				this.handphone = handphone;
			}
			
		@Column(name = "FullAddress", length = 500)
		public String getFullAddress()
			{
				return this.fullAddress;
			}
			
		public void setFullAddress(String fullAddress)
			{
				this.fullAddress = fullAddress;
			}
			
		@Column(name = "IsActive", length = 50)
		public String getIsActive()
			{
				return this.isActive;
			}
			
		public void setIsActive(String isActive)
			{
				this.isActive = isActive;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmUpd", length = 23)
		public Date getDtmUpd()
			{
				return this.dtmUpd;
			}
			
		public void setDtmUpd(Date dtmUpd)
			{
				this.dtmUpd = dtmUpd;
			}
			
		@Column(name = "UsrUpd")
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		public void setUsrUpd(String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmCrt", length = 23)
		public Date getDtmCrt()
			{
				return this.dtmCrt;
			}
			
		public void setDtmCrt(Date dtmCrt)
			{
				this.dtmCrt = dtmCrt;
			}
			
		@Column(name = "UsrCrt")
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		public void setUsrCrt(String usrCrt)
			{
				this.usrCrt = usrCrt;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<PurchaseOrderHdr> getPurchaseOrderHdrs()
			{
				return this.purchaseOrderHdrs;
			}
			
		public void setPurchaseOrderHdrs(Set<PurchaseOrderHdr> purchaseOrderHdrs)
			{
				this.purchaseOrderHdrs = purchaseOrderHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<PaymentVoucher> getPaymentVouchers()
			{
				return this.paymentVouchers;
			}
			
		public void setPaymentVouchers(Set<PaymentVoucher> paymentVouchers)
			{
				this.paymentVouchers = paymentVouchers;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<SalesInvoice> getSalesInvoices()
			{
				return this.salesInvoices;
			}
			
		public void setSalesInvoices(Set<SalesInvoice> salesInvoices)
			{
				this.salesInvoices = salesInvoices;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<SalesOrderHdr> getSalesOrderHdrs()
			{
				return this.salesOrderHdrs;
			}
			
		public void setSalesOrderHdrs(Set<SalesOrderHdr> salesOrderHdrs)
			{
				this.salesOrderHdrs = salesOrderHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<PdcHdr> getPdcHdrs()
			{
				return this.pdcHdrs;
			}
			
		public void setPdcHdrs(Set<PdcHdr> pdcHdrs)
			{
				this.pdcHdrs = pdcHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<ReturSalesHdr> getReturSalesHdrs()
			{
				return this.returSalesHdrs;
			}
			
		public void setReturSalesHdrs(Set<ReturSalesHdr> returSalesHdrs)
			{
				this.returSalesHdrs = returSalesHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<Employee> getEmployees()
			{
				return this.employees;
			}
			
		public void setEmployees(Set<Employee> employees)
			{
				this.employees = employees;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<IncoBranchOffice> getIncoBranchOffices()
			{
				return this.incoBranchOffices;
			}
			
		public void setIncoBranchOffices(Set<IncoBranchOffice> incoBranchOffices)
			{
				this.incoBranchOffices = incoBranchOffices;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<Agrmnt> getAgrmnts()
			{
				return this.agrmnts;
			}
			
		public void setAgrmnts(Set<Agrmnt> agrmnts)
			{
				this.agrmnts = agrmnts;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<InsRateToCust> getInsRateToCusts()
			{
				return this.insRateToCusts;
			}
			
		public void setInsRateToCusts(Set<InsRateToCust> insRateToCusts)
			{
				this.insRateToCusts = insRateToCusts;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<BankAccount> getBankAccounts()
			{
				return this.bankAccounts;
			}
			
		public void setBankAccounts(Set<BankAccount> bankAccounts)
			{
				this.bankAccounts = bankAccounts;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<AdvanceCash> getAdvanceCashes()
			{
				return this.advanceCashes;
			}
			
		public void setAdvanceCashes(Set<AdvanceCash> advanceCashes)
			{
				this.advanceCashes = advanceCashes;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<PettyCashHdr> getPettyCashHdrs()
			{
				return this.pettyCashHdrs;
			}
			
		public void setPettyCashHdrs(Set<PettyCashHdr> pettyCashHdrs)
			{
				this.pettyCashHdrs = pettyCashHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<ReturPurchaseHdr> getReturPurchaseHdrs()
			{
				return this.returPurchaseHdrs;
			}
			
		public void setReturPurchaseHdrs(Set<ReturPurchaseHdr> returPurchaseHdrs)
			{
				this.returPurchaseHdrs = returPurchaseHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<OtherRcvHdr> getOtherRcvHdrs()
			{
				return this.otherRcvHdrs;
			}
			
		public void setOtherRcvHdrs(Set<OtherRcvHdr> otherRcvHdrs)
			{
				this.otherRcvHdrs = otherRcvHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<EntrustHdr> getEntrustHdrs()
			{
				return this.entrustHdrs;
			}
			
		public void setEntrustHdrs(Set<EntrustHdr> entrustHdrs)
			{
				this.entrustHdrs = entrustHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<Invoice> getInvoices()
			{
				return this.invoices;
			}
			
		public void setInvoices(Set<Invoice> invoices)
			{
				this.invoices = invoices;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<Pdcreceipt> getPdcreceipts()
			{
				return this.pdcreceipts;
			}
			
		public void setPdcreceipts(Set<Pdcreceipt> pdcreceipts)
			{
				this.pdcreceipts = pdcreceipts;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<SuspendReceive> getSuspendReceives()
			{
				return this.suspendReceives;
			}
			
		public void setSuspendReceives(Set<SuspendReceive> suspendReceives)
			{
				this.suspendReceives = suspendReceives;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<OtherDsbHdr> getOtherDsbHdrs()
			{
				return this.otherDsbHdrs;
			}
			
		public void setOtherDsbHdrs(Set<OtherDsbHdr> otherDsbHdrs)
			{
				this.otherDsbHdrs = otherDsbHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<PurchaseInvoice> getPurchaseInvoices()
			{
				return this.purchaseInvoices;
			}
			
		public void setPurchaseInvoices(Set<PurchaseInvoice> purchaseInvoices)
			{
				this.purchaseInvoices = purchaseInvoices;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<ProductOffering> getProductOfferings()
			{
				return this.productOfferings;
			}
			
		public void setProductOfferings(Set<ProductOffering> productOfferings)
			{
				this.productOfferings = productOfferings;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<CashBankHdr> getCashBankHdrs()
			{
				return this.cashBankHdrs;
			}
			
		public void setCashBankHdrs(Set<CashBankHdr> cashBankHdrs)
			{
				this.cashBankHdrs = cashBankHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<CashierHistory> getCashierHistories()
			{
				return this.cashierHistories;
			}
			
		public void setCashierHistories(Set<CashierHistory> cashierHistories)
			{
				this.cashierHistories = cashierHistories;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<Stock> getStocks()
			{
				return this.stocks;
			}
			
		public void setStocks(Set<Stock> stocks)
			{
				this.stocks = stocks;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<DanaTunai> getDanaTunais()
			{
				return this.danaTunais;
			}
			
		public void setDanaTunais(Set<DanaTunai> danaTunais)
			{
				this.danaTunais = danaTunais;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<PayReqHdr> getPayReqHdrs()
			{
				return this.payReqHdrs;
			}
			
		public void setPayReqHdrs(Set<PayReqHdr> payReqHdrs)
			{
				this.payReqHdrs = payReqHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<AccountPayable> getAccountPayables()
			{
				return this.accountPayables;
			}
			
		public void setAccountPayables(Set<AccountPayable> accountPayables)
			{
				this.accountPayables = accountPayables;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<SuppOfficeInfo> getSuppOfficeInfos()
			{
				return this.suppOfficeInfos;
			}
			
		public void setSuppOfficeInfos(Set<SuppOfficeInfo> suppOfficeInfos)
			{
				this.suppOfficeInfos = suppOfficeInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
		public Set<ServiceHdr> getServiceHdrs()
			{
				return this.serviceHdrs;
			}
			
		public void setServiceHdrs(Set<ServiceHdr> serviceHdrs)
			{
				this.serviceHdrs = serviceHdrs;
			}
			
	}
