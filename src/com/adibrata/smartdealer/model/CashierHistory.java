
package com.adibrata.smartdealer.model;
// Generated Aug 15, 2015 10:59:05 PM by Hibernate Tools 4.3.1

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
 * CashierHistory generated by hbm2java
 */
@Entity
@Table(name = "CashierHistory", catalog = "SmartDealer")
public class CashierHistory implements java.io.Serializable
	{
		
		private long id;
		private Currency currency;
		private Employee employee;
		private Office office;
		private Partner partner;
		private Short openSeqNo;
		private Date openDate;
		private Date openingDtm;
		private Double openingAmount;
		private Double balanceAmount;
		private String cashierStatus;
		private Date closingDate;
		private Date closingDtm;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public CashierHistory()
			{
			}
			
		public CashierHistory(long id)
			{
				this.id = id;
			}
			
		public CashierHistory(long id, Currency currency, Employee employee, Office office, Partner partner, Short openSeqNo, Date openDate, Date openingDtm, Double openingAmount, Double balanceAmount, String cashierStatus, Date closingDate,
		        Date closingDtm, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.currency = currency;
				this.employee = employee;
				this.office = office;
				this.partner = partner;
				this.openSeqNo = openSeqNo;
				this.openDate = openDate;
				this.openingDtm = openingDtm;
				this.openingAmount = openingAmount;
				this.balanceAmount = balanceAmount;
				this.cashierStatus = cashierStatus;
				this.closingDate = closingDate;
				this.closingDtm = closingDtm;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
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
		@JoinColumn(name = "CurrencyId")
		public Currency getCurrency()
			{
				return this.currency;
			}
			
		public void setCurrency(Currency currency)
			{
				this.currency = currency;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "EmployeeId")
		public Employee getEmployee()
			{
				return this.employee;
			}
			
		public void setEmployee(Employee employee)
			{
				this.employee = employee;
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
			
		@Column(name = "OpenSeqNo")
		public Short getOpenSeqNo()
			{
				return this.openSeqNo;
			}
			
		public void setOpenSeqNo(Short openSeqNo)
			{
				this.openSeqNo = openSeqNo;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "OpenDate", length = 23)
		public Date getOpenDate()
			{
				return this.openDate;
			}
			
		public void setOpenDate(Date openDate)
			{
				this.openDate = openDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "OpeningDtm", length = 23)
		public Date getOpeningDtm()
			{
				return this.openingDtm;
			}
			
		public void setOpeningDtm(Date openingDtm)
			{
				this.openingDtm = openingDtm;
			}
			
		@Column(name = "OpeningAmount", precision = 53, scale = 0)
		public Double getOpeningAmount()
			{
				return this.openingAmount;
			}
			
		public void setOpeningAmount(Double openingAmount)
			{
				this.openingAmount = openingAmount;
			}
			
		@Column(name = "BalanceAmount", precision = 53, scale = 0)
		public Double getBalanceAmount()
			{
				return this.balanceAmount;
			}
			
		public void setBalanceAmount(Double balanceAmount)
			{
				this.balanceAmount = balanceAmount;
			}
			
		@Column(name = "CashierStatus", length = 2)
		public String getCashierStatus()
			{
				return this.cashierStatus;
			}
			
		public void setCashierStatus(String cashierStatus)
			{
				this.cashierStatus = cashierStatus;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ClosingDate", length = 23)
		public Date getClosingDate()
			{
				return this.closingDate;
			}
			
		public void setClosingDate(Date closingDate)
			{
				this.closingDate = closingDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ClosingDtm", length = 23)
		public Date getClosingDtm()
			{
				return this.closingDtm;
			}
			
		public void setClosingDtm(Date closingDtm)
			{
				this.closingDtm = closingDtm;
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
