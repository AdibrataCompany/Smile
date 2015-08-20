
package com.adibrata.smartdealer.model;
// Generated Aug 20, 2015 1:54:39 PM by Hibernate Tools 4.3.1

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
 * Workshop generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "Workshop", catalog = "SmartDealer")
public class Workshop implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private String workshopCode;
		private String name;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String kecamatan;
		private String city;
		private String zipCode;
		private String areaPhone1;
		private String phoneNo1;
		private String areaPhone2;
		private String phoneNo2;
		private String areaFax;
		private String faxNo;
		private String handphone;
		private String fullAddress;
		private Short isActive;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private Set<ServiceHdr> serviceHdrs = new HashSet<ServiceHdr>(0);
		
		public Workshop()
			{
			}
			
		public Workshop(long id)
			{
				this.id = id;
			}
			
		public Workshop(long id, Partner partner, String workshopCode, String name, String address, String rt, String rw, String kelurahan, String kecamatan, String city, String zipCode, String areaPhone1, String phoneNo1, String areaPhone2,
		        String phoneNo2, String areaFax, String faxNo, String handphone, String fullAddress, Short isActive, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt, Set<ServiceHdr> serviceHdrs)
			{
				this.id = id;
				this.partner = partner;
				this.workshopCode = workshopCode;
				this.name = name;
				this.address = address;
				this.rt = rt;
				this.rw = rw;
				this.kelurahan = kelurahan;
				this.kecamatan = kecamatan;
				this.city = city;
				this.zipCode = zipCode;
				this.areaPhone1 = areaPhone1;
				this.phoneNo1 = phoneNo1;
				this.areaPhone2 = areaPhone2;
				this.phoneNo2 = phoneNo2;
				this.areaFax = areaFax;
				this.faxNo = faxNo;
				this.handphone = handphone;
				this.fullAddress = fullAddress;
				this.isActive = isActive;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.serviceHdrs = serviceHdrs;
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
		@JoinColumn(name = "PartnerCode")
		public Partner getPartner()
			{
				return this.partner;
			}
			
		public void setPartner(Partner partner)
			{
				this.partner = partner;
			}
			
		@Column(name = "WorkshopCode", length = 50)
		public String getWorkshopCode()
			{
				return this.workshopCode;
			}
			
		public void setWorkshopCode(String workshopCode)
			{
				this.workshopCode = workshopCode;
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
			
		@Column(name = "Address", length = 50)
		public String getAddress()
			{
				return this.address;
			}
			
		public void setAddress(String address)
			{
				this.address = address;
			}
			
		@Column(name = "Rt", length = 3)
		public String getRt()
			{
				return this.rt;
			}
			
		public void setRt(String rt)
			{
				this.rt = rt;
			}
			
		@Column(name = "Rw", length = 3)
		public String getRw()
			{
				return this.rw;
			}
			
		public void setRw(String rw)
			{
				this.rw = rw;
			}
			
		@Column(name = "Kelurahan", length = 20)
		public String getKelurahan()
			{
				return this.kelurahan;
			}
			
		public void setKelurahan(String kelurahan)
			{
				this.kelurahan = kelurahan;
			}
			
		@Column(name = "Kecamatan", length = 20)
		public String getKecamatan()
			{
				return this.kecamatan;
			}
			
		public void setKecamatan(String kecamatan)
			{
				this.kecamatan = kecamatan;
			}
			
		@Column(name = "City", length = 20)
		public String getCity()
			{
				return this.city;
			}
			
		public void setCity(String city)
			{
				this.city = city;
			}
			
		@Column(name = "ZipCode", length = 12)
		public String getZipCode()
			{
				return this.zipCode;
			}
			
		public void setZipCode(String zipCode)
			{
				this.zipCode = zipCode;
			}
			
		@Column(name = "AreaPhone1", length = 4)
		public String getAreaPhone1()
			{
				return this.areaPhone1;
			}
			
		public void setAreaPhone1(String areaPhone1)
			{
				this.areaPhone1 = areaPhone1;
			}
			
		@Column(name = "PhoneNo1", length = 20)
		public String getPhoneNo1()
			{
				return this.phoneNo1;
			}
			
		public void setPhoneNo1(String phoneNo1)
			{
				this.phoneNo1 = phoneNo1;
			}
			
		@Column(name = "AreaPhone2", length = 4)
		public String getAreaPhone2()
			{
				return this.areaPhone2;
			}
			
		public void setAreaPhone2(String areaPhone2)
			{
				this.areaPhone2 = areaPhone2;
			}
			
		@Column(name = "PhoneNo2", length = 20)
		public String getPhoneNo2()
			{
				return this.phoneNo2;
			}
			
		public void setPhoneNo2(String phoneNo2)
			{
				this.phoneNo2 = phoneNo2;
			}
			
		@Column(name = "AreaFax", length = 4)
		public String getAreaFax()
			{
				return this.areaFax;
			}
			
		public void setAreaFax(String areaFax)
			{
				this.areaFax = areaFax;
			}
			
		@Column(name = "FaxNo", length = 20)
		public String getFaxNo()
			{
				return this.faxNo;
			}
			
		public void setFaxNo(String faxNo)
			{
				this.faxNo = faxNo;
			}
			
		@Column(name = "Handphone", length = 20)
		public String getHandphone()
			{
				return this.handphone;
			}
			
		public void setHandphone(String handphone)
			{
				this.handphone = handphone;
			}
			
		@Column(name = "FullAddress", length = 500)
		public String getFullAddress()
			{
				return this.fullAddress;
			}
			
		public void setFullAddress(String fullAddress)
			{
				this.fullAddress = fullAddress;
			}
			
		@Column(name = "IsActive")
		public Short getIsActive()
			{
				return this.isActive;
			}
			
		public void setIsActive(Short isActive)
			{
				this.isActive = isActive;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "workshop")
		public Set<ServiceHdr> getServiceHdrs()
			{
				return this.serviceHdrs;
			}
			
		public void setServiceHdrs(Set<ServiceHdr> serviceHdrs)
			{
				this.serviceHdrs = serviceHdrs;
			}
			
	}
