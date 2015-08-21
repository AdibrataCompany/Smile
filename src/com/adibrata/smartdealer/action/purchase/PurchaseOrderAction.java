package com.adibrata.smartdealer.action.purchase;

/**
 * @author Henry
 *
 */
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.purchase.PurchaseEntryDao;
import com.adibrata.smartdealer.dao.setting.AssetDocMasterDao;
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.purchase.PurchaseInvoiceService;
import com.adibrata.smartdealer.service.purchase.PurchaseOrderService;
import com.adibrata.smartdealer.service.setting.AssetDocMasterService;

public class PurchaseOrderAction extends BaseAction implements Preparable {

	/**
	 *
	 */

	private static final long serialVersionUID = 1L;
	private Partner partner;
	private Office office;
	private String mode;
	private PurchaseOrderService purchaseOrderService;

	private List<Supplier> lstSupplier;
	private List<PurchaseOrderHdr> lstPurchaseOrderHdr;
	private List<PurchaseOrderDtl> lstPurchaseOrderDtl;
	private PurchaseOrderHdr purchaseOrderHdr;
	private PurchaseOrderDtl purchaseOrderDtl;

	private String searchcriteria;
	private String searchvalue;
	private long id;
	
	
	private int pageNumber;
	private String message;
	private Map<String, Object> session;

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
	private double assetPrice;
	private Date UsrUpd;

	public PurchaseOrderAction() throws Exception{
		try {
			PurchaseOrderService purchaseOrderService = new PurchaseEntryDao();

			this.purchaseOrderService = purchaseOrderService;
			Partner partner = new Partner();
			Office office = new Office();
			PurchaseOrderDtl orderDtl = new PurchaseOrderDtl();
			this.session.put("purchaseorder.purchaseorderdtl", orderDtl);

			this.setPartner(partner);
			this.setOffice(office);

			if (this.pageNumber == 0)
				this.pageNumber = 1;
		} catch (Exception exp) {

			this.setMessage(BaseAction.ErrorMessage());
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}

	}

	public String execute() throws Exception{
		String strMode;
		strMode = mode;

		if (mode != null) {
			switch (strMode) {
			case "search":
			default:
				return "failed";
			}
		} else {
			strMode = INPUT;
		}
		return strMode;
	}

	private String AddDetail()throws Exception {

		PurchaseOrderDtl orderDtl = new PurchaseOrderDtl();
		orderDtl.setAssetBrand(assetBrand);
		orderDtl.setAssetType(assetType);
		orderDtl.setAssetModel(assetModel);
		orderDtl.setBpkbno(bpkbno);
		orderDtl.setBpkbname(bpkbname);
		orderDtl.setBpkbaddress(bpkbaddress);
		orderDtl.setVehicleColor(vehicleColor);
		orderDtl.setMachineNo(machineNo);
		orderDtl.setChasisNo(chasisNo);
		orderDtl.setCylinder(cylinder);
		orderDtl.setLicensePlate(licensePlate);
		orderDtl.setManufacturingMonth(manufacturingMonth);
		orderDtl.setManufacturingYear(manufacturingYear);
		orderDtl.setAssetPrice(assetPrice);
		orderDtl.setUsrUpd("");
		lstPurchaseOrderDtl.add(orderDtl);

		return "";
	}

