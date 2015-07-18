package com.adibrata.smartdealer.action.setting;

/**
 * @author Henry
 *
 */
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.sun.org.apache.bcel.internal.generic.LSTORE;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.setting.AssetDocMasterService;
import com.adibrata.smartdealer.service.setting.MasterService;

public class MasterAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mode;
	private MasterType masterType;
	private MasterTable masterTable;
	private MasterService masterService;
	private Partner partner;
	private Office office;
	private List<MasterType> lstMasterType;

	private List<MasterTable> lstMasterTable;
	private String searchcriteria;
	private String searchvalue;
	private int pageNumber;
	private String usrUpd;
	private String usrCrt;
	private String message;
	private long id;

	private String masterCode;
	private String masterValue;
	private Integer isActive;

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	public String execute() {
		String strMode;
		strMode = mode;

		if (mode != null) {
			switch (strMode) {
			case "search":
				try {
					strMode = Paging();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case "edit":

			case "del":
				try {
					return SaveDelete();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case "add":

				try {
					strMode = SaveAdd();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case "saveadd":
				try {
					strMode = SaveAdd();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case "saveedit":
				try {
					strMode = SaveEdit();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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

			this.lstMasterTable = this.masterService.Paging(
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

	private String SaveAdd() throws Exception {
		String status = "";
		try {
			MasterTable masterTable = new MasterTable();

			masterTable.setMasterCode(this.getMasterCode());
			masterTable.setMasterValue(this.getMasterValue());
			masterTable.setMasterType(this.getMasterType());

			MasterType mastertype = new MasterType();

			this.masterService.SaveAdd(mastertype, masterTable);
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
			MasterTable masterTable = new MasterTable();
			masterTable.setId(this.getId());
			masterTable.setMasterCode(this.getMasterCode());
			masterTable.setMasterValue(this.getMasterValue());
			masterTable.setMasterType(this.getMasterType());

			MasterType mastertype = new MasterType();

			this.masterService.SaveAdd(mastertype, masterTable);
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
			MasterTable masterTable = new MasterTable();
			masterTable.setId(this.getId());
	

			this.masterService.SaveDel(masterTable);
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
	 * @return the masterType
	 */
	public MasterType getMasterType() {
		return masterType;
	}

	/**
	 * @return the masterTable
	 */
	public MasterTable getMasterTable() {
		return masterTable;
	}

	/**
	 * @return the masterService
	 */
	public MasterService getMasterService() {
		return masterService;
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
	 * @return the lstMasterType
	 */
	public List<MasterType> getLstMasterType() {
		return lstMasterType;
	}

	/**
	 * @return the lstMasterTable
	 */
	public List<MasterTable> getLstMasterTable() {
		return lstMasterTable;
	}

	/**
	 * @param masterType
	 *            the masterType to set
	 */
	public void setMasterType(MasterType masterType) {
		this.masterType = masterType;
	}

	/**
	 * @param masterTable
	 *            the masterTable to set
	 */
	public void setMasterTable(MasterTable masterTable) {
		this.masterTable = masterTable;
	}

	/**
	 * @param masterService
	 *            the masterService to set
	 */
	public void setMasterService(MasterService masterService) {
		this.masterService = masterService;
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
	 * @param lstMasterType
	 *            the lstMasterType to set
	 */
	public void setLstMasterType(List<MasterType> lstMasterType) {
		this.lstMasterType = lstMasterType;
	}

	/**
	 * @param lstMasterTable
	 *            the lstMasterTable to set
	 */
	public void setLstMasterTable(List<MasterTable> lstMasterTable) {
		this.lstMasterTable = lstMasterTable;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
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
	 * @return the pageNumber
	 */
	public int getPageNumber() {
		return pageNumber;
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
	 * @return the message
	 */
	public String getMessage() {
		return message;
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
	 * @param pageNumber
	 *            the pageNumber to set
	 */
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
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
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the masterCode
	 */
	public String getMasterCode() {
		return masterCode;
	}

	/**
	 * @return the masterValue
	 */
	public String getMasterValue() {
		return masterValue;
	}

	/**
	 * @return the isActive
	 */
	public Integer getIsActive() {
		return isActive;
	}

	/**
	 * @param masterCode
	 *            the masterCode to set
	 */
	public void setMasterCode(String masterCode) {
		this.masterCode = masterCode;
	}

	/**
	 * @param masterValue
	 *            the masterValue to set
	 */
	public void setMasterValue(String masterValue) {
		this.masterValue = masterValue;
	}

	/**
	 * @param isActive
	 *            the isActive to set
	 */
	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

}
