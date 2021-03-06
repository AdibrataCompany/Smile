
package com.adibrata.smartdealer.model;
// Generated Sep 27, 2015 10:48:45 AM by Hibernate Tools 4.3.1.Final

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
 * PersCustEntInfo generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "PersCustEntInfo", catalog = "SmartDealer")
public class PersCustEntInfo implements java.io.Serializable
	{
		
		private long id;
		private Customer customer;
		private Double monthlyFixedIncome;
		private Double monthlyVariableIncome;
		private Double fixedIncome;
		private Double variableIncome;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public PersCustEntInfo()
			{
			}
			
		public PersCustEntInfo(long id)
			{
				this.id = id;
			}
			
		public PersCustEntInfo(long id, Customer customer, Double monthlyFixedIncome, Double monthlyVariableIncome, Double fixedIncome, Double variableIncome, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.customer = customer;
				this.monthlyFixedIncome = monthlyFixedIncome;
				this.monthlyVariableIncome = monthlyVariableIncome;
				this.fixedIncome = fixedIncome;
				this.variableIncome = variableIncome;
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
		@JoinColumn(name = "CustomerId")
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(Customer customer)
			{
				this.customer = customer;
			}
			
		@Column(name = "MonthlyFixedIncome", precision = 53, scale = 0)
		public Double getMonthlyFixedIncome()
			{
				return this.monthlyFixedIncome;
			}
			
		public void setMonthlyFixedIncome(Double monthlyFixedIncome)
			{
				this.monthlyFixedIncome = monthlyFixedIncome;
			}
			
		@Column(name = "MonthlyVariableIncome", precision = 53, scale = 0)
		public Double getMonthlyVariableIncome()
			{
				return this.monthlyVariableIncome;
			}
			
		public void setMonthlyVariableIncome(Double monthlyVariableIncome)
			{
				this.monthlyVariableIncome = monthlyVariableIncome;
			}
			
		@Column(name = "FixedIncome", precision = 53, scale = 0)
		public Double getFixedIncome()
			{
				return this.fixedIncome;
			}
			
		public void setFixedIncome(Double fixedIncome)
			{
				this.fixedIncome = fixedIncome;
			}
			
		@Column(name = "VariableIncome", precision = 53, scale = 0)
		public Double getVariableIncome()
			{
				return this.variableIncome;
			}
			
		public void setVariableIncome(Double variableIncome)
			{
				this.variableIncome = variableIncome;
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
