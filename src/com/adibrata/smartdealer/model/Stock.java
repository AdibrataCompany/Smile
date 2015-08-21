
package com.adibrata.smartdealer.model;
// Generated Aug 21, 2015 12:46:23 PM by Hibernate Tools 4.3.1

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
 * Stock generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "Stock", catalog = "SmartDealer")
public class Stock implements java.io.Serializable
	{
		
		private long id;
		private AssetMaster assetMaster;
		private Office office;
		private Partner partner;
		private Supplier supplier;
		private String assetType;
		private String assetBrand;
		private String assetModel;
		private String assetCode;
		private String bpkbno;
		private String bpkbname;
		private String bpkbaddress;
		private String vehicleColor;
		private String machineNo;
		private String chasisNo;
		private String cylinder;
		private String licensePlate;
		private String manufacturingMonth;
		private String manufacturingYear;
		private Double purchasePrice;
		private Double servicePrice;
		private Double taxPrice;
		private Double netSalesPrice;
		private Date receiveDate;
		private Date purchaseDate;
		private Date serviceDate;
		private String stockStatus;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		private Set<SalesOrderDtl> salesOrderDtls = new HashSet<SalesOrderDtl>(0);
		private Set<StockDocument> stockDocuments = new HashSet<StockDocument>(0);
		private Set<ReturSalesDtl> returSalesDtls = new HashSet<ReturSalesDtl>(0);
		private Set<ReturPurchaseDtl> returPurchaseDtls = new HashSet<ReturPurchaseDtl>(0);
		
		public Stock()
			{
			}
			
		public Stock(long id)
			{
				this.id = id;
			}
			
		public Stock(long id, AssetMaster assetMaster, Office office, Partner partner, Supplier supplier, String assetType, String assetBrand, String assetModel, String assetCode, String bpkbno, String bpkbname, String bpkbaddress,
		        String vehicleColor, String machineNo, String chasisNo, String cylinder, String licensePlate, String manufacturingMonth, String manufacturingYear, Double purchasePrice, Double servicePrice, Double taxPrice, Double netSalesPrice,
		        Date receiveDate, Date purchaseDate, Date serviceDate, String stockStatus, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt, Set<SalesOrderDtl> salesOrderDtls, Set<StockDocument> stockDocuments,
		        Set<ReturSalesDtl> returSalesDtls, Set<ReturPurchaseDtl> returPurchaseDtls)
			{
				this.id = id;
				this.assetMaster = assetMaster;
				this.office = office;
				this.partner = partner;
				this.supplier = supplier;
				this.assetType = assetType;
				this.assetBrand = assetBrand;
				this.assetModel = assetModel;
				this.assetCode = assetCode;
				this.bpkbno = bpkbno;
				this.bpkbname = bpkbname;
				this.bpkbaddress = bpkbaddress;
				this.vehicleColor = vehicleColor;
				this.machineNo = machineNo;
				this.chasisNo = chasisNo;
				this.cylinder = cylinder;
				this.licensePlate = licensePlate;
				this.manufacturingMonth = manufacturingMonth;
				this.manufacturingYear = manufacturingYear;
				this.purchasePrice = purchasePrice;
				this.servicePrice = servicePrice;
				this.taxPrice = taxPrice;
				this.netSalesPrice = netSalesPrice;
				this.receiveDate = receiveDate;
				this.purchaseDate = purchaseDate;
				this.serviceDate = serviceDate;
				this.stockStatus = stockStatus;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
				this.salesOrderDtls = salesOrderDtls;
				this.stockDocuments = stockDocuments;
				this.returSalesDtls = returSalesDtls;
				this.returPurchaseDtls = returPurchaseDtls;
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
		@JoinColumn(name = "AssetMasterID")
		public AssetMaster getAssetMaster()
			{
				return this.assetMaster;
			}
			
		public void setAssetMaster(AssetMaster assetMaster)
			{
				this.assetMaster = assetMaster;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "OfficeID")
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
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "DaelerID")
		public Supplier getSupplier()
			{
				return this.supplier;
			}
			
		public void setSupplier(Supplier supplier)
			{
				this.supplier = supplier;
			}
			
		@Column(name = "AssetType", length = 20)
		public String getAssetType()
			{
				return this.assetType;
			}
			
		public void setAssetType(String assetType)
			{
				this.assetType = assetType;
			}
			
		@Column(name = "AssetBrand", length = 20)
		public String getAssetBrand()
			{
				return this.assetBrand;
			}
			
		public void setAssetBrand(String assetBrand)
			{
				this.assetBrand = assetBrand;
			}
			
		@Column(name = "AssetModel", length = 20)
		public String getAssetModel()
			{
				return this.assetModel;
			}
			
		public void setAssetModel(String assetModel)
			{
				this.assetModel = assetModel;
			}
			
		@Column(name = "AssetCode", length = 200)
		public String getAssetCode()
			{
				return this.assetCode;
			}
			
		public void setAssetCode(String assetCode)
			{
				this.assetCode = assetCode;
			}
			
		@Column(name = "BPKBNo", length = 50)
		public String getBpkbno()
			{
				return this.bpkbno;
			}
			
		public void setBpkbno(String bpkbno)
			{
				this.bpkbno = bpkbno;
			}
			
		@Column(name = "BPKBName", length = 50)
		public String getBpkbname()
			{
				return this.bpkbname;
			}
			
		public void setBpkbname(String bpkbname)
			{
				this.bpkbname = bpkbname;
			}
			
		@Column(name = "BPKBAddress", length = 100)
		public String getBpkbaddress()
			{
				return this.bpkbaddress;
			}
			
		public void setBpkbaddress(String bpkbaddress)
			{
				this.bpkbaddress = bpkbaddress;
			}
			
		@Column(name = "VehicleColor", length = 50)
		public String getVehicleColor()
			{
				return this.vehicleColor;
			}
			
		public void setVehicleColor(String vehicleColor)
			{
				this.vehicleColor = vehicleColor;
			}
			
		@Column(name = "MachineNo", length = 50)
		public String getMachineNo()
			{
				return this.machineNo;
			}
			
		public void setMachineNo(String machineNo)
			{
				this.machineNo = machineNo;
			}
			
		@Column(name = "ChasisNo", length = 50)
		public String getChasisNo()
			{
				return this.chasisNo;
			}
			
		public void setChasisNo(String chasisNo)
			{
				this.chasisNo = chasisNo;
			}
			
		@Column(name = "Cylinder", length = 8)
		public String getCylinder()
			{
				return this.cylinder;
			}
			
		public void setCylinder(String cylinder)
			{
				this.cylinder = cylinder;
			}
			
		@Column(name = "LicensePlate", length = 15)
		public String getLicensePlate()
			{
				return this.licensePlate;
			}
			
		public void setLicensePlate(String licensePlate)
			{
				this.licensePlate = licensePlate;
			}
			
		@Column(name = "ManufacturingMonth", length = 50)
		public String getManufacturingMonth()
			{
				return this.manufacturingMonth;
			}
			
		public void setManufacturingMonth(String manufacturingMonth)
			{
				this.manufacturingMonth = manufacturingMonth;
			}
			
		@Column(name = "ManufacturingYear", length = 4)
		public String getManufacturingYear()
			{
				return this.manufacturingYear;
			}
			
		public void setManufacturingYear(String manufacturingYear)
			{
				this.manufacturingYear = manufacturingYear;
			}
			
		@Column(name = "PurchasePrice", precision = 53, scale = 0)
		public Double getPurchasePrice()
			{
				return this.purchasePrice;
			}
			
		public void setPurchasePrice(Double purchasePrice)
			{
				this.purchasePrice = purchasePrice;
			}
			
		@Column(name = "ServicePrice", precision = 53, scale = 0)
		public Double getServicePrice()
			{
				return this.servicePrice;
			}
			
		public void setServicePrice(Double servicePrice)
			{
				this.servicePrice = servicePrice;
			}
			
		@Column(name = "TaxPrice", precision = 53, scale = 0)
		public Double getTaxPrice()
			{
				return this.taxPrice;
			}
			
		public void setTaxPrice(Double taxPrice)
			{
				this.taxPrice = taxPrice;
			}
			
		@Column(name = "NetSalesPrice", precision = 53, scale = 0)
		public Double getNetSalesPrice()
			{
				return this.netSalesPrice;
			}
			
		public void setNetSalesPrice(Double netSalesPrice)
			{
				this.netSalesPrice = netSalesPrice;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ReceiveDate", length = 23)
		public Date getReceiveDate()
			{
				return this.receiveDate;
			}
			
		public void setReceiveDate(Date receiveDate)
			{
				this.receiveDate = receiveDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "PurchaseDate", length = 23)
		public Date getPurchaseDate()
			{
				return this.purchaseDate;
			}
			
		public void setPurchaseDate(Date purchaseDate)
			{
				this.purchaseDate = purchaseDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ServiceDate", length = 23)
		public Date getServiceDate()
			{
				return this.serviceDate;
			}
			
		public void setServiceDate(Date serviceDate)
			{
				this.serviceDate = serviceDate;
			}
			
		@Column(name = "StockStatus", length = 5)
		public String getStockStatus()
			{
				return this.stockStatus;
			}
			
		public void setStockStatus(String stockStatus)
			{
				this.stockStatus = stockStatus;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "stock")
		public Set<SalesOrderDtl> getSalesOrderDtls()
			{
				return this.salesOrderDtls;
			}
			
		public void setSalesOrderDtls(Set<SalesOrderDtl> salesOrderDtls)
			{
				this.salesOrderDtls = salesOrderDtls;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "stock")
		public Set<StockDocument> getStockDocuments()
			{
				return this.stockDocuments;
			}
			
		public void setStockDocuments(Set<StockDocument> stockDocuments)
			{
				this.stockDocuments = stockDocuments;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "stock")
		public Set<ReturSalesDtl> getReturSalesDtls()
			{
				return this.returSalesDtls;
			}
			
		public void setReturSalesDtls(Set<ReturSalesDtl> returSalesDtls)
			{
				this.returSalesDtls = returSalesDtls;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "stock")
		public Set<ReturPurchaseDtl> getReturPurchaseDtls()
			{
				return this.returPurchaseDtls;
			}
			
		public void setReturPurchaseDtls(Set<ReturPurchaseDtl> returPurchaseDtls)
			{
				this.returPurchaseDtls = returPurchaseDtls;
			}
			
	}
