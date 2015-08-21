
package com.adibrata.smartdealer.model;
// Generated Aug 21, 2015 4:05:17 PM by Hibernate Tools 4.3.1

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
 * AgmntAssetEmployeeInfo generated by hbm2java
 */
@Entity
@Table(name = "AgmntAssetEmployeeInfo", catalog = "SmartDealer")
public class AgmntAssetEmployeeInfo implements java.io.Serializable
	{
		
		private long id;
		private AgrmntAsset agrmntAsset;
		private Long salesmanId;
		private Long salesSupervisorId;
		private Long supplierAdminId;
		private Long gmid;
		private Long bmid;
		private Long adhid;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public AgmntAssetEmployeeInfo()
			{
			}
			
		public AgmntAssetEmployeeInfo(long id)
			{
				this.id = id;
			}
			
		public AgmntAssetEmployeeInfo(long id, AgrmntAsset agrmntAsset, Long salesmanId, Long salesSupervisorId, Long supplierAdminId, Long gmid, Long bmid, Long adhid, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.agrmntAsset = agrmntAsset;
				this.salesmanId = salesmanId;
				this.salesSupervisorId = salesSupervisorId;
				this.supplierAdminId = supplierAdminId;
				this.gmid = gmid;
				this.bmid = bmid;
				this.adhid = adhid;
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
		@JoinColumn(name = "AgrmntAssetId")
		public AgrmntAsset getAgrmntAsset()
			{
				return this.agrmntAsset;
			}
			
		public void setAgrmntAsset(AgrmntAsset agrmntAsset)
			{
				this.agrmntAsset = agrmntAsset;
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
			
		@Column(name = "GMID")
		public Long getGmid()
			{
				return this.gmid;
			}
			
		public void setGmid(Long gmid)
			{
				this.gmid = gmid;
			}
			
		@Column(name = "BMID")
		public Long getBmid()
			{
				return this.bmid;
			}
			
		public void setBmid(Long bmid)
			{
				this.bmid = bmid;
			}
			
		@Column(name = "ADHID")
		public Long getAdhid()
			{
				return this.adhid;
			}
			
		public void setAdhid(Long adhid)
			{
				this.adhid = adhid;
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
