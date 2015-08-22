
package com.adibrata.smartdealer.model;
// Generated Aug 23, 2015 12:40:11 AM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Holiday generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "Holiday", catalog = "SmartDealer")
public class Holiday implements java.io.Serializable
	{
		
		private static final long serialVersionUID = 1L; private long id;
		private String partnerCode;
		private Long officeId;
		private Date holidayDate;
		private String description;
		private boolean isRealHoliday;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public Holiday()
			{
			}
			
		public Holiday(long id, Date holidayDate, String description, boolean isRealHoliday)
			{
				this.id = id;
				this.holidayDate = holidayDate;
				this.description = description;
				this.isRealHoliday = isRealHoliday;
			}
			
		public Holiday(long id, String partnerCode, Long officeId, Date holidayDate, String description, boolean isRealHoliday, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.partnerCode = partnerCode;
				this.officeId = officeId;
				this.holidayDate = holidayDate;
				this.description = description;
				this.isRealHoliday = isRealHoliday;
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
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "HolidayDate", nullable = false, length = 23)
		public Date getHolidayDate()
			{
				return this.holidayDate;
			}
			
		public void setHolidayDate(Date holidayDate)
			{
				this.holidayDate = holidayDate;
			}
			
		@Column(name = "Description", nullable = false, length = 100)
		public String getDescription()
			{
				return this.description;
			}
			
		public void setDescription(String description)
			{
				this.description = description;
			}
			
		@Column(name = "IsRealHoliday", nullable = false)
		public boolean isIsRealHoliday()
			{
				return this.isRealHoliday;
			}
			
		public void setIsRealHoliday(boolean isRealHoliday)
			{
				this.isRealHoliday = isRealHoliday;
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
