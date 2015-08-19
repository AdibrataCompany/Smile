
package com.adibrata.smartdealer.model;
// Generated Aug 19, 2015 12:14:16 PM by Hibernate Tools 4.3.1

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
 * DanaTunai generated by hbm2java
 */
@Entity
@Table(name = "DanaTunai", catalog = "SmartDealer")
public class DanaTunai implements java.io.Serializable
	{
		
		private long id;
		private Employee employee;
		private Leasing leasing;
		private Office office;
		private Partner partner;
		private String danaTunaiNo;
		private String assetBrand;
		private String assetType;
		private String assetModel;
		private Long assetMasterId;
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
		private Double otramount;
		private Double dpamount;
		private Double fundingAmount;
		private Double tdpamount;
		private Double adminFee;
		private Double asuransiAmount;
		private String noStnk;
		private Date stnkdate;
		private Date postingDate;
		private Date valueDate;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private String usrCrt;
		
		public DanaTunai()
			{
			}
			
		public DanaTunai(long id)
			{
				this.id = id;
			}
			
		public DanaTunai(long id, Employee employee, Leasing leasing, Office office, Partner partner, String danaTunaiNo, String assetBrand, String assetType, String assetModel, Long assetMasterId, String bpkbno, String bpkbname, String bpkbaddress,
		        String vehicleColor, String machineNo, String chasisNo, String cylinder, String licensePlate, String manufacturingMonth, String manufacturingYear, Double otramount, Double dpamount, Double fundingAmount, Double tdpamount,
		        Double adminFee, Double asuransiAmount, String noStnk, Date stnkdate, Date postingDate, Date valueDate, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt)
			{
				this.id = id;
				this.employee = employee;
				this.leasing = leasing;
				this.office = office;
				this.partner = partner;
				this.danaTunaiNo = danaTunaiNo;
				this.assetBrand = assetBrand;
				this.assetType = assetType;
				this.assetModel = assetModel;
				this.assetMasterId = assetMasterId;
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
				this.otramount = otramount;
				this.dpamount = dpamount;
				this.fundingAmount = fundingAmount;
				this.tdpamount = tdpamount;
				this.adminFee = adminFee;
				this.asuransiAmount = asuransiAmount;
				this.noStnk = noStnk;
				this.stnkdate = stnkdate;
				this.postingDate = postingDate;
				this.valueDate = valueDate;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.usrCrt = usrCrt;
			}
			
		@Id
		
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
		@JoinColumn(name = "EmployeeId")
		public Employee getEmployee()
			{
				return this.employee;
			}
			
		public void setEmployee(Employee employee)
			{
				this.employee = employee;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "LeasingID")
		public Leasing getLeasing()
			{
				return this.leasing;
			}
			
		public void setLeasing(Leasing leasing)
			{
				this.leasing = leasing;
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
			
		@Column(name = "DanaTunaiNo", length = 50)
		public String getDanaTunaiNo()
			{
				return this.danaTunaiNo;
			}
			
		public void setDanaTunaiNo(String danaTunaiNo)
			{
				this.danaTunaiNo = danaTunaiNo;
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
			
		@Column(name = "AssetMasterID")
		public Long getAssetMasterId()
			{
				return this.assetMasterId;
			}
			
		public void setAssetMasterId(Long assetMasterId)
			{
				this.assetMasterId = assetMasterId;
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
			
		@Column(name = "OTRAmount", precision = 53, scale = 0)
		public Double getOtramount()
			{
				return this.otramount;
			}
			
		public void setOtramount(Double otramount)
			{
				this.otramount = otramount;
			}
			
		@Column(name = "DPAmount", precision = 53, scale = 0)
		public Double getDpamount()
			{
				return this.dpamount;
			}
			
		public void setDpamount(Double dpamount)
			{
				this.dpamount = dpamount;
			}
			
		@Column(name = "FundingAmount", precision = 53, scale = 0)
		public Double getFundingAmount()
			{
				return this.fundingAmount;
			}
			
		public void setFundingAmount(Double fundingAmount)
			{
				this.fundingAmount = fundingAmount;
			}
			
		@Column(name = "TDPAmount", precision = 53, scale = 0)
		public Double getTdpamount()
			{
				return this.tdpamount;
			}
			
		public void setTdpamount(Double tdpamount)
			{
				this.tdpamount = tdpamount;
			}
			
		@Column(name = "AdminFee", precision = 53, scale = 0)
		public Double getAdminFee()
			{
				return this.adminFee;
			}
			
		public void setAdminFee(Double adminFee)
			{
				this.adminFee = adminFee;
			}
			
		@Column(name = "AsuransiAmount", precision = 53, scale = 0)
		public Double getAsuransiAmount()
			{
				return this.asuransiAmount;
			}
			
		public void setAsuransiAmount(Double asuransiAmount)
			{
				this.asuransiAmount = asuransiAmount;
			}
			
		@Column(name = "NoSTNK", length = 50)
		public String getNoStnk()
			{
				return this.noStnk;
			}
			
		public void setNoStnk(String noStnk)
			{
				this.noStnk = noStnk;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "STNKDate", length = 23)
		public Date getStnkdate()
			{
				return this.stnkdate;
			}
			
		public void setStnkdate(Date stnkdate)
			{
				this.stnkdate = stnkdate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "PostingDate", length = 23)
		public Date getPostingDate()
			{
				return this.postingDate;
			}
			
		public void setPostingDate(Date postingDate)
			{
				this.postingDate = postingDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ValueDate", length = 23)
		public Date getValueDate()
			{
				return this.valueDate;
			}
			
		public void setValueDate(Date valueDate)
			{
				this.valueDate = valueDate;
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
