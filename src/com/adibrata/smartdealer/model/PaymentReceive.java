
package com.adibrata.smartdealer.model;
// Generated Jul 26, 2015 5:46:46 PM by Hibernate Tools 4.3.1

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
 * PaymentReceive generated by hbm2java
 */
@Entity
@Table(name = "PaymentReceive", catalog = "SmartDealer")
public class PaymentReceive implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private Date valueDate;
		private Date postingDate;
		private String wop;
		private Long bankAccId;
		private Long currencyId;
		private Double currencyRate;
		private String notes;
		private Double totalPayment;
		private Double instAmt;
		private Double lcamt;
		private Double inssAmt;
		private Double lcinss;
		private Double prepaidAmt;
		private Long jobId;
		private Short payHistSeqNo;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public PaymentReceive()
			{
			}
			
		public PaymentReceive(long id)
			{
				this.id = id;
			}
			
		public PaymentReceive(long id, Agrmnt agrmnt, Date valueDate, Date postingDate, String wop, Long bankAccId, Long currencyId, Double currencyRate, String notes, Double totalPayment, Double instAmt, Double lcamt, Double inssAmt, Double lcinss,
		        Double prepaidAmt, Long jobId, Short payHistSeqNo, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.valueDate = valueDate;
				this.postingDate = postingDate;
				this.wop = wop;
				this.bankAccId = bankAccId;
				this.currencyId = currencyId;
				this.currencyRate = currencyRate;
				this.notes = notes;
				this.totalPayment = totalPayment;
				this.instAmt = instAmt;
				this.lcamt = lcamt;
				this.inssAmt = inssAmt;
				this.lcinss = lcinss;
				this.prepaidAmt = prepaidAmt;
				this.jobId = jobId;
				this.payHistSeqNo = payHistSeqNo;
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
		@JoinColumn(name = "AgmntId")
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		public void setAgrmnt(Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
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
			
		@Column(name = "WOP", length = 2)
		public String getWop()
			{
				return this.wop;
			}
			
		public void setWop(String wop)
			{
				this.wop = wop;
			}
			
		@Column(name = "BankAccId")
		public Long getBankAccId()
			{
				return this.bankAccId;
			}
			
		public void setBankAccId(Long bankAccId)
			{
				this.bankAccId = bankAccId;
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
			
		@Column(name = "Notes", length = 2000)
		public String getNotes()
			{
				return this.notes;
			}
			
		public void setNotes(String notes)
			{
				this.notes = notes;
			}
			
		@Column(name = "TotalPayment", precision = 53, scale = 0)
		public Double getTotalPayment()
			{
				return this.totalPayment;
			}
			
		public void setTotalPayment(Double totalPayment)
			{
				this.totalPayment = totalPayment;
			}
			
		@Column(name = "InstAmt", precision = 53, scale = 0)
		public Double getInstAmt()
			{
				return this.instAmt;
			}
			
		public void setInstAmt(Double instAmt)
			{
				this.instAmt = instAmt;
			}
			
		@Column(name = "LCAmt", precision = 53, scale = 0)
		public Double getLcamt()
			{
				return this.lcamt;
			}
			
		public void setLcamt(Double lcamt)
			{
				this.lcamt = lcamt;
			}
			
		@Column(name = "InssAmt", precision = 53, scale = 0)
		public Double getInssAmt()
			{
				return this.inssAmt;
			}
			
		public void setInssAmt(Double inssAmt)
			{
				this.inssAmt = inssAmt;
			}
			
		@Column(name = "LCInss", precision = 53, scale = 0)
		public Double getLcinss()
			{
				return this.lcinss;
			}
			
		public void setLcinss(Double lcinss)
			{
				this.lcinss = lcinss;
			}
			
		@Column(name = "PrepaidAmt", precision = 53, scale = 0)
		public Double getPrepaidAmt()
			{
				return this.prepaidAmt;
			}
			
		public void setPrepaidAmt(Double prepaidAmt)
			{
				this.prepaidAmt = prepaidAmt;
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
			
		@Column(name = "PayHistSeqNo")
		public Short getPayHistSeqNo()
			{
				return this.payHistSeqNo;
			}
			
		public void setPayHistSeqNo(Short payHistSeqNo)
			{
				this.payHistSeqNo = payHistSeqNo;
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
