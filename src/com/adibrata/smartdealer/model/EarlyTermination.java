
package com.adibrata.smartdealer.model;
// Generated Sep 27, 2015 10:48:45 AM by Hibernate Tools 4.3.1.Final

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
 * EarlyTermination generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "EarlyTermination", catalog = "SmartDealer")
public class EarlyTermination implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private String etcode;
		private double currencyRate;
		private Date efectiveDate;
		private Date requestDate;
		private String prepaymentType;
		private double prepaymentAmount;
		private double totalAmountToBePaid;
		private double osP;
		private double osI;
		private double osPbankPortion;
		private double osIbankPortion;
		private double osInstDue;
		private double osIntDueBankPortion;
		private double osInsDue;
		private double osLcinst;
		private double osLcins;
		private double lcinstCurrent;
		private double lcinsCurrent;
		private double etFeeAmt;
		private double accruedAmt;
		private Double accruedAmtBankPortion;
		private double lcinstDiscAmt;
		private double lcinsDiscAmt;
		private double insDiscAmt;
		private double instDiscAmt;
		private double etDiscAmt;
		private double prepaidAmt;
		private String insTermFlag;
		private String notes;
		private String reasonTypeId;
		private String reasonId;
		private long jobId;
		private String etStatus;
		private Date statusDate;
		private String requestBy;
		private long approvalId;
		private Double accruedDiscAmt;
		private Double osPdue;
		private Double osPdueBankPortion;
		private Double osIdue;
		private Double osIdueBankPortion;
		private Double principalDueDisc;
		private Double interestDueDisc;
		private Double toleranceAmount;
		private Double osdiffRate;
		private Double accruedDiffRateEom;
		private Double osinsuranceIncome;
		private Double accruedInsuranceIncomeEom;
		private Double osincentive;
		private Double accruedIncentiveEom;
		private Double osprovision;
		private Double accruedProvisionEom;
		private double osadminFee;
		private double accruedAdminFeeEom;
		private Double osdeferredInsurInc;
		private Double accruedDeferredInsurIncEom;
		private Double osotherRefund;
		private Double accruedOtherRefundEom;
		private Double osadmFee;
		private Double accruedAdmFeeEom;
		private Double osprovisionFee;
		private Double accruedProvisionFeeEom;
		private Double osotherFee;
		private Double accruedOtherFeeEom;
		private Double ossurveyFee;
		private Double accruedSurveyFeeEom;
		private Double oscostOfSurveyFee;
		private Double accruedCostOfSurveyFeeEom;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public EarlyTermination()
			{
			}
			
		public EarlyTermination(long id, String etcode, double currencyRate, Date efectiveDate, Date requestDate, String prepaymentType, double prepaymentAmount, double totalAmountToBePaid, double osP, double osI, double osPbankPortion,
		        double osIbankPortion, double osInstDue, double osIntDueBankPortion, double osInsDue, double osLcinst, double osLcins, double lcinstCurrent, double lcinsCurrent, double etFeeAmt, double accruedAmt, double lcinstDiscAmt,
		        double lcinsDiscAmt, double insDiscAmt, double instDiscAmt, double etDiscAmt, double prepaidAmt, String insTermFlag, String notes, String reasonTypeId, String reasonId, long jobId, String etStatus, Date statusDate, String requestBy,
		        long approvalId, double osadminFee, double accruedAdminFeeEom)
			{
				this.id = id;
				this.etcode = etcode;
				this.currencyRate = currencyRate;
				this.efectiveDate = efectiveDate;
				this.requestDate = requestDate;
				this.prepaymentType = prepaymentType;
				this.prepaymentAmount = prepaymentAmount;
				this.totalAmountToBePaid = totalAmountToBePaid;
				this.osP = osP;
				this.osI = osI;
				this.osPbankPortion = osPbankPortion;
				this.osIbankPortion = osIbankPortion;
				this.osInstDue = osInstDue;
				this.osIntDueBankPortion = osIntDueBankPortion;
				this.osInsDue = osInsDue;
				this.osLcinst = osLcinst;
				this.osLcins = osLcins;
				this.lcinstCurrent = lcinstCurrent;
				this.lcinsCurrent = lcinsCurrent;
				this.etFeeAmt = etFeeAmt;
				this.accruedAmt = accruedAmt;
				this.lcinstDiscAmt = lcinstDiscAmt;
				this.lcinsDiscAmt = lcinsDiscAmt;
				this.insDiscAmt = insDiscAmt;
				this.instDiscAmt = instDiscAmt;
				this.etDiscAmt = etDiscAmt;
				this.prepaidAmt = prepaidAmt;
				this.insTermFlag = insTermFlag;
				this.notes = notes;
				this.reasonTypeId = reasonTypeId;
				this.reasonId = reasonId;
				this.jobId = jobId;
				this.etStatus = etStatus;
				this.statusDate = statusDate;
				this.requestBy = requestBy;
				this.approvalId = approvalId;
				this.osadminFee = osadminFee;
				this.accruedAdminFeeEom = accruedAdminFeeEom;
			}
			
		public EarlyTermination(long id, Agrmnt agrmnt, String etcode, double currencyRate, Date efectiveDate, Date requestDate, String prepaymentType, double prepaymentAmount, double totalAmountToBePaid, double osP, double osI,
		        double osPbankPortion, double osIbankPortion, double osInstDue, double osIntDueBankPortion, double osInsDue, double osLcinst, double osLcins, double lcinstCurrent, double lcinsCurrent, double etFeeAmt, double accruedAmt,
		        Double accruedAmtBankPortion, double lcinstDiscAmt, double lcinsDiscAmt, double insDiscAmt, double instDiscAmt, double etDiscAmt, double prepaidAmt, String insTermFlag, String notes, String reasonTypeId, String reasonId, long jobId,
		        String etStatus, Date statusDate, String requestBy, long approvalId, Double accruedDiscAmt, Double osPdue, Double osPdueBankPortion, Double osIdue, Double osIdueBankPortion, Double principalDueDisc, Double interestDueDisc,
		        Double toleranceAmount, Double osdiffRate, Double accruedDiffRateEom, Double osinsuranceIncome, Double accruedInsuranceIncomeEom, Double osincentive, Double accruedIncentiveEom, Double osprovision, Double accruedProvisionEom,
		        double osadminFee, double accruedAdminFeeEom, Double osdeferredInsurInc, Double accruedDeferredInsurIncEom, Double osotherRefund, Double accruedOtherRefundEom, Double osadmFee, Double accruedAdmFeeEom, Double osprovisionFee,
		        Double accruedProvisionFeeEom, Double osotherFee, Double accruedOtherFeeEom, Double ossurveyFee, Double accruedSurveyFeeEom, Double oscostOfSurveyFee, Double accruedCostOfSurveyFeeEom, Date dtmUpd, String usrUpd, Date dtmCrt,
		        String usrCrt)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.etcode = etcode;
				this.currencyRate = currencyRate;
				this.efectiveDate = efectiveDate;
				this.requestDate = requestDate;
				this.prepaymentType = prepaymentType;
				this.prepaymentAmount = prepaymentAmount;
				this.totalAmountToBePaid = totalAmountToBePaid;
				this.osP = osP;
				this.osI = osI;
				this.osPbankPortion = osPbankPortion;
				this.osIbankPortion = osIbankPortion;
				this.osInstDue = osInstDue;
				this.osIntDueBankPortion = osIntDueBankPortion;
				this.osInsDue = osInsDue;
				this.osLcinst = osLcinst;
				this.osLcins = osLcins;
				this.lcinstCurrent = lcinstCurrent;
				this.lcinsCurrent = lcinsCurrent;
				this.etFeeAmt = etFeeAmt;
				this.accruedAmt = accruedAmt;
				this.accruedAmtBankPortion = accruedAmtBankPortion;
				this.lcinstDiscAmt = lcinstDiscAmt;
				this.lcinsDiscAmt = lcinsDiscAmt;
				this.insDiscAmt = insDiscAmt;
				this.instDiscAmt = instDiscAmt;
				this.etDiscAmt = etDiscAmt;
				this.prepaidAmt = prepaidAmt;
				this.insTermFlag = insTermFlag;
				this.notes = notes;
				this.reasonTypeId = reasonTypeId;
				this.reasonId = reasonId;
				this.jobId = jobId;
				this.etStatus = etStatus;
				this.statusDate = statusDate;
				this.requestBy = requestBy;
				this.approvalId = approvalId;
				this.accruedDiscAmt = accruedDiscAmt;
				this.osPdue = osPdue;
				this.osPdueBankPortion = osPdueBankPortion;
				this.osIdue = osIdue;
				this.osIdueBankPortion = osIdueBankPortion;
				this.principalDueDisc = principalDueDisc;
				this.interestDueDisc = interestDueDisc;
				this.toleranceAmount = toleranceAmount;
				this.osdiffRate = osdiffRate;
				this.accruedDiffRateEom = accruedDiffRateEom;
				this.osinsuranceIncome = osinsuranceIncome;
				this.accruedInsuranceIncomeEom = accruedInsuranceIncomeEom;
				this.osincentive = osincentive;
				this.accruedIncentiveEom = accruedIncentiveEom;
				this.osprovision = osprovision;
				this.accruedProvisionEom = accruedProvisionEom;
				this.osadminFee = osadminFee;
				this.accruedAdminFeeEom = accruedAdminFeeEom;
				this.osdeferredInsurInc = osdeferredInsurInc;
				this.accruedDeferredInsurIncEom = accruedDeferredInsurIncEom;
				this.osotherRefund = osotherRefund;
				this.accruedOtherRefundEom = accruedOtherRefundEom;
				this.osadmFee = osadmFee;
				this.accruedAdmFeeEom = accruedAdmFeeEom;
				this.osprovisionFee = osprovisionFee;
				this.accruedProvisionFeeEom = accruedProvisionFeeEom;
				this.osotherFee = osotherFee;
				this.accruedOtherFeeEom = accruedOtherFeeEom;
				this.ossurveyFee = ossurveyFee;
				this.accruedSurveyFeeEom = accruedSurveyFeeEom;
				this.oscostOfSurveyFee = oscostOfSurveyFee;
				this.accruedCostOfSurveyFeeEom = accruedCostOfSurveyFeeEom;
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
			
		@Column(name = "ETCode", nullable = false, length = 20)
		public String getEtcode()
			{
				return this.etcode;
			}
			
		public void setEtcode(String etcode)
			{
				this.etcode = etcode;
			}
			
		@Column(name = "CurrencyRate", nullable = false, precision = 53, scale = 0)
		public double getCurrencyRate()
			{
				return this.currencyRate;
			}
			
		public void setCurrencyRate(double currencyRate)
			{
				this.currencyRate = currencyRate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "EfectiveDate", nullable = false, length = 16)
		public Date getEfectiveDate()
			{
				return this.efectiveDate;
			}
			
		public void setEfectiveDate(Date efectiveDate)
			{
				this.efectiveDate = efectiveDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "RequestDate", nullable = false, length = 16)
		public Date getRequestDate()
			{
				return this.requestDate;
			}
			
		public void setRequestDate(Date requestDate)
			{
				this.requestDate = requestDate;
			}
			
		@Column(name = "PrepaymentType", nullable = false, length = 2)
		public String getPrepaymentType()
			{
				return this.prepaymentType;
			}
			
		public void setPrepaymentType(String prepaymentType)
			{
				this.prepaymentType = prepaymentType;
			}
			
		@Column(name = "PrepaymentAmount", nullable = false, precision = 53, scale = 0)
		public double getPrepaymentAmount()
			{
				return this.prepaymentAmount;
			}
			
		public void setPrepaymentAmount(double prepaymentAmount)
			{
				this.prepaymentAmount = prepaymentAmount;
			}
			
		@Column(name = "TotalAmountToBePaid", nullable = false, precision = 53, scale = 0)
		public double getTotalAmountToBePaid()
			{
				return this.totalAmountToBePaid;
			}
			
		public void setTotalAmountToBePaid(double totalAmountToBePaid)
			{
				this.totalAmountToBePaid = totalAmountToBePaid;
			}
			
		@Column(name = "OsP", nullable = false, precision = 53, scale = 0)
		public double getOsP()
			{
				return this.osP;
			}
			
		public void setOsP(double osP)
			{
				this.osP = osP;
			}
			
		@Column(name = "OsI", nullable = false, precision = 53, scale = 0)
		public double getOsI()
			{
				return this.osI;
			}
			
		public void setOsI(double osI)
			{
				this.osI = osI;
			}
			
		@Column(name = "OsPBankPortion", nullable = false, precision = 53, scale = 0)
		public double getOsPbankPortion()
			{
				return this.osPbankPortion;
			}
			
		public void setOsPbankPortion(double osPbankPortion)
			{
				this.osPbankPortion = osPbankPortion;
			}
			
		@Column(name = "OsIBankPortion", nullable = false, precision = 53, scale = 0)
		public double getOsIbankPortion()
			{
				return this.osIbankPortion;
			}
			
		public void setOsIbankPortion(double osIbankPortion)
			{
				this.osIbankPortion = osIbankPortion;
			}
			
		@Column(name = "OsInstDue", nullable = false, precision = 53, scale = 0)
		public double getOsInstDue()
			{
				return this.osInstDue;
			}
			
		public void setOsInstDue(double osInstDue)
			{
				this.osInstDue = osInstDue;
			}
			
		@Column(name = "OsIntDueBankPortion", nullable = false, precision = 53, scale = 0)
		public double getOsIntDueBankPortion()
			{
				return this.osIntDueBankPortion;
			}
			
		public void setOsIntDueBankPortion(double osIntDueBankPortion)
			{
				this.osIntDueBankPortion = osIntDueBankPortion;
			}
			
		@Column(name = "OsInsDue", nullable = false, precision = 53, scale = 0)
		public double getOsInsDue()
			{
				return this.osInsDue;
			}
			
		public void setOsInsDue(double osInsDue)
			{
				this.osInsDue = osInsDue;
			}
			
		@Column(name = "OsLCInst", nullable = false, precision = 53, scale = 0)
		public double getOsLcinst()
			{
				return this.osLcinst;
			}
			
		public void setOsLcinst(double osLcinst)
			{
				this.osLcinst = osLcinst;
			}
			
		@Column(name = "OsLCIns", nullable = false, precision = 53, scale = 0)
		public double getOsLcins()
			{
				return this.osLcins;
			}
			
		public void setOsLcins(double osLcins)
			{
				this.osLcins = osLcins;
			}
			
		@Column(name = "LCInstCurrent", nullable = false, precision = 53, scale = 0)
		public double getLcinstCurrent()
			{
				return this.lcinstCurrent;
			}
			
		public void setLcinstCurrent(double lcinstCurrent)
			{
				this.lcinstCurrent = lcinstCurrent;
			}
			
		@Column(name = "LCInsCurrent", nullable = false, precision = 53, scale = 0)
		public double getLcinsCurrent()
			{
				return this.lcinsCurrent;
			}
			
		public void setLcinsCurrent(double lcinsCurrent)
			{
				this.lcinsCurrent = lcinsCurrent;
			}
			
		@Column(name = "EtFeeAmt", nullable = false, precision = 53, scale = 0)
		public double getEtFeeAmt()
			{
				return this.etFeeAmt;
			}
			
		public void setEtFeeAmt(double etFeeAmt)
			{
				this.etFeeAmt = etFeeAmt;
			}
			
		@Column(name = "AccruedAmt", nullable = false, precision = 53, scale = 0)
		public double getAccruedAmt()
			{
				return this.accruedAmt;
			}
			
		public void setAccruedAmt(double accruedAmt)
			{
				this.accruedAmt = accruedAmt;
			}
			
		@Column(name = "AccruedAmtBankPortion", precision = 53, scale = 0)
		public Double getAccruedAmtBankPortion()
			{
				return this.accruedAmtBankPortion;
			}
			
		public void setAccruedAmtBankPortion(Double accruedAmtBankPortion)
			{
				this.accruedAmtBankPortion = accruedAmtBankPortion;
			}
			
		@Column(name = "LCInstDiscAmt", nullable = false, precision = 53, scale = 0)
		public double getLcinstDiscAmt()
			{
				return this.lcinstDiscAmt;
			}
			
		public void setLcinstDiscAmt(double lcinstDiscAmt)
			{
				this.lcinstDiscAmt = lcinstDiscAmt;
			}
			
		@Column(name = "LCInsDiscAmt", nullable = false, precision = 53, scale = 0)
		public double getLcinsDiscAmt()
			{
				return this.lcinsDiscAmt;
			}
			
		public void setLcinsDiscAmt(double lcinsDiscAmt)
			{
				this.lcinsDiscAmt = lcinsDiscAmt;
			}
			
		@Column(name = "InsDiscAmt", nullable = false, precision = 53, scale = 0)
		public double getInsDiscAmt()
			{
				return this.insDiscAmt;
			}
			
		public void setInsDiscAmt(double insDiscAmt)
			{
				this.insDiscAmt = insDiscAmt;
			}
			
		@Column(name = "InstDiscAmt", nullable = false, precision = 53, scale = 0)
		public double getInstDiscAmt()
			{
				return this.instDiscAmt;
			}
			
		public void setInstDiscAmt(double instDiscAmt)
			{
				this.instDiscAmt = instDiscAmt;
			}
			
		@Column(name = "EtDiscAmt", nullable = false, precision = 53, scale = 0)
		public double getEtDiscAmt()
			{
				return this.etDiscAmt;
			}
			
		public void setEtDiscAmt(double etDiscAmt)
			{
				this.etDiscAmt = etDiscAmt;
			}
			
		@Column(name = "PrepaidAmt", nullable = false, precision = 53, scale = 0)
		public double getPrepaidAmt()
			{
				return this.prepaidAmt;
			}
			
		public void setPrepaidAmt(double prepaidAmt)
			{
				this.prepaidAmt = prepaidAmt;
			}
			
		@Column(name = "InsTermFlag", nullable = false, length = 1)
		public String getInsTermFlag()
			{
				return this.insTermFlag;
			}
			
		public void setInsTermFlag(String insTermFlag)
			{
				this.insTermFlag = insTermFlag;
			}
			
		@Column(name = "Notes", nullable = false, length = 8000)
		public String getNotes()
			{
				return this.notes;
			}
			
		public void setNotes(String notes)
			{
				this.notes = notes;
			}
			
		@Column(name = "ReasonTypeID", nullable = false, length = 5)
		public String getReasonTypeId()
			{
				return this.reasonTypeId;
			}
			
		public void setReasonTypeId(String reasonTypeId)
			{
				this.reasonTypeId = reasonTypeId;
			}
			
		@Column(name = "ReasonID", nullable = false, length = 10)
		public String getReasonId()
			{
				return this.reasonId;
			}
			
		public void setReasonId(String reasonId)
			{
				this.reasonId = reasonId;
			}
			
		@Column(name = "JobId", nullable = false)
		public long getJobId()
			{
				return this.jobId;
			}
			
		public void setJobId(long jobId)
			{
				this.jobId = jobId;
			}
			
		@Column(name = "EtStatus", nullable = false, length = 5)
		public String getEtStatus()
			{
				return this.etStatus;
			}
			
		public void setEtStatus(String etStatus)
			{
				this.etStatus = etStatus;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "StatusDate", nullable = false, length = 23)
		public Date getStatusDate()
			{
				return this.statusDate;
			}
			
		public void setStatusDate(Date statusDate)
			{
				this.statusDate = statusDate;
			}
			
		@Column(name = "RequestBy", nullable = false, length = 50)
		public String getRequestBy()
			{
				return this.requestBy;
			}
			
		public void setRequestBy(String requestBy)
			{
				this.requestBy = requestBy;
			}
			
		@Column(name = "ApprovalID", nullable = false)
		public long getApprovalId()
			{
				return this.approvalId;
			}
			
		public void setApprovalId(long approvalId)
			{
				this.approvalId = approvalId;
			}
			
		@Column(name = "AccruedDiscAmt", precision = 53, scale = 0)
		public Double getAccruedDiscAmt()
			{
				return this.accruedDiscAmt;
			}
			
		public void setAccruedDiscAmt(Double accruedDiscAmt)
			{
				this.accruedDiscAmt = accruedDiscAmt;
			}
			
		@Column(name = "OsPDue", precision = 53, scale = 0)
		public Double getOsPdue()
			{
				return this.osPdue;
			}
			
		public void setOsPdue(Double osPdue)
			{
				this.osPdue = osPdue;
			}
			
		@Column(name = "OsPDueBankPortion", precision = 53, scale = 0)
		public Double getOsPdueBankPortion()
			{
				return this.osPdueBankPortion;
			}
			
		public void setOsPdueBankPortion(Double osPdueBankPortion)
			{
				this.osPdueBankPortion = osPdueBankPortion;
			}
			
		@Column(name = "OsIDue", precision = 53, scale = 0)
		public Double getOsIdue()
			{
				return this.osIdue;
			}
			
		public void setOsIdue(Double osIdue)
			{
				this.osIdue = osIdue;
			}
			
		@Column(name = "OsIDueBankPortion", precision = 53, scale = 0)
		public Double getOsIdueBankPortion()
			{
				return this.osIdueBankPortion;
			}
			
		public void setOsIdueBankPortion(Double osIdueBankPortion)
			{
				this.osIdueBankPortion = osIdueBankPortion;
			}
			
		@Column(name = "PrincipalDueDisc", precision = 53, scale = 0)
		public Double getPrincipalDueDisc()
			{
				return this.principalDueDisc;
			}
			
		public void setPrincipalDueDisc(Double principalDueDisc)
			{
				this.principalDueDisc = principalDueDisc;
			}
			
		@Column(name = "InterestDueDisc", precision = 53, scale = 0)
		public Double getInterestDueDisc()
			{
				return this.interestDueDisc;
			}
			
		public void setInterestDueDisc(Double interestDueDisc)
			{
				this.interestDueDisc = interestDueDisc;
			}
			
		@Column(name = "ToleranceAmount", precision = 53, scale = 0)
		public Double getToleranceAmount()
			{
				return this.toleranceAmount;
			}
			
		public void setToleranceAmount(Double toleranceAmount)
			{
				this.toleranceAmount = toleranceAmount;
			}
			
		@Column(name = "OSDiffRate", precision = 53, scale = 0)
		public Double getOsdiffRate()
			{
				return this.osdiffRate;
			}
			
		public void setOsdiffRate(Double osdiffRate)
			{
				this.osdiffRate = osdiffRate;
			}
			
		@Column(name = "AccruedDiffRateEOM", precision = 53, scale = 0)
		public Double getAccruedDiffRateEom()
			{
				return this.accruedDiffRateEom;
			}
			
		public void setAccruedDiffRateEom(Double accruedDiffRateEom)
			{
				this.accruedDiffRateEom = accruedDiffRateEom;
			}
			
		@Column(name = "OSInsuranceIncome", precision = 53, scale = 0)
		public Double getOsinsuranceIncome()
			{
				return this.osinsuranceIncome;
			}
			
		public void setOsinsuranceIncome(Double osinsuranceIncome)
			{
				this.osinsuranceIncome = osinsuranceIncome;
			}
			
		@Column(name = "AccruedInsuranceIncomeEOM", precision = 53, scale = 0)
		public Double getAccruedInsuranceIncomeEom()
			{
				return this.accruedInsuranceIncomeEom;
			}
			
		public void setAccruedInsuranceIncomeEom(Double accruedInsuranceIncomeEom)
			{
				this.accruedInsuranceIncomeEom = accruedInsuranceIncomeEom;
			}
			
		@Column(name = "OSIncentive", precision = 53, scale = 0)
		public Double getOsincentive()
			{
				return this.osincentive;
			}
			
		public void setOsincentive(Double osincentive)
			{
				this.osincentive = osincentive;
			}
			
		@Column(name = "AccruedIncentiveEOM", precision = 53, scale = 0)
		public Double getAccruedIncentiveEom()
			{
				return this.accruedIncentiveEom;
			}
			
		public void setAccruedIncentiveEom(Double accruedIncentiveEom)
			{
				this.accruedIncentiveEom = accruedIncentiveEom;
			}
			
		@Column(name = "OSProvision", precision = 53, scale = 0)
		public Double getOsprovision()
			{
				return this.osprovision;
			}
			
		public void setOsprovision(Double osprovision)
			{
				this.osprovision = osprovision;
			}
			
		@Column(name = "AccruedProvisionEOM", precision = 53, scale = 0)
		public Double getAccruedProvisionEom()
			{
				return this.accruedProvisionEom;
			}
			
		public void setAccruedProvisionEom(Double accruedProvisionEom)
			{
				this.accruedProvisionEom = accruedProvisionEom;
			}
			
		@Column(name = "OSAdminFee", nullable = false, precision = 53, scale = 0)
		public double getOsadminFee()
			{
				return this.osadminFee;
			}
			
		public void setOsadminFee(double osadminFee)
			{
				this.osadminFee = osadminFee;
			}
			
		@Column(name = "AccruedAdminFeeEOM", nullable = false, precision = 53, scale = 0)
		public double getAccruedAdminFeeEom()
			{
				return this.accruedAdminFeeEom;
			}
			
		public void setAccruedAdminFeeEom(double accruedAdminFeeEom)
			{
				this.accruedAdminFeeEom = accruedAdminFeeEom;
			}
			
		@Column(name = "OSDeferredInsurInc", precision = 53, scale = 0)
		public Double getOsdeferredInsurInc()
			{
				return this.osdeferredInsurInc;
			}
			
		public void setOsdeferredInsurInc(Double osdeferredInsurInc)
			{
				this.osdeferredInsurInc = osdeferredInsurInc;
			}
			
		@Column(name = "AccruedDeferredInsurIncEOM", precision = 53, scale = 0)
		public Double getAccruedDeferredInsurIncEom()
			{
				return this.accruedDeferredInsurIncEom;
			}
			
		public void setAccruedDeferredInsurIncEom(Double accruedDeferredInsurIncEom)
			{
				this.accruedDeferredInsurIncEom = accruedDeferredInsurIncEom;
			}
			
		@Column(name = "OSOtherRefund", precision = 53, scale = 0)
		public Double getOsotherRefund()
			{
				return this.osotherRefund;
			}
			
		public void setOsotherRefund(Double osotherRefund)
			{
				this.osotherRefund = osotherRefund;
			}
			
		@Column(name = "AccruedOtherRefundEOM", precision = 53, scale = 0)
		public Double getAccruedOtherRefundEom()
			{
				return this.accruedOtherRefundEom;
			}
			
		public void setAccruedOtherRefundEom(Double accruedOtherRefundEom)
			{
				this.accruedOtherRefundEom = accruedOtherRefundEom;
			}
			
		@Column(name = "OSAdmFee", precision = 53, scale = 0)
		public Double getOsadmFee()
			{
				return this.osadmFee;
			}
			
		public void setOsadmFee(Double osadmFee)
			{
				this.osadmFee = osadmFee;
			}
			
		@Column(name = "AccruedAdmFeeEOM", precision = 53, scale = 0)
		public Double getAccruedAdmFeeEom()
			{
				return this.accruedAdmFeeEom;
			}
			
		public void setAccruedAdmFeeEom(Double accruedAdmFeeEom)
			{
				this.accruedAdmFeeEom = accruedAdmFeeEom;
			}
			
		@Column(name = "OSProvisionFee", precision = 53, scale = 0)
		public Double getOsprovisionFee()
			{
				return this.osprovisionFee;
			}
			
		public void setOsprovisionFee(Double osprovisionFee)
			{
				this.osprovisionFee = osprovisionFee;
			}
			
		@Column(name = "AccruedProvisionFeeEOM", precision = 53, scale = 0)
		public Double getAccruedProvisionFeeEom()
			{
				return this.accruedProvisionFeeEom;
			}
			
		public void setAccruedProvisionFeeEom(Double accruedProvisionFeeEom)
			{
				this.accruedProvisionFeeEom = accruedProvisionFeeEom;
			}
			
		@Column(name = "OSOtherFee", precision = 53, scale = 0)
		public Double getOsotherFee()
			{
				return this.osotherFee;
			}
			
		public void setOsotherFee(Double osotherFee)
			{
				this.osotherFee = osotherFee;
			}
			
		@Column(name = "AccruedOtherFeeEOM", precision = 53, scale = 0)
		public Double getAccruedOtherFeeEom()
			{
				return this.accruedOtherFeeEom;
			}
			
		public void setAccruedOtherFeeEom(Double accruedOtherFeeEom)
			{
				this.accruedOtherFeeEom = accruedOtherFeeEom;
			}
			
		@Column(name = "OSSurveyFee", precision = 53, scale = 0)
		public Double getOssurveyFee()
			{
				return this.ossurveyFee;
			}
			
		public void setOssurveyFee(Double ossurveyFee)
			{
				this.ossurveyFee = ossurveyFee;
			}
			
		@Column(name = "AccruedSurveyFeeEOM", precision = 53, scale = 0)
		public Double getAccruedSurveyFeeEom()
			{
				return this.accruedSurveyFeeEom;
			}
			
		public void setAccruedSurveyFeeEom(Double accruedSurveyFeeEom)
			{
				this.accruedSurveyFeeEom = accruedSurveyFeeEom;
			}
			
		@Column(name = "OSCostOfSurveyFee", precision = 53, scale = 0)
		public Double getOscostOfSurveyFee()
			{
				return this.oscostOfSurveyFee;
			}
			
		public void setOscostOfSurveyFee(Double oscostOfSurveyFee)
			{
				this.oscostOfSurveyFee = oscostOfSurveyFee;
			}
			
		@Column(name = "AccruedCostOfSurveyFeeEOM", precision = 53, scale = 0)
		public Double getAccruedCostOfSurveyFeeEom()
			{
				return this.accruedCostOfSurveyFeeEom;
			}
			
		public void setAccruedCostOfSurveyFeeEom(Double accruedCostOfSurveyFeeEom)
			{
				this.accruedCostOfSurveyFeeEom = accruedCostOfSurveyFeeEom;
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
