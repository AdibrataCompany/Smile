
package com.adibrata.smartdealer.model;
// Generated Aug 21, 2015 12:33:53 PM by Hibernate Tools 4.3.1

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
 * CoyCustFinancialInfo generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "CoyCustFinancialInfo", catalog = "SmartDealer")
public class CoyCustFinancialInfo implements java.io.Serializable
	{
		
		private long id;
		private Customer customer;
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
		
		public CoyCustFinancialInfo()
			{
			}
			
		public CoyCustFinancialInfo(long id, double modalDasar, double modalDisetor, double netProfitMargin, double allowanceAvailable)
			{
				this.id = id;
				this.modalDasar = modalDasar;
				this.modalDisetor = modalDisetor;
				this.netProfitMargin = netProfitMargin;
				this.allowanceAvailable = allowanceAvailable;
			}
			
		public CoyCustFinancialInfo(long id, Customer customer, Date rentFinishDate, Double currentRatio, Double roi, Double der, double modalDasar, double modalDisetor, double netProfitMargin, String bankAccountType, double allowanceAvailable,
		        Double averageDebitTransaction, Double averageCreditTransaction, Double averageBalance, Double deposito, String additionalCollateralType, Double additionalCollateralAmount, String companyStatus, Short companyStatusSinceYear,
		        String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.customer = customer;
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
		@JoinColumn(name = "CustomerId")
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(Customer customer)
			{
				this.customer = customer;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
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
