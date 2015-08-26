
package com.adibrata.smartdealer.action.customer;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PersCust;
import com.adibrata.smartdealer.model.PersCustLegalInfo;
import com.adibrata.smartdealer.model.PersCustResidenceInfo;
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
		private Partner partner;
		private CustomerMaintService service;
		private Customer customer;
		private PersCust perscust;
		private PersCustLegalInfo legalinfo;
		private PersCustResidenceInfo residenceinfo;

		private String mode;
		private String message;

		private Long id;
		private Long customerid;

		private String name;
		private String legalname;

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
		private Double homeprice;
		private Short staysinceyear;
		private Short staysincemonth;
		private Short numofassetowned;
		private String reference;
		private Short isapplycarloanbefore;
		private String applycarloancompanyname;
		private String activecustomer;
		private String notes;
		private Short iscorporatecreditline;
		private Double plafondamount;
		private String biologicalmothersname;
		private String customergroup;
		private Short mainbusinesssinceyear;

		private String legaladdress;
		private String legalrt;
		private String legalrw;
		private String legalkelurahan;
		private String legalkecamatan;
		private String legalcity;
		private String legalzipcode;

		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String kecamatan;
		private String city;
		private String zipcode;
		private String areaphone1;
		private String phoneno1;
		private String areaphone2;
		private String phoneno2;
		private String areafax;
		private String faxno;
		private String handphone;

		public PersCustAction() throws Exception
			{
				try
					{
						// TODO Auto-generated constructor stub
						this.partner = new Partner();
						this.partner.setPartnerCode(BaseAction.sesPartnerCode());
						if (this.getCustomerid() != null)
							{
								this.customer = new Customer();
								this.customer.setId(this.getCustomerid());
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
								case "check" :
									try
										{
											this.CheckCustomer();
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
						strMode = INPUT;
						this.numofassetowned = 0;
						this.homeprice = 0.00;
						this.setIdexpdate(this.dateformat.format(BaseAction.sesBussinessDate()));
						
					}
				return strMode;
			}
			
		public String SaveCustomer() throws Exception
			{
				try
					{
						this.perscust = new PersCust();
						this.customer = new Customer();
						this.legalinfo = new PersCustLegalInfo();
						this.residenceinfo = new PersCustResidenceInfo();
						this.customer.setPartner(this.partner);
						this.customer.setName(this.name);
						this.customer.setType("P");

						this.perscust.setPersonalCustomerType(this.getPersonalcustomertype());
						this.perscust.setIdtype(this.getIdtype());
						this.perscust.setIdexpDate(this.dateformat.parse(this.getIdexpdate()));
						this.perscust.setIdnumber(this.getIdnumber());
						this.perscust.setIdnumberChecking(this.getIdnumberchecking());
						// this.perscust.setIdtypeIssuedDate(this.dateformat.parse(this.getIdtypeissueddate()));
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
						// this.perscust.setWnacountry(this.getWnacountry());
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

						this.legalinfo.setLegalName(this.legalname);
						this.legalinfo.setAddress(this.legaladdress);
						this.legalinfo.setRt(this.legalrt);
						this.legalinfo.setRw(this.legalrw);
						this.legalinfo.setKelurahan(this.legalkelurahan);
						this.legalinfo.setKecamatan(this.legalkecamatan);
						this.legalinfo.setCity(this.legalcity);
						this.legalinfo.setZipcode(this.legalzipcode);
						
						this.residenceinfo.setAddress(this.address);
						this.residenceinfo.setRt(this.rt);
						this.residenceinfo.setRw(this.rw);
						this.residenceinfo.setKelurahan(this.kelurahan);
						this.residenceinfo.setKecamatan(this.kecamatan);
						this.residenceinfo.setCity(this.city);
						this.residenceinfo.setZipcode(this.zipcode);
						this.service = new CustomerDao();
						this.customerid = this.service.SaveCustomer(BaseAction.sesLoginName(), this.customer, this.perscust, this.legalinfo, this.residenceinfo);
						this.mode = SUCCESS;

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

		private void CheckCustomer()
			{
			
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
		 * @return the service
		 */
		public CustomerMaintService getService()
			{
				return this.service;
			}

		/**
		 * @param service
		 *            the service to set
		 */
		public void setService(final CustomerMaintService service)
			{
				this.service = service;
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
		 * @return the legalinfo
		 */
		public PersCustLegalInfo getLegalinfo()
			{
				return this.legalinfo;
			}

		/**
		 * @param legalinfo
		 *            the legalinfo to set
		 */
		public void setLegalinfo(final PersCustLegalInfo legalinfo)
			{
				this.legalinfo = legalinfo;
			}

		/**
		 * @return the residenceinfo
		 */
		public PersCustResidenceInfo getResidenceinfo()
			{
				return this.residenceinfo;
			}

		/**
		 * @param residenceinfo
		 *            the residenceinfo to set
		 */
		public void setResidenceinfo(final PersCustResidenceInfo residenceinfo)
			{
				this.residenceinfo = residenceinfo;
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
		 * @return the legalname
		 */
		public String getLegalname()
			{
				return this.legalname;
			}

		/**
		 * @param legalname
		 *            the legalname to set
		 */
		public void setLegalname(final String legalname)
			{
				this.legalname = legalname;
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
		public Double getHomeprice()
			{
				return this.homeprice;
			}

		/**
		 * @param homeprice
		 *            the homeprice to set
		 */
		public void setHomeprice(final Double homeprice)
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
		public Short getNumofassetowned()
			{
				return this.numofassetowned;
			}

		/**
		 * @param numofassetowned
		 *            the numofassetowned to set
		 */
		public void setNumofassetowned(final Short numofassetowned)
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
		public Short getIsapplycarloanbefore()
			{
				return this.isapplycarloanbefore;
			}

		/**
		 * @param isapplycarloanbefore
		 *            the isapplycarloanbefore to set
		 */
		public void setIsapplycarloanbefore(final Short isapplycarloanbefore)
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
		 * @return the legaladdress
		 */
		public String getLegaladdress()
			{
				return this.legaladdress;
			}

		/**
		 * @param legaladdress
		 *            the legaladdress to set
		 */
		public void setLegaladdress(final String legaladdress)
			{
				this.legaladdress = legaladdress;
			}

		/**
		 * @return the legalrt
		 */
		public String getLegalrt()
			{
				return this.legalrt;
			}

		/**
		 * @param legalrt
		 *            the legalrt to set
		 */
		public void setLegalrt(final String legalrt)
			{
				this.legalrt = legalrt;
			}

		/**
		 * @return the legalrw
		 */
		public String getLegalrw()
			{
				return this.legalrw;
			}

		/**
		 * @param legalrw
		 *            the legalrw to set
		 */
		public void setLegalrw(final String legalrw)
			{
				this.legalrw = legalrw;
			}

		/**
		 * @return the legalkelurahan
		 */
		public String getLegalkelurahan()
			{
				return this.legalkelurahan;
			}

		/**
		 * @param legalkelurahan
		 *            the legalkelurahan to set
		 */
		public void setLegalkelurahan(final String legalkelurahan)
			{
				this.legalkelurahan = legalkelurahan;
			}

		/**
		 * @return the legalkecamatan
		 */
		public String getLegalkecamatan()
			{
				return this.legalkecamatan;
			}

		/**
		 * @param legalkecamatan
		 *            the legalkecamatan to set
		 */
		public void setLegalkecamatan(final String legalkecamatan)
			{
				this.legalkecamatan = legalkecamatan;
			}

		/**
		 * @return the legalcity
		 */
		public String getLegalcity()
			{
				return this.legalcity;
			}

		/**
		 * @param legalcity
		 *            the legalcity to set
		 */
		public void setLegalcity(final String legalcity)
			{
				this.legalcity = legalcity;
			}

		/**
		 * @return the legalzipcode
		 */
		public String getLegalzipcode()
			{
				return this.legalzipcode;
			}

		/**
		 * @param legalzipcode
		 *            the legalzipcode to set
		 */
		public void setLegalzipcode(final String legalzipcode)
			{
				this.legalzipcode = legalzipcode;
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

	}
