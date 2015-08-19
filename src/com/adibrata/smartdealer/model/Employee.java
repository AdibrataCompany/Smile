
package com.adibrata.smartdealer.model;
// Generated Aug 19, 2015 12:14:16 PM by Hibernate Tools 4.3.1

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
 * Employee generated by hbm2java
 */
@Entity
@Table(name = "Employee", catalog = "SmartDealer")
public class Employee implements java.io.Serializable
	{
		
		private long id;
		private Office office;
		private Partner partner;
		private String name;
		private String position;
		private Long supervisorId;
		private byte[] signature;
		private Date joinDate;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String kecamatan;
		private String city;
		private String zipcode;
		private String areaPhone1;
		private String phoneNo1;
		private String areaPhone2;
		private String phoneNo2;
		private String handphone;
		private String email;
		private String fullAddress;
		private Date leaveDateStart;
		private Date leaveDateEnd;
		private Short isActive;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<CashierHistory> cashierHistories = new HashSet<CashierHistory>(0);
		private Set<PettyCashHdr> pettyCashHdrs = new HashSet<PettyCashHdr>(0);
		private Set<DanaTunai> danaTunais = new HashSet<DanaTunai>(0);
		private Set<AdvanceCash> advanceCashes = new HashSet<AdvanceCash>(0);
		private Set<SalesOrderHdr> salesOrderHdrs = new HashSet<SalesOrderHdr>(0);
		
		public Employee()
			{
			}
			
		public Employee(long id)
			{
				this.id = id;
			}
			
		public Employee(long id, Office office, Partner partner, String name, String position, Long supervisorId, byte[] signature, Date joinDate, String address, String rt, String rw, String kelurahan, String kecamatan, String city, String zipcode,
		        String areaPhone1, String phoneNo1, String areaPhone2, String phoneNo2, String handphone, String email, String fullAddress, Date leaveDateStart, Date leaveDateEnd, Short isActive, Date dtmUpd, String usrUpd, Date dtmCrt,
		        String usrCrt, Set<CashierHistory> cashierHistories, Set<PettyCashHdr> pettyCashHdrs, Set<DanaTunai> danaTunais, Set<AdvanceCash> advanceCashes, Set<SalesOrderHdr> salesOrderHdrs)
			{
				this.id = id;
				this.office = office;
				this.partner = partner;
				this.name = name;
				this.position = position;
				this.supervisorId = supervisorId;
				this.signature = signature;
				this.joinDate = joinDate;
				this.address = address;
				this.rt = rt;
				this.rw = rw;
				this.kelurahan = kelurahan;
				this.kecamatan = kecamatan;
				this.city = city;
				this.zipcode = zipcode;
				this.areaPhone1 = areaPhone1;
				this.phoneNo1 = phoneNo1;
				this.areaPhone2 = areaPhone2;
				this.phoneNo2 = phoneNo2;
				this.handphone = handphone;
				this.email = email;
				this.fullAddress = fullAddress;
				this.leaveDateStart = leaveDateStart;
				this.leaveDateEnd = leaveDateEnd;
				this.isActive = isActive;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.cashierHistories = cashierHistories;
				this.pettyCashHdrs = pettyCashHdrs;
				this.danaTunais = danaTunais;
				this.advanceCashes = advanceCashes;
				this.salesOrderHdrs = salesOrderHdrs;
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
			
		@Column(name = "Name", length = 50)
		public String getName()
			{
				return this.name;
			}
			
		public void setName(String name)
			{
				this.name = name;
			}
			
		@Column(name = "Position", length = 20)
		public String getPosition()
			{
				return this.position;
			}
			
		public void setPosition(String position)
			{
				this.position = position;
			}
			
		@Column(name = "SupervisorId")
		public Long getSupervisorId()
			{
				return this.supervisorId;
			}
			
		public void setSupervisorId(Long supervisorId)
			{
				this.supervisorId = supervisorId;
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
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "JoinDate", length = 23)
		public Date getJoinDate()
			{
				return this.joinDate;
			}
			
		public void setJoinDate(Date joinDate)
			{
				this.joinDate = joinDate;
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
			
		@Column(name = "Handphone", length = 20)
		public String getHandphone()
			{
				return this.handphone;
			}
			
		public void setHandphone(String handphone)
			{
				this.handphone = handphone;
			}
			
		@Column(name = "Email", length = 50)
		public String getEmail()
			{
				return this.email;
			}
			
		public void setEmail(String email)
			{
				this.email = email;
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
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "LeaveDateStart", length = 23)
		public Date getLeaveDateStart()
			{
				return this.leaveDateStart;
			}
			
		public void setLeaveDateStart(Date leaveDateStart)
			{
				this.leaveDateStart = leaveDateStart;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "LeaveDateEnd", length = 23)
		public Date getLeaveDateEnd()
			{
				return this.leaveDateEnd;
			}
			
		public void setLeaveDateEnd(Date leaveDateEnd)
			{
				this.leaveDateEnd = leaveDateEnd;
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
		@Column(name = "DtmCrt", length = 23)
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
		public Set<CashierHistory> getCashierHistories()
			{
				return this.cashierHistories;
			}
			
		public void setCashierHistories(Set<CashierHistory> cashierHistories)
			{
				this.cashierHistories = cashierHistories;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
		public Set<PettyCashHdr> getPettyCashHdrs()
			{
				return this.pettyCashHdrs;
			}
			
		public void setPettyCashHdrs(Set<PettyCashHdr> pettyCashHdrs)
			{
				this.pettyCashHdrs = pettyCashHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
		public Set<DanaTunai> getDanaTunais()
			{
				return this.danaTunais;
			}
			
		public void setDanaTunais(Set<DanaTunai> danaTunais)
			{
				this.danaTunais = danaTunais;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
		public Set<AdvanceCash> getAdvanceCashes()
			{
				return this.advanceCashes;
			}
			
		public void setAdvanceCashes(Set<AdvanceCash> advanceCashes)
			{
				this.advanceCashes = advanceCashes;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
		public Set<SalesOrderHdr> getSalesOrderHdrs()
			{
				return this.salesOrderHdrs;
			}
			
		public void setSalesOrderHdrs(Set<SalesOrderHdr> salesOrderHdrs)
			{
				this.salesOrderHdrs = salesOrderHdrs;
			}
			
	}
