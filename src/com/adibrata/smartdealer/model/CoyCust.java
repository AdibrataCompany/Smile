
package com.adibrata.smartdealer.model;
// Generated Aug 12, 2015 1:15:10 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CoyCust generated by hbm2java
 */
@Entity
@Table(name = "CoyCust", catalog = "SmartDealer")
public class CoyCust implements java.io.Serializable
	{
		
		private long id;
		private Customer customer;
		private String npwp;
		private String npwpchecking;
		private String companyType;
		private Short numberOfEmployees;
		private Short yearOfEstablished;
		private String industryTypeId;
		private String pengelolaGedungAreaPhone;
		private String pengelolaGedungPhone;
		private String bankCode;
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
		private String customerGroup;
		private String noDocumentOfEstablished;
		private Date dateDocumentOfEstablished;
		private String notaryPlace;
		private String notaryName;
		private String lastNoDocumentOfEstablished;
		private Date lastDateDocumentOfEstablished;
		private String lastNotaryPlace;
		private String lastNotaryName;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public CoyCust()
			{
			}
			
		public CoyCust(long id, String npwp, String npwpchecking, String companyType, String industryTypeId, short isApplyCarLoanBefore, String activeCustomer, String customerGroup)
			{
				this.id = id;
				this.npwp = npwp;
				this.npwpchecking = npwpchecking;
				this.companyType = companyType;
				this.industryTypeId = industryTypeId;
				this.isApplyCarLoanBefore = isApplyCarLoanBefore;
				this.activeCustomer = activeCustomer;
				this.customerGroup = customerGroup;
			}
			
		public CoyCust(long id, Customer customer, String npwp, String npwpchecking, String companyType, Short numberOfEmployees, Short yearOfEstablished, String industryTypeId, String pengelolaGedungAreaPhone, String pengelolaGedungPhone,
		        String bankCode, String bankBranch, String accountNo, String accountName, String reference, short isApplyCarLoanBefore, String applyCarLoanCompanyName, String activeCustomer, String notes, Short isCorporateCreditLine,
		        Double plafondAmount, String customerGroup, String noDocumentOfEstablished, Date dateDocumentOfEstablished, String notaryPlace, String notaryName, String lastNoDocumentOfEstablished, Date lastDateDocumentOfEstablished,
		        String lastNotaryPlace, String lastNotaryName, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.customer = customer;
				this.npwp = npwp;
				this.npwpchecking = npwpchecking;
				this.companyType = companyType;
				this.numberOfEmployees = numberOfEmployees;
				this.yearOfEstablished = yearOfEstablished;
				this.industryTypeId = industryTypeId;
				this.pengelolaGedungAreaPhone = pengelolaGedungAreaPhone;
				this.pengelolaGedungPhone = pengelolaGedungPhone;
				this.bankCode = bankCode;
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
				this.customerGroup = customerGroup;
				this.noDocumentOfEstablished = noDocumentOfEstablished;
				this.dateDocumentOfEstablished = dateDocumentOfEstablished;
				this.notaryPlace = notaryPlace;
				this.notaryName = notaryName;
				this.lastNoDocumentOfEstablished = lastNoDocumentOfEstablished;
				this.lastDateDocumentOfEstablished = lastDateDocumentOfEstablished;
				this.lastNotaryPlace = lastNotaryPlace;
				this.lastNotaryName = lastNotaryName;
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
			
		@Column(name = "NPWP", nullable = false, length = 25)
		public String getNpwp()
			{
				return this.npwp;
			}
			
		public void setNpwp(String npwp)
			{
				this.npwp = npwp;
			}
			
		@Column(name = "NPWPChecking", nullable = false, length = 25)
		public String getNpwpchecking()
			{
				return this.npwpchecking;
			}
			
		public void setNpwpchecking(String npwpchecking)
			{
				this.npwpchecking = npwpchecking;
			}
			
		@Column(name = "CompanyType", nullable = false, length = 10)
		public String getCompanyType()
			{
				return this.companyType;
			}
			
		public void setCompanyType(String companyType)
			{
				this.companyType = companyType;
			}
			
		@Column(name = "NumberOfEmployees")
		public Short getNumberOfEmployees()
			{
				return this.numberOfEmployees;
			}
			
		public void setNumberOfEmployees(Short numberOfEmployees)
			{
				this.numberOfEmployees = numberOfEmployees;
			}
			
		@Column(name = "YearOfEstablished")
		public Short getYearOfEstablished()
			{
				return this.yearOfEstablished;
			}
			
		public void setYearOfEstablished(Short yearOfEstablished)
			{
				this.yearOfEstablished = yearOfEstablished;
			}
			
		@Column(name = "IndustryTypeID", nullable = false, length = 10)
		public String getIndustryTypeId()
			{
				return this.industryTypeId;
			}
			
		public void setIndustryTypeId(String industryTypeId)
			{
				this.industryTypeId = industryTypeId;
			}
			
		@Column(name = "PengelolaGedungAreaPhone", length = 50)
		public String getPengelolaGedungAreaPhone()
			{
				return this.pengelolaGedungAreaPhone;
			}
			
		public void setPengelolaGedungAreaPhone(String pengelolaGedungAreaPhone)
			{
				this.pengelolaGedungAreaPhone = pengelolaGedungAreaPhone;
			}
			
		@Column(name = "PengelolaGedungPhone", length = 15)
		public String getPengelolaGedungPhone()
			{
				return this.pengelolaGedungPhone;
			}
			
		public void setPengelolaGedungPhone(String pengelolaGedungPhone)
			{
				this.pengelolaGedungPhone = pengelolaGedungPhone;
			}
			
		@Column(name = "BankCode", length = 20)
		public String getBankCode()
			{
				return this.bankCode;
			}
			
		public void setBankCode(String bankCode)
			{
				this.bankCode = bankCode;
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
			
		@Column(name = "AccountNo", length = 50)
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
			
		@Column(name = "CustomerGroup", nullable = false, length = 50)
		public String getCustomerGroup()
			{
				return this.customerGroup;
			}
			
		public void setCustomerGroup(String customerGroup)
			{
				this.customerGroup = customerGroup;
			}
			
		@Column(name = "NoDocumentOfEstablished", length = 50)
		public String getNoDocumentOfEstablished()
			{
				return this.noDocumentOfEstablished;
			}
			
		public void setNoDocumentOfEstablished(String noDocumentOfEstablished)
			{
				this.noDocumentOfEstablished = noDocumentOfEstablished;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DateDocumentOfEstablished", length = 23)
		public Date getDateDocumentOfEstablished()
			{
				return this.dateDocumentOfEstablished;
			}
			
		public void setDateDocumentOfEstablished(Date dateDocumentOfEstablished)
			{
				this.dateDocumentOfEstablished = dateDocumentOfEstablished;
			}
			
		@Column(name = "NotaryPlace", length = 50)
		public String getNotaryPlace()
			{
				return this.notaryPlace;
			}
			
		public void setNotaryPlace(String notaryPlace)
			{
				this.notaryPlace = notaryPlace;
			}
			
		@Column(name = "NotaryName", length = 50)
		public String getNotaryName()
			{
				return this.notaryName;
			}
			
		public void setNotaryName(String notaryName)
			{
				this.notaryName = notaryName;
			}
			
		@Column(name = "LastNoDocumentOfEstablished", length = 50)
		public String getLastNoDocumentOfEstablished()
			{
				return this.lastNoDocumentOfEstablished;
			}
			
		public void setLastNoDocumentOfEstablished(String lastNoDocumentOfEstablished)
			{
				this.lastNoDocumentOfEstablished = lastNoDocumentOfEstablished;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "LastDateDocumentOfEstablished", length = 23)
		public Date getLastDateDocumentOfEstablished()
			{
				return this.lastDateDocumentOfEstablished;
			}
			
		public void setLastDateDocumentOfEstablished(Date lastDateDocumentOfEstablished)
			{
				this.lastDateDocumentOfEstablished = lastDateDocumentOfEstablished;
			}
			
		@Column(name = "LastNotaryPlace", length = 50)
		public String getLastNotaryPlace()
			{
				return this.lastNotaryPlace;
			}
			
		public void setLastNotaryPlace(String lastNotaryPlace)
			{
				this.lastNotaryPlace = lastNotaryPlace;
			}
			
		@Column(name = "LastNotaryName", length = 50)
		public String getLastNotaryName()
			{
				return this.lastNotaryName;
			}
			
		public void setLastNotaryName(String lastNotaryName)
			{
				this.lastNotaryName = lastNotaryName;
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
