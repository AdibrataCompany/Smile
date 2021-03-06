
package com.adibrata.smartdealer.model;
// Generated Sep 27, 2015 10:48:45 AM by Hibernate Tools 4.3.1.Final

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
 * PurchaseOrderDtl generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "PurchaseOrderDtl", catalog = "SmartDealer")
public class PurchaseOrderDtl implements java.io.Serializable
	{
		
		private long id;
		private AssetMaster assetMaster;
		private PurchaseOrderHdr purchaseOrderHdr;
		private Short sequenceNo;
		private String podescription;
		private Double poamountDtl;
		private String assetBrand;
		private String assetType;
		private String assetModel;
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
		private Double assetPrice;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public PurchaseOrderDtl()
			{
			}
			
		public PurchaseOrderDtl(long id)
			{
				this.id = id;
			}
			
		public PurchaseOrderDtl(long id, AssetMaster assetMaster, PurchaseOrderHdr purchaseOrderHdr, Short sequenceNo, String podescription, Double poamountDtl, String assetBrand, String assetType, String assetModel, String bpkbno, String bpkbname,
		        String bpkbaddress, String vehicleColor, String machineNo, String chasisNo, String cylinder, String licensePlate, String manufacturingMonth, String manufacturingYear, Double assetPrice, Date dtmUpd, String usrUpd, Date dtmCrt,
		        String usrCrt)
			{
				this.id = id;
				this.assetMaster = assetMaster;
				this.purchaseOrderHdr = purchaseOrderHdr;
				this.sequenceNo = sequenceNo;
				this.podescription = podescription;
				this.poamountDtl = poamountDtl;
				this.assetBrand = assetBrand;
				this.assetType = assetType;
				this.assetModel = assetModel;
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
				this.assetPrice = assetPrice;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
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
		@JoinColumn(name = "PurchaseOrderHdrID")
		public PurchaseOrderHdr getPurchaseOrderHdr()
			{
				return this.purchaseOrderHdr;
			}
			
		public void setPurchaseOrderHdr(PurchaseOrderHdr purchaseOrderHdr)
			{
				this.purchaseOrderHdr = purchaseOrderHdr;
			}
			
		@Column(name = "SequenceNo")
		public Short getSequenceNo()
			{
				return this.sequenceNo;
			}
			
		public void setSequenceNo(Short sequenceNo)
			{
				this.sequenceNo = sequenceNo;
			}
			
		@Column(name = "PODescription", length = 500)
		public String getPodescription()
			{
				return this.podescription;
			}
			
		public void setPodescription(String podescription)
			{
				this.podescription = podescription;
			}
			
		@Column(name = "POAmountDtl", precision = 53, scale = 0)
		public Double getPoamountDtl()
			{
				return this.poamountDtl;
			}
			
		public void setPoamountDtl(Double poamountDtl)
			{
				this.poamountDtl = poamountDtl;
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
			
		@Column(name = "AssetType", length = 20)
		public String getAssetType()
			{
				return this.assetType;
			}
			
		public void setAssetType(String assetType)
			{
				this.assetType = assetType;
			}
			
		@Column(name = "AssetModel", length = 50)
		public String getAssetModel()
			{
				return this.assetModel;
			}
			
		public void setAssetModel(String assetModel)
			{
				this.assetModel = assetModel;
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
			
		@Column(name = "ManufacturingMonth", length = 2)
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
			
		@Column(name = "AssetPrice", precision = 53, scale = 0)
		public Double getAssetPrice()
			{
				return this.assetPrice;
			}
			
		public void setAssetPrice(Double assetPrice)
			{
				this.assetPrice = assetPrice;
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
			
	}
