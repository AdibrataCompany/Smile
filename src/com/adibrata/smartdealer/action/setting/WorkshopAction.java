package com.adibrata.smartdealer.action.setting;

/**
 * @author Henry
 *
 */
import java.util.List;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.Workshop;
import com.adibrata.smartdealer.service.setting.WorkshopService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class WorkshopAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mode;
	private Workshop workshop;
	private WorkshopService workshopService;
	private Partner partner;
	private Office office;
	private List<Workshop> lstWorkshop;
	private String searchcriteria;
	private String searchvalue;
	private int pageNumber;
	private String usrUpd;
	private String usrCrt;
	private String message;
	private long id; private static final long serialVersionUID = 1L;
	
	private String name;
	private String address;
	private String rt;
	private String rw;
	private String kelurahan;
	private String city;
	private String zipcode;
	private String type;
	private String areaPhone1;
	private String phoneNo1;
	private String areaPhone2;
	private String phoneNo2;
	private String areaFax;
	private String faxNo;
	private String handphone;
	
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the workshop
	 */
	public Workshop getWorkshop() {
		return workshop;
	}

	/**
	 * @return the workshopService
	 */
	public WorkshopService getWorkshopService() {
		return workshopService;
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
	 * @return the lstWorkshop
	 */
	public List<Workshop> getLstWorkshop() {
		return lstWorkshop;
	}

	/**
	 * @param workshop the workshop to set
	 */
	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
	}

	/**
	 * @param workshopService the workshopService to set
	 */
	public void setWorkshopService(WorkshopService workshopService) {
		this.workshopService = workshopService;
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
	 * @param lstWorkshop the lstWorkshop to set
	 */
	public void setLstWorkshop(List<Workshop> lstWorkshop) {
		this.lstWorkshop = lstWorkshop;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}
	public String execute() {
		String strMode;
		strMode = mode;

		if (mode != null) {
			switch (strMode) {
			case "search":
				try {
					strMode = Paging();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case "edit":

			case "del":
				try {
					return SaveDelete();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case "add":

				try {
					strMode = SaveAdd();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case "saveadd":
				try {
					strMode = SaveAdd();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case "saveedit":
				try {
					strMode = SaveEdit();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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

			this.lstWorkshop = this.workshopService.Paging(
					this.getPageNumber(), wherecond, "");

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
			Workshop workshop= new Workshop();
		
			workshop.setName(this.getName());
			workshop.setAddress(this.getAddress());
			workshop.setRt(this.getRt());
			workshop.setRw(this.getRw());
			workshop.setKelurahan(this.getKelurahan());
			workshop.setCity(this.getCity());
			workshop.setZipCode(this.getZipcode());
			workshop.setAreaPhone1(this.getAreaPhone1());
			workshop.setAreaPhone2(this.getAreaPhone2());
			workshop.setPhoneNo1(this.getPhoneNo1());
			workshop.setPhoneNo2(this.getPhoneNo2());
			workshop.setAreaFax(this.getAreaFax());
			workshop.setFaxNo(this.getFaxNo());
			workshop.setHandphone(this.getHandphone());
			this.workshopService.SaveAdd(workshop);
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
			Workshop workshop = new Workshop();
			
			workshop.setId(this.getId());
			workshop.setName(this.getName());
			workshop.setAddress(this.getAddress());
			workshop.setRt(this.getRt());
			workshop.setRw(this.getRw());
			workshop.setKelurahan(this.getKelurahan());
			workshop.setCity(this.getCity());
			workshop.setZipCode(this.getZipcode());
			workshop.setAreaPhone1(this.getAreaPhone1());
			workshop.setAreaPhone2(this.getAreaPhone2());
			workshop.setPhoneNo1(this.getPhoneNo1());
			workshop.setPhoneNo2(this.getPhoneNo2());
			workshop.setAreaFax(this.getAreaFax());
			workshop.setFaxNo(this.getFaxNo());
			workshop.setHandphone(this.getHandphone());
			this.workshopService.SaveEdit(workshop);
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
			Workshop workshop = new Workshop();
			
			workshop.setId(this.getId());
			this.workshopService.SaveDel(workshop);
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
	 * @param searchcriteria the searchcriteria to set
	 */
	public void setSearchcriteria(String searchcriteria) {
		this.searchcriteria = searchcriteria;
	}

	/**
	 * @param searchvalue the searchvalue to set
	 */
	public void setSearchvalue(String searchvalue) {
		this.searchvalue = searchvalue;
	}

	/**
	 * @param pageNumber the pageNumber to set
	 */
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	/**
	 * @param usrUpd the usrUpd to set
	 */
	public void setUsrUpd(String usrUpd) {
		this.usrUpd = usrUpd;
	}

	/**
	 * @param usrCrt the usrCrt to set
	 */
	public void setUsrCrt(String usrCrt) {
		this.usrCrt = usrCrt;
	}

	/**
	 * @param message the message to set
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
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the rt
	 */
	public String getRt() {
		return rt;
	}

	/**
	 * @return the rw
	 */
	public String getRw() {
		return rw;
	}

	/**
	 * @return the kelurahan
	 */
	public String getKelurahan() {
		return kelurahan;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the areaPhone1
	 */
	public String getAreaPhone1() {
		return areaPhone1;
	}

	/**
	 * @return the phoneNo1
	 */
	public String getPhoneNo1() {
		return phoneNo1;
	}

	/**
	 * @return the areaPhone2
	 */
	public String getAreaPhone2() {
		return areaPhone2;
	}

	/**
	 * @return the phoneNo2
	 */
	public String getPhoneNo2() {
		return phoneNo2;
	}

	/**
	 * @return the areaFax
	 */
	public String getAreaFax() {
		return areaFax;
	}

	/**
	 * @return the faxNo
	 */
	public String getFaxNo() {
		return faxNo;
	}

	/**
	 * @return the handphone
	 */
	public String getHandphone() {
		return handphone;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param rt the rt to set
	 */
	public void setRt(String rt) {
		this.rt = rt;
	}

	/**
	 * @param rw the rw to set
	 */
	public void setRw(String rw) {
		this.rw = rw;
	}

	/**
	 * @param kelurahan the kelurahan to set
	 */
	public void setKelurahan(String kelurahan) {
		this.kelurahan = kelurahan;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @param areaPhone1 the areaPhone1 to set
	 */
	public void setAreaPhone1(String areaPhone1) {
		this.areaPhone1 = areaPhone1;
	}

	/**
	 * @param phoneNo1 the phoneNo1 to set
	 */
	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}

	/**
	 * @param areaPhone2 the areaPhone2 to set
	 */
	public void setAreaPhone2(String areaPhone2) {
		this.areaPhone2 = areaPhone2;
	}

	/**
	 * @param phoneNo2 the phoneNo2 to set
	 */
	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}

	/**
	 * @param areaFax the areaFax to set
	 */
	public void setAreaFax(String areaFax) {
		this.areaFax = areaFax;
	}

	/**
	 * @param faxNo the faxNo to set
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	/**
	 * @param handphone the handphone to set
	 */
	public void setHandphone(String handphone) {
		this.handphone = handphone;
	}

}
