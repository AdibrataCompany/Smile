package com.adibrata.smartdealer.action.setting;

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

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.setting.AssetDocMasterService;
import com.adibrata.smartdealer.service.setting.DealerService;

public class DealerAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id; private static final long serialVersionUID = 1L;
	private String mode;
	private DealerService dealerService;
	private Supplier supplier;
	private Partner partner;
	private Office office;
	private List<Supplier> lstDealer;
	private int pageNumber;
	private String name;
	private String address;
	private String rt;
	private String rw;
	private String kelurahan;
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
	// private String fullAddress; pindahkan ke service dao untuk simpan full
	// address
	private String searchcriteria;
	private String searchvalue;
	private String usrUpd;
	private String usrCrt;

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	public String execute() throws Exception {
		String strMode;
		strMode = mode;

		if (mode != null) {
			switch (strMode) {
			case "search":
				strMode = Paging();
			case "edit":

			case "del":
				return SaveDelete();
			case "add":

				strMode = SaveAdd();
			case "saveadd":
				strMode = SaveAdd();
			case "saveedit":
				strMode = SaveEdit();
			case "back":

			default:
				return "failed";
			}
		} else {
			strMode = "start";
		}
		return strMode;
	}

	private String Paging() throws Exception {

		String status = "";
		try {
			String wherecond = "";
			if (this.getSearchcriteria().contains("%"))
				wherecond = this.getSearchvalue() + " like "
						+ this.getSearchcriteria();
			else
				wherecond = this.getSearchvalue() + " = "
						+ this.getSearchcriteria();

			this.lstDealer = this.dealerService.Paging(this.getPageNumber(),
					wherecond, "");

			status = "Success";
		} catch (Exception exp) {
			status = "Failed";
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return status;
	}

	private String SaveAdd() throws Exception {
		String status = "";
		try {

			Supplier supplier = new Supplier();
			supplier.setName(this.getName());
			supplier.setAddress(this.getAddress());
			supplier.setRt(this.getRt());
			supplier.setRw(this.getRw());
			supplier.setKelurahan(this.getKelurahan());
			supplier.setCity(this.getCity());
			supplier.setZipcode(this.getZipcode());
			supplier.setAreaPhone1(this.getAreaPhone1());
			supplier.setAreaPhone2(this.getAreaPhone2());
			supplier.setPhoneNo1(this.getPhoneNo1());
			supplier.setPhoneNo2(this.getPhoneNo2());
			supplier.setAreaFax(this.getAreaFax());
			supplier.setFaxNo(this.getFaxNo());
			supplier.setHandphone(this.getHandphone());

			this.dealerService.SaveAdd(supplier);
			status = SUCCESS;
		} catch (Exception exp) {
			status = ERROR;
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return status;
	}

	private String SaveEdit() throws Exception {
		String status = "";
		try {

			Supplier supplier = new Supplier();
			supplier.setId(this.getId());
			supplier.setName(this.getName());
			supplier.setAddress(this.getAddress());
			supplier.setRt(this.getRt());
			supplier.setRw(this.getRw());
			supplier.setKelurahan(this.getKelurahan());
			supplier.setCity(this.getCity());
			supplier.setZipcode(this.getZipcode());
			supplier.setAreaPhone1(this.getAreaPhone1());
			supplier.setAreaPhone2(this.getAreaPhone2());
			supplier.setPhoneNo1(this.getPhoneNo1());
			supplier.setPhoneNo2(this.getPhoneNo2());
			supplier.setAreaFax(this.getAreaFax());
			supplier.setFaxNo(this.getFaxNo());
			supplier.setHandphone(this.getHandphone());

			this.dealerService.SaveAdd(supplier);
			status = SUCCESS;
		} catch (Exception exp) {
			status = ERROR;
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return status;
	}

	private String SaveDelete() throws Exception {
		String status = "";
		try {

			Supplier supplier = new Supplier();
			supplier.setId(this.getId());
			this.dealerService.SaveDel(supplier);
			status = SUCCESS;
		} catch (Exception exp) {
			status = ERROR;
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return status;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the dealerService
	 */
	public DealerService getDealerService() {
		return dealerService;
	}

	/**
	 * @return the supplier
	 */
	public Supplier getSupplier() {
		return supplier;
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
	 * @return the lstDealer
	 */
	public List<Supplier> getLstDealer() {
		return lstDealer;
	}

	/**
	 * @param dealerService
	 *            the dealerService to set
	 */
	public void setDealerService(DealerService dealerService) {
		this.dealerService = dealerService;
	}

	/**
	 * @param supplier
	 *            the supplier to set
	 */
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
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
	 * @param lstDealer
	 *            the lstDealer to set
	 */
	public void setLstDealer(List<Supplier> lstDealer) {
		this.lstDealer = lstDealer;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the pageNumber
	 */
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the rt
	 */
	public String getRt() {
		return rt;
	}

	/**
	 * @return the rw
	 */
	public String getRw() {
		return rw;
	}

	/**
	 * @return the kelurahan
	 */
	public String getKelurahan() {
		return kelurahan;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the areaPhone1
	 */
	public String getAreaPhone1() {
		return areaPhone1;
	}

	/**
	 * @return the phoneNo1
	 */
	public String getPhoneNo1() {
		return phoneNo1;
	}

	/**
	 * @return the areaPhone2
	 */
	public String getAreaPhone2() {
		return areaPhone2;
	}

	/**
	 * @return the phoneNo2
	 */
	public String getPhoneNo2() {
		return phoneNo2;
	}

	/**
	 * @return the areaFax
	 */
	public String getAreaFax() {
		return areaFax;
	}

	/**
	 * @return the faxNo
	 */
	public String getFaxNo() {
		return faxNo;
	}

	/**
	 * @return the handphone
	 */
	public String getHandphone() {
		return handphone;
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
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param pageNumber
	 *            the pageNumber to set
	 */
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param rt
	 *            the rt to set
	 */
	public void setRt(String rt) {
		this.rt = rt;
	}

	/**
	 * @param rw
	 *            the rw to set
	 */
	public void setRw(String rw) {
		this.rw = rw;
	}

	/**
	 * @param kelurahan
	 *            the kelurahan to set
	 */
	public void setKelurahan(String kelurahan) {
		this.kelurahan = kelurahan;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param zipcode
	 *            the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @param areaPhone1
	 *            the areaPhone1 to set
	 */
	public void setAreaPhone1(String areaPhone1) {
		this.areaPhone1 = areaPhone1;
	}

	/**
	 * @param phoneNo1
	 *            the phoneNo1 to set
	 */
	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}

	/**
	 * @param areaPhone2
	 *            the areaPhone2 to set
	 */
	public void setAreaPhone2(String areaPhone2) {
		this.areaPhone2 = areaPhone2;
	}

	/**
	 * @param phoneNo2
	 *            the phoneNo2 to set
	 */
	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}

	/**
	 * @param areaFax
	 *            the areaFax to set
	 */
	public void setAreaFax(String areaFax) {
		this.areaFax = areaFax;
	}

	/**
	 * @param faxNo
	 *            the faxNo to set
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	/**
	 * @param handphone
	 *            the handphone to set
	 */
	public void setHandphone(String handphone) {
		this.handphone = handphone;
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

}
