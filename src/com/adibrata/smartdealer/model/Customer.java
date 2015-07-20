
package com.adibrata.smartdealer.model;

// Generated Jul 20, 2015 11:55:15 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy; import javax.persistence.Cacheable; import org.hibernate.annotations.Cache; import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Customer generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "Customer", catalog = "SmartDealer")
public class Customer implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private String customerNo;
		private String type;
		private String name;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String city;
		private String zipcode;
		private String areaPhone1;
		private String phoneNo1;
		private String areaPhone2;
		private String phoneNo2;
		private String areaFax;
		private String faxNo;
		private String handphone;
		private String fullAddress;
		private Double prepaidAmount;
		private Double aramount;
		private Double arpaid;
		private Double arwaived;
		private String custTag;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<PersCustCcinfo> persCustCcinfos = new HashSet<PersCustCcinfo>(0);
		private Set<CoyCustShareInfo> coyCustShareInfos = new HashSet<CoyCustShareInfo>(0);
		private Set<CoyCustComptInfo> coyCustComptInfos = new HashSet<CoyCustComptInfo>(0);
		private Set<PersCustTrusteeInfo> persCustTrusteeInfos = new HashSet<PersCustTrusteeInfo>(0);
		private Set<SalesInvoice> salesInvoices = new HashSet<SalesInvoice>(0);
		private Set<PersCustTrusteeInfo> persCustTrusteeInfos_1 = new HashSet<PersCustTrusteeInfo>(0);
		private Set<CoyCust> coyCusts = new HashSet<CoyCust>(0);
		private Set<PersCustLegalInfo> persCustLegalInfos = new HashSet<PersCustLegalInfo>(0);
		private Set<Agrmnt> agrmnts = new HashSet<Agrmnt>(0);
		private Set<PersCustJobInfo> persCustJobInfos = new HashSet<PersCustJobInfo>(0);
		private Set<PersCustResidenceInfo> persCustResidenceInfos = new HashSet<PersCustResidenceInfo>(0);
		private Set<SalesOrderHdr> salesOrderHdrs = new HashSet<SalesOrderHdr>(0);
		private Set<CoyCustWhInfo> coyCustWhInfos = new HashSet<CoyCustWhInfo>(0);
		private Set<PersCustFamilyInfo> persCustFamilyInfos = new HashSet<PersCustFamilyInfo>(0);
		private Set<CoyCustLegalInfo> coyCustLegalInfos = new HashSet<CoyCustLegalInfo>(0);
		private Set<PersCust> persCusts = new HashSet<PersCust>(0);
		private Set<CoyCustLegalInfo> coyCustLegalInfos_1 = new HashSet<CoyCustLegalInfo>(0);
		private Set<PersCustEmergencyInfo> persCustEmergencyInfos = new HashSet<PersCustEmergencyInfo>(0);
		
		public Customer()
			{
			}
		
		public Customer(long id)
			{
				this.id = id;
			}
		
		public Customer(long id, Partner partner, String customerNo, String type, String name, String address, String rt, String rw, String kelurahan, String city, String zipcode, String areaPhone1, String phoneNo1, String areaPhone2,
		        String phoneNo2, String areaFax, String faxNo, String handphone, String fullAddress, Double prepaidAmount, Double aramount, Double arpaid, Double arwaived, String custTag, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt,
		        Set<PersCustCcinfo> persCustCcinfos, Set<CoyCustShareInfo> coyCustShareInfos, Set<CoyCustComptInfo> coyCustComptInfos, Set<PersCustTrusteeInfo> persCustTrusteeInfos, Set<SalesInvoice> salesInvoices,
		        Set<PersCustTrusteeInfo> persCustTrusteeInfos_1, Set<CoyCust> coyCusts, Set<PersCustLegalInfo> persCustLegalInfos, Set<Agrmnt> agrmnts, Set<PersCustJobInfo> persCustJobInfos, Set<PersCustResidenceInfo> persCustResidenceInfos,
		        Set<SalesOrderHdr> salesOrderHdrs, Set<CoyCustWhInfo> coyCustWhInfos, Set<PersCustFamilyInfo> persCustFamilyInfos, Set<CoyCustLegalInfo> coyCustLegalInfos, Set<PersCust> persCusts, Set<CoyCustLegalInfo> coyCustLegalInfos_1,
		        Set<PersCustEmergencyInfo> persCustEmergencyInfos)
			{
				this.id = id;
				this.partner = partner;
				this.customerNo = customerNo;
				this.type = type;
				this.name = name;
				this.address = address;
				this.rt = rt;
				this.rw = rw;
				this.kelurahan = kelurahan;
				this.city = city;
				this.zipcode = zipcode;
				this.areaPhone1 = areaPhone1;
				this.phoneNo1 = phoneNo1;
				this.areaPhone2 = areaPhone2;
				this.phoneNo2 = phoneNo2;
				this.areaFax = areaFax;
				this.faxNo = faxNo;
				this.handphone = handphone;
				this.fullAddress = fullAddress;
				this.prepaidAmount = prepaidAmount;
				this.aramount = aramount;
				this.arpaid = arpaid;
				this.arwaived = arwaived;
				this.custTag = custTag;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.persCustCcinfos = persCustCcinfos;
				this.coyCustShareInfos = coyCustShareInfos;
				this.coyCustComptInfos = coyCustComptInfos;
				this.persCustTrusteeInfos = persCustTrusteeInfos;
				this.salesInvoices = salesInvoices;
				this.persCustTrusteeInfos_1 = persCustTrusteeInfos_1;
				this.coyCusts = coyCusts;
				this.persCustLegalInfos = persCustLegalInfos;
				this.agrmnts = agrmnts;
				this.persCustJobInfos = persCustJobInfos;
				this.persCustResidenceInfos = persCustResidenceInfos;
				this.salesOrderHdrs = salesOrderHdrs;
				this.coyCustWhInfos = coyCustWhInfos;
				this.persCustFamilyInfos = persCustFamilyInfos;
				this.coyCustLegalInfos = coyCustLegalInfos;
				this.persCusts = persCusts;
				this.coyCustLegalInfos_1 = coyCustLegalInfos_1;
				this.persCustEmergencyInfos = persCustEmergencyInfos;
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
		@JoinColumn(name = "PartnerCode")
		public Partner getPartner()
			{
				return this.partner;
			}
		
		public void setPartner(Partner partner)
			{
				this.partner = partner;
			}
		
		@Column(name = "CustomerNo", length = 50)
		public String getCustomerNo()
			{
				return this.customerNo;
			}
		
		public void setCustomerNo(String customerNo)
			{
				this.customerNo = customerNo;
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
		
		@Column(name = "PrepaidAmount", precision = 53, scale = 0)
		public Double getPrepaidAmount()
			{
				return this.prepaidAmount;
			}
		
		public void setPrepaidAmount(Double prepaidAmount)
			{
				this.prepaidAmount = prepaidAmount;
			}
		
		@Column(name = "ARAmount", precision = 53, scale = 0)
		public Double getAramount()
			{
				return this.aramount;
			}
		
		public void setAramount(Double aramount)
			{
				this.aramount = aramount;
			}
		
		@Column(name = "ARPaid", precision = 53, scale = 0)
		public Double getArpaid()
			{
				return this.arpaid;
			}
		
		public void setArpaid(Double arpaid)
			{
				this.arpaid = arpaid;
			}
		
		@Column(name = "ARWaived", precision = 53, scale = 0)
		public Double getArwaived()
			{
				return this.arwaived;
			}
		
		public void setArwaived(Double arwaived)
			{
				this.arwaived = arwaived;
			}
		
		@Column(name = "CustTag", length = 8000)
		public String getCustTag()
			{
				return this.custTag;
			}
		
		public void setCustTag(String custTag)
			{
				this.custTag = custTag;
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
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<PersCustCcinfo> getPersCustCcinfos()
			{
				return this.persCustCcinfos;
			}
		
		public void setPersCustCcinfos(Set<PersCustCcinfo> persCustCcinfos)
			{
				this.persCustCcinfos = persCustCcinfos;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<CoyCustShareInfo> getCoyCustShareInfos()
			{
				return this.coyCustShareInfos;
			}
		
		public void setCoyCustShareInfos(Set<CoyCustShareInfo> coyCustShareInfos)
			{
				this.coyCustShareInfos = coyCustShareInfos;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<CoyCustComptInfo> getCoyCustComptInfos()
			{
				return this.coyCustComptInfos;
			}
		
		public void setCoyCustComptInfos(Set<CoyCustComptInfo> coyCustComptInfos)
			{
				this.coyCustComptInfos = coyCustComptInfos;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<PersCustTrusteeInfo> getPersCustTrusteeInfos()
			{
				return this.persCustTrusteeInfos;
			}
		
		public void setPersCustTrusteeInfos(Set<PersCustTrusteeInfo> persCustTrusteeInfos)
			{
				this.persCustTrusteeInfos = persCustTrusteeInfos;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<SalesInvoice> getSalesInvoices()
			{
				return this.salesInvoices;
			}
		
		public void setSalesInvoices(Set<SalesInvoice> salesInvoices)
			{
				this.salesInvoices = salesInvoices;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<PersCustTrusteeInfo> getPersCustTrusteeInfos_1()
			{
				return this.persCustTrusteeInfos_1;
			}
		
		public void setPersCustTrusteeInfos_1(Set<PersCustTrusteeInfo> persCustTrusteeInfos_1)
			{
				this.persCustTrusteeInfos_1 = persCustTrusteeInfos_1;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<CoyCust> getCoyCusts()
			{
				return this.coyCusts;
			}
		
		public void setCoyCusts(Set<CoyCust> coyCusts)
			{
				this.coyCusts = coyCusts;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<PersCustLegalInfo> getPersCustLegalInfos()
			{
				return this.persCustLegalInfos;
			}
		
		public void setPersCustLegalInfos(Set<PersCustLegalInfo> persCustLegalInfos)
			{
				this.persCustLegalInfos = persCustLegalInfos;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<Agrmnt> getAgrmnts()
			{
				return this.agrmnts;
			}
		
		public void setAgrmnts(Set<Agrmnt> agrmnts)
			{
				this.agrmnts = agrmnts;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<PersCustJobInfo> getPersCustJobInfos()
			{
				return this.persCustJobInfos;
			}
		
		public void setPersCustJobInfos(Set<PersCustJobInfo> persCustJobInfos)
			{
				this.persCustJobInfos = persCustJobInfos;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<PersCustResidenceInfo> getPersCustResidenceInfos()
			{
				return this.persCustResidenceInfos;
			}
		
		public void setPersCustResidenceInfos(Set<PersCustResidenceInfo> persCustResidenceInfos)
			{
				this.persCustResidenceInfos = persCustResidenceInfos;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<SalesOrderHdr> getSalesOrderHdrs()
			{
				return this.salesOrderHdrs;
			}
		
		public void setSalesOrderHdrs(Set<SalesOrderHdr> salesOrderHdrs)
			{
				this.salesOrderHdrs = salesOrderHdrs;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<CoyCustWhInfo> getCoyCustWhInfos()
			{
				return this.coyCustWhInfos;
			}
		
		public void setCoyCustWhInfos(Set<CoyCustWhInfo> coyCustWhInfos)
			{
				this.coyCustWhInfos = coyCustWhInfos;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<PersCustFamilyInfo> getPersCustFamilyInfos()
			{
				return this.persCustFamilyInfos;
			}
		
		public void setPersCustFamilyInfos(Set<PersCustFamilyInfo> persCustFamilyInfos)
			{
				this.persCustFamilyInfos = persCustFamilyInfos;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<CoyCustLegalInfo> getCoyCustLegalInfos()
			{
				return this.coyCustLegalInfos;
			}
		
		public void setCoyCustLegalInfos(Set<CoyCustLegalInfo> coyCustLegalInfos)
			{
				this.coyCustLegalInfos = coyCustLegalInfos;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<PersCust> getPersCusts()
			{
				return this.persCusts;
			}
		
		public void setPersCusts(Set<PersCust> persCusts)
			{
				this.persCusts = persCusts;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<CoyCustLegalInfo> getCoyCustLegalInfos_1()
			{
				return this.coyCustLegalInfos_1;
			}
		
		public void setCoyCustLegalInfos_1(Set<CoyCustLegalInfo> coyCustLegalInfos_1)
			{
				this.coyCustLegalInfos_1 = coyCustLegalInfos_1;
			}
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<PersCustEmergencyInfo> getPersCustEmergencyInfos()
			{
				return this.persCustEmergencyInfos;
			}
		
		public void setPersCustEmergencyInfos(Set<PersCustEmergencyInfo> persCustEmergencyInfos)
			{
				this.persCustEmergencyInfos = persCustEmergencyInfos;
			}
		
	}
