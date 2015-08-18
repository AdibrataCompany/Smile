/**
 * 
 */
package com.adibrata.smartdealer.action.purchase;

/**
 * @author Henry
 *
 */

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
import com.adibrata.smartdealer.service.purchase.*;

public class PurchaseInvoiceAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private String mode;
	private PurchaseInvoiceService purchaseInvoiceService;
	private Partner partner;
	private Office office;
	private List<PurchaseInvoice> lstPurchaseInvoice;
	private List<PurchaseOrderHdr> lstPurchaseOrderHdr;
	private PurchaseInvoice purchaseInvoice;

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
	 * @return the purchaseInvoiceService
	 */
	public PurchaseInvoiceService getPurchaseInvoiceService() {
		return purchaseInvoiceService;
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
	 * @return the lstPurchaseInvoice
	 */
	public List<PurchaseInvoice> getLstPurchaseInvoice() {
		return lstPurchaseInvoice;
	}

	/**
	 * @return the lstPurchaseOrderHdr
	 */
	public List<PurchaseOrderHdr> getLstPurchaseOrderHdr() {
		return lstPurchaseOrderHdr;
	}

	/**
	 * @return the purchaseInvoice
	 */
	public PurchaseInvoice getPurchaseInvoice() {
		return purchaseInvoice;
	}

	/**
	 * @param mode
	 *            the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param purchaseInvoiceService
	 *            the purchaseInvoiceService to set
	 */
	public void setPurchaseInvoiceService(
			PurchaseInvoiceService purchaseInvoiceService) {
		this.purchaseInvoiceService = purchaseInvoiceService;
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
	 * @param lstPurchaseInvoice
	 *            the lstPurchaseInvoice to set
	 */
	public void setLstPurchaseInvoice(List<PurchaseInvoice> lstPurchaseInvoice) {
		this.lstPurchaseInvoice = lstPurchaseInvoice;
	}

	/**
	 * @param lstPurchaseOrderHdr
	 *            the lstPurchaseOrderHdr to set
	 */
	public void setLstPurchaseOrderHdr(
			List<PurchaseOrderHdr> lstPurchaseOrderHdr) {
		this.lstPurchaseOrderHdr = lstPurchaseOrderHdr;
	}

	/**
	 * @param purchaseInvoice
	 *            the purchaseInvoice to set
	 */
	public void setPurchaseInvoice(PurchaseInvoice purchaseInvoice) {
		this.purchaseInvoice = purchaseInvoice;
	}

	public PurchaseInvoiceAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

}
