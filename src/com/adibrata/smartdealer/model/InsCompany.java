
package com.adibrata.smartdealer.model;
// Generated Aug 21, 2015 12:33:53 PM by Hibernate Tools 4.3.1

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
 * InsCompany generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "InsCompany", catalog = "SmartDealer")
public class InsCompany implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private String name;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String kecamatan;
		private String city;
		private String zipcode;
		private String type;
		private String areaPhone1;
		private String phoneNo1;
		private String areaPhone2;
		private String phoneNo2;
		private String areaFax;
		private String faxNo;
		private String handphone;
		private String fullAddress;
		private String isActive;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<InsCoOffice> insCoOffices = new HashSet<InsCoOffice>(0);
		
		public InsCompany()
			{
			}
			
		public InsCompany(long id)
			{
				this.id = id;
			}
			
		public InsCompany(long id, Partner partner, String name, String address, String rt, String rw, String kelurahan, String kecamatan, String city, String zipcode, String type, String areaPhone1, String phoneNo1, String areaPhone2,
		        String phoneNo2, String areaFax, String faxNo, String handphone, String fullAddress, String isActive, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<InsCoOffice> insCoOffices)
			{
				this.id = id;
				this.partner = partner;
				this.name = name;
				this.address = address;
				this.rt = rt;
				this.rw = rw;
				this.kelurahan = kelurahan;
				this.kecamatan = kecamatan;
				this.city = city;
				this.zipcode = zipcode;
				this.type = type;
				this.areaPhone1 = areaPhone1;
				this.phoneNo1 = phoneNo1;
				this.areaPhone2 = areaPhone2;
				this.phoneNo2 = phoneNo2;
				this.areaFax = areaFax;
				this.faxNo = faxNo;
				this.handphone = handphone;
				this.fullAddress = fullAddress;
				this.isActive = isActive;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.insCoOffices = insCoOffices;
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
			
		@Column(name = "Name", length = 50)
		public String getName()
			{
				return this.name;
			}
			
		public void setName(String name)
			{
				this.name = name;
			}
			
		@Column(name = "Address")
		public String getAddress()
			{
				return this.address;
			}
			
		public void setAddress(String address)
			{
				this.address = address;
			}
			
		@Column(name = "RT", length = 4)
		public String getRt()
			{
				return this.rt;
			}
			
		public void setRt(String rt)
			{
				this.rt = rt;
			}
			
		@Column(name = "RW", length = 4)
		public String getRw()
			{
				return this.rw;
			}
			
		public void setRw(String rw)
			{
				this.rw = rw;
			}
			
		@Column(name = "Kelurahan", length = 50)
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
			
		@Column(name = "City", length = 50)
		public String getCity()
			{
				return this.city;
			}
			
		public void setCity(String city)
			{
				this.city = city;
			}
			
		@Column(name = "Zipcode", length = 50)
		public String getZipcode()
			{
				return this.zipcode;
			}
			
		public void setZipcode(String zipcode)
			{
				this.zipcode = zipcode;
			}
			
		@Column(name = "Type", length = 2)
		public String getType()
			{
				return this.type;
			}
			
		public void setType(String type)
			{
				this.type = type;
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
			
		@Column(name = "IsActive", length = 50)
		public String getIsActive()
			{
				return this.isActive;
			}
			
		public void setIsActive(String isActive)
			{
				this.isActive = isActive;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmUpd", length = 23)
		public Date getDtmUpd()
			{
				return this.dtmUpd;
			}
			
		public void setDtmUpd(Date dtmUpd)
			{
				this.dtmUpd = dtmUpd;
			}
			
		@Column(name = "UsrUpd")
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		public void setUsrUpd(String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DtmCrt", length = 23)
		public Date getDtmCrt()
			{
				return this.dtmCrt;
			}
			
		public void setDtmCrt(Date dtmCrt)
			{
				this.dtmCrt = dtmCrt;
			}
			
		@Column(name = "UsrCrt")
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		public void setUsrCrt(String usrCrt)
			{
				this.usrCrt = usrCrt;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "insCompany")
		public Set<InsCoOffice> getInsCoOffices()
			{
				return this.insCoOffices;
			}
			
		public void setInsCoOffices(Set<InsCoOffice> insCoOffices)
			{
				this.insCoOffices = insCoOffices;
			}
			
	}
