package com.adibrata.smartdealer.action.repair;

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
import com.adibrata.smartdealer.service.repair.RepairService;

public class RepairAction extends ActionSupport implements Preparable {
	private String mode;
	private RepairService repairService;
	private Partner partner;
	private Office office;
	private ServiceHdr serviceHdr;
	private ServiceDtl serviceDtl;
	private List<ServiceHdr> lstServiceHdr;
	private List<ServiceDtl> lstServicedDtl;

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
	 * @return the repairService
	 */
	public RepairService getRepairService() {
		return repairService;
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
	 * @return the serviceHdr
	 */
	public ServiceHdr getServiceHdr() {
		return serviceHdr;
	}

	/**
	 * @return the serviceDtl
	 */
	public ServiceDtl getServiceDtl() {
		return serviceDtl;
	}

	/**
	 * @return the lstServiceHdr
	 */
	public List<ServiceHdr> getLstServiceHdr() {
		return lstServiceHdr;
	}

	/**
	 * @return the lstServicedDtl
	 */
	public List<ServiceDtl> getLstServicedDtl() {
		return lstServicedDtl;
	}

	/**
	 * @param mode
	 *            the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param repairService
	 *            the repairService to set
	 */
	public void setRepairService(RepairService repairService) {
		this.repairService = repairService;
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
	 * @param serviceHdr
	 *            the serviceHdr to set
	 */
	public void setServiceHdr(ServiceHdr serviceHdr) {
		this.serviceHdr = serviceHdr;
	}

	/**
	 * @param serviceDtl
	 *            the serviceDtl to set
	 */
	public void setServiceDtl(ServiceDtl serviceDtl) {
		this.serviceDtl = serviceDtl;
	}

	/**
	 * @param lstServiceHdr
	 *            the lstServiceHdr to set
	 */
	public void setLstServiceHdr(List<ServiceHdr> lstServiceHdr) {
		this.lstServiceHdr = lstServiceHdr;
	}

	/**
	 * @param lstServicedDtl
	 *            the lstServicedDtl to set
	 */
	public void setLstServicedDtl(List<ServiceDtl> lstServicedDtl) {
		this.lstServicedDtl = lstServicedDtl;
	}

	public RepairAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

}
