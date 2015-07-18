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
import com.adibrata.smartdealer.service.sales.SalesInvoiceService;

public class SalesInvoiceAction extends ActionSupport implements Preparable {
	private String mode;
	private SalesInvoiceService salesInvoiceService;
	private SalesInvoice salesInvoice;
	private Partner partner;
	private Office office;
	private List<Customer> lstCustomers;
	private List<SalesOrderHdr> lstSalesOrderHdr;
	private List<SalesInvoice> lstSalesInvoice;
	
	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @return the salesInvoiceService
	 */
	public SalesInvoiceService getSalesInvoiceService() {
		return salesInvoiceService;
	}

	/**
	 * @return the salesInvoice
	 */
	public SalesInvoice getSalesInvoice() {
		return salesInvoice;
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
	 * @return the lstCustomers
	 */
	public List<Customer> getLstCustomers() {
		return lstCustomers;
	}

	/**
	 * @return the lstSalesOrderHdr
	 */
	public List<SalesOrderHdr> getLstSalesOrderHdr() {
		return lstSalesOrderHdr;
	}

	/**
	 * @return the lstSalesInvoice
	 */
	public List<SalesInvoice> getLstSalesInvoice() {
		return lstSalesInvoice;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param salesInvoiceService the salesInvoiceService to set
	 */
	public void setSalesInvoiceService(SalesInvoiceService salesInvoiceService) {
		this.salesInvoiceService = salesInvoiceService;
	}

	/**
	 * @param salesInvoice the salesInvoice to set
	 */
	public void setSalesInvoice(SalesInvoice salesInvoice) {
		this.salesInvoice = salesInvoice;
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
	 * @param lstCustomers the lstCustomers to set
	 */
	public void setLstCustomers(List<Customer> lstCustomers) {
		this.lstCustomers = lstCustomers;
	}

	/**
	 * @param lstSalesOrderHdr the lstSalesOrderHdr to set
	 */
	public void setLstSalesOrderHdr(List<SalesOrderHdr> lstSalesOrderHdr) {
		this.lstSalesOrderHdr = lstSalesOrderHdr;
	}

	/**
	 * @param lstSalesInvoice the lstSalesInvoice to set
	 */
	public void setLstSalesInvoice(List<SalesInvoice> lstSalesInvoice) {
		this.lstSalesInvoice = lstSalesInvoice;
	}

	public SalesInvoiceAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	

	public String Invoice() {
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
