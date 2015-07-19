
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
 * PersCustCcinfo generated by hbm2java
 */
@Entity
@Table(name = "PersCustCCInfo", catalog = "SmartDealer")
public class PersCustCcinfo implements java.io.Serializable
	{
		
		private long id;
		private Customer customer;
		private String creditCardNo;
		private String creditCardName;
		private String creditCardType;
		private short creditCardPeriodYears;
		private short creditCardPeriodMonths;
		private Double creditCardCreditLimit;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public PersCustCcinfo()
			{
			}
		
		public PersCustCcinfo(long id, String creditCardNo, String creditCardName, String creditCardType, short creditCardPeriodYears, short creditCardPeriodMonths, Double creditCardCreditLimit)
			{
				this.id = id;
				this.creditCardNo = creditCardNo;
				this.creditCardName = creditCardName;
				this.creditCardType = creditCardType;
				this.creditCardPeriodYears = creditCardPeriodYears;
				this.creditCardPeriodMonths = creditCardPeriodMonths;
				this.creditCardCreditLimit = creditCardCreditLimit;
			}
		
		public PersCustCcinfo(long id, Customer customer, String creditCardNo, String creditCardName, String creditCardType, short creditCardPeriodYears, short creditCardPeriodMonths, Double creditCardCreditLimit, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.customer = customer;
				this.creditCardNo = creditCardNo;
				this.creditCardName = creditCardName;
				this.creditCardType = creditCardType;
				this.creditCardPeriodYears = creditCardPeriodYears;
				this.creditCardPeriodMonths = creditCardPeriodMonths;
				this.creditCardCreditLimit = creditCardCreditLimit;
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
		@JoinColumn(name = "CustomerId")
		public Customer getCustomer()
			{
				return this.customer;
			}
		
		public void setCustomer(Customer customer)
			{
				this.customer = customer;
			}
		
		@Column(name = "CreditCardNo", nullable = false, length = 50)
		public String getCreditCardNo()
			{
				return this.creditCardNo;
			}
		
		public void setCreditCardNo(String creditCardNo)
			{
				this.creditCardNo = creditCardNo;
			}
		
		@Column(name = "CreditCardName", nullable = false, length = 10)
		public String getCreditCardName()
			{
				return this.creditCardName;
			}
		
		public void setCreditCardName(String creditCardName)
			{
				this.creditCardName = creditCardName;
			}
		
		@Column(name = "CreditCardType", nullable = false, length = 10)
		public String getCreditCardType()
			{
				return this.creditCardType;
			}
		
		public void setCreditCardType(String creditCardType)
			{
				this.creditCardType = creditCardType;
			}
		
		@Column(name = "CreditCardPeriodYears", nullable = false)
		public short getCreditCardPeriodYears()
			{
				return this.creditCardPeriodYears;
			}
		
		public void setCreditCardPeriodYears(short creditCardPeriodYears)
			{
				this.creditCardPeriodYears = creditCardPeriodYears;
			}
		
		@Column(name = "CreditCardPeriodMonths", nullable = false)
		public short getCreditCardPeriodMonths()
			{
				return this.creditCardPeriodMonths;
			}
		
		public void setCreditCardPeriodMonths(short creditCardPeriodMonths)
			{
				this.creditCardPeriodMonths = creditCardPeriodMonths;
			}
		
		@Column(name = "CreditCardCreditLimit", nullable = false, precision = 17)
		public Double getCreditCardCreditLimit()
			{
				return this.creditCardCreditLimit;
			}
		
		public void setCreditCardCreditLimit(Double creditCardCreditLimit)
			{
				this.creditCardCreditLimit = creditCardCreditLimit;
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
