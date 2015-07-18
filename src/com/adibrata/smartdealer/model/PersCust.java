package com.adibrata.smartdealer.model;
// Generated Jul 18, 2015 2:53:38 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PersCust generated by hbm2java
 */
@Entity
@Table(name = "PersCust", catalog = "SmartDealer")
public class PersCust implements java.io.Serializable
	{
		
		private long id;
		private Customer customer;
		private String personalCustomerType;
		private String idtype;
		private Date idexpDate;
		private String idnumber;
		private String idnumberChecking;
		private Date idtypeIssuedDate;
		private String gender;
		private String birthPlace;
		private Date birthDate;
		private String mobilePhone;
		private String email;
		private String religion;
		private String maritalStatus;
		private Short numOfDependence;
		private String personalNpwp;
		private String noKk;
		private String education;
		private String professionId;
		private String nationality;
		private String wnacountry;
		private String homeStatus;
		private Date rentFinishDate;
		private String homeLocation;
		private double homePrice;
		private Short staySinceYear;
		private Short staySinceMonth;
		private short numOfAssetOwned;
		private Short employmentSinceYear;
		private Double monthlyFixedIncome;
		private Double monthlyVariableIncome;
		private String otherBusinessName;
		private String otherBusinessType;
		private String otherBusinessIndustryTypeId;
		private String otherBusinessJobTitle;
		private Short otherBusinessSinceYear;
		private Double fixedIncome;
		private Double variableIncome;
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
		private Double creditCardId;
		private String creditCardType;
		private Short numOfCreditCard;
		private String bankId;
		private String bankBranch;
		private String accountNo;
		private String accountName;
		private String reference;
		private short isApplyCarLoanBefore;
		private String applyCarLoanCompanyName;
		private String activeCustomer;
		private String notes;
		private Short isCorporateCreditLine;
		private Double plafondAmount;
		private String biologicalMothersName;
		private String customerGroup;
		private Short mainBusinessSinceYear;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public PersCust()
			{
			}
		
		public PersCust(long id, String personalCustomerType, String idtype,
		        String idnumber, String idnumberChecking, String gender,
		        String birthPlace, String religion, String maritalStatus,
		        String education, String professionId, String nationality,
		        String homeStatus, String homeLocation, double homePrice,
		        short numOfAssetOwned, short isApplyCarLoanBefore,
		        String activeCustomer, String customerGroup)
			{
				this.id = id;
				this.personalCustomerType = personalCustomerType;
				this.idtype = idtype;
				this.idnumber = idnumber;
				this.idnumberChecking = idnumberChecking;
				this.gender = gender;
				this.birthPlace = birthPlace;
				this.religion = religion;
				this.maritalStatus = maritalStatus;
				this.education = education;
				this.professionId = professionId;
				this.nationality = nationality;
				this.homeStatus = homeStatus;
				this.homeLocation = homeLocation;
				this.homePrice = homePrice;
				this.numOfAssetOwned = numOfAssetOwned;
				this.isApplyCarLoanBefore = isApplyCarLoanBefore;
				this.activeCustomer = activeCustomer;
				this.customerGroup = customerGroup;
			}
		public PersCust(long id, Customer customer,
		        String personalCustomerType, String idtype, Date idexpDate,
		        String idnumber, String idnumberChecking,
		        Date idtypeIssuedDate, String gender, String birthPlace,
		        Date birthDate, String mobilePhone, String email,
		        String religion, String maritalStatus, Short numOfDependence,
		        String personalNpwp, String noKk, String education,
		        String professionId, String nationality, String wnacountry,
		        String homeStatus, Date rentFinishDate, String homeLocation,
		        double homePrice, Short staySinceYear, Short staySinceMonth,
		        short numOfAssetOwned, Short employmentSinceYear,
		        Double monthlyFixedIncome, Double monthlyVariableIncome,
		        String otherBusinessName, String otherBusinessType,
		        String otherBusinessIndustryTypeId,
		        String otherBusinessJobTitle, Short otherBusinessSinceYear,
		        Double fixedIncome, Double variableIncome, Double spouseIncome,
		        Double avgBalanceAccount, String bankAccountType,
		        Double averageDebitTransaction,
		        Double averageCreditTransaction, Double averageBalance,
		        Double deposito, Double livingCostAmount,
		        Double otherLoanInstallment, String additionalCollateralType,
		        Double additionalCollateralAmount, Double creditCardId,
		        String creditCardType, Short numOfCreditCard, String bankId,
		        String bankBranch, String accountNo, String accountName,
		        String reference, short isApplyCarLoanBefore,
		        String applyCarLoanCompanyName, String activeCustomer,
		        String notes, Short isCorporateCreditLine,
		        Double plafondAmount, String biologicalMothersName,
		        String customerGroup, Short mainBusinessSinceYear,
		        String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.customer = customer;
				this.personalCustomerType = personalCustomerType;
				this.idtype = idtype;
				this.idexpDate = idexpDate;
				this.idnumber = idnumber;
				this.idnumberChecking = idnumberChecking;
				this.idtypeIssuedDate = idtypeIssuedDate;
				this.gender = gender;
				this.birthPlace = birthPlace;
				this.birthDate = birthDate;
				this.mobilePhone = mobilePhone;
				this.email = email;
				this.religion = religion;
				this.maritalStatus = maritalStatus;
				this.numOfDependence = numOfDependence;
				this.personalNpwp = personalNpwp;
				this.noKk = noKk;
				this.education = education;
				this.professionId = professionId;
				this.nationality = nationality;
				this.wnacountry = wnacountry;
				this.homeStatus = homeStatus;
				this.rentFinishDate = rentFinishDate;
				this.homeLocation = homeLocation;
				this.homePrice = homePrice;
				this.staySinceYear = staySinceYear;
				this.staySinceMonth = staySinceMonth;
				this.numOfAssetOwned = numOfAssetOwned;
				this.employmentSinceYear = employmentSinceYear;
				this.monthlyFixedIncome = monthlyFixedIncome;
				this.monthlyVariableIncome = monthlyVariableIncome;
				this.otherBusinessName = otherBusinessName;
				this.otherBusinessType = otherBusinessType;
				this.otherBusinessIndustryTypeId = otherBusinessIndustryTypeId;
				this.otherBusinessJobTitle = otherBusinessJobTitle;
				this.otherBusinessSinceYear = otherBusinessSinceYear;
				this.fixedIncome = fixedIncome;
				this.variableIncome = variableIncome;
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
				this.creditCardId = creditCardId;
				this.creditCardType = creditCardType;
				this.numOfCreditCard = numOfCreditCard;
				this.bankId = bankId;
				this.bankBranch = bankBranch;
				this.accountNo = accountNo;
				this.accountName = accountName;
				this.reference = reference;
				this.isApplyCarLoanBefore = isApplyCarLoanBefore;
				this.applyCarLoanCompanyName = applyCarLoanCompanyName;
				this.activeCustomer = activeCustomer;
				this.notes = notes;
				this.isCorporateCreditLine = isCorporateCreditLine;
				this.plafondAmount = plafondAmount;
				this.biologicalMothersName = biologicalMothersName;
				this.customerGroup = customerGroup;
				this.mainBusinessSinceYear = mainBusinessSinceYear;
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
		
		@Column(name = "PersonalCustomerType", nullable = false, length = 10)
		public String getPersonalCustomerType()
			{
				return this.personalCustomerType;
			}
		
		public void setPersonalCustomerType(String personalCustomerType)
			{
				this.personalCustomerType = personalCustomerType;
			}
		
		@Column(name = "IDType", nullable = false, length = 10)
		public String getIdtype()
			{
				return this.idtype;
			}
		
		public void setIdtype(String idtype)
			{
				this.idtype = idtype;
			}
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "IDExpDate", length = 23)
		public Date getIdexpDate()
			{
				return this.idexpDate;
			}
		
		public void setIdexpDate(Date idexpDate)
			{
				this.idexpDate = idexpDate;
			}
		
		@Column(name = "IDNumber", nullable = false, length = 40)
		public String getIdnumber()
			{
				return this.idnumber;
			}
		
		public void setIdnumber(String idnumber)
			{
				this.idnumber = idnumber;
			}
		
		@Column(name = "IDNumberChecking", nullable = false, length = 40)
		public String getIdnumberChecking()
			{
				return this.idnumberChecking;
			}
		
		public void setIdnumberChecking(String idnumberChecking)
			{
				this.idnumberChecking = idnumberChecking;
			}
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "IDTypeIssuedDate", length = 23)
		public Date getIdtypeIssuedDate()
			{
				return this.idtypeIssuedDate;
			}
		
		public void setIdtypeIssuedDate(Date idtypeIssuedDate)
			{
				this.idtypeIssuedDate = idtypeIssuedDate;
			}
		
		@Column(name = "Gender", nullable = false, length = 10)
		public String getGender()
			{
				return this.gender;
			}
		
		public void setGender(String gender)
			{
				this.gender = gender;
			}
		
		@Column(name = "BirthPlace", nullable = false, length = 20)
		public String getBirthPlace()
			{
				return this.birthPlace;
			}
		
		public void setBirthPlace(String birthPlace)
			{
				this.birthPlace = birthPlace;
			}
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "BirthDate", length = 23)
		public Date getBirthDate()
			{
				return this.birthDate;
			}
		
		public void setBirthDate(Date birthDate)
			{
				this.birthDate = birthDate;
			}
		
		@Column(name = "MobilePhone", length = 20)
		public String getMobilePhone()
			{
				return this.mobilePhone;
			}
		
		public void setMobilePhone(String mobilePhone)
			{
				this.mobilePhone = mobilePhone;
			}
		
		@Column(name = "EMail", length = 100)
		public String getEmail()
			{
				return this.email;
			}
		
		public void setEmail(String email)
			{
				this.email = email;
			}
		
		@Column(name = "Religion", nullable = false, length = 10)
		public String getReligion()
			{
				return this.religion;
			}
		
		public void setReligion(String religion)
			{
				this.religion = religion;
			}
		
		@Column(name = "MaritalStatus", nullable = false, length = 10)
		public String getMaritalStatus()
			{
				return this.maritalStatus;
			}
		
		public void setMaritalStatus(String maritalStatus)
			{
				this.maritalStatus = maritalStatus;
			}
		
		@Column(name = "NumOfDependence")
		public Short getNumOfDependence()
			{
				return this.numOfDependence;
			}
		
		public void setNumOfDependence(Short numOfDependence)
			{
				this.numOfDependence = numOfDependence;
			}
		
		@Column(name = "PersonalNPWP", length = 25)
		public String getPersonalNpwp()
			{
				return this.personalNpwp;
			}
		
		public void setPersonalNpwp(String personalNpwp)
			{
				this.personalNpwp = personalNpwp;
			}
		
		@Column(name = "NoKK", length = 20)
		public String getNoKk()
			{
				return this.noKk;
			}
		
		public void setNoKk(String noKk)
			{
				this.noKk = noKk;
			}
		
		@Column(name = "Education", nullable = false, length = 10)
		public String getEducation()
			{
				return this.education;
			}
		
		public void setEducation(String education)
			{
				this.education = education;
			}
		
		@Column(name = "ProfessionID", nullable = false, length = 10)
		public String getProfessionId()
			{
				return this.professionId;
			}
		
		public void setProfessionId(String professionId)
			{
				this.professionId = professionId;
			}
		
		@Column(name = "Nationality", nullable = false, length = 3)
		public String getNationality()
			{
				return this.nationality;
			}
		
		public void setNationality(String nationality)
			{
				this.nationality = nationality;
			}
		
		@Column(name = "WNACountry", length = 50)
		public String getWnacountry()
			{
				return this.wnacountry;
			}
		
		public void setWnacountry(String wnacountry)
			{
				this.wnacountry = wnacountry;
			}
		
		@Column(name = "HomeStatus", nullable = false, length = 10)
		public String getHomeStatus()
			{
				return this.homeStatus;
			}
		
		public void setHomeStatus(String homeStatus)
			{
				this.homeStatus = homeStatus;
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
		
		@Column(name = "HomeLocation", nullable = false, length = 10)
		public String getHomeLocation()
			{
				return this.homeLocation;
			}
		
		public void setHomeLocation(String homeLocation)
			{
				this.homeLocation = homeLocation;
			}
		
		@Column(name = "HomePrice", nullable = false, precision = 53, scale = 0)
		public double getHomePrice()
			{
				return this.homePrice;
			}
		
		public void setHomePrice(double homePrice)
			{
				this.homePrice = homePrice;
			}
		
		@Column(name = "StaySinceYear")
		public Short getStaySinceYear()
			{
				return this.staySinceYear;
			}
		
		public void setStaySinceYear(Short staySinceYear)
			{
				this.staySinceYear = staySinceYear;
			}
		
		@Column(name = "StaySinceMonth")
		public Short getStaySinceMonth()
			{
				return this.staySinceMonth;
			}
		
		public void setStaySinceMonth(Short staySinceMonth)
			{
				this.staySinceMonth = staySinceMonth;
			}
		
		@Column(name = "NumOfAssetOwned", nullable = false)
		public short getNumOfAssetOwned()
			{
				return this.numOfAssetOwned;
			}
		
		public void setNumOfAssetOwned(short numOfAssetOwned)
			{
				this.numOfAssetOwned = numOfAssetOwned;
			}
		
		@Column(name = "EmploymentSinceYear")
		public Short getEmploymentSinceYear()
			{
				return this.employmentSinceYear;
			}
		
		public void setEmploymentSinceYear(Short employmentSinceYear)
			{
				this.employmentSinceYear = employmentSinceYear;
			}
		
		@Column(name = "MonthlyFixedIncome", precision = 53, scale = 0)
		public Double getMonthlyFixedIncome()
			{
				return this.monthlyFixedIncome;
			}
		
		public void setMonthlyFixedIncome(Double monthlyFixedIncome)
			{
				this.monthlyFixedIncome = monthlyFixedIncome;
			}
		
		@Column(name = "MonthlyVariableIncome", precision = 53, scale = 0)
		public Double getMonthlyVariableIncome()
			{
				return this.monthlyVariableIncome;
			}
		
		public void setMonthlyVariableIncome(Double monthlyVariableIncome)
			{
				this.monthlyVariableIncome = monthlyVariableIncome;
			}
		
		@Column(name = "OtherBusinessName", length = 50)
		public String getOtherBusinessName()
			{
				return this.otherBusinessName;
			}
		
		public void setOtherBusinessName(String otherBusinessName)
			{
				this.otherBusinessName = otherBusinessName;
			}
		
		@Column(name = "OtherBusinessType", length = 50)
		public String getOtherBusinessType()
			{
				return this.otherBusinessType;
			}
		
		public void setOtherBusinessType(String otherBusinessType)
			{
				this.otherBusinessType = otherBusinessType;
			}
		
		@Column(name = "OtherBusinessIndustryTypeID", length = 10)
		public String getOtherBusinessIndustryTypeId()
			{
				return this.otherBusinessIndustryTypeId;
			}
		
		public void setOtherBusinessIndustryTypeId(
		        String otherBusinessIndustryTypeId)
			{
				this.otherBusinessIndustryTypeId = otherBusinessIndustryTypeId;
			}
		
		@Column(name = "OtherBusinessJobTitle", length = 50)
		public String getOtherBusinessJobTitle()
			{
				return this.otherBusinessJobTitle;
			}
		
		public void setOtherBusinessJobTitle(String otherBusinessJobTitle)
			{
				this.otherBusinessJobTitle = otherBusinessJobTitle;
			}
		
		@Column(name = "OtherBusinessSinceYear")
		public Short getOtherBusinessSinceYear()
			{
				return this.otherBusinessSinceYear;
			}
		
		public void setOtherBusinessSinceYear(Short otherBusinessSinceYear)
			{
				this.otherBusinessSinceYear = otherBusinessSinceYear;
			}
		
		@Column(name = "FixedIncome", precision = 53, scale = 0)
		public Double getFixedIncome()
			{
				return this.fixedIncome;
			}
		
		public void setFixedIncome(Double fixedIncome)
			{
				this.fixedIncome = fixedIncome;
			}
		
		@Column(name = "VariableIncome", precision = 53, scale = 0)
		public Double getVariableIncome()
			{
				return this.variableIncome;
			}
		
		public void setVariableIncome(Double variableIncome)
			{
				this.variableIncome = variableIncome;
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
		
		public void setAdditionalCollateralAmount(
		        Double additionalCollateralAmount)
			{
				this.additionalCollateralAmount = additionalCollateralAmount;
			}
		
		@Column(name = "CreditCardID", precision = 53, scale = 0)
		public Double getCreditCardId()
			{
				return this.creditCardId;
			}
		
		public void setCreditCardId(Double creditCardId)
			{
				this.creditCardId = creditCardId;
			}
		
		@Column(name = "CreditCardType", length = 1)
		public String getCreditCardType()
			{
				return this.creditCardType;
			}
		
		public void setCreditCardType(String creditCardType)
			{
				this.creditCardType = creditCardType;
			}
		
		@Column(name = "NumOfCreditCard")
		public Short getNumOfCreditCard()
			{
				return this.numOfCreditCard;
			}
		
		public void setNumOfCreditCard(Short numOfCreditCard)
			{
				this.numOfCreditCard = numOfCreditCard;
			}
		
		@Column(name = "BankID", length = 5)
		public String getBankId()
			{
				return this.bankId;
			}
		
		public void setBankId(String bankId)
			{
				this.bankId = bankId;
			}
		
		@Column(name = "BankBranch", length = 50)
		public String getBankBranch()
			{
				return this.bankBranch;
			}
		
		public void setBankBranch(String bankBranch)
			{
				this.bankBranch = bankBranch;
			}
		
		@Column(name = "AccountNo", length = 20)
		public String getAccountNo()
			{
				return this.accountNo;
			}
		
		public void setAccountNo(String accountNo)
			{
				this.accountNo = accountNo;
			}
		
		@Column(name = "AccountName", length = 50)
		public String getAccountName()
			{
				return this.accountName;
			}
		
		public void setAccountName(String accountName)
			{
				this.accountName = accountName;
			}
		
		@Column(name = "Reference", length = 10)
		public String getReference()
			{
				return this.reference;
			}
		
		public void setReference(String reference)
			{
				this.reference = reference;
			}
		
		@Column(name = "IsApplyCarLoanBefore", nullable = false)
		public short getIsApplyCarLoanBefore()
			{
				return this.isApplyCarLoanBefore;
			}
		
		public void setIsApplyCarLoanBefore(short isApplyCarLoanBefore)
			{
				this.isApplyCarLoanBefore = isApplyCarLoanBefore;
			}
		
		@Column(name = "ApplyCarLoanCompanyName", length = 50)
		public String getApplyCarLoanCompanyName()
			{
				return this.applyCarLoanCompanyName;
			}
		
		public void setApplyCarLoanCompanyName(String applyCarLoanCompanyName)
			{
				this.applyCarLoanCompanyName = applyCarLoanCompanyName;
			}
		
		@Column(name = "ActiveCustomer", nullable = false, length = 1)
		public String getActiveCustomer()
			{
				return this.activeCustomer;
			}
		
		public void setActiveCustomer(String activeCustomer)
			{
				this.activeCustomer = activeCustomer;
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
		
		@Column(name = "IsCorporateCreditLine")
		public Short getIsCorporateCreditLine()
			{
				return this.isCorporateCreditLine;
			}
		
		public void setIsCorporateCreditLine(Short isCorporateCreditLine)
			{
				this.isCorporateCreditLine = isCorporateCreditLine;
			}
		
		@Column(name = "PlafondAmount", precision = 53, scale = 0)
		public Double getPlafondAmount()
			{
				return this.plafondAmount;
			}
		
		public void setPlafondAmount(Double plafondAmount)
			{
				this.plafondAmount = plafondAmount;
			}
		
		@Column(name = "BiologicalMothersName", length = 50)
		public String getBiologicalMothersName()
			{
				return this.biologicalMothersName;
			}
		
		public void setBiologicalMothersName(String biologicalMothersName)
			{
				this.biologicalMothersName = biologicalMothersName;
			}
		
		@Column(name = "CustomerGroup", nullable = false, length = 10)
		public String getCustomerGroup()
			{
				return this.customerGroup;
			}
		
		public void setCustomerGroup(String customerGroup)
			{
				this.customerGroup = customerGroup;
			}
		
		@Column(name = "MainBusinessSinceYear")
		public Short getMainBusinessSinceYear()
			{
				return this.mainBusinessSinceYear;
			}
		
		public void setMainBusinessSinceYear(Short mainBusinessSinceYear)
			{
				this.mainBusinessSinceYear = mainBusinessSinceYear;
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
