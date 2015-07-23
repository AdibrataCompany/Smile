
package com.adibrata.smartdealer.model;
// Generated Jul 23, 2015 12:54:57 PM by Hibernate Tools 4.3.1

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
 * CoyCustLegalInfo generated by hbm2java
 */
@Entity
@Table(name = "CoyCustLegalInfo", catalog = "SmartDealer")
public class CoyCustLegalInfo implements java.io.Serializable
	{
		
		private long id;
		private Customer customer;
		private String documentType;
		private String documentNo;
		private Date documentDate;
		private Date documentExpiredDate;
		private String documentNotes;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public CoyCustLegalInfo()
			{
			}
			
		public CoyCustLegalInfo(long id, String documentType)
			{
				this.id = id;
				this.documentType = documentType;
			}
			
		public CoyCustLegalInfo(long id, Customer customer, String documentType, String documentNo, Date documentDate, Date documentExpiredDate, String documentNotes, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.customer = customer;
				this.documentType = documentType;
				this.documentNo = documentNo;
				this.documentDate = documentDate;
				this.documentExpiredDate = documentExpiredDate;
				this.documentNotes = documentNotes;
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
			
		@Column(name = "DocumentType", nullable = false, length = 10)
		public String getDocumentType()
			{
				return this.documentType;
			}
			
		public void setDocumentType(String documentType)
			{
				this.documentType = documentType;
			}
			
		@Column(name = "DocumentNo", length = 50)
		public String getDocumentNo()
			{
				return this.documentNo;
			}
			
		public void setDocumentNo(String documentNo)
			{
				this.documentNo = documentNo;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DocumentDate", length = 23)
		public Date getDocumentDate()
			{
				return this.documentDate;
			}
			
		public void setDocumentDate(Date documentDate)
			{
				this.documentDate = documentDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DocumentExpiredDate", length = 23)
		public Date getDocumentExpiredDate()
			{
				return this.documentExpiredDate;
			}
			
		public void setDocumentExpiredDate(Date documentExpiredDate)
			{
				this.documentExpiredDate = documentExpiredDate;
			}
			
		@Column(name = "DocumentNotes", length = 8000)
		public String getDocumentNotes()
			{
				return this.documentNotes;
			}
			
		public void setDocumentNotes(String documentNotes)
			{
				this.documentNotes = documentNotes;
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
