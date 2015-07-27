
package com.adibrata.smartdealer.model;
// Generated Jul 27, 2015 12:24:25 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SalesOrderHdr generated by hbm2java
 */
@Entity
@Table(name = "SalesOrderHdr", catalog = "SmartDealer")
public class SalesOrderHdr implements java.io.Serializable
	{
		
		private long id;
		private CoaSchmHdr coaSchmHdr;
		private Customer customer;
		private Employee employee;
		private Leasing leasing;
		private Office office;
		private Partner partner;
		private String sono;
		private Date postingDate;
		private Date valueDate;
		private Double soamount;
		private Double sotaxPercent;
		private Double sotaxAmount;
		private Double netSalesAmount;
		private Double tdp;
		private Double dp;
		private Double ntf;
		private byte[] signature;
		private Long jobId;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<SalesOrderDtl> salesOrderDtls = new HashSet<SalesOrderDtl>(0);
		private Set<ReturSalesHdr> returSalesHdrs = new HashSet<ReturSalesHdr>(0);
		private Set<SalesInvoice> salesInvoices = new HashSet<SalesInvoice>(0);
		
		public SalesOrderHdr()
			{
			}
			
		public SalesOrderHdr(long id)
			{
				this.id = id;
			}
			
		public SalesOrderHdr(long id, CoaSchmHdr coaSchmHdr, Customer customer, Employee employee, Leasing leasing, Office office, Partner partner, String sono, Date postingDate, Date valueDate, Double soamount, Double sotaxPercent,
		        Double sotaxAmount, Double netSalesAmount, Double tdp, Double dp, Double ntf, byte[] signature, Long jobId, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<SalesOrderDtl> salesOrderDtls, Set<ReturSalesHdr> returSalesHdrs,
		        Set<SalesInvoice> salesInvoices)
			{
				this.id = id;
				this.coaSchmHdr = coaSchmHdr;
				this.customer = customer;
				this.employee = employee;
				this.leasing = leasing;
				this.office = office;
				this.partner = partner;
				this.sono = sono;
				this.postingDate = postingDate;
				this.valueDate = valueDate;
				this.soamount = soamount;
				this.sotaxPercent = sotaxPercent;
				this.sotaxAmount = sotaxAmount;
				this.netSalesAmount = netSalesAmount;
				this.tdp = tdp;
				this.dp = dp;
				this.ntf = ntf;
				this.signature = signature;
				this.jobId = jobId;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.salesOrderDtls = salesOrderDtls;
				this.returSalesHdrs = returSalesHdrs;
				this.salesInvoices = salesInvoices;
			}
			
		@Id
		
		@Column(name = "ID", unique = true, nullable = false)
		public long getId()
			{
				return this.id;
			}
			
		public void setId(long id)
			{
				this.id = id;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "CoaSchmID")
		public CoaSchmHdr getCoaSchmHdr()
			{
				return this.coaSchmHdr;
			}
			
		public void setCoaSchmHdr(CoaSchmHdr coaSchmHdr)
			{
				this.coaSchmHdr = coaSchmHdr;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "CustomerID")
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(Customer customer)
			{
				this.customer = customer;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "EmployeeID")
		public Employee getEmployee()
			{
				return this.employee;
			}
			
		public void setEmployee(Employee employee)
			{
				this.employee = employee;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "LeasingID")
		public Leasing getLeasing()
			{
				return this.leasing;
			}
			
		public void setLeasing(Leasing leasing)
			{
				this.leasing = leasing;
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
			
		@Column(name = "SONo", length = 50)
		public String getSono()
			{
				return this.sono;
			}
			
		public void setSono(String sono)
			{
				this.sono = sono;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "PostingDate", length = 23)
		public Date getPostingDate()
			{
				return this.postingDate;
			}
			
		public void setPostingDate(Date postingDate)
			{
				this.postingDate = postingDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ValueDate", length = 23)
		public Date getValueDate()
			{
				return this.valueDate;
			}
			
		public void setValueDate(Date valueDate)
			{
				this.valueDate = valueDate;
			}
			
		@Column(name = "SOAmount", precision = 53, scale = 0)
		public Double getSoamount()
			{
				return this.soamount;
			}
			
		public void setSoamount(Double soamount)
			{
				this.soamount = soamount;
			}
			
		@Column(name = "SOTaxPercent", precision = 53, scale = 0)
		public Double getSotaxPercent()
			{
				return this.sotaxPercent;
			}
			
		public void setSotaxPercent(Double sotaxPercent)
			{
				this.sotaxPercent = sotaxPercent;
			}
			
		@Column(name = "SOTaxAmount", precision = 53, scale = 0)
		public Double getSotaxAmount()
			{
				return this.sotaxAmount;
			}
			
		public void setSotaxAmount(Double sotaxAmount)
			{
				this.sotaxAmount = sotaxAmount;
			}
			
		@Column(name = "NetSalesAmount", precision = 53, scale = 0)
		public Double getNetSalesAmount()
			{
				return this.netSalesAmount;
			}
			
		public void setNetSalesAmount(Double netSalesAmount)
			{
				this.netSalesAmount = netSalesAmount;
			}
			
		@Column(name = "TDP", precision = 53, scale = 0)
		public Double getTdp()
			{
				return this.tdp;
			}
			
		public void setTdp(Double tdp)
			{
				this.tdp = tdp;
			}
			
		@Column(name = "DP", precision = 53, scale = 0)
		public Double getDp()
			{
				return this.dp;
			}
			
		public void setDp(Double dp)
			{
				this.dp = dp;
			}
			
		@Column(name = "NTF", precision = 53, scale = 0)
		public Double getNtf()
			{
				return this.ntf;
			}
			
		public void setNtf(Double ntf)
			{
				this.ntf = ntf;
			}
			
		@Column(name = "Signature")
		public byte[] getSignature()
			{
				return this.signature;
			}
			
		public void setSignature(byte[] signature)
			{
				this.signature = signature;
			}
			
		@Column(name = "JobId")
		public Long getJobId()
			{
				return this.jobId;
			}
			
		public void setJobId(Long jobId)
			{
				this.jobId = jobId;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "salesOrderHdr")
		public Set<SalesOrderDtl> getSalesOrderDtls()
			{
				return this.salesOrderDtls;
			}
			
		public void setSalesOrderDtls(Set<SalesOrderDtl> salesOrderDtls)
			{
				this.salesOrderDtls = salesOrderDtls;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "salesOrderHdr")
		public Set<ReturSalesHdr> getReturSalesHdrs()
			{
				return this.returSalesHdrs;
			}
			
		public void setReturSalesHdrs(Set<ReturSalesHdr> returSalesHdrs)
			{
				this.returSalesHdrs = returSalesHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "salesOrderHdr")
		public Set<SalesInvoice> getSalesInvoices()
			{
				return this.salesInvoices;
			}
			
		public void setSalesInvoices(Set<SalesInvoice> salesInvoices)
			{
				this.salesInvoices = salesInvoices;
			}
			
	}
