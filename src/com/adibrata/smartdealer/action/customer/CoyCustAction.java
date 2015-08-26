
package com.adibrata.smartdealer.action.customer;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.CoyCust;
import com.adibrata.smartdealer.model.CoyCustContactInfo;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class CoyCustAction extends BaseAction implements Preparable
	{
		
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		
		private CustomerMaintService customermaintservice;
		private Customer customer;
		private CoyCust coycust;
		private CoyCustContactInfo contactinfo;
		private Partner partner;
		
		private String mode;
		private String message;
		private String usrUpd;
		private String usrCrt;
		private long id;
		private long customerid;
		
		private String type;
		private String name;
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
		private Double prepaidamount;
		private Double aramount;
		private Double arpaid;
		private Double arwaived;
		
		private String npwp;
		private String npwpchecking;
		private String companytype;
		private Short numberofemployees;
		private Short yearofestablished;
		private String industrytypeid;
		private String pengelolagedungareaphone;
		private String pengelolagedungphone;
		private String bankcode;
		private String bankbranch;
		private String accountno;
		private String accountname;
		private String reference;
		private short isapplycarloanbefore;
		private String applycarloancompanyname;
		private String activecustomer;
		private String notes;
		private Short iscorporatecreditline;
		private Double plafondamount;
		private String customergroup;
		private String nodocumentofestablished;
		private String dateDocumentofestablished;
		private String notaryplace;
		private String notaryname;
		private String lastnodocumentofestablished;
		private String lastdatedocumentofestablished;
		private String lastnotaryplace;
		private String lastnotaryname;
		
		public CoyCustAction() throws Exception
			{
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.customermaintservice = new CustomerDao();
				this.customer = new Customer();
				this.coycust = new CoyCust();
				this.contactinfo = new CoyCustContactInfo();
				
				this.customer.setId(this.getCustomerid());
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
						this.coycust = new CoyCust();

						this.coycust.setCustomer(this.getCustomer());
						this.coycust.setNpwp(this.getNpwp());
						this.coycust.setNpwpchecking(this.getNpwpchecking());
						this.coycust.setCompanyType(this.getCompanytype());
						this.coycust.setNumberOfEmployees(this.getNumberofemployees());
						this.coycust.setYearOfEstablished(this.getYearofestablished());
						this.coycust.setIndustryTypeId(this.getIndustrytypeid());
						this.coycust.setPengelolaGedungAreaPhone(this.getPengelolagedungareaphone());
						this.coycust.setPengelolaGedungPhone(this.getPengelolagedungphone());
						this.coycust.setBankCode(this.getBankcode());
						this.coycust.setBankBranch(this.getBankbranch());
						this.coycust.setAccountNo(this.getAccountno());
						this.coycust.setAccountName(this.getAccountname());
						this.coycust.setReference(this.getReference());
						this.coycust.setIsApplyCarLoanBefore(this.getIsapplycarloanbefore());
						this.coycust.setApplyCarLoanCompanyName(this.getApplycarloancompanyname());
						this.coycust.setActiveCustomer(this.getActivecustomer());
						this.coycust.setNotes(this.getNotes());
						this.coycust.setIsCorporateCreditLine(this.getIscorporatecreditline());
						this.coycust.setPlafondAmount(this.getPlafondamount());
						this.coycust.setCustomerGroup(this.getCustomergroup());
						this.coycust.setNoDocumentOfEstablished(this.getNodocumentofestablished());
						this.coycust.setDateDocumentOfEstablished(this.dateformat.parse(this.getDateDocumentofestablished()));
						this.coycust.setNotaryPlace(this.getNotaryplace());
						this.coycust.setNotaryName(this.getNotaryname());
						this.coycust.setLastNoDocumentOfEstablished(this.getLastnodocumentofestablished());
						this.coycust.setLastDateDocumentOfEstablished(this.dateformat.parse(this.getLastdatedocumentofestablished()));
						this.coycust.setLastNotaryPlace(this.getLastnotaryplace());
						this.coycust.setLastNotaryName(this.getLastnotaryname());

						this.customermaintservice.SaveCustomer(BaseAction.sesLoginName(), this.customer, this.coycust);

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

		public void SaveContactInfo() throws Exception
			{
				try
					{
						this.contactinfo = new CoyCustContactInfo();

						this.contactinfo.setCustomer(this.getCustomer());
						this.contactinfo.setName(this.getName());
						this.contactinfo.setAddress(this.getAddress());
						this.contactinfo.setRt(this.getRt());
						this.contactinfo.setRw(this.getRw());
						this.contactinfo.setKelurahan(this.getKelurahan());
						this.contactinfo.setKecamatan(this.getKecamatan());
						this.contactinfo.setCity(this.getCity());
						this.contactinfo.setZipcode(this.getZipcode());
						this.contactinfo.setAreaPhone1(this.getAreaphone1());
						this.contactinfo.setPhoneNo1(this.getPhoneno1());
						this.contactinfo.setAreaPhone2(this.getAreaphone2());
						this.contactinfo.setPhoneNo2(this.getPhoneno2());
						this.contactinfo.setAreaFax(this.getAreafax());
						this.contactinfo.setFaxNo(this.getFaxno());
						this.contactinfo.setHandphone(this.getHandphone());
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
			
		public CustomerMaintService getCustomermaintservice()
			{
				return this.customermaintservice;
			}
			
		public void setCustomermaintservice(final CustomerMaintService customermaintservice)
			{
				this.customermaintservice = customermaintservice;
			}
			
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(final Customer customer)
			{
				this.customer = customer;
			}
			
		public CoyCust getCoycust()
			{
				return this.coycust;
			}
			
		public void setCoycust(final CoyCust coycust)
			{
				this.coycust = coycust;
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
			
		public long getId()
			{
				return this.id;
			}
			
		public void setId(final long id)
			{
				this.id = id;
			}
			
		public String getNpwp()
			{
				return this.npwp;
			}
			
		public void setNpwp(final String npwp)
			{
				this.npwp = npwp;
			}
			
		public String getNpwpchecking()
			{
				return this.npwpchecking;
			}
			
		public void setNpwpchecking(final String npwpchecking)
			{
				this.npwpchecking = npwpchecking;
			}
			
		public String getCompanytype()
			{
				return this.companytype;
			}
			
		public void setCompanytype(final String companytype)
			{
				this.companytype = companytype;
			}
			
		public Short getNumberofemployees()
			{
				return this.numberofemployees;
			}
			
		public void setNumberofemployees(final Short numberofemployees)
			{
				this.numberofemployees = numberofemployees;
			}
			
		public Short getYearofestablished()
			{
				return this.yearofestablished;
			}
			
		public void setYearofestablished(final Short yearofestablished)
			{
				this.yearofestablished = yearofestablished;
			}
			
		public String getPengelolagedungareaphone()
			{
				return this.pengelolagedungareaphone;
			}
			
		public void setPengelolagedungareaphone(final String pengelolagedungareaphone)
			{
				this.pengelolagedungareaphone = pengelolagedungareaphone;
			}
			
		public String getPengelolagedungphone()
			{
				return this.pengelolagedungphone;
			}
			
		public void setPengelolagedungphone(final String pengelolagedungphone)
			{
				this.pengelolagedungphone = pengelolagedungphone;
			}
			
		public String getBankcode()
			{
				return this.bankcode;
			}
			
		public void setBankcode(final String bankcode)
			{
				this.bankcode = bankcode;
			}
			
		public String getBankbranch()
			{
				return this.bankbranch;
			}
			
		public void setBankbranch(final String bankbranch)
			{
				this.bankbranch = bankbranch;
			}
			
		public String getAccountno()
			{
				return this.accountno;
			}
			
		public void setAccountno(final String accountno)
			{
				this.accountno = accountno;
			}
			
		public String getAccountname()
			{
				return this.accountname;
			}
			
		public void setAccountname(final String accountname)
			{
				this.accountname = accountname;
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
			
		public String getCustomergroup()
			{
				return this.customergroup;
			}
			
		public void setCustomergroup(final String customergroup)
			{
				this.customergroup = customergroup;
			}
			
		public String getDateDocumentofestablished()
			{
				return this.dateDocumentofestablished;
			}
			
		public void setDateDocumentofestablished(final String dateDocumentofestablished)
			{
				this.dateDocumentofestablished = dateDocumentofestablished;
			}
			
		public String getNotaryplace()
			{
				return this.notaryplace;
			}
			
		public void setNotaryplace(final String notaryplace)
			{
				this.notaryplace = notaryplace;
			}
			
		public String getNotaryname()
			{
				return this.notaryname;
			}
			
		public void setNotaryname(final String notaryname)
			{
				this.notaryname = notaryname;
			}
			
		public String getLastnodocumentofestablished()
			{
				return this.lastnodocumentofestablished;
			}
			
		public void setLastnodocumentofestablished(final String lastnodocumentofestablished)
			{
				this.lastnodocumentofestablished = lastnodocumentofestablished;
			}
			
		public String getLastdatedocumentofestablished()
			{
				return this.lastdatedocumentofestablished;
			}
			
		public void setLastdatedocumentofestablished(final String lastdatedocumentofestablished)
			{
				this.lastdatedocumentofestablished = lastdatedocumentofestablished;
			}
			
		public String getLastnotaryplace()
			{
				return this.lastnotaryplace;
			}
			
		public void setLastnotaryplace(final String lastnotaryplace)
			{
				this.lastnotaryplace = lastnotaryplace;
			}
			
		public String getLastnotaryname()
			{
				return this.lastnotaryname;
			}
			
		public void setLastnotaryname(final String lastnotaryname)
			{
				this.lastnotaryname = lastnotaryname;
			}
			
		public String getIndustrytypeid()
			{
				return this.industrytypeid;
			}
			
		public void setIndustrytypeid(final String industrytypeid)
			{
				this.industrytypeid = industrytypeid;
			}
			
		public Short getIscorporatecreditline()
			{
				return this.iscorporatecreditline;
			}
			
		public void setIscorporatecreditline(final Short iscorporatecreditline)
			{
				this.iscorporatecreditline = iscorporatecreditline;
			}
			
		public long getCustomerid()
			{
				return this.customerid;
			}
			
		public void setCustomerid(final long customerid)
			{
				this.customerid = customerid;
			}
			
		public String getType()
			{
				return this.type;
			}
			
		public void setType(final String type)
			{
				this.type = type;
			}
			
		public String getName()
			{
				return this.name;
			}
			
		public void setName(final String name)
			{
				this.name = name;
			}
			
		public String getAddress()
			{
				return this.address;
			}
			
		public void setAddress(final String address)
			{
				this.address = address;
			}
			
		public String getRt()
			{
				return this.rt;
			}
			
		public void setRt(final String rt)
			{
				this.rt = rt;
			}
			
		public String getRw()
			{
				return this.rw;
			}
			
		public void setRw(final String rw)
			{
				this.rw = rw;
			}
			
		public String getKelurahan()
			{
				return this.kelurahan;
			}
			
		public void setKelurahan(final String kelurahan)
			{
				this.kelurahan = kelurahan;
			}
			
		public String getKecamatan()
			{
				return this.kecamatan;
			}
			
		public void setKecamatan(final String kecamatan)
			{
				this.kecamatan = kecamatan;
			}
			
		public String getCity()
			{
				return this.city;
			}
			
		public void setCity(final String city)
			{
				this.city = city;
			}
			
		public String getZipcode()
			{
				return this.zipcode;
			}
			
		public void setZipcode(final String zipcode)
			{
				this.zipcode = zipcode;
			}
			
		public String getAreaphone1()
			{
				return this.areaphone1;
			}
			
		public void setAreaphone1(final String areaphone1)
			{
				this.areaphone1 = areaphone1;
			}
			
		public String getPhoneno1()
			{
				return this.phoneno1;
			}
			
		public void setPhoneno1(final String phoneno1)
			{
				this.phoneno1 = phoneno1;
			}
			
		public String getAreaphone2()
			{
				return this.areaphone2;
			}
			
		public void setAreaphone2(final String areaphone2)
			{
				this.areaphone2 = areaphone2;
			}
			
		public String getPhoneno2()
			{
				return this.phoneno2;
			}
			
		public void setPhoneno2(final String phoneno2)
			{
				this.phoneno2 = phoneno2;
			}
			
		public String getAreafax()
			{
				return this.areafax;
			}
			
		public void setAreafax(final String areafax)
			{
				this.areafax = areafax;
			}
			
		public String getFaxno()
			{
				return this.faxno;
			}
			
		public void setFaxno(final String faxno)
			{
				this.faxno = faxno;
			}
			
		public String getHandphone()
			{
				return this.handphone;
			}
			
		public void setHandphone(final String handphone)
			{
				this.handphone = handphone;
			}
			
		public Double getPrepaidamount()
			{
				return this.prepaidamount;
			}
			
		public void setPrepaidamount(final Double prepaidamount)
			{
				this.prepaidamount = prepaidamount;
			}
			
		public Double getAramount()
			{
				return this.aramount;
			}
			
		public void setAramount(final Double aramount)
			{
				this.aramount = aramount;
			}
			
		public Double getArpaid()
			{
				return this.arpaid;
			}
			
		public void setArpaid(final Double arpaid)
			{
				this.arpaid = arpaid;
			}
			
		public Double getArwaived()
			{
				return this.arwaived;
			}
			
		public void setArwaived(final Double arwaived)
			{
				this.arwaived = arwaived;
			}
			
		public String getNodocumentofestablished()
			{
				return this.nodocumentofestablished;
			}
			
		public void setNodocumentofestablished(final String nodocumentofestablished)
			{
				this.nodocumentofestablished = nodocumentofestablished;
			}
			
		/**
		 * @return the contactinfo
		 */
		public CoyCustContactInfo getContactinfo()
			{
				return this.contactinfo;
			}
			
		/**
		 * @param contactinfo
		 *            the contactinfo to set
		 */
		public void setContactinfo(final CoyCustContactInfo contactinfo)
			{
				this.contactinfo = contactinfo;
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
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
	}
