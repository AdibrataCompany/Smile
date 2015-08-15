
package com.adibrata.smartdealer.model;
// Generated Aug 16, 2015 1:08:17 AM by Hibernate Tools 4.3.1

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
 * AgrmntBankStatementInfo generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntBankStatementInfo", catalog = "SmartDealer")
public class AgrmntBankStatementInfo implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private String bankCode;
		private String bankBranch;
		private String accountNo;
		private String accountName;
		private Double creditCeiling;
		private String typeOfCredit;
		private Double interest;
		private String security;
		private Double startingBalance;
		private Double deposito;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<AgrmntBankStatInfoDtl> agrmntBankStatInfoDtls = new HashSet<AgrmntBankStatInfoDtl>(0);
		
		public AgrmntBankStatementInfo()
			{
			}
			
		public AgrmntBankStatementInfo(long id, String bankCode, String bankBranch, String accountNo, String accountName)
			{
				this.id = id;
				this.bankCode = bankCode;
				this.bankBranch = bankBranch;
				this.accountNo = accountNo;
				this.accountName = accountName;
			}
			
		public AgrmntBankStatementInfo(long id, Agrmnt agrmnt, String bankCode, String bankBranch, String accountNo, String accountName, Double creditCeiling, String typeOfCredit, Double interest, String security, Double startingBalance,
		        Double deposito, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<AgrmntBankStatInfoDtl> agrmntBankStatInfoDtls)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.bankCode = bankCode;
				this.bankBranch = bankBranch;
				this.accountNo = accountNo;
				this.accountName = accountName;
				this.creditCeiling = creditCeiling;
				this.typeOfCredit = typeOfCredit;
				this.interest = interest;
				this.security = security;
				this.startingBalance = startingBalance;
				this.deposito = deposito;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.agrmntBankStatInfoDtls = agrmntBankStatInfoDtls;
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
		@JoinColumn(name = "AgrmntId")
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		public void setAgrmnt(Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}
			
		@Column(name = "BankCode", nullable = false, length = 5)
		public String getBankCode()
			{
				return this.bankCode;
			}
			
		public void setBankCode(String bankCode)
			{
				this.bankCode = bankCode;
			}
			
		@Column(name = "BankBranch", nullable = false, length = 30)
		public String getBankBranch()
			{
				return this.bankBranch;
			}
			
		public void setBankBranch(String bankBranch)
			{
				this.bankBranch = bankBranch;
			}
			
		@Column(name = "AccountNo", nullable = false, length = 50)
		public String getAccountNo()
			{
				return this.accountNo;
			}
			
		public void setAccountNo(String accountNo)
			{
				this.accountNo = accountNo;
			}
			
		@Column(name = "AccountName", nullable = false, length = 50)
		public String getAccountName()
			{
				return this.accountName;
			}
			
		public void setAccountName(String accountName)
			{
				this.accountName = accountName;
			}
			
		@Column(name = "CreditCeiling", precision = 53, scale = 0)
		public Double getCreditCeiling()
			{
				return this.creditCeiling;
			}
			
		public void setCreditCeiling(Double creditCeiling)
			{
				this.creditCeiling = creditCeiling;
			}
			
		@Column(name = "TypeOfCredit", length = 100)
		public String getTypeOfCredit()
			{
				return this.typeOfCredit;
			}
			
		public void setTypeOfCredit(String typeOfCredit)
			{
				this.typeOfCredit = typeOfCredit;
			}
			
		@Column(name = "Interest", precision = 53, scale = 0)
		public Double getInterest()
			{
				return this.interest;
			}
			
		public void setInterest(Double interest)
			{
				this.interest = interest;
			}
			
		@Column(name = "Security", length = 100)
		public String getSecurity()
			{
				return this.security;
			}
			
		public void setSecurity(String security)
			{
				this.security = security;
			}
			
		@Column(name = "StartingBalance", precision = 53, scale = 0)
		public Double getStartingBalance()
			{
				return this.startingBalance;
			}
			
		public void setStartingBalance(Double startingBalance)
			{
				this.startingBalance = startingBalance;
			}
			
		@Column(name = "Deposito", precision = 53, scale = 0)
		public Double getDeposito()
			{
				return this.deposito;
			}
			
		public void setDeposito(Double deposito)
			{
				this.deposito = deposito;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmntBankStatementInfo")
		public Set<AgrmntBankStatInfoDtl> getAgrmntBankStatInfoDtls()
			{
				return this.agrmntBankStatInfoDtls;
			}
			
		public void setAgrmntBankStatInfoDtls(Set<AgrmntBankStatInfoDtl> agrmntBankStatInfoDtls)
			{
				this.agrmntBankStatInfoDtls = agrmntBankStatInfoDtls;
			}
			
	}
