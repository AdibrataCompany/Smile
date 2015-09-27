
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
 * JrnlHdr generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "JrnlHdr", catalog = "SmartDealer")
public class JrnlHdr implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private long officeId;
		private String jrnlNo;
		private String periodYear;
		private String periodMonth;
		private Date trxDate;
		private String reffNo;
		private Date reffDate;
		private String trxDesc;
		private double jrnlAmt;
		private String statusTr;
		private String flag;
		private Short isActive;
		private Short isValid;
		private String jrnlTrxCode;
		private String coaSchmCode;
		private Long jobId;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<JrnlDtl> jrnlDtls = new HashSet<JrnlDtl>(0);
		
		public JrnlHdr()
			{
			}
			
		public JrnlHdr(long id, long officeId, String jrnlNo, String periodYear, String periodMonth, Date trxDate, String trxDesc, double jrnlAmt, String statusTr, String flag)
			{
				this.id = id;
				this.officeId = officeId;
				this.jrnlNo = jrnlNo;
				this.periodYear = periodYear;
				this.periodMonth = periodMonth;
				this.trxDate = trxDate;
				this.trxDesc = trxDesc;
				this.jrnlAmt = jrnlAmt;
				this.statusTr = statusTr;
				this.flag = flag;
			}
			
		public JrnlHdr(long id, Partner partner, long officeId, String jrnlNo, String periodYear, String periodMonth, Date trxDate, String reffNo, Date reffDate, String trxDesc, double jrnlAmt, String statusTr, String flag, Short isActive,
		        Short isValid, String jrnlTrxCode, String coaSchmCode, Long jobId, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<JrnlDtl> jrnlDtls)
			{
				this.id = id;
				this.partner = partner;
				this.officeId = officeId;
				this.jrnlNo = jrnlNo;
				this.periodYear = periodYear;
				this.periodMonth = periodMonth;
				this.trxDate = trxDate;
				this.reffNo = reffNo;
				this.reffDate = reffDate;
				this.trxDesc = trxDesc;
				this.jrnlAmt = jrnlAmt;
				this.statusTr = statusTr;
				this.flag = flag;
				this.isActive = isActive;
				this.isValid = isValid;
				this.jrnlTrxCode = jrnlTrxCode;
				this.coaSchmCode = coaSchmCode;
				this.jobId = jobId;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.jrnlDtls = jrnlDtls;
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
			
		@Column(name = "OfficeID", nullable = false)
		public long getOfficeId()
			{
				return this.officeId;
			}
			
		public void setOfficeId(long officeId)
			{
				this.officeId = officeId;
			}
			
		@Column(name = "JrnlNo", nullable = false, length = 50)
		public String getJrnlNo()
			{
				return this.jrnlNo;
			}
			
		public void setJrnlNo(String jrnlNo)
			{
				this.jrnlNo = jrnlNo;
			}
			
		@Column(name = "PeriodYear", nullable = false, length = 4)
		public String getPeriodYear()
			{
				return this.periodYear;
			}
			
		public void setPeriodYear(String periodYear)
			{
				this.periodYear = periodYear;
			}
			
		@Column(name = "PeriodMonth", nullable = false, length = 50)
		public String getPeriodMonth()
			{
				return this.periodMonth;
			}
			
		public void setPeriodMonth(String periodMonth)
			{
				this.periodMonth = periodMonth;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "TrxDate", nullable = false, length = 23)
		public Date getTrxDate()
			{
				return this.trxDate;
			}
			
		public void setTrxDate(Date trxDate)
			{
				this.trxDate = trxDate;
			}
			
		@Column(name = "Reff_No", length = 20)
		public String getReffNo()
			{
				return this.reffNo;
			}
			
		public void setReffNo(String reffNo)
			{
				this.reffNo = reffNo;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "Reff_Date", length = 23)
		public Date getReffDate()
			{
				return this.reffDate;
			}
			
		public void setReffDate(Date reffDate)
			{
				this.reffDate = reffDate;
			}
			
		@Column(name = "TrxDesc", nullable = false, length = 100)
		public String getTrxDesc()
			{
				return this.trxDesc;
			}
			
		public void setTrxDesc(String trxDesc)
			{
				this.trxDesc = trxDesc;
			}
			
		@Column(name = "JrnlAmt", nullable = false, precision = 53, scale = 0)
		public double getJrnlAmt()
			{
				return this.jrnlAmt;
			}
			
		public void setJrnlAmt(double jrnlAmt)
			{
				this.jrnlAmt = jrnlAmt;
			}
			
		@Column(name = "Status_Tr", nullable = false, length = 2)
		public String getStatusTr()
			{
				return this.statusTr;
			}
			
		public void setStatusTr(String statusTr)
			{
				this.statusTr = statusTr;
			}
			
		@Column(name = "Flag", nullable = false, length = 50)
		public String getFlag()
			{
				return this.flag;
			}
			
		public void setFlag(String flag)
			{
				this.flag = flag;
			}
			
		@Column(name = "IsActive")
		public Short getIsActive()
			{
				return this.isActive;
			}
			
		public void setIsActive(Short isActive)
			{
				this.isActive = isActive;
			}
			
		@Column(name = "IsValid")
		public Short getIsValid()
			{
				return this.isValid;
			}
			
		public void setIsValid(Short isValid)
			{
				this.isValid = isValid;
			}
			
		@Column(name = "JrnlTrxCode", length = 20)
		public String getJrnlTrxCode()
			{
				return this.jrnlTrxCode;
			}
			
		public void setJrnlTrxCode(String jrnlTrxCode)
			{
				this.jrnlTrxCode = jrnlTrxCode;
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
			
		@Column(name = "JobID")
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "jrnlHdr")
		public Set<JrnlDtl> getJrnlDtls()
			{
				return this.jrnlDtls;
			}
			
		public void setJrnlDtls(Set<JrnlDtl> jrnlDtls)
			{
				this.jrnlDtls = jrnlDtls;
			}
			
	}
