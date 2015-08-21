
package com.adibrata.smartdealer.model;
// Generated Aug 21, 2015 12:01:27 PM by Hibernate Tools 4.3.1

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
 * PersCustFinancialData generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "PersCustFinancialData", catalog = "SmartDealer")
public class PersCustFinancialData implements java.io.Serializable
	{
		
		private long id;
		private Customer customer;
		private Double spouseIncome;
		private Double avgBalanceAccount;
		private String bankAccountType;
		private Double averageDebitTransaction;
		private Double averageCreditTransaction;
		private Double averageBalance;
		private Double deposito;
		private Double livingCostAmount;
		private Double otherLoanInstallment;
		private String additionalCollateralType;
		private Double additionalCollateralAmount;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public PersCustFinancialData()
			{
			}
			
		public PersCustFinancialData(long id)
			{
				this.id = id;
			}
			
		public PersCustFinancialData(long id, Customer customer, Double spouseIncome, Double avgBalanceAccount, String bankAccountType, Double averageDebitTransaction, Double averageCreditTransaction, Double averageBalance, Double deposito,
		        Double livingCostAmount, Double otherLoanInstallment, String additionalCollateralType, Double additionalCollateralAmount, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.customer = customer;
				this.spouseIncome = spouseIncome;
				this.avgBalanceAccount = avgBalanceAccount;
				this.bankAccountType = bankAccountType;
				this.averageDebitTransaction = averageDebitTransaction;
				this.averageCreditTransaction = averageCreditTransaction;
				this.averageBalance = averageBalance;
				this.deposito = deposito;
				this.livingCostAmount = livingCostAmount;
				this.otherLoanInstallment = otherLoanInstallment;
				this.additionalCollateralType = additionalCollateralType;
				this.additionalCollateralAmount = additionalCollateralAmount;
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
		@JoinColumn(name = "CutomerId")
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(Customer customer)
			{
				this.customer = customer;
			}
			
		@Column(name = "SpouseIncome", precision = 53, scale = 0)
		public Double getSpouseIncome()
			{
				return this.spouseIncome;
			}
			
		public void setSpouseIncome(Double spouseIncome)
			{
				this.spouseIncome = spouseIncome;
			}
			
		@Column(name = "AvgBalanceAccount", precision = 53, scale = 0)
		public Double getAvgBalanceAccount()
			{
				return this.avgBalanceAccount;
			}
			
		public void setAvgBalanceAccount(Double avgBalanceAccount)
			{
				this.avgBalanceAccount = avgBalanceAccount;
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
			
		@Column(name = "LivingCostAmount", precision = 53, scale = 0)
		public Double getLivingCostAmount()
			{
				return this.livingCostAmount;
			}
			
		public void setLivingCostAmount(Double livingCostAmount)
			{
				this.livingCostAmount = livingCostAmount;
			}
			
		@Column(name = "OtherLoanInstallment", precision = 53, scale = 0)
		public Double getOtherLoanInstallment()
			{
				return this.otherLoanInstallment;
			}
			
		public void setOtherLoanInstallment(Double otherLoanInstallment)
			{
				this.otherLoanInstallment = otherLoanInstallment;
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
