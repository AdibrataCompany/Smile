
package com.adibrata.smartdealer.model;
<<<<<<< Upstream, based on branch 'master' of https://github.com/AdibrataCompany/Smile
// Generated Aug 19, 2015 4:50:54 PM by Hibernate Tools 4.3.1
=======
// Generated Jul 22, 2015 4:44:54 PM by Hibernate Tools 4.3.1
>>>>>>> 5851c81 new Model

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sales generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "Sales", catalog = "SmartDealer")
public class Sales implements java.io.Serializable
	{
		
		private long id;
		private String partnerCode;
		private Long officeId;
		private Long appId;
		private Long agrmntId;
		private Date salesDate;
		private long supplierId;
		private long aoid;
		private long aosupervisorId;
		private long caid;
		private Long gmid;
		private Long bmid;
		private Long adhid;
		private Long salesmanId;
		private Long salesSupervisorId;
		private Long supplierAdminId;
		private double totalOtr;
		private double downPayment;
		private double ntf;
		private String financeType;
		private String productType;
		private short numOfAssetUnit;
		private String wayOfPayment;
		private String floatingPeriod;
		private Double insAssetPremium;
		private Double insAssetReceivedInAdv;
		private Double insAssetCapitalized;
		private String insAssetInsuredBy;
		private String insAssetPaidBy;
		private String insAssetPeriod;
		private double effectiveRate;
		private double flatRate;
		private double supplierRate;
		private String paymentFrequency;
		private String firstInstallment;
		private String installmentScheme;
		private String interestType;
		private short numOfInstallment;
		private short tenor;
		private short cummulativeTenor;
		private double installmentAmount;
		private Date gracePeriod;
		private String gracePeriodType;
		private double grossYield;
		private double outstandingPrincipal;
		private double outstandingInterest;
		private double tdpamount;
		private double diffRateAmount;
		private short isAvalist;
		private short isNst;
		private short isIncentiveSupplier;
		private Date maturityDate;
		private String notes;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public Sales()
			{
			}
			
		public Sales(long id, Date salesDate, long supplierId, long aoid, long aosupervisorId, long caid, double totalOtr, double downPayment, double ntf, String financeType, String productType, short numOfAssetUnit, double effectiveRate,
		        double flatRate, double supplierRate, String paymentFrequency, String firstInstallment, String installmentScheme, String interestType, short numOfInstallment, short tenor, short cummulativeTenor, double installmentAmount,
		        double grossYield, double outstandingPrincipal, double outstandingInterest, double tdpamount, double diffRateAmount, short isAvalist, short isNst, short isIncentiveSupplier)
			{
				this.id = id;
				this.salesDate = salesDate;
				this.supplierId = supplierId;
				this.aoid = aoid;
				this.aosupervisorId = aosupervisorId;
				this.caid = caid;
				this.totalOtr = totalOtr;
				this.downPayment = downPayment;
				this.ntf = ntf;
				this.financeType = financeType;
				this.productType = productType;
				this.numOfAssetUnit = numOfAssetUnit;
				this.effectiveRate = effectiveRate;
				this.flatRate = flatRate;
				this.supplierRate = supplierRate;
				this.paymentFrequency = paymentFrequency;
				this.firstInstallment = firstInstallment;
				this.installmentScheme = installmentScheme;
				this.interestType = interestType;
				this.numOfInstallment = numOfInstallment;
				this.tenor = tenor;
				this.cummulativeTenor = cummulativeTenor;
				this.installmentAmount = installmentAmount;
				this.grossYield = grossYield;
				this.outstandingPrincipal = outstandingPrincipal;
				this.outstandingInterest = outstandingInterest;
				this.tdpamount = tdpamount;
				this.diffRateAmount = diffRateAmount;
				this.isAvalist = isAvalist;
				this.isNst = isNst;
				this.isIncentiveSupplier = isIncentiveSupplier;
			}
			
		public Sales(long id, String partnerCode, Long officeId, Long appId, Long agrmntId, Date salesDate, long supplierId, long aoid, long aosupervisorId, long caid, Long gmid, Long bmid, Long adhid, Long salesmanId, Long salesSupervisorId,
		        Long supplierAdminId, double totalOtr, double downPayment, double ntf, String financeType, String productType, short numOfAssetUnit, String wayOfPayment, String floatingPeriod, Double insAssetPremium, Double insAssetReceivedInAdv,
		        Double insAssetCapitalized, String insAssetInsuredBy, String insAssetPaidBy, String insAssetPeriod, double effectiveRate, double flatRate, double supplierRate, String paymentFrequency, String firstInstallment,
		        String installmentScheme, String interestType, short numOfInstallment, short tenor, short cummulativeTenor, double installmentAmount, Date gracePeriod, String gracePeriodType, double grossYield, double outstandingPrincipal,
		        double outstandingInterest, double tdpamount, double diffRateAmount, short isAvalist, short isNst, short isIncentiveSupplier, Date maturityDate, String notes, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.partnerCode = partnerCode;
				this.officeId = officeId;
				this.appId = appId;
				this.agrmntId = agrmntId;
				this.salesDate = salesDate;
				this.supplierId = supplierId;
				this.aoid = aoid;
				this.aosupervisorId = aosupervisorId;
				this.caid = caid;
				this.gmid = gmid;
				this.bmid = bmid;
				this.adhid = adhid;
				this.salesmanId = salesmanId;
				this.salesSupervisorId = salesSupervisorId;
				this.supplierAdminId = supplierAdminId;
				this.totalOtr = totalOtr;
				this.downPayment = downPayment;
				this.ntf = ntf;
				this.financeType = financeType;
				this.productType = productType;
				this.numOfAssetUnit = numOfAssetUnit;
				this.wayOfPayment = wayOfPayment;
				this.floatingPeriod = floatingPeriod;
				this.insAssetPremium = insAssetPremium;
				this.insAssetReceivedInAdv = insAssetReceivedInAdv;
				this.insAssetCapitalized = insAssetCapitalized;
				this.insAssetInsuredBy = insAssetInsuredBy;
				this.insAssetPaidBy = insAssetPaidBy;
				this.insAssetPeriod = insAssetPeriod;
				this.effectiveRate = effectiveRate;
				this.flatRate = flatRate;
				this.supplierRate = supplierRate;
				this.paymentFrequency = paymentFrequency;
				this.firstInstallment = firstInstallment;
				this.installmentScheme = installmentScheme;
				this.interestType = interestType;
				this.numOfInstallment = numOfInstallment;
				this.tenor = tenor;
				this.cummulativeTenor = cummulativeTenor;
				this.installmentAmount = installmentAmount;
				this.gracePeriod = gracePeriod;
				this.gracePeriodType = gracePeriodType;
				this.grossYield = grossYield;
				this.outstandingPrincipal = outstandingPrincipal;
				this.outstandingInterest = outstandingInterest;
				this.tdpamount = tdpamount;
				this.diffRateAmount = diffRateAmount;
				this.isAvalist = isAvalist;
				this.isNst = isNst;
				this.isIncentiveSupplier = isIncentiveSupplier;
				this.maturityDate = maturityDate;
				this.notes = notes;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
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
			
		@Column(name = "PartnerCode", length = 20)
		public String getPartnerCode()
			{
				return this.partnerCode;
			}
			
		public void setPartnerCode(String partnerCode)
			{
				this.partnerCode = partnerCode;
			}
			
		@Column(name = "OfficeId")
		public Long getOfficeId()
			{
				return this.officeId;
			}
			
		public void setOfficeId(Long officeId)
			{
				this.officeId = officeId;
			}
			
		@Column(name = "AppId")
		public Long getAppId()
			{
				return this.appId;
			}
			
		public void setAppId(Long appId)
			{
				this.appId = appId;
			}
			
		@Column(name = "AgrmntId")
		public Long getAgrmntId()
			{
				return this.agrmntId;
			}
			
		public void setAgrmntId(Long agrmntId)
			{
				this.agrmntId = agrmntId;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "SalesDate", nullable = false, length = 23)
		public Date getSalesDate()
			{
				return this.salesDate;
			}
			
		public void setSalesDate(Date salesDate)
			{
				this.salesDate = salesDate;
			}
			
		@Column(name = "SupplierID", nullable = false)
		public long getSupplierId()
			{
				return this.supplierId;
			}
			
		public void setSupplierId(long supplierId)
			{
				this.supplierId = supplierId;
			}
			
		@Column(name = "AOID", nullable = false)
		public long getAoid()
			{
				return this.aoid;
			}
			
		public void setAoid(long aoid)
			{
				this.aoid = aoid;
			}
			
		@Column(name = "AOSupervisorID", nullable = false)
		public long getAosupervisorId()
			{
				return this.aosupervisorId;
			}
			
		public void setAosupervisorId(long aosupervisorId)
			{
				this.aosupervisorId = aosupervisorId;
			}
			
		@Column(name = "CAID", nullable = false)
		public long getCaid()
			{
				return this.caid;
			}
			
		public void setCaid(long caid)
			{
				this.caid = caid;
			}
			
		@Column(name = "GMID")
		public Long getGmid()
			{
				return this.gmid;
			}
			
		public void setGmid(Long gmid)
			{
				this.gmid = gmid;
			}
			
		@Column(name = "BMID")
		public Long getBmid()
			{
				return this.bmid;
			}
			
		public void setBmid(Long bmid)
			{
				this.bmid = bmid;
			}
			
		@Column(name = "ADHID")
		public Long getAdhid()
			{
				return this.adhid;
			}
			
		public void setAdhid(Long adhid)
			{
				this.adhid = adhid;
			}
			
		@Column(name = "SalesmanID")
		public Long getSalesmanId()
			{
				return this.salesmanId;
			}
			
		public void setSalesmanId(Long salesmanId)
			{
				this.salesmanId = salesmanId;
			}
			
		@Column(name = "SalesSupervisorID")
		public Long getSalesSupervisorId()
			{
				return this.salesSupervisorId;
			}
			
		public void setSalesSupervisorId(Long salesSupervisorId)
			{
				this.salesSupervisorId = salesSupervisorId;
			}
			
		@Column(name = "SupplierAdminID")
		public Long getSupplierAdminId()
			{
				return this.supplierAdminId;
			}
			
		public void setSupplierAdminId(Long supplierAdminId)
			{
				this.supplierAdminId = supplierAdminId;
			}
			
		@Column(name = "TotalOTR", nullable = false, precision = 53, scale = 0)
		public double getTotalOtr()
			{
				return this.totalOtr;
			}
			
		public void setTotalOtr(double totalOtr)
			{
				this.totalOtr = totalOtr;
			}
			
		@Column(name = "DownPayment", nullable = false, precision = 53, scale = 0)
		public double getDownPayment()
			{
				return this.downPayment;
			}
			
		public void setDownPayment(double downPayment)
			{
				this.downPayment = downPayment;
			}
			
		@Column(name = "NTF", nullable = false, precision = 53, scale = 0)
		public double getNtf()
			{
				return this.ntf;
			}
			
		public void setNtf(double ntf)
			{
				this.ntf = ntf;
			}
			
		@Column(name = "FinanceType", nullable = false, length = 2)
		public String getFinanceType()
			{
				return this.financeType;
			}
			
		public void setFinanceType(String financeType)
			{
				this.financeType = financeType;
			}
			
		@Column(name = "ProductType", nullable = false, length = 2)
		public String getProductType()
			{
				return this.productType;
			}
			
		public void setProductType(String productType)
			{
				this.productType = productType;
			}
			
		@Column(name = "NumOfAssetUnit", nullable = false)
		public short getNumOfAssetUnit()
			{
				return this.numOfAssetUnit;
			}
			
		public void setNumOfAssetUnit(short numOfAssetUnit)
			{
				this.numOfAssetUnit = numOfAssetUnit;
			}
			
		@Column(name = "WayOfPayment", length = 2)
		public String getWayOfPayment()
			{
				return this.wayOfPayment;
			}
			
		public void setWayOfPayment(String wayOfPayment)
			{
				this.wayOfPayment = wayOfPayment;
			}
			
		@Column(name = "FloatingPeriod", length = 10)
		public String getFloatingPeriod()
			{
				return this.floatingPeriod;
			}
			
		public void setFloatingPeriod(String floatingPeriod)
			{
				this.floatingPeriod = floatingPeriod;
			}
			
		@Column(name = "InsAssetPremium", precision = 53, scale = 0)
		public Double getInsAssetPremium()
			{
				return this.insAssetPremium;
			}
			
		public void setInsAssetPremium(Double insAssetPremium)
			{
				this.insAssetPremium = insAssetPremium;
			}
			
		@Column(name = "InsAssetReceivedInAdv", precision = 53, scale = 0)
		public Double getInsAssetReceivedInAdv()
			{
				return this.insAssetReceivedInAdv;
			}
			
		public void setInsAssetReceivedInAdv(Double insAssetReceivedInAdv)
			{
				this.insAssetReceivedInAdv = insAssetReceivedInAdv;
			}
			
		@Column(name = "InsAssetCapitalized", precision = 53, scale = 0)
		public Double getInsAssetCapitalized()
			{
				return this.insAssetCapitalized;
			}
			
		public void setInsAssetCapitalized(Double insAssetCapitalized)
			{
				this.insAssetCapitalized = insAssetCapitalized;
			}
			
		@Column(name = "InsAssetInsuredBy", length = 2)
		public String getInsAssetInsuredBy()
			{
				return this.insAssetInsuredBy;
			}
			
		public void setInsAssetInsuredBy(String insAssetInsuredBy)
			{
				this.insAssetInsuredBy = insAssetInsuredBy;
			}
			
		@Column(name = "InsAssetPaidBy", length = 2)
		public String getInsAssetPaidBy()
			{
				return this.insAssetPaidBy;
			}
			
		public void setInsAssetPaidBy(String insAssetPaidBy)
			{
				this.insAssetPaidBy = insAssetPaidBy;
			}
			
		@Column(name = "InsAssetPeriod", length = 2)
		public String getInsAssetPeriod()
			{
				return this.insAssetPeriod;
			}
			
		public void setInsAssetPeriod(String insAssetPeriod)
			{
				this.insAssetPeriod = insAssetPeriod;
			}
			
		@Column(name = "EffectiveRate", nullable = false, precision = 53, scale = 0)
		public double getEffectiveRate()
			{
				return this.effectiveRate;
			}
			
		public void setEffectiveRate(double effectiveRate)
			{
				this.effectiveRate = effectiveRate;
			}
			
		@Column(name = "FlatRate", nullable = false, precision = 53, scale = 0)
		public double getFlatRate()
			{
				return this.flatRate;
			}
			
		public void setFlatRate(double flatRate)
			{
				this.flatRate = flatRate;
			}
			
		@Column(name = "SupplierRate", nullable = false, precision = 53, scale = 0)
		public double getSupplierRate()
			{
				return this.supplierRate;
			}
			
		public void setSupplierRate(double supplierRate)
			{
				this.supplierRate = supplierRate;
			}
			
		@Column(name = "PaymentFrequency", nullable = false, length = 5)
		public String getPaymentFrequency()
			{
				return this.paymentFrequency;
			}
			
		public void setPaymentFrequency(String paymentFrequency)
			{
				this.paymentFrequency = paymentFrequency;
			}
			
		@Column(name = "FirstInstallment", nullable = false, length = 2)
		public String getFirstInstallment()
			{
				return this.firstInstallment;
			}
			
		public void setFirstInstallment(String firstInstallment)
			{
				this.firstInstallment = firstInstallment;
			}
			
		@Column(name = "InstallmentScheme", nullable = false, length = 2)
		public String getInstallmentScheme()
			{
				return this.installmentScheme;
			}
			
		public void setInstallmentScheme(String installmentScheme)
			{
				this.installmentScheme = installmentScheme;
			}
			
		@Column(name = "InterestType", nullable = false, length = 2)
		public String getInterestType()
			{
				return this.interestType;
			}
			
		public void setInterestType(String interestType)
			{
				this.interestType = interestType;
			}
			
		@Column(name = "NumOfInstallment", nullable = false)
		public short getNumOfInstallment()
			{
				return this.numOfInstallment;
			}
			
		public void setNumOfInstallment(short numOfInstallment)
			{
				this.numOfInstallment = numOfInstallment;
			}
			
		@Column(name = "Tenor", nullable = false)
		public short getTenor()
			{
				return this.tenor;
			}
			
		public void setTenor(short tenor)
			{
				this.tenor = tenor;
			}
			
		@Column(name = "CummulativeTenor", nullable = false)
		public short getCummulativeTenor()
			{
				return this.cummulativeTenor;
			}
			
		public void setCummulativeTenor(short cummulativeTenor)
			{
				this.cummulativeTenor = cummulativeTenor;
			}
			
		@Column(name = "InstallmentAmount", nullable = false, precision = 53, scale = 0)
		public double getInstallmentAmount()
			{
				return this.installmentAmount;
			}
			
		public void setInstallmentAmount(double installmentAmount)
			{
				this.installmentAmount = installmentAmount;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "GracePeriod", length = 16)
		public Date getGracePeriod()
			{
				return this.gracePeriod;
			}
			
		public void setGracePeriod(Date gracePeriod)
			{
				this.gracePeriod = gracePeriod;
			}
			
		@Column(name = "GracePeriodType", length = 2)
		public String getGracePeriodType()
			{
				return this.gracePeriodType;
			}
			
		public void setGracePeriodType(String gracePeriodType)
			{
				this.gracePeriodType = gracePeriodType;
			}
			
		@Column(name = "GrossYield", nullable = false, precision = 53, scale = 0)
		public double getGrossYield()
			{
				return this.grossYield;
			}
			
		public void setGrossYield(double grossYield)
			{
				this.grossYield = grossYield;
			}
			
		@Column(name = "OutstandingPrincipal", nullable = false, precision = 53, scale = 0)
		public double getOutstandingPrincipal()
			{
				return this.outstandingPrincipal;
			}
			
		public void setOutstandingPrincipal(double outstandingPrincipal)
			{
				this.outstandingPrincipal = outstandingPrincipal;
			}
			
		@Column(name = "OutstandingInterest", nullable = false, precision = 53, scale = 0)
		public double getOutstandingInterest()
			{
				return this.outstandingInterest;
			}
			
		public void setOutstandingInterest(double outstandingInterest)
			{
				this.outstandingInterest = outstandingInterest;
			}
			
		@Column(name = "TDPAmount", nullable = false, precision = 53, scale = 0)
		public double getTdpamount()
			{
				return this.tdpamount;
			}
			
		public void setTdpamount(double tdpamount)
			{
				this.tdpamount = tdpamount;
			}
			
		@Column(name = "DiffRateAmount", nullable = false, precision = 53, scale = 0)
		public double getDiffRateAmount()
			{
				return this.diffRateAmount;
			}
			
		public void setDiffRateAmount(double diffRateAmount)
			{
				this.diffRateAmount = diffRateAmount;
			}
			
		@Column(name = "IsAvalist", nullable = false)
		public short getIsAvalist()
			{
				return this.isAvalist;
			}
			
		public void setIsAvalist(short isAvalist)
			{
				this.isAvalist = isAvalist;
			}
			
		@Column(name = "IsNST", nullable = false)
		public short getIsNst()
			{
				return this.isNst;
			}
			
		public void setIsNst(short isNst)
			{
				this.isNst = isNst;
			}
			
		@Column(name = "IsIncentiveSupplier", nullable = false)
		public short getIsIncentiveSupplier()
			{
				return this.isIncentiveSupplier;
			}
			
		public void setIsIncentiveSupplier(short isIncentiveSupplier)
			{
				this.isIncentiveSupplier = isIncentiveSupplier;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "MaturityDate", length = 23)
		public Date getMaturityDate()
			{
				return this.maturityDate;
			}
			
		public void setMaturityDate(Date maturityDate)
			{
				this.maturityDate = maturityDate;
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
			
	}
