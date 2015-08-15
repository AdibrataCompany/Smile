
package com.adibrata.smartdealer.model;
// Generated Aug 2, 2015 10:39:56 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CoyCustFinancialInfoId generated by hbm2java
 */
@Embeddable
public class CoyCustFinancialInfoId implements java.io.Serializable
	{
		
		private Long id;
		private Long customerId;
		private Date rentFinishDate;
		private Double currentRatio;
		private Double roi;
		private Double der;
		private double modalDasar;
		private double modalDisetor;
		private double netProfitMargin;
		private String bankAccountType;
		private double allowanceAvailable;
		private Double averageDebitTransaction;
		private Double averageCreditTransaction;
		private Double averageBalance;
		private Double deposito;
		private String additionalCollateralType;
		private Double additionalCollateralAmount;
		private String companyStatus;
		private Short companyStatusSinceYear;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public CoyCustFinancialInfoId()
			{
			}
			
		public CoyCustFinancialInfoId(Long id, double modalDasar, double modalDisetor, double netProfitMargin, double allowanceAvailable)
			{
				this.id = id;
				this.modalDasar = modalDasar;
				this.modalDisetor = modalDisetor;
				this.netProfitMargin = netProfitMargin;
				this.allowanceAvailable = allowanceAvailable;
			}
			
		public CoyCustFinancialInfoId(Long id, Long customerId, Date rentFinishDate, Double currentRatio, Double roi, Double der, double modalDasar, double modalDisetor, double netProfitMargin, String bankAccountType, double allowanceAvailable,
		        Double averageDebitTransaction, Double averageCreditTransaction, Double averageBalance, Double deposito, String additionalCollateralType, Double additionalCollateralAmount, String companyStatus, Short companyStatusSinceYear,
		        String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.customerId = customerId;
				this.rentFinishDate = rentFinishDate;
				this.currentRatio = currentRatio;
				this.roi = roi;
				this.der = der;
				this.modalDasar = modalDasar;
				this.modalDisetor = modalDisetor;
				this.netProfitMargin = netProfitMargin;
				this.bankAccountType = bankAccountType;
				this.allowanceAvailable = allowanceAvailable;
				this.averageDebitTransaction = averageDebitTransaction;
				this.averageCreditTransaction = averageCreditTransaction;
				this.averageBalance = averageBalance;
				this.deposito = deposito;
				this.additionalCollateralType = additionalCollateralType;
				this.additionalCollateralAmount = additionalCollateralAmount;
				this.companyStatus = companyStatus;
				this.companyStatusSinceYear = companyStatusSinceYear;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
			}
			
		@Column(name = "Id", nullable = false)
		public Long getId()
			{
				return this.id;
			}
			
		public void setId(Long id)
			{
				this.id = id;
			}
			
		@Column(name = "CustomerId")
		public Long getCustomerId()
			{
				return this.customerId;
			}
			
		public void setCustomerId(Long customerId)
			{
				this.customerId = customerId;
			}
			
		@Column(name = "RentFinishDate", length = 23)
		public Date getRentFinishDate()
			{
				return this.rentFinishDate;
			}
			
		public void setRentFinishDate(Date rentFinishDate)
			{
				this.rentFinishDate = rentFinishDate;
			}
			
		@Column(name = "CurrentRatio", precision = 53, scale = 0)
		public Double getCurrentRatio()
			{
				return this.currentRatio;
			}
			
		public void setCurrentRatio(Double currentRatio)
			{
				this.currentRatio = currentRatio;
			}
			
		@Column(name = "ROI", precision = 53, scale = 0)
		public Double getRoi()
			{
				return this.roi;
			}
			
		public void setRoi(Double roi)
			{
				this.roi = roi;
			}
			
		@Column(name = "DER", precision = 53, scale = 0)
		public Double getDer()
			{
				return this.der;
			}
			
		public void setDer(Double der)
			{
				this.der = der;
			}
			
		@Column(name = "ModalDasar", nullable = false, precision = 53, scale = 0)
		public double getModalDasar()
			{
				return this.modalDasar;
			}
			
		public void setModalDasar(double modalDasar)
			{
				this.modalDasar = modalDasar;
			}
			
		@Column(name = "ModalDisetor", nullable = false, precision = 53, scale = 0)
		public double getModalDisetor()
			{
				return this.modalDisetor;
			}
			
		public void setModalDisetor(double modalDisetor)
			{
				this.modalDisetor = modalDisetor;
			}
			
		@Column(name = "NetProfitMargin", nullable = false, precision = 53, scale = 0)
		public double getNetProfitMargin()
			{
				return this.netProfitMargin;
			}
			
		public void setNetProfitMargin(double netProfitMargin)
			{
				this.netProfitMargin = netProfitMargin;
			}
			
		@Column(name = "BankAccountType", length = 10)
		public String getBankAccountType()
			{
				return this.bankAccountType;
			}
			
		public void setBankAccountType(String bankAccountType)
			{
				this.bankAccountType = bankAccountType;
			}
			
		@Column(name = "AllowanceAvailable", nullable = false, precision = 53, scale = 0)
		public double getAllowanceAvailable()
			{
				return this.allowanceAvailable;
			}
			
		public void setAllowanceAvailable(double allowanceAvailable)
			{
				this.allowanceAvailable = allowanceAvailable;
			}
			
		@Column(name = "AverageDebitTransaction", precision = 53, scale = 0)
		public Double getAverageDebitTransaction()
			{
				return this.averageDebitTransaction;
			}
			
		public void setAverageDebitTransaction(Double averageDebitTransaction)
			{
				this.averageDebitTransaction = averageDebitTransaction;
			}
			
		@Column(name = "AverageCreditTransaction", precision = 53, scale = 0)
		public Double getAverageCreditTransaction()
			{
				return this.averageCreditTransaction;
			}
			
		public void setAverageCreditTransaction(Double averageCreditTransaction)
			{
				this.averageCreditTransaction = averageCreditTransaction;
			}
			
		@Column(name = "AverageBalance", precision = 53, scale = 0)
		public Double getAverageBalance()
			{
				return this.averageBalance;
			}
			
		public void setAverageBalance(Double averageBalance)
			{
				this.averageBalance = averageBalance;
			}
			
		@Column(name = "Deposito", precision = 53, scale = 0)
		public Double getDeposito()
			{
				return this.deposito;
			}
			
		public void setDeposito(Double deposito)
			{
				this.deposito = deposito;
			}
			
		@Column(name = "AdditionalCollateralType", length = 50)
		public String getAdditionalCollateralType()
			{
				return this.additionalCollateralType;
			}
			
		public void setAdditionalCollateralType(String additionalCollateralType)
			{
				this.additionalCollateralType = additionalCollateralType;
			}
			
		@Column(name = "AdditionalCollateralAmount", precision = 53, scale = 0)
		public Double getAdditionalCollateralAmount()
			{
				return this.additionalCollateralAmount;
			}
			
		public void setAdditionalCollateralAmount(Double additionalCollateralAmount)
			{
				this.additionalCollateralAmount = additionalCollateralAmount;
			}
			
		@Column(name = "CompanyStatus", length = 10)
		public String getCompanyStatus()
			{
				return this.companyStatus;
			}
			
		public void setCompanyStatus(String companyStatus)
			{
				this.companyStatus = companyStatus;
			}
			
		@Column(name = "CompanyStatusSinceYear")
		public Short getCompanyStatusSinceYear()
			{
				return this.companyStatusSinceYear;
			}
			
		public void setCompanyStatusSinceYear(Short companyStatusSinceYear)
			{
				this.companyStatusSinceYear = companyStatusSinceYear;
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
			
		@Column(name = "DtmCrt", length = 16)
		public Date getDtmCrt()
			{
				return this.dtmCrt;
			}
			
		public void setDtmCrt(Date dtmCrt)
			{
				this.dtmCrt = dtmCrt;
			}
			
		public boolean equals(Object other)
			{
				if ((this == other))
					return true;
				if ((other == null))
					return false;
				if (!(other instanceof CoyCustFinancialInfoId))
					return false;
				CoyCustFinancialInfoId castOther = (CoyCustFinancialInfoId) other;
				
				return (this.getId() == castOther.getId()) && ((this.getCustomerId() == castOther.getCustomerId()) || (this.getCustomerId() != null && castOther.getCustomerId() != null && this.getCustomerId().equals(castOther.getCustomerId())))
				        && ((this.getRentFinishDate() == castOther.getRentFinishDate()) || (this.getRentFinishDate() != null && castOther.getRentFinishDate() != null && this.getRentFinishDate().equals(castOther.getRentFinishDate())))
				        && ((this.getCurrentRatio() == castOther.getCurrentRatio()) || (this.getCurrentRatio() != null && castOther.getCurrentRatio() != null && this.getCurrentRatio().equals(castOther.getCurrentRatio())))
				        && ((this.getRoi() == castOther.getRoi()) || (this.getRoi() != null && castOther.getRoi() != null && this.getRoi().equals(castOther.getRoi())))
				        && ((this.getDer() == castOther.getDer()) || (this.getDer() != null && castOther.getDer() != null && this.getDer().equals(castOther.getDer()))) && (this.getModalDasar() == castOther.getModalDasar())
				        && (this.getModalDisetor() == castOther.getModalDisetor()) && (this.getNetProfitMargin() == castOther.getNetProfitMargin())
				        && ((this.getBankAccountType() == castOther.getBankAccountType()) || (this.getBankAccountType() != null && castOther.getBankAccountType() != null && this.getBankAccountType().equals(castOther.getBankAccountType())))
				        && (this.getAllowanceAvailable() == castOther.getAllowanceAvailable())
				        && ((this.getAverageDebitTransaction() == castOther.getAverageDebitTransaction())
				                || (this.getAverageDebitTransaction() != null && castOther.getAverageDebitTransaction() != null && this.getAverageDebitTransaction().equals(castOther.getAverageDebitTransaction())))
				        && ((this.getAverageCreditTransaction() == castOther.getAverageCreditTransaction())
				                || (this.getAverageCreditTransaction() != null && castOther.getAverageCreditTransaction() != null && this.getAverageCreditTransaction().equals(castOther.getAverageCreditTransaction())))
				        && ((this.getAverageBalance() == castOther.getAverageBalance()) || (this.getAverageBalance() != null && castOther.getAverageBalance() != null && this.getAverageBalance().equals(castOther.getAverageBalance())))
				        && ((this.getDeposito() == castOther.getDeposito()) || (this.getDeposito() != null && castOther.getDeposito() != null && this.getDeposito().equals(castOther.getDeposito())))
				        && ((this.getAdditionalCollateralType() == castOther.getAdditionalCollateralType())
				                || (this.getAdditionalCollateralType() != null && castOther.getAdditionalCollateralType() != null && this.getAdditionalCollateralType().equals(castOther.getAdditionalCollateralType())))
				        && ((this.getAdditionalCollateralAmount() == castOther.getAdditionalCollateralAmount())
				                || (this.getAdditionalCollateralAmount() != null && castOther.getAdditionalCollateralAmount() != null && this.getAdditionalCollateralAmount().equals(castOther.getAdditionalCollateralAmount())))
				        && ((this.getCompanyStatus() == castOther.getCompanyStatus()) || (this.getCompanyStatus() != null && castOther.getCompanyStatus() != null && this.getCompanyStatus().equals(castOther.getCompanyStatus())))
				        && ((this.getCompanyStatusSinceYear() == castOther.getCompanyStatusSinceYear())
				                || (this.getCompanyStatusSinceYear() != null && castOther.getCompanyStatusSinceYear() != null && this.getCompanyStatusSinceYear().equals(castOther.getCompanyStatusSinceYear())))
				        && ((this.getUsrCrt() == castOther.getUsrCrt()) || (this.getUsrCrt() != null && castOther.getUsrCrt() != null && this.getUsrCrt().equals(castOther.getUsrCrt())))
				        && ((this.getDtmUpd() == castOther.getDtmUpd()) || (this.getDtmUpd() != null && castOther.getDtmUpd() != null && this.getDtmUpd().equals(castOther.getDtmUpd())))
				        && ((this.getUsrUpd() == castOther.getUsrUpd()) || (this.getUsrUpd() != null && castOther.getUsrUpd() != null && this.getUsrUpd().equals(castOther.getUsrUpd())))
				        && ((this.getDtmCrt() == castOther.getDtmCrt()) || (this.getDtmCrt() != null && castOther.getDtmCrt() != null && this.getDtmCrt().equals(castOther.getDtmCrt())));
			}
			
		public int hashCode()
			{
				int result = 17;
				
				result = 37 * result + (int) this.getId();
				result = 37 * result + (getCustomerId() == null ? 0 : this.getCustomerId().hashCode());
				result = 37 * result + (getRentFinishDate() == null ? 0 : this.getRentFinishDate().hashCode());
				result = 37 * result + (getCurrentRatio() == null ? 0 : this.getCurrentRatio().hashCode());
				result = 37 * result + (getRoi() == null ? 0 : this.getRoi().hashCode());
				result = 37 * result + (getDer() == null ? 0 : this.getDer().hashCode());
				result = 37 * result + (int) this.getModalDasar();
				result = 37 * result + (int) this.getModalDisetor();
				result = 37 * result + (int) this.getNetProfitMargin();
				result = 37 * result + (getBankAccountType() == null ? 0 : this.getBankAccountType().hashCode());
				result = 37 * result + (int) this.getAllowanceAvailable();
				result = 37 * result + (getAverageDebitTransaction() == null ? 0 : this.getAverageDebitTransaction().hashCode());
				result = 37 * result + (getAverageCreditTransaction() == null ? 0 : this.getAverageCreditTransaction().hashCode());
				result = 37 * result + (getAverageBalance() == null ? 0 : this.getAverageBalance().hashCode());
				result = 37 * result + (getDeposito() == null ? 0 : this.getDeposito().hashCode());
				result = 37 * result + (getAdditionalCollateralType() == null ? 0 : this.getAdditionalCollateralType().hashCode());
				result = 37 * result + (getAdditionalCollateralAmount() == null ? 0 : this.getAdditionalCollateralAmount().hashCode());
				result = 37 * result + (getCompanyStatus() == null ? 0 : this.getCompanyStatus().hashCode());
				result = 37 * result + (getCompanyStatusSinceYear() == null ? 0 : this.getCompanyStatusSinceYear().hashCode());
				result = 37 * result + (getUsrCrt() == null ? 0 : this.getUsrCrt().hashCode());
				result = 37 * result + (getDtmUpd() == null ? 0 : this.getDtmUpd().hashCode());
				result = 37 * result + (getUsrUpd() == null ? 0 : this.getUsrUpd().hashCode());
				result = 37 * result + (getDtmCrt() == null ? 0 : this.getDtmCrt().hashCode());
				return result;
			}
			
	}
