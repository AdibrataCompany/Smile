package com.adibrata.smartdealer.action.cashtransaction;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PettyCashDtl;
import com.adibrata.smartdealer.model.PettyCashHdr;
import com.adibrata.smartdealer.service.cashtransactions.PettyCashService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class PettyCashAction extends ActionSupport implements Preparable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String mode;
	private Office office;
	private Partner partner;
	private PettyCashDtl pettCashDtl;
	private PettyCashService pettCashService;
	private PettyCashHdr pettyCashHdr;

	public PettyCashAction() {
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

	/**
	 * @return the pettCashDtl
	 */
	public PettyCashDtl getPettCashDtl() {
		return this.pettCashDtl;
	}

	/**
	 * @return the pettCashService
	 */
	public PettyCashService getPettCashService() {
		return this.pettCashService;
	}

	/**
	 * @return the pettyCashHdr
	 */
	public PettyCashHdr getPettyCashHdr() {
		return this.pettyCashHdr;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

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

	/**
	 * @param pettCashDtl
	 *            the pettCashDtl to set
	 */
	public void setPettCashDtl(PettyCashDtl pettCashDtl) {
		this.pettCashDtl = pettCashDtl;
	}

	/**
	 * @param pettCashService
	 *            the pettCashService to set
	 */
	public void setPettCashService(PettyCashService pettCashService) {
		this.pettCashService = pettCashService;
	}

	/**
	 * @param pettyCashHdr
	 *            the pettyCashHdr to set
	 */
	public void setPettyCashHdr(PettyCashHdr pettyCashHdr) {
		this.pettyCashHdr = pettyCashHdr;
	}

}
