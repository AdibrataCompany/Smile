
package com.adibrata.smartdealer.model;
// Generated Sep 3, 2015 12:59:25 PM by Hibernate Tools 4.3.1

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
 * Supplier generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "Supplier", catalog = "SmartDealer")
public class Supplier implements java.io.Serializable
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
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<AgrmntAssetSupEmpl> agrmntAssetSupEmpls = new HashSet<AgrmntAssetSupEmpl>(0);
		private Set<AgrmntAssetSupplier> agrmntAssetSuppliers = new HashSet<AgrmntAssetSupplier>(0);
		private Set<Invoice> invoices = new HashSet<Invoice>(0);
		private Set<EntrustHdr> entrustHdrs = new HashSet<EntrustHdr>(0);
		private Set<SupplierAccInfo> supplierAccInfos = new HashSet<SupplierAccInfo>(0);
		private Set<Stock> stocks = new HashSet<Stock>(0);
		private Set<SuppEmplInfo> suppEmplInfos = new HashSet<SuppEmplInfo>(0);
		private Set<PurchaseOrderHdr> purchaseOrderHdrs = new HashSet<PurchaseOrderHdr>(0);
		private Set<ReturPurchaseHdr> returPurchaseHdrs = new HashSet<ReturPurchaseHdr>(0);
		private Set<SuppOfficeInfo> suppOfficeInfos = new HashSet<SuppOfficeInfo>(0);
		private Set<PurchaseInvoice> purchaseInvoices = new HashSet<PurchaseInvoice>(0);
		
		public Supplier()
			{
			}
			
		public Supplier(long id)
			{
				this.id = id;
			}
			
		public Supplier(long id, Partner partner, String name, String address, String rt, String rw, String kelurahan, String kecamatan, String city, String zipcode, String type, String areaPhone1, String phoneNo1, String areaPhone2, String phoneNo2,
		        String areaFax, String faxNo, String handphone, String fullAddress, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<AgrmntAssetSupEmpl> agrmntAssetSupEmpls, Set<AgrmntAssetSupplier> agrmntAssetSuppliers,
		        Set<Invoice> invoices, Set<EntrustHdr> entrustHdrs, Set<SupplierAccInfo> supplierAccInfos, Set<Stock> stocks, Set<SuppEmplInfo> suppEmplInfos, Set<PurchaseOrderHdr> purchaseOrderHdrs, Set<ReturPurchaseHdr> returPurchaseHdrs,
		        Set<SuppOfficeInfo> suppOfficeInfos, Set<PurchaseInvoice> purchaseInvoices)
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
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.agrmntAssetSupEmpls = agrmntAssetSupEmpls;
				this.agrmntAssetSuppliers = agrmntAssetSuppliers;
				this.invoices = invoices;
				this.entrustHdrs = entrustHdrs;
				this.supplierAccInfos = supplierAccInfos;
				this.stocks = stocks;
				this.suppEmplInfos = suppEmplInfos;
				this.purchaseOrderHdrs = purchaseOrderHdrs;
				this.returPurchaseHdrs = returPurchaseHdrs;
				this.suppOfficeInfos = suppOfficeInfos;
				this.purchaseInvoices = purchaseInvoices;
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
			
		@Column(name = "Name", length = 50)
		public String getName()
			{
				return this.name;
			}
			
		public void setName(String name)
			{
				this.name = name;
			}
			
		@Column(name = "Address", length = 100)
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
		public Set<AgrmntAssetSupEmpl> getAgrmntAssetSupEmpls()
			{
				return this.agrmntAssetSupEmpls;
			}
			
		public void setAgrmntAssetSupEmpls(Set<AgrmntAssetSupEmpl> agrmntAssetSupEmpls)
			{
				this.agrmntAssetSupEmpls = agrmntAssetSupEmpls;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
		public Set<AgrmntAssetSupplier> getAgrmntAssetSuppliers()
			{
				return this.agrmntAssetSuppliers;
			}
			
		public void setAgrmntAssetSuppliers(Set<AgrmntAssetSupplier> agrmntAssetSuppliers)
			{
				this.agrmntAssetSuppliers = agrmntAssetSuppliers;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
		public Set<Invoice> getInvoices()
			{
				return this.invoices;
			}
			
		public void setInvoices(Set<Invoice> invoices)
			{
				this.invoices = invoices;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
		public Set<EntrustHdr> getEntrustHdrs()
			{
				return this.entrustHdrs;
			}
			
		public void setEntrustHdrs(Set<EntrustHdr> entrustHdrs)
			{
				this.entrustHdrs = entrustHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
		public Set<SupplierAccInfo> getSupplierAccInfos()
			{
				return this.supplierAccInfos;
			}
			
		public void setSupplierAccInfos(Set<SupplierAccInfo> supplierAccInfos)
			{
				this.supplierAccInfos = supplierAccInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
		public Set<Stock> getStocks()
			{
				return this.stocks;
			}
			
		public void setStocks(Set<Stock> stocks)
			{
				this.stocks = stocks;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
		public Set<SuppEmplInfo> getSuppEmplInfos()
			{
				return this.suppEmplInfos;
			}
			
		public void setSuppEmplInfos(Set<SuppEmplInfo> suppEmplInfos)
			{
				this.suppEmplInfos = suppEmplInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
		public Set<PurchaseOrderHdr> getPurchaseOrderHdrs()
			{
				return this.purchaseOrderHdrs;
			}
			
		public void setPurchaseOrderHdrs(Set<PurchaseOrderHdr> purchaseOrderHdrs)
			{
				this.purchaseOrderHdrs = purchaseOrderHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
		public Set<ReturPurchaseHdr> getReturPurchaseHdrs()
			{
				return this.returPurchaseHdrs;
			}
			
		public void setReturPurchaseHdrs(Set<ReturPurchaseHdr> returPurchaseHdrs)
			{
				this.returPurchaseHdrs = returPurchaseHdrs;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
		public Set<SuppOfficeInfo> getSuppOfficeInfos()
			{
				return this.suppOfficeInfos;
			}
			
		public void setSuppOfficeInfos(Set<SuppOfficeInfo> suppOfficeInfos)
			{
				this.suppOfficeInfos = suppOfficeInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
		public Set<PurchaseInvoice> getPurchaseInvoices()
			{
				return this.purchaseInvoices;
			}
			
		public void setPurchaseInvoices(Set<PurchaseInvoice> purchaseInvoices)
			{
				this.purchaseInvoices = purchaseInvoices;
			}
			
	}
