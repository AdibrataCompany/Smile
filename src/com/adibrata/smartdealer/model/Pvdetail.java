
package com.adibrata.smartdealer.model;
// Generated Jul 21, 2015 1:45:23 PM by Hibernate Tools 4.3.1

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
 * Pvdetail generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "PVDetail", catalog = "SmartDealer")
public class Pvdetail implements java.io.Serializable
	{
		
		private long id;
		private AccountPayable accountPayable;
		private PaymentVoucher paymentVoucher;
		private Double apBalance;
		private Double pvamount;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public Pvdetail()
			{
			}
			
		public Pvdetail(long id)
			{
				this.id = id;
			}
			
		public Pvdetail(long id, AccountPayable accountPayable, PaymentVoucher paymentVoucher, Double apBalance, Double pvamount, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.accountPayable = accountPayable;
				this.paymentVoucher = paymentVoucher;
				this.apBalance = apBalance;
				this.pvamount = pvamount;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
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
		@JoinColumn(name = "APId")
		public AccountPayable getAccountPayable()
			{
				return this.accountPayable;
			}
			
		public void setAccountPayable(AccountPayable accountPayable)
			{
				this.accountPayable = accountPayable;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "PVId")
		public PaymentVoucher getPaymentVoucher()
			{
				return this.paymentVoucher;
			}
			
		public void setPaymentVoucher(PaymentVoucher paymentVoucher)
			{
				this.paymentVoucher = paymentVoucher;
			}
			
		@Column(name = "ApBalance", precision = 53, scale = 0)
		public Double getApBalance()
			{
				return this.apBalance;
			}
			
		public void setApBalance(Double apBalance)
			{
				this.apBalance = apBalance;
			}
			
		@Column(name = "PVAmount", precision = 53, scale = 0)
		public Double getPvamount()
			{
				return this.pvamount;
			}
			
		public void setPvamount(Double pvamount)
			{
				this.pvamount = pvamount;
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
