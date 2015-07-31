
package com.adibrata.smartdealer.model;
// Generated Jul 31, 2015 2:16:00 PM by Hibernate Tools 4.3.1

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
import javax.persistence.UniqueConstraint;

/**
 * TrxSeqNo generated by hbm2java
 */
@Entity
@Table(name = "TrxSeqNo", catalog = "SmartDealer", uniqueConstraints = @UniqueConstraint(columnNames =
	{
	        "MSSequenceCode", "OfficeID", "PartnerCode"
	}) )
public class TrxSeqNo implements java.io.Serializable
	{
		
		private long msseqId;
		private Partner partner;
		private String mssequenceCode;
		private long officeId;
		private String seqName;
		private Integer seqNo;
		private Integer lengthNumber;
		private String resetFlag;
		private String prefix;
		private String suffix;
		private String configNumber;
		private String jrnlSeqName;
		private Integer jrnlSeqNo;
		private Integer jrnlLengthNo;
		private String jrnlResetFlag;
		private String jrnlPrefix;
		private String jrnlSuffix;
		private String jrnlConfigNumber;
		private String usrUpd;
		private Date dtmUpd;
		private String usrCrt;
		private Date dtmCrt;
		
		public TrxSeqNo()
			{
			}
			
		public TrxSeqNo(long msseqId, Partner partner, String mssequenceCode, long officeId, String usrUpd, Date dtmUpd)
			{
				this.msseqId = msseqId;
				this.partner = partner;
				this.mssequenceCode = mssequenceCode;
				this.officeId = officeId;
				this.usrUpd = usrUpd;
				this.dtmUpd = dtmUpd;
			}
			
		public TrxSeqNo(long msseqId, Partner partner, String mssequenceCode, long officeId, String seqName, Integer seqNo, Integer lengthNumber, String resetFlag, String prefix, String suffix, String configNumber, String jrnlSeqName,
		        Integer jrnlSeqNo, Integer jrnlLengthNo, String jrnlResetFlag, String jrnlPrefix, String jrnlSuffix, String jrnlConfigNumber, String usrUpd, Date dtmUpd, String usrCrt, Date dtmCrt)
			{
				this.msseqId = msseqId;
				this.partner = partner;
				this.mssequenceCode = mssequenceCode;
				this.officeId = officeId;
				this.seqName = seqName;
				this.seqNo = seqNo;
				this.lengthNumber = lengthNumber;
				this.resetFlag = resetFlag;
				this.prefix = prefix;
				this.suffix = suffix;
				this.configNumber = configNumber;
				this.jrnlSeqName = jrnlSeqName;
				this.jrnlSeqNo = jrnlSeqNo;
				this.jrnlLengthNo = jrnlLengthNo;
				this.jrnlResetFlag = jrnlResetFlag;
				this.jrnlPrefix = jrnlPrefix;
				this.jrnlSuffix = jrnlSuffix;
				this.jrnlConfigNumber = jrnlConfigNumber;
				this.usrUpd = usrUpd;
				this.dtmUpd = dtmUpd;
				this.usrCrt = usrCrt;
				this.dtmCrt = dtmCrt;
			}
			
		@Id
		
		@Column(name = "MSSeqID", unique = true, nullable = false)
		public long getMsseqId()
			{
				return this.msseqId;
			}
			
		public void setMsseqId(long msseqId)
			{
				this.msseqId = msseqId;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "PartnerCode", nullable = false)
		public Partner getPartner()
			{
				return this.partner;
			}
			
		public void setPartner(Partner partner)
			{
				this.partner = partner;
			}
			
		@Column(name = "MSSequenceCode", nullable = false, length = 50)
		public String getMssequenceCode()
			{
				return this.mssequenceCode;
			}
			
		public void setMssequenceCode(String mssequenceCode)
			{
				this.mssequenceCode = mssequenceCode;
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
			
		@Column(name = "Seq_Name", length = 50)
		public String getSeqName()
			{
				return this.seqName;
			}
			
		public void setSeqName(String seqName)
			{
				this.seqName = seqName;
			}
			
		@Column(name = "Seq_No")
		public Integer getSeqNo()
			{
				return this.seqNo;
			}
			
		public void setSeqNo(Integer seqNo)
			{
				this.seqNo = seqNo;
			}
			
		@Column(name = "Length_Number")
		public Integer getLengthNumber()
			{
				return this.lengthNumber;
			}
			
		public void setLengthNumber(Integer lengthNumber)
			{
				this.lengthNumber = lengthNumber;
			}
			
		@Column(name = "ResetFlag", length = 1)
		public String getResetFlag()
			{
				return this.resetFlag;
			}
			
		public void setResetFlag(String resetFlag)
			{
				this.resetFlag = resetFlag;
			}
			
		@Column(name = "Prefix", length = 10)
		public String getPrefix()
			{
				return this.prefix;
			}
			
		public void setPrefix(String prefix)
			{
				this.prefix = prefix;
			}
			
		@Column(name = "Suffix", length = 10)
		public String getSuffix()
			{
				return this.suffix;
			}
			
		public void setSuffix(String suffix)
			{
				this.suffix = suffix;
			}
			
		@Column(name = "ConfigNumber", length = 100)
		public String getConfigNumber()
			{
				return this.configNumber;
			}
			
		public void setConfigNumber(String configNumber)
			{
				this.configNumber = configNumber;
			}
			
		@Column(name = "Jrnl_Seq_Name", length = 50)
		public String getJrnlSeqName()
			{
				return this.jrnlSeqName;
			}
			
		public void setJrnlSeqName(String jrnlSeqName)
			{
				this.jrnlSeqName = jrnlSeqName;
			}
			
		@Column(name = "Jrnl_Seq_No")
		public Integer getJrnlSeqNo()
			{
				return this.jrnlSeqNo;
			}
			
		public void setJrnlSeqNo(Integer jrnlSeqNo)
			{
				this.jrnlSeqNo = jrnlSeqNo;
			}
			
		@Column(name = "Jrnl_Length_No")
		public Integer getJrnlLengthNo()
			{
				return this.jrnlLengthNo;
			}
			
		public void setJrnlLengthNo(Integer jrnlLengthNo)
			{
				this.jrnlLengthNo = jrnlLengthNo;
			}
			
		@Column(name = "Jrnl_ResetFlag", length = 1)
		public String getJrnlResetFlag()
			{
				return this.jrnlResetFlag;
			}
			
		public void setJrnlResetFlag(String jrnlResetFlag)
			{
				this.jrnlResetFlag = jrnlResetFlag;
			}
			
		@Column(name = "Jrnl_Prefix", length = 10)
		public String getJrnlPrefix()
			{
				return this.jrnlPrefix;
			}
			
		public void setJrnlPrefix(String jrnlPrefix)
			{
				this.jrnlPrefix = jrnlPrefix;
			}
			
		@Column(name = "Jrnl_Suffix", length = 10)
		public String getJrnlSuffix()
			{
				return this.jrnlSuffix;
			}
			
		public void setJrnlSuffix(String jrnlSuffix)
			{
				this.jrnlSuffix = jrnlSuffix;
			}
			
		@Column(name = "JrnlConfigNumber", length = 100)
		public String getJrnlConfigNumber()
			{
				return this.jrnlConfigNumber;
			}
			
		public void setJrnlConfigNumber(String jrnlConfigNumber)
			{
				this.jrnlConfigNumber = jrnlConfigNumber;
			}
			
		@Column(name = "UsrUpd", nullable = false, length = 50)
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		public void setUsrUpd(String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmUpd", nullable = false, length = 23)
		public Date getDtmUpd()
			{
				return this.dtmUpd;
			}
			
		public void setDtmUpd(Date dtmUpd)
			{
				this.dtmUpd = dtmUpd;
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
			
	}
