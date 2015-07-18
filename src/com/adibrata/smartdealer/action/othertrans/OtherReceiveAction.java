package com.adibrata.smartdealer.action.othertrans;

/**
 * @author Henry
 *
 */
import java.util.List;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.OtherRcvDtl;
import com.adibrata.smartdealer.model.OtherRcvHdr;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.othertransactions.OtherReceiveService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class OtherReceiveAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<OtherRcvDtl> lstOtherRcvDtl;
	private List<OtherRcvHdr> lstOtherRcvHdr;
	private String mode;
	private Office office;
	private OtherRcvDtl otherRcvDtl;
	private OtherRcvHdr otherRcvHdr;
	private OtherReceiveService otjOtherReceiveService;
	private Partner partner;

	public OtherReceiveAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		String strMode;
		strMode = this.mode;

		if (this.mode != null) {
			switch (strMode) {
				case "search" :
				default :
					return "failed";
			}
		} else {
			strMode = "start";
		}
		return strMode;
	}

	/**
	 * @return the lstOtherRcvDtl
	 */
	public List<OtherRcvDtl> getLstOtherRcvDtl() {
		return this.lstOtherRcvDtl;
	}

	/**
	 * @return the lstOtherRcvHdr
	 */
	public List<OtherRcvHdr> getLstOtherRcvHdr() {
		return this.lstOtherRcvHdr;
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
	 * @return the otherRcvDtl
	 */
	public OtherRcvDtl getOtherRcvDtl() {
		return this.otherRcvDtl;
	}

	/**
	 * @return the otherRcvHdr
	 */
	public OtherRcvHdr getOtherRcvHdr() {
		return this.otherRcvHdr;
	}

	/**
	 * @return the otjOtherReceiveService
	 */
	public OtherReceiveService getOtjOtherReceiveService() {
		return this.otjOtherReceiveService;
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
	 * @param lstOtherRcvDtl
	 *            the lstOtherRcvDtl to set
	 */
	public void setLstOtherRcvDtl(List<OtherRcvDtl> lstOtherRcvDtl) {
		this.lstOtherRcvDtl = lstOtherRcvDtl;
	}

	/**
	 * @param lstOtherRcvHdr
	 *            the lstOtherRcvHdr to set
	 */
	public void setLstOtherRcvHdr(List<OtherRcvHdr> lstOtherRcvHdr) {
		this.lstOtherRcvHdr = lstOtherRcvHdr;
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
	 * @param otherRcvDtl
	 *            the otherRcvDtl to set
	 */
	public void setOtherRcvDtl(OtherRcvDtl otherRcvDtl) {
		this.otherRcvDtl = otherRcvDtl;
	}

	/**
	 * @param otherRcvHdr
	 *            the otherRcvHdr to set
	 */
	public void setOtherRcvHdr(OtherRcvHdr otherRcvHdr) {
		this.otherRcvHdr = otherRcvHdr;
	}

	/**
	 * @param otjOtherReceiveService
	 *            the otjOtherReceiveService to set
	 */
	public void setOtjOtherReceiveService(
			OtherReceiveService otjOtherReceiveService) {
		this.otjOtherReceiveService = otjOtherReceiveService;
	}

	/**
	 * @param partner
	 *            the partner to set
	 */
	public void setPartner(Partner partner) {
		this.partner = partner;
	}

}
