package com.adibrata.smartdealer.action.repair;

/**
 * @author Henry
 *
 */
import java.util.List;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.ServiceDtl;
import com.adibrata.smartdealer.model.ServiceHdr;
import com.adibrata.smartdealer.service.repair.RepairService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class RepairAction extends ActionSupport implements Preparable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ServiceDtl> lstServicedDtl;
	private List<ServiceHdr> lstServiceHdr;
	private String mode;
	private Office office;
	private Partner partner;
	private RepairService repairService;
	private ServiceDtl serviceDtl;
	private ServiceHdr serviceHdr;

	public RepairAction() {
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
	 * @return the lstServicedDtl
	 */
	public List<ServiceDtl> getLstServicedDtl() {
		return this.lstServicedDtl;
	}

	/**
	 * @return the lstServiceHdr
	 */
	public List<ServiceHdr> getLstServiceHdr() {
		return this.lstServiceHdr;
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
	 * @return the repairService
	 */
	public RepairService getRepairService() {
		return this.repairService;
	}

	/**
	 * @return the serviceDtl
	 */
	public ServiceDtl getServiceDtl() {
		return this.serviceDtl;
	}

	/**
	 * @return the serviceHdr
	 */
	public ServiceHdr getServiceHdr() {
		return this.serviceHdr;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * @param lstServicedDtl
	 *            the lstServicedDtl to set
	 */
	public void setLstServicedDtl(List<ServiceDtl> lstServicedDtl) {
		this.lstServicedDtl = lstServicedDtl;
	}

	/**
	 * @param lstServiceHdr
	 *            the lstServiceHdr to set
	 */
	public void setLstServiceHdr(List<ServiceHdr> lstServiceHdr) {
		this.lstServiceHdr = lstServiceHdr;
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
	 * @param repairService
	 *            the repairService to set
	 */
	public void setRepairService(RepairService repairService) {
		this.repairService = repairService;
	}

	/**
	 * @param serviceDtl
	 *            the serviceDtl to set
	 */
	public void setServiceDtl(ServiceDtl serviceDtl) {
		this.serviceDtl = serviceDtl;
	}

	/**
	 * @param serviceHdr
	 *            the serviceHdr to set
	 */
	public void setServiceHdr(ServiceHdr serviceHdr) {
		this.serviceHdr = serviceHdr;
	}

}
