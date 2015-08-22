
package com.adibrata.smartdealer.model;
// Generated Aug 23, 2015 12:40:11 AM by Hibernate Tools 4.3.1

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
 * AdvanceCashReversal generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AdvanceCashReversal", catalog = "SmartDealer")
public class AdvanceCashReversal implements java.io.Serializable
	{
		
		private static final long serialVersionUID = 1L; private long id;
		private AdvanceCash advanceCash;
		private BankAccount bankAccount;
		private Date postingDate;
		private Date valueDate;
		private Double reverseAmount;
		private Double currencyRate;
		private Long currencyId;
		private Long employeeId;
		private String notes;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public AdvanceCashReversal()
			{
			}
			
		public AdvanceCashReversal(long id)
			{
				this.id = id;
			}
			
		public AdvanceCashReversal(long id, AdvanceCash advanceCash, BankAccount bankAccount, Date postingDate, Date valueDate, Double reverseAmount, Double currencyRate, Long currencyId, Long employeeId, String notes, Date dtmUpd, String usrUpd,
		        Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.advanceCash = advanceCash;
				this.bankAccount = bankAccount;
				this.postingDate = postingDate;
				this.valueDate = valueDate;
				this.reverseAmount = reverseAmount;
				this.currencyRate = currencyRate;
				this.currencyId = currencyId;
				this.employeeId = employeeId;
				this.notes = notes;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
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
		@JoinColumn(name = "AdvanceCashId")
		public AdvanceCash getAdvanceCash()
			{
				return this.advanceCash;
			}
			
		public void setAdvanceCash(AdvanceCash advanceCash)
			{
				this.advanceCash = advanceCash;
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
			
		@Column(name = "ReverseAmount", precision = 53, scale = 0)
		public Double getReverseAmount()
			{
				return this.reverseAmount;
			}
			
		public void setReverseAmount(Double reverseAmount)
			{
				this.reverseAmount = reverseAmount;
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
			
		@Column(name = "CurrencyId")
		public Long getCurrencyId()
			{
				return this.currencyId;
			}
			
		public void setCurrencyId(Long currencyId)
			{
				this.currencyId = currencyId;
			}
			
		@Column(name = "EmployeeId")
		public Long getEmployeeId()
			{
				return this.employeeId;
			}
			
		public void setEmployeeId(Long employeeId)
			{
				this.employeeId = employeeId;
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
			
	}
