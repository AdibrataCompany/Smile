package com.adibrata.smartdealer.action.sales;

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
import com.adibrata.smartdealer.service.sales.SalesOrderService;

public class SalesOrderAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 1L;

	private String mode;
	private SalesOrderService salesOrderService;
	private SalesOrderHdr salesOrderHdr;
	private SalesOrderDtl salesOrderDtl;
	private Partner partner;
	private Office office;
	private List<SalesOrderHdr> lstSalesOrderHdr;
	private List<SalesOrderDtl> lstSalesOrderDtl;

	/**
	 * @return the serialversionuid
	 */

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the salesOrderService
	 */
	public SalesOrderService getSalesOrderService() {
		return salesOrderService;
	}

	/**
	 * @return the salesOrderHdr
	 */
	public SalesOrderHdr getSalesOrderHdr() {
		return salesOrderHdr;
	}

	/**
	 * @return the salesOrderDtl
	 */
	public SalesOrderDtl getSalesOrderDtl() {
		return salesOrderDtl;
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
	 * @return the lstSalesOrderHdr
	 */
	public List<SalesOrderHdr> getLstSalesOrderHdr() {
		return lstSalesOrderHdr;
	}

	/**
	 * @return the lstSalesOrderDtl
	 */
	public List<SalesOrderDtl> getLstSalesOrderDtl() {
		return lstSalesOrderDtl;
	}

	/**
	 * @param salesOrderService
	 *            the salesOrderService to set
	 */
	public void setSalesOrderService(SalesOrderService salesOrderService) {
		this.salesOrderService = salesOrderService;
	}

	/**
	 * @param salesOrderHdr
	 *            the salesOrderHdr to set
	 */
	public void setSalesOrderHdr(SalesOrderHdr salesOrderHdr) {
		this.salesOrderHdr = salesOrderHdr;
	}

	/**
	 * @param salesOrderDtl
	 *            the salesOrderDtl to set
	 */
	public void setSalesOrderDtl(SalesOrderDtl salesOrderDtl) {
		this.salesOrderDtl = salesOrderDtl;
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
	 * @param lstSalesOrderHdr
	 *            the lstSalesOrderHdr to set
	 */
	public void setLstSalesOrderHdr(List<SalesOrderHdr> lstSalesOrderHdr) {
		this.lstSalesOrderHdr = lstSalesOrderHdr;
	}

	/**
	 * @param lstSalesOrderDtl
	 *            the lstSalesOrderDtl to set
	 */
	public void setLstSalesOrderDtl(List<SalesOrderDtl> lstSalesOrderDtl) {
		this.lstSalesOrderDtl = lstSalesOrderDtl;
	}

	public SalesOrderAction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 *
	 */

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	public String Order() {
		if (mode != null) {
			if (mode.equals("search")) {
				return "search";
			}
			if (mode.equals("entry")) {
				return "entry";
			}
			if (mode.equals("add")) {
				return "add";
			}
			if (mode.equals("del")) {
				return "del";
			}
			if (mode.equals("save")) {
				return "save";
			}
			if (mode.equals("back")) {
				return "back";
			}
		} else {
			return "start";
		}
		return mode;
	}

}
