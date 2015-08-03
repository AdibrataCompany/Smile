
package com.adibrata.smartdealer.model;
// Generated Aug 3, 2015 11:53:04 AM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AdvanceCash generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AdvanceCash", catalog = "SmartDealer")
public class AdvanceCash implements java.io.Serializable
	{
		
		private long id;
		private BankAccount bankAccount;
		private Employee employee;
		private Office office;
		private Partner partner;
		private String advanceCode;
		private Double advanceAmount;
		private Date postingDate;
		private Date valueDate;
		private Long currencyId;
		private Double currencyRate;
		private String notes;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<AdvanceCashReversal> advanceCashReversals = new HashSet<AdvanceCashReversal>(0);
		
		public AdvanceCash()
			{
			}
			
		public AdvanceCash(long id)
			{
				this.id = id;
			}
			
		public AdvanceCash(long id, BankAccount bankAccount, Employee employee, Office office, Partner partner, String advanceCode, Double advanceAmount, Date postingDate, Date valueDate, Long currencyId, Double currencyRate, String notes,
		        Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<AdvanceCashReversal> advanceCashReversals)
			{
				this.id = id;
				this.bankAccount = bankAccount;
				this.employee = employee;
				this.office = office;
				this.partner = partner;
				this.advanceCode = advanceCode;
				this.advanceAmount = advanceAmount;
				this.postingDate = postingDate;
				this.valueDate = valueDate;
				this.currencyId = currencyId;
				this.currencyRate = currencyRate;
				this.notes = notes;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.advanceCashReversals = advanceCashReversals;
			}
			
		@Id @GeneratedValue(strategy=GenerationType.AUTO)
		
		@Column(name = "ID", unique = true, nullable = false)
		public long getId()
			{
				return this.id;
			}
			
		public void setId(long id)
			{
				this.id = id;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "BankAccountId")
		public BankAccount getBankAccount()
			{
				return this.bankAccount;
			}
			
		public void setBankAccount(BankAccount bankAccount)
			{
				this.bankAccount = bankAccount;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "EmployeeId")
		public Employee getEmployee()
			{
				return this.employee;
			}
			
		public void setEmployee(Employee employee)
			{
				this.employee = employee;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "OfficeID")
		public Office getOffice()
			{
				return this.office;
			}
			
		public void setOffice(Office office)
			{
				this.office = office;
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
			
		@Column(name = "AdvanceCode", length = 50)
		public String getAdvanceCode()
			{
				return this.advanceCode;
			}
			
		public void setAdvanceCode(String advanceCode)
			{
				this.advanceCode = advanceCode;
			}
			
		@Column(name = "AdvanceAmount", precision = 53, scale = 0)
		public Double getAdvanceAmount()
			{
				return this.advanceAmount;
			}
			
		public void setAdvanceAmount(Double advanceAmount)
			{
				this.advanceAmount = advanceAmount;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "PostingDate", length = 23)
		public Date getPostingDate()
			{
				return this.postingDate;
			}
			
		public void setPostingDate(Date postingDate)
			{
				this.postingDate = postingDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ValueDate", length = 23)
		public Date getValueDate()
			{
				return this.valueDate;
			}
			
		public void setValueDate(Date valueDate)
			{
				this.valueDate = valueDate;
			}
			
		@Column(name = "CurrencyId")
		public Long getCurrencyId()
			{
				return this.currencyId;
			}
			
		public void setCurrencyId(Long currencyId)
			{
				this.currencyId = currencyId;
			}
			
		@Column(name = "CurrencyRate", precision = 53, scale = 0)
		public Double getCurrencyRate()
			{
				return this.currencyRate;
			}
			
		public void setCurrencyRate(Double currencyRate)
			{
				this.currencyRate = currencyRate;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "advanceCash")
		public Set<AdvanceCashReversal> getAdvanceCashReversals()
			{
				return this.advanceCashReversals;
			}
			
		public void setAdvanceCashReversals(Set<AdvanceCashReversal> advanceCashReversals)
			{
				this.advanceCashReversals = advanceCashReversals;
			}
			
	}
