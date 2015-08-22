
package com.adibrata.smartdealer.model;
// Generated Aug 22, 2015 3:49:51 PM by Hibernate Tools 4.3.1

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
 * PersCustOtherBussinessInfo generated by hbm2java
 */
@Entity
@Table(name = "PersCustOtherBussinessInfo", catalog = "SmartDealer")
public class PersCustOtherBussinessInfo implements java.io.Serializable
	{
		
		private long id;
		private Customer customer;
		private String businessName;
		private String businessType;
		private String businessIndustryTypeId;
		private String businessJobTitle;
		private Short businessSinceYear;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public PersCustOtherBussinessInfo()
			{
			}
			
		public PersCustOtherBussinessInfo(long id)
			{
				this.id = id;
			}
			
		public PersCustOtherBussinessInfo(long id, Customer customer, String businessName, String businessType, String businessIndustryTypeId, String businessJobTitle, Short businessSinceYear, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.customer = customer;
				this.businessName = businessName;
				this.businessType = businessType;
				this.businessIndustryTypeId = businessIndustryTypeId;
				this.businessJobTitle = businessJobTitle;
				this.businessSinceYear = businessSinceYear;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
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
			
		@Column(name = "BusinessName", length = 50)
		public String getBusinessName()
			{
				return this.businessName;
			}
			
		public void setBusinessName(String businessName)
			{
				this.businessName = businessName;
			}
			
		@Column(name = "BusinessType", length = 50)
		public String getBusinessType()
			{
				return this.businessType;
			}
			
		public void setBusinessType(String businessType)
			{
				this.businessType = businessType;
			}
			
		@Column(name = "BusinessIndustryTypeID", length = 10)
		public String getBusinessIndustryTypeId()
			{
				return this.businessIndustryTypeId;
			}
			
		public void setBusinessIndustryTypeId(String businessIndustryTypeId)
			{
				this.businessIndustryTypeId = businessIndustryTypeId;
			}
			
		@Column(name = "BusinessJobTitle", length = 50)
		public String getBusinessJobTitle()
			{
				return this.businessJobTitle;
			}
			
		public void setBusinessJobTitle(String businessJobTitle)
			{
				this.businessJobTitle = businessJobTitle;
			}
			
		@Column(name = "BusinessSinceYear")
		public Short getBusinessSinceYear()
			{
				return this.businessSinceYear;
			}
			
		public void setBusinessSinceYear(Short businessSinceYear)
			{
				this.businessSinceYear = businessSinceYear;
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
