
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
 * ServiceItem generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "ServiceItem", catalog = "SmartDealer")
public class ServiceItem implements java.io.Serializable
	{
		
		private long id;
		private ServiceDtl serviceDtl;
		private Taksasi taksasi;
		private Integer seqNo;
		private Double servicePrice;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public ServiceItem()
			{
			}
			
		public ServiceItem(long id)
			{
				this.id = id;
			}
			
		public ServiceItem(long id, ServiceDtl serviceDtl, Taksasi taksasi, Integer seqNo, Double servicePrice, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.serviceDtl = serviceDtl;
				this.taksasi = taksasi;
				this.seqNo = seqNo;
				this.servicePrice = servicePrice;
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
		@JoinColumn(name = "ServiceDtlId")
		public ServiceDtl getServiceDtl()
			{
				return this.serviceDtl;
			}
			
		public void setServiceDtl(ServiceDtl serviceDtl)
			{
				this.serviceDtl = serviceDtl;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "TaksasiId")
		public Taksasi getTaksasi()
			{
				return this.taksasi;
			}
			
		public void setTaksasi(Taksasi taksasi)
			{
				this.taksasi = taksasi;
			}
			
		@Column(name = "SeqNo")
		public Integer getSeqNo()
			{
				return this.seqNo;
			}
			
		public void setSeqNo(Integer seqNo)
			{
				this.seqNo = seqNo;
			}
			
		@Column(name = "ServicePrice", precision = 53, scale = 0)
		public Double getServicePrice()
			{
				return this.servicePrice;
			}
			
		public void setServicePrice(Double servicePrice)
			{
				this.servicePrice = servicePrice;
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
