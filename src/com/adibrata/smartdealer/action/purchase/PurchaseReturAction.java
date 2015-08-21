package com.adibrata.smartdealer.action.purchase;

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
import com.adibrata.smartdealer.service.purchase.PurchaseInvoiceService;
import com.adibrata.smartdealer.service.purchase.PurchaseReturnService;

public class PurchaseReturAction extends ActionSupport implements Preparable {
	private String mode;
	private Partner partner;
	private Office office;
	private ReturPurchaseHdr returPurchaseHdr;
	private ReturPurchaseDtl returPurchaseDtl;
	private List<ReturPurchaseDtl> lstReturPurchaseDtl;
	private List<ReturPurchaseHdr> lstReturPurchaseHdr;
	
	private PurchaseReturnService purchaseReturnService;

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
	 * @return the returPurchaseHdr
	 */
	public ReturPurchaseHdr getReturPurchaseHdr() {
		return returPurchaseHdr;
	}

	/**
	 * @return the returPurchaseDtl
	 */
	public ReturPurchaseDtl getReturPurchaseDtl() {
		return returPurchaseDtl;
	}

	/**
	 * @return the lstReturPurchaseDtl
	 */
	public List<ReturPurchaseDtl> getLstReturPurchaseDtl() {
		return lstReturPurchaseDtl;
	}

	/**
	 * @return the lstReturPurchaseHdr
	 */
	public List<ReturPurchaseHdr> getLstReturPurchaseHdr() {
		return lstReturPurchaseHdr;
	}

	/**
	 * @return the purchaseReturnService
	 */
	public PurchaseReturnService getPurchaseReturnService() {
		return purchaseReturnService;
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
	 * @param returPurchaseHdr the returPurchaseHdr to set
	 */
	public void setReturPurchaseHdr(ReturPurchaseHdr returPurchaseHdr) {
		this.returPurchaseHdr = returPurchaseHdr;
	}

	/**
	 * @param returPurchaseDtl the returPurchaseDtl to set
	 */
	public void setReturPurchaseDtl(ReturPurchaseDtl returPurchaseDtl) {
		this.returPurchaseDtl = returPurchaseDtl;
	}

	/**
	 * @param lstReturPurchaseDtl the lstReturPurchaseDtl to set
	 */
	public void setLstReturPurchaseDtl(List<ReturPurchaseDtl> lstReturPurchaseDtl) {
		this.lstReturPurchaseDtl = lstReturPurchaseDtl;
	}

	/**
	 * @param lstReturPurchaseHdr the lstReturPurchaseHdr to set
	 */
	public void setLstReturPurchaseHdr(List<ReturPurchaseHdr> lstReturPurchaseHdr) {
		this.lstReturPurchaseHdr = lstReturPurchaseHdr;
	}

	/**
	 * @param purchaseReturnService the purchaseReturnService to set
	 */
	public void setPurchaseReturnService(PurchaseReturnService purchaseReturnService) {
		this.purchaseReturnService = purchaseReturnService;
	}

	public PurchaseReturAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

}
