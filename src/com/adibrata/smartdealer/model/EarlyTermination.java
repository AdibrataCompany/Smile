
package com.adibrata.smartdealer.model;

// Generated Jul 19, 2015 10:57:21 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EarlyTermination generated by hbm2java
 */
@Entity
@Table(name = "EarlyTermination", catalog = "SmartDealer")
public class EarlyTermination implements java.io.Serializable
	{
		
		private long id;
		private Long agrmntId;
		private String etcode;
		private double currencyRate;
		private Date efectiveDate;
		private Date requestDate;
		private String prepaymentType;
		private double prepaymentAmount;
		private double totalAmountToBePaid;
		private double outstandingPrincipal;
		private double outstandingInterest;
		private double outstandingPrincipalBankPortion;
		private double outstandingInterestBankPortion;
		private double osinstallmentDue;
		private double osinstallmentDueBankPortion;
		private double osinsuranceDue;
		private double oslcinstallment;
		private double oslcinsurance;
		private double lcinstallmentCurrent;
		private double lcinsuranceCurrent;
		private double osinstallCollectionFee;
		private double osinsurCollectionFee;
		private double ospdcbounceFee;
		private double osstnkrenewalFee;
		private double osinsuranceClaimExpense;
		private double osrepossesFee;
		private double prepaymentFee;
		private double accruedInterest;
		private Double accruedInterestBankPortion;
		private double lcinstallmentAmountDisc;
		private double lcinsuranceAmountDisc;
		private double installCollectionFeeDisc;
		private double insurCollectionFeeDisc;
		private double pdcbounceFeeDisc;
		private double stnkfeeDisc;
		private double insuranceClaimExpenseDisc;
		private double repossesFeeDisc;
		private double insuranceAmountDisc;
		private double installmentAmountDisc;
		private double prepaymentFeeDisc;
		private double prepaidAmount;
		private String insuranceTerminationFlag;
		private String notes;
		private String reasonTypeId;
		private String reasonId;
		private long jobId;
		private String prepaymentStatus;
		private Date statusDate;
		private String requestBy;
		private long approvalId;
		private Double accruedInterestDisc;
		private Double osprincipalDue;
		private Double osprincipalDueBankPortion;
		private Double osinterestDue;
		private Double osinterestDueBankPortion;
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
		
		public EarlyTermination(long id, String etcode, double currencyRate, Date efectiveDate, Date requestDate, String prepaymentType, double prepaymentAmount, double totalAmountToBePaid, double outstandingPrincipal, double outstandingInterest, double outstandingPrincipalBankPortion,
		        double outstandingInterestBankPortion, double osinstallmentDue, double osinstallmentDueBankPortion, double osinsuranceDue, double oslcinstallment, double oslcinsurance, double lcinstallmentCurrent, double lcinsuranceCurrent, double osinstallCollectionFee,
		        double osinsurCollectionFee, double ospdcbounceFee, double osstnkrenewalFee, double osinsuranceClaimExpense, double osrepossesFee, double prepaymentFee, double accruedInterest, double lcinstallmentAmountDisc, double lcinsuranceAmountDisc, double installCollectionFeeDisc,
		        double insurCollectionFeeDisc, double pdcbounceFeeDisc, double stnkfeeDisc, double insuranceClaimExpenseDisc, double repossesFeeDisc, double insuranceAmountDisc, double installmentAmountDisc, double prepaymentFeeDisc, double prepaidAmount, String insuranceTerminationFlag,
		        String notes, String reasonTypeId, String reasonId, long jobId, String prepaymentStatus, Date statusDate, String requestBy, long approvalId, double osadminFee, double accruedAdminFeeEom)
			{
				this.id = id;
				this.etcode = etcode;
				this.currencyRate = currencyRate;
				this.efectiveDate = efectiveDate;
				this.requestDate = requestDate;
				this.prepaymentType = prepaymentType;
				this.prepaymentAmount = prepaymentAmount;
				this.totalAmountToBePaid = totalAmountToBePaid;
				this.outstandingPrincipal = outstandingPrincipal;
				this.outstandingInterest = outstandingInterest;
				this.outstandingPrincipalBankPortion = outstandingPrincipalBankPortion;
				this.outstandingInterestBankPortion = outstandingInterestBankPortion;
				this.osinstallmentDue = osinstallmentDue;
				this.osinstallmentDueBankPortion = osinstallmentDueBankPortion;
				this.osinsuranceDue = osinsuranceDue;
				this.oslcinstallment = oslcinstallment;
				this.oslcinsurance = oslcinsurance;
				this.lcinstallmentCurrent = lcinstallmentCurrent;
				this.lcinsuranceCurrent = lcinsuranceCurrent;
				this.osinstallCollectionFee = osinstallCollectionFee;
				this.osinsurCollectionFee = osinsurCollectionFee;
				this.ospdcbounceFee = ospdcbounceFee;
				this.osstnkrenewalFee = osstnkrenewalFee;
				this.osinsuranceClaimExpense = osinsuranceClaimExpense;
				this.osrepossesFee = osrepossesFee;
				this.prepaymentFee = prepaymentFee;
				this.accruedInterest = accruedInterest;
				this.lcinstallmentAmountDisc = lcinstallmentAmountDisc;
				this.lcinsuranceAmountDisc = lcinsuranceAmountDisc;
				this.installCollectionFeeDisc = installCollectionFeeDisc;
				this.insurCollectionFeeDisc = insurCollectionFeeDisc;
				this.pdcbounceFeeDisc = pdcbounceFeeDisc;
				this.stnkfeeDisc = stnkfeeDisc;
				this.insuranceClaimExpenseDisc = insuranceClaimExpenseDisc;
				this.repossesFeeDisc = repossesFeeDisc;
				this.insuranceAmountDisc = insuranceAmountDisc;
				this.installmentAmountDisc = installmentAmountDisc;
				this.prepaymentFeeDisc = prepaymentFeeDisc;
				this.prepaidAmount = prepaidAmount;
				this.insuranceTerminationFlag = insuranceTerminationFlag;
				this.notes = notes;
				this.reasonTypeId = reasonTypeId;
				this.reasonId = reasonId;
				this.jobId = jobId;
				this.prepaymentStatus = prepaymentStatus;
				this.statusDate = statusDate;
				this.requestBy = requestBy;
				this.approvalId = approvalId;
				this.osadminFee = osadminFee;
				this.accruedAdminFeeEom = accruedAdminFeeEom;
			}
		
		public EarlyTermination(long id, Long agrmntId, String etcode, double currencyRate, Date efectiveDate, Date requestDate, String prepaymentType, double prepaymentAmount, double totalAmountToBePaid, double outstandingPrincipal, double outstandingInterest,
		        double outstandingPrincipalBankPortion, double outstandingInterestBankPortion, double osinstallmentDue, double osinstallmentDueBankPortion, double osinsuranceDue, double oslcinstallment, double oslcinsurance, double lcinstallmentCurrent, double lcinsuranceCurrent,
		        double osinstallCollectionFee, double osinsurCollectionFee, double ospdcbounceFee, double osstnkrenewalFee, double osinsuranceClaimExpense, double osrepossesFee, double prepaymentFee, double accruedInterest, Double accruedInterestBankPortion, double lcinstallmentAmountDisc,
		        double lcinsuranceAmountDisc, double installCollectionFeeDisc, double insurCollectionFeeDisc, double pdcbounceFeeDisc, double stnkfeeDisc, double insuranceClaimExpenseDisc, double repossesFeeDisc, double insuranceAmountDisc, double installmentAmountDisc, double prepaymentFeeDisc,
		        double prepaidAmount, String insuranceTerminationFlag, String notes, String reasonTypeId, String reasonId, long jobId, String prepaymentStatus, Date statusDate, String requestBy, long approvalId, Double accruedInterestDisc, Double osprincipalDue, Double osprincipalDueBankPortion,
		        Double osinterestDue, Double osinterestDueBankPortion, Double principalDueDisc, Double interestDueDisc, Double toleranceAmount, Double osdiffRate, Double accruedDiffRateEom, Double osinsuranceIncome, Double accruedInsuranceIncomeEom, Double osincentive, Double accruedIncentiveEom,
		        Double osprovision, Double accruedProvisionEom, double osadminFee, double accruedAdminFeeEom, Double osdeferredInsurInc, Double accruedDeferredInsurIncEom, Double osotherRefund, Double accruedOtherRefundEom, Double osadmFee, Double accruedAdmFeeEom, Double osprovisionFee,
		        Double accruedProvisionFeeEom, Double osotherFee, Double accruedOtherFeeEom, Double ossurveyFee, Double accruedSurveyFeeEom, Double oscostOfSurveyFee, Double accruedCostOfSurveyFeeEom, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.agrmntId = agrmntId;
				this.etcode = etcode;
				this.currencyRate = currencyRate;
				this.efectiveDate = efectiveDate;
				this.requestDate = requestDate;
				this.prepaymentType = prepaymentType;
				this.prepaymentAmount = prepaymentAmount;
				this.totalAmountToBePaid = totalAmountToBePaid;
				this.outstandingPrincipal = outstandingPrincipal;
				this.outstandingInterest = outstandingInterest;
				this.outstandingPrincipalBankPortion = outstandingPrincipalBankPortion;
				this.outstandingInterestBankPortion = outstandingInterestBankPortion;
				this.osinstallmentDue = osinstallmentDue;
				this.osinstallmentDueBankPortion = osinstallmentDueBankPortion;
				this.osinsuranceDue = osinsuranceDue;
				this.oslcinstallment = oslcinstallment;
				this.oslcinsurance = oslcinsurance;
				this.lcinstallmentCurrent = lcinstallmentCurrent;
				this.lcinsuranceCurrent = lcinsuranceCurrent;
				this.osinstallCollectionFee = osinstallCollectionFee;
				this.osinsurCollectionFee = osinsurCollectionFee;
				this.ospdcbounceFee = ospdcbounceFee;
				this.osstnkrenewalFee = osstnkrenewalFee;
				this.osinsuranceClaimExpense = osinsuranceClaimExpense;
				this.osrepossesFee = osrepossesFee;
				this.prepaymentFee = prepaymentFee;
				this.accruedInterest = accruedInterest;
				this.accruedInterestBankPortion = accruedInterestBankPortion;
				this.lcinstallmentAmountDisc = lcinstallmentAmountDisc;
				this.lcinsuranceAmountDisc = lcinsuranceAmountDisc;
				this.installCollectionFeeDisc = installCollectionFeeDisc;
				this.insurCollectionFeeDisc = insurCollectionFeeDisc;
				this.pdcbounceFeeDisc = pdcbounceFeeDisc;
				this.stnkfeeDisc = stnkfeeDisc;
				this.insuranceClaimExpenseDisc = insuranceClaimExpenseDisc;
				this.repossesFeeDisc = repossesFeeDisc;
				this.insuranceAmountDisc = insuranceAmountDisc;
				this.installmentAmountDisc = installmentAmountDisc;
				this.prepaymentFeeDisc = prepaymentFeeDisc;
				this.prepaidAmount = prepaidAmount;
				this.insuranceTerminationFlag = insuranceTerminationFlag;
				this.notes = notes;
				this.reasonTypeId = reasonTypeId;
				this.reasonId = reasonId;
				this.jobId = jobId;
				this.prepaymentStatus = prepaymentStatus;
				this.statusDate = statusDate;
				this.requestBy = requestBy;
				this.approvalId = approvalId;
				this.accruedInterestDisc = accruedInterestDisc;
				this.osprincipalDue = osprincipalDue;
				this.osprincipalDueBankPortion = osprincipalDueBankPortion;
				this.osinterestDue = osinterestDue;
				this.osinterestDueBankPortion = osinterestDueBankPortion;
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
		
		@Column(name = "AgrmntId")
		public Long getAgrmntId()
			{
				return this.agrmntId;
			}
		
		public void setAgrmntId(Long agrmntId)
			{
				this.agrmntId = agrmntId;
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
		
		@Column(name = "OutstandingPrincipalBankPortion", nullable = false, precision = 53, scale = 0)
		public double getOutstandingPrincipalBankPortion()
			{
				return this.outstandingPrincipalBankPortion;
			}
		
		public void setOutstandingPrincipalBankPortion(double outstandingPrincipalBankPortion)
			{
				this.outstandingPrincipalBankPortion = outstandingPrincipalBankPortion;
			}
		
		@Column(name = "OutstandingInterestBankPortion", nullable = false, precision = 53, scale = 0)
		public double getOutstandingInterestBankPortion()
			{
				return this.outstandingInterestBankPortion;
			}
		
		public void setOutstandingInterestBankPortion(double outstandingInterestBankPortion)
			{
				this.outstandingInterestBankPortion = outstandingInterestBankPortion;
			}
		
		@Column(name = "OSInstallmentDue", nullable = false, precision = 53, scale = 0)
		public double getOsinstallmentDue()
			{
				return this.osinstallmentDue;
			}
		
		public void setOsinstallmentDue(double osinstallmentDue)
			{
				this.osinstallmentDue = osinstallmentDue;
			}
		
		@Column(name = "OSInstallmentDueBankPortion", nullable = false, precision = 53, scale = 0)
		public double getOsinstallmentDueBankPortion()
			{
				return this.osinstallmentDueBankPortion;
			}
		
		public void setOsinstallmentDueBankPortion(double osinstallmentDueBankPortion)
			{
				this.osinstallmentDueBankPortion = osinstallmentDueBankPortion;
			}
		
		@Column(name = "OSInsuranceDue", nullable = false, precision = 53, scale = 0)
		public double getOsinsuranceDue()
			{
				return this.osinsuranceDue;
			}
		
		public void setOsinsuranceDue(double osinsuranceDue)
			{
				this.osinsuranceDue = osinsuranceDue;
			}
		
		@Column(name = "OSLCInstallment", nullable = false, precision = 53, scale = 0)
		public double getOslcinstallment()
			{
				return this.oslcinstallment;
			}
		
		public void setOslcinstallment(double oslcinstallment)
			{
				this.oslcinstallment = oslcinstallment;
			}
		
		@Column(name = "OSLCInsurance", nullable = false, precision = 53, scale = 0)
		public double getOslcinsurance()
			{
				return this.oslcinsurance;
			}
		
		public void setOslcinsurance(double oslcinsurance)
			{
				this.oslcinsurance = oslcinsurance;
			}
		
		@Column(name = "LCInstallmentCurrent", nullable = false, precision = 53, scale = 0)
		public double getLcinstallmentCurrent()
			{
				return this.lcinstallmentCurrent;
			}
		
		public void setLcinstallmentCurrent(double lcinstallmentCurrent)
			{
				this.lcinstallmentCurrent = lcinstallmentCurrent;
			}
		
		@Column(name = "LCInsuranceCurrent", nullable = false, precision = 53, scale = 0)
		public double getLcinsuranceCurrent()
			{
				return this.lcinsuranceCurrent;
			}
		
		public void setLcinsuranceCurrent(double lcinsuranceCurrent)
			{
				this.lcinsuranceCurrent = lcinsuranceCurrent;
			}
		
		@Column(name = "OSInstallCollectionFee", nullable = false, precision = 53, scale = 0)
		public double getOsinstallCollectionFee()
			{
				return this.osinstallCollectionFee;
			}
		
		public void setOsinstallCollectionFee(double osinstallCollectionFee)
			{
				this.osinstallCollectionFee = osinstallCollectionFee;
			}
		
		@Column(name = "OSInsurCollectionFee", nullable = false, precision = 53, scale = 0)
		public double getOsinsurCollectionFee()
			{
				return this.osinsurCollectionFee;
			}
		
		public void setOsinsurCollectionFee(double osinsurCollectionFee)
			{
				this.osinsurCollectionFee = osinsurCollectionFee;
			}
		
		@Column(name = "OSPDCBounceFee", nullable = false, precision = 53, scale = 0)
		public double getOspdcbounceFee()
			{
				return this.ospdcbounceFee;
			}
		
		public void setOspdcbounceFee(double ospdcbounceFee)
			{
				this.ospdcbounceFee = ospdcbounceFee;
			}
		
		@Column(name = "OSSTNKRenewalFee", nullable = false, precision = 53, scale = 0)
		public double getOsstnkrenewalFee()
			{
				return this.osstnkrenewalFee;
			}
		
		public void setOsstnkrenewalFee(double osstnkrenewalFee)
			{
				this.osstnkrenewalFee = osstnkrenewalFee;
			}
		
		@Column(name = "OSInsuranceClaimExpense", nullable = false, precision = 53, scale = 0)
		public double getOsinsuranceClaimExpense()
			{
				return this.osinsuranceClaimExpense;
			}
		
		public void setOsinsuranceClaimExpense(double osinsuranceClaimExpense)
			{
				this.osinsuranceClaimExpense = osinsuranceClaimExpense;
			}
		
		@Column(name = "OSRepossesFee", nullable = false, precision = 53, scale = 0)
		public double getOsrepossesFee()
			{
				return this.osrepossesFee;
			}
		
		public void setOsrepossesFee(double osrepossesFee)
			{
				this.osrepossesFee = osrepossesFee;
			}
		
		@Column(name = "PrepaymentFee", nullable = false, precision = 53, scale = 0)
		public double getPrepaymentFee()
			{
				return this.prepaymentFee;
			}
		
		public void setPrepaymentFee(double prepaymentFee)
			{
				this.prepaymentFee = prepaymentFee;
			}
		
		@Column(name = "AccruedInterest", nullable = false, precision = 53, scale = 0)
		public double getAccruedInterest()
			{
				return this.accruedInterest;
			}
		
		public void setAccruedInterest(double accruedInterest)
			{
				this.accruedInterest = accruedInterest;
			}
		
		@Column(name = "AccruedInterestBankPortion", precision = 53, scale = 0)
		public Double getAccruedInterestBankPortion()
			{
				return this.accruedInterestBankPortion;
			}
		
		public void setAccruedInterestBankPortion(Double accruedInterestBankPortion)
			{
				this.accruedInterestBankPortion = accruedInterestBankPortion;
			}
		
		@Column(name = "LCInstallmentAmountDisc", nullable = false, precision = 53, scale = 0)
		public double getLcinstallmentAmountDisc()
			{
				return this.lcinstallmentAmountDisc;
			}
		
		public void setLcinstallmentAmountDisc(double lcinstallmentAmountDisc)
			{
				this.lcinstallmentAmountDisc = lcinstallmentAmountDisc;
			}
		
		@Column(name = "LCInsuranceAmountDisc", nullable = false, precision = 53, scale = 0)
		public double getLcinsuranceAmountDisc()
			{
				return this.lcinsuranceAmountDisc;
			}
		
		public void setLcinsuranceAmountDisc(double lcinsuranceAmountDisc)
			{
				this.lcinsuranceAmountDisc = lcinsuranceAmountDisc;
			}
		
		@Column(name = "InstallCollectionFeeDisc", nullable = false, precision = 53, scale = 0)
		public double getInstallCollectionFeeDisc()
			{
				return this.installCollectionFeeDisc;
			}
		
		public void setInstallCollectionFeeDisc(double installCollectionFeeDisc)
			{
				this.installCollectionFeeDisc = installCollectionFeeDisc;
			}
		
		@Column(name = "InsurCollectionFeeDisc", nullable = false, precision = 53, scale = 0)
		public double getInsurCollectionFeeDisc()
			{
				return this.insurCollectionFeeDisc;
			}
		
		public void setInsurCollectionFeeDisc(double insurCollectionFeeDisc)
			{
				this.insurCollectionFeeDisc = insurCollectionFeeDisc;
			}
		
		@Column(name = "PDCBounceFeeDisc", nullable = false, precision = 53, scale = 0)
		public double getPdcbounceFeeDisc()
			{
				return this.pdcbounceFeeDisc;
			}
		
		public void setPdcbounceFeeDisc(double pdcbounceFeeDisc)
			{
				this.pdcbounceFeeDisc = pdcbounceFeeDisc;
			}
		
		@Column(name = "STNKFeeDisc", nullable = false, precision = 53, scale = 0)
		public double getStnkfeeDisc()
			{
				return this.stnkfeeDisc;
			}
		
		public void setStnkfeeDisc(double stnkfeeDisc)
			{
				this.stnkfeeDisc = stnkfeeDisc;
			}
		
		@Column(name = "InsuranceClaimExpenseDisc", nullable = false, precision = 53, scale = 0)
		public double getInsuranceClaimExpenseDisc()
			{
				return this.insuranceClaimExpenseDisc;
			}
		
		public void setInsuranceClaimExpenseDisc(double insuranceClaimExpenseDisc)
			{
				this.insuranceClaimExpenseDisc = insuranceClaimExpenseDisc;
			}
		
		@Column(name = "RepossesFeeDisc", nullable = false, precision = 53, scale = 0)
		public double getRepossesFeeDisc()
			{
				return this.repossesFeeDisc;
			}
		
		public void setRepossesFeeDisc(double repossesFeeDisc)
			{
				this.repossesFeeDisc = repossesFeeDisc;
			}
		
		@Column(name = "InsuranceAmountDisc", nullable = false, precision = 53, scale = 0)
		public double getInsuranceAmountDisc()
			{
				return this.insuranceAmountDisc;
			}
		
		public void setInsuranceAmountDisc(double insuranceAmountDisc)
			{
				this.insuranceAmountDisc = insuranceAmountDisc;
			}
		
		@Column(name = "InstallmentAmountDisc", nullable = false, precision = 53, scale = 0)
		public double getInstallmentAmountDisc()
			{
				return this.installmentAmountDisc;
			}
		
		public void setInstallmentAmountDisc(double installmentAmountDisc)
			{
				this.installmentAmountDisc = installmentAmountDisc;
			}
		
		@Column(name = "PrepaymentFeeDisc", nullable = false, precision = 53, scale = 0)
		public double getPrepaymentFeeDisc()
			{
				return this.prepaymentFeeDisc;
			}
		
		public void setPrepaymentFeeDisc(double prepaymentFeeDisc)
			{
				this.prepaymentFeeDisc = prepaymentFeeDisc;
			}
		
		@Column(name = "PrepaidAmount", nullable = false, precision = 53, scale = 0)
		public double getPrepaidAmount()
			{
				return this.prepaidAmount;
			}
		
		public void setPrepaidAmount(double prepaidAmount)
			{
				this.prepaidAmount = prepaidAmount;
			}
		
		@Column(name = "InsuranceTerminationFlag", nullable = false, length = 1)
		public String getInsuranceTerminationFlag()
			{
				return this.insuranceTerminationFlag;
			}
		
		public void setInsuranceTerminationFlag(String insuranceTerminationFlag)
			{
				this.insuranceTerminationFlag = insuranceTerminationFlag;
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
		
		@Column(name = "PrepaymentStatus", nullable = false, length = 5)
		public String getPrepaymentStatus()
			{
				return this.prepaymentStatus;
			}
		
		public void setPrepaymentStatus(String prepaymentStatus)
			{
				this.prepaymentStatus = prepaymentStatus;
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
		
		@Column(name = "AccruedInterestDisc", precision = 53, scale = 0)
		public Double getAccruedInterestDisc()
			{
				return this.accruedInterestDisc;
			}
		
		public void setAccruedInterestDisc(Double accruedInterestDisc)
			{
				this.accruedInterestDisc = accruedInterestDisc;
			}
		
		@Column(name = "OSPrincipalDue", precision = 53, scale = 0)
		public Double getOsprincipalDue()
			{
				return this.osprincipalDue;
			}
		
		public void setOsprincipalDue(Double osprincipalDue)
			{
				this.osprincipalDue = osprincipalDue;
			}
		
		@Column(name = "OSPrincipalDueBankPortion", precision = 53, scale = 0)
		public Double getOsprincipalDueBankPortion()
			{
				return this.osprincipalDueBankPortion;
			}
		
		public void setOsprincipalDueBankPortion(Double osprincipalDueBankPortion)
			{
				this.osprincipalDueBankPortion = osprincipalDueBankPortion;
			}
		
		@Column(name = "OSInterestDue", precision = 53, scale = 0)
		public Double getOsinterestDue()
			{
				return this.osinterestDue;
			}
		
		public void setOsinterestDue(Double osinterestDue)
			{
				this.osinterestDue = osinterestDue;
			}
		
		@Column(name = "OSInterestDueBankPortion", precision = 53, scale = 0)
		public Double getOsinterestDueBankPortion()
			{
				return this.osinterestDueBankPortion;
			}
		
		public void setOsinterestDueBankPortion(Double osinterestDueBankPortion)
			{
				this.osinterestDueBankPortion = osinterestDueBankPortion;
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
		@Column(name = "DtmUpd", length = 23)
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
		@Column(name = "DtmCrt", length = 23)
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
