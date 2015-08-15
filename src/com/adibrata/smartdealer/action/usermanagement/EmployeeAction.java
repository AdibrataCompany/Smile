
package com.adibrata.smartdealer.action.usermanagement;

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
		private EmployeeService employeeService;
		private Partner partner;
		private Office office;
		private Employee employee;

		private String employeecode;
		private String employeename;
		private String position;

		private Long officeid;
		
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String kecamatan;
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
		private String email;
		private Long supervisorid;
		private String fullAddress;
		private String leavedatestart;
		private String leavedateend;
		private String joindate;
		private String isActive;
		private String searchcriteria;
		private String searchvalue;
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private String message;
		private List<Employee> lstEmployee;

		private Long id;

		public EmployeeAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				final EmployeeService employeeservice = new EmployeeDao();
				
				this.employeeService = employeeservice;
				final Partner partner = new Partner();
				final Office office = new Office();
				final Employee employee = new Employee();
				
				this.setPartner(partner);
				this.setOffice(office);
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.setEmployee(employee);
				if (this.pageNumber == 0)
					{
						this.pageNumber = 1;
					}
			}

		@Override
		public String execute()
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
											this.ViewData();
										}
									catch (final Exception e1)
										{
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									break;
								case "savedel" :
									try
										{
											strMode = this.SaveDelete();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "saveadd" :
									try
										{
											strMode = this.SaveAdd();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "saveedit" :
									try
										{
											strMode = this.SaveEdit();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "first" :
									this.pageNumber = 1;
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
									this.pageNumber -= 1;
									if (this.pageNumber <= 1)
										{
											this.pageNumber = 1;
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
									this.pageNumber += 1;
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
						this.pageNumber = 1;
						try
							{
								this.Paging();
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						strMode = "start";
					}
				return strMode;
			}

		private String WhereCond()
			{
				String wherecond = "";
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
						this.lstEmployee = this.employeeService.Paging(this.getPageNumber(), this.WhereCond(), "");
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
						
						this.lstEmployee = this.employeeService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
						this.pageNumber = this.employeeService.getCurrentpage();
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
					
			}
			
		private String SaveAdd() throws Exception
			{
				String status = "";
				try
					{
						final Employee employee = new Employee();

						employee.setName(this.getEmployeename());
						employee.setAddress(this.getAddress());
						employee.setAddress(this.getAddress());
						employee.setRt(this.getRt());
						employee.setRw(this.getRw());
						employee.setKelurahan(this.getKelurahan());
						employee.setCity(this.getCity());
						employee.setZipcode(this.getZipcode());
						employee.setAreaPhone1(this.getAreaPhone1());
						employee.setAreaPhone2(this.getAreaPhone2());
						employee.setPhoneNo1(this.getPhoneNo1());
						employee.setPhoneNo2(this.getPhoneNo2());
						employee.setJoinDate(this.dateformat.parse(this.getJoindate()));
						employee.setHandphone(this.getHandphone());
						employee.setLeaveDateStart(this.dateformat.parse(this.getLeavedatestart()));
						employee.setLeaveDateEnd(this.dateformat.parse(this.getLeavedateend()));
						this.employeeService.SaveAdd(employee);
						this.employeeService.SaveAdd(employee);
						status = SUCCESS;
					}
				catch (final Exception exp)
					{
						status = ERROR;
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}
			
		private String SaveEdit() throws Exception
			{
				String status = "";
				try
					{
						final Employee employee = new Employee();
						employee.setId(this.getId());

						employee.setName(this.getEmployeename());
						employee.setAddress(this.getAddress());
						employee.setAddress(this.getAddress());
						employee.setRt(this.getRt());
						employee.setRw(this.getRw());
						employee.setKelurahan(this.getKelurahan());
						employee.setCity(this.getCity());
						employee.setZipcode(this.getZipcode());
						employee.setAreaPhone1(this.getAreaPhone1());
						employee.setAreaPhone2(this.getAreaPhone2());
						employee.setPhoneNo1(this.getPhoneNo1());
						employee.setPhoneNo2(this.getPhoneNo2());
						employee.setJoinDate(this.dateformat.parse(this.getJoindate()));
						employee.setHandphone(this.getHandphone());
						employee.setLeaveDateStart(this.dateformat.parse(this.getLeavedatestart()));
						employee.setLeaveDateEnd(this.dateformat.parse(this.getLeavedateend()));
						this.employeeService.SaveEdit(employee);
						this.employeeService.SaveEdit(employee);
						status = SUCCESS;
					}
				catch (final Exception exp)
					{
						status = ERROR;
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}
			
		private String SaveDelete() throws Exception
			{
				String status = "";
				try
					{
						final Employee employee = new Employee();
						employee.setId(this.getId());
						this.employeeService.SaveDel(employee);
						status = SUCCESS;
					}
				catch (final Exception exp)
					{
						status = ERROR;
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}

		public void ViewData() throws Exception
			{
				this.employee = new Employee();
				try
					{
						this.employee = this.employeeService.View(this.id);

						this.employeename = this.employee.getName();
						this.address = this.employee.getAddress();
						this.rt = this.employee.getRt();
						this.rw = this.employee.getRw();
						this.kelurahan = this.employee.getKelurahan();
						this.city = this.employee.getCity();
						this.zipcode = this.employee.getZipcode();
						this.areaPhone1 = this.employee.getAreaPhone1();
						this.areaPhone2 = this.employee.getAreaPhone2();
						this.phoneNo1 = this.employee.getPhoneNo1();
						this.phoneNo2 = this.employee.getPhoneNo2();
						this.joindate = this.dateformat.format(this.employee.getJoinDate());
						this.leavedatestart = this.dateformat.format(this.employee.getLeaveDateStart());
						this.leavedateend = this.dateformat.format(this.employee.getLeaveDateEnd());
						this.handphone = this.employee.getHandphone();
					}
				catch (final Exception exp)
					{
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
			
		/**
		 * @return the mode
		 */
		public String getMode()
			{
				return this.mode;
			}
			
		/**
		 * @return the employeeService
		 */
		public EmployeeService getEmployeeService()
			{
				return this.employeeService;
			}
			
		/**
		 * @return the partner
		 */
		public Partner getPartner()
			{
				return this.partner;
			}
			
		/**
		 * @return the office
		 */
		public Office getOffice()
			{
				return this.office;
			}
			
		/**
		 * @return the employee
		 */
		public Employee getEmployee()
			{
				return this.employee;
			}
			
		/**
		 * @return the lstEmployee
		 */
		public List<Employee> getLstEmployee()
			{
				return this.lstEmployee;
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
		 * @param employeeService
		 *            the employeeService to set
		 */
		public void setEmployeeService(final EmployeeService employeeService)
			{
				this.employeeService = employeeService;
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
		 * @param office
		 *            the office to set
		 */
		public void setOffice(final Office office)
			{
				this.office = office;
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
		 * @return the searchvalue
		 */
		public String getSearchvalue()
			{
				return this.searchvalue;
			}
			
		/**
		 * @return the pageNumber
		 */
		public int getPageNumber()
			{
				return this.pageNumber;
			}
			
		/**
		 * @return the usrUpd
		 */
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		/**
		 * @return the usrCrt
		 */
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		/**
		 * @return the message
		 */
		public String getMessage()
			{
				return this.message;
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
		 * @param searchvalue
		 *            the searchvalue to set
		 */
		public void setSearchvalue(final String searchvalue)
			{
				this.searchvalue = searchvalue;
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
		 * @param usrUpd
		 *            the usrUpd to set
		 */
		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
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
		public long getId()
			{
				return this.id;
			}
			
		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final long id)
			{
				this.id = id;
			}
			
		/**
		 * @return the employeecode
		 */
		public String getEmployeecode()
			{
				return this.employeecode;
			}
			
		/**
		 * @param employeecode
		 *            the employeecode to set
		 */
		public void setEmployeecode(final String employeecode)
			{
				this.employeecode = employeecode;
			}
			
		/**
		 * @return the employeename
		 */
		public String getEmployeename()
			{
				return this.employeename;
			}
			
		/**
		 * @param employeename
		 *            the employeename to set
		 */
		public void setEmployeename(final String employeename)
			{
				this.employeename = employeename;
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
			
		/**
		 * @return the officeid
		 */
		public long getOfficeid()
			{
				return this.officeid;
			}
			
		/**
		 * @param officeid
		 *            the officeid to set
		 */
		public void setOfficeid(final long officeid)
			{
				this.officeid = officeid;
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
		 * @return the areaPhone1
		 */
		public String getAreaPhone1()
			{
				return this.areaPhone1;
			}
			
		/**
		 * @param areaPhone1
		 *            the areaPhone1 to set
		 */
		public void setAreaPhone1(final String areaPhone1)
			{
				this.areaPhone1 = areaPhone1;
			}
			
		/**
		 * @return the phoneNo1
		 */
		public String getPhoneNo1()
			{
				return this.phoneNo1;
			}
			
		/**
		 * @param phoneNo1
		 *            the phoneNo1 to set
		 */
		public void setPhoneNo1(final String phoneNo1)
			{
				this.phoneNo1 = phoneNo1;
			}
			
		/**
		 * @return the areaPhone2
		 */
		public String getAreaPhone2()
			{
				return this.areaPhone2;
			}
			
		/**
		 * @param areaPhone2
		 *            the areaPhone2 to set
		 */
		public void setAreaPhone2(final String areaPhone2)
			{
				this.areaPhone2 = areaPhone2;
			}
			
		/**
		 * @return the phoneNo2
		 */
		public String getPhoneNo2()
			{
				return this.phoneNo2;
			}
			
		/**
		 * @param phoneNo2
		 *            the phoneNo2 to set
		 */
		public void setPhoneNo2(final String phoneNo2)
			{
				this.phoneNo2 = phoneNo2;
			}
			
		/**
		 * @return the areaFax
		 */
		public String getAreaFax()
			{
				return this.areaFax;
			}
			
		/**
		 * @param areaFax
		 *            the areaFax to set
		 */
		public void setAreaFax(final String areaFax)
			{
				this.areaFax = areaFax;
			}
			
		/**
		 * @return the faxNo
		 */
		public String getFaxNo()
			{
				return this.faxNo;
			}
			
		/**
		 * @param faxNo
		 *            the faxNo to set
		 */
		public void setFaxNo(final String faxNo)
			{
				this.faxNo = faxNo;
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
		 * @return the email
		 */
		public String getEmail()
			{
				return this.email;
			}
			
		/**
		 * @param email
		 *            the email to set
		 */
		public void setEmail(final String email)
			{
				this.email = email;
			}
			
		/**
		 * @return the supervisorid
		 */
		public long getSupervisorid()
			{
				return this.supervisorid;
			}
			
		/**
		 * @param supervisorid
		 *            the supervisorid to set
		 */
		public void setSupervisorid(final long supervisorid)
			{
				this.supervisorid = supervisorid;
			}
			
		/**
		 * @return the fullAddress
		 */
		public String getFullAddress()
			{
				return this.fullAddress;
			}
			
		/**
		 * @param fullAddress
		 *            the fullAddress to set
		 */
		public void setFullAddress(final String fullAddress)
			{
				this.fullAddress = fullAddress;
			}
			
		/**
		 * @return the isActive
		 */
		public String getIsActive()
			{
				return this.isActive;
			}
			
		/**
		 * @param isActive
		 *            the isActive to set
		 */
		public void setIsActive(final String isActive)
			{
				this.isActive = isActive;
			}
			
		/**
		 * @param officeid
		 *            the officeid to set
		 */
		public void setOfficeid(final Long officeid)
			{
				this.officeid = officeid;
			}
			
		/**
		 * @return the leavedatestart
		 */
		public String getLeavedatestart()
			{
				return this.leavedatestart;
			}
			
		/**
		 * @param leavedatestart
		 *            the leavedatestart to set
		 */
		public void setLeavedatestart(final String leavedatestart)
			{
				this.leavedatestart = leavedatestart;
			}
			
		/**
		 * @return the leavedateend
		 */
		public String getLeavedateend()
			{
				return this.leavedateend;
			}
			
		/**
		 * @param leavedateend
		 *            the leavedateend to set
		 */
		public void setLeavedateend(final String leavedateend)
			{
				this.leavedateend = leavedateend;
			}
			
		/**
		 * @return the joindate
		 */
		public String getJoindate()
			{
				return this.joindate;
			}
			
		/**
		 * @param joindate
		 *            the joindate to set
		 */
		public void setJoindate(final String joindate)
			{
				this.joindate = joindate;
			}
			
		/**
		 * @param supervisorid
		 *            the supervisorid to set
		 */
		public void setSupervisorid(final Long supervisorid)
			{
				this.supervisorid = supervisorid;
			}
			
	}
