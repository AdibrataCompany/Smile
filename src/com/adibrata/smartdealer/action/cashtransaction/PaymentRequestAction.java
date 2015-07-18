package com.adibrata.smartdealer.action.cashtransaction;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PayReqDtl;
import com.adibrata.smartdealer.model.PayReqHdr;
import com.adibrata.smartdealer.service.cashtransactions.PaymentRequestService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class PaymentRequestAction extends ActionSupport implements Preparable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mode;
	private Office office;
	private Partner partner;
	private PaymentRequestService paymentRequestService;
	private PayReqDtl payReqDtl;
	private PayReqHdr payReqHdr;

	public PaymentRequestAction() {
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
	 * @return the paymentRequestService
	 */
	public PaymentRequestService getPaymentRequestService() {
		return this.paymentRequestService;
	}

	/**
	 * @return the payReqDtl
	 */
	public PayReqDtl getPayReqDtl() {
		return this.payReqDtl;
	}

	/**
	 * @return the payReqHdr
	 */
	public PayReqHdr getPayReqHdr() {
		return this.payReqHdr;
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
	 * @param paymentRequestService
	 *            the paymentRequestService to set
	 */
	public void setPaymentRequestService(
			PaymentRequestService paymentRequestService) {
		this.paymentRequestService = paymentRequestService;
	}

	/**
	 * @param payReqDtl
	 *            the payReqDtl to set
	 */
	public void setPayReqDtl(PayReqDtl payReqDtl) {
		this.payReqDtl = payReqDtl;
	}

	/**
	 * @param payReqHdr
	 *            the payReqHdr to set
	 */
	public void setPayReqHdr(PayReqHdr payReqHdr) {
		this.payReqHdr = payReqHdr;
	}

}
