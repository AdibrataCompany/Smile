
package com.adibrata.smartdealer.model;

// Generated Jul 20, 2015 11:55:15 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TransJob generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "TransJob", catalog = "SmartDealer")
public class TransJob implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private Long officeId;
		private String jobNo;
		private String trxConfigCode;
		private String coaSchmCode;
		private Date jobDate;
		private Date jobPost;
		private String jobStatus;
		private Date jobExecuteDate;
		private String journalNo;
		private String voucherNo;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public TransJob()
			{
			}
		
		public TransJob(long id)
			{
				this.id = id;
			}
		
		public TransJob(long id, Partner partner, Long officeId, String jobNo, String trxConfigCode, String coaSchmCode, Date jobDate, Date jobPost, String jobStatus, Date jobExecuteDate, String journalNo, String voucherNo, Date dtmUpd,
		        String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.partner = partner;
				this.officeId = officeId;
				this.jobNo = jobNo;
				this.trxConfigCode = trxConfigCode;
				this.coaSchmCode = coaSchmCode;
				this.jobDate = jobDate;
				this.jobPost = jobPost;
				this.jobStatus = jobStatus;
				this.jobExecuteDate = jobExecuteDate;
				this.journalNo = journalNo;
				this.voucherNo = voucherNo;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
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
		@JoinColumn(name = "PartnerCode")
		public Partner getPartner()
			{
				return this.partner;
			}
		
		public void setPartner(Partner partner)
			{
				this.partner = partner;
			}
		
		@Column(name = "OfficeID")
		public Long getOfficeId()
			{
				return this.officeId;
			}
		
		public void setOfficeId(Long officeId)
			{
				this.officeId = officeId;
			}
		
		@Column(name = "JobNo", length = 50)
		public String getJobNo()
			{
				return this.jobNo;
			}
		
		public void setJobNo(String jobNo)
			{
				this.jobNo = jobNo;
			}
		
		@Column(name = "TrxConfigCode", length = 20)
		public String getTrxConfigCode()
			{
				return this.trxConfigCode;
			}
		
		public void setTrxConfigCode(String trxConfigCode)
			{
				this.trxConfigCode = trxConfigCode;
			}
		
		@Column(name = "CoaSchmCode", length = 20)
		public String getCoaSchmCode()
			{
				return this.coaSchmCode;
			}
		
		public void setCoaSchmCode(String coaSchmCode)
			{
				this.coaSchmCode = coaSchmCode;
			}
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "JobDate", length = 23)
		public Date getJobDate()
			{
				return this.jobDate;
			}
		
		public void setJobDate(Date jobDate)
			{
				this.jobDate = jobDate;
			}
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "JobPost", length = 23)
		public Date getJobPost()
			{
				return this.jobPost;
			}
		
		public void setJobPost(Date jobPost)
			{
				this.jobPost = jobPost;
			}
		
		@Column(name = "JobStatus", length = 2)
		public String getJobStatus()
			{
				return this.jobStatus;
			}
		
		public void setJobStatus(String jobStatus)
			{
				this.jobStatus = jobStatus;
			}
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "JobExecuteDate", length = 23)
		public Date getJobExecuteDate()
			{
				return this.jobExecuteDate;
			}
		
		public void setJobExecuteDate(Date jobExecuteDate)
			{
				this.jobExecuteDate = jobExecuteDate;
			}
		
		@Column(name = "JournalNo", length = 50)
		public String getJournalNo()
			{
				return this.journalNo;
			}
		
		public void setJournalNo(String journalNo)
			{
				this.journalNo = journalNo;
			}
		
		@Column(name = "VoucherNo", length = 50)
		public String getVoucherNo()
			{
				return this.voucherNo;
			}
		
		public void setVoucherNo(String voucherNo)
			{
				this.voucherNo = voucherNo;
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
