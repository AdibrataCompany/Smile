
package com.adibrata.smartdealer.model;
// Generated Aug 22, 2015 3:49:51 PM by Hibernate Tools 4.3.1

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
 * CustomerBankInfo generated by hbm2java
 */
@Entity
@Table(name = "CustomerBankInfo", catalog = "SmartDealer")
public class CustomerBankInfo implements java.io.Serializable
	{
		
		private long id;
		private Customer customer;
		private String bankCode;
		private String bankBranch;
		private String accountNo;
		private String accountName;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public CustomerBankInfo()
			{
			}
			
		public CustomerBankInfo(long id)
			{
				this.id = id;
			}
			
		public CustomerBankInfo(long id, Customer customer, String bankCode, String bankBranch, String accountNo, String accountName, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.customer = customer;
				this.bankCode = bankCode;
				this.bankBranch = bankBranch;
				this.accountNo = accountNo;
				this.accountName = accountName;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
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
		@JoinColumn(name = "CustomerId")
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(Customer customer)
			{
				this.customer = customer;
			}
			
		@Column(name = "BankCode", length = 20)
		public String getBankCode()
			{
				return this.bankCode;
			}
			
		public void setBankCode(String bankCode)
			{
				this.bankCode = bankCode;
			}
			
		@Column(name = "BankBranch", length = 50)
		public String getBankBranch()
			{
				return this.bankBranch;
			}
			
		public void setBankBranch(String bankBranch)
			{
				this.bankBranch = bankBranch;
			}
			
		@Column(name = "AccountNo", length = 20)
		public String getAccountNo()
			{
				return this.accountNo;
			}
			
		public void setAccountNo(String accountNo)
			{
				this.accountNo = accountNo;
			}
			
		@Column(name = "AccountName", length = 50)
		public String getAccountName()
			{
				return this.accountName;
			}
			
		public void setAccountName(String accountName)
			{
				this.accountName = accountName;
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
			
	}
