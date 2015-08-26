
package com.adibrata.smartdealer.model;
// Generated Aug 26, 2015 9:54:19 AM by Hibernate Tools 4.3.1

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
 * JrnlDtl generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "JrnlDtl", catalog = "SmartDealer")
public class JrnlDtl implements java.io.Serializable
	{
		
		private long id;
		private JrnlHdr jrnlHdr;
		private int sequenceNo;
		private String coaCoy;
		private String coaOffice;
		private String coaName;
		private String coaCode;
		private String trDesc;
		private String post;
		private Long currId;
		private double currRate;
		private double debtAmt;
		private Double credAmt;
		private Double oriAmt;
		private String coaCodeX;
		private String coaOfficeX;
		private String departCode;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public JrnlDtl()
			{
			}
			
		public JrnlDtl(long id, int sequenceNo, String coaOffice, String post, double currRate, double debtAmt)
			{
				this.id = id;
				this.sequenceNo = sequenceNo;
				this.coaOffice = coaOffice;
				this.post = post;
				this.currRate = currRate;
				this.debtAmt = debtAmt;
			}
			
		public JrnlDtl(long id, JrnlHdr jrnlHdr, int sequenceNo, String coaCoy, String coaOffice, String coaName, String coaCode, String trDesc, String post, Long currId, double currRate, double debtAmt, Double credAmt, Double oriAmt,
		        String coaCodeX, String coaOfficeX, String departCode, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.jrnlHdr = jrnlHdr;
				this.sequenceNo = sequenceNo;
				this.coaCoy = coaCoy;
				this.coaOffice = coaOffice;
				this.coaName = coaName;
				this.coaCode = coaCode;
				this.trDesc = trDesc;
				this.post = post;
				this.currId = currId;
				this.currRate = currRate;
				this.debtAmt = debtAmt;
				this.credAmt = credAmt;
				this.oriAmt = oriAmt;
				this.coaCodeX = coaCodeX;
				this.coaOfficeX = coaOfficeX;
				this.departCode = departCode;
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
		@JoinColumn(name = "JrnlHdrID")
		public JrnlHdr getJrnlHdr()
			{
				return this.jrnlHdr;
			}
			
		public void setJrnlHdr(JrnlHdr jrnlHdr)
			{
				this.jrnlHdr = jrnlHdr;
			}
			
		@Column(name = "SequenceNo", nullable = false)
		public int getSequenceNo()
			{
				return this.sequenceNo;
			}
			
		public void setSequenceNo(int sequenceNo)
			{
				this.sequenceNo = sequenceNo;
			}
			
		@Column(name = "CoaCoy", length = 50)
		public String getCoaCoy()
			{
				return this.coaCoy;
			}
			
		public void setCoaCoy(String coaCoy)
			{
				this.coaCoy = coaCoy;
			}
			
		@Column(name = "CoaOffice", nullable = false, length = 30)
		public String getCoaOffice()
			{
				return this.coaOffice;
			}
			
		public void setCoaOffice(String coaOffice)
			{
				this.coaOffice = coaOffice;
			}
			
		@Column(name = "CoaName", length = 50)
		public String getCoaName()
			{
				return this.coaName;
			}
			
		public void setCoaName(String coaName)
			{
				this.coaName = coaName;
			}
			
		@Column(name = "CoaCode", length = 50)
		public String getCoaCode()
			{
				return this.coaCode;
			}
			
		public void setCoaCode(String coaCode)
			{
				this.coaCode = coaCode;
			}
			
		@Column(name = "Tr_Desc")
		public String getTrDesc()
			{
				return this.trDesc;
			}
			
		public void setTrDesc(String trDesc)
			{
				this.trDesc = trDesc;
			}
			
		@Column(name = "Post", nullable = false, length = 1)
		public String getPost()
			{
				return this.post;
			}
			
		public void setPost(String post)
			{
				this.post = post;
			}
			
		@Column(name = "CurrID")
		public Long getCurrId()
			{
				return this.currId;
			}
			
		public void setCurrId(Long currId)
			{
				this.currId = currId;
			}
			
		@Column(name = "Curr_Rate", nullable = false, precision = 53, scale = 0)
		public double getCurrRate()
			{
				return this.currRate;
			}
			
		public void setCurrRate(double currRate)
			{
				this.currRate = currRate;
			}
			
		@Column(name = "DebtAmt", nullable = false, precision = 53, scale = 0)
		public double getDebtAmt()
			{
				return this.debtAmt;
			}
			
		public void setDebtAmt(double debtAmt)
			{
				this.debtAmt = debtAmt;
			}
			
		@Column(name = "CredAmt", precision = 53, scale = 0)
		public Double getCredAmt()
			{
				return this.credAmt;
			}
			
		public void setCredAmt(Double credAmt)
			{
				this.credAmt = credAmt;
			}
			
		@Column(name = "OriAmt", precision = 53, scale = 0)
		public Double getOriAmt()
			{
				return this.oriAmt;
			}
			
		public void setOriAmt(Double oriAmt)
			{
				this.oriAmt = oriAmt;
			}
			
		@Column(name = "CoaCode_X", length = 25)
		public String getCoaCodeX()
			{
				return this.coaCodeX;
			}
			
		public void setCoaCodeX(String coaCodeX)
			{
				this.coaCodeX = coaCodeX;
			}
			
		@Column(name = "CoaOffice_X", length = 3)
		public String getCoaOfficeX()
			{
				return this.coaOfficeX;
			}
			
		public void setCoaOfficeX(String coaOfficeX)
			{
				this.coaOfficeX = coaOfficeX;
			}
			
		@Column(name = "DepartCode", length = 50)
		public String getDepartCode()
			{
				return this.departCode;
			}
			
		public void setDepartCode(String departCode)
			{
				this.departCode = departCode;
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
