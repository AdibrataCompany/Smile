
package com.adibrata.smartdealer.model;
// Generated Aug 15, 2015 10:59:05 PM by Hibernate Tools 4.3.1

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
 * Agrmnt generated by hbm2java
 */
@Entity
@Table(name = "Agrmnt", catalog = "SmartDealer")
public class Agrmnt implements java.io.Serializable
	{
		
		private long id;
		private Application application;
		private Currency currency;
		private Customer customer;
		private Office office;
		private Partner partner;
		private String agrmntCode;
		private String coaSchmCode;
		private Double osP;
		private Double osI;
		private Double osPundue;
		private Double osIundue;
		private Short nextInstNumber;
		private Date nextInstDate;
		private Short nextInstDueNumber;
		private Date nextInstDueDate;
		private Double prepaidAmt;
		private Short tenor;
		private Short cummulativeTenor;
		private Date effectiveDate;
		private Date goLiveDate;
		private Date rrddate;
		private String contractStatus;
		private String defaultStatus;
		private Double percentagePenalty;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private Set<SuspendAllocation> suspendAllocations = new HashSet<SuspendAllocation>(0);
		private Set<AgrmntMnt> agrmntMnts = new HashSet<AgrmntMnt>(0);
		private Set<AgrmntFund> agrmntFunds = new HashSet<AgrmntFund>(0);
		private Set<InstSchedule> instSchedules = new HashSet<InstSchedule>(0);
		private Set<AgrmntColl> agrmntColls = new HashSet<AgrmntColl>(0);
		private Set<AgrmntAsset> agrmntAssets = new HashSet<AgrmntAsset>(0);
		private Set<AgrmntBankStatementInfo> agrmntBankStatementInfos = new HashSet<AgrmntBankStatementInfo>(0);
		private Set<AgrmntReffInfo> agrmntReffInfos = new HashSet<AgrmntReffInfo>(0);
		private Set<PaymentReversal> paymentReversals = new HashSet<PaymentReversal>(0);
		private Set<PayHistHdr> payHistHdrs = new HashSet<PayHistHdr>(0);
		private Set<PaymentReceive> paymentReceives = new HashSet<PaymentReceive>(0);
		private Set<EarlyTermination> earlyTerminations = new HashSet<EarlyTermination>(0);
		private Set<AgrmntIns> agrmntInses = new HashSet<AgrmntIns>(0);
		private Set<AgrmntEmployeeInfo> agrmntEmployeeInfos = new HashSet<AgrmntEmployeeInfo>(0);
		private Set<DailyAraging> dailyAragings = new HashSet<DailyAraging>(0);
		private Set<AgrmntMailingInfo> agrmntMailingInfos = new HashSet<AgrmntMailingInfo>(0);
		
		public Agrmnt()
			{
			}
			
		public Agrmnt(long id)
			{
				this.id = id;
			}
			
		public Agrmnt(long id, Application application, Currency currency, Customer customer, Office office, Partner partner, String agrmntCode, String coaSchmCode, Double osP, Double osI, Double osPundue, Double osIundue, Short nextInstNumber,
		        Date nextInstDate, Short nextInstDueNumber, Date nextInstDueDate, Double prepaidAmt, Short tenor, Short cummulativeTenor, Date effectiveDate, Date goLiveDate, Date rrddate, String contractStatus, String defaultStatus,
		        Double percentagePenalty, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt, Set<SuspendAllocation> suspendAllocations, Set<AgrmntMnt> agrmntMnts, Set<AgrmntFund> agrmntFunds, Set<InstSchedule> instSchedules,
		        Set<AgrmntColl> agrmntColls, Set<AgrmntAsset> agrmntAssets, Set<AgrmntBankStatementInfo> agrmntBankStatementInfos, Set<AgrmntReffInfo> agrmntReffInfos, Set<PaymentReversal> paymentReversals, Set<PayHistHdr> payHistHdrs,
		        Set<PaymentReceive> paymentReceives, Set<EarlyTermination> earlyTerminations, Set<AgrmntIns> agrmntInses, Set<AgrmntEmployeeInfo> agrmntEmployeeInfos, Set<DailyAraging> dailyAragings, Set<AgrmntMailingInfo> agrmntMailingInfos)
			{
				this.id = id;
				this.application = application;
				this.currency = currency;
				this.customer = customer;
				this.office = office;
				this.partner = partner;
				this.agrmntCode = agrmntCode;
				this.coaSchmCode = coaSchmCode;
				this.osP = osP;
				this.osI = osI;
				this.osPundue = osPundue;
				this.osIundue = osIundue;
				this.nextInstNumber = nextInstNumber;
				this.nextInstDate = nextInstDate;
				this.nextInstDueNumber = nextInstDueNumber;
				this.nextInstDueDate = nextInstDueDate;
				this.prepaidAmt = prepaidAmt;
				this.tenor = tenor;
				this.cummulativeTenor = cummulativeTenor;
				this.effectiveDate = effectiveDate;
				this.goLiveDate = goLiveDate;
				this.rrddate = rrddate;
				this.contractStatus = contractStatus;
				this.defaultStatus = defaultStatus;
				this.percentagePenalty = percentagePenalty;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.suspendAllocations = suspendAllocations;
				this.agrmntMnts = agrmntMnts;
				this.agrmntFunds = agrmntFunds;
				this.instSchedules = instSchedules;
				this.agrmntColls = agrmntColls;
				this.agrmntAssets = agrmntAssets;
				this.agrmntBankStatementInfos = agrmntBankStatementInfos;
				this.agrmntReffInfos = agrmntReffInfos;
				this.paymentReversals = paymentReversals;
				this.payHistHdrs = payHistHdrs;
				this.paymentReceives = paymentReceives;
				this.earlyTerminations = earlyTerminations;
				this.agrmntInses = agrmntInses;
				this.agrmntEmployeeInfos = agrmntEmployeeInfos;
				this.dailyAragings = dailyAragings;
				this.agrmntMailingInfos = agrmntMailingInfos;
			}
			
		@Id
		
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
		@JoinColumn(name = "AppId")
		public Application getApplication()
			{
				return this.application;
			}
			
		public void setApplication(Application application)
			{
				this.application = application;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "CurrencyID")
		public Currency getCurrency()
			{
				return this.currency;
			}
			
		public void setCurrency(Currency currency)
			{
				this.currency = currency;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "CustomerID")
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(Customer customer)
			{
				this.customer = customer;
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
			
		@Column(name = "AgrmntCode", length = 20)
		public String getAgrmntCode()
			{
				return this.agrmntCode;
			}
			
		public void setAgrmntCode(String agrmntCode)
			{
				this.agrmntCode = agrmntCode;
			}
			
		@Column(name = "CoaSchmCode", length = 20)
		public String getCoaSchmCode()
			{
				return this.coaSchmCode;
			}
			
		public void setCoaSchmCode(String coaSchmCode)
			{
				this.coaSchmCode = coaSchmCode;
			}
			
		@Column(name = "OsP", precision = 53, scale = 0)
		public Double getOsP()
			{
				return this.osP;
			}
			
		public void setOsP(Double osP)
			{
				this.osP = osP;
			}
			
		@Column(name = "OsI", precision = 53, scale = 0)
		public Double getOsI()
			{
				return this.osI;
			}
			
		public void setOsI(Double osI)
			{
				this.osI = osI;
			}
			
		@Column(name = "OsPUndue", precision = 53, scale = 0)
		public Double getOsPundue()
			{
				return this.osPundue;
			}
			
		public void setOsPundue(Double osPundue)
			{
				this.osPundue = osPundue;
			}
			
		@Column(name = "OsIUndue", precision = 53, scale = 0)
		public Double getOsIundue()
			{
				return this.osIundue;
			}
			
		public void setOsIundue(Double osIundue)
			{
				this.osIundue = osIundue;
			}
			
		@Column(name = "NextInstNumber")
		public Short getNextInstNumber()
			{
				return this.nextInstNumber;
			}
			
		public void setNextInstNumber(Short nextInstNumber)
			{
				this.nextInstNumber = nextInstNumber;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "NextInstDate", length = 23)
		public Date getNextInstDate()
			{
				return this.nextInstDate;
			}
			
		public void setNextInstDate(Date nextInstDate)
			{
				this.nextInstDate = nextInstDate;
			}
			
		@Column(name = "NextInstDueNumber")
		public Short getNextInstDueNumber()
			{
				return this.nextInstDueNumber;
			}
			
		public void setNextInstDueNumber(Short nextInstDueNumber)
			{
				this.nextInstDueNumber = nextInstDueNumber;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "NextInstDueDate", length = 23)
		public Date getNextInstDueDate()
			{
				return this.nextInstDueDate;
			}
			
		public void setNextInstDueDate(Date nextInstDueDate)
			{
				this.nextInstDueDate = nextInstDueDate;
			}
			
		@Column(name = "PrepaidAmt", precision = 53, scale = 0)
		public Double getPrepaidAmt()
			{
				return this.prepaidAmt;
			}
			
		public void setPrepaidAmt(Double prepaidAmt)
			{
				this.prepaidAmt = prepaidAmt;
			}
			
		@Column(name = "Tenor")
		public Short getTenor()
			{
				return this.tenor;
			}
			
		public void setTenor(Short tenor)
			{
				this.tenor = tenor;
			}
			
		@Column(name = "CummulativeTenor")
		public Short getCummulativeTenor()
			{
				return this.cummulativeTenor;
			}
			
		public void setCummulativeTenor(Short cummulativeTenor)
			{
				this.cummulativeTenor = cummulativeTenor;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "EffectiveDate", length = 23)
		public Date getEffectiveDate()
			{
				return this.effectiveDate;
			}
			
		public void setEffectiveDate(Date effectiveDate)
			{
				this.effectiveDate = effectiveDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "GoLiveDate", length = 23)
		public Date getGoLiveDate()
			{
				return this.goLiveDate;
			}
			
		public void setGoLiveDate(Date goLiveDate)
			{
				this.goLiveDate = goLiveDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "RRDDate", length = 23)
		public Date getRrddate()
			{
				return this.rrddate;
			}
			
		public void setRrddate(Date rrddate)
			{
				this.rrddate = rrddate;
			}
			
		@Column(name = "ContractStatus", length = 3)
		public String getContractStatus()
			{
				return this.contractStatus;
			}
			
		public void setContractStatus(String contractStatus)
			{
				this.contractStatus = contractStatus;
			}
			
		@Column(name = "DefaultStatus", length = 5)
		public String getDefaultStatus()
			{
				return this.defaultStatus;
			}
			
		public void setDefaultStatus(String defaultStatus)
			{
				this.defaultStatus = defaultStatus;
			}
			
		@Column(name = "PercentagePenalty", precision = 53, scale = 0)
		public Double getPercentagePenalty()
			{
				return this.percentagePenalty;
			}
			
		public void setPercentagePenalty(Double percentagePenalty)
			{
				this.percentagePenalty = percentagePenalty;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<SuspendAllocation> getSuspendAllocations()
			{
				return this.suspendAllocations;
			}
			
		public void setSuspendAllocations(Set<SuspendAllocation> suspendAllocations)
			{
				this.suspendAllocations = suspendAllocations;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<AgrmntMnt> getAgrmntMnts()
			{
				return this.agrmntMnts;
			}
			
		public void setAgrmntMnts(Set<AgrmntMnt> agrmntMnts)
			{
				this.agrmntMnts = agrmntMnts;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<AgrmntFund> getAgrmntFunds()
			{
				return this.agrmntFunds;
			}
			
		public void setAgrmntFunds(Set<AgrmntFund> agrmntFunds)
			{
				this.agrmntFunds = agrmntFunds;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<InstSchedule> getInstSchedules()
			{
				return this.instSchedules;
			}
			
		public void setInstSchedules(Set<InstSchedule> instSchedules)
			{
				this.instSchedules = instSchedules;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<AgrmntColl> getAgrmntColls()
			{
				return this.agrmntColls;
			}
			
		public void setAgrmntColls(Set<AgrmntColl> agrmntColls)
			{
				this.agrmntColls = agrmntColls;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<AgrmntAsset> getAgrmntAssets()
			{
				return this.agrmntAssets;
			}
			
		public void setAgrmntAssets(Set<AgrmntAsset> agrmntAssets)
			{
				this.agrmntAssets = agrmntAssets;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<AgrmntBankStatementInfo> getAgrmntBankStatementInfos()
			{
				return this.agrmntBankStatementInfos;
			}
			
		public void setAgrmntBankStatementInfos(Set<AgrmntBankStatementInfo> agrmntBankStatementInfos)
			{
				this.agrmntBankStatementInfos = agrmntBankStatementInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<AgrmntReffInfo> getAgrmntReffInfos()
			{
				return this.agrmntReffInfos;
			}
			
		public void setAgrmntReffInfos(Set<AgrmntReffInfo> agrmntReffInfos)
			{
				this.agrmntReffInfos = agrmntReffInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<PaymentReversal> getPaymentReversals()
			{
				return this.paymentReversals;
			}
			
		public void setPaymentReversals(Set<PaymentReversal> paymentReversals)
			{
				this.paymentReversals = paymentReversals;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<PayHistHdr> getPayHistHdrs()
			{
				return this.payHistHdrs;
			}
			
		public void setPayHistHdrs(Set<PayHistHdr> payHistHdrs)
			{
				this.payHistHdrs = payHistHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<PaymentReceive> getPaymentReceives()
			{
				return this.paymentReceives;
			}
			
		public void setPaymentReceives(Set<PaymentReceive> paymentReceives)
			{
				this.paymentReceives = paymentReceives;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<EarlyTermination> getEarlyTerminations()
			{
				return this.earlyTerminations;
			}
			
		public void setEarlyTerminations(Set<EarlyTermination> earlyTerminations)
			{
				this.earlyTerminations = earlyTerminations;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<AgrmntIns> getAgrmntInses()
			{
				return this.agrmntInses;
			}
			
		public void setAgrmntInses(Set<AgrmntIns> agrmntInses)
			{
				this.agrmntInses = agrmntInses;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<AgrmntEmployeeInfo> getAgrmntEmployeeInfos()
			{
				return this.agrmntEmployeeInfos;
			}
			
		public void setAgrmntEmployeeInfos(Set<AgrmntEmployeeInfo> agrmntEmployeeInfos)
			{
				this.agrmntEmployeeInfos = agrmntEmployeeInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<DailyAraging> getDailyAragings()
			{
				return this.dailyAragings;
			}
			
		public void setDailyAragings(Set<DailyAraging> dailyAragings)
			{
				this.dailyAragings = dailyAragings;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmnt")
		public Set<AgrmntMailingInfo> getAgrmntMailingInfos()
			{
				return this.agrmntMailingInfos;
			}
			
		public void setAgrmntMailingInfos(Set<AgrmntMailingInfo> agrmntMailingInfos)
			{
				this.agrmntMailingInfos = agrmntMailingInfos;
			}
			
	}
