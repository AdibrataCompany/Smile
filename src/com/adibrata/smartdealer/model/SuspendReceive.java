
package com.adibrata.smartdealer.model;
// Generated Sep 3, 2015 3:54:52 PM by Hibernate Tools 4.3.1

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
 * SuspendReceive generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "SuspendReceive", catalog = "SmartDealer")
public class SuspendReceive implements java.io.Serializable
	{
		
		private long id;
		private Office office;
		private Partner partner;
		private String suspendCode;
		private Date valueDate;
		private Date postingDate;
		private Double amount;
		private Long currencyId;
		private Double currencyRate;
		private Long bankAccountId;
		private Long cashierHistoryId;
		private Long jobId;
		private String status;
		private String notes;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<SuspendReverse> suspendReverses = new HashSet<SuspendReverse>(0);
		private Set<SuspendAllocation> suspendAllocations = new HashSet<SuspendAllocation>(0);
		
		public SuspendReceive()
			{
			}
			
		public SuspendReceive(long id)
			{
				this.id = id;
			}
			
		public SuspendReceive(long id, Office office, Partner partner, String suspendCode, Date valueDate, Date postingDate, Double amount, Long currencyId, Double currencyRate, Long bankAccountId, Long cashierHistoryId, Long jobId, String status,
		        String notes, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<SuspendReverse> suspendReverses, Set<SuspendAllocation> suspendAllocations)
			{
				this.id = id;
				this.office = office;
				this.partner = partner;
				this.suspendCode = suspendCode;
				this.valueDate = valueDate;
				this.postingDate = postingDate;
				this.amount = amount;
				this.currencyId = currencyId;
				this.currencyRate = currencyRate;
				this.bankAccountId = bankAccountId;
				this.cashierHistoryId = cashierHistoryId;
				this.jobId = jobId;
				this.status = status;
				this.notes = notes;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.suspendReverses = suspendReverses;
				this.suspendAllocations = suspendAllocations;
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
			
		@Column(name = "SuspendCode", length = 50)
		public String getSuspendCode()
			{
				return this.suspendCode;
			}
			
		public void setSuspendCode(String suspendCode)
			{
				this.suspendCode = suspendCode;
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
			
		@Column(name = "Amount", precision = 53, scale = 0)
		public Double getAmount()
			{
				return this.amount;
			}
			
		public void setAmount(Double amount)
			{
				this.amount = amount;
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
			
		@Column(name = "BankAccountId")
		public Long getBankAccountId()
			{
				return this.bankAccountId;
			}
			
		public void setBankAccountId(Long bankAccountId)
			{
				this.bankAccountId = bankAccountId;
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
			
		@Column(name = "JobId")
		public Long getJobId()
			{
				return this.jobId;
			}
			
		public void setJobId(Long jobId)
			{
				this.jobId = jobId;
			}
			
		@Column(name = "Status", length = 2)
		public String getStatus()
			{
				return this.status;
			}
			
		public void setStatus(String status)
			{
				this.status = status;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "suspendReceive")
		public Set<SuspendReverse> getSuspendReverses()
			{
				return this.suspendReverses;
			}
			
		public void setSuspendReverses(Set<SuspendReverse> suspendReverses)
			{
				this.suspendReverses = suspendReverses;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "suspendReceive")
		public Set<SuspendAllocation> getSuspendAllocations()
			{
				return this.suspendAllocations;
			}
			
		public void setSuspendAllocations(Set<SuspendAllocation> suspendAllocations)
			{
				this.suspendAllocations = suspendAllocations;
			}
			
	}
