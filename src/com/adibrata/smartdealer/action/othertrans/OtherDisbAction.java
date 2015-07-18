/**
 * 
 */
package com.adibrata.smartdealer.action.othertrans;

/**
 * @author Henry
 *
 */
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.accpay.PVDisbursementService;
import com.adibrata.smartdealer.service.othertransactions.OtherDisburseService;

public class OtherDisbAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private String mode;
	private Partner partner;
	private Office office;
	private OtherDsbHdr otherDsbHdr;
	private OtherDsbDtl otherDsbDtl;
	private List<OtherDsbHdr> lstOtherDisHdr;
	private List<OtherDsbDtl> lstOtherDisbDtl;

	private OtherDisburseService otherDisburseService;

	public String execute() {
		String strMode;
		strMode = mode;

		if (mode != null) {
			switch (strMode) {
			case "search":
			default:
				return "failed";
			}
		} else {
			strMode = "start";
		}
		return strMode;
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
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
	 * @return the otherDsbHdr
	 */
	public OtherDsbHdr getOtherDsbHdr() {
		return otherDsbHdr;
	}

	/**
	 * @return the otherDsbDtl
	 */
	public OtherDsbDtl getOtherDsbDtl() {
		return otherDsbDtl;
	}

	/**
	 * @return the lstOtherDisHdr
	 */
	public List<OtherDsbHdr> getLstOtherDisHdr() {
		return lstOtherDisHdr;
	}

	/**
	 * @return the lstOtherDisbDtl
	 */
	public List<OtherDsbDtl> getLstOtherDisbDtl() {
		return lstOtherDisbDtl;
	}

	/**
	 * @return the otherDisburseService
	 */
	public OtherDisburseService getOtherDisburseService() {
		return otherDisburseService;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param partner the partner to set
	 */
	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	/**
	 * @param office the office to set
	 */
	public void setOffice(Office office) {
		this.office = office;
	}

	/**
	 * @param otherDsbHdr the otherDsbHdr to set
	 */
	public void setOtherDsbHdr(OtherDsbHdr otherDsbHdr) {
		this.otherDsbHdr = otherDsbHdr;
	}

	/**
	 * @param otherDsbDtl the otherDsbDtl to set
	 */
	public void setOtherDsbDtl(OtherDsbDtl otherDsbDtl) {
		this.otherDsbDtl = otherDsbDtl;
	}

	/**
	 * @param lstOtherDisHdr the lstOtherDisHdr to set
	 */
	public void setLstOtherDisHdr(List<OtherDsbHdr> lstOtherDisHdr) {
		this.lstOtherDisHdr = lstOtherDisHdr;
	}

	/**
	 * @param lstOtherDisbDtl the lstOtherDisbDtl to set
	 */
	public void setLstOtherDisbDtl(List<OtherDsbDtl> lstOtherDisbDtl) {
		this.lstOtherDisbDtl = lstOtherDisbDtl;
	}

	/**
	 * @param otherDisburseService the otherDisburseService to set
	 */
	public void setOtherDisburseService(OtherDisburseService otherDisburseService) {
		this.otherDisburseService = otherDisburseService;
	}

	public OtherDisbAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

}
