
package com.adibrata.smartdealer.model;
// Generated Sep 3, 2015 3:22:49 PM by Hibernate Tools 4.3.1

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
 * AgrmntAssetSupEmpl generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntAssetSupEmpl", catalog = "SmartDealer")
public class AgrmntAssetSupEmpl implements java.io.Serializable
	{
		
		private long id;
		private AgrmntAsset agrmntAsset;
		private SuppEmplInfo suppEmplInfo;
		private Supplier supplier;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public AgrmntAssetSupEmpl()
			{
			}
			
		public AgrmntAssetSupEmpl(long id)
			{
				this.id = id;
			}
			
		public AgrmntAssetSupEmpl(long id, AgrmntAsset agrmntAsset, SuppEmplInfo suppEmplInfo, Supplier supplier, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.agrmntAsset = agrmntAsset;
				this.suppEmplInfo = suppEmplInfo;
				this.supplier = supplier;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
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
		@JoinColumn(name = "AgmrntAssetId")
		public AgrmntAsset getAgrmntAsset()
			{
				return this.agrmntAsset;
			}
			
		public void setAgrmntAsset(AgrmntAsset agrmntAsset)
			{
				this.agrmntAsset = agrmntAsset;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "SuppEmplInfoId")
		public SuppEmplInfo getSuppEmplInfo()
			{
				return this.suppEmplInfo;
			}
			
		public void setSuppEmplInfo(SuppEmplInfo suppEmplInfo)
			{
				this.suppEmplInfo = suppEmplInfo;
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
