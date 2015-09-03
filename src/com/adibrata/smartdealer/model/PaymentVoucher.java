
package com.adibrata.smartdealer.model;
// Generated Sep 3, 2015 3:54:52 PM by Hibernate Tools 4.3.1

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
 * PaymentVoucher generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "PaymentVoucher", catalog = "SmartDealer")
public class PaymentVoucher implements java.io.Serializable
	{
		
		private long id;
		private Office office;
		private Partner partner;
		private String pvno;
		private Double pvamount;
		private String pvstatus;
		private Long transJobId;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<Pvdetail> pvdetails = new HashSet<Pvdetail>(0);
		
		public PaymentVoucher()
			{
			}
			
		public PaymentVoucher(long id)
			{
				this.id = id;
			}
			
		public PaymentVoucher(long id, Office office, Partner partner, String pvno, Double pvamount, String pvstatus, Long transJobId, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<Pvdetail> pvdetails)
			{
				this.id = id;
				this.office = office;
				this.partner = partner;
				this.pvno = pvno;
				this.pvamount = pvamount;
				this.pvstatus = pvstatus;
				this.transJobId = transJobId;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.pvdetails = pvdetails;
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
			
		@Column(name = "PVNo", length = 50)
		public String getPvno()
			{
				return this.pvno;
			}
			
		public void setPvno(String pvno)
			{
				this.pvno = pvno;
			}
			
		@Column(name = "PVAmount", precision = 53, scale = 0)
		public Double getPvamount()
			{
				return this.pvamount;
			}
			
		public void setPvamount(Double pvamount)
			{
				this.pvamount = pvamount;
			}
			
		@Column(name = "PVStatus", length = 50)
		public String getPvstatus()
			{
				return this.pvstatus;
			}
			
		public void setPvstatus(String pvstatus)
			{
				this.pvstatus = pvstatus;
			}
			
		@Column(name = "TransJobID")
		public Long getTransJobId()
			{
				return this.transJobId;
			}
			
		public void setTransJobId(Long transJobId)
			{
				this.transJobId = transJobId;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "paymentVoucher")
		public Set<Pvdetail> getPvdetails()
			{
				return this.pvdetails;
			}
			
		public void setPvdetails(Set<Pvdetail> pvdetails)
			{
				this.pvdetails = pvdetails;
			}
			
	}
