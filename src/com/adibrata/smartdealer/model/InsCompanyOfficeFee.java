
package com.adibrata.smartdealer.model;
// Generated Jul 23, 2015 8:14:47 PM by Hibernate Tools 4.3.1

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
 * InsCompanyOfficeFee generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "InsCompanyOfficeFee", catalog = "SmartDealer")
public class InsCompanyOfficeFee implements java.io.Serializable
	{
		
		private long id;
		private Currency currency;
		private InsCompanyOffice insCompanyOffice;
		private Double adminFee;
		private Double stampDutyFee;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public InsCompanyOfficeFee()
			{
			}
			
		public InsCompanyOfficeFee(long id, Currency currency)
			{
				this.id = id;
				this.currency = currency;
			}
			
		public InsCompanyOfficeFee(long id, Currency currency, InsCompanyOffice insCompanyOffice, Double adminFee, Double stampDutyFee, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.currency = currency;
				this.insCompanyOffice = insCompanyOffice;
				this.adminFee = adminFee;
				this.stampDutyFee = stampDutyFee;
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
		@JoinColumn(name = "CurrencyId", nullable = false)
		public Currency getCurrency()
			{
				return this.currency;
			}
			
		public void setCurrency(Currency currency)
			{
				this.currency = currency;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "InsCompanyOfficeId")
		public InsCompanyOffice getInsCompanyOffice()
			{
				return this.insCompanyOffice;
			}
			
		public void setInsCompanyOffice(InsCompanyOffice insCompanyOffice)
			{
				this.insCompanyOffice = insCompanyOffice;
			}
			
		@Column(name = "AdminFee", precision = 53, scale = 0)
		public Double getAdminFee()
			{
				return this.adminFee;
			}
			
		public void setAdminFee(Double adminFee)
			{
				this.adminFee = adminFee;
			}
			
		@Column(name = "StampDutyFee", precision = 53, scale = 0)
		public Double getStampDutyFee()
			{
				return this.stampDutyFee;
			}
			
		public void setStampDutyFee(Double stampDutyFee)
			{
				this.stampDutyFee = stampDutyFee;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmUpd", length = 23)
		public Date getDtmUpd()
			{
				return this.dtmUpd;
			}
			
		public void setDtmUpd(Date dtmUpd)
			{
				this.dtmUpd = dtmUpd;
			}
			
		@Column(name = "UsrUpd")
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		public void setUsrUpd(String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmCrt", length = 23)
		public Date getDtmCrt()
			{
				return this.dtmCrt;
			}
			
		public void setDtmCrt(Date dtmCrt)
			{
				this.dtmCrt = dtmCrt;
			}
			
		@Column(name = "UsrCrt")
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		public void setUsrCrt(String usrCrt)
			{
				this.usrCrt = usrCrt;
			}
			
	}
