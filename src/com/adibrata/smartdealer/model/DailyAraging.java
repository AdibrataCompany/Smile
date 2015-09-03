
package com.adibrata.smartdealer.model;
// Generated Sep 3, 2015 3:22:49 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DailyAraging generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "DailyARAging", catalog = "SmartDealer")
public class DailyAraging implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private Currency currency;
		private Customer customer;
		private Date agingDate;
		private String dailyMonthly;
		private Integer daysOverdue;
		private double amountOverDueGross;
		private double amountOverDuePrinciple;
		private Double osp;
		private Double osi;
		private Double ospundue;
		private Double osiundue;
		private Double lcinst;
		private Double lcinstPaid;
		private Double lcinstWaived;
		private Date lastLcinstCalcDate;
		private Double lcinstCurrrent;
		private Double lcins;
		private Double lcinsPaid;
		private Double lcinsWaived;
		private Date lastLcinsCalcDate;
		private Double instDue;
		private Double instDuePaid;
		private Double instDueWaived;
		private Double insDue;
		private Double insDuePaid;
		private Double insDueWaived;
		private Double prepaidAmount;
		private Date nadate;
		private Double naamount;
		private Double napaid;
		private Double naother;
		private Date wodate;
		private Double woamount;
		private Double wopaid;
		private Double woother;
		private Short collStatus;
		private Short exRepo;
		private Short installmentNo;
		private Date installmentDate;
		private String contractStatus;
		private String defaultStatus;
		private Integer numOfAssetUnit;
		private Integer collectibilityId;
		private Short nextInstDueNumber;
		private Date nextInstDueDate;
		private Short isFpd;
		private Long productId;
		private Long productOfferingId;
		private Double ntf;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public DailyAraging()
			{
			}
			
		public DailyAraging(long id, Currency currency, Customer customer, double amountOverDueGross, double amountOverDuePrinciple)
			{
				this.id = id;
				this.currency = currency;
				this.customer = customer;
				this.amountOverDueGross = amountOverDueGross;
				this.amountOverDuePrinciple = amountOverDuePrinciple;
			}
			
		public DailyAraging(long id, Agrmnt agrmnt, Currency currency, Customer customer, Date agingDate, String dailyMonthly, Integer daysOverdue, double amountOverDueGross, double amountOverDuePrinciple, Double osp, Double osi, Double ospundue,
		        Double osiundue, Double lcinst, Double lcinstPaid, Double lcinstWaived, Date lastLcinstCalcDate, Double lcinstCurrrent, Double lcins, Double lcinsPaid, Double lcinsWaived, Date lastLcinsCalcDate, Double instDue, Double instDuePaid,
		        Double instDueWaived, Double insDue, Double insDuePaid, Double insDueWaived, Double prepaidAmount, Date nadate, Double naamount, Double napaid, Double naother, Date wodate, Double woamount, Double wopaid, Double woother,
		        Short collStatus, Short exRepo, Short installmentNo, Date installmentDate, String contractStatus, String defaultStatus, Integer numOfAssetUnit, Integer collectibilityId, Short nextInstDueNumber, Date nextInstDueDate, Short isFpd,
		        Long productId, Long productOfferingId, Double ntf, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.currency = currency;
				this.customer = customer;
				this.agingDate = agingDate;
				this.dailyMonthly = dailyMonthly;
				this.daysOverdue = daysOverdue;
				this.amountOverDueGross = amountOverDueGross;
				this.amountOverDuePrinciple = amountOverDuePrinciple;
				this.osp = osp;
				this.osi = osi;
				this.ospundue = ospundue;
				this.osiundue = osiundue;
				this.lcinst = lcinst;
				this.lcinstPaid = lcinstPaid;
				this.lcinstWaived = lcinstWaived;
				this.lastLcinstCalcDate = lastLcinstCalcDate;
				this.lcinstCurrrent = lcinstCurrrent;
				this.lcins = lcins;
				this.lcinsPaid = lcinsPaid;
				this.lcinsWaived = lcinsWaived;
				this.lastLcinsCalcDate = lastLcinsCalcDate;
				this.instDue = instDue;
				this.instDuePaid = instDuePaid;
				this.instDueWaived = instDueWaived;
				this.insDue = insDue;
				this.insDuePaid = insDuePaid;
				this.insDueWaived = insDueWaived;
				this.prepaidAmount = prepaidAmount;
				this.nadate = nadate;
				this.naamount = naamount;
				this.napaid = napaid;
				this.naother = naother;
				this.wodate = wodate;
				this.woamount = woamount;
				this.wopaid = wopaid;
				this.woother = woother;
				this.collStatus = collStatus;
				this.exRepo = exRepo;
				this.installmentNo = installmentNo;
				this.installmentDate = installmentDate;
				this.contractStatus = contractStatus;
				this.defaultStatus = defaultStatus;
				this.numOfAssetUnit = numOfAssetUnit;
				this.collectibilityId = collectibilityId;
				this.nextInstDueNumber = nextInstDueNumber;
				this.nextInstDueDate = nextInstDueDate;
				this.isFpd = isFpd;
				this.productId = productId;
				this.productOfferingId = productOfferingId;
				this.ntf = ntf;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
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
		@JoinColumn(name = "CurrencyID", nullable = false)
		public Currency getCurrency()
			{
				return this.currency;
			}
			
		public void setCurrency(Currency currency)
			{
				this.currency = currency;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "CustomerID", nullable = false)
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(Customer customer)
			{
				this.customer = customer;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "AgingDate", length = 23)
		public Date getAgingDate()
			{
				return this.agingDate;
			}
			
		public void setAgingDate(Date agingDate)
			{
				this.agingDate = agingDate;
			}
			
		@Column(name = "DailyMonthly", length = 1)
		public String getDailyMonthly()
			{
				return this.dailyMonthly;
			}
			
		public void setDailyMonthly(String dailyMonthly)
			{
				this.dailyMonthly = dailyMonthly;
			}
			
		@Column(name = "DaysOverdue")
		public Integer getDaysOverdue()
			{
				return this.daysOverdue;
			}
			
		public void setDaysOverdue(Integer daysOverdue)
			{
				this.daysOverdue = daysOverdue;
			}
			
		@Column(name = "AmountOverDueGross", nullable = false, precision = 53, scale = 0)
		public double getAmountOverDueGross()
			{
				return this.amountOverDueGross;
			}
			
		public void setAmountOverDueGross(double amountOverDueGross)
			{
				this.amountOverDueGross = amountOverDueGross;
			}
			
		@Column(name = "AmountOverDuePrinciple", nullable = false, precision = 53, scale = 0)
		public double getAmountOverDuePrinciple()
			{
				return this.amountOverDuePrinciple;
			}
			
		public void setAmountOverDuePrinciple(double amountOverDuePrinciple)
			{
				this.amountOverDuePrinciple = amountOverDuePrinciple;
			}
			
		@Column(name = "OSP", precision = 53, scale = 0)
		public Double getOsp()
			{
				return this.osp;
			}
			
		public void setOsp(Double osp)
			{
				this.osp = osp;
			}
			
		@Column(name = "OSI", precision = 53, scale = 0)
		public Double getOsi()
			{
				return this.osi;
			}
			
		public void setOsi(Double osi)
			{
				this.osi = osi;
			}
			
		@Column(name = "OSPUndue", precision = 53, scale = 0)
		public Double getOspundue()
			{
				return this.ospundue;
			}
			
		public void setOspundue(Double ospundue)
			{
				this.ospundue = ospundue;
			}
			
		@Column(name = "OSIUndue", precision = 53, scale = 0)
		public Double getOsiundue()
			{
				return this.osiundue;
			}
			
		public void setOsiundue(Double osiundue)
			{
				this.osiundue = osiundue;
			}
			
		@Column(name = "LCInst", precision = 53, scale = 0)
		public Double getLcinst()
			{
				return this.lcinst;
			}
			
		public void setLcinst(Double lcinst)
			{
				this.lcinst = lcinst;
			}
			
		@Column(name = "LCInstPaid", precision = 53, scale = 0)
		public Double getLcinstPaid()
			{
				return this.lcinstPaid;
			}
			
		public void setLcinstPaid(Double lcinstPaid)
			{
				this.lcinstPaid = lcinstPaid;
			}
			
		@Column(name = "LCInstWaived", precision = 53, scale = 0)
		public Double getLcinstWaived()
			{
				return this.lcinstWaived;
			}
			
		public void setLcinstWaived(Double lcinstWaived)
			{
				this.lcinstWaived = lcinstWaived;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "LastLCInstCalcDate", length = 23)
		public Date getLastLcinstCalcDate()
			{
				return this.lastLcinstCalcDate;
			}
			
		public void setLastLcinstCalcDate(Date lastLcinstCalcDate)
			{
				this.lastLcinstCalcDate = lastLcinstCalcDate;
			}
			
		@Column(name = "LCInstCurrrent", precision = 53, scale = 0)
		public Double getLcinstCurrrent()
			{
				return this.lcinstCurrrent;
			}
			
		public void setLcinstCurrrent(Double lcinstCurrrent)
			{
				this.lcinstCurrrent = lcinstCurrrent;
			}
			
		@Column(name = "LCIns", precision = 53, scale = 0)
		public Double getLcins()
			{
				return this.lcins;
			}
			
		public void setLcins(Double lcins)
			{
				this.lcins = lcins;
			}
			
		@Column(name = "LCInsPaid", precision = 53, scale = 0)
		public Double getLcinsPaid()
			{
				return this.lcinsPaid;
			}
			
		public void setLcinsPaid(Double lcinsPaid)
			{
				this.lcinsPaid = lcinsPaid;
			}
			
		@Column(name = "LCInsWaived", precision = 53, scale = 0)
		public Double getLcinsWaived()
			{
				return this.lcinsWaived;
			}
			
		public void setLcinsWaived(Double lcinsWaived)
			{
				this.lcinsWaived = lcinsWaived;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "LastLCInsCalcDate", length = 23)
		public Date getLastLcinsCalcDate()
			{
				return this.lastLcinsCalcDate;
			}
			
		public void setLastLcinsCalcDate(Date lastLcinsCalcDate)
			{
				this.lastLcinsCalcDate = lastLcinsCalcDate;
			}
			
		@Column(name = "InstDue", precision = 53, scale = 0)
		public Double getInstDue()
			{
				return this.instDue;
			}
			
		public void setInstDue(Double instDue)
			{
				this.instDue = instDue;
			}
			
		@Column(name = "InstDuePaid", precision = 53, scale = 0)
		public Double getInstDuePaid()
			{
				return this.instDuePaid;
			}
			
		public void setInstDuePaid(Double instDuePaid)
			{
				this.instDuePaid = instDuePaid;
			}
			
		@Column(name = "InstDueWaived", precision = 53, scale = 0)
		public Double getInstDueWaived()
			{
				return this.instDueWaived;
			}
			
		public void setInstDueWaived(Double instDueWaived)
			{
				this.instDueWaived = instDueWaived;
			}
			
		@Column(name = "InsDue", precision = 53, scale = 0)
		public Double getInsDue()
			{
				return this.insDue;
			}
			
		public void setInsDue(Double insDue)
			{
				this.insDue = insDue;
			}
			
		@Column(name = "InsDuePaid", precision = 53, scale = 0)
		public Double getInsDuePaid()
			{
				return this.insDuePaid;
			}
			
		public void setInsDuePaid(Double insDuePaid)
			{
				this.insDuePaid = insDuePaid;
			}
			
		@Column(name = "InsDueWaived", precision = 53, scale = 0)
		public Double getInsDueWaived()
			{
				return this.insDueWaived;
			}
			
		public void setInsDueWaived(Double insDueWaived)
			{
				this.insDueWaived = insDueWaived;
			}
			
		@Column(name = "PrepaidAmount", precision = 53, scale = 0)
		public Double getPrepaidAmount()
			{
				return this.prepaidAmount;
			}
			
		public void setPrepaidAmount(Double prepaidAmount)
			{
				this.prepaidAmount = prepaidAmount;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "NADate", length = 23)
		public Date getNadate()
			{
				return this.nadate;
			}
			
		public void setNadate(Date nadate)
			{
				this.nadate = nadate;
			}
			
		@Column(name = "NAAmount", precision = 53, scale = 0)
		public Double getNaamount()
			{
				return this.naamount;
			}
			
		public void setNaamount(Double naamount)
			{
				this.naamount = naamount;
			}
			
		@Column(name = "NAPaid", precision = 53, scale = 0)
		public Double getNapaid()
			{
				return this.napaid;
			}
			
		public void setNapaid(Double napaid)
			{
				this.napaid = napaid;
			}
			
		@Column(name = "NAOther", precision = 53, scale = 0)
		public Double getNaother()
			{
				return this.naother;
			}
			
		public void setNaother(Double naother)
			{
				this.naother = naother;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "WODate", length = 23)
		public Date getWodate()
			{
				return this.wodate;
			}
			
		public void setWodate(Date wodate)
			{
				this.wodate = wodate;
			}
			
		@Column(name = "WOAmount", precision = 53, scale = 0)
		public Double getWoamount()
			{
				return this.woamount;
			}
			
		public void setWoamount(Double woamount)
			{
				this.woamount = woamount;
			}
			
		@Column(name = "WOPaid", precision = 53, scale = 0)
		public Double getWopaid()
			{
				return this.wopaid;
			}
			
		public void setWopaid(Double wopaid)
			{
				this.wopaid = wopaid;
			}
			
		@Column(name = "WOOther", precision = 53, scale = 0)
		public Double getWoother()
			{
				return this.woother;
			}
			
		public void setWoother(Double woother)
			{
				this.woother = woother;
			}
			
		@Column(name = "CollStatus")
		public Short getCollStatus()
			{
				return this.collStatus;
			}
			
		public void setCollStatus(Short collStatus)
			{
				this.collStatus = collStatus;
			}
			
		@Column(name = "ExRepo")
		public Short getExRepo()
			{
				return this.exRepo;
			}
			
		public void setExRepo(Short exRepo)
			{
				this.exRepo = exRepo;
			}
			
		@Column(name = "InstallmentNo")
		public Short getInstallmentNo()
			{
				return this.installmentNo;
			}
			
		public void setInstallmentNo(Short installmentNo)
			{
				this.installmentNo = installmentNo;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "InstallmentDate", length = 23)
		public Date getInstallmentDate()
			{
				return this.installmentDate;
			}
			
		public void setInstallmentDate(Date installmentDate)
			{
				this.installmentDate = installmentDate;
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
			
		@Column(name = "DefaultStatus", length = 3)
		public String getDefaultStatus()
			{
				return this.defaultStatus;
			}
			
		public void setDefaultStatus(String defaultStatus)
			{
				this.defaultStatus = defaultStatus;
			}
			
		@Column(name = "NumOfAssetUnit")
		public Integer getNumOfAssetUnit()
			{
				return this.numOfAssetUnit;
			}
			
		public void setNumOfAssetUnit(Integer numOfAssetUnit)
			{
				this.numOfAssetUnit = numOfAssetUnit;
			}
			
		@Column(name = "CollectibilityId")
		public Integer getCollectibilityId()
			{
				return this.collectibilityId;
			}
			
		public void setCollectibilityId(Integer collectibilityId)
			{
				this.collectibilityId = collectibilityId;
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
			
		@Column(name = "IsFPD")
		public Short getIsFpd()
			{
				return this.isFpd;
			}
			
		public void setIsFpd(Short isFpd)
			{
				this.isFpd = isFpd;
			}
			
		@Column(name = "ProductID")
		public Long getProductId()
			{
				return this.productId;
			}
			
		public void setProductId(Long productId)
			{
				this.productId = productId;
			}
			
		@Column(name = "ProductOfferingID")
		public Long getProductOfferingId()
			{
				return this.productOfferingId;
			}
			
		public void setProductOfferingId(Long productOfferingId)
			{
				this.productOfferingId = productOfferingId;
			}
			
		@Column(name = "NTF", precision = 53, scale = 0)
		public Double getNtf()
			{
				return this.ntf;
			}
			
		public void setNtf(Double ntf)
			{
				this.ntf = ntf;
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
