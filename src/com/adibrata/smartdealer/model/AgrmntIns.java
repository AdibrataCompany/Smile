
package com.adibrata.smartdealer.model;
// Generated Jul 27, 2015 12:24:25 PM by Hibernate Tools 4.3.1

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
 * AgrmntIns generated by hbm2java
 */
@Entity
@Table(name = "AgrmntIns", catalog = "SmartDealer")
public class AgrmntIns implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private InsCompanyOffice insCompanyOffice;
		private Long currencyId;
		private String applicationType;
		private Date startDate;
		private Date endDate;
		private String policyNumber;
		private Date policyReceiveDate;
		private String policyReceiveBy;
		private String flagInsActivation;
		private String flagReNew;
		private String flagInsStatus;
		private Date sppadate;
		private String sppano;
		private String insuranceRateType;
		private double sumInsured;
		private Date insCoSelectionDate;
		private double sellingRate;
		private double sellingAmount;
		private double adminFee;
		private double meteraiFee;
		private double earnAmount;
		private String insNotes;
		private String accNotes;
		private Date requestDate;
		private Date insActivateDate;
		private short insLength;
		private String mainCoverage;
		private String additionalCoverage;
		private String endorsDocNo;
		private String bdendorsDocNo;
		private Date bdendorsDate;
		private String bdendorsPolicyNo;
		private Date bdendorsPolicyReceiveDate;
		private double endorsToInsCoPremium;
		private double endorsPaidToInsCo;
		private double endorsAdditionalPremium;
		private String flagClaimProcess;
		private Date lastClaimDate;
		private String flagDocStatus;
		private double paidAmountByCust;
		private Double waivedAmountByCust;
		private Date paidDate;
		private double lateCharges;
		private long accPayId;
		private String insuredBy;
		private String insurancePaidBy;
		private double claimAmount;
		private double paidClaimAmount;
		private int yearNum;
		private Date terminationDate;
		private String isChangeInsCo;
		private String changeInsCoReason;
		private String coverPeriod;
		private String renewalDocNo;
		private Date renewalDocDate;
		private Double premiumBaseForRefundSupp;
		private String invoiceNo;
		private Double invoiceAmount;
		private Date invoiceDate;
		private Date receivedInvoiceDate;
		private Date flagInsStatusDate;
		private String sppaprintStatus;
		private boolean isValidCustomerName;
		private boolean isValidAddress;
		private boolean isValidInsurancePeriode;
		private boolean isValidInsLength;
		private boolean isValidNumOfAsset;
		private boolean isValid;
		private Double insCapitalizedAmount;
		private Double addCapitalizedAmount;
		private short isNewCover;
		private String batchId;
		private Date batchDate;
		private String generate;
		private String typeCorrectionCode;
		private Date confirmDate;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private Set<AgrmntInsAsset> agrmntInsAssets = new HashSet<AgrmntInsAsset>(0);
		private Set<AgrmntInsStandardInfo> agrmntInsStandardInfos = new HashSet<AgrmntInsStandardInfo>(0);
		private Set<AgrmntInsInsco> agrmntInsInscos = new HashSet<AgrmntInsInsco>(0);
		private Set<AgrmntInsCust> agrmntInsCusts = new HashSet<AgrmntInsCust>(0);
		
		public AgrmntIns()
			{
			}
			
		public AgrmntIns(long id, String policyNumber, String policyReceiveBy, String flagReNew, String flagInsStatus, String sppano, String insuranceRateType, double sumInsured, double sellingRate, double sellingAmount, double adminFee,
		        double meteraiFee, double earnAmount, String insNotes, String accNotes, short insLength, String mainCoverage, String additionalCoverage, String endorsDocNo, String bdendorsDocNo, String bdendorsPolicyNo, double endorsToInsCoPremium,
		        double endorsPaidToInsCo, double endorsAdditionalPremium, String flagClaimProcess, String flagDocStatus, double paidAmountByCust, double lateCharges, long accPayId, double claimAmount, double paidClaimAmount, int yearNum,
		        String isChangeInsCo, String changeInsCoReason, String coverPeriod, String renewalDocNo, Double premiumBaseForRefundSupp, boolean isValidCustomerName, boolean isValidAddress, boolean isValidInsurancePeriode, boolean isValidInsLength,
		        boolean isValidNumOfAsset, boolean isValid, short isNewCover)
			{
				this.id = id;
				this.policyNumber = policyNumber;
				this.policyReceiveBy = policyReceiveBy;
				this.flagReNew = flagReNew;
				this.flagInsStatus = flagInsStatus;
				this.sppano = sppano;
				this.insuranceRateType = insuranceRateType;
				this.sumInsured = sumInsured;
				this.sellingRate = sellingRate;
				this.sellingAmount = sellingAmount;
				this.adminFee = adminFee;
				this.meteraiFee = meteraiFee;
				this.earnAmount = earnAmount;
				this.insNotes = insNotes;
				this.accNotes = accNotes;
				this.insLength = insLength;
				this.mainCoverage = mainCoverage;
				this.additionalCoverage = additionalCoverage;
				this.endorsDocNo = endorsDocNo;
				this.bdendorsDocNo = bdendorsDocNo;
				this.bdendorsPolicyNo = bdendorsPolicyNo;
				this.endorsToInsCoPremium = endorsToInsCoPremium;
				this.endorsPaidToInsCo = endorsPaidToInsCo;
				this.endorsAdditionalPremium = endorsAdditionalPremium;
				this.flagClaimProcess = flagClaimProcess;
				this.flagDocStatus = flagDocStatus;
				this.paidAmountByCust = paidAmountByCust;
				this.lateCharges = lateCharges;
				this.accPayId = accPayId;
				this.claimAmount = claimAmount;
				this.paidClaimAmount = paidClaimAmount;
				this.yearNum = yearNum;
				this.isChangeInsCo = isChangeInsCo;
				this.changeInsCoReason = changeInsCoReason;
				this.coverPeriod = coverPeriod;
				this.renewalDocNo = renewalDocNo;
				this.premiumBaseForRefundSupp = premiumBaseForRefundSupp;
				this.isValidCustomerName = isValidCustomerName;
				this.isValidAddress = isValidAddress;
				this.isValidInsurancePeriode = isValidInsurancePeriode;
				this.isValidInsLength = isValidInsLength;
				this.isValidNumOfAsset = isValidNumOfAsset;
				this.isValid = isValid;
				this.isNewCover = isNewCover;
			}
			
		public AgrmntIns(long id, Agrmnt agrmnt, InsCompanyOffice insCompanyOffice, Long currencyId, String applicationType, Date startDate, Date endDate, String policyNumber, Date policyReceiveDate, String policyReceiveBy, String flagInsActivation,
		        String flagReNew, String flagInsStatus, Date sppadate, String sppano, String insuranceRateType, double sumInsured, Date insCoSelectionDate, double sellingRate, double sellingAmount, double adminFee, double meteraiFee,
		        double earnAmount, String insNotes, String accNotes, Date requestDate, Date insActivateDate, short insLength, String mainCoverage, String additionalCoverage, String endorsDocNo, String bdendorsDocNo, Date bdendorsDate,
		        String bdendorsPolicyNo, Date bdendorsPolicyReceiveDate, double endorsToInsCoPremium, double endorsPaidToInsCo, double endorsAdditionalPremium, String flagClaimProcess, Date lastClaimDate, String flagDocStatus,
		        double paidAmountByCust, Double waivedAmountByCust, Date paidDate, double lateCharges, long accPayId, String insuredBy, String insurancePaidBy, double claimAmount, double paidClaimAmount, int yearNum, Date terminationDate,
		        String isChangeInsCo, String changeInsCoReason, String coverPeriod, String renewalDocNo, Date renewalDocDate, Double premiumBaseForRefundSupp, String invoiceNo, Double invoiceAmount, Date invoiceDate, Date receivedInvoiceDate,
		        Date flagInsStatusDate, String sppaprintStatus, boolean isValidCustomerName, boolean isValidAddress, boolean isValidInsurancePeriode, boolean isValidInsLength, boolean isValidNumOfAsset, boolean isValid, Double insCapitalizedAmount,
		        Double addCapitalizedAmount, short isNewCover, String batchId, Date batchDate, String generate, String typeCorrectionCode, Date confirmDate, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt, Set<AgrmntInsAsset> agrmntInsAssets,
		        Set<AgrmntInsStandardInfo> agrmntInsStandardInfos, Set<AgrmntInsInsco> agrmntInsInscos, Set<AgrmntInsCust> agrmntInsCusts)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.insCompanyOffice = insCompanyOffice;
				this.currencyId = currencyId;
				this.applicationType = applicationType;
				this.startDate = startDate;
				this.endDate = endDate;
				this.policyNumber = policyNumber;
				this.policyReceiveDate = policyReceiveDate;
				this.policyReceiveBy = policyReceiveBy;
				this.flagInsActivation = flagInsActivation;
				this.flagReNew = flagReNew;
				this.flagInsStatus = flagInsStatus;
				this.sppadate = sppadate;
				this.sppano = sppano;
				this.insuranceRateType = insuranceRateType;
				this.sumInsured = sumInsured;
				this.insCoSelectionDate = insCoSelectionDate;
				this.sellingRate = sellingRate;
				this.sellingAmount = sellingAmount;
				this.adminFee = adminFee;
				this.meteraiFee = meteraiFee;
				this.earnAmount = earnAmount;
				this.insNotes = insNotes;
				this.accNotes = accNotes;
				this.requestDate = requestDate;
				this.insActivateDate = insActivateDate;
				this.insLength = insLength;
				this.mainCoverage = mainCoverage;
				this.additionalCoverage = additionalCoverage;
				this.endorsDocNo = endorsDocNo;
				this.bdendorsDocNo = bdendorsDocNo;
				this.bdendorsDate = bdendorsDate;
				this.bdendorsPolicyNo = bdendorsPolicyNo;
				this.bdendorsPolicyReceiveDate = bdendorsPolicyReceiveDate;
				this.endorsToInsCoPremium = endorsToInsCoPremium;
				this.endorsPaidToInsCo = endorsPaidToInsCo;
				this.endorsAdditionalPremium = endorsAdditionalPremium;
				this.flagClaimProcess = flagClaimProcess;
				this.lastClaimDate = lastClaimDate;
				this.flagDocStatus = flagDocStatus;
				this.paidAmountByCust = paidAmountByCust;
				this.waivedAmountByCust = waivedAmountByCust;
				this.paidDate = paidDate;
				this.lateCharges = lateCharges;
				this.accPayId = accPayId;
				this.insuredBy = insuredBy;
				this.insurancePaidBy = insurancePaidBy;
				this.claimAmount = claimAmount;
				this.paidClaimAmount = paidClaimAmount;
				this.yearNum = yearNum;
				this.terminationDate = terminationDate;
				this.isChangeInsCo = isChangeInsCo;
				this.changeInsCoReason = changeInsCoReason;
				this.coverPeriod = coverPeriod;
				this.renewalDocNo = renewalDocNo;
				this.renewalDocDate = renewalDocDate;
				this.premiumBaseForRefundSupp = premiumBaseForRefundSupp;
				this.invoiceNo = invoiceNo;
				this.invoiceAmount = invoiceAmount;
				this.invoiceDate = invoiceDate;
				this.receivedInvoiceDate = receivedInvoiceDate;
				this.flagInsStatusDate = flagInsStatusDate;
				this.sppaprintStatus = sppaprintStatus;
				this.isValidCustomerName = isValidCustomerName;
				this.isValidAddress = isValidAddress;
				this.isValidInsurancePeriode = isValidInsurancePeriode;
				this.isValidInsLength = isValidInsLength;
				this.isValidNumOfAsset = isValidNumOfAsset;
				this.isValid = isValid;
				this.insCapitalizedAmount = insCapitalizedAmount;
				this.addCapitalizedAmount = addCapitalizedAmount;
				this.isNewCover = isNewCover;
				this.batchId = batchId;
				this.batchDate = batchDate;
				this.generate = generate;
				this.typeCorrectionCode = typeCorrectionCode;
				this.confirmDate = confirmDate;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.agrmntInsAssets = agrmntInsAssets;
				this.agrmntInsStandardInfos = agrmntInsStandardInfos;
				this.agrmntInsInscos = agrmntInsInscos;
				this.agrmntInsCusts = agrmntInsCusts;
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
		@JoinColumn(name = "AgrmntIId")
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		public void setAgrmnt(Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "InsCompanyOfficeId")
		public InsCompanyOffice getInsCompanyOffice()
			{
				return this.insCompanyOffice;
			}
			
		public void setInsCompanyOffice(InsCompanyOffice insCompanyOffice)
			{
				this.insCompanyOffice = insCompanyOffice;
			}
			
		@Column(name = "CurrencyId")
		public Long getCurrencyId()
			{
				return this.currencyId;
			}
			
		public void setCurrencyId(Long currencyId)
			{
				this.currencyId = currencyId;
			}
			
		@Column(name = "ApplicationType", length = 10)
		public String getApplicationType()
			{
				return this.applicationType;
			}
			
		public void setApplicationType(String applicationType)
			{
				this.applicationType = applicationType;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "StartDate", length = 23)
		public Date getStartDate()
			{
				return this.startDate;
			}
			
		public void setStartDate(Date startDate)
			{
				this.startDate = startDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "EndDate", length = 23)
		public Date getEndDate()
			{
				return this.endDate;
			}
			
		public void setEndDate(Date endDate)
			{
				this.endDate = endDate;
			}
			
		@Column(name = "PolicyNumber", nullable = false, length = 25)
		public String getPolicyNumber()
			{
				return this.policyNumber;
			}
			
		public void setPolicyNumber(String policyNumber)
			{
				this.policyNumber = policyNumber;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "PolicyReceiveDate", length = 23)
		public Date getPolicyReceiveDate()
			{
				return this.policyReceiveDate;
			}
			
		public void setPolicyReceiveDate(Date policyReceiveDate)
			{
				this.policyReceiveDate = policyReceiveDate;
			}
			
		@Column(name = "PolicyReceiveBy", nullable = false, length = 12)
		public String getPolicyReceiveBy()
			{
				return this.policyReceiveBy;
			}
			
		public void setPolicyReceiveBy(String policyReceiveBy)
			{
				this.policyReceiveBy = policyReceiveBy;
			}
			
		@Column(name = "FlagInsActivation", length = 1)
		public String getFlagInsActivation()
			{
				return this.flagInsActivation;
			}
			
		public void setFlagInsActivation(String flagInsActivation)
			{
				this.flagInsActivation = flagInsActivation;
			}
			
		@Column(name = "FlagReNew", nullable = false, length = 1)
		public String getFlagReNew()
			{
				return this.flagReNew;
			}
			
		public void setFlagReNew(String flagReNew)
			{
				this.flagReNew = flagReNew;
			}
			
		@Column(name = "FlagInsStatus", nullable = false, length = 1)
		public String getFlagInsStatus()
			{
				return this.flagInsStatus;
			}
			
		public void setFlagInsStatus(String flagInsStatus)
			{
				this.flagInsStatus = flagInsStatus;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "SPPADate", length = 23)
		public Date getSppadate()
			{
				return this.sppadate;
			}
			
		public void setSppadate(Date sppadate)
			{
				this.sppadate = sppadate;
			}
			
		@Column(name = "SPPANo", nullable = false, length = 30)
		public String getSppano()
			{
				return this.sppano;
			}
			
		public void setSppano(String sppano)
			{
				this.sppano = sppano;
			}
			
		@Column(name = "InsuranceRateType", nullable = false, length = 20)
		public String getInsuranceRateType()
			{
				return this.insuranceRateType;
			}
			
		public void setInsuranceRateType(String insuranceRateType)
			{
				this.insuranceRateType = insuranceRateType;
			}
			
		@Column(name = "SumInsured", nullable = false, precision = 53, scale = 0)
		public double getSumInsured()
			{
				return this.sumInsured;
			}
			
		public void setSumInsured(double sumInsured)
			{
				this.sumInsured = sumInsured;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "InsCoSelectionDate", length = 23)
		public Date getInsCoSelectionDate()
			{
				return this.insCoSelectionDate;
			}
			
		public void setInsCoSelectionDate(Date insCoSelectionDate)
			{
				this.insCoSelectionDate = insCoSelectionDate;
			}
			
		@Column(name = "SellingRate", nullable = false, precision = 53, scale = 0)
		public double getSellingRate()
			{
				return this.sellingRate;
			}
			
		public void setSellingRate(double sellingRate)
			{
				this.sellingRate = sellingRate;
			}
			
		@Column(name = "SellingAmount", nullable = false, precision = 53, scale = 0)
		public double getSellingAmount()
			{
				return this.sellingAmount;
			}
			
		public void setSellingAmount(double sellingAmount)
			{
				this.sellingAmount = sellingAmount;
			}
			
		@Column(name = "AdminFee", nullable = false, precision = 53, scale = 0)
		public double getAdminFee()
			{
				return this.adminFee;
			}
			
		public void setAdminFee(double adminFee)
			{
				this.adminFee = adminFee;
			}
			
		@Column(name = "MeteraiFee", nullable = false, precision = 53, scale = 0)
		public double getMeteraiFee()
			{
				return this.meteraiFee;
			}
			
		public void setMeteraiFee(double meteraiFee)
			{
				this.meteraiFee = meteraiFee;
			}
			
		@Column(name = "EarnAmount", nullable = false, precision = 53, scale = 0)
		public double getEarnAmount()
			{
				return this.earnAmount;
			}
			
		public void setEarnAmount(double earnAmount)
			{
				this.earnAmount = earnAmount;
			}
			
		@Column(name = "InsNotes", nullable = false, length = 500)
		public String getInsNotes()
			{
				return this.insNotes;
			}
			
		public void setInsNotes(String insNotes)
			{
				this.insNotes = insNotes;
			}
			
		@Column(name = "AccNotes", nullable = false, length = 500)
		public String getAccNotes()
			{
				return this.accNotes;
			}
			
		public void setAccNotes(String accNotes)
			{
				this.accNotes = accNotes;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "RequestDate", length = 23)
		public Date getRequestDate()
			{
				return this.requestDate;
			}
			
		public void setRequestDate(Date requestDate)
			{
				this.requestDate = requestDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "InsActivateDate", length = 23)
		public Date getInsActivateDate()
			{
				return this.insActivateDate;
			}
			
		public void setInsActivateDate(Date insActivateDate)
			{
				this.insActivateDate = insActivateDate;
			}
			
		@Column(name = "InsLength", nullable = false)
		public short getInsLength()
			{
				return this.insLength;
			}
			
		public void setInsLength(short insLength)
			{
				this.insLength = insLength;
			}
			
		@Column(name = "MainCoverage", nullable = false, length = 50)
		public String getMainCoverage()
			{
				return this.mainCoverage;
			}
			
		public void setMainCoverage(String mainCoverage)
			{
				this.mainCoverage = mainCoverage;
			}
			
		@Column(name = "AdditionalCoverage", nullable = false, length = 50)
		public String getAdditionalCoverage()
			{
				return this.additionalCoverage;
			}
			
		public void setAdditionalCoverage(String additionalCoverage)
			{
				this.additionalCoverage = additionalCoverage;
			}
			
		@Column(name = "EndorsDocNo", nullable = false, length = 20)
		public String getEndorsDocNo()
			{
				return this.endorsDocNo;
			}
			
		public void setEndorsDocNo(String endorsDocNo)
			{
				this.endorsDocNo = endorsDocNo;
			}
			
		@Column(name = "BDEndorsDocNo", nullable = false, length = 20)
		public String getBdendorsDocNo()
			{
				return this.bdendorsDocNo;
			}
			
		public void setBdendorsDocNo(String bdendorsDocNo)
			{
				this.bdendorsDocNo = bdendorsDocNo;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "BDEndorsDate", length = 23)
		public Date getBdendorsDate()
			{
				return this.bdendorsDate;
			}
			
		public void setBdendorsDate(Date bdendorsDate)
			{
				this.bdendorsDate = bdendorsDate;
			}
			
		@Column(name = "BDEndorsPolicyNo", nullable = false, length = 25)
		public String getBdendorsPolicyNo()
			{
				return this.bdendorsPolicyNo;
			}
			
		public void setBdendorsPolicyNo(String bdendorsPolicyNo)
			{
				this.bdendorsPolicyNo = bdendorsPolicyNo;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "BDEndorsPolicyReceiveDate", length = 23)
		public Date getBdendorsPolicyReceiveDate()
			{
				return this.bdendorsPolicyReceiveDate;
			}
			
		public void setBdendorsPolicyReceiveDate(Date bdendorsPolicyReceiveDate)
			{
				this.bdendorsPolicyReceiveDate = bdendorsPolicyReceiveDate;
			}
			
		@Column(name = "EndorsToInsCoPremium", nullable = false, precision = 53, scale = 0)
		public double getEndorsToInsCoPremium()
			{
				return this.endorsToInsCoPremium;
			}
			
		public void setEndorsToInsCoPremium(double endorsToInsCoPremium)
			{
				this.endorsToInsCoPremium = endorsToInsCoPremium;
			}
			
		@Column(name = "EndorsPaidToInsCo", nullable = false, precision = 53, scale = 0)
		public double getEndorsPaidToInsCo()
			{
				return this.endorsPaidToInsCo;
			}
			
		public void setEndorsPaidToInsCo(double endorsPaidToInsCo)
			{
				this.endorsPaidToInsCo = endorsPaidToInsCo;
			}
			
		@Column(name = "EndorsAdditionalPremium", nullable = false, precision = 53, scale = 0)
		public double getEndorsAdditionalPremium()
			{
				return this.endorsAdditionalPremium;
			}
			
		public void setEndorsAdditionalPremium(double endorsAdditionalPremium)
			{
				this.endorsAdditionalPremium = endorsAdditionalPremium;
			}
			
		@Column(name = "FlagClaimProcess", nullable = false, length = 1)
		public String getFlagClaimProcess()
			{
				return this.flagClaimProcess;
			}
			
		public void setFlagClaimProcess(String flagClaimProcess)
			{
				this.flagClaimProcess = flagClaimProcess;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "LastClaimDate", length = 23)
		public Date getLastClaimDate()
			{
				return this.lastClaimDate;
			}
			
		public void setLastClaimDate(Date lastClaimDate)
			{
				this.lastClaimDate = lastClaimDate;
			}
			
		@Column(name = "FlagDocStatus", nullable = false, length = 1)
		public String getFlagDocStatus()
			{
				return this.flagDocStatus;
			}
			
		public void setFlagDocStatus(String flagDocStatus)
			{
				this.flagDocStatus = flagDocStatus;
			}
			
		@Column(name = "PaidAmountByCust", nullable = false, precision = 53, scale = 0)
		public double getPaidAmountByCust()
			{
				return this.paidAmountByCust;
			}
			
		public void setPaidAmountByCust(double paidAmountByCust)
			{
				this.paidAmountByCust = paidAmountByCust;
			}
			
		@Column(name = "WaivedAmountByCust", precision = 53, scale = 0)
		public Double getWaivedAmountByCust()
			{
				return this.waivedAmountByCust;
			}
			
		public void setWaivedAmountByCust(Double waivedAmountByCust)
			{
				this.waivedAmountByCust = waivedAmountByCust;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "PaidDate", length = 23)
		public Date getPaidDate()
			{
				return this.paidDate;
			}
			
		public void setPaidDate(Date paidDate)
			{
				this.paidDate = paidDate;
			}
			
		@Column(name = "LateCharges", nullable = false, precision = 53, scale = 0)
		public double getLateCharges()
			{
				return this.lateCharges;
			}
			
		public void setLateCharges(double lateCharges)
			{
				this.lateCharges = lateCharges;
			}
			
		@Column(name = "AccPayId", nullable = false)
		public long getAccPayId()
			{
				return this.accPayId;
			}
			
		public void setAccPayId(long accPayId)
			{
				this.accPayId = accPayId;
			}
			
		@Column(name = "InsuredBy", length = 10)
		public String getInsuredBy()
			{
				return this.insuredBy;
			}
			
		public void setInsuredBy(String insuredBy)
			{
				this.insuredBy = insuredBy;
			}
			
		@Column(name = "InsurancePaidBy", length = 10)
		public String getInsurancePaidBy()
			{
				return this.insurancePaidBy;
			}
			
		public void setInsurancePaidBy(String insurancePaidBy)
			{
				this.insurancePaidBy = insurancePaidBy;
			}
			
		@Column(name = "ClaimAmount", nullable = false, precision = 53, scale = 0)
		public double getClaimAmount()
			{
				return this.claimAmount;
			}
			
		public void setClaimAmount(double claimAmount)
			{
				this.claimAmount = claimAmount;
			}
			
		@Column(name = "PaidClaimAmount", nullable = false, precision = 53, scale = 0)
		public double getPaidClaimAmount()
			{
				return this.paidClaimAmount;
			}
			
		public void setPaidClaimAmount(double paidClaimAmount)
			{
				this.paidClaimAmount = paidClaimAmount;
			}
			
		@Column(name = "YearNum", nullable = false)
		public int getYearNum()
			{
				return this.yearNum;
			}
			
		public void setYearNum(int yearNum)
			{
				this.yearNum = yearNum;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "TerminationDate", length = 23)
		public Date getTerminationDate()
			{
				return this.terminationDate;
			}
			
		public void setTerminationDate(Date terminationDate)
			{
				this.terminationDate = terminationDate;
			}
			
		@Column(name = "IsChangeInsCo", nullable = false, length = 1)
		public String getIsChangeInsCo()
			{
				return this.isChangeInsCo;
			}
			
		public void setIsChangeInsCo(String isChangeInsCo)
			{
				this.isChangeInsCo = isChangeInsCo;
			}
			
		@Column(name = "ChangeInsCoReason", nullable = false, length = 50)
		public String getChangeInsCoReason()
			{
				return this.changeInsCoReason;
			}
			
		public void setChangeInsCoReason(String changeInsCoReason)
			{
				this.changeInsCoReason = changeInsCoReason;
			}
			
		@Column(name = "CoverPeriod", nullable = false, length = 2)
		public String getCoverPeriod()
			{
				return this.coverPeriod;
			}
			
		public void setCoverPeriod(String coverPeriod)
			{
				this.coverPeriod = coverPeriod;
			}
			
		@Column(name = "RenewalDocNo", nullable = false, length = 20)
		public String getRenewalDocNo()
			{
				return this.renewalDocNo;
			}
			
		public void setRenewalDocNo(String renewalDocNo)
			{
				this.renewalDocNo = renewalDocNo;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "RenewalDocDate", length = 23)
		public Date getRenewalDocDate()
			{
				return this.renewalDocDate;
			}
			
		public void setRenewalDocDate(Date renewalDocDate)
			{
				this.renewalDocDate = renewalDocDate;
			}
			
		@Column(name = "PremiumBaseForRefundSupp", nullable = false, precision = 17)
		public Double getPremiumBaseForRefundSupp()
			{
				return this.premiumBaseForRefundSupp;
			}
			
		public void setPremiumBaseForRefundSupp(Double premiumBaseForRefundSupp)
			{
				this.premiumBaseForRefundSupp = premiumBaseForRefundSupp;
			}
			
		@Column(name = "InvoiceNo", length = 20)
		public String getInvoiceNo()
			{
				return this.invoiceNo;
			}
			
		public void setInvoiceNo(String invoiceNo)
			{
				this.invoiceNo = invoiceNo;
			}
			
		@Column(name = "InvoiceAmount", precision = 17)
		public Double getInvoiceAmount()
			{
				return this.invoiceAmount;
			}
			
		public void setInvoiceAmount(Double invoiceAmount)
			{
				this.invoiceAmount = invoiceAmount;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "InvoiceDate", length = 23)
		public Date getInvoiceDate()
			{
				return this.invoiceDate;
			}
			
		public void setInvoiceDate(Date invoiceDate)
			{
				this.invoiceDate = invoiceDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ReceivedInvoiceDate", length = 23)
		public Date getReceivedInvoiceDate()
			{
				return this.receivedInvoiceDate;
			}
			
		public void setReceivedInvoiceDate(Date receivedInvoiceDate)
			{
				this.receivedInvoiceDate = receivedInvoiceDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "FlagInsStatusDate", length = 23)
		public Date getFlagInsStatusDate()
			{
				return this.flagInsStatusDate;
			}
			
		public void setFlagInsStatusDate(Date flagInsStatusDate)
			{
				this.flagInsStatusDate = flagInsStatusDate;
			}
			
		@Column(name = "SPPAPrintStatus", length = 1)
		public String getSppaprintStatus()
			{
				return this.sppaprintStatus;
			}
			
		public void setSppaprintStatus(String sppaprintStatus)
			{
				this.sppaprintStatus = sppaprintStatus;
			}
			
		@Column(name = "IsValidCustomerName", nullable = false)
		public boolean isIsValidCustomerName()
			{
				return this.isValidCustomerName;
			}
			
		public void setIsValidCustomerName(boolean isValidCustomerName)
			{
				this.isValidCustomerName = isValidCustomerName;
			}
			
		@Column(name = "IsValidAddress", nullable = false)
		public boolean isIsValidAddress()
			{
				return this.isValidAddress;
			}
			
		public void setIsValidAddress(boolean isValidAddress)
			{
				this.isValidAddress = isValidAddress;
			}
			
		@Column(name = "IsValidInsurancePeriode", nullable = false)
		public boolean isIsValidInsurancePeriode()
			{
				return this.isValidInsurancePeriode;
			}
			
		public void setIsValidInsurancePeriode(boolean isValidInsurancePeriode)
			{
				this.isValidInsurancePeriode = isValidInsurancePeriode;
			}
			
		@Column(name = "IsValidInsLength", nullable = false)
		public boolean isIsValidInsLength()
			{
				return this.isValidInsLength;
			}
			
		public void setIsValidInsLength(boolean isValidInsLength)
			{
				this.isValidInsLength = isValidInsLength;
			}
			
		@Column(name = "IsValidNumOfAsset", nullable = false)
		public boolean isIsValidNumOfAsset()
			{
				return this.isValidNumOfAsset;
			}
			
		public void setIsValidNumOfAsset(boolean isValidNumOfAsset)
			{
				this.isValidNumOfAsset = isValidNumOfAsset;
			}
			
		@Column(name = "IsValid", nullable = false)
		public boolean isIsValid()
			{
				return this.isValid;
			}
			
		public void setIsValid(boolean isValid)
			{
				this.isValid = isValid;
			}
			
		@Column(name = "InsCapitalizedAmount", precision = 17)
		public Double getInsCapitalizedAmount()
			{
				return this.insCapitalizedAmount;
			}
			
		public void setInsCapitalizedAmount(Double insCapitalizedAmount)
			{
				this.insCapitalizedAmount = insCapitalizedAmount;
			}
			
		@Column(name = "AddCapitalizedAmount", precision = 17)
		public Double getAddCapitalizedAmount()
			{
				return this.addCapitalizedAmount;
			}
			
		public void setAddCapitalizedAmount(Double addCapitalizedAmount)
			{
				this.addCapitalizedAmount = addCapitalizedAmount;
			}
			
		@Column(name = "IsNewCover", nullable = false)
		public short getIsNewCover()
			{
				return this.isNewCover;
			}
			
		public void setIsNewCover(short isNewCover)
			{
				this.isNewCover = isNewCover;
			}
			
		@Column(name = "BatchID", length = 20)
		public String getBatchId()
			{
				return this.batchId;
			}
			
		public void setBatchId(String batchId)
			{
				this.batchId = batchId;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "BatchDate", length = 23)
		public Date getBatchDate()
			{
				return this.batchDate;
			}
			
		public void setBatchDate(Date batchDate)
			{
				this.batchDate = batchDate;
			}
			
		@Column(name = "Generate", length = 4)
		public String getGenerate()
			{
				return this.generate;
			}
			
		public void setGenerate(String generate)
			{
				this.generate = generate;
			}
			
		@Column(name = "TypeCorrectionCode", length = 10)
		public String getTypeCorrectionCode()
			{
				return this.typeCorrectionCode;
			}
			
		public void setTypeCorrectionCode(String typeCorrectionCode)
			{
				this.typeCorrectionCode = typeCorrectionCode;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ConfirmDate", length = 23)
		public Date getConfirmDate()
			{
				return this.confirmDate;
			}
			
		public void setConfirmDate(Date confirmDate)
			{
				this.confirmDate = confirmDate;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmntIns")
		public Set<AgrmntInsAsset> getAgrmntInsAssets()
			{
				return this.agrmntInsAssets;
			}
			
		public void setAgrmntInsAssets(Set<AgrmntInsAsset> agrmntInsAssets)
			{
				this.agrmntInsAssets = agrmntInsAssets;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmntIns")
		public Set<AgrmntInsStandardInfo> getAgrmntInsStandardInfos()
			{
				return this.agrmntInsStandardInfos;
			}
			
		public void setAgrmntInsStandardInfos(Set<AgrmntInsStandardInfo> agrmntInsStandardInfos)
			{
				this.agrmntInsStandardInfos = agrmntInsStandardInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmntIns")
		public Set<AgrmntInsInsco> getAgrmntInsInscos()
			{
				return this.agrmntInsInscos;
			}
			
		public void setAgrmntInsInscos(Set<AgrmntInsInsco> agrmntInsInscos)
			{
				this.agrmntInsInscos = agrmntInsInscos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmntIns")
		public Set<AgrmntInsCust> getAgrmntInsCusts()
			{
				return this.agrmntInsCusts;
			}
			
		public void setAgrmntInsCusts(Set<AgrmntInsCust> agrmntInsCusts)
			{
				this.agrmntInsCusts = agrmntInsCusts;
			}
			
	}
