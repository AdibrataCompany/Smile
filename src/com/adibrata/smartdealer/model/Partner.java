
package com.adibrata.smartdealer.model;
// Generated Sep 27, 2015 10:48:45 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Partner generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "Partner", catalog = "SmartDealer")
public class Partner implements java.io.Serializable
	{
		
		private String partnerCode;
		private String name;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
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
		private Date businessDate;
		private Date boddate;
		private Date eoddate;
		private Date bdprevious;
		private Date nextBusinessDate;
		private Date eomprevious;
		private Date eomnext;
		private Short isBranchClosed;
		private Short isCashierClosed;
		private Short isActive;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<AssetMaster> assetMasters = new HashSet<AssetMaster>(0);
		private Set<PdcHdr> pdcHdrs = new HashSet<PdcHdr>(0);
		private Set<TransJob> transJobs = new HashSet<TransJob>(0);
		private Set<MsUser> msUsers = new HashSet<MsUser>(0);
		private Set<PayReqHdr> payReqHdrs = new HashSet<PayReqHdr>(0);
		private Set<Supplier> suppliers = new HashSet<Supplier>(0);
		private Set<PurchaseOrderHdr> purchaseOrderHdrs = new HashSet<PurchaseOrderHdr>(0);
		private Set<Taksasi> taksasis = new HashSet<Taksasi>(0);
		private Set<CashierHistory> cashierHistories = new HashSet<CashierHistory>(0);
		private Set<Customer> customers = new HashSet<Customer>(0);
		private Set<AccountPayable> accountPayables = new HashSet<AccountPayable>(0);
		private Set<Agrmnt> agrmnts = new HashSet<Agrmnt>(0);
		private Set<SalesOrderHdr> salesOrderHdrs = new HashSet<SalesOrderHdr>(0);
		private Set<EntrustHdr> entrustHdrs = new HashSet<EntrustHdr>(0);
		private Set<OtherRcvHdr> otherRcvHdrs = new HashSet<OtherRcvHdr>(0);
		private Set<InsCompany> insCompanies = new HashSet<InsCompany>(0);
		private Set<CashBankHdr> cashBankHdrs = new HashSet<CashBankHdr>(0);
		private Set<CoaSchmHdr> coaSchmHdrs = new HashSet<CoaSchmHdr>(0);
		private Set<Invoice> invoices = new HashSet<Invoice>(0);
		private Set<Coamaster> coamasters = new HashSet<Coamaster>(0);
		private Set<ResetPasswordLog> resetPasswordLogs = new HashSet<ResetPasswordLog>(0);
		private Set<Office> offices = new HashSet<Office>(0);
		private Set<BankAccount> bankAccounts = new HashSet<BankAccount>(0);
		private Set<MsRole> msRoles = new HashSet<MsRole>(0);
		private Set<ReturSalesHdr> returSalesHdrs = new HashSet<ReturSalesHdr>(0);
		private Set<Stock> stocks = new HashSet<Stock>(0);
		private Set<InsAsset> insAssets = new HashSet<InsAsset>(0);
		private Set<PettyCashHdr> pettyCashHdrs = new HashSet<PettyCashHdr>(0);
		private Set<AdvanceCash> advanceCashes = new HashSet<AdvanceCash>(0);
		private Set<AssetDocMaster> assetDocMasters = new HashSet<AssetDocMaster>(0);
		private Set<TrxSeqNo> trxSeqNos = new HashSet<TrxSeqNo>(0);
		private Set<DanaTunai> danaTunais = new HashSet<DanaTunai>(0);
		private Set<Pdcreceipt> pdcreceipts = new HashSet<Pdcreceipt>(0);
		private Set<MsTable> msTables = new HashSet<MsTable>(0);
		private Set<Workshop> workshops = new HashSet<Workshop>(0);
		private Set<AssetServiceHdr> assetServiceHdrs = new HashSet<AssetServiceHdr>(0);
		private Set<Currency> currencies = new HashSet<Currency>(0);
		private Set<PaymentVoucher> paymentVouchers = new HashSet<PaymentVoucher>(0);
		private Set<ServiceHdr> serviceHdrs = new HashSet<ServiceHdr>(0);
		private Set<ProductOffering> productOfferings = new HashSet<ProductOffering>(0);
		private Set<ReturPurchaseHdr> returPurchaseHdrs = new HashSet<ReturPurchaseHdr>(0);
		private Set<SalesInvoice> salesInvoices = new HashSet<SalesInvoice>(0);
		private Set<JrnlHdr> jrnlHdrs = new HashSet<JrnlHdr>(0);
		private Set<OtherDsbHdr> otherDsbHdrs = new HashSet<OtherDsbHdr>(0);
		private Set<InsRateToCust> insRateToCusts = new HashSet<InsRateToCust>(0);
		private Set<SuspendReceive> suspendReceives = new HashSet<SuspendReceive>(0);
		private Set<PurchaseInvoice> purchaseInvoices = new HashSet<PurchaseInvoice>(0);
		private Set<InsDocMaster> insDocMasters = new HashSet<InsDocMaster>(0);
		private Set<AssetServiceMaster> assetServiceMasters = new HashSet<AssetServiceMaster>(0);
		private Set<AssetType> assetTypes = new HashSet<AssetType>(0);
		private Set<Employee> employees = new HashSet<Employee>(0);
		private Set<Product> products = new HashSet<Product>(0);
		private Set<MsUserRole> msUserRoles = new HashSet<MsUserRole>(0);
		
		public Partner()
			{
			}
			
		public Partner(String partnerCode)
			{
				this.partnerCode = partnerCode;
			}
			
		public Partner(String partnerCode, String name, String address, String rt, String rw, String kelurahan, String city, String zipcode, String type, String areaPhone1, String phoneNo1, String areaPhone2, String phoneNo2, String areaFax,
		        String faxNo, String handphone, String fullAddress, Date businessDate, Date boddate, Date eoddate, Date bdprevious, Date nextBusinessDate, Date eomprevious, Date eomnext, Short isBranchClosed, Short isCashierClosed, Short isActive,
		        Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<AssetMaster> assetMasters, Set<PdcHdr> pdcHdrs, Set<TransJob> transJobs, Set<MsUser> msUsers, Set<PayReqHdr> payReqHdrs, Set<Supplier> suppliers,
		        Set<PurchaseOrderHdr> purchaseOrderHdrs, Set<Taksasi> taksasis, Set<CashierHistory> cashierHistories, Set<Customer> customers, Set<AccountPayable> accountPayables, Set<Agrmnt> agrmnts, Set<SalesOrderHdr> salesOrderHdrs,
		        Set<EntrustHdr> entrustHdrs, Set<OtherRcvHdr> otherRcvHdrs, Set<InsCompany> insCompanies, Set<CashBankHdr> cashBankHdrs, Set<CoaSchmHdr> coaSchmHdrs, Set<Invoice> invoices, Set<Coamaster> coamasters,
		        Set<ResetPasswordLog> resetPasswordLogs, Set<Office> offices, Set<BankAccount> bankAccounts, Set<MsRole> msRoles, Set<ReturSalesHdr> returSalesHdrs, Set<Stock> stocks, Set<InsAsset> insAssets, Set<PettyCashHdr> pettyCashHdrs,
		        Set<AdvanceCash> advanceCashes, Set<AssetDocMaster> assetDocMasters, Set<TrxSeqNo> trxSeqNos, Set<DanaTunai> danaTunais, Set<Pdcreceipt> pdcreceipts, Set<MsTable> msTables, Set<Workshop> workshops,
		        Set<AssetServiceHdr> assetServiceHdrs, Set<Currency> currencies, Set<PaymentVoucher> paymentVouchers, Set<ServiceHdr> serviceHdrs, Set<ProductOffering> productOfferings, Set<ReturPurchaseHdr> returPurchaseHdrs,
		        Set<SalesInvoice> salesInvoices, Set<JrnlHdr> jrnlHdrs, Set<OtherDsbHdr> otherDsbHdrs, Set<InsRateToCust> insRateToCusts, Set<SuspendReceive> suspendReceives, Set<PurchaseInvoice> purchaseInvoices, Set<InsDocMaster> insDocMasters,
		        Set<AssetServiceMaster> assetServiceMasters, Set<AssetType> assetTypes, Set<Employee> employees, Set<Product> products, Set<MsUserRole> msUserRoles)
			{
				this.partnerCode = partnerCode;
				this.name = name;
				this.address = address;
				this.rt = rt;
				this.rw = rw;
				this.kelurahan = kelurahan;
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
				this.businessDate = businessDate;
				this.boddate = boddate;
				this.eoddate = eoddate;
				this.bdprevious = bdprevious;
				this.nextBusinessDate = nextBusinessDate;
				this.eomprevious = eomprevious;
				this.eomnext = eomnext;
				this.isBranchClosed = isBranchClosed;
				this.isCashierClosed = isCashierClosed;
				this.isActive = isActive;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.assetMasters = assetMasters;
				this.pdcHdrs = pdcHdrs;
				this.transJobs = transJobs;
				this.msUsers = msUsers;
				this.payReqHdrs = payReqHdrs;
				this.suppliers = suppliers;
				this.purchaseOrderHdrs = purchaseOrderHdrs;
				this.taksasis = taksasis;
				this.cashierHistories = cashierHistories;
				this.customers = customers;
				this.accountPayables = accountPayables;
				this.agrmnts = agrmnts;
				this.salesOrderHdrs = salesOrderHdrs;
				this.entrustHdrs = entrustHdrs;
				this.otherRcvHdrs = otherRcvHdrs;
				this.insCompanies = insCompanies;
				this.cashBankHdrs = cashBankHdrs;
				this.coaSchmHdrs = coaSchmHdrs;
				this.invoices = invoices;
				this.coamasters = coamasters;
				this.resetPasswordLogs = resetPasswordLogs;
				this.offices = offices;
				this.bankAccounts = bankAccounts;
				this.msRoles = msRoles;
				this.returSalesHdrs = returSalesHdrs;
				this.stocks = stocks;
				this.insAssets = insAssets;
				this.pettyCashHdrs = pettyCashHdrs;
				this.advanceCashes = advanceCashes;
				this.assetDocMasters = assetDocMasters;
				this.trxSeqNos = trxSeqNos;
				this.danaTunais = danaTunais;
				this.pdcreceipts = pdcreceipts;
				this.msTables = msTables;
				this.workshops = workshops;
				this.assetServiceHdrs = assetServiceHdrs;
				this.currencies = currencies;
				this.paymentVouchers = paymentVouchers;
				this.serviceHdrs = serviceHdrs;
				this.productOfferings = productOfferings;
				this.returPurchaseHdrs = returPurchaseHdrs;
				this.salesInvoices = salesInvoices;
				this.jrnlHdrs = jrnlHdrs;
				this.otherDsbHdrs = otherDsbHdrs;
				this.insRateToCusts = insRateToCusts;
				this.suspendReceives = suspendReceives;
				this.purchaseInvoices = purchaseInvoices;
				this.insDocMasters = insDocMasters;
				this.assetServiceMasters = assetServiceMasters;
				this.assetTypes = assetTypes;
				this.employees = employees;
				this.products = products;
				this.msUserRoles = msUserRoles;
			}
			
		@Id @GeneratedValue(strategy=GenerationType.AUTO)
		
		@Column(name = "PartnerCode", unique = true, nullable = false, length = 20)
		public String getPartnerCode()
			{
				return this.partnerCode;
			}
			
		public void setPartnerCode(String partnerCode)
			{
				this.partnerCode = partnerCode;
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
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "BusinessDate", length = 23)
		public Date getBusinessDate()
			{
				return this.businessDate;
			}
			
		public void setBusinessDate(Date businessDate)
			{
				this.businessDate = businessDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "BODDate", length = 23)
		public Date getBoddate()
			{
				return this.boddate;
			}
			
		public void setBoddate(Date boddate)
			{
				this.boddate = boddate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "EODDate", length = 23)
		public Date getEoddate()
			{
				return this.eoddate;
			}
			
		public void setEoddate(Date eoddate)
			{
				this.eoddate = eoddate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "BDPrevious", length = 23)
		public Date getBdprevious()
			{
				return this.bdprevious;
			}
			
		public void setBdprevious(Date bdprevious)
			{
				this.bdprevious = bdprevious;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "NextBusinessDate", length = 23)
		public Date getNextBusinessDate()
			{
				return this.nextBusinessDate;
			}
			
		public void setNextBusinessDate(Date nextBusinessDate)
			{
				this.nextBusinessDate = nextBusinessDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "EOMPrevious", length = 23)
		public Date getEomprevious()
			{
				return this.eomprevious;
			}
			
		public void setEomprevious(Date eomprevious)
			{
				this.eomprevious = eomprevious;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "EOMNext", length = 23)
		public Date getEomnext()
			{
				return this.eomnext;
			}
			
		public void setEomnext(Date eomnext)
			{
				this.eomnext = eomnext;
			}
			
		@Column(name = "IsBranchClosed")
		public Short getIsBranchClosed()
			{
				return this.isBranchClosed;
			}
			
		public void setIsBranchClosed(Short isBranchClosed)
			{
				this.isBranchClosed = isBranchClosed;
			}
			
		@Column(name = "IsCashierClosed")
		public Short getIsCashierClosed()
			{
				return this.isCashierClosed;
			}
			
		public void setIsCashierClosed(Short isCashierClosed)
			{
				this.isCashierClosed = isCashierClosed;
			}
			
		@Column(name = "IsActive")
		public Short getIsActive()
			{
				return this.isActive;
			}
			
		public void setIsActive(Short isActive)
			{
				this.isActive = isActive;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<AssetMaster> getAssetMasters()
			{
				return this.assetMasters;
			}
			
		public void setAssetMasters(Set<AssetMaster> assetMasters)
			{
				this.assetMasters = assetMasters;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<PdcHdr> getPdcHdrs()
			{
				return this.pdcHdrs;
			}
			
		public void setPdcHdrs(Set<PdcHdr> pdcHdrs)
			{
				this.pdcHdrs = pdcHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<TransJob> getTransJobs()
			{
				return this.transJobs;
			}
			
		public void setTransJobs(Set<TransJob> transJobs)
			{
				this.transJobs = transJobs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<MsUser> getMsUsers()
			{
				return this.msUsers;
			}
			
		public void setMsUsers(Set<MsUser> msUsers)
			{
				this.msUsers = msUsers;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<PayReqHdr> getPayReqHdrs()
			{
				return this.payReqHdrs;
			}
			
		public void setPayReqHdrs(Set<PayReqHdr> payReqHdrs)
			{
				this.payReqHdrs = payReqHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<Supplier> getSuppliers()
			{
				return this.suppliers;
			}
			
		public void setSuppliers(Set<Supplier> suppliers)
			{
				this.suppliers = suppliers;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<PurchaseOrderHdr> getPurchaseOrderHdrs()
			{
				return this.purchaseOrderHdrs;
			}
			
		public void setPurchaseOrderHdrs(Set<PurchaseOrderHdr> purchaseOrderHdrs)
			{
				this.purchaseOrderHdrs = purchaseOrderHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<Taksasi> getTaksasis()
			{
				return this.taksasis;
			}
			
		public void setTaksasis(Set<Taksasi> taksasis)
			{
				this.taksasis = taksasis;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<CashierHistory> getCashierHistories()
			{
				return this.cashierHistories;
			}
			
		public void setCashierHistories(Set<CashierHistory> cashierHistories)
			{
				this.cashierHistories = cashierHistories;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<Customer> getCustomers()
			{
				return this.customers;
			}
			
		public void setCustomers(Set<Customer> customers)
			{
				this.customers = customers;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<AccountPayable> getAccountPayables()
			{
				return this.accountPayables;
			}
			
		public void setAccountPayables(Set<AccountPayable> accountPayables)
			{
				this.accountPayables = accountPayables;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<Agrmnt> getAgrmnts()
			{
				return this.agrmnts;
			}
			
		public void setAgrmnts(Set<Agrmnt> agrmnts)
			{
				this.agrmnts = agrmnts;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<SalesOrderHdr> getSalesOrderHdrs()
			{
				return this.salesOrderHdrs;
			}
			
		public void setSalesOrderHdrs(Set<SalesOrderHdr> salesOrderHdrs)
			{
				this.salesOrderHdrs = salesOrderHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<EntrustHdr> getEntrustHdrs()
			{
				return this.entrustHdrs;
			}
			
		public void setEntrustHdrs(Set<EntrustHdr> entrustHdrs)
			{
				this.entrustHdrs = entrustHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<OtherRcvHdr> getOtherRcvHdrs()
			{
				return this.otherRcvHdrs;
			}
			
		public void setOtherRcvHdrs(Set<OtherRcvHdr> otherRcvHdrs)
			{
				this.otherRcvHdrs = otherRcvHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<InsCompany> getInsCompanies()
			{
				return this.insCompanies;
			}
			
		public void setInsCompanies(Set<InsCompany> insCompanies)
			{
				this.insCompanies = insCompanies;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<CashBankHdr> getCashBankHdrs()
			{
				return this.cashBankHdrs;
			}
			
		public void setCashBankHdrs(Set<CashBankHdr> cashBankHdrs)
			{
				this.cashBankHdrs = cashBankHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<CoaSchmHdr> getCoaSchmHdrs()
			{
				return this.coaSchmHdrs;
			}
			
		public void setCoaSchmHdrs(Set<CoaSchmHdr> coaSchmHdrs)
			{
				this.coaSchmHdrs = coaSchmHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<Invoice> getInvoices()
			{
				return this.invoices;
			}
			
		public void setInvoices(Set<Invoice> invoices)
			{
				this.invoices = invoices;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<Coamaster> getCoamasters()
			{
				return this.coamasters;
			}
			
		public void setCoamasters(Set<Coamaster> coamasters)
			{
				this.coamasters = coamasters;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<ResetPasswordLog> getResetPasswordLogs()
			{
				return this.resetPasswordLogs;
			}
			
		public void setResetPasswordLogs(Set<ResetPasswordLog> resetPasswordLogs)
			{
				this.resetPasswordLogs = resetPasswordLogs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<Office> getOffices()
			{
				return this.offices;
			}
			
		public void setOffices(Set<Office> offices)
			{
				this.offices = offices;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<BankAccount> getBankAccounts()
			{
				return this.bankAccounts;
			}
			
		public void setBankAccounts(Set<BankAccount> bankAccounts)
			{
				this.bankAccounts = bankAccounts;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<MsRole> getMsRoles()
			{
				return this.msRoles;
			}
			
		public void setMsRoles(Set<MsRole> msRoles)
			{
				this.msRoles = msRoles;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<ReturSalesHdr> getReturSalesHdrs()
			{
				return this.returSalesHdrs;
			}
			
		public void setReturSalesHdrs(Set<ReturSalesHdr> returSalesHdrs)
			{
				this.returSalesHdrs = returSalesHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<Stock> getStocks()
			{
				return this.stocks;
			}
			
		public void setStocks(Set<Stock> stocks)
			{
				this.stocks = stocks;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<InsAsset> getInsAssets()
			{
				return this.insAssets;
			}
			
		public void setInsAssets(Set<InsAsset> insAssets)
			{
				this.insAssets = insAssets;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<PettyCashHdr> getPettyCashHdrs()
			{
				return this.pettyCashHdrs;
			}
			
		public void setPettyCashHdrs(Set<PettyCashHdr> pettyCashHdrs)
			{
				this.pettyCashHdrs = pettyCashHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<AdvanceCash> getAdvanceCashes()
			{
				return this.advanceCashes;
			}
			
		public void setAdvanceCashes(Set<AdvanceCash> advanceCashes)
			{
				this.advanceCashes = advanceCashes;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<AssetDocMaster> getAssetDocMasters()
			{
				return this.assetDocMasters;
			}
			
		public void setAssetDocMasters(Set<AssetDocMaster> assetDocMasters)
			{
				this.assetDocMasters = assetDocMasters;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<TrxSeqNo> getTrxSeqNos()
			{
				return this.trxSeqNos;
			}
			
		public void setTrxSeqNos(Set<TrxSeqNo> trxSeqNos)
			{
				this.trxSeqNos = trxSeqNos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<DanaTunai> getDanaTunais()
			{
				return this.danaTunais;
			}
			
		public void setDanaTunais(Set<DanaTunai> danaTunais)
			{
				this.danaTunais = danaTunais;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<Pdcreceipt> getPdcreceipts()
			{
				return this.pdcreceipts;
			}
			
		public void setPdcreceipts(Set<Pdcreceipt> pdcreceipts)
			{
				this.pdcreceipts = pdcreceipts;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<MsTable> getMsTables()
			{
				return this.msTables;
			}
			
		public void setMsTables(Set<MsTable> msTables)
			{
				this.msTables = msTables;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<Workshop> getWorkshops()
			{
				return this.workshops;
			}
			
		public void setWorkshops(Set<Workshop> workshops)
			{
				this.workshops = workshops;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<AssetServiceHdr> getAssetServiceHdrs()
			{
				return this.assetServiceHdrs;
			}
			
		public void setAssetServiceHdrs(Set<AssetServiceHdr> assetServiceHdrs)
			{
				this.assetServiceHdrs = assetServiceHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<Currency> getCurrencies()
			{
				return this.currencies;
			}
			
		public void setCurrencies(Set<Currency> currencies)
			{
				this.currencies = currencies;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<PaymentVoucher> getPaymentVouchers()
			{
				return this.paymentVouchers;
			}
			
		public void setPaymentVouchers(Set<PaymentVoucher> paymentVouchers)
			{
				this.paymentVouchers = paymentVouchers;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<ServiceHdr> getServiceHdrs()
			{
				return this.serviceHdrs;
			}
			
		public void setServiceHdrs(Set<ServiceHdr> serviceHdrs)
			{
				this.serviceHdrs = serviceHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<ProductOffering> getProductOfferings()
			{
				return this.productOfferings;
			}
			
		public void setProductOfferings(Set<ProductOffering> productOfferings)
			{
				this.productOfferings = productOfferings;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<ReturPurchaseHdr> getReturPurchaseHdrs()
			{
				return this.returPurchaseHdrs;
			}
			
		public void setReturPurchaseHdrs(Set<ReturPurchaseHdr> returPurchaseHdrs)
			{
				this.returPurchaseHdrs = returPurchaseHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<SalesInvoice> getSalesInvoices()
			{
				return this.salesInvoices;
			}
			
		public void setSalesInvoices(Set<SalesInvoice> salesInvoices)
			{
				this.salesInvoices = salesInvoices;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<JrnlHdr> getJrnlHdrs()
			{
				return this.jrnlHdrs;
			}
			
		public void setJrnlHdrs(Set<JrnlHdr> jrnlHdrs)
			{
				this.jrnlHdrs = jrnlHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<OtherDsbHdr> getOtherDsbHdrs()
			{
				return this.otherDsbHdrs;
			}
			
		public void setOtherDsbHdrs(Set<OtherDsbHdr> otherDsbHdrs)
			{
				this.otherDsbHdrs = otherDsbHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<InsRateToCust> getInsRateToCusts()
			{
				return this.insRateToCusts;
			}
			
		public void setInsRateToCusts(Set<InsRateToCust> insRateToCusts)
			{
				this.insRateToCusts = insRateToCusts;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<SuspendReceive> getSuspendReceives()
			{
				return this.suspendReceives;
			}
			
		public void setSuspendReceives(Set<SuspendReceive> suspendReceives)
			{
				this.suspendReceives = suspendReceives;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<PurchaseInvoice> getPurchaseInvoices()
			{
				return this.purchaseInvoices;
			}
			
		public void setPurchaseInvoices(Set<PurchaseInvoice> purchaseInvoices)
			{
				this.purchaseInvoices = purchaseInvoices;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<InsDocMaster> getInsDocMasters()
			{
				return this.insDocMasters;
			}
			
		public void setInsDocMasters(Set<InsDocMaster> insDocMasters)
			{
				this.insDocMasters = insDocMasters;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<AssetServiceMaster> getAssetServiceMasters()
			{
				return this.assetServiceMasters;
			}
			
		public void setAssetServiceMasters(Set<AssetServiceMaster> assetServiceMasters)
			{
				this.assetServiceMasters = assetServiceMasters;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<AssetType> getAssetTypes()
			{
				return this.assetTypes;
			}
			
		public void setAssetTypes(Set<AssetType> assetTypes)
			{
				this.assetTypes = assetTypes;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<Employee> getEmployees()
			{
				return this.employees;
			}
			
		public void setEmployees(Set<Employee> employees)
			{
				this.employees = employees;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<Product> getProducts()
			{
				return this.products;
			}
			
		public void setProducts(Set<Product> products)
			{
				this.products = products;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "partner")
		public Set<MsUserRole> getMsUserRoles()
			{
				return this.msUserRoles;
			}
			
		public void setMsUserRoles(Set<MsUserRole> msUserRoles)
			{
				this.msUserRoles = msUserRoles;
			}
			
	}
