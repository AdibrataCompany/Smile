
package com.adibrata.smartdealer.model;
// Generated Jul 27, 2015 2:07:03 PM by Hibernate Tools 4.3.1

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
 * PurchaseInvoice generated by hbm2java
 */
@Entity
@Table(name = "PurchaseInvoice", catalog = "SmartDealer")
public class PurchaseInvoice implements java.io.Serializable
	{
		
		private long id;
		private Office office;
		private Partner partner;
		private PurchaseOrderHdr purchaseOrderHdr;
		private Supplier supplier;
		private String poinvNo;
		private Double invoiceAmount;
		private Double invoicePaid;
		private Date invoiceDate;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public PurchaseInvoice()
			{
			}
			
		public PurchaseInvoice(long id)
			{
				this.id = id;
			}
			
		public PurchaseInvoice(long id, Office office, Partner partner, PurchaseOrderHdr purchaseOrderHdr, Supplier supplier, String poinvNo, Double invoiceAmount, Double invoicePaid, Date invoiceDate, String usrCrt, Date dtmUpd, String usrUpd,
		        Date dtmCrt)
			{
				this.id = id;
				this.office = office;
				this.partner = partner;
				this.purchaseOrderHdr = purchaseOrderHdr;
				this.supplier = supplier;
				this.poinvNo = poinvNo;
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
		@JoinColumn(name = "PurchaseOrderId")
		public PurchaseOrderHdr getPurchaseOrderHdr()
			{
				return this.purchaseOrderHdr;
			}
			
		public void setPurchaseOrderHdr(PurchaseOrderHdr purchaseOrderHdr)
			{
				this.purchaseOrderHdr = purchaseOrderHdr;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "SupplierId")
		public Supplier getSupplier()
			{
				return this.supplier;
			}
			
		public void setSupplier(Supplier supplier)
			{
				this.supplier = supplier;
			}
			
		@Column(name = "POInvNo", length = 50)
		public String getPoinvNo()
			{
				return this.poinvNo;
			}
			
		public void setPoinvNo(String poinvNo)
			{
				this.poinvNo = poinvNo;
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
