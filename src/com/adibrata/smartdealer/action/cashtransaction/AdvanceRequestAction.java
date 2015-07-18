package com.adibrata.smartdealer.action.cashtransaction;

import com.adibrata.smartdealer.model.AdvanceCash;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.cashtransactions.AdvanceCashService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class AdvanceRequestAction extends ActionSupport implements Preparable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AdvanceCash advanceCash;
	private AdvanceCashService advanceCashService;
	private String mode;
	private Office office;
	private Partner partner;

	public AdvanceRequestAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		String strMode;
		strMode = this.mode;

		if (this.mode != null) {
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
	 * @return the advanceCash
	 */
	public AdvanceCash getAdvanceCash() {
		return this.advanceCash;
	}

	/**
	 * @return the advanceCashService
	 */
	public AdvanceCashService getAdvanceCashService() {
		return this.advanceCashService;
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return this.mode;
	}

	/**
	 * @return the office
	 */
	public Office getOffice() {
		return this.office;
	}

	/**
	 * @return the partner
	 */
	public Partner getPartner() {
		return this.partner;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * @param advanceCash
	 *            the advanceCash to set
	 */
	public void setAdvanceCash(AdvanceCash advanceCash) {
		this.advanceCash = advanceCash;
	}

	/**
	 * @param advanceCashService
	 *            the advanceCashService to set
	 */
	public void setAdvanceCashService(AdvanceCashService advanceCashService) {
		this.advanceCashService = advanceCashService;
	}

	/**
	 * @param mode
	 *            the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param office
	 *            the office to set
	 */
	public void setOffice(Office office) {
		this.office = office;
	}

	/**
	 * @param partner
	 *            the partner to set
	 */
	public void setPartner(Partner partner) {
		this.partner = partner;
	}

}
