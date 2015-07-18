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
import com.adibrata.smartdealer.service.sales.SalesOrderService;
import com.adibrata.smartdealer.service.sales.SalesReturnService;

public class SalesReturAction extends ActionSupport implements Preparable {
	private String mode;
	private SalesReturnService salesReturnService;
	private Partner partner;
	private Office office;

	private ReturSalesHdr returSalesHdr;
	private ReturSalesDtl returSalesDtl;
	private List<ReturSalesHdr> lstReturSalesHdr;
	private List<ReturSalesDtl> lstReturSalesDtl;

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @return the salesReturnService
	 */
	public SalesReturnService getSalesReturnService() {
		return salesReturnService;
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
	 * @return the returSalesHdr
	 */
	public ReturSalesHdr getReturSalesHdr() {
		return returSalesHdr;
	}

	/**
	 * @return the returSalesDtl
	 */
	public ReturSalesDtl getReturSalesDtl() {
		return returSalesDtl;
	}

	/**
	 * @return the lstReturSalesHdr
	 */
	public List<ReturSalesHdr> getLstReturSalesHdr() {
		return lstReturSalesHdr;
	}

	/**
	 * @return the lstReturSalesDtl
	 */
	public List<ReturSalesDtl> getLstReturSalesDtl() {
		return lstReturSalesDtl;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param salesReturnService the salesReturnService to set
	 */
	public void setSalesReturnService(SalesReturnService salesReturnService) {
		this.salesReturnService = salesReturnService;
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
	 * @param returSalesHdr the returSalesHdr to set
	 */
	public void setReturSalesHdr(ReturSalesHdr returSalesHdr) {
		this.returSalesHdr = returSalesHdr;
	}

	/**
	 * @param returSalesDtl the returSalesDtl to set
	 */
	public void setReturSalesDtl(ReturSalesDtl returSalesDtl) {
		this.returSalesDtl = returSalesDtl;
	}

	/**
	 * @param lstReturSalesHdr the lstReturSalesHdr to set
	 */
	public void setLstReturSalesHdr(List<ReturSalesHdr> lstReturSalesHdr) {
		this.lstReturSalesHdr = lstReturSalesHdr;
	}

	/**
	 * @param lstReturSalesDtl the lstReturSalesDtl to set
	 */
	public void setLstReturSalesDtl(List<ReturSalesDtl> lstReturSalesDtl) {
		this.lstReturSalesDtl = lstReturSalesDtl;
	}

	public SalesReturAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	public String Retur() {
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
