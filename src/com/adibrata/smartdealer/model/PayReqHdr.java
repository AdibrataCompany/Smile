
package com.adibrata.smartdealer.model;
// Generated Aug 12, 2015 1:15:10 PM by Hibernate Tools 4.3.1

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
 * PayReqHdr generated by hbm2java
 */
@Entity
@Table(name = "PayReqHdr", catalog = "SmartDealer")
public class PayReqHdr implements java.io.Serializable
	{
		
		private long id;
		private BankAccount bankAccount;
		private Office office;
		private Partner partner;
		private String payReqNo;
		private Double pettyCashAmount;
		private Date valueDate;
		private Date postingDate;
		private String jobCode;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<PayReqDtl> payReqDtls = new HashSet<PayReqDtl>(0);
		
		public PayReqHdr()
			{
			}
			
		public PayReqHdr(long id)
			{
				this.id = id;
			}
			
		public PayReqHdr(long id, BankAccount bankAccount, Office office, Partner partner, String payReqNo, Double pettyCashAmount, Date valueDate, Date postingDate, String jobCode, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt,
		        Set<PayReqDtl> payReqDtls)
			{
				this.id = id;
				this.bankAccount = bankAccount;
				this.office = office;
				this.partner = partner;
				this.payReqNo = payReqNo;
				this.pettyCashAmount = pettyCashAmount;
				this.valueDate = valueDate;
				this.postingDate = postingDate;
				this.jobCode = jobCode;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.payReqDtls = payReqDtls;
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
		@JoinColumn(name = "BankAccountID")
		public BankAccount getBankAccount()
			{
				return this.bankAccount;
			}
			
		public void setBankAccount(BankAccount bankAccount)
			{
				this.bankAccount = bankAccount;
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
			
		@Column(name = "PayReqNo", length = 50)
		public String getPayReqNo()
			{
				return this.payReqNo;
			}
			
		public void setPayReqNo(String payReqNo)
			{
				this.payReqNo = payReqNo;
			}
			
		@Column(name = "PettyCashAmount", precision = 53, scale = 0)
		public Double getPettyCashAmount()
			{
				return this.pettyCashAmount;
			}
			
		public void setPettyCashAmount(Double pettyCashAmount)
			{
				this.pettyCashAmount = pettyCashAmount;
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
			
		@Column(name = "JobCode", length = 50)
		public String getJobCode()
			{
				return this.jobCode;
			}
			
		public void setJobCode(String jobCode)
			{
				this.jobCode = jobCode;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "payReqHdr")
		public Set<PayReqDtl> getPayReqDtls()
			{
				return this.payReqDtls;
			}
			
		public void setPayReqDtls(Set<PayReqDtl> payReqDtls)
			{
				this.payReqDtls = payReqDtls;
			}
			
	}
