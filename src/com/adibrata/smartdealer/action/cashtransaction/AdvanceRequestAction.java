package com.adibrata.smartdealer.action.cashtransaction;

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
import com.adibrata.smartdealer.service.cashtransactions.AdvanceCashService;

public class AdvanceRequestAction extends ActionSupport implements Preparable {
	private String mode;
	private AdvanceCashService advanceCashService;
	private Partner partner;
	private Office office;
	private AdvanceCash advanceCash;

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
	 * @return the advanceCashService
	 */
	public AdvanceCashService getAdvanceCashService() {
		return advanceCashService;
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
	 * @return the advanceCash
	 */
	public AdvanceCash getAdvanceCash() {
		return advanceCash;
	}

	/**
	 * @param mode
	 *            the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param advanceCashService
	 *            the advanceCashService to set
	 */
	public void setAdvanceCashService(AdvanceCashService advanceCashService) {
		this.advanceCashService = advanceCashService;
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
	 * @param advanceCash
	 *            the advanceCash to set
	 */
	public void setAdvanceCash(AdvanceCash advanceCash) {
		this.advanceCash = advanceCash;
	}

	public AdvanceRequestAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

}
