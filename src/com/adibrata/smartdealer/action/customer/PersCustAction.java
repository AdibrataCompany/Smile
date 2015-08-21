
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
			
		/**
		 * @return the customermaintservice
		 */
		public CustomerMaintService getCustomermaintservice()
			{
				return this.customermaintservice;
			}
			
		/**
		 * @param customermaintservice
		 *            the customermaintservice to set
		 */
		public void setCustomermaintservice(final CustomerMaintService customermaintservice)
			{
				this.customermaintservice = customermaintservice;
			}
			
		/**
		 * @return the customer
		 */
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		/**
		 * @param customer
		 *            the customer to set
		 */
		public void setCustomer(final Customer customer)
			{
				this.customer = customer;
			}
			
		/**
		 * @return the perscust
		 */
		public PersCust getPerscust()
			{
				return this.perscust;
			}
			
		/**
		 * @param perscust
		 *            the perscust to set
		 */
		public void setPerscust(final PersCust perscust)
			{
				this.perscust = perscust;
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
		 * @return the customerid
		 */
		public Long getCustomerid()
			{
				return this.customerid;
			}
			
		/**
		 * @param customerid
		 *            the customerid to set
		 */
		public void setCustomerid(final Long customerid)
			{
				this.customerid = customerid;
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
		 * @return the personalcustomertype
		 */
		public String getPersonalcustomertype()
			{
				return this.personalcustomertype;
			}
			
		/**
		 * @param personalcustomertype
		 *            the personalcustomertype to set
		 */
		public void setPersonalcustomertype(final String personalcustomertype)
			{
				this.personalcustomertype = personalcustomertype;
			}
			
		/**
		 * @return the idtype
		 */
		public String getIdtype()
			{
				return this.idtype;
			}
			
		/**
		 * @param idtype
		 *            the idtype to set
		 */
		public void setIdtype(final String idtype)
			{
				this.idtype = idtype;
			}
			
		/**
		 * @return the idexpdate
		 */
		public String getIdexpdate()
			{
				return this.idexpdate;
			}
			
		/**
		 * @param idexpdate
		 *            the idexpdate to set
		 */
		public void setIdexpdate(final String idexpdate)
			{
				this.idexpdate = idexpdate;
			}
			
		/**
		 * @return the idnumber
		 */
		public String getIdnumber()
			{
				return this.idnumber;
			}
			
		/**
		 * @param idnumber
		 *            the idnumber to set
		 */
		public void setIdnumber(final String idnumber)
			{
				this.idnumber = idnumber;
			}
			
		/**
		 * @return the idnumberchecking
		 */
		public String getIdnumberchecking()
			{
				return this.idnumberchecking;
			}
			
		/**
		 * @param idnumberchecking
		 *            the idnumberchecking to set
		 */
		public void setIdnumberchecking(final String idnumberchecking)
			{
				this.idnumberchecking = idnumberchecking;
			}
			
		/**
		 * @return the idtypeissueddate
		 */
		public String getIdtypeissueddate()
			{
				return this.idtypeissueddate;
			}
			
		/**
		 * @param idtypeissueddate
		 *            the idtypeissueddate to set
		 */
		public void setIdtypeissueddate(final String idtypeissueddate)
			{
				this.idtypeissueddate = idtypeissueddate;
			}
			
		/**
		 * @return the gender
		 */
		public String getGender()
			{
				return this.gender;
			}
			
		/**
		 * @param gender
		 *            the gender to set
		 */
		public void setGender(final String gender)
			{
				this.gender = gender;
			}
			
		/**
		 * @return the birthplace
		 */
		public String getBirthplace()
			{
				return this.birthplace;
			}
			
		/**
		 * @param birthplace
		 *            the birthplace to set
		 */
		public void setBirthplace(final String birthplace)
			{
				this.birthplace = birthplace;
			}
			
		/**
		 * @return the birthdate
		 */
		public String getBirthdate()
			{
				return this.birthdate;
			}
			
		/**
		 * @param birthdate
		 *            the birthdate to set
		 */
		public void setBirthdate(final String birthdate)
			{
				this.birthdate = birthdate;
			}
			
		/**
		 * @return the mobilephone
		 */
		public String getMobilephone()
			{
				return this.mobilephone;
			}
			
		/**
		 * @param mobilephone
		 *            the mobilephone to set
		 */
		public void setMobilephone(final String mobilephone)
			{
				this.mobilephone = mobilephone;
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
		 * @return the religion
		 */
		public String getReligion()
			{
				return this.religion;
			}
			
		/**
		 * @param religion
		 *            the religion to set
		 */
		public void setReligion(final String religion)
			{
				this.religion = religion;
			}
			
		/**
		 * @return the maritalstatus
		 */
		public String getMaritalstatus()
			{
				return this.maritalstatus;
			}
			
		/**
		 * @param maritalstatus
		 *            the maritalstatus to set
		 */
		public void setMaritalstatus(final String maritalstatus)
			{
				this.maritalstatus = maritalstatus;
			}
			
		/**
		 * @return the numofdependence
		 */
		public Short getNumofdependence()
			{
				return this.numofdependence;
			}
			
		/**
		 * @param numofdependence
		 *            the numofdependence to set
		 */
		public void setNumofdependence(final Short numofdependence)
			{
				this.numofdependence = numofdependence;
			}
			
		/**
		 * @return the personalnpwp
		 */
		public String getPersonalnpwp()
			{
				return this.personalnpwp;
			}
			
		/**
		 * @param personalnpwp
		 *            the personalnpwp to set
		 */
		public void setPersonalnpwp(final String personalnpwp)
			{
				this.personalnpwp = personalnpwp;
			}
			
		/**
		 * @return the nokk
		 */
		public String getNokk()
			{
				return this.nokk;
			}
			
		/**
		 * @param nokk
		 *            the nokk to set
		 */
		public void setNokk(final String nokk)
			{
				this.nokk = nokk;
			}
			
		/**
		 * @return the education
		 */
		public String getEducation()
			{
				return this.education;
			}
			
		/**
		 * @param education
		 *            the education to set
		 */
		public void setEducation(final String education)
			{
				this.education = education;
			}
			
		/**
		 * @return the professionid
		 */
		public String getProfessionid()
			{
				return this.professionid;
			}
			
		/**
		 * @param professionid
		 *            the professionid to set
		 */
		public void setProfessionid(final String professionid)
			{
				this.professionid = professionid;
			}
			
		/**
		 * @return the nationality
		 */
		public String getNationality()
			{
				return this.nationality;
			}
			
		/**
		 * @param nationality
		 *            the nationality to set
		 */
		public void setNationality(final String nationality)
			{
				this.nationality = nationality;
			}
			
		/**
		 * @return the wnacountry
		 */
		public String getWnacountry()
			{
				return this.wnacountry;
			}
			
		/**
		 * @param wnacountry
		 *            the wnacountry to set
		 */
		public void setWnacountry(final String wnacountry)
			{
				this.wnacountry = wnacountry;
			}
			
		/**
		 * @return the homestatus
		 */
		public String getHomestatus()
			{
				return this.homestatus;
			}
			
		/**
		 * @param homestatus
		 *            the homestatus to set
		 */
		public void setHomestatus(final String homestatus)
			{
				this.homestatus = homestatus;
			}
			
		/**
		 * @return the rentfinishdate
		 */
		public String getRentfinishdate()
			{
				return this.rentfinishdate;
			}
			
		/**
		 * @param rentfinishdate
		 *            the rentfinishdate to set
		 */
		public void setRentfinishdate(final String rentfinishdate)
			{
				this.rentfinishdate = rentfinishdate;
			}
			
		/**
		 * @return the homelocation
		 */
		public String getHomelocation()
			{
				return this.homelocation;
			}
			
		/**
		 * @param homelocation
		 *            the homelocation to set
		 */
		public void setHomelocation(final String homelocation)
			{
				this.homelocation = homelocation;
			}
			
		/**
		 * @return the homeprice
		 */
		public double getHomeprice()
			{
				return this.homeprice;
			}
			
		/**
		 * @param homeprice
		 *            the homeprice to set
		 */
		public void setHomeprice(final double homeprice)
			{
				this.homeprice = homeprice;
			}
			
		/**
		 * @return the staysinceyear
		 */
		public Short getStaysinceyear()
			{
				return this.staysinceyear;
			}
			
		/**
		 * @param staysinceyear
		 *            the staysinceyear to set
		 */
		public void setStaysinceyear(final Short staysinceyear)
			{
				this.staysinceyear = staysinceyear;
			}
			
		/**
		 * @return the staysincemonth
		 */
		public Short getStaysincemonth()
			{
				return this.staysincemonth;
			}
			
		/**
		 * @param staysincemonth
		 *            the staysincemonth to set
		 */
		public void setStaysincemonth(final Short staysincemonth)
			{
				this.staysincemonth = staysincemonth;
			}
			
		/**
		 * @return the numofassetowned
		 */
		public short getNumofassetowned()
			{
				return this.numofassetowned;
			}
			
		/**
		 * @param numofassetowned
		 *            the numofassetowned to set
		 */
		public void setNumofassetowned(final short numofassetowned)
			{
				this.numofassetowned = numofassetowned;
			}
			
		/**
		 * @return the reference
		 */
		public String getReference()
			{
				return this.reference;
			}
			
		/**
		 * @param reference
		 *            the reference to set
		 */
		public void setReference(final String reference)
			{
				this.reference = reference;
			}
			
		/**
		 * @return the isapplycarloanbefore
		 */
		public short getIsapplycarloanbefore()
			{
				return this.isapplycarloanbefore;
			}
			
		/**
		 * @param isapplycarloanbefore
		 *            the isapplycarloanbefore to set
		 */
		public void setIsapplycarloanbefore(final short isapplycarloanbefore)
			{
				this.isapplycarloanbefore = isapplycarloanbefore;
			}
			
		/**
		 * @return the applycarloancompanyname
		 */
		public String getApplycarloancompanyname()
			{
				return this.applycarloancompanyname;
			}
			
		/**
		 * @param applycarloancompanyname
		 *            the applycarloancompanyname to set
		 */
		public void setApplycarloancompanyname(final String applycarloancompanyname)
			{
				this.applycarloancompanyname = applycarloancompanyname;
			}
			
		/**
		 * @return the activecustomer
		 */
		public String getActivecustomer()
			{
				return this.activecustomer;
			}
			
		/**
		 * @param activecustomer
		 *            the activecustomer to set
		 */
		public void setActivecustomer(final String activecustomer)
			{
				this.activecustomer = activecustomer;
			}
			
		/**
		 * @return the notes
		 */
		public String getNotes()
			{
				return this.notes;
			}
			
		/**
		 * @param notes
		 *            the notes to set
		 */
		public void setNotes(final String notes)
			{
				this.notes = notes;
			}
			
		/**
		 * @return the iscorporatecreditline
		 */
		public Short getIscorporatecreditline()
			{
				return this.iscorporatecreditline;
			}
			
		/**
		 * @param iscorporatecreditline
		 *            the iscorporatecreditline to set
		 */
		public void setIscorporatecreditline(final Short iscorporatecreditline)
			{
				this.iscorporatecreditline = iscorporatecreditline;
			}
			
		/**
		 * @return the plafondamount
		 */
		public Double getPlafondamount()
			{
				return this.plafondamount;
			}
			
		/**
		 * @param plafondamount
		 *            the plafondamount to set
		 */
		public void setPlafondamount(final Double plafondamount)
			{
				this.plafondamount = plafondamount;
			}
			
		/**
		 * @return the biologicalmothersname
		 */
		public String getBiologicalmothersname()
			{
				return this.biologicalmothersname;
			}
			
		/**
		 * @param biologicalmothersname
		 *            the biologicalmothersname to set
		 */
		public void setBiologicalmothersname(final String biologicalmothersname)
			{
				this.biologicalmothersname = biologicalmothersname;
			}
			
		/**
		 * @return the customergroup
		 */
		public String getCustomergroup()
			{
				return this.customergroup;
			}
			
		/**
		 * @param customergroup
		 *            the customergroup to set
		 */
		public void setCustomergroup(final String customergroup)
			{
				this.customergroup = customergroup;
			}
			
		/**
		 * @return the mainbusinesssinceyear
		 */
		public Short getMainbusinesssinceyear()
			{
				return this.mainbusinesssinceyear;
			}
			
		/**
		 * @param mainbusinesssinceyear
		 *            the mainbusinesssinceyear to set
		 */
		public void setMainbusinesssinceyear(final Short mainbusinesssinceyear)
			{
				this.mainbusinesssinceyear = mainbusinesssinceyear;
			}
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
	}
