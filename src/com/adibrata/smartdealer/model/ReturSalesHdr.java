
package com.adibrata.smartdealer.model;
// Generated Sep 3, 2015 12:59:25 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ReturSalesHdr generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "ReturSalesHdr", catalog = "SmartDealer")
public class ReturSalesHdr implements java.io.Serializable
	{
		
		private long id;
		private CoaSchmHdr coaSchmHdr;
		private Office office;
		private Partner partner;
		private SalesOrderHdr salesOrderHdr;
		private String returSalesNo;
		private Date valueDate;
		private Date postingDate;
		private Long jobId;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<ReturSalesDtl> returSalesDtls = new HashSet<ReturSalesDtl>(0);
		
		public ReturSalesHdr()
			{
			}
			
		public ReturSalesHdr(long id)
			{
				this.id = id;
			}
			
		public ReturSalesHdr(long id, CoaSchmHdr coaSchmHdr, Office office, Partner partner, SalesOrderHdr salesOrderHdr, String returSalesNo, Date valueDate, Date postingDate, Long jobId, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt,
		        Set<ReturSalesDtl> returSalesDtls)
			{
				this.id = id;
				this.coaSchmHdr = coaSchmHdr;
				this.office = office;
				this.partner = partner;
				this.salesOrderHdr = salesOrderHdr;
				this.returSalesNo = returSalesNo;
				this.valueDate = valueDate;
				this.postingDate = postingDate;
				this.jobId = jobId;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.returSalesDtls = returSalesDtls;
			}
			
		@Id @GeneratedValue(strategy=GenerationType.AUTO)
		
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
		@JoinColumn(name = "OfficeID")
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
		@JoinColumn(name = "SalesOrderHdrID")
		public SalesOrderHdr getSalesOrderHdr()
			{
				return this.salesOrderHdr;
			}
			
		public void setSalesOrderHdr(SalesOrderHdr salesOrderHdr)
			{
				this.salesOrderHdr = salesOrderHdr;
			}
			
		@Column(name = "ReturSalesNo", length = 50)
		public String getReturSalesNo()
			{
				return this.returSalesNo;
			}
			
		public void setReturSalesNo(String returSalesNo)
			{
				this.returSalesNo = returSalesNo;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "returSalesHdr")
		public Set<ReturSalesDtl> getReturSalesDtls()
			{
				return this.returSalesDtls;
			}
			
		public void setReturSalesDtls(Set<ReturSalesDtl> returSalesDtls)
			{
				this.returSalesDtls = returSalesDtls;
			}
			
	}
