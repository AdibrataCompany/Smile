package com.adibrata.smartdealer.action.setting;

/**
 * @author Henry
 *
 */
import java.util.List;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.model.CoaSchmDtl;
import com.adibrata.smartdealer.model.CoaSchmHdr;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.JournalSchemeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class JurnalSchemeAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mode;
	private JournalSchemeService jourSchemeService;
	private CoaSchmDtl coaschmdtl;
	private CoaSchmHdr coaschmhdr;
	private Partner partner;
	private Office office;
	private List<CoaSchmDtl> lstCoaSchmDtl;
	private List<CoaSchmHdr> lstcoaSchmHdr;
	private String searchcriteria;
	private String searchvalue;
	private int pageNumber;
	private String usrUpd;
	private String usrCrt;
	private String message;
	private long id; private static final long serialVersionUID = 1L;

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	public String execute()throws Exception  {
		String strMode;
		strMode = mode;

		if (mode != null) {
			switch (strMode) {
			case "search":
				strMode = Paging();
			case "edit":

			case "del":
				return SaveDelete();
			case "add":

				strMode = SaveAdd();
			case "saveadd":
				strMode = SaveAdd();
			case "saveedit":
				strMode = SaveEdit();
			case "back":

			default:
				return "failed";
			}
		} else {
			strMode = "start";
		}
		return strMode;
	}

	private String Paging() throws Exception {

		String status = "";
		try {
			String wherecond = "";
			if (this.getSearchcriteria().contains("%"))
				wherecond = this.getSearchvalue() + " like "
						+ this.getSearchcriteria();
			else
				wherecond = this.getSearchvalue() + " = "
						+ this.getSearchcriteria();

			/*
			 * this.lstcoaSchmHdr = this.jourSchemeService.PagingHeader(
			 * this.getPageNumber(), wherecond, "");
			 */

			status = "Success";
		} catch (Exception exp) {
			status = "Failed";
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return status;
	}

	private String SaveAdd() throws Exception {
		String status = "";
		try {
			CoaSchmHdr coaSchmHdr = new CoaSchmHdr();

			/*
			 * bankAccount.setBankAccountCode(this.getBankAccountCode());
			 * bankAccount.setBankAccountName(this.getBankAccountName());
			 * bankAccount.setCoacode(this.getCoacode());
			 */
			this.jourSchemeService.SaveAddHeader(coaSchmHdr);
			status = SUCCESS;
		} catch (Exception exp) {
			status = ERROR;
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return status;
	}

	private String SaveEdit() throws Exception {
		String status = "";
		try {
			CoaSchmHdr coaSchmHdr = new CoaSchmHdr();
			coaschmhdr.setId(this.getId());
			/*
			 * bankAccount.setBankAccountCode(this.getBankAccountCode());
			 * bankAccount.setBankAccountName(this.getBankAccountName());
			 * bankAccount.setCoacode(this.getCoacode());
			 */
			this.jourSchemeService.SaveAddHeader(coaSchmHdr);
			status = SUCCESS;
		} catch (Exception exp) {
			status = ERROR;
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return status;
	}

	private String SaveDelete() throws Exception {
		String status = "";
		try {
			CoaSchmHdr coaSchmHdr = new CoaSchmHdr();
			coaschmhdr.setId(this.getId());
			/*
			 * bankAccount.setBankAccountCode(this.getBankAccountCode());
			 * bankAccount.setBankAccountName(this.getBankAccountName());
			 * bankAccount.setCoacode(this.getCoacode());
			 */
			this.jourSchemeService.SaveDelHeader(coaSchmHdr);
			status = SUCCESS;
		} catch (Exception exp) {
			status = ERROR;
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return status;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the jourSchemeService
	 */
	public JournalSchemeService getJourSchemeService() {
		return jourSchemeService;
	}

	/**
	 * @return the coaschmdtl
	 */
	public CoaSchmDtl getCoaschmdtl() {
		return coaschmdtl;
	}

	/**
	 * @return the coaschmhdr
	 */
	public CoaSchmHdr getCoaschmhdr() {
		return coaschmhdr;
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
	 * @return the lstCoaSchmDtl
	 */
	public List<CoaSchmDtl> getLstCoaSchmDtl() {
		return lstCoaSchmDtl;
	}

	/**
	 * @return the lstcoaSchmHdr
	 */
	public List<CoaSchmHdr> getLstcoaSchmHdr() {
		return lstcoaSchmHdr;
	}

	/**
	 * @param jourSchemeService
	 *            the jourSchemeService to set
	 */
	public void setJourSchemeService(JournalSchemeService jourSchemeService) {
		this.jourSchemeService = jourSchemeService;
	}

	/**
	 * @param coaschmdtl
	 *            the coaschmdtl to set
	 */
	public void setCoaschmdtl(CoaSchmDtl coaschmdtl) {
		this.coaschmdtl = coaschmdtl;
	}

	/**
	 * @param coaschmhdr
	 *            the coaschmhdr to set
	 */
	public void setCoaschmhdr(CoaSchmHdr coaschmhdr) {
		this.coaschmhdr = coaschmhdr;
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
	 * @param lstCoaSchmDtl
	 *            the lstCoaSchmDtl to set
	 */
	public void setLstCoaSchmDtl(List<CoaSchmDtl> lstCoaSchmDtl) {
		this.lstCoaSchmDtl = lstCoaSchmDtl;
	}

	/**
	 * @param lstcoaSchmHdr
	 *            the lstcoaSchmHdr to set
	 */
	public void setLstcoaSchmHdr(List<CoaSchmHdr> lstcoaSchmHdr) {
		this.lstcoaSchmHdr = lstcoaSchmHdr;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @return the searchcriteria
	 */
	public String getSearchcriteria() {
		return searchcriteria;
	}

	/**
	 * @return the searchvalue
	 */
	public String getSearchvalue() {
		return searchvalue;
	}

	/**
	 * @return the pageNumber
	 */
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * @return the usrUpd
	 */
	public String getUsrUpd() {
		return usrUpd;
	}

	/**
	 * @return the usrCrt
	 */
	public String getUsrCrt() {
		return usrCrt;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param searchcriteria
	 *            the searchcriteria to set
	 */
	public void setSearchcriteria(String searchcriteria) {
		this.searchcriteria = searchcriteria;
	}

	/**
	 * @param searchvalue
	 *            the searchvalue to set
	 */
	public void setSearchvalue(String searchvalue) {
		this.searchvalue = searchvalue;
	}

	/**
	 * @param pageNumber
	 *            the pageNumber to set
	 */
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	/**
	 * @param usrUpd
	 *            the usrUpd to set
	 */
	public void setUsrUpd(String usrUpd) {
		this.usrUpd = usrUpd;
	}

	/**
	 * @param usrCrt
	 *            the usrCrt to set
	 */
	public void setUsrCrt(String usrCrt) {
		this.usrCrt = usrCrt;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

}
