
package com.adibrata.smartdealer.model;

// Generated Jul 19, 2015 10:57:21 PM by Hibernate Tools 4.3.1

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
 * SalesInvoice generated by hbm2java
 */
@Entity
@Table(name = "SalesInvoice", catalog = "SmartDealer")
public class SalesInvoice implements java.io.Serializable
	{
		
		private long id;
		private Customer customer;
		private Office office;
		private Partner partner;
		private SalesOrderHdr salesOrderHdr;
		private Double invoiceAmount;
		private Double invoicePaid;
		private Date invoiceDate;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public SalesInvoice()
			{
			}
		
		public SalesInvoice(long id)
			{
				this.id = id;
			}
		
		public SalesInvoice(long id, Customer customer, Office office, Partner partner, SalesOrderHdr salesOrderHdr, Double invoiceAmount, Double invoicePaid, Date invoiceDate, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.customer = customer;
				this.office = office;
				this.partner = partner;
				this.salesOrderHdr = salesOrderHdr;
				this.invoiceAmount = invoiceAmount;
				this.invoicePaid = invoicePaid;
				this.invoiceDate = invoiceDate;
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
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "OfficeId")
		public Office getOffice()
			{
				return this.office;
			}
		
		public void setOffice(Office office)
			{
				this.office = office;
			}
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "PartnerCode")
		public Partner getPartner()
			{
				return this.partner;
			}
		
		public void setPartner(Partner partner)
			{
				this.partner = partner;
			}
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "SalesOrderId")
		public SalesOrderHdr getSalesOrderHdr()
			{
				return this.salesOrderHdr;
			}
		
		public void setSalesOrderHdr(SalesOrderHdr salesOrderHdr)
			{
				this.salesOrderHdr = salesOrderHdr;
			}
		
		@Column(name = "InvoiceAmount", precision = 53, scale = 0)
		public Double getInvoiceAmount()
			{
				return this.invoiceAmount;
			}
		
		public void setInvoiceAmount(Double invoiceAmount)
			{
				this.invoiceAmount = invoiceAmount;
			}
		
		@Column(name = "InvoicePaid", precision = 53, scale = 0)
		public Double getInvoicePaid()
			{
				return this.invoicePaid;
			}
		
		public void setInvoicePaid(Double invoicePaid)
			{
				this.invoicePaid = invoicePaid;
			}
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "InvoiceDate", length = 23)
		public Date getInvoiceDate()
			{
				return this.invoiceDate;
			}
		
		public void setInvoiceDate(Date invoiceDate)
			{
				this.invoiceDate = invoiceDate;
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