	private String Save() {
		return "";
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the partner
	 */
	public Partner getPartner() {
		return partner;
	}

	/**
	 * @return the office
	 */
	public Office getOffice() {
		return office;
	}

	/**
	 * @return the purchaseOrderService
	 */
	public PurchaseOrderService getPurchaseOrderService() {
		return purchaseOrderService;
	}

	/**
	 * @param partner
	 *            the partner to set
	 */
	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	/**
	 * @param office
	 *            the office to set
	 */
	public void setOffice(Office office) {
		this.office = office;
	}

	/**
	 * @param purchaseOrderService
	 *            the purchaseOrderService to set
	 */
	public void setPurchaseOrderService(
			PurchaseOrderService purchaseOrderService) {
		this.purchaseOrderService = purchaseOrderService;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	public String order() {
		if (mode != null) {
			if (mode.equals("search")) {
				return "search";
			}
			if (mode.equals("entry")) {
				return "entry";
			}
			if (mode.equals("add")) {
				return "add";
			}
			if (mode.equals("del")) {
				return "del";
			}
			if (mode.equals("save")) {
				return "save";
			}
			if (mode.equals("back")) {
				return "back";
			}
		} else {
			return "start";
		}
		return mode;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @return the lstSupplier
	 */
	public List<Supplier> getLstSupplier() {
		return lstSupplier;
	}

	/**
	 * @return the lstPurchaseOrderHdr
	 */
	public List<PurchaseOrderHdr> getLstPurchaseOrderHdr() {
		return lstPurchaseOrderHdr;
	}

	/**
	 * @return the lstPurchaseOrderDtl
	 */
	public List<PurchaseOrderDtl> getLstPurchaseOrderDtl() {
		lstPurchaseOrderDtl = (List<PurchaseOrderDtl>) this.session.get("purchaseorder.purchaseorderdtl");
		return lstPurchaseOrderDtl;
	}

	/**
	 * @return the purchaseOrderHdr
	 */
	public PurchaseOrderHdr getPurchaseOrderHdr() {
		return purchaseOrderHdr;
	}

	/**
	 * @return the purchaseOrderDtl
	 */
	public PurchaseOrderDtl getPurchaseOrderDtl() {

		return purchaseOrderDtl;
	}

	/**
	 * @return the searchcriteria
	 */
	public String getSearchcriteria() {
		return searchcriteria;
	}

	/**
	 * @return the searchvalue
	 */
	public String getSearchvalue() {
		return searchvalue;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the usrUpd
	 */
	public String getUsrUpd() {
		return usrUpd;
	}

	/**
	 * @return the usrCrt
	 */
	public String getUsrCrt() {
		return usrCrt;
	}

	/**
	 * @return the pageNumber
	 */
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the assetBrand
	 */
	public String getAssetBrand() {
		return assetBrand;
	}

	/**
	 * @return the assetType
	 */
	public String getAssetType() {
		return assetType;
	}

	/**
	 * @return the assetModel
	 */
	public String getAssetModel() {
		return assetModel;
	}

	/**
	 * @return the bpkbno
	 */
	public String getBpkbno() {
		return bpkbno;
	}

	/**
	 * @return the bpkbname
	 */
	public String getBpkbname() {
		return bpkbname;
	}

	/**
	 * @return the bpkbaddress
	 */
	public String getBpkbaddress() {
		return bpkbaddress;
	}

	/**
	 * @return the vehicleColor
	 */
	public String getVehicleColor() {
		return vehicleColor;
	}

	/**
	 * @return the machineNo
	 */
	public String getMachineNo() {
		return machineNo;
	}

	/**
	 * @return the chasisNo
	 */
	public String getChasisNo() {
		return chasisNo;
	}

	/**
	 * @return the cylinder
	 */
	public String getCylinder() {
		return cylinder;
	}

	/**
	 * @return the licensePlate
	 */
	public String getLicensePlate() {
		return licensePlate;
	}

	/**
	 * @return the manufacturingMonth
	 */
	public String getManufacturingMonth() {
		return manufacturingMonth;
	}

	/**
	 * @return the manufacturingYear
	 */
	public String getManufacturingYear() {
		return manufacturingYear;
	}

	/**
	 * @return the assetPrice
	 */
	public double getAssetPrice() {
		return assetPrice;
	}

	/**
	 * @param lstSupplier
	 *            the lstSupplier to set
	 */
	public void setLstSupplier(List<Supplier> lstSupplier) {
		this.lstSupplier = lstSupplier;
	}

	/**
	 * @param lstPurchaseOrderHdr
	 *            the lstPurchaseOrderHdr to set
	 */
	public void setLstPurchaseOrderHdr(
			List<PurchaseOrderHdr> lstPurchaseOrderHdr) {
		this.lstPurchaseOrderHdr = lstPurchaseOrderHdr;
	}

	/**
	 * @param lstPurchaseOrderDtl
	 *            the lstPurchaseOrderDtl to set
	 */
	public void setLstPurchaseOrderDtl(
			List<PurchaseOrderDtl> lstPurchaseOrderDtl) {
		this.session.put("purchaseorder.purchaseorderdtl", lstPurchaseOrderDtl);
		this.lstPurchaseOrderDtl = lstPurchaseOrderDtl;
	}

	/**
	 * @param purchaseOrderHdr
	 *            the purchaseOrderHdr to set
	 */
	public void setPurchaseOrderHdr(PurchaseOrderHdr purchaseOrderHdr) {
		this.purchaseOrderHdr = purchaseOrderHdr;
	}

	/**
	 * @param purchaseOrderDtl
	 *            the purchaseOrderDtl to set
	 */
	public void setPurchaseOrderDtl(PurchaseOrderDtl purchaseOrderDtl) {
		this.purchaseOrderDtl = purchaseOrderDtl;
	}

	/**
	 * @param searchcriteria
	 *            the searchcriteria to set
	 */
	public void setSearchcriteria(String searchcriteria) {
		this.searchcriteria = searchcriteria;
	}

	/**
	 * @param searchvalue
	 *            the searchvalue to set
	 */
	public void setSearchvalue(String searchvalue) {
		this.searchvalue = searchvalue;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param usrUpd
	 *            the usrUpd to set
	 */
	public void setUsrUpd(String usrUpd) {
		this.usrUpd = usrUpd;
	}

	/**
	 * @param usrCrt
	 *            the usrCrt to set
	 */
	public void setUsrCrt(String usrCrt) {
		this.usrCrt = usrCrt;
	}

	/**
	 * @param pageNumber
	 *            the pageNumber to set
	 */
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @param assetBrand
	 *            the assetBrand to set
	 */
	public void setAssetBrand(String assetBrand) {
		this.assetBrand = assetBrand;
	}

	/**
	 * @param assetType
	 *            the assetType to set
	 */
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	/**
	 * @param assetModel
	 *            the assetModel to set
	 */
	public void setAssetModel(String assetModel) {
		this.assetModel = assetModel;
	}

	/**
	 * @param bpkbno
	 *            the bpkbno to set
	 */
	public void setBpkbno(String bpkbno) {
		this.bpkbno = bpkbno;
	}

	/**
	 * @param bpkbname
	 *            the bpkbname to set
	 */
	public void setBpkbname(String bpkbname) {
		this.bpkbname = bpkbname;
	}

	/**
	 * @param bpkbaddress
	 *            the bpkbaddress to set
	 */
	public void setBpkbaddress(String bpkbaddress) {
		this.bpkbaddress = bpkbaddress;
	}

	/**
	 * @param vehicleColor
	 *            the vehicleColor to set
	 */
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	/**
	 * @param machineNo
	 *            the machineNo to set
	 */
	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}

	/**
	 * @param chasisNo
	 *            the chasisNo to set
	 */
	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	/**
	 * @param cylinder
	 *            the cylinder to set
	 */
	public void setCylinder(String cylinder) {
		this.cylinder = cylinder;
	}

	/**
	 * @param licensePlate
	 *            the licensePlate to set
	 */
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	/**
	 * @param manufacturingMonth
	 *            the manufacturingMonth to set
	 */
	public void setManufacturingMonth(String manufacturingMonth) {
		this.manufacturingMonth = manufacturingMonth;
	}

	/**
	 * @param manufacturingYear
	 *            the manufacturingYear to set
	 */
	public void setManufacturingYear(String manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}

	/**
	 * @param assetPrice
	 *            the assetPrice to set
	 */
	public void setAssetPrice(double assetPrice) {
		this.assetPrice = assetPrice;
	}

	/**
	 * @param usrUpd
	 *            the usrUpd to set
	 */
	public void setUsrUpd(Date usrUpd) {
		UsrUpd = usrUpd;
	}

	/**
	 * @return the session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * @param session
	 *            the session to set
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
