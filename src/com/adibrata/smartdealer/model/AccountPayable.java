
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
 * AccountPayable generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AccountPayable", catalog = "SmartDealer")
public class AccountPayable implements java.io.Serializable
	{
		
		private long id;
		private Office office;
		private Partner partner;
		private String apno;
		private String aptype;
		private String apstatus;
		private Date apdate;
		private String referenceNo;
		private String description;
		private Date dueDate;
		private long currencyId;
		private double currencyRate;
		private Double apamount;
		private Double apdisburse;
		private String apto;
		private String accNameTo;
		private String accNoTo;
		private String bankMasterTo;
		private String bankBranchTo;
		private Long officeDisbId;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private Set<Pvdetail> pvdetails = new HashSet<Pvdetail>(0);
		
		public AccountPayable()
			{
			}
			
		public AccountPayable(long id, String referenceNo, String description, long currencyId, double currencyRate, String apto, String accNameTo, String accNoTo, String bankMasterTo, String bankBranchTo)
			{
				this.id = id;
				this.referenceNo = referenceNo;
				this.description = description;
				this.currencyId = currencyId;
				this.currencyRate = currencyRate;
				this.apto = apto;
				this.accNameTo = accNameTo;
				this.accNoTo = accNoTo;
				this.bankMasterTo = bankMasterTo;
				this.bankBranchTo = bankBranchTo;
			}
			
		public AccountPayable(long id, Office office, Partner partner, String apno, String aptype, String apstatus, Date apdate, String referenceNo, String description, Date dueDate, long currencyId, double currencyRate, Double apamount,
		        Double apdisburse, String apto, String accNameTo, String accNoTo, String bankMasterTo, String bankBranchTo, Long officeDisbId, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt, Set<Pvdetail> pvdetails)
			{
				this.id = id;
				this.office = office;
				this.partner = partner;
				this.apno = apno;
				this.aptype = aptype;
				this.apstatus = apstatus;
				this.apdate = apdate;
				this.referenceNo = referenceNo;
				this.description = description;
				this.dueDate = dueDate;
				this.currencyId = currencyId;
				this.currencyRate = currencyRate;
				this.apamount = apamount;
				this.apdisburse = apdisburse;
				this.apto = apto;
				this.accNameTo = accNameTo;
				this.accNoTo = accNoTo;
				this.bankMasterTo = bankMasterTo;
				this.bankBranchTo = bankBranchTo;
				this.officeDisbId = officeDisbId;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.pvdetails = pvdetails;
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
			
		@Column(name = "APNo", length = 50)
		public String getApno()
			{
				return this.apno;
			}
			
		public void setApno(String apno)
			{
				this.apno = apno;
			}
			
		@Column(name = "APType", length = 5)
		public String getAptype()
			{
				return this.aptype;
			}
			
		public void setAptype(String aptype)
			{
				this.aptype = aptype;
			}
			
		@Column(name = "APStatus", length = 2)
		public String getApstatus()
			{
				return this.apstatus;
			}
			
		public void setApstatus(String apstatus)
			{
				this.apstatus = apstatus;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "APDate", length = 23)
		public Date getApdate()
			{
				return this.apdate;
			}
			
		public void setApdate(Date apdate)
			{
				this.apdate = apdate;
			}
			
		@Column(name = "ReferenceNo", nullable = false, length = 20)
		public String getReferenceNo()
			{
				return this.referenceNo;
			}
			
		public void setReferenceNo(String referenceNo)
			{
				this.referenceNo = referenceNo;
			}
			
		@Column(name = "Description", nullable = false, length = 200)
		public String getDescription()
			{
				return this.description;
			}
			
		public void setDescription(String description)
			{
				this.description = description;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DueDate", length = 23)
		public Date getDueDate()
			{
				return this.dueDate;
			}
			
		public void setDueDate(Date dueDate)
			{
				this.dueDate = dueDate;
			}
			
		@Column(name = "CurrencyID", nullable = false)
		public long getCurrencyId()
			{
				return this.currencyId;
			}
			
		public void setCurrencyId(long currencyId)
			{
				this.currencyId = currencyId;
			}
			
		@Column(name = "CurrencyRate", nullable = false, precision = 53, scale = 0)
		public double getCurrencyRate()
			{
				return this.currencyRate;
			}
			
		public void setCurrencyRate(double currencyRate)
			{
				this.currencyRate = currencyRate;
			}
			
		@Column(name = "APAmount", precision = 53, scale = 0)
		public Double getApamount()
			{
				return this.apamount;
			}
			
		public void setApamount(Double apamount)
			{
				this.apamount = apamount;
			}
			
		@Column(name = "APDisburse", precision = 53, scale = 0)
		public Double getApdisburse()
			{
				return this.apdisburse;
			}
			
		public void setApdisburse(Double apdisburse)
			{
				this.apdisburse = apdisburse;
			}
			
		@Column(name = "APTo", nullable = false, length = 50)
		public String getApto()
			{
				return this.apto;
			}
			
		public void setApto(String apto)
			{
				this.apto = apto;
			}
			
		@Column(name = "AccNameTo", nullable = false, length = 50)
		public String getAccNameTo()
			{
				return this.accNameTo;
			}
			
		public void setAccNameTo(String accNameTo)
			{
				this.accNameTo = accNameTo;
			}
			
		@Column(name = "AccNoTo", nullable = false, length = 50)
		public String getAccNoTo()
			{
				return this.accNoTo;
			}
			
		public void setAccNoTo(String accNoTo)
			{
				this.accNoTo = accNoTo;
			}
			
		@Column(name = "BankMasterTo", nullable = false, length = 50)
		public String getBankMasterTo()
			{
				return this.bankMasterTo;
			}
			
		public void setBankMasterTo(String bankMasterTo)
			{
				this.bankMasterTo = bankMasterTo;
			}
			
		@Column(name = "BankBranchTo", nullable = false, length = 50)
		public String getBankBranchTo()
			{
				return this.bankBranchTo;
			}
			
		public void setBankBranchTo(String bankBranchTo)
			{
				this.bankBranchTo = bankBranchTo;
			}
			
		@Column(name = "OfficeDisbId")
		public Long getOfficeDisbId()
			{
				return this.officeDisbId;
			}
			
		public void setOfficeDisbId(Long officeDisbId)
			{
				this.officeDisbId = officeDisbId;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "accountPayable")
		public Set<Pvdetail> getPvdetails()
			{
				return this.pvdetails;
			}
			
		public void setPvdetails(Set<Pvdetail> pvdetails)
			{
				this.pvdetails = pvdetails;
			}
			
	}
