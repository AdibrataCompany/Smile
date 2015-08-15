
package com.adibrata.smartdealer.model;
// Generated Aug 15, 2015 10:59:05 PM by Hibernate Tools 4.3.1

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
 * Currency generated by hbm2java
 */
@Entity
@Table(name = "Currency", catalog = "SmartDealer")
public class Currency implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private String code;
		private String description;
		private Double rounded;
		private String isActive;
		private String sandiBi;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<Agrmnt> agrmnts = new HashSet<Agrmnt>(0);
		private Set<BankAccount> bankAccounts = new HashSet<BankAccount>(0);
		private Set<CashBankHdr> cashBankHdrs = new HashSet<CashBankHdr>(0);
		private Set<DailyAraging> dailyAragings = new HashSet<DailyAraging>(0);
		private Set<InsCompanyOfficeFee> insCompanyOfficeFees = new HashSet<InsCompanyOfficeFee>(0);
		private Set<CashierHistory> cashierHistories = new HashSet<CashierHistory>(0);
		
		public Currency()
			{
			}
			
		public Currency(long id, String sandiBi)
			{
				this.id = id;
				this.sandiBi = sandiBi;
			}
			
		public Currency(long id, Partner partner, String code, String description, Double rounded, String isActive, String sandiBi, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<Agrmnt> agrmnts, Set<BankAccount> bankAccounts,
		        Set<CashBankHdr> cashBankHdrs, Set<DailyAraging> dailyAragings, Set<InsCompanyOfficeFee> insCompanyOfficeFees, Set<CashierHistory> cashierHistories)
			{
				this.id = id;
				this.partner = partner;
				this.code = code;
				this.description = description;
				this.rounded = rounded;
				this.isActive = isActive;
				this.sandiBi = sandiBi;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.agrmnts = agrmnts;
				this.bankAccounts = bankAccounts;
				this.cashBankHdrs = cashBankHdrs;
				this.dailyAragings = dailyAragings;
				this.insCompanyOfficeFees = insCompanyOfficeFees;
				this.cashierHistories = cashierHistories;
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
		@JoinColumn(name = "PartnerCode")
		public Partner getPartner()
			{
				return this.partner;
			}
			
		public void setPartner(Partner partner)
			{
				this.partner = partner;
			}
			
		@Column(name = "Code", length = 10)
		public String getCode()
			{
				return this.code;
			}
			
		public void setCode(String code)
			{
				this.code = code;
			}
			
		@Column(name = "Description", length = 20)
		public String getDescription()
			{
				return this.description;
			}
			
		public void setDescription(String description)
			{
				this.description = description;
			}
			
		@Column(name = "Rounded", precision = 53, scale = 0)
		public Double getRounded()
			{
				return this.rounded;
			}
			
		public void setRounded(Double rounded)
			{
				this.rounded = rounded;
			}
			
		@Column(name = "IsActive", length = 1)
		public String getIsActive()
			{
				return this.isActive;
			}
			
		public void setIsActive(String isActive)
			{
				this.isActive = isActive;
			}
			
		@Column(name = "SandiBI", nullable = false, length = 20)
		public String getSandiBi()
			{
				return this.sandiBi;
			}
			
		public void setSandiBi(String sandiBi)
			{
				this.sandiBi = sandiBi;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "currency")
		public Set<Agrmnt> getAgrmnts()
			{
				return this.agrmnts;
			}
			
		public void setAgrmnts(Set<Agrmnt> agrmnts)
			{
				this.agrmnts = agrmnts;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "currency")
		public Set<BankAccount> getBankAccounts()
			{
				return this.bankAccounts;
			}
			
		public void setBankAccounts(Set<BankAccount> bankAccounts)
			{
				this.bankAccounts = bankAccounts;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "currency")
		public Set<CashBankHdr> getCashBankHdrs()
			{
				return this.cashBankHdrs;
			}
			
		public void setCashBankHdrs(Set<CashBankHdr> cashBankHdrs)
			{
				this.cashBankHdrs = cashBankHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "currency")
		public Set<DailyAraging> getDailyAragings()
			{
				return this.dailyAragings;
			}
			
		public void setDailyAragings(Set<DailyAraging> dailyAragings)
			{
				this.dailyAragings = dailyAragings;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "currency")
		public Set<InsCompanyOfficeFee> getInsCompanyOfficeFees()
			{
				return this.insCompanyOfficeFees;
			}
			
		public void setInsCompanyOfficeFees(Set<InsCompanyOfficeFee> insCompanyOfficeFees)
			{
				this.insCompanyOfficeFees = insCompanyOfficeFees;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "currency")
		public Set<CashierHistory> getCashierHistories()
			{
				return this.cashierHistories;
			}
			
		public void setCashierHistories(Set<CashierHistory> cashierHistories)
			{
				this.cashierHistories = cashierHistories;
			}
			
	}
