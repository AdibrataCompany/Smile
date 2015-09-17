
package com.adibrata.smartdealer.model;
// Generated Sep 10, 2015 12:03:09 PM by Hibernate Tools 4.3.1

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
 * PaymentReversal generated by hbm2java
 */
@Entity
@Table(name = "PaymentReversal", catalog = "SmartDealer")
public class PaymentReversal implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private Date valueDate;
		private Date postingDate;
		private Long bankAccId;
		private Double currencyRate;
		private String notes;
		private Double instAmt;
		private Double lcamt;
		private Double inssAmt;
		private Double lcinss;
		private Double prepaidAmt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public PaymentReversal()
			{
			}
			
		public PaymentReversal(long id)
			{
				this.id = id;
			}
			
		public PaymentReversal(long id, Agrmnt agrmnt, Date valueDate, Date postingDate, Long bankAccId, Double currencyRate, String notes, Double instAmt, Double lcamt, Double inssAmt, Double lcinss, Double prepaidAmt, Date dtmUpd, String usrUpd,
		        Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.valueDate = valueDate;
				this.postingDate = postingDate;
				this.bankAccId = bankAccId;
				this.currencyRate = currencyRate;
				this.notes = notes;
				this.instAmt = instAmt;
				this.lcamt = lcamt;
				this.inssAmt = inssAmt;
				this.lcinss = lcinss;
				this.prepaidAmt = prepaidAmt;
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
		@JoinColumn(name = "AgmrnId")
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
			
		@Column(name = "BankAccId")
		public Long getBankAccId()
			{
				return this.bankAccId;
			}
			
		public void setBankAccId(Long bankAccId)
			{
				this.bankAccId = bankAccId;
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
