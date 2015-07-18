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
import java.util.List;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PurchaseInvoice;
import com.adibrata.smartdealer.model.PurchaseOrderHdr;
import com.adibrata.smartdealer.service.purchase.PurchaseInvoiceService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class PurchaseInvoiceAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<PurchaseInvoice> lstPurchaseInvoice;
	private List<PurchaseOrderHdr> lstPurchaseOrderHdr;
	/**
	 * 
	 */
	private String mode;
	private Office office;
	private Partner partner;
	private PurchaseInvoice purchaseInvoice;
	private PurchaseInvoiceService purchaseInvoiceService;

	public PurchaseInvoiceAction() {
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
	 * @return the lstPurchaseInvoice
	 */
	public List<PurchaseInvoice> getLstPurchaseInvoice() {
		return this.lstPurchaseInvoice;
	}

	/**
	 * @return the lstPurchaseOrderHdr
	 */
	public List<PurchaseOrderHdr> getLstPurchaseOrderHdr() {
		return this.lstPurchaseOrderHdr;
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
	 * @return the purchaseInvoice
	 */
	public PurchaseInvoice getPurchaseInvoice() {
		return this.purchaseInvoice;
	}

	/**
	 * @return the purchaseInvoiceService
	 */
	public PurchaseInvoiceService getPurchaseInvoiceService() {
		return this.purchaseInvoiceService;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

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
	 * @param purchaseInvoice
	 *            the purchaseInvoice to set
	 */
	public void setPurchaseInvoice(PurchaseInvoice purchaseInvoice) {
		this.purchaseInvoice = purchaseInvoice;
	}

	/**
	 * @param purchaseInvoiceService
	 *            the purchaseInvoiceService to set
	 */
	public void setPurchaseInvoiceService(
			PurchaseInvoiceService purchaseInvoiceService) {
		this.purchaseInvoiceService = purchaseInvoiceService;
	}

}
