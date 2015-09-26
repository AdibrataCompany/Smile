
package com.adibrata.smartdealer.model;
// Generated Sep 10, 2015 12:03:09 PM by Hibernate Tools 4.3.1

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
 * CurrHistory generated by hbm2java
 */
@Entity
@Table(name = "CurrHistory", catalog = "SmartDealer")
public class CurrHistory implements java.io.Serializable
	{
		
		private long id;
		private Currency currency;
		private Date historyDate;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public CurrHistory()
			{
			}
			
		public CurrHistory(long id)
			{
				this.id = id;
			}
			
		public CurrHistory(long id, Currency currency, Date historyDate, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.currency = currency;
				this.historyDate = historyDate;
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
		@JoinColumn(name = "CurrId")
		public Currency getCurrency()
			{
				return this.currency;
			}
			
		public void setCurrency(Currency currency)
			{
				this.currency = currency;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "HistoryDate", length = 23)
		public Date getHistoryDate()
			{
				return this.historyDate;
			}
			
		public void setHistoryDate(Date historyDate)
			{
				this.historyDate = historyDate;
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
