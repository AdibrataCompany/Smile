
package com.adibrata.smartdealer.model;
// Generated Sep 27, 2015 10:48:45 AM by Hibernate Tools 4.3.1.Final

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
 * SuppEmplInfo generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "SuppEmplInfo", catalog = "SmartDealer")
public class SuppEmplInfo implements java.io.Serializable
	{
		
		private long id;
		private Supplier supplier;
		private String name;
		private String position;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private Set<AgrmntSuppEmplInfo> agrmntSuppEmplInfos = new HashSet<AgrmntSuppEmplInfo>(0);
		private Set<AgrmntAssetSupEmpl> agrmntAssetSupEmpls = new HashSet<AgrmntAssetSupEmpl>(0);
		
		public SuppEmplInfo()
			{
			}
			
		public SuppEmplInfo(long id)
			{
				this.id = id;
			}
			
		public SuppEmplInfo(long id, Supplier supplier, String name, String position, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt, Set<AgrmntSuppEmplInfo> agrmntSuppEmplInfos, Set<AgrmntAssetSupEmpl> agrmntAssetSupEmpls)
			{
				this.id = id;
				this.supplier = supplier;
				this.name = name;
				this.position = position;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.agrmntSuppEmplInfos = agrmntSuppEmplInfos;
				this.agrmntAssetSupEmpls = agrmntAssetSupEmpls;
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
		@JoinColumn(name = "SupplierId")
		public Supplier getSupplier()
			{
				return this.supplier;
			}
			
		public void setSupplier(Supplier supplier)
			{
				this.supplier = supplier;
			}
			
		@Column(name = "Name", length = 50)
		public String getName()
			{
				return this.name;
			}
			
		public void setName(String name)
			{
				this.name = name;
			}
			
		@Column(name = "Position", length = 10)
		public String getPosition()
			{
				return this.position;
			}
			
		public void setPosition(String position)
			{
				this.position = position;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "suppEmplInfo")
		public Set<AgrmntSuppEmplInfo> getAgrmntSuppEmplInfos()
			{
				return this.agrmntSuppEmplInfos;
			}
			
		public void setAgrmntSuppEmplInfos(Set<AgrmntSuppEmplInfo> agrmntSuppEmplInfos)
			{
				this.agrmntSuppEmplInfos = agrmntSuppEmplInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "suppEmplInfo")
		public Set<AgrmntAssetSupEmpl> getAgrmntAssetSupEmpls()
			{
				return this.agrmntAssetSupEmpls;
			}
			
		public void setAgrmntAssetSupEmpls(Set<AgrmntAssetSupEmpl> agrmntAssetSupEmpls)
			{
				this.agrmntAssetSupEmpls = agrmntAssetSupEmpls;
			}
			
	}
