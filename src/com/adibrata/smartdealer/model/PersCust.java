
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
 * PersCust generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
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
		private Double homePrice;
		private Short staySinceYear;
		private Short staySinceMonth;
		private Short numOfAssetOwned;
		private String reference;
		private Short isApplyCarLoanBefore;
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
			
		public PersCust(long id)
			{
				this.id = id;
			}
			
		public PersCust(long id, Customer customer, String personalCustomerType, String idtype, Date idexpDate, String idnumber, String idnumberChecking, Date idtypeIssuedDate, String gender, String birthPlace, Date birthDate, String mobilePhone,
		        String email, String religion, String maritalStatus, Short numOfDependence, String personalNpwp, String noKk, String education, String professionId, String nationality, String wnacountry, String homeStatus, Date rentFinishDate,
		        String homeLocation, Double homePrice, Short staySinceYear, Short staySinceMonth, Short numOfAssetOwned, String reference, Short isApplyCarLoanBefore, String applyCarLoanCompanyName, String activeCustomer, String notes,
		        Short isCorporateCreditLine, Double plafondAmount, String biologicalMothersName, String customerGroup, Short mainBusinessSinceYear, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
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
			
		@Column(name = "PersonalCustomerType", length = 10)
		public String getPersonalCustomerType()
			{
				return this.personalCustomerType;
			}
			
		public void setPersonalCustomerType(String personalCustomerType)
			{
				this.personalCustomerType = personalCustomerType;
			}
			
		@Column(name = "IDType", length = 10)
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
			
		@Column(name = "IDNumber", length = 40)
		public String getIdnumber()
			{
				return this.idnumber;
			}
			
		public void setIdnumber(String idnumber)
			{
				this.idnumber = idnumber;
			}
			
		@Column(name = "IDNumberChecking", length = 40)
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
			
		@Column(name = "Gender", length = 10)
		public String getGender()
			{
				return this.gender;
			}
			
		public void setGender(String gender)
			{
				this.gender = gender;
			}
			
		@Column(name = "BirthPlace", length = 20)
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
			
		@Column(name = "Religion", length = 10)
		public String getReligion()
			{
				return this.religion;
			}
			
		public void setReligion(String religion)
			{
				this.religion = religion;
			}
			
		@Column(name = "MaritalStatus", length = 10)
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
			
		@Column(name = "Education", length = 10)
		public String getEducation()
			{
				return this.education;
			}
			
		public void setEducation(String education)
			{
				this.education = education;
			}
			
		@Column(name = "ProfessionID", length = 10)
		public String getProfessionId()
			{
				return this.professionId;
			}
			
		public void setProfessionId(String professionId)
			{
				this.professionId = professionId;
			}
			
		@Column(name = "Nationality", length = 3)
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
			
		@Column(name = "HomeStatus", length = 10)
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
			
		@Column(name = "HomeLocation", length = 10)
		public String getHomeLocation()
			{
				return this.homeLocation;
			}
			
		public void setHomeLocation(String homeLocation)
			{
				this.homeLocation = homeLocation;
			}
			
		@Column(name = "HomePrice", precision = 53, scale = 0)
		public Double getHomePrice()
			{
				return this.homePrice;
			}
			
		public void setHomePrice(Double homePrice)
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
			
		@Column(name = "NumOfAssetOwned")
		public Short getNumOfAssetOwned()
			{
				return this.numOfAssetOwned;
			}
			
		public void setNumOfAssetOwned(Short numOfAssetOwned)
			{
				this.numOfAssetOwned = numOfAssetOwned;
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
			
		@Column(name = "IsApplyCarLoanBefore")
		public Short getIsApplyCarLoanBefore()
			{
				return this.isApplyCarLoanBefore;
			}
			
		public void setIsApplyCarLoanBefore(Short isApplyCarLoanBefore)
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
			
		@Column(name = "ActiveCustomer", length = 1)
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
			
		@Column(name = "CustomerGroup", length = 10)
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
