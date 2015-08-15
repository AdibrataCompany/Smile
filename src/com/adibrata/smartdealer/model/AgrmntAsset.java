
package com.adibrata.smartdealer.model;
// Generated Aug 16, 2015 1:08:17 AM by Hibernate Tools 4.3.1

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
 * AgrmntAsset generated by hbm2java
 */
@Entity @Cacheable @Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "AgrmntAsset", catalog = "SmartDealer")
public class AgrmntAsset implements java.io.Serializable
	{
		
		private long id;
		private Agrmnt agrmnt;
		private AssetMaster assetMaster;
		private Customer customer;
		private SupplierAccInfo supplierAccInfo;
		private Long supplierId;
		private double otrprice;
		private double dpamount;
		private long assetTypeId;
		private double resaleValue;
		private String serialNo1;
		private String serialNo2;
		private short isUsed;
		private String assetUsage;
		private Short manufacturingMonth;
		private short manufacturingYear;
		private String licPlateNo;
		private Date taxDate;
		private Date buyBackGuaranteeValidDate;
		private String assetDocFilling;
		private String assetDocRack;
		private String branchIntransit;
		private Date deliveryDate;
		private Date repossesDate;
		private Date inventoryDate;
		private String notes;
		private String notesBorrowDoc;
		private String notesReleaseDoc;
		private String assetDocStatus;
		private String assetStatus;
		private boolean isAssetReplacementStatus;
		private Date rrddate;
		private Long crossAssetId;
		private String custUseRelation;
		private Long sumInsuredReplacement;
		private String discountOtrtype;
		private Double discountOtrpercentage;
		private Double discountOtramount;
		private String usrCrt;
		private Date dtmUpd;
		private String usrUpd;
		private Date dtmCrt;
		private Set<AgrmntAssetLoctInfo> agrmntAssetLoctInfos = new HashSet<AgrmntAssetLoctInfo>(0);
		private Set<AgrmntAssetLevelInfo> agrmntAssetLevelInfos = new HashSet<AgrmntAssetLevelInfo>(0);
		private Set<AgmntAssetEmployeeInfo> agmntAssetEmployeeInfos = new HashSet<AgmntAssetEmployeeInfo>(0);
		private Set<AgrmntAssetOwnerInfo> agrmntAssetOwnerInfos = new HashSet<AgrmntAssetOwnerInfo>(0);
		private Set<AgrmntAssetOldOwnerInfo> agrmntAssetOldOwnerInfos = new HashSet<AgrmntAssetOldOwnerInfo>(0);
		private Set<AgrmntInsAsset> agrmntInsAssets = new HashSet<AgrmntInsAsset>(0);
		private Set<AgrmntAssetSpbkbinfo> agrmntAssetSpbkbinfos = new HashSet<AgrmntAssetSpbkbinfo>(0);
		
		public AgrmntAsset()
			{
			}
			
		public AgrmntAsset(long id, AssetMaster assetMaster, double otrprice, double dpamount, long assetTypeId, double resaleValue, short isUsed, String assetUsage, short manufacturingYear, String notesBorrowDoc, String notesReleaseDoc,
		        String assetDocStatus, boolean isAssetReplacementStatus)
			{
				this.id = id;
				this.assetMaster = assetMaster;
				this.otrprice = otrprice;
				this.dpamount = dpamount;
				this.assetTypeId = assetTypeId;
				this.resaleValue = resaleValue;
				this.isUsed = isUsed;
				this.assetUsage = assetUsage;
				this.manufacturingYear = manufacturingYear;
				this.notesBorrowDoc = notesBorrowDoc;
				this.notesReleaseDoc = notesReleaseDoc;
				this.assetDocStatus = assetDocStatus;
				this.isAssetReplacementStatus = isAssetReplacementStatus;
			}
			
		public AgrmntAsset(long id, Agrmnt agrmnt, AssetMaster assetMaster, Customer customer, SupplierAccInfo supplierAccInfo, Long supplierId, double otrprice, double dpamount, long assetTypeId, double resaleValue, String serialNo1,
		        String serialNo2, short isUsed, String assetUsage, Short manufacturingMonth, short manufacturingYear, String licPlateNo, Date taxDate, Date buyBackGuaranteeValidDate, String assetDocFilling, String assetDocRack,
		        String branchIntransit, Date deliveryDate, Date repossesDate, Date inventoryDate, String notes, String notesBorrowDoc, String notesReleaseDoc, String assetDocStatus, String assetStatus, boolean isAssetReplacementStatus, Date rrddate,
		        Long crossAssetId, String custUseRelation, Long sumInsuredReplacement, String discountOtrtype, Double discountOtrpercentage, Double discountOtramount, String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt,
		        Set<AgrmntAssetLoctInfo> agrmntAssetLoctInfos, Set<AgrmntAssetLevelInfo> agrmntAssetLevelInfos, Set<AgmntAssetEmployeeInfo> agmntAssetEmployeeInfos, Set<AgrmntAssetOwnerInfo> agrmntAssetOwnerInfos,
		        Set<AgrmntAssetOldOwnerInfo> agrmntAssetOldOwnerInfos, Set<AgrmntInsAsset> agrmntInsAssets, Set<AgrmntAssetSpbkbinfo> agrmntAssetSpbkbinfos)
			{
				this.id = id;
				this.agrmnt = agrmnt;
				this.assetMaster = assetMaster;
				this.customer = customer;
				this.supplierAccInfo = supplierAccInfo;
				this.supplierId = supplierId;
				this.otrprice = otrprice;
				this.dpamount = dpamount;
				this.assetTypeId = assetTypeId;
				this.resaleValue = resaleValue;
				this.serialNo1 = serialNo1;
				this.serialNo2 = serialNo2;
				this.isUsed = isUsed;
				this.assetUsage = assetUsage;
				this.manufacturingMonth = manufacturingMonth;
				this.manufacturingYear = manufacturingYear;
				this.licPlateNo = licPlateNo;
				this.taxDate = taxDate;
				this.buyBackGuaranteeValidDate = buyBackGuaranteeValidDate;
				this.assetDocFilling = assetDocFilling;
				this.assetDocRack = assetDocRack;
				this.branchIntransit = branchIntransit;
				this.deliveryDate = deliveryDate;
				this.repossesDate = repossesDate;
				this.inventoryDate = inventoryDate;
				this.notes = notes;
				this.notesBorrowDoc = notesBorrowDoc;
				this.notesReleaseDoc = notesReleaseDoc;
				this.assetDocStatus = assetDocStatus;
				this.assetStatus = assetStatus;
				this.isAssetReplacementStatus = isAssetReplacementStatus;
				this.rrddate = rrddate;
				this.crossAssetId = crossAssetId;
				this.custUseRelation = custUseRelation;
				this.sumInsuredReplacement = sumInsuredReplacement;
				this.discountOtrtype = discountOtrtype;
				this.discountOtrpercentage = discountOtrpercentage;
				this.discountOtramount = discountOtramount;
				this.usrCrt = usrCrt;
				this.dtmUpd = dtmUpd;
				this.usrUpd = usrUpd;
				this.dtmCrt = dtmCrt;
				this.agrmntAssetLoctInfos = agrmntAssetLoctInfos;
				this.agrmntAssetLevelInfos = agrmntAssetLevelInfos;
				this.agmntAssetEmployeeInfos = agmntAssetEmployeeInfos;
				this.agrmntAssetOwnerInfos = agrmntAssetOwnerInfos;
				this.agrmntAssetOldOwnerInfos = agrmntAssetOldOwnerInfos;
				this.agrmntInsAssets = agrmntInsAssets;
				this.agrmntAssetSpbkbinfos = agrmntAssetSpbkbinfos;
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
		@JoinColumn(name = "AgrmntId")
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		public void setAgrmnt(Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "AssetMasterId", nullable = false)
		public AssetMaster getAssetMaster()
			{
				return this.assetMaster;
			}
			
		public void setAssetMaster(AssetMaster assetMaster)
			{
				this.assetMaster = assetMaster;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "CustUsedAssetID")
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(Customer customer)
			{
				this.customer = customer;
			}
			
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "SupplierAccId")
		public SupplierAccInfo getSupplierAccInfo()
			{
				return this.supplierAccInfo;
			}
			
		public void setSupplierAccInfo(SupplierAccInfo supplierAccInfo)
			{
				this.supplierAccInfo = supplierAccInfo;
			}
			
		@Column(name = "SupplierID")
		public Long getSupplierId()
			{
				return this.supplierId;
			}
			
		public void setSupplierId(Long supplierId)
			{
				this.supplierId = supplierId;
			}
			
		@Column(name = "OTRPrice", nullable = false, precision = 53, scale = 0)
		public double getOtrprice()
			{
				return this.otrprice;
			}
			
		public void setOtrprice(double otrprice)
			{
				this.otrprice = otrprice;
			}
			
		@Column(name = "DPAmount", nullable = false, precision = 53, scale = 0)
		public double getDpamount()
			{
				return this.dpamount;
			}
			
		public void setDpamount(double dpamount)
			{
				this.dpamount = dpamount;
			}
			
		@Column(name = "AssetTypeId", nullable = false)
		public long getAssetTypeId()
			{
				return this.assetTypeId;
			}
			
		public void setAssetTypeId(long assetTypeId)
			{
				this.assetTypeId = assetTypeId;
			}
			
		@Column(name = "ResaleValue", nullable = false, precision = 53, scale = 0)
		public double getResaleValue()
			{
				return this.resaleValue;
			}
			
		public void setResaleValue(double resaleValue)
			{
				this.resaleValue = resaleValue;
			}
			
		@Column(name = "SerialNo1", length = 50)
		public String getSerialNo1()
			{
				return this.serialNo1;
			}
			
		public void setSerialNo1(String serialNo1)
			{
				this.serialNo1 = serialNo1;
			}
			
		@Column(name = "SerialNo2", length = 50)
		public String getSerialNo2()
			{
				return this.serialNo2;
			}
			
		public void setSerialNo2(String serialNo2)
			{
				this.serialNo2 = serialNo2;
			}
			
		@Column(name = "IsUsed", nullable = false)
		public short getIsUsed()
			{
				return this.isUsed;
			}
			
		public void setIsUsed(short isUsed)
			{
				this.isUsed = isUsed;
			}
			
		@Column(name = "AssetUsage", nullable = false, length = 10)
		public String getAssetUsage()
			{
				return this.assetUsage;
			}
			
		public void setAssetUsage(String assetUsage)
			{
				this.assetUsage = assetUsage;
			}
			
		@Column(name = "ManufacturingMonth")
		public Short getManufacturingMonth()
			{
				return this.manufacturingMonth;
			}
			
		public void setManufacturingMonth(Short manufacturingMonth)
			{
				this.manufacturingMonth = manufacturingMonth;
			}
			
		@Column(name = "ManufacturingYear", nullable = false)
		public short getManufacturingYear()
			{
				return this.manufacturingYear;
			}
			
		public void setManufacturingYear(short manufacturingYear)
			{
				this.manufacturingYear = manufacturingYear;
			}
			
		@Column(name = "LicPlateNo", length = 50)
		public String getLicPlateNo()
			{
				return this.licPlateNo;
			}
			
		public void setLicPlateNo(String licPlateNo)
			{
				this.licPlateNo = licPlateNo;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "TaxDate", length = 23)
		public Date getTaxDate()
			{
				return this.taxDate;
			}
			
		public void setTaxDate(Date taxDate)
			{
				this.taxDate = taxDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "BuyBackGuaranteeValidDate", length = 23)
		public Date getBuyBackGuaranteeValidDate()
			{
				return this.buyBackGuaranteeValidDate;
			}
			
		public void setBuyBackGuaranteeValidDate(Date buyBackGuaranteeValidDate)
			{
				this.buyBackGuaranteeValidDate = buyBackGuaranteeValidDate;
			}
			
		@Column(name = "AssetDocFilling", length = 10)
		public String getAssetDocFilling()
			{
				return this.assetDocFilling;
			}
			
		public void setAssetDocFilling(String assetDocFilling)
			{
				this.assetDocFilling = assetDocFilling;
			}
			
		@Column(name = "AssetDocRack", length = 10)
		public String getAssetDocRack()
			{
				return this.assetDocRack;
			}
			
		public void setAssetDocRack(String assetDocRack)
			{
				this.assetDocRack = assetDocRack;
			}
			
		@Column(name = "BranchIntransit", length = 3)
		public String getBranchIntransit()
			{
				return this.branchIntransit;
			}
			
		public void setBranchIntransit(String branchIntransit)
			{
				this.branchIntransit = branchIntransit;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "DeliveryDate", length = 23)
		public Date getDeliveryDate()
			{
				return this.deliveryDate;
			}
			
		public void setDeliveryDate(Date deliveryDate)
			{
				this.deliveryDate = deliveryDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "RepossesDate", length = 23)
		public Date getRepossesDate()
			{
				return this.repossesDate;
			}
			
		public void setRepossesDate(Date repossesDate)
			{
				this.repossesDate = repossesDate;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "InventoryDate", length = 23)
		public Date getInventoryDate()
			{
				return this.inventoryDate;
			}
			
		public void setInventoryDate(Date inventoryDate)
			{
				this.inventoryDate = inventoryDate;
			}
			
		@Column(name = "Notes")
		public String getNotes()
			{
				return this.notes;
			}
			
		public void setNotes(String notes)
			{
				this.notes = notes;
			}
			
		@Column(name = "NotesBorrowDoc", nullable = false)
		public String getNotesBorrowDoc()
			{
				return this.notesBorrowDoc;
			}
			
		public void setNotesBorrowDoc(String notesBorrowDoc)
			{
				this.notesBorrowDoc = notesBorrowDoc;
			}
			
		@Column(name = "NotesReleaseDoc", nullable = false)
		public String getNotesReleaseDoc()
			{
				return this.notesReleaseDoc;
			}
			
		public void setNotesReleaseDoc(String notesReleaseDoc)
			{
				this.notesReleaseDoc = notesReleaseDoc;
			}
			
		@Column(name = "AssetDocStatus", nullable = false, length = 1)
		public String getAssetDocStatus()
			{
				return this.assetDocStatus;
			}
			
		public void setAssetDocStatus(String assetDocStatus)
			{
				this.assetDocStatus = assetDocStatus;
			}
			
		@Column(name = "AssetStatus", length = 3)
		public String getAssetStatus()
			{
				return this.assetStatus;
			}
			
		public void setAssetStatus(String assetStatus)
			{
				this.assetStatus = assetStatus;
			}
			
		@Column(name = "IsAssetReplacementStatus", nullable = false)
		public boolean isIsAssetReplacementStatus()
			{
				return this.isAssetReplacementStatus;
			}
			
		public void setIsAssetReplacementStatus(boolean isAssetReplacementStatus)
			{
				this.isAssetReplacementStatus = isAssetReplacementStatus;
			}
			
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "RRDDate", length = 23)
		public Date getRrddate()
			{
				return this.rrddate;
			}
			
		public void setRrddate(Date rrddate)
			{
				this.rrddate = rrddate;
			}
			
		@Column(name = "CrossAssetId")
		public Long getCrossAssetId()
			{
				return this.crossAssetId;
			}
			
		public void setCrossAssetId(Long crossAssetId)
			{
				this.crossAssetId = crossAssetId;
			}
			
		@Column(name = "CustUseRelation", length = 50)
		public String getCustUseRelation()
			{
				return this.custUseRelation;
			}
			
		public void setCustUseRelation(String custUseRelation)
			{
				this.custUseRelation = custUseRelation;
			}
			
		@Column(name = "SumInsuredReplacement", precision = 18, scale = 0)
		public Long getSumInsuredReplacement()
			{
				return this.sumInsuredReplacement;
			}
			
		public void setSumInsuredReplacement(Long sumInsuredReplacement)
			{
				this.sumInsuredReplacement = sumInsuredReplacement;
			}
			
		@Column(name = "DiscountOTRType", length = 1)
		public String getDiscountOtrtype()
			{
				return this.discountOtrtype;
			}
			
		public void setDiscountOtrtype(String discountOtrtype)
			{
				this.discountOtrtype = discountOtrtype;
			}
			
		@Column(name = "DiscountOTRPercentage", precision = 9, scale = 6)
		public Double getDiscountOtrpercentage()
			{
				return this.discountOtrpercentage;
			}
			
		public void setDiscountOtrpercentage(Double discountOtrpercentage)
			{
				this.discountOtrpercentage = discountOtrpercentage;
			}
			
		@Column(name = "DiscountOTRAmount", precision = 17)
		public Double getDiscountOtramount()
			{
				return this.discountOtramount;
			}
			
		public void setDiscountOtramount(Double discountOtramount)
			{
				this.discountOtramount = discountOtramount;
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
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmntAsset")
		public Set<AgrmntAssetLoctInfo> getAgrmntAssetLoctInfos()
			{
				return this.agrmntAssetLoctInfos;
			}
			
		public void setAgrmntAssetLoctInfos(Set<AgrmntAssetLoctInfo> agrmntAssetLoctInfos)
			{
				this.agrmntAssetLoctInfos = agrmntAssetLoctInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmntAsset")
		public Set<AgrmntAssetLevelInfo> getAgrmntAssetLevelInfos()
			{
				return this.agrmntAssetLevelInfos;
			}
			
		public void setAgrmntAssetLevelInfos(Set<AgrmntAssetLevelInfo> agrmntAssetLevelInfos)
			{
				this.agrmntAssetLevelInfos = agrmntAssetLevelInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmntAsset")
		public Set<AgmntAssetEmployeeInfo> getAgmntAssetEmployeeInfos()
			{
				return this.agmntAssetEmployeeInfos;
			}
			
		public void setAgmntAssetEmployeeInfos(Set<AgmntAssetEmployeeInfo> agmntAssetEmployeeInfos)
			{
				this.agmntAssetEmployeeInfos = agmntAssetEmployeeInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmntAsset")
		public Set<AgrmntAssetOwnerInfo> getAgrmntAssetOwnerInfos()
			{
				return this.agrmntAssetOwnerInfos;
			}
			
		public void setAgrmntAssetOwnerInfos(Set<AgrmntAssetOwnerInfo> agrmntAssetOwnerInfos)
			{
				this.agrmntAssetOwnerInfos = agrmntAssetOwnerInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmntAsset")
		public Set<AgrmntAssetOldOwnerInfo> getAgrmntAssetOldOwnerInfos()
			{
				return this.agrmntAssetOldOwnerInfos;
			}
			
		public void setAgrmntAssetOldOwnerInfos(Set<AgrmntAssetOldOwnerInfo> agrmntAssetOldOwnerInfos)
			{
				this.agrmntAssetOldOwnerInfos = agrmntAssetOldOwnerInfos;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmntAsset")
		public Set<AgrmntInsAsset> getAgrmntInsAssets()
			{
				return this.agrmntInsAssets;
			}
			
		public void setAgrmntInsAssets(Set<AgrmntInsAsset> agrmntInsAssets)
			{
				this.agrmntInsAssets = agrmntInsAssets;
			}
			
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "agrmntAsset")
		public Set<AgrmntAssetSpbkbinfo> getAgrmntAssetSpbkbinfos()
			{
				return this.agrmntAssetSpbkbinfos;
			}
			
		public void setAgrmntAssetSpbkbinfos(Set<AgrmntAssetSpbkbinfo> agrmntAssetSpbkbinfos)
			{
				this.agrmntAssetSpbkbinfos = agrmntAssetSpbkbinfos;
			}
			
	}
