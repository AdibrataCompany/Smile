
package com.adibrata.smartdealer.model;
// Generated Aug 10, 2015 3:51:21 PM by Hibernate Tools 4.3.1

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
 * CoyCustShareInfo generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "CoyCustShareInfo", catalog = "SmartDealer")
public class CoyCustShareInfo implements java.io.Serializable
	{
		
		private long id;
		private Customer customer;
		private String name;
		private String idnumber;
		private String jobPositionId;
		private String address;
		private String phone;
		private Double sharePercentage;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public CoyCustShareInfo()
			{
			}
			
		public CoyCustShareInfo(long id, String name, String jobPositionId)
			{
				this.id = id;
				this.name = name;
				this.jobPositionId = jobPositionId;
			}
			
		public CoyCustShareInfo(long id, Customer customer, String name, String idnumber, String jobPositionId, String address, String phone, Double sharePercentage, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.customer = customer;
				this.name = name;
				this.idnumber = idnumber;
				this.jobPositionId = jobPositionId;
				this.address = address;
				this.phone = phone;
				this.sharePercentage = sharePercentage;
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
		@JoinColumn(name = "CustomerId")
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(Customer customer)
			{
				this.customer = customer;
			}
			
		@Column(name = "Name", nullable = false, length = 50)
		public String getName()
			{
				return this.name;
			}
			
		public void setName(String name)
			{
				this.name = name;
			}
			
		@Column(name = "IDNumber", length = 40)
		public String getIdnumber()
			{
				return this.idnumber;
			}
			
		public void setIdnumber(String idnumber)
			{
				this.idnumber = idnumber;
			}
			
		@Column(name = "JobPositionID", nullable = false, length = 10)
		public String getJobPositionId()
			{
				return this.jobPositionId;
			}
			
		public void setJobPositionId(String jobPositionId)
			{
				this.jobPositionId = jobPositionId;
			}
			
		@Column(name = "Address", length = 100)
		public String getAddress()
			{
				return this.address;
			}
			
		public void setAddress(String address)
			{
				this.address = address;
			}
			
		@Column(name = "Phone", length = 50)
		public String getPhone()
			{
				return this.phone;
			}
			
		public void setPhone(String phone)
			{
				this.phone = phone;
			}
			
		@Column(name = "SharePercentage", precision = 53, scale = 0)
		public Double getSharePercentage()
			{
				return this.sharePercentage;
			}
			
		public void setSharePercentage(Double sharePercentage)
			{
				this.sharePercentage = sharePercentage;
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
