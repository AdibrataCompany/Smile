
package com.adibrata.smartdealer.model;
// Generated Jul 29, 2015 11:56:50 PM by Hibernate Tools 4.3.1

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
 * CashierHistory generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "CashierHistory", catalog = "SmartDealer")
public class CashierHistory implements java.io.Serializable
	{
		
		private long id;
		private Currency currency;
		private String partnerCode;
		private Long officeId;
		private Long employeeId;
		private Short openSeqNo;
		private Date openingDtm;
		private Double openingAmount;
		private Double balanceAmount;
		private String cashierStatus;
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
			
		public CashierHistory(long id, Currency currency, String partnerCode, Long officeId, Long employeeId, Short openSeqNo, Date openingDtm, Double openingAmount, Double balanceAmount, String cashierStatus, Date closingDtm, Date dtmUpd,
		        String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.currency = currency;
				this.partnerCode = partnerCode;
				this.officeId = officeId;
				this.employeeId = employeeId;
				this.openSeqNo = openSeqNo;
				this.openingDtm = openingDtm;
				this.openingAmount = openingAmount;
				this.balanceAmount = balanceAmount;
				this.cashierStatus = cashierStatus;
				this.closingDtm = closingDtm;
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
		@JoinColumn(name = "CurrencyId")
		public Currency getCurrency()
			{
				return this.currency;
			}
			
		public void setCurrency(Currency currency)
			{
				this.currency = currency;
			}
			
		@Column(name = "PartnerCode", length = 20)
		public String getPartnerCode()
			{
				return this.partnerCode;
			}
			
		public void setPartnerCode(String partnerCode)
			{
				this.partnerCode = partnerCode;
			}
			
		@Column(name = "OfficeId")
		public Long getOfficeId()
			{
				return this.officeId;
			}
			
		public void setOfficeId(Long officeId)
			{
				this.officeId = officeId;
			}
			
		@Column(name = "EmployeeId")
		public Long getEmployeeId()
			{
				return this.employeeId;
			}
			
		public void setEmployeeId(Long employeeId)
			{
				this.employeeId = employeeId;
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
