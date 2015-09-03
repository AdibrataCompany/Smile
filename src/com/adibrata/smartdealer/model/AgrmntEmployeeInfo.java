
package com.adibrata.smartdealer.model;
// Generated Sep 3, 2015 12:59:25 PM by Hibernate Tools 4.3.1

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
 * AgrmntEmployeeInfo generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntEmployeeInfo", catalog = "SmartDealer")
public class AgrmntEmployeeInfo implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private Long aoid;
		private Long caid;
		private Long salesmanId;
		private Long salesSupervisorId;
		private Long supplierAdminId;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public AgrmntEmployeeInfo()
			{
			}
			
		public AgrmntEmployeeInfo(long id)
			{
				this.id = id;
			}
			
		public AgrmntEmployeeInfo(long id, Agrmnt agrmnt, Long aoid, Long caid, Long salesmanId, Long salesSupervisorId, Long supplierAdminId, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.aoid = aoid;
				this.caid = caid;
				this.salesmanId = salesmanId;
				this.salesSupervisorId = salesSupervisorId;
				this.supplierAdminId = supplierAdminId;
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
		@JoinColumn(name = "AgrmntId")
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		public void setAgrmnt(Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}
			
		@Column(name = "AOID")
		public Long getAoid()
			{
				return this.aoid;
			}
			
		public void setAoid(Long aoid)
			{
				this.aoid = aoid;
			}
			
		@Column(name = "CAID")
		public Long getCaid()
			{
				return this.caid;
			}
			
		public void setCaid(Long caid)
			{
				this.caid = caid;
			}
			
		@Column(name = "SalesmanID")
		public Long getSalesmanId()
			{
				return this.salesmanId;
			}
			
		public void setSalesmanId(Long salesmanId)
			{
				this.salesmanId = salesmanId;
			}
			
		@Column(name = "SalesSupervisorID")
		public Long getSalesSupervisorId()
			{
				return this.salesSupervisorId;
			}
			
		public void setSalesSupervisorId(Long salesSupervisorId)
			{
				this.salesSupervisorId = salesSupervisorId;
			}
			
		@Column(name = "SupplierAdminID")
		public Long getSupplierAdminId()
			{
				return this.supplierAdminId;
			}
			
		public void setSupplierAdminId(Long supplierAdminId)
			{
				this.supplierAdminId = supplierAdminId;
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
