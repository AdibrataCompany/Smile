
package com.adibrata.smartdealer.model;

// Generated Jul 19, 2015 10:57:21 PM by Hibernate Tools 4.3.1

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
 * CashBankDtl generated by hbm2java
 */
@Entity
@Table(name = "CashBankDtl", catalog = "SmartDealer")
public class CashBankDtl implements java.io.Serializable
	{
		
		private long id;
		private CashBankHdr cashBankHdr;
		private Integer sequenceNo;
		private String coaName;
		private String coaCode;
		private String description;
		private double debitAmt;
		private double creditAmt;
		private Long departId;
		private String usrUpd;
		private Date dtmUpd;
		private String usrCrt;
		private Date dtmCrt;
		
		public CashBankDtl()
			{
			}
		
		public CashBankDtl(long id, CashBankHdr cashBankHdr, String coaName, String coaCode, String description, double debitAmt, double creditAmt)
			{
				this.id = id;
				this.cashBankHdr = cashBankHdr;
				this.coaName = coaName;
				this.coaCode = coaCode;
				this.description = description;
				this.debitAmt = debitAmt;
				this.creditAmt = creditAmt;
			}
		
		public CashBankDtl(long id, CashBankHdr cashBankHdr, Integer sequenceNo, String coaName, String coaCode, String description, double debitAmt, double creditAmt, Long departId, String usrUpd, Date dtmUpd, String usrCrt, Date dtmCrt)
			{
				this.id = id;
				this.cashBankHdr = cashBankHdr;
				this.sequenceNo = sequenceNo;
				this.coaName = coaName;
				this.coaCode = coaCode;
				this.description = description;
				this.debitAmt = debitAmt;
				this.creditAmt = creditAmt;
				this.departId = departId;
				this.usrUpd = usrUpd;
				this.dtmUpd = dtmUpd;
				this.usrCrt = usrCrt;
				this.dtmCrt = dtmCrt;
			}
		
		@Id
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
		@JoinColumn(name = "CashBankHdrID", nullable = false)
		public CashBankHdr getCashBankHdr()
			{
				return this.cashBankHdr;
			}
		
		public void setCashBankHdr(CashBankHdr cashBankHdr)
			{
				this.cashBankHdr = cashBankHdr;
			}
		
		@Column(name = "SequenceNo")
		public Integer getSequenceNo()
			{
				return this.sequenceNo;
			}
		
		public void setSequenceNo(Integer sequenceNo)
			{
				this.sequenceNo = sequenceNo;
			}
		
		@Column(name = "CoaName", nullable = false, length = 50)
		public String getCoaName()
			{
				return this.coaName;
			}
		
		public void setCoaName(String coaName)
			{
				this.coaName = coaName;
			}
		
		@Column(name = "CoaCode", nullable = false, length = 50)
		public String getCoaCode()
			{
				return this.coaCode;
			}
		
		public void setCoaCode(String coaCode)
			{
				this.coaCode = coaCode;
			}
		
		@Column(name = "Description", nullable = false, length = 100)
		public String getDescription()
			{
				return this.description;
			}
		
		public void setDescription(String description)
			{
				this.description = description;
			}
		
		@Column(name = "DebitAmt", nullable = false, precision = 53, scale = 0)
		public double getDebitAmt()
			{
				return this.debitAmt;
			}
		
		public void setDebitAmt(double debitAmt)
			{
				this.debitAmt = debitAmt;
			}
		
		@Column(name = "CreditAmt", nullable = false, precision = 53, scale = 0)
		public double getCreditAmt()
			{
				return this.creditAmt;
			}
		
		public void setCreditAmt(double creditAmt)
			{
				this.creditAmt = creditAmt;
			}
		
		@Column(name = "DepartID")
		public Long getDepartId()
			{
				return this.departId;
			}
		
		public void setDepartId(Long departId)
			{
				this.departId = departId;
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
		@Column(name = "DtmUpd", length = 16)
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
		@Column(name = "DtmCrt", length = 16)
		public Date getDtmCrt()
			{
				return this.dtmCrt;
			}
		
		public void setDtmCrt(Date dtmCrt)
			{
				this.dtmCrt = dtmCrt;
			}
		
	}
