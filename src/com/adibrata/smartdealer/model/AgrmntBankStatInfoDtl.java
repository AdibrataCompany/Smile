
package com.adibrata.smartdealer.model;
// Generated Aug 5, 2015 10:58:53 PM by Hibernate Tools 4.3.1

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
 * AgrmntBankStatInfoDtl generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntBankStatInfoDtl", catalog = "SmartDealer")
public class AgrmntBankStatInfoDtl implements java.io.Serializable
	{
		
		private long id;
		private AgrmntBankStatementInfo agrmntBankStatementInfo;
		private short seqNo;
		private Byte bankMonth;
		private Short bankYear;
		private Double bankDebit;
		private Double bankBalance;
		private Double hiDebitCredit;
		private Double loDebitCredit;
		private Short mutasiDebit;
		private Short mutasiCredit;
		private Short avgBalance;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public AgrmntBankStatInfoDtl()
			{
			}
			
		public AgrmntBankStatInfoDtl(long id, short seqNo)
			{
				this.id = id;
				this.seqNo = seqNo;
			}
			
		public AgrmntBankStatInfoDtl(long id, AgrmntBankStatementInfo agrmntBankStatementInfo, short seqNo, Byte bankMonth, Short bankYear, Double bankDebit, Double bankBalance, Double hiDebitCredit, Double loDebitCredit, Short mutasiDebit,
		        Short mutasiCredit, Short avgBalance, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.agrmntBankStatementInfo = agrmntBankStatementInfo;
				this.seqNo = seqNo;
				this.bankMonth = bankMonth;
				this.bankYear = bankYear;
				this.bankDebit = bankDebit;
				this.bankBalance = bankBalance;
				this.hiDebitCredit = hiDebitCredit;
				this.loDebitCredit = loDebitCredit;
				this.mutasiDebit = mutasiDebit;
				this.mutasiCredit = mutasiCredit;
				this.avgBalance = avgBalance;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
			}
			
		@Id @GeneratedValue(strategy=GenerationType.AUTO)
		
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
		@JoinColumn(name = "AgrmntBankStatInfoIdId")
		public AgrmntBankStatementInfo getAgrmntBankStatementInfo()
			{
				return this.agrmntBankStatementInfo;
			}
			
		public void setAgrmntBankStatementInfo(AgrmntBankStatementInfo agrmntBankStatementInfo)
			{
				this.agrmntBankStatementInfo = agrmntBankStatementInfo;
			}
			
		@Column(name = "SeqNo", nullable = false)
		public short getSeqNo()
			{
				return this.seqNo;
			}
			
		public void setSeqNo(short seqNo)
			{
				this.seqNo = seqNo;
			}
			
		@Column(name = "BankMonth")
		public Byte getBankMonth()
			{
				return this.bankMonth;
			}
			
		public void setBankMonth(Byte bankMonth)
			{
				this.bankMonth = bankMonth;
			}
			
		@Column(name = "BankYear")
		public Short getBankYear()
			{
				return this.bankYear;
			}
			
		public void setBankYear(Short bankYear)
			{
				this.bankYear = bankYear;
			}
			
		@Column(name = "BankDebit", precision = 17)
		public Double getBankDebit()
			{
				return this.bankDebit;
			}
			
		public void setBankDebit(Double bankDebit)
			{
				this.bankDebit = bankDebit;
			}
			
		@Column(name = "BankBalance", precision = 17)
		public Double getBankBalance()
			{
				return this.bankBalance;
			}
			
		public void setBankBalance(Double bankBalance)
			{
				this.bankBalance = bankBalance;
			}
			
		@Column(name = "HiDebitCredit", precision = 17)
		public Double getHiDebitCredit()
			{
				return this.hiDebitCredit;
			}
			
		public void setHiDebitCredit(Double hiDebitCredit)
			{
				this.hiDebitCredit = hiDebitCredit;
			}
			
		@Column(name = "LoDebitCredit", precision = 17)
		public Double getLoDebitCredit()
			{
				return this.loDebitCredit;
			}
			
		public void setLoDebitCredit(Double loDebitCredit)
			{
				this.loDebitCredit = loDebitCredit;
			}
			
		@Column(name = "MutasiDebit")
		public Short getMutasiDebit()
			{
				return this.mutasiDebit;
			}
			
		public void setMutasiDebit(Short mutasiDebit)
			{
				this.mutasiDebit = mutasiDebit;
			}
			
		@Column(name = "MutasiCredit")
		public Short getMutasiCredit()
			{
				return this.mutasiCredit;
			}
			
		public void setMutasiCredit(Short mutasiCredit)
			{
				this.mutasiCredit = mutasiCredit;
			}
			
		@Column(name = "AvgBalance")
		public Short getAvgBalance()
			{
				return this.avgBalance;
			}
			
		public void setAvgBalance(Short avgBalance)
			{
				this.avgBalance = avgBalance;
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
