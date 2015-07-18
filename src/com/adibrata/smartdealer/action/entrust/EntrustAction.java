package com.adibrata.smartdealer.action.entrust;

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
import com.adibrata.smartdealer.service.accpay.PVDisbursementService;
import com.adibrata.smartdealer.service.entrust.EntrustService;

public class EntrustAction extends ActionSupport implements Preparable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String mode;
	private EntrustService entrustService;
	private Partner partner;
	private Office office;
	private List<EntrustHdr> lstEntrustHdr;
	private List<EntrustDtl> lstEntrustDtl;


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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the entrustService
	 */
	public EntrustService getEntrustService() {
		return entrustService;
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
	 * @return the lstEntrustHdr
	 */
	public List<EntrustHdr> getLstEntrustHdr() {
		return lstEntrustHdr;
	}

	/**
	 * @return the lstEntrustDtl
	 */
	public List<EntrustDtl> getLstEntrustDtl() {
		return lstEntrustDtl;
	}

	/**
	 * @param entrustService the entrustService to set
	 */
	public void setEntrustService(EntrustService entrustService) {
		this.entrustService = entrustService;
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
	 * @param lstEntrustHdr the lstEntrustHdr to set
	 */
	public void setLstEntrustHdr(List<EntrustHdr> lstEntrustHdr) {
		this.lstEntrustHdr = lstEntrustHdr;
	}

	/**
	 * @param lstEntrustDtl the lstEntrustDtl to set
	 */
	public void setLstEntrustDtl(List<EntrustDtl> lstEntrustDtl) {
		this.lstEntrustDtl = lstEntrustDtl;
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

	public String receive() {
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

}
