
package com.adibrata.smartdealer.model;
// Generated Sep 27, 2015 10:48:45 AM by Hibernate Tools 4.3.1.Final

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
 * PettyCashHdr generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "PettyCashHdr", catalog = "SmartDealer")
public class PettyCashHdr implements java.io.Serializable
	{
		
		private long id;
		private BankAccount bankAccount;
		private Employee employee;
		private Office office;
		private Partner partner;
		private String pettyCashCode;
		private Date postingDate;
		private Date valueDate;
		private Double pcamount;
		private Long currencyId;
		private Double currencyRate;
		private Long cashierHistoryId;
		private String notes;
		private Long jobId;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<PettyCashDtl> pettyCashDtls = new HashSet<PettyCashDtl>(0);
		
		public PettyCashHdr()
			{
			}
			
		public PettyCashHdr(long id)
			{
				this.id = id;
			}
			
		public PettyCashHdr(long id, BankAccount bankAccount, Employee employee, Office office, Partner partner, String pettyCashCode, Date postingDate, Date valueDate, Double pcamount, Long currencyId, Double currencyRate, Long cashierHistoryId,
		        String notes, Long jobId, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<PettyCashDtl> pettyCashDtls)
			{
				this.id = id;
				this.bankAccount = bankAccount;
				this.employee = employee;
				this.office = office;
				this.partner = partner;
				this.pettyCashCode = pettyCashCode;
				this.postingDate = postingDate;
				this.valueDate = valueDate;
				this.pcamount = pcamount;
				this.currencyId = currencyId;
				this.currencyRate = currencyRate;
				this.cashierHistoryId = cashierHistoryId;
				this.notes = notes;
				this.jobId = jobId;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.pettyCashDtls = pettyCashDtls;
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
		@JoinColumn(name = "EmployeeID")
		public Employee getEmployee()
			{
				return this.employee;
			}
			
		public void setEmployee(Employee employee)
			{
				this.employee = employee;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "OfficeId")
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
			
		@Column(name = "PettyCashCode", length = 50)
		public String getPettyCashCode()
			{
				return this.pettyCashCode;
			}
			
		public void setPettyCashCode(String pettyCashCode)
			{
				this.pettyCashCode = pettyCashCode;
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
			
		@Column(name = "PCAmount", precision = 53, scale = 0)
		public Double getPcamount()
			{
				return this.pcamount;
			}
			
		public void setPcamount(Double pcamount)
			{
				this.pcamount = pcamount;
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
			
		@Column(name = "CashierHistoryId")
		public Long getCashierHistoryId()
			{
				return this.cashierHistoryId;
			}
			
		public void setCashierHistoryId(Long cashierHistoryId)
			{
				this.cashierHistoryId = cashierHistoryId;
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
			
		@Column(name = "JobId")
		public Long getJobId()
			{
				return this.jobId;
			}
			
		public void setJobId(Long jobId)
			{
				this.jobId = jobId;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "pettyCashHdr")
		public Set<PettyCashDtl> getPettyCashDtls()
			{
				return this.pettyCashDtls;
			}
			
		public void setPettyCashDtls(Set<PettyCashDtl> pettyCashDtls)
			{
				this.pettyCashDtls = pettyCashDtls;
			}
			
	}
