
package com.adibrata.smartdealer.model;
// Generated Aug 27, 2015 4:44:07 PM by Hibernate Tools 4.3.1

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
 * InstSchedule generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "InstSchedule", catalog = "SmartDealer")
public class InstSchedule implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private Short instSeqNo;
		private Date dueDate;
		private double instAmt;
		private double paidAmt;
		private double waivedAmt;
		private Date paidDate;
		private double lcamt;
		private Double lcpaid;
		private Double lcwaived;
		private double princAmt;
		private double intrstAmt;
		private double osPamt;
		private double osIamt;
		private double accruedAmt;
		private Date accruedDate;
		private double diffRateAmt;
		private double osdiffRateAmt;
		private double accruedDiffRateAmt;
		private double incentive;
		private double osincentive;
		private double incentiveRecognize;
		private double insuranceIncomeAmount;
		private double outStandingInsuranceIncomeAmount;
		private double insuranceIncomeRecognize;
		private double provision;
		private double osprovision;
		private Double provisionRecognize;
		private short isSmssent;
		private double fundingCoyPortion;
		private Double spreadAmount;
		private Double spreadRecognize;
		private Date lastSpreadRecognize;
		private double adminFee;
		private double osadminFee;
		private double adminFeeRecognize;
		private Double otherRefundAmount;
		private Double outStandingOtherRefundAmount;
		private Double otherRefundRecognize;
		private Double admFeeAmount;
		private Double outStandingAdmFeeAmount;
		private Double admFeeRecognize;
		private Double provisionFeeAmount;
		private Double outStandingProvisionFeeAmount;
		private Double provisionFeeRecognize;
		private Double otherFeeAmount;
		private Double outStandingOtherFeeAmount;
		private Double otherFeeRecognize;
		private Double surveyFeeAmount;
		private Double outStandingSurveyFeeAmount;
		private Double surveyFeeRecognize;
		private Double incomeNet;
		private Double osprincipleNet;
		private Double grossYieldAcct;
		private Double deferredInsurIncAmount;
		private Double outstandingDeferredInsurIncAmount;
		private Double deferredInsurIncRecognize;
		private Double costOfSurveyFeeAmount;
		private Double outStandingCostOfSurveyAmount;
		private Double costOfSurveyRecognize;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public InstSchedule()
			{
			}
			
		public InstSchedule(long id, double instAmt, double paidAmt, double waivedAmt, double lcamt, double princAmt, double intrstAmt, double osPamt, double osIamt, double accruedAmt, double diffRateAmt, double osdiffRateAmt,
		        double accruedDiffRateAmt, double incentive, double osincentive, double incentiveRecognize, double insuranceIncomeAmount, double outStandingInsuranceIncomeAmount, double insuranceIncomeRecognize, double provision, double osprovision,
		        short isSmssent, double fundingCoyPortion, double adminFee, double osadminFee, double adminFeeRecognize)
			{
				this.id = id;
				this.instAmt = instAmt;
				this.paidAmt = paidAmt;
				this.waivedAmt = waivedAmt;
				this.lcamt = lcamt;
				this.princAmt = princAmt;
				this.intrstAmt = intrstAmt;
				this.osPamt = osPamt;
				this.osIamt = osIamt;
				this.accruedAmt = accruedAmt;
				this.diffRateAmt = diffRateAmt;
				this.osdiffRateAmt = osdiffRateAmt;
				this.accruedDiffRateAmt = accruedDiffRateAmt;
				this.incentive = incentive;
				this.osincentive = osincentive;
				this.incentiveRecognize = incentiveRecognize;
				this.insuranceIncomeAmount = insuranceIncomeAmount;
				this.outStandingInsuranceIncomeAmount = outStandingInsuranceIncomeAmount;
				this.insuranceIncomeRecognize = insuranceIncomeRecognize;
				this.provision = provision;
				this.osprovision = osprovision;
				this.isSmssent = isSmssent;
				this.fundingCoyPortion = fundingCoyPortion;
				this.adminFee = adminFee;
				this.osadminFee = osadminFee;
				this.adminFeeRecognize = adminFeeRecognize;
			}
			
		public InstSchedule(long id, Agrmnt agrmnt, Short instSeqNo, Date dueDate, double instAmt, double paidAmt, double waivedAmt, Date paidDate, double lcamt, Double lcpaid, Double lcwaived, double princAmt, double intrstAmt, double osPamt,
		        double osIamt, double accruedAmt, Date accruedDate, double diffRateAmt, double osdiffRateAmt, double accruedDiffRateAmt, double incentive, double osincentive, double incentiveRecognize, double insuranceIncomeAmount,
		        double outStandingInsuranceIncomeAmount, double insuranceIncomeRecognize, double provision, double osprovision, Double provisionRecognize, short isSmssent, double fundingCoyPortion, Double spreadAmount, Double spreadRecognize,
		        Date lastSpreadRecognize, double adminFee, double osadminFee, double adminFeeRecognize, Double otherRefundAmount, Double outStandingOtherRefundAmount, Double otherRefundRecognize, Double admFeeAmount, Double outStandingAdmFeeAmount,
		        Double admFeeRecognize, Double provisionFeeAmount, Double outStandingProvisionFeeAmount, Double provisionFeeRecognize, Double otherFeeAmount, Double outStandingOtherFeeAmount, Double otherFeeRecognize, Double surveyFeeAmount,
		        Double outStandingSurveyFeeAmount, Double surveyFeeRecognize, Double incomeNet, Double osprincipleNet, Double grossYieldAcct, Double deferredInsurIncAmount, Double outstandingDeferredInsurIncAmount, Double deferredInsurIncRecognize,
		        Double costOfSurveyFeeAmount, Double outStandingCostOfSurveyAmount, Double costOfSurveyRecognize, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.instSeqNo = instSeqNo;
				this.dueDate = dueDate;
				this.instAmt = instAmt;
				this.paidAmt = paidAmt;
				this.waivedAmt = waivedAmt;
				this.paidDate = paidDate;
				this.lcamt = lcamt;
				this.lcpaid = lcpaid;
				this.lcwaived = lcwaived;
				this.princAmt = princAmt;
				this.intrstAmt = intrstAmt;
				this.osPamt = osPamt;
				this.osIamt = osIamt;
				this.accruedAmt = accruedAmt;
				this.accruedDate = accruedDate;
				this.diffRateAmt = diffRateAmt;
				this.osdiffRateAmt = osdiffRateAmt;
				this.accruedDiffRateAmt = accruedDiffRateAmt;
				this.incentive = incentive;
				this.osincentive = osincentive;
				this.incentiveRecognize = incentiveRecognize;
				this.insuranceIncomeAmount = insuranceIncomeAmount;
				this.outStandingInsuranceIncomeAmount = outStandingInsuranceIncomeAmount;
				this.insuranceIncomeRecognize = insuranceIncomeRecognize;
				this.provision = provision;
				this.osprovision = osprovision;
				this.provisionRecognize = provisionRecognize;
				this.isSmssent = isSmssent;
				this.fundingCoyPortion = fundingCoyPortion;
				this.spreadAmount = spreadAmount;
				this.spreadRecognize = spreadRecognize;
				this.lastSpreadRecognize = lastSpreadRecognize;
				this.adminFee = adminFee;
				this.osadminFee = osadminFee;
				this.adminFeeRecognize = adminFeeRecognize;
				this.otherRefundAmount = otherRefundAmount;
				this.outStandingOtherRefundAmount = outStandingOtherRefundAmount;
				this.otherRefundRecognize = otherRefundRecognize;
				this.admFeeAmount = admFeeAmount;
				this.outStandingAdmFeeAmount = outStandingAdmFeeAmount;
				this.admFeeRecognize = admFeeRecognize;
				this.provisionFeeAmount = provisionFeeAmount;
				this.outStandingProvisionFeeAmount = outStandingProvisionFeeAmount;
				this.provisionFeeRecognize = provisionFeeRecognize;
				this.otherFeeAmount = otherFeeAmount;
				this.outStandingOtherFeeAmount = outStandingOtherFeeAmount;
				this.otherFeeRecognize = otherFeeRecognize;
				this.surveyFeeAmount = surveyFeeAmount;
				this.outStandingSurveyFeeAmount = outStandingSurveyFeeAmount;
				this.surveyFeeRecognize = surveyFeeRecognize;
				this.incomeNet = incomeNet;
				this.osprincipleNet = osprincipleNet;
				this.grossYieldAcct = grossYieldAcct;
				this.deferredInsurIncAmount = deferredInsurIncAmount;
				this.outstandingDeferredInsurIncAmount = outstandingDeferredInsurIncAmount;
				this.deferredInsurIncRecognize = deferredInsurIncRecognize;
				this.costOfSurveyFeeAmount = costOfSurveyFeeAmount;
				this.outStandingCostOfSurveyAmount = outStandingCostOfSurveyAmount;
				this.costOfSurveyRecognize = costOfSurveyRecognize;
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
			
		@Column(name = "InstSeqNo")
		public Short getInstSeqNo()
			{
				return this.instSeqNo;
			}
			
		public void setInstSeqNo(Short instSeqNo)
			{
				this.instSeqNo = instSeqNo;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DueDate", length = 23)
		public Date getDueDate()
			{
				return this.dueDate;
			}
			
		public void setDueDate(Date dueDate)
			{
				this.dueDate = dueDate;
			}
			
		@Column(name = "InstAmt", nullable = false, precision = 53, scale = 0)
		public double getInstAmt()
			{
				return this.instAmt;
			}
			
		public void setInstAmt(double instAmt)
			{
				this.instAmt = instAmt;
			}
			
		@Column(name = "PaidAmt", nullable = false, precision = 53, scale = 0)
		public double getPaidAmt()
			{
				return this.paidAmt;
			}
			
		public void setPaidAmt(double paidAmt)
			{
				this.paidAmt = paidAmt;
			}
			
		@Column(name = "WaivedAmt", nullable = false, precision = 53, scale = 0)
		public double getWaivedAmt()
			{
				return this.waivedAmt;
			}
			
		public void setWaivedAmt(double waivedAmt)
			{
				this.waivedAmt = waivedAmt;
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
			
		@Column(name = "LCAmt", nullable = false, precision = 53, scale = 0)
		public double getLcamt()
			{
				return this.lcamt;
			}
			
		public void setLcamt(double lcamt)
			{
				this.lcamt = lcamt;
			}
			
		@Column(name = "LCPaid", precision = 53, scale = 0)
		public Double getLcpaid()
			{
				return this.lcpaid;
			}
			
		public void setLcpaid(Double lcpaid)
			{
				this.lcpaid = lcpaid;
			}
			
		@Column(name = "LCWaived", precision = 53, scale = 0)
		public Double getLcwaived()
			{
				return this.lcwaived;
			}
			
		public void setLcwaived(Double lcwaived)
			{
				this.lcwaived = lcwaived;
			}
			
		@Column(name = "PrincAmt", nullable = false, precision = 53, scale = 0)
		public double getPrincAmt()
			{
				return this.princAmt;
			}
			
		public void setPrincAmt(double princAmt)
			{
				this.princAmt = princAmt;
			}
			
		@Column(name = "IntrstAmt", nullable = false, precision = 53, scale = 0)
		public double getIntrstAmt()
			{
				return this.intrstAmt;
			}
			
		public void setIntrstAmt(double intrstAmt)
			{
				this.intrstAmt = intrstAmt;
			}
			
		@Column(name = "OsPAmt", nullable = false, precision = 53, scale = 0)
		public double getOsPamt()
			{
				return this.osPamt;
			}
			
		public void setOsPamt(double osPamt)
			{
				this.osPamt = osPamt;
			}
			
		@Column(name = "OsIAmt", nullable = false, precision = 53, scale = 0)
		public double getOsIamt()
			{
				return this.osIamt;
			}
			
		public void setOsIamt(double osIamt)
			{
				this.osIamt = osIamt;
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
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "AccruedDate", length = 23)
		public Date getAccruedDate()
			{
				return this.accruedDate;
			}
			
		public void setAccruedDate(Date accruedDate)
			{
				this.accruedDate = accruedDate;
			}
			
		@Column(name = "DiffRateAmt", nullable = false, precision = 53, scale = 0)
		public double getDiffRateAmt()
			{
				return this.diffRateAmt;
			}
			
		public void setDiffRateAmt(double diffRateAmt)
			{
				this.diffRateAmt = diffRateAmt;
			}
			
		@Column(name = "OSDiffRateAmt", nullable = false, precision = 53, scale = 0)
		public double getOsdiffRateAmt()
			{
				return this.osdiffRateAmt;
			}
			
		public void setOsdiffRateAmt(double osdiffRateAmt)
			{
				this.osdiffRateAmt = osdiffRateAmt;
			}
			
		@Column(name = "AccruedDiffRateAmt", nullable = false, precision = 53, scale = 0)
		public double getAccruedDiffRateAmt()
			{
				return this.accruedDiffRateAmt;
			}
			
		public void setAccruedDiffRateAmt(double accruedDiffRateAmt)
			{
				this.accruedDiffRateAmt = accruedDiffRateAmt;
			}
			
		@Column(name = "Incentive", nullable = false, precision = 53, scale = 0)
		public double getIncentive()
			{
				return this.incentive;
			}
			
		public void setIncentive(double incentive)
			{
				this.incentive = incentive;
			}
			
		@Column(name = "OSIncentive", nullable = false, precision = 53, scale = 0)
		public double getOsincentive()
			{
				return this.osincentive;
			}
			
		public void setOsincentive(double osincentive)
			{
				this.osincentive = osincentive;
			}
			
		@Column(name = "IncentiveRecognize", nullable = false, precision = 53, scale = 0)
		public double getIncentiveRecognize()
			{
				return this.incentiveRecognize;
			}
			
		public void setIncentiveRecognize(double incentiveRecognize)
			{
				this.incentiveRecognize = incentiveRecognize;
			}
			
		@Column(name = "InsuranceIncomeAmount", nullable = false, precision = 53, scale = 0)
		public double getInsuranceIncomeAmount()
			{
				return this.insuranceIncomeAmount;
			}
			
		public void setInsuranceIncomeAmount(double insuranceIncomeAmount)
			{
				this.insuranceIncomeAmount = insuranceIncomeAmount;
			}
			
		@Column(name = "OutStandingInsuranceIncomeAmount", nullable = false, precision = 53, scale = 0)
		public double getOutStandingInsuranceIncomeAmount()
			{
				return this.outStandingInsuranceIncomeAmount;
			}
			
		public void setOutStandingInsuranceIncomeAmount(double outStandingInsuranceIncomeAmount)
			{
				this.outStandingInsuranceIncomeAmount = outStandingInsuranceIncomeAmount;
			}
			
		@Column(name = "InsuranceIncomeRecognize", nullable = false, precision = 53, scale = 0)
		public double getInsuranceIncomeRecognize()
			{
				return this.insuranceIncomeRecognize;
			}
			
		public void setInsuranceIncomeRecognize(double insuranceIncomeRecognize)
			{
				this.insuranceIncomeRecognize = insuranceIncomeRecognize;
			}
			
		@Column(name = "Provision", nullable = false, precision = 53, scale = 0)
		public double getProvision()
			{
				return this.provision;
			}
			
		public void setProvision(double provision)
			{
				this.provision = provision;
			}
			
		@Column(name = "OSProvision", nullable = false, precision = 53, scale = 0)
		public double getOsprovision()
			{
				return this.osprovision;
			}
			
		public void setOsprovision(double osprovision)
			{
				this.osprovision = osprovision;
			}
			
		@Column(name = "ProvisionRecognize", precision = 53, scale = 0)
		public Double getProvisionRecognize()
			{
				return this.provisionRecognize;
			}
			
		public void setProvisionRecognize(Double provisionRecognize)
			{
				this.provisionRecognize = provisionRecognize;
			}
			
		@Column(name = "IsSMSSent", nullable = false)
		public short getIsSmssent()
			{
				return this.isSmssent;
			}
			
		public void setIsSmssent(short isSmssent)
			{
				this.isSmssent = isSmssent;
			}
			
		@Column(name = "FundingCoyPortion", nullable = false, precision = 53, scale = 0)
		public double getFundingCoyPortion()
			{
				return this.fundingCoyPortion;
			}
			
		public void setFundingCoyPortion(double fundingCoyPortion)
			{
				this.fundingCoyPortion = fundingCoyPortion;
			}
			
		@Column(name = "SpreadAmount", precision = 53, scale = 0)
		public Double getSpreadAmount()
			{
				return this.spreadAmount;
			}
			
		public void setSpreadAmount(Double spreadAmount)
			{
				this.spreadAmount = spreadAmount;
			}
			
		@Column(name = "SpreadRecognize", precision = 53, scale = 0)
		public Double getSpreadRecognize()
			{
				return this.spreadRecognize;
			}
			
		public void setSpreadRecognize(Double spreadRecognize)
			{
				this.spreadRecognize = spreadRecognize;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "LastSpreadRecognize", length = 23)
		public Date getLastSpreadRecognize()
			{
				return this.lastSpreadRecognize;
			}
			
		public void setLastSpreadRecognize(Date lastSpreadRecognize)
			{
				this.lastSpreadRecognize = lastSpreadRecognize;
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
			
		@Column(name = "OSAdminFee", nullable = false, precision = 53, scale = 0)
		public double getOsadminFee()
			{
				return this.osadminFee;
			}
			
		public void setOsadminFee(double osadminFee)
			{
				this.osadminFee = osadminFee;
			}
			
		@Column(name = "AdminFeeRecognize", nullable = false, precision = 53, scale = 0)
		public double getAdminFeeRecognize()
			{
				return this.adminFeeRecognize;
			}
			
		public void setAdminFeeRecognize(double adminFeeRecognize)
			{
				this.adminFeeRecognize = adminFeeRecognize;
			}
			
		@Column(name = "OtherRefundAmount", precision = 53, scale = 0)
		public Double getOtherRefundAmount()
			{
				return this.otherRefundAmount;
			}
			
		public void setOtherRefundAmount(Double otherRefundAmount)
			{
				this.otherRefundAmount = otherRefundAmount;
			}
			
		@Column(name = "OutStandingOtherRefundAmount", precision = 53, scale = 0)
		public Double getOutStandingOtherRefundAmount()
			{
				return this.outStandingOtherRefundAmount;
			}
			
		public void setOutStandingOtherRefundAmount(Double outStandingOtherRefundAmount)
			{
				this.outStandingOtherRefundAmount = outStandingOtherRefundAmount;
			}
			
		@Column(name = "OtherRefundRecognize", precision = 53, scale = 0)
		public Double getOtherRefundRecognize()
			{
				return this.otherRefundRecognize;
			}
			
		public void setOtherRefundRecognize(Double otherRefundRecognize)
			{
				this.otherRefundRecognize = otherRefundRecognize;
			}
			
		@Column(name = "AdmFeeAmount", precision = 53, scale = 0)
		public Double getAdmFeeAmount()
			{
				return this.admFeeAmount;
			}
			
		public void setAdmFeeAmount(Double admFeeAmount)
			{
				this.admFeeAmount = admFeeAmount;
			}
			
		@Column(name = "OutStandingAdmFeeAmount", precision = 53, scale = 0)
		public Double getOutStandingAdmFeeAmount()
			{
				return this.outStandingAdmFeeAmount;
			}
			
		public void setOutStandingAdmFeeAmount(Double outStandingAdmFeeAmount)
			{
				this.outStandingAdmFeeAmount = outStandingAdmFeeAmount;
			}
			
		@Column(name = "AdmFeeRecognize", precision = 53, scale = 0)
		public Double getAdmFeeRecognize()
			{
				return this.admFeeRecognize;
			}
			
		public void setAdmFeeRecognize(Double admFeeRecognize)
			{
				this.admFeeRecognize = admFeeRecognize;
			}
			
		@Column(name = "ProvisionFeeAmount", precision = 53, scale = 0)
		public Double getProvisionFeeAmount()
			{
				return this.provisionFeeAmount;
			}
			
		public void setProvisionFeeAmount(Double provisionFeeAmount)
			{
				this.provisionFeeAmount = provisionFeeAmount;
			}
			
		@Column(name = "OutStandingProvisionFeeAmount", precision = 53, scale = 0)
		public Double getOutStandingProvisionFeeAmount()
			{
				return this.outStandingProvisionFeeAmount;
			}
			
		public void setOutStandingProvisionFeeAmount(Double outStandingProvisionFeeAmount)
			{
				this.outStandingProvisionFeeAmount = outStandingProvisionFeeAmount;
			}
			
		@Column(name = "ProvisionFeeRecognize", precision = 53, scale = 0)
		public Double getProvisionFeeRecognize()
			{
				return this.provisionFeeRecognize;
			}
			
		public void setProvisionFeeRecognize(Double provisionFeeRecognize)
			{
				this.provisionFeeRecognize = provisionFeeRecognize;
			}
			
		@Column(name = "OtherFeeAmount", precision = 53, scale = 0)
		public Double getOtherFeeAmount()
			{
				return this.otherFeeAmount;
			}
			
		public void setOtherFeeAmount(Double otherFeeAmount)
			{
				this.otherFeeAmount = otherFeeAmount;
			}
			
		@Column(name = "OutStandingOtherFeeAmount", precision = 53, scale = 0)
		public Double getOutStandingOtherFeeAmount()
			{
				return this.outStandingOtherFeeAmount;
			}
			
		public void setOutStandingOtherFeeAmount(Double outStandingOtherFeeAmount)
			{
				this.outStandingOtherFeeAmount = outStandingOtherFeeAmount;
			}
			
		@Column(name = "OtherFeeRecognize", precision = 53, scale = 0)
		public Double getOtherFeeRecognize()
			{
				return this.otherFeeRecognize;
			}
			
		public void setOtherFeeRecognize(Double otherFeeRecognize)
			{
				this.otherFeeRecognize = otherFeeRecognize;
			}
			
		@Column(name = "SurveyFeeAmount", precision = 53, scale = 0)
		public Double getSurveyFeeAmount()
			{
				return this.surveyFeeAmount;
			}
			
		public void setSurveyFeeAmount(Double surveyFeeAmount)
			{
				this.surveyFeeAmount = surveyFeeAmount;
			}
			
		@Column(name = "OutStandingSurveyFeeAmount", precision = 53, scale = 0)
		public Double getOutStandingSurveyFeeAmount()
			{
				return this.outStandingSurveyFeeAmount;
			}
			
		public void setOutStandingSurveyFeeAmount(Double outStandingSurveyFeeAmount)
			{
				this.outStandingSurveyFeeAmount = outStandingSurveyFeeAmount;
			}
			
		@Column(name = "SurveyFeeRecognize", precision = 53, scale = 0)
		public Double getSurveyFeeRecognize()
			{
				return this.surveyFeeRecognize;
			}
			
		public void setSurveyFeeRecognize(Double surveyFeeRecognize)
			{
				this.surveyFeeRecognize = surveyFeeRecognize;
			}
			
		@Column(name = "IncomeNet", precision = 53, scale = 0)
		public Double getIncomeNet()
			{
				return this.incomeNet;
			}
			
		public void setIncomeNet(Double incomeNet)
			{
				this.incomeNet = incomeNet;
			}
			
		@Column(name = "OSPrincipleNet", precision = 53, scale = 0)
		public Double getOsprincipleNet()
			{
				return this.osprincipleNet;
			}
			
		public void setOsprincipleNet(Double osprincipleNet)
			{
				this.osprincipleNet = osprincipleNet;
			}
			
		@Column(name = "GrossYieldAcct", precision = 53, scale = 0)
		public Double getGrossYieldAcct()
			{
				return this.grossYieldAcct;
			}
			
		public void setGrossYieldAcct(Double grossYieldAcct)
			{
				this.grossYieldAcct = grossYieldAcct;
			}
			
		@Column(name = "DeferredInsurIncAmount", precision = 53, scale = 0)
		public Double getDeferredInsurIncAmount()
			{
				return this.deferredInsurIncAmount;
			}
			
		public void setDeferredInsurIncAmount(Double deferredInsurIncAmount)
			{
				this.deferredInsurIncAmount = deferredInsurIncAmount;
			}
			
		@Column(name = "OutstandingDeferredInsurIncAmount", precision = 53, scale = 0)
		public Double getOutstandingDeferredInsurIncAmount()
			{
				return this.outstandingDeferredInsurIncAmount;
			}
			
		public void setOutstandingDeferredInsurIncAmount(Double outstandingDeferredInsurIncAmount)
			{
				this.outstandingDeferredInsurIncAmount = outstandingDeferredInsurIncAmount;
			}
			
		@Column(name = "DeferredInsurIncRecognize", precision = 53, scale = 0)
		public Double getDeferredInsurIncRecognize()
			{
				return this.deferredInsurIncRecognize;
			}
			
		public void setDeferredInsurIncRecognize(Double deferredInsurIncRecognize)
			{
				this.deferredInsurIncRecognize = deferredInsurIncRecognize;
			}
			
		@Column(name = "CostOfSurveyFeeAmount", precision = 53, scale = 0)
		public Double getCostOfSurveyFeeAmount()
			{
				return this.costOfSurveyFeeAmount;
			}
			
		public void setCostOfSurveyFeeAmount(Double costOfSurveyFeeAmount)
			{
				this.costOfSurveyFeeAmount = costOfSurveyFeeAmount;
			}
			
		@Column(name = "OutStandingCostOfSurveyAmount", precision = 53, scale = 0)
		public Double getOutStandingCostOfSurveyAmount()
			{
				return this.outStandingCostOfSurveyAmount;
			}
			
		public void setOutStandingCostOfSurveyAmount(Double outStandingCostOfSurveyAmount)
			{
				this.outStandingCostOfSurveyAmount = outStandingCostOfSurveyAmount;
			}
			
		@Column(name = "CostOfSurveyRecognize", precision = 53, scale = 0)
		public Double getCostOfSurveyRecognize()
			{
				return this.costOfSurveyRecognize;
			}
			
		public void setCostOfSurveyRecognize(Double costOfSurveyRecognize)
			{
				this.costOfSurveyRecognize = costOfSurveyRecognize;
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
