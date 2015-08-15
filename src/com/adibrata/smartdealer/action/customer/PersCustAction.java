
package com.adibrata.smartdealer.action.customer;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.PersCust;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PersCustAction extends BaseAction implements Preparable
	{
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		
		private CustomerMaintService customermaintservice;
		private Customer customer;
		private PersCust perscust;
		
		private String mode;
		private String message;
		private String usrUpd;
		private String usrCrt;
		private Long id;
		private Long customerid;
		
		private String name;
		
		private String personalcustomertype;
		private String idtype;
		private String idexpdate;
		private String idnumber;
		private String idnumberchecking;
		private String idtypeissueddate;
		private String gender;
		private String birthplace;
		private String birthdate;
		private String mobilephone;
		private String email;
		private String religion;
		private String maritalstatus;
		private Short numofdependence;
		private String personalnpwp;
		private String nokk;
		private String education;
		private String professionid;
		private String nationality;
		private String wnacountry;
		private String homestatus;
		private String rentfinishdate;
		private String homelocation;
		private double homeprice;
		private Short staysinceyear;
		private Short staysincemonth;
		private short numofassetowned;
		private String reference;
		private short isapplycarloanbefore;
		private String applycarloancompanyname;
		private String activecustomer;
		private String notes;
		private Short iscorporatecreditline;
		private Double plafondamount;
		private String biologicalmothersname;
		private String customergroup;
		private Short mainbusinesssinceyear;
		
		public PersCustAction() throws Exception
			{
				try
					{
						// TODO Auto-generated constructor stub
						
						this.customermaintservice = new CustomerDao();
						this.customer = new Customer();
						this.perscust = new PersCust();
						
						this.customer.setId(this.getCustomerid());
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
			
		@Override
		public void prepare() throws Exception
			{
				try
					{
						// TODO Auto-generated method stub
					}
				catch (final Exception e)
					{
						// TODO: handle exception
						e.printStackTrace();
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
								case "save" :
									try
										{
											this.SaveCustomer();
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
						try
							{
								strMode = "start";
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				return strMode;
			}
			
		public void SaveCustomer() throws Exception
			{
				try
					{
						this.customer = new Customer();
						
						this.customer.setName(this.getName());
						this.customer.setHandphone(this.getMobilephone());
						
						this.customermaintservice.SaveCustomer(sesLoginName(), this.customer);
						
						this.customerid = this.customer.getId();
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
			
		public void SavePersCust() throws Exception
			{
				try
					{
						this.perscust = new PersCust();
						
						this.perscust.setCustomer(this.getCustomer());
						this.perscust.setPersonalCustomerType(this.getPersonalcustomertype());
						this.perscust.setIdtype(this.getIdtype());
						this.perscust.setIdexpDate(this.dateformat.parse(this.getIdexpdate()));
						this.perscust.setIdnumber(this.getIdnumber());
						this.perscust.setIdnumberChecking(this.getIdnumberchecking());
						this.perscust.setIdtypeIssuedDate(this.dateformat.parse(this.getIdtypeissueddate()));
						this.perscust.setGender(this.getGender());
						this.perscust.setBirthPlace(this.getBirthplace());
						this.perscust.setBirthDate(this.dateformat.parse(this.getBirthdate()));
						this.perscust.setMobilePhone(this.getMobilephone());
						this.perscust.setEmail(this.getEmail());
						this.perscust.setReligion(this.getReligion());
						this.perscust.setMaritalStatus(this.getMaritalstatus());
						this.perscust.setNumOfDependence(this.getNumofdependence());
						this.perscust.setPersonalNpwp(this.getPersonalnpwp());
						this.perscust.setNoKk(this.getNokk());
						this.perscust.setEducation(this.getEducation());
						this.perscust.setProfessionId(this.getProfessionid());
						this.perscust.setNationality(this.getNationality());
						this.perscust.setWnacountry(this.getWnacountry());
						this.perscust.setHomeStatus(this.getHomestatus());
						this.perscust.setReference(this.getReference());
						this.perscust.setHomeLocation(this.getHomelocation());
						this.perscust.setHomePrice(this.getHomeprice());
						this.perscust.setStaySinceYear(this.getStaysinceyear());
						this.perscust.setStaySinceMonth(this.getStaysincemonth());
						this.perscust.setNumOfAssetOwned(this.getNumofassetowned());
						this.perscust.setReference(this.getReference());
						this.perscust.setIsApplyCarLoanBefore(this.getIsapplycarloanbefore());
						this.perscust.setApplyCarLoanCompanyName(this.getApplycarloancompanyname());
						this.perscust.setActiveCustomer(this.getActivecustomer());
						this.perscust.setNotes(this.getNotes());
						this.perscust.setIsCorporateCreditLine(this.getIscorporatecreditline());
						this.perscust.setPlafondAmount(this.getPlafondamount());
						this.perscust.setBiologicalMothersName(this.getBiologicalmothersname());
						this.perscust.setCustomerGroup(this.getCustomergroup());
						this.perscust.setMainBusinessSinceYear(this.getMainbusinesssinceyear());
						
						this.customermaintservice.SavePersonalCustomer(sesLoginName(), this.perscust);
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
			
		public PersCust getPerscust()
			{
				return this.perscust;
			}
			
		public void setPerscust(final PersCust perscust)
			{
				this.perscust = perscust;
			}
			
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(final Customer customer)
			{
				this.customer = customer;
			}
			
		public CustomerMaintService getCustomermaintservice()
			{
				return this.customermaintservice;
			}
			
		public void setCustomermaintservice(final CustomerMaintService customermaintservice)
			{
				this.customermaintservice = customermaintservice;
			}
			
		public String getMode()
			{
				return this.mode;
			}
			
		public void setMode(final String mode)
			{
				this.mode = mode;
			}
			
		public String getMessage()
			{
				return this.message;
			}
			
		public void setMessage(final String message)
			{
				this.message = message;
			}
			
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
			
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
			}
			
		public Long getId()
			{
				return this.id;
			}
			
		public void setId(final Long id)
			{
				this.id = id;
			}
			
		public String getPersonalcustomertype()
			{
				return this.personalcustomertype;
			}
			
		public void setPersonalcustomertype(final String personalcustomertype)
			{
				this.personalcustomertype = personalcustomertype;
			}
			
		public String getIdtype()
			{
				return this.idtype;
			}
			
		public void setIdtype(final String idtype)
			{
				this.idtype = idtype;
			}
			
		public String getIdnumber()
			{
				return this.idnumber;
			}
			
		public void setIdnumber(final String idnumber)
			{
				this.idnumber = idnumber;
			}
			
		public String getIdnumberchecking()
			{
				return this.idnumberchecking;
			}
			
		public void setIdnumberchecking(final String idnumberchecking)
			{
				this.idnumberchecking = idnumberchecking;
			}
			
		public String getGender()
			{
				return this.gender;
			}
			
		public void setGender(final String gender)
			{
				this.gender = gender;
			}
			
		public String getBirthplace()
			{
				return this.birthplace;
			}
			
		public void setBirthplace(final String birthplace)
			{
				this.birthplace = birthplace;
			}
			
		public String getMobilephone()
			{
				return this.mobilephone;
			}
			
		public void setMobilephone(final String mobilephone)
			{
				this.mobilephone = mobilephone;
			}
			
		public String getEmail()
			{
				return this.email;
			}
			
		public void setEmail(final String email)
			{
				this.email = email;
			}
			
		public String getReligion()
			{
				return this.religion;
			}
			
		public void setReligion(final String religion)
			{
				this.religion = religion;
			}
			
		public String getMaritalstatus()
			{
				return this.maritalstatus;
			}
			
		public void setMaritalstatus(final String maritalstatus)
			{
				this.maritalstatus = maritalstatus;
			}
			
		public Short getNumofdependence()
			{
				return this.numofdependence;
			}
			
		public void setNumofdependence(final Short numofdependence)
			{
				this.numofdependence = numofdependence;
			}
			
		public String getPersonalnpwp()
			{
				return this.personalnpwp;
			}
			
		public void setPersonalnpwp(final String personalnpwp)
			{
				this.personalnpwp = personalnpwp;
			}
			
		public String getNokk()
			{
				return this.nokk;
			}
			
		public void setNokk(final String nokk)
			{
				this.nokk = nokk;
			}
			
		public String getEducation()
			{
				return this.education;
			}
			
		public void setEducation(final String education)
			{
				this.education = education;
			}
			
		public String getProfessionid()
			{
				return this.professionid;
			}
			
		public void setProfessionid(final String professionid)
			{
				this.professionid = professionid;
			}
			
		public String getNationality()
			{
				return this.nationality;
			}
			
		public void setNationality(final String nationality)
			{
				this.nationality = nationality;
			}
			
		public String getWnacountry()
			{
				return this.wnacountry;
			}
			
		public void setWnacountry(final String wnacountry)
			{
				this.wnacountry = wnacountry;
			}
			
		public String getHomestatus()
			{
				return this.homestatus;
			}
			
		public void setHomestatus(final String homestatus)
			{
				this.homestatus = homestatus;
			}
			
		public String getHomelocation()
			{
				return this.homelocation;
			}
			
		public void setHomelocation(final String homelocation)
			{
				this.homelocation = homelocation;
			}
			
		public double getHomeprice()
			{
				return this.homeprice;
			}
			
		public void setHomeprice(final double homeprice)
			{
				this.homeprice = homeprice;
			}
			
		public Short getStaysinceyear()
			{
				return this.staysinceyear;
			}
			
		public void setStaysinceyear(final Short staysinceyear)
			{
				this.staysinceyear = staysinceyear;
			}
			
		public Short getStaysincemonth()
			{
				return this.staysincemonth;
			}
			
		public void setStaysincemonth(final Short staysincemonth)
			{
				this.staysincemonth = staysincemonth;
			}
			
		public short getNumofassetowned()
			{
				return this.numofassetowned;
			}
			
		public void setNumofassetowned(final short numofassetowned)
			{
				this.numofassetowned = numofassetowned;
			}
			
		public String getReference()
			{
				return this.reference;
			}
			
		public void setReference(final String reference)
			{
				this.reference = reference;
			}
			
		public short getIsapplycarloanbefore()
			{
				return this.isapplycarloanbefore;
			}
			
		public void setIsapplycarloanbefore(final short isapplycarloanbefore)
			{
				this.isapplycarloanbefore = isapplycarloanbefore;
			}
			
		public String getApplycarloancompanyname()
			{
				return this.applycarloancompanyname;
			}
			
		public void setApplycarloancompanyname(final String applycarloancompanyname)
			{
				this.applycarloancompanyname = applycarloancompanyname;
			}
			
		public String getActivecustomer()
			{
				return this.activecustomer;
			}
			
		public void setActivecustomer(final String activecustomer)
			{
				this.activecustomer = activecustomer;
			}
			
		public String getNotes()
			{
				return this.notes;
			}
			
		public void setNotes(final String notes)
			{
				this.notes = notes;
			}
			
		public Double getPlafondamount()
			{
				return this.plafondamount;
			}
			
		public void setPlafondamount(final Double plafondamount)
			{
				this.plafondamount = plafondamount;
			}
			
		public String getBiologicalmothersname()
			{
				return this.biologicalmothersname;
			}
			
		public void setBiologicalmothersname(final String biologicalmothersname)
			{
				this.biologicalmothersname = biologicalmothersname;
			}
			
		public String getCustomergroup()
			{
				return this.customergroup;
			}
			
		public void setCustomergroup(final String customergroup)
			{
				this.customergroup = customergroup;
			}
			
		public Short getMainbusinesssinceyear()
			{
				return this.mainbusinesssinceyear;
			}
			
		public void setMainbusinesssinceyear(final Short mainbusinesssinceyear)
			{
				this.mainbusinesssinceyear = mainbusinesssinceyear;
			}
			
		public String getIdexpdate()
			{
				return this.idexpdate;
			}
			
		public void setIdexpdate(final String idexpdate)
			{
				this.idexpdate = idexpdate;
			}
			
		public String getIdtypeissueddate()
			{
				return this.idtypeissueddate;
			}
			
		public void setIdtypeissueddate(final String idtypeissueddate)
			{
				this.idtypeissueddate = idtypeissueddate;
			}
			
		public String getBirthdate()
			{
				return this.birthdate;
			}
			
		public void setBirthdate(final String birthdate)
			{
				this.birthdate = birthdate;
			}
			
		public String getRentfinishdate()
			{
				return this.rentfinishdate;
			}
			
		public void setRentfinishdate(final String rentfinishdate)
			{
				this.rentfinishdate = rentfinishdate;
			}
			
		public Short getIscorporatecreditline()
			{
				return this.iscorporatecreditline;
			}
			
		public void setIscorporatecreditline(final Short iscorporatecreditline)
			{
				this.iscorporatecreditline = iscorporatecreditline;
			}
			
		public String getName()
			{
				return this.name;
			}
			
		public void setName(final String name)
			{
				this.name = name;
			}
			
		public Long getCustomerid()
			{
				return this.customerid;
			}
			
		public void setCustomerid(final Long customerid)
			{
				this.customerid = customerid;
			}
			
	}
