
package com.adibrata.smartdealer.model;
// Generated Jul 21, 2015 1:45:23 PM by Hibernate Tools 4.3.1

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
 * PayHistHdr generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "PayHistHdr", catalog = "SmartDealer")
public class PayHistHdr implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private short histSeqNo;
		private Date valueDt;
		private Date postingDt;
		private double amountReceive;
		private String wop;
		private long officeIdX;
		private long bankAccId;
		private short isCorrection;
		private short corrHistSeq;
		private Short printedNum;
		private String printBy;
		private Date lastPrtDt;
		private long jobId;
		private String defaultStat;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<PayHistDtl> payHistDtls = new HashSet<PayHistDtl>(0);
		
		public PayHistHdr()
			{
			}
			
		public PayHistHdr(long id, Agrmnt agrmnt, short histSeqNo, Date valueDt, Date postingDt, double amountReceive, String wop, long officeIdX, long bankAccId, short isCorrection, short corrHistSeq, long jobId, String defaultStat)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.histSeqNo = histSeqNo;
				this.valueDt = valueDt;
				this.postingDt = postingDt;
				this.amountReceive = amountReceive;
				this.wop = wop;
				this.officeIdX = officeIdX;
				this.bankAccId = bankAccId;
				this.isCorrection = isCorrection;
				this.corrHistSeq = corrHistSeq;
				this.jobId = jobId;
				this.defaultStat = defaultStat;
			}
			
		public PayHistHdr(long id, Agrmnt agrmnt, short histSeqNo, Date valueDt, Date postingDt, double amountReceive, String wop, long officeIdX, long bankAccId, short isCorrection, short corrHistSeq, Short printedNum, String printBy,
		        Date lastPrtDt, long jobId, String defaultStat, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<PayHistDtl> payHistDtls)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.histSeqNo = histSeqNo;
				this.valueDt = valueDt;
				this.postingDt = postingDt;
				this.amountReceive = amountReceive;
				this.wop = wop;
				this.officeIdX = officeIdX;
				this.bankAccId = bankAccId;
				this.isCorrection = isCorrection;
				this.corrHistSeq = corrHistSeq;
				this.printedNum = printedNum;
				this.printBy = printBy;
				this.lastPrtDt = lastPrtDt;
				this.jobId = jobId;
				this.defaultStat = defaultStat;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.payHistDtls = payHistDtls;
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
		@JoinColumn(name = "AgrmntID", nullable = false)
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		public void setAgrmnt(Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}
			
		@Column(name = "HistSeqNo", nullable = false)
		public short getHistSeqNo()
			{
				return this.histSeqNo;
			}
			
		public void setHistSeqNo(short histSeqNo)
			{
				this.histSeqNo = histSeqNo;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ValueDt", nullable = false, length = 23)
		public Date getValueDt()
			{
				return this.valueDt;
			}
			
		public void setValueDt(Date valueDt)
			{
				this.valueDt = valueDt;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "PostingDt", nullable = false, length = 23)
		public Date getPostingDt()
			{
				return this.postingDt;
			}
			
		public void setPostingDt(Date postingDt)
			{
				this.postingDt = postingDt;
			}
			
		@Column(name = "AmountReceive", nullable = false, precision = 53, scale = 0)
		public double getAmountReceive()
			{
				return this.amountReceive;
			}
			
		public void setAmountReceive(double amountReceive)
			{
				this.amountReceive = amountReceive;
			}
			
		@Column(name = "WOP", nullable = false, length = 50)
		public String getWop()
			{
				return this.wop;
			}
			
		public void setWop(String wop)
			{
				this.wop = wop;
			}
			
		@Column(name = "OfficeID_X", nullable = false)
		public long getOfficeIdX()
			{
				return this.officeIdX;
			}
			
		public void setOfficeIdX(long officeIdX)
			{
				this.officeIdX = officeIdX;
			}
			
		@Column(name = "BankAccID", nullable = false)
		public long getBankAccId()
			{
				return this.bankAccId;
			}
			
		public void setBankAccId(long bankAccId)
			{
				this.bankAccId = bankAccId;
			}
			
		@Column(name = "IsCorrection", nullable = false)
		public short getIsCorrection()
			{
				return this.isCorrection;
			}
			
		public void setIsCorrection(short isCorrection)
			{
				this.isCorrection = isCorrection;
			}
			
		@Column(name = "CorrHistSeq", nullable = false)
		public short getCorrHistSeq()
			{
				return this.corrHistSeq;
			}
			
		public void setCorrHistSeq(short corrHistSeq)
			{
				this.corrHistSeq = corrHistSeq;
			}
			
		@Column(name = "PrintedNum")
		public Short getPrintedNum()
			{
				return this.printedNum;
			}
			
		public void setPrintedNum(Short printedNum)
			{
				this.printedNum = printedNum;
			}
			
		@Column(name = "PrintBy", length = 50)
		public String getPrintBy()
			{
				return this.printBy;
			}
			
		public void setPrintBy(String printBy)
			{
				this.printBy = printBy;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "LastPrtDt", length = 23)
		public Date getLastPrtDt()
			{
				return this.lastPrtDt;
			}
			
		public void setLastPrtDt(Date lastPrtDt)
			{
				this.lastPrtDt = lastPrtDt;
			}
			
		@Column(name = "JobId", nullable = false)
		public long getJobId()
			{
				return this.jobId;
			}
			
		public void setJobId(long jobId)
			{
				this.jobId = jobId;
			}
			
		@Column(name = "DefaultStat", nullable = false, length = 50)
		public String getDefaultStat()
			{
				return this.defaultStat;
			}
			
		public void setDefaultStat(String defaultStat)
			{
				this.defaultStat = defaultStat;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "payHistHdr")
		public Set<PayHistDtl> getPayHistDtls()
			{
				return this.payHistDtls;
			}
			
		public void setPayHistDtls(Set<PayHistDtl> payHistDtls)
			{
				this.payHistDtls = payHistDtls;
			}
			
	}
