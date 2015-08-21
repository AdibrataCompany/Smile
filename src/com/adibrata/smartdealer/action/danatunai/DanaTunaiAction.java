package com.adibrata.smartdealer.action.danatunai;

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
import com.adibrata.smartdealer.service.danatunai.DanaTunaiService;

public class DanaTunaiAction extends ActionSupport implements Preparable {
	private String mode;
	private DanaTunaiService danaTunaiService;
	private Partner partner;
	private Office office;
	private List<Customer> lstCustomer;
	private List<DanaTunai> lstDanaTunai;

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
			strMode = INPUT;
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
	 * @return the danaTunaiService
	 */
	public DanaTunaiService getDanaTunaiService() {
		return danaTunaiService;
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
	 * @return the lstCustomer
	 */
	public List<Customer> getLstCustomer() {
		return lstCustomer;
	}

	/**
	 * @return the lstDanaTunai
	 */
	public List<DanaTunai> getLstDanaTunai() {
		return lstDanaTunai;
	}

	/**
	 * @param mode
	 *            the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param danaTunaiService
	 *            the danaTunaiService to set
	 */
	public void setDanaTunaiService(DanaTunaiService danaTunaiService) {
		this.danaTunaiService = danaTunaiService;
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
	 * @param lstCustomer
	 *            the lstCustomer to set
	 */
	public void setLstCustomer(List<Customer> lstCustomer) {
		this.lstCustomer = lstCustomer;
	}

	/**
	 * @param lstDanaTunai
	 *            the lstDanaTunai to set
	 */
	public void setLstDanaTunai(List<DanaTunai> lstDanaTunai) {
		this.lstDanaTunai = lstDanaTunai;
	}

	public DanaTunaiAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

}
