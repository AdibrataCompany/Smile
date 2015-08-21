
package com.adibrata.smartdealer.model;
// Generated Aug 21, 2015 4:05:17 PM by Hibernate Tools 4.3.1

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
 * InsCoOfficeFee generated by hbm2java
 */
@Entity
@Table(name = "InsCoOfficeFee", catalog = "SmartDealer")
public class InsCoOfficeFee implements java.io.Serializable
	{
		
		private long id;
		private Currency currency;
		private InsCoOffice insCoOffice;
		private Double adminFee;
		private Double stampDutyFee;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public InsCoOfficeFee()
			{
			}
			
		public InsCoOfficeFee(long id, Currency currency)
			{
				this.id = id;
				this.currency = currency;
			}
			
		public InsCoOfficeFee(long id, Currency currency, InsCoOffice insCoOffice, Double adminFee, Double stampDutyFee, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.currency = currency;
				this.insCoOffice = insCoOffice;
				this.adminFee = adminFee;
				this.stampDutyFee = stampDutyFee;
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
		public InsCoOffice getInsCoOffice()
			{
				return this.insCoOffice;
			}
			
		public void setInsCoOffice(InsCoOffice insCoOffice)
			{
				this.insCoOffice = insCoOffice;
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