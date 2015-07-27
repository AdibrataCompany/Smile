
package com.adibrata.smartdealer.model;
// Generated Jul 27, 2015 2:07:03 PM by Hibernate Tools 4.3.1

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
 * SuspendReverse generated by hbm2java
 */
@Entity
@Table(name = "SuspendReverse", catalog = "SmartDealer")
public class SuspendReverse implements java.io.Serializable
	{
		
		private long id;
		private SuspendReceive suspendReceive;
		private Long jobId;
		private String partnerCode;
		private Long officeId;
		private Date valueDate;
		private Date postingDate;
		private Double amount;
		private Long bankAccountId;
		private Long currencyId;
		private Double currencyRate;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public SuspendReverse()
			{
			}
			
		public SuspendReverse(long id)
			{
				this.id = id;
			}
			
		public SuspendReverse(long id, SuspendReceive suspendReceive, Long jobId, String partnerCode, Long officeId, Date valueDate, Date postingDate, Double amount, Long bankAccountId, Long currencyId, Double currencyRate, Date dtmUpd,
		        String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.suspendReceive = suspendReceive;
				this.jobId = jobId;
				this.partnerCode = partnerCode;
				this.officeId = officeId;
				this.valueDate = valueDate;
				this.postingDate = postingDate;
				this.amount = amount;
				this.bankAccountId = bankAccountId;
				this.currencyId = currencyId;
				this.currencyRate = currencyRate;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
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
		@JoinColumn(name = "SuspendId")
		public SuspendReceive getSuspendReceive()
			{
				return this.suspendReceive;
			}
			
		public void setSuspendReceive(SuspendReceive suspendReceive)
			{
				this.suspendReceive = suspendReceive;
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
			
		@Column(name = "PartnerCode", length = 20)
		public String getPartnerCode()
			{
				return this.partnerCode;
			}
			
		public void setPartnerCode(String partnerCode)
			{
				this.partnerCode = partnerCode;
			}
			
		@Column(name = "OfficeId")
		public Long getOfficeId()
			{
				return this.officeId;
			}
			
		public void setOfficeId(Long officeId)
			{
				this.officeId = officeId;
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
			
		@Column(name = "BankAccountId")
		public Long getBankAccountId()
			{
				return this.bankAccountId;
			}
			
		public void setBankAccountId(Long bankAccountId)
			{
				this.bankAccountId = bankAccountId;
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
