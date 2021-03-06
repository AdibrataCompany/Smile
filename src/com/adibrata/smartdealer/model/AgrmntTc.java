
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
 * AgrmntTc generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntTc", catalog = "SmartDealer")
public class AgrmntTc implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private Tcmaster tcmaster;
		private String priorTo;
		private short isChecked;
		private short isMandatory;
		private Date promiseDate;
		private Date checkedDate;
		private Date expiredDate;
		private String notes;
		private String cmnotes;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public AgrmntTc()
			{
			}
			
		public AgrmntTc(long id, String priorTo, short isChecked, short isMandatory)
			{
				this.id = id;
				this.priorTo = priorTo;
				this.isChecked = isChecked;
				this.isMandatory = isMandatory;
			}
			
		public AgrmntTc(long id, Agrmnt agrmnt, Tcmaster tcmaster, String priorTo, short isChecked, short isMandatory, Date promiseDate, Date checkedDate, Date expiredDate, String notes, String cmnotes, Date dtmUpd, String usrUpd, Date dtmCrt,
		        String usrCrt)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.tcmaster = tcmaster;
				this.priorTo = priorTo;
				this.isChecked = isChecked;
				this.isMandatory = isMandatory;
				this.promiseDate = promiseDate;
				this.checkedDate = checkedDate;
				this.expiredDate = expiredDate;
				this.notes = notes;
				this.cmnotes = cmnotes;
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
		@JoinColumn(name = "AgrmntId")
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		public void setAgrmnt(Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "TCMasterId")
		public Tcmaster getTcmaster()
			{
				return this.tcmaster;
			}
			
		public void setTcmaster(Tcmaster tcmaster)
			{
				this.tcmaster = tcmaster;
			}
			
		@Column(name = "PriorTo", nullable = false, length = 3)
		public String getPriorTo()
			{
				return this.priorTo;
			}
			
		public void setPriorTo(String priorTo)
			{
				this.priorTo = priorTo;
			}
			
		@Column(name = "IsChecked", nullable = false)
		public short getIsChecked()
			{
				return this.isChecked;
			}
			
		public void setIsChecked(short isChecked)
			{
				this.isChecked = isChecked;
			}
			
		@Column(name = "IsMandatory", nullable = false)
		public short getIsMandatory()
			{
				return this.isMandatory;
			}
			
		public void setIsMandatory(short isMandatory)
			{
				this.isMandatory = isMandatory;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "PromiseDate", length = 23)
		public Date getPromiseDate()
			{
				return this.promiseDate;
			}
			
		public void setPromiseDate(Date promiseDate)
			{
				this.promiseDate = promiseDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "CheckedDate", length = 23)
		public Date getCheckedDate()
			{
				return this.checkedDate;
			}
			
		public void setCheckedDate(Date checkedDate)
			{
				this.checkedDate = checkedDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ExpiredDate", length = 23)
		public Date getExpiredDate()
			{
				return this.expiredDate;
			}
			
		public void setExpiredDate(Date expiredDate)
			{
				this.expiredDate = expiredDate;
			}
			
		@Column(name = "Notes", length = 8000)
		public String getNotes()
			{
				return this.notes;
			}
			
		public void setNotes(String notes)
			{
				this.notes = notes;
			}
			
		@Column(name = "CMNotes", length = 8000)
		public String getCmnotes()
			{
				return this.cmnotes;
			}
			
		public void setCmnotes(String cmnotes)
			{
				this.cmnotes = cmnotes;
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
		@Column(name = "DtmCrt", length = 23)
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
