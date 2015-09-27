
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
 * Customer generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "Customer", catalog = "SmartDealer")
public class Customer implements java.io.Serializable
	{
		
		private long id;
		private Partner partner;
		private String type;
		private String name;
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
		private Set<Agrmnt> agrmntsForSpouseId = new HashSet<Agrmnt>(0);
		private Set<Agrmnt> agrmntsForGuarantorId = new HashSet<Agrmnt>(0);
		private Set<PersCustOmsetInfo> persCustOmsetInfos = new HashSet<PersCustOmsetInfo>(0);
		private Set<CoyCustContactInfo> coyCustContactInfos = new HashSet<CoyCustContactInfo>(0);
		private Set<CoyCust> coyCusts = new HashSet<CoyCust>(0);
		private Set<PersCustEntInfo> persCustEntInfos = new HashSet<PersCustEntInfo>(0);
		private Set<PersCustOtherBussinessInfo> persCustOtherBussinessInfos = new HashSet<PersCustOtherBussinessInfo>(0);
		private Set<Agrmnt> agrmntsForCustomerId = new HashSet<Agrmnt>(0);
		private Set<PersCustJobInfo> persCustJobInfos = new HashSet<PersCustJobInfo>(0);
		private Set<PersCustResidenceInfo> persCustResidenceInfos = new HashSet<PersCustResidenceInfo>(0);
		private Set<DailyAraging> dailyAragings = new HashSet<DailyAraging>(0);
		private Set<CoyCustWhInfo> coyCustWhInfos = new HashSet<CoyCustWhInfo>(0);
		private Set<CoyCustLegalInfo> coyCustLegalInfos = new HashSet<CoyCustLegalInfo>(0);
		private Set<PersCust> persCusts = new HashSet<PersCust>(0);
		private Set<CoyCustLegalInfo> coyCustLegalInfos_1 = new HashSet<CoyCustLegalInfo>(0);
		private Set<PersCustEmergencyInfo> persCustEmergencyInfos = new HashSet<PersCustEmergencyInfo>(0);
		private Set<CoyCustFinancialInfo> coyCustFinancialInfos = new HashSet<CoyCustFinancialInfo>(0);
		private Set<PersCustCcinfo> persCustCcinfos = new HashSet<PersCustCcinfo>(0);
		private Set<CoyCustShareInfo> coyCustShareInfos = new HashSet<CoyCustShareInfo>(0);
		private Set<CoyCustComptInfo> coyCustComptInfos = new HashSet<CoyCustComptInfo>(0);
		private Set<AgrmntAsset> agrmntAssets = new HashSet<AgrmntAsset>(0);
		private Set<PersCustFinancialData> persCustFinancialDatas = new HashSet<PersCustFinancialData>(0);
		private Set<NegCust> negCusts = new HashSet<NegCust>(0);
		private Set<SalesInvoice> salesInvoices = new HashSet<SalesInvoice>(0);
		private Set<CustomerBankInfo> customerBankInfos = new HashSet<CustomerBankInfo>(0);
		private Set<PersCustTrusteeInfo> persCustTrusteeInfos = new HashSet<PersCustTrusteeInfo>(0);
		private Set<PersCustLegalInfo> persCustLegalInfos = new HashSet<PersCustLegalInfo>(0);
		private Set<SalesOrderHdr> salesOrderHdrs = new HashSet<SalesOrderHdr>(0);
		private Set<PersCustFamilyInfo> persCustFamilyInfos = new HashSet<PersCustFamilyInfo>(0);
		
		public Customer()
			{
			}
			
		public Customer(long id)
			{
				this.id = id;
			}
			
		public Customer(long id, Partner partner, String type, String name, String address, String rt, String rw, String kelurahan, String kecamatan, String city, String zipcode, String areaPhone1, String phoneNo1, String areaPhone2, String phoneNo2,
		        String areaFax, String faxNo, String handphone, String fullAddress, Double prepaidAmount, Double aramount, Double arpaid, Double arwaived, String custTag, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt,
		        Set<Agrmnt> agrmntsForSpouseId, Set<Agrmnt> agrmntsForGuarantorId, Set<PersCustOmsetInfo> persCustOmsetInfos, Set<CoyCustContactInfo> coyCustContactInfos, Set<CoyCust> coyCusts, Set<PersCustEntInfo> persCustEntInfos,
		        Set<PersCustOtherBussinessInfo> persCustOtherBussinessInfos, Set<Agrmnt> agrmntsForCustomerId, Set<PersCustJobInfo> persCustJobInfos, Set<PersCustResidenceInfo> persCustResidenceInfos, Set<DailyAraging> dailyAragings,
		        Set<CoyCustWhInfo> coyCustWhInfos, Set<CoyCustLegalInfo> coyCustLegalInfos, Set<PersCust> persCusts, Set<CoyCustLegalInfo> coyCustLegalInfos_1, Set<PersCustEmergencyInfo> persCustEmergencyInfos,
		        Set<CoyCustFinancialInfo> coyCustFinancialInfos, Set<PersCustCcinfo> persCustCcinfos, Set<CoyCustShareInfo> coyCustShareInfos, Set<CoyCustComptInfo> coyCustComptInfos, Set<AgrmntAsset> agrmntAssets,
		        Set<PersCustFinancialData> persCustFinancialDatas, Set<NegCust> negCusts, Set<SalesInvoice> salesInvoices, Set<CustomerBankInfo> customerBankInfos, Set<PersCustTrusteeInfo> persCustTrusteeInfos,
		        Set<PersCustLegalInfo> persCustLegalInfos, Set<SalesOrderHdr> salesOrderHdrs, Set<PersCustFamilyInfo> persCustFamilyInfos)
			{
				this.id = id;
				this.partner = partner;
				this.type = type;
				this.name = name;
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
				this.agrmntsForSpouseId = agrmntsForSpouseId;
				this.agrmntsForGuarantorId = agrmntsForGuarantorId;
				this.persCustOmsetInfos = persCustOmsetInfos;
				this.coyCustContactInfos = coyCustContactInfos;
				this.coyCusts = coyCusts;
				this.persCustEntInfos = persCustEntInfos;
				this.persCustOtherBussinessInfos = persCustOtherBussinessInfos;
				this.agrmntsForCustomerId = agrmntsForCustomerId;
				this.persCustJobInfos = persCustJobInfos;
				this.persCustResidenceInfos = persCustResidenceInfos;
				this.dailyAragings = dailyAragings;
				this.coyCustWhInfos = coyCustWhInfos;
				this.coyCustLegalInfos = coyCustLegalInfos;
				this.persCusts = persCusts;
				this.coyCustLegalInfos_1 = coyCustLegalInfos_1;
				this.persCustEmergencyInfos = persCustEmergencyInfos;
				this.coyCustFinancialInfos = coyCustFinancialInfos;
				this.persCustCcinfos = persCustCcinfos;
				this.coyCustShareInfos = coyCustShareInfos;
				this.coyCustComptInfos = coyCustComptInfos;
				this.agrmntAssets = agrmntAssets;
				this.persCustFinancialDatas = persCustFinancialDatas;
				this.negCusts = negCusts;
				this.salesInvoices = salesInvoices;
				this.customerBankInfos = customerBankInfos;
				this.persCustTrusteeInfos = persCustTrusteeInfos;
				this.persCustLegalInfos = persCustLegalInfos;
				this.salesOrderHdrs = salesOrderHdrs;
				this.persCustFamilyInfos = persCustFamilyInfos;
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
			
		@Column(name = "Kecamatan", length = 50)
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customerBySpouseId")
		public Set<Agrmnt> getAgrmntsForSpouseId()
			{
				return this.agrmntsForSpouseId;
			}
			
		public void setAgrmntsForSpouseId(Set<Agrmnt> agrmntsForSpouseId)
			{
				this.agrmntsForSpouseId = agrmntsForSpouseId;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customerByGuarantorId")
		public Set<Agrmnt> getAgrmntsForGuarantorId()
			{
				return this.agrmntsForGuarantorId;
			}
			
		public void setAgrmntsForGuarantorId(Set<Agrmnt> agrmntsForGuarantorId)
			{
				this.agrmntsForGuarantorId = agrmntsForGuarantorId;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<PersCustOmsetInfo> getPersCustOmsetInfos()
			{
				return this.persCustOmsetInfos;
			}
			
		public void setPersCustOmsetInfos(Set<PersCustOmsetInfo> persCustOmsetInfos)
			{
				this.persCustOmsetInfos = persCustOmsetInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<CoyCustContactInfo> getCoyCustContactInfos()
			{
				return this.coyCustContactInfos;
			}
			
		public void setCoyCustContactInfos(Set<CoyCustContactInfo> coyCustContactInfos)
			{
				this.coyCustContactInfos = coyCustContactInfos;
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
		public Set<PersCustEntInfo> getPersCustEntInfos()
			{
				return this.persCustEntInfos;
			}
			
		public void setPersCustEntInfos(Set<PersCustEntInfo> persCustEntInfos)
			{
				this.persCustEntInfos = persCustEntInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<PersCustOtherBussinessInfo> getPersCustOtherBussinessInfos()
			{
				return this.persCustOtherBussinessInfos;
			}
			
		public void setPersCustOtherBussinessInfos(Set<PersCustOtherBussinessInfo> persCustOtherBussinessInfos)
			{
				this.persCustOtherBussinessInfos = persCustOtherBussinessInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customerByCustomerId")
		public Set<Agrmnt> getAgrmntsForCustomerId()
			{
				return this.agrmntsForCustomerId;
			}
			
		public void setAgrmntsForCustomerId(Set<Agrmnt> agrmntsForCustomerId)
			{
				this.agrmntsForCustomerId = agrmntsForCustomerId;
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
		public Set<DailyAraging> getDailyAragings()
			{
				return this.dailyAragings;
			}
			
		public void setDailyAragings(Set<DailyAraging> dailyAragings)
			{
				this.dailyAragings = dailyAragings;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<CoyCustFinancialInfo> getCoyCustFinancialInfos()
			{
				return this.coyCustFinancialInfos;
			}
			
		public void setCoyCustFinancialInfos(Set<CoyCustFinancialInfo> coyCustFinancialInfos)
			{
				this.coyCustFinancialInfos = coyCustFinancialInfos;
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
		public Set<AgrmntAsset> getAgrmntAssets()
			{
				return this.agrmntAssets;
			}
			
		public void setAgrmntAssets(Set<AgrmntAsset> agrmntAssets)
			{
				this.agrmntAssets = agrmntAssets;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<PersCustFinancialData> getPersCustFinancialDatas()
			{
				return this.persCustFinancialDatas;
			}
			
		public void setPersCustFinancialDatas(Set<PersCustFinancialData> persCustFinancialDatas)
			{
				this.persCustFinancialDatas = persCustFinancialDatas;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
		public Set<NegCust> getNegCusts()
			{
				return this.negCusts;
			}
			
		public void setNegCusts(Set<NegCust> negCusts)
			{
				this.negCusts = negCusts;
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
		public Set<CustomerBankInfo> getCustomerBankInfos()
			{
				return this.customerBankInfos;
			}
			
		public void setCustomerBankInfos(Set<CustomerBankInfo> customerBankInfos)
			{
				this.customerBankInfos = customerBankInfos;
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
		public Set<PersCustLegalInfo> getPersCustLegalInfos()
			{
				return this.persCustLegalInfos;
			}
			
		public void setPersCustLegalInfos(Set<PersCustLegalInfo> persCustLegalInfos)
			{
				this.persCustLegalInfos = persCustLegalInfos;
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
		public Set<PersCustFamilyInfo> getPersCustFamilyInfos()
			{
				return this.persCustFamilyInfos;
			}
			
		public void setPersCustFamilyInfos(Set<PersCustFamilyInfo> persCustFamilyInfos)
			{
				this.persCustFamilyInfos = persCustFamilyInfos;
			}
			
	}
