package com.adibrata.smartdealer.action.purchase;

/**
 * @author Henry
 *
 */
import java.util.List;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.ReturPurchaseDtl;
import com.adibrata.smartdealer.model.ReturPurchaseHdr;
import com.adibrata.smartdealer.service.purchase.PurchaseReturnService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class PurchaseReturAction extends ActionSupport implements Preparable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ReturPurchaseDtl> lstReturPurchaseDtl;
	private List<ReturPurchaseHdr> lstReturPurchaseHdr;
	private String mode;
	private Office office;
	private Partner partner;
	private PurchaseReturnService purchaseReturnService;
	private ReturPurchaseDtl returPurchaseDtl;

	private ReturPurchaseHdr returPurchaseHdr;

	public PurchaseReturAction() {
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
	 * @return the lstReturPurchaseDtl
	 */
	public List<ReturPurchaseDtl> getLstReturPurchaseDtl() {
		return this.lstReturPurchaseDtl;
	}

	/**
	 * @return the lstReturPurchaseHdr
	 */
	public List<ReturPurchaseHdr> getLstReturPurchaseHdr() {
		return this.lstReturPurchaseHdr;
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
	 * @return the purchaseReturnService
	 */
	public PurchaseReturnService getPurchaseReturnService() {
		return this.purchaseReturnService;
	}

	/**
	 * @return the returPurchaseDtl
	 */
	public ReturPurchaseDtl getReturPurchaseDtl() {
		return this.returPurchaseDtl;
	}

	/**
	 * @return the returPurchaseHdr
	 */
	public ReturPurchaseHdr getReturPurchaseHdr() {
		return this.returPurchaseHdr;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * @param lstReturPurchaseDtl
	 *            the lstReturPurchaseDtl to set
	 */
	public void setLstReturPurchaseDtl(
			List<ReturPurchaseDtl> lstReturPurchaseDtl) {
		this.lstReturPurchaseDtl = lstReturPurchaseDtl;
	}

	/**
	 * @param lstReturPurchaseHdr
	 *            the lstReturPurchaseHdr to set
	 */
	public void setLstReturPurchaseHdr(
			List<ReturPurchaseHdr> lstReturPurchaseHdr) {
		this.lstReturPurchaseHdr = lstReturPurchaseHdr;
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
	 * @param purchaseReturnService
	 *            the purchaseReturnService to set
	 */
	public void setPurchaseReturnService(
			PurchaseReturnService purchaseReturnService) {
		this.purchaseReturnService = purchaseReturnService;
	}

	/**
	 * @param returPurchaseDtl
	 *            the returPurchaseDtl to set
	 */
	public void setReturPurchaseDtl(ReturPurchaseDtl returPurchaseDtl) {
		this.returPurchaseDtl = returPurchaseDtl;
	}

	/**
	 * @param returPurchaseHdr
	 *            the returPurchaseHdr to set
	 */
	public void setReturPurchaseHdr(ReturPurchaseHdr returPurchaseHdr) {
		this.returPurchaseHdr = returPurchaseHdr;
	}

}
