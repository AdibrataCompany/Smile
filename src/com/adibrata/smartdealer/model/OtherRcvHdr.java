
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
 * OtherRcvHdr generated by hbm2java
 */
@Entity
@Table(name = "OtherRcvHdr", catalog = "SmartDealer")
public class OtherRcvHdr implements java.io.Serializable
	{
		
		private long id;
		private Office office;
		private Partner partner;
		private String otherRcvNo;
		private String rcvFrom;
		private Double rcvAmount;
		private String reffNo;
		private Date postingDate;
		private Date valueDate;
		private Long bankAccountId;
		private String notes;
		private Long jobId;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<OtherRcvDtl> otherRcvDtls = new HashSet<OtherRcvDtl>(0);
		
		public OtherRcvHdr()
			{
			}
			
		public OtherRcvHdr(long id)
			{
				this.id = id;
			}
			
		public OtherRcvHdr(long id, Office office, Partner partner, String otherRcvNo, String rcvFrom, Double rcvAmount, String reffNo, Date postingDate, Date valueDate, Long bankAccountId, String notes, Long jobId, Date dtmUpd, String usrUpd,
		        Date dtmCrt, String usrCrt, Set<OtherRcvDtl> otherRcvDtls)
			{
				this.id = id;
				this.office = office;
				this.partner = partner;
				this.otherRcvNo = otherRcvNo;
				this.rcvFrom = rcvFrom;
				this.rcvAmount = rcvAmount;
				this.reffNo = reffNo;
				this.postingDate = postingDate;
				this.valueDate = valueDate;
				this.bankAccountId = bankAccountId;
				this.notes = notes;
				this.jobId = jobId;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.otherRcvDtls = otherRcvDtls;
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
			
		@Column(name = "OtherRcvNo", length = 20)
		public String getOtherRcvNo()
			{
				return this.otherRcvNo;
			}
			
		public void setOtherRcvNo(String otherRcvNo)
			{
				this.otherRcvNo = otherRcvNo;
			}
			
		@Column(name = "RcvFrom", length = 50)
		public String getRcvFrom()
			{
				return this.rcvFrom;
			}
			
		public void setRcvFrom(String rcvFrom)
			{
				this.rcvFrom = rcvFrom;
			}
			
		@Column(name = "RcvAmount", precision = 53, scale = 0)
		public Double getRcvAmount()
			{
				return this.rcvAmount;
			}
			
		public void setRcvAmount(Double rcvAmount)
			{
				this.rcvAmount = rcvAmount;
			}
			
		@Column(name = "ReffNo", length = 50)
		public String getReffNo()
			{
				return this.reffNo;
			}
			
		public void setReffNo(String reffNo)
			{
				this.reffNo = reffNo;
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
			
		@Column(name = "BankAccountID")
		public Long getBankAccountId()
			{
				return this.bankAccountId;
			}
			
		public void setBankAccountId(Long bankAccountId)
			{
				this.bankAccountId = bankAccountId;
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
		@Column(name = "DtmUpd", length = 23)
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
		@Column(name = "DtmCrt", length = 23)
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "otherRcvHdr")
		public Set<OtherRcvDtl> getOtherRcvDtls()
			{
				return this.otherRcvDtls;
			}
			
		public void setOtherRcvDtls(Set<OtherRcvDtl> otherRcvDtls)
			{
				this.otherRcvDtls = otherRcvDtls;
			}
			
	}
