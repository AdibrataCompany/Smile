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
import com.adibrata.smartdealer.service.setting.BankAccountService;

public class BankAccountAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mode;
	private BankAccountService bankAccountService;
	private BankAccount bankaccount;
	private Partner partner;
	private Office office;
	private List<BankAccount> lstBankAccount;
	private List<MasterTable> lstBankMaster;

	private int pageNumber;
	private long id; private static final long serialVersionUID = 1L;
	private String bankAccountCode;
	private String bankAccountName;
	private String address;
	private String rt;
	private String rw;
	private String kelurahan;
	private String kecamatan;
	private String city;
	private String zipCode;
	private String areaPhone1;
	private String phoneNo1;
	private String areaPhone2;
	private String phoneNo2;
	private String areaFax;
	private String faxNo;
	private String coacode;
	private String usrUpd;
	private String usrCrt;
	private String searchcriteria;
	private String searchvalue;
	private String bankmaster; // belum ditambahkan ke model
	
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

	private String Paging()throws Exception {

		String status = "";
		try {
			String wherecond = "";
			if (this.getSearchcriteria().contains("%"))
				wherecond = this.getSearchvalue() + " like "
						+ this.getSearchcriteria();
			else
				wherecond = this.getSearchvalue() + " = "
						+ this.getSearchcriteria();

			this.lstBankAccount = this.bankAccountService.Paging(
					this.getPageNumber(), wherecond, "");

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

	private String SaveAdd()throws Exception {
		String status = "";
		try {
			BankAccount bankAccount = new BankAccount();
			bankAccount.setBankAccountCode(this.getBankAccountCode());
			bankAccount.setBankAccountName(this.getBankAccountName());
			bankAccount.setCoacode(this.getCoacode());
			
			bankAccount.setAddress(this.getAddress());
			bankAccount.setRt(this.getRt());
			bankAccount.setRw(this.getRw());
			bankAccount.setKelurahan(this.getKelurahan());
			bankAccount.setCity(this.getCity());
			bankAccount.setZipCode(this.getZipCode());
			bankAccount.setAreaPhone1(this.getAreaPhone1());
			bankAccount.setAreaPhone2(this.getAreaPhone2());
			bankAccount.setPhoneNo1(this.getPhoneNo1());
			bankAccount.setPhoneNo2(this.getPhoneNo2());
			bankAccount.setAreaFax(this.getAreaFax());
			bankAccount.setFaxNo(this.getFaxNo());
			
			this.bankAccountService.SaveAdd(bankAccount);
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

	private String SaveEdit()throws Exception {
		String status = "";
		try {
			BankAccount bankAccount = new BankAccount();
			bankAccount.setId(this.getId());
			bankAccount.setBankAccountCode(this.getBankAccountCode());
			bankAccount.setBankAccountName(this.getBankAccountName());
			bankAccount.setCoacode(this.getCoacode());
			bankAccount.setAddress(this.getAddress());
			bankAccount.setRt(this.getRt());
			bankAccount.setRw(this.getRw());
			bankAccount.setKelurahan(this.getKelurahan());
			bankAccount.setCity(this.getCity());
			bankAccount.setZipCode(this.getZipCode());
			bankAccount.setAreaPhone1(this.getAreaPhone1());
			bankAccount.setAreaPhone2(this.getAreaPhone2());
			bankAccount.setPhoneNo1(this.getPhoneNo1());
			bankAccount.setPhoneNo2(this.getPhoneNo2());
			bankAccount.setAreaFax(this.getAreaFax());
			bankAccount.setFaxNo(this.getFaxNo());
			this.bankAccountService.SaveEdit(bankAccount);
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

	private String SaveDelete()throws Exception {
		String status = "";
		try {
			BankAccount bankAccount = new BankAccount();
			bankAccount.setId(this.getId());
	
			this.bankAccountService.SaveDel(bankAccount);
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
	 * @return the bankAccountService
	 */
	public BankAccountService getBankAccountService() {
		return bankAccountService;
	}

	/**
	 * @return the bankaccount
	 */
	public BankAccount getBankaccount() {
		return bankaccount;
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
	 * @return the lstBankAccount
	 */
	public List<BankAccount> getLstBankAccount() {
		return lstBankAccount;
	}

	/**
	 * @return the lstBankMaster
	 */
	public List<MasterTable> getLstBankMaster() {
		return lstBankMaster;
	}

	/**
	 * @param bankAccountService
	 *            the bankAccountService to set
	 */
	public void setBankAccountService(BankAccountService bankAccountService) {
		this.bankAccountService = bankAccountService;
	}

	/**
	 * @param bankaccount
	 *            the bankaccount to set
	 */
	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
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
	 * @param lstBankAccount
	 *            the lstBankAccount to set
	 */
	public void setLstBankAccount(List<BankAccount> lstBankAccount) {
		this.lstBankAccount = lstBankAccount;
	}

	/**
	 * @param lstBankMaster
	 *            the lstBankMaster to set
	 */
	public void setLstBankMaster(List<MasterTable> lstBankMaster) {
		this.lstBankMaster = lstBankMaster;
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
	 * @return the bankAccountCode
	 */
	public String getBankAccountCode() {
		return bankAccountCode;
	}

	/**
	 * @return the bankAccountName
	 */
	public String getBankAccountName() {
		return bankAccountName;
	}

	/**
	 * @return the coacode
	 */
	public String getCoacode() {
		return coacode;
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
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param bankAccountCode the bankAccountCode to set
	 */
	public void setBankAccountCode(String bankAccountCode) {
		this.bankAccountCode = bankAccountCode;
	}

	/**
	 * @param bankAccountName the bankAccountName to set
	 */
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	/**
	 * @param coacode the coacode to set
	 */
	public void setCoacode(String coacode) {
		this.coacode = coacode;
	}

	/**
	 * @param usrUpd the usrUpd to set
	 */
	public void setUsrUpd(String usrUpd) {
		this.usrUpd = usrUpd;
	}

	/**
	 * @param usrCrt the usrCrt to set
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
	 * @param searchcriteria the searchcriteria to set
	 */
	public void setSearchcriteria(String searchcriteria) {
		this.searchcriteria = searchcriteria;
	}

	/**
	 * @param searchvalue the searchvalue to set
	 */
	public void setSearchvalue(String searchvalue) {
		this.searchvalue = searchvalue;
	}
	/**
	 * @return the pageNumber
	 */
	public int getPageNumber() {
		return pageNumber;
	}
	/**
	 * @param pageNumber the pageNumber to set
	 */
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	/**
	 * @return the bankmaster
	 */
	public String getBankmaster() {
		return bankmaster;
	}
	/**
	 * @param bankmaster the bankmaster to set
	 */
	public void setBankmaster(String bankmaster) {
		this.bankmaster = bankmaster;
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
	 * @return the kecamatan
	 */
	public String getKecamatan() {
		return kecamatan;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
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
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param rt the rt to set
	 */
	public void setRt(String rt) {
		this.rt = rt;
	}

	/**
	 * @param rw the rw to set
	 */
	public void setRw(String rw) {
		this.rw = rw;
	}

	/**
	 * @param kelurahan the kelurahan to set
	 */
	public void setKelurahan(String kelurahan) {
		this.kelurahan = kelurahan;
	}

	/**
	 * @param kecamatan the kecamatan to set
	 */
	public void setKecamatan(String kecamatan) {
		this.kecamatan = kecamatan;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @param areaPhone1 the areaPhone1 to set
	 */
	public void setAreaPhone1(String areaPhone1) {
		this.areaPhone1 = areaPhone1;
	}

	/**
	 * @param phoneNo1 the phoneNo1 to set
	 */
	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}

	/**
	 * @param areaPhone2 the areaPhone2 to set
	 */
	public void setAreaPhone2(String areaPhone2) {
		this.areaPhone2 = areaPhone2;
	}

	/**
	 * @param phoneNo2 the phoneNo2 to set
	 */
	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}

	/**
	 * @param areaFax the areaFax to set
	 */
	public void setAreaFax(String areaFax) {
		this.areaFax = areaFax;
	}

	/**
	 * @param faxNo the faxNo to set
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

}
