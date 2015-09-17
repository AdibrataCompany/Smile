
package com.adibrata.smartdealer.model;
// Generated Sep 10, 2015 12:03:09 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EntrustDtl generated by hbm2java
 */
@Entity
@Table(name = "EntrustDtl", catalog = "SmartDealer")
public class EntrustDtl implements java.io.Serializable
	{
		
		private long id;
		private EntrustHdr entrustHdr;
		private Long stockId;
		private Double unitPrice;
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
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		
		public EntrustDtl()
			{
			}
			
		public EntrustDtl(long id)
			{
				this.id = id;
			}
			
		public EntrustDtl(long id, EntrustHdr entrustHdr, Long stockId, Double unitPrice, String assetType, String assetBrand, String assetModel, String assetCode, String bpkbno, String bpkbname, String bpkbaddress, String vehicleColor,
		        String machineNo, String chasisNo, String cylinder, String licensePlate, String manufacturingMonth, String manufacturingYear, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt)
			{
				this.id = id;
				this.entrustHdr = entrustHdr;
				this.stockId = stockId;
				this.unitPrice = unitPrice;
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
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
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
		@JoinColumn(name = "EntrustHdrID")
		public EntrustHdr getEntrustHdr()
			{
				return this.entrustHdr;
			}
			
		public void setEntrustHdr(EntrustHdr entrustHdr)
			{
				this.entrustHdr = entrustHdr;
			}
			
		@Column(name = "StockID")
		public Long getStockId()
			{
				return this.stockId;
			}
			
		public void setStockId(Long stockId)
			{
				this.stockId = stockId;
			}
			
		@Column(name = "UnitPrice", precision = 53, scale = 0)
		public Double getUnitPrice()
			{
				return this.unitPrice;
			}
			
		public void setUnitPrice(Double unitPrice)
			{
				this.unitPrice = unitPrice;
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
