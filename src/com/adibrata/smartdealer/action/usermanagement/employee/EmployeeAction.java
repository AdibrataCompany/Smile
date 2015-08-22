
package com.adibrata.smartdealer.action.usermanagement.employee;

/**
 * @author Henry
 */
import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.usermanagement.EmployeeDao;
import com.adibrata.smartdealer.model.Employee;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.usermanagement.EmployeeService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class EmployeeAction extends BaseAction implements Preparable
	{
		
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String mode;
		private Partner partner;
		private Office office;
		private Employee employee;
		EmployeeService service;
		private List<Employee> lstEmployee;
		private String searchcriteria;
		private String searchvalue;
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private String message;
		Long id;
		
		private List<Employee> lstemployee;
		private int pagenumber;
		private String nik;
		private String name;
		private String position;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String kecamatan;
		private String city;
		private String zipcode;
		private String type;
		private String areaphone1;
		private String phoneno1;
		private String areaphone2;
		private String phoneno2;
		private String areafax;
		private String faxno;
		private String handphone;

		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
			}

		public EmployeeAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				
				this.office = new Office();
				this.setOffice(this.office);
				
				this.service = new EmployeeDao();
				this.office = new Office();
				
				if (this.pagenumber == 0)
					{
						this.pagenumber = 1;
					}
			}
			
		@Override
		public String execute() throws Exception
			{
				String strMode;
				strMode = this.mode;
				if (this.mode != null)
					{
						switch (strMode)
							{
								case "search" :
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "edit" :
									try
										{
											strMode = this.ViewData();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "savedel" :
									try
										{
											strMode = this.SaveDelete();
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "first" :
									this.pagenumber = 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "prev" :
									this.pagenumber -= 1;
									if (this.pagenumber <= 1)
										{
											this.pagenumber = 1;
										}
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "next" :
									this.pagenumber += 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "last" :
									try
										{
											this.Paging(1);
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								default :
									break;
							}
					}
				else
					{
						this.pagenumber = 1;

						strMode = INPUT;
					}
				return strMode;
			}

		public String save()
			{
				String strMode;
				strMode = this.mode;
				if (this.mode != null)
					{
						switch (strMode)
							{
								case "saveadd" :
									try
										{
											strMode = this.SaveAdd();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "saveedit" :
									try
										{
											strMode = this.SaveEdit();
										}
									catch (final Exception e1)
										{
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									break;
								default :
									break;
							}
					}
				else
					{
						try
							{
								strMode = INPUT;
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				return strMode;
			}

		private String WhereCond()
			{
				String wherecond = " partnerCode = '" + BaseAction.sesPartnerCode() + "'";
				if ((this.getSearchvalue() != null) && !this.getSearchcriteria().equals("") && !this.getSearchcriteria().equals("0"))
					{
						if (this.getSearchcriteria().contains("%"))
							{
								wherecond = this.getSearchvalue() + " like '" + this.getSearchcriteria() + "' ";
							}
						else
							{
								wherecond = this.getSearchcriteria() + " = '" + this.getSearchvalue() + "' ";
							}
					}
				return wherecond;
			}

		private void Paging() throws Exception
			{
				try
					{
						this.lstemployee = this.service.Paging(this.getPagenumber(), this.WhereCond(), "");
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

			}

		private void Paging(final int islast) throws Exception
			{
				try
					{
						this.lstemployee = this.service.Paging(this.getPagenumber(), this.WhereCond(), "", true);
						this.pagenumber = this.service.getCurrentpage();
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

			}

		public String ViewData() throws Exception
			{
				this.employee = new Employee();
				try
					{
						if (this.getId() != null)
							{
								this.employee = this.service.View(this.id);
								this.partner = this.employee.getPartner();
								this.nik = this.employee.getNik();
								this.name = this.employee.getName();
								
								this.address = this.employee.getAddress();
								this.rt = this.employee.getRt();
								this.rw = this.employee.getRw();
								this.kelurahan = this.employee.getKelurahan();
								this.kecamatan = this.employee.getKecamatan();
								this.city = this.employee.getCity();
								this.zipcode = this.employee.getZipcode();
								this.areaphone1 = this.employee.getAreaPhone1();
								this.areaphone2 = this.employee.getAreaPhone2();
								this.phoneno1 = this.employee.getPhoneNo1();
								this.phoneno2 = this.employee.getPhoneNo2();
								
								this.handphone = this.employee.getHandphone();
							}
						else
							{
								this.Paging();
								this.mode = "input";
								this.setMessage(BaseAction.SelectFirst());
							}
					}
				catch (final Exception exp)
					{
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.mode;
			}

		private String SaveAdd() throws Exception
			{
				try
					{
						this.employee = new Employee();

						this.employee.setPartner(this.partner);
						
						this.employee.setNik(this.getNik());
						this.employee.setName(this.getName());
						this.employee.setAddress(this.getAddress());
						this.employee.setRt(this.getRt());
						this.employee.setRw(this.getRw());
						this.employee.setKelurahan(this.getKelurahan());
						this.employee.setKecamatan(this.getKecamatan());
						
						this.employee.setCity(this.getCity());
						this.employee.setZipcode(this.getZipcode());
						this.employee.setAreaPhone1(this.getAreaphone1());
						this.employee.setAreaPhone2(this.getAreaphone1());
						this.employee.setPhoneNo1(this.getPhoneno2());
						this.employee.setPhoneNo2(this.getPhoneno2());
						this.employee.setHandphone(this.getHandphone());

						this.employee.setHandphone(this.handphone);
						this.employee.setUsrCrt(BaseAction.sesLoginName());
						this.employee.setUsrUpd(BaseAction.sesLoginName());
						this.service.SaveAdd(this.employee);
						this.setMessage(BaseAction.SuccessMessage());
						this.mode = SUCCESS;
					}
				catch (final Exception exp)
					{
						this.mode = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.mode;
			}
			
		private String SaveEdit() throws Exception
			{
				try
					{
						this.employee = new Employee();
						this.employee.setId(this.getId());
						this.employee.setPartner(this.partner);
						this.employee.setNik(this.nik);
						this.employee.setName(this.getName());
						this.employee.setAddress(this.getAddress());
						this.employee.setRt(this.getRt());
						this.employee.setRw(this.getRw());
						this.employee.setKelurahan(this.getKelurahan());
						this.employee.setKecamatan(this.getKecamatan());
						this.employee.setCity(this.getCity());
						this.employee.setZipcode(this.getZipcode());
						this.employee.setAreaPhone1(this.getAreaphone1());
						this.employee.setAreaPhone2(this.getAreaphone1());
						this.employee.setPhoneNo1(this.getPhoneno2());
						this.employee.setPhoneNo2(this.getPhoneno2());
						this.employee.setPhoneNo2(this.getPhoneno2());

						this.employee.setUsrUpd(BaseAction.sesLoginName());
						this.employee.setUsrCrt(BaseAction.sesLoginName());
						this.service.SaveEdit(this.employee);
						this.setMessage(BaseAction.SuccessMessage());
						this.mode = SUCCESS;
					}
				catch (final Exception exp)
					{
						this.mode = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.mode;
			}

		private String SaveDelete() throws Exception
			{
				final String status = "";
				try
					{
						if (this.getId() != null)
							{
								this.employee = new Employee();
								this.employee.setId(this.getId());
								this.service.SaveDel(this.employee);
								this.setMessage(BaseAction.SuccessMessage());
								this.mode = SUCCESS;
							}
						else
							{
								this.mode = INPUT;
								this.setMessage(BaseAction.SelectFirst());
							}
					}
				catch (final Exception exp)
					{
						this.mode = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}
			
		/**
		 * @return the mode
		 */
		public String getMode()
			{
				return this.mode;
			}
			
		/**
		 * @param mode
		 *            the mode to set
		 */
		public void setMode(final String mode)
			{
				this.mode = mode;
			}
			
		/**
		 * @return the partner
		 */
		public Partner getPartner()
			{
				return this.partner;
			}
			
		/**
		 * @param partner
		 *            the partner to set
		 */
		public void setPartner(final Partner partner)
			{
				this.partner = partner;
			}
			
		/**
		 * @return the office
		 */
		public Office getOffice()
			{
				return this.office;
			}
			
		/**
		 * @param office
		 *            the office to set
		 */
		public void setOffice(final Office office)
			{
				this.office = office;
			}
			
		/**
		 * @return the employee
		 */
		public Employee getEmployee()
			{
				return this.employee;
			}
			
		/**
		 * @param employee
		 *            the employee to set
		 */
		public void setEmployee(final Employee employee)
			{
				this.employee = employee;
			}
			
		/**
		 * @return the service
		 */
		public EmployeeService getService()
			{
				return this.service;
			}
			
		/**
		 * @param service
		 *            the service to set
		 */
		public void setService(final EmployeeService service)
			{
				this.service = service;
			}
			
		/**
		 * @return the lstEmployee
		 */
		public List<Employee> getLstEmployee()
			{
				return this.lstEmployee;
			}
			
		/**
		 * @param lstEmployee
		 *            the lstEmployee to set
		 */
		public void setLstEmployee(final List<Employee> lstEmployee)
			{
				this.lstEmployee = lstEmployee;
			}
			
		/**
		 * @return the searchcriteria
		 */
		public String getSearchcriteria()
			{
				return this.searchcriteria;
			}
			
		/**
		 * @param searchcriteria
		 *            the searchcriteria to set
		 */
		public void setSearchcriteria(final String searchcriteria)
			{
				this.searchcriteria = searchcriteria;
			}
			
		/**
		 * @return the searchvalue
		 */
		public String getSearchvalue()
			{
				return this.searchvalue;
			}
			
		/**
		 * @param searchvalue
		 *            the searchvalue to set
		 */
		public void setSearchvalue(final String searchvalue)
			{
				this.searchvalue = searchvalue;
			}
			
		/**
		 * @return the pageNumber
		 */
		public int getPageNumber()
			{
				return this.pageNumber;
			}
			
		/**
		 * @param pageNumber
		 *            the pageNumber to set
		 */
		public void setPageNumber(final int pageNumber)
			{
				this.pageNumber = pageNumber;
			}
			
		/**
		 * @return the usrUpd
		 */
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		/**
		 * @param usrUpd
		 *            the usrUpd to set
		 */
		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
			
		/**
		 * @return the usrCrt
		 */
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		/**
		 * @param usrCrt
		 *            the usrCrt to set
		 */
		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
			}
			
		/**
		 * @return the message
		 */
		public String getMessage()
			{
				return this.message;
			}
			
		/**
		 * @param message
		 *            the message to set
		 */
		public void setMessage(final String message)
			{
				this.message = message;
			}
			
		/**
		 * @return the id
		 */
		public Long getId()
			{
				return this.id;
			}
			
		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final Long id)
			{
				this.id = id;
			}
			
		/**
		 * @return the lstemployee
		 */
		public List<Employee> getLstemployee()
			{
				return this.lstemployee;
			}
			
		/**
		 * @param lstemployee
		 *            the lstemployee to set
		 */
		public void setLstemployee(final List<Employee> lstemployee)
			{
				this.lstemployee = lstemployee;
			}
			
		/**
		 * @return the pagenumber
		 */
		public int getPagenumber()
			{
				return this.pagenumber;
			}
			
		/**
		 * @param pagenumber
		 *            the pagenumber to set
		 */
		public void setPagenumber(final int pagenumber)
			{
				this.pagenumber = pagenumber;
			}

		/**
		 * @return the name
		 */
		public String getName()
			{
				return this.name;
			}
			
		/**
		 * @param name
		 *            the name to set
		 */
		public void setName(final String name)
			{
				this.name = name;
			}
			
		/**
		 * @return the address
		 */
		public String getAddress()
			{
				return this.address;
			}
			
		/**
		 * @param address
		 *            the address to set
		 */
		public void setAddress(final String address)
			{
				this.address = address;
			}
			
		/**
		 * @return the rt
		 */
		public String getRt()
			{
				return this.rt;
			}
			
		/**
		 * @param rt
		 *            the rt to set
		 */
		public void setRt(final String rt)
			{
				this.rt = rt;
			}
			
		/**
		 * @return the rw
		 */
		public String getRw()
			{
				return this.rw;
			}
			
		/**
		 * @param rw
		 *            the rw to set
		 */
		public void setRw(final String rw)
			{
				this.rw = rw;
			}
			
		/**
		 * @return the kelurahan
		 */
		public String getKelurahan()
			{
				return this.kelurahan;
			}
			
		/**
		 * @param kelurahan
		 *            the kelurahan to set
		 */
		public void setKelurahan(final String kelurahan)
			{
				this.kelurahan = kelurahan;
			}
			
		/**
		 * @return the kecamatan
		 */
		public String getKecamatan()
			{
				return this.kecamatan;
			}
			
		/**
		 * @param kecamatan
		 *            the kecamatan to set
		 */
		public void setKecamatan(final String kecamatan)
			{
				this.kecamatan = kecamatan;
			}
			
		/**
		 * @return the city
		 */
		public String getCity()
			{
				return this.city;
			}
			
		/**
		 * @param city
		 *            the city to set
		 */
		public void setCity(final String city)
			{
				this.city = city;
			}
			
		/**
		 * @return the zipcode
		 */
		public String getZipcode()
			{
				return this.zipcode;
			}
			
		/**
		 * @param zipcode
		 *            the zipcode to set
		 */
		public void setZipcode(final String zipcode)
			{
				this.zipcode = zipcode;
			}
			
		/**
		 * @return the type
		 */
		public String getType()
			{
				return this.type;
			}
			
		/**
		 * @param type
		 *            the type to set
		 */
		public void setType(final String type)
			{
				this.type = type;
			}
			
		/**
		 * @return the areaphone1
		 */
		public String getAreaphone1()
			{
				return this.areaphone1;
			}
			
		/**
		 * @param areaphone1
		 *            the areaphone1 to set
		 */
		public void setAreaphone1(final String areaphone1)
			{
				this.areaphone1 = areaphone1;
			}
			
		/**
		 * @return the phoneno1
		 */
		public String getPhoneno1()
			{
				return this.phoneno1;
			}
			
		/**
		 * @param phoneno1
		 *            the phoneno1 to set
		 */
		public void setPhoneno1(final String phoneno1)
			{
				this.phoneno1 = phoneno1;
			}
			
		/**
		 * @return the areaphone2
		 */
		public String getAreaphone2()
			{
				return this.areaphone2;
			}
			
		/**
		 * @param areaphone2
		 *            the areaphone2 to set
		 */
		public void setAreaphone2(final String areaphone2)
			{
				this.areaphone2 = areaphone2;
			}
			
		/**
		 * @return the phoneno2
		 */
		public String getPhoneno2()
			{
				return this.phoneno2;
			}
			
		/**
		 * @param phoneno2
		 *            the phoneno2 to set
		 */
		public void setPhoneno2(final String phoneno2)
			{
				this.phoneno2 = phoneno2;
			}
			
		/**
		 * @return the areafax
		 */
		public String getAreafax()
			{
				return this.areafax;
			}
			
		/**
		 * @param areafax
		 *            the areafax to set
		 */
		public void setAreafax(final String areafax)
			{
				this.areafax = areafax;
			}
			
		/**
		 * @return the faxno
		 */
		public String getFaxno()
			{
				return this.faxno;
			}
			
		/**
		 * @param faxno
		 *            the faxno to set
		 */
		public void setFaxno(final String faxno)
			{
				this.faxno = faxno;
			}
			
		/**
		 * @return the handphone
		 */
		public String getHandphone()
			{
				return this.handphone;
			}
			
		/**
		 * @param handphone
		 *            the handphone to set
		 */
		public void setHandphone(final String handphone)
			{
				this.handphone = handphone;
			}
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

		/**
		 * @return the nik
		 */
		public String getNik()
			{
				return this.nik;
			}

		/**
		 * @param nik
		 *            the nik to set
		 */
		public void setNik(final String nik)
			{
				this.nik = nik;
			}

		/**
		 * @return the position
		 */
		public String getPosition()
			{
				return this.position;
			}

		/**
		 * @param position
		 *            the position to set
		 */
		public void setPosition(final String position)
			{
				this.position = position;
			}
			
	}
