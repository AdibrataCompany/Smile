
package com.adibrata.smartdealer.action.credit.application;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.credit.ApplicationDataDao;
import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.Application;
import com.adibrata.smartdealer.model.Currency;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.Marketing;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.credit.ApplicationDataService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class ApplicationDataAction extends BaseAction implements Preparable
	{
		
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		
		private String message;
		private String mode;
		private String usrUpd;
		private String usrCrt;
		
		private Partner partner;
		private Office office;
		private Application application;
		private Currency currency;
		private Customer customer;
		private Customer spouse;
		private Customer guarantor;
		private Marketing marketing;
		private Agrmnt agrmnt;
		
		private ApplicationDataService service;
		
		private Long id;
		private Long spouseid;
		private String spousename;
		private Long guarantorid;
		private String guarantorname;
		private Long customerid;
		private Long appid;
		private Long currencyid;
		private Long marketingid;
		private String marketingname;
		
		private String agrmntcode;
		private String coaschmcode;
		private Long prodid;
		private Long potid;
		private Short numofasset;
		private String interesttypecode;
		private String instschemecode;
		private String guarantorrelation;
		private String wopcode;
		private String sourceappcode;
		private String agreementdate;
		private String notes;
		private Double osp;
		private Double osi;
		private Double ospundue;
		private Double osiundue;
		private Short nextinstnumber;
		private String nextinstdate;
		private Short nextinstduenumber;
		private String nextinstduedate;
		private Double prepaidamt;
		private Short tenor;
		private Short cummulativetenor;
		private String effectivedate;
		private String golivedate;
		private String rrddate;
		private String contractstatus;
		private String defaultstatus;
		private Double percentagepenalty;
		
		public ApplicationDataAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				
				this.office = new Office();
				this.office.setId(BaseAction.sesOfficeId());
				
				this.application = new Application();
				this.application.setId(this.getAppid());
				
				this.currency = new Currency();
				this.currency.setId(this.getCurrencyid());
				
				this.customer = new Customer();
				this.customer.setId(this.getCustomerid());
				
				this.service = new ApplicationDataDao();
				this.guarantor = new Customer();
				this.spouse = new Customer();
			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
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
			
		public String Save() throws Exception
			{
				try
					{
						this.agrmnt = new Agrmnt();
						this.agrmnt.setPartner(this.getPartner());
						this.agrmnt.setOffice(this.getOffice());
						this.agrmnt.setApplication(this.getApplication());
						this.agrmnt.setCurrency(this.getCurrency());
						this.agrmnt.setCustomerByCustomerId(this.getCustomer());
						this.agrmnt.setCustomerByGuarantorId(this.getGuarantor());
						this.agrmnt.setCustomerBySpouseId(this.getSpouse());
						this.agrmnt.setMarketing(this.getMarketing());
						this.agrmnt.setAgrmntCode(this.getAgrmntcode());
						this.agrmnt.setCoaSchmCode(this.getCoaschmcode());
						this.agrmnt.setProdId(this.getProdid());
						this.agrmnt.setPotId(this.getPotid());
						this.agrmnt.setNumOfAsset(this.getNumofasset());
						this.agrmnt.setInterestTypeCode(this.getInteresttypecode());
						this.agrmnt.setInstSchemeCode(this.getInstschemecode());
						this.agrmnt.setGuarantorRelation(this.getGuarantorrelation());
						this.agrmnt.setWopCode(this.getWopcode());
						this.agrmnt.setSourceAppCode(this.getSourceappcode());
						this.agrmnt.setAgreementDate(this.dateformat.parse(this.getAgreementdate()));
						this.agrmnt.setNotes(this.getNotes());
						this.agrmnt.setOsP(this.getOsp());
						this.agrmnt.setOsI(this.getOsi());
						this.agrmnt.setOsPundue(this.getOspundue());
						this.agrmnt.setOsIundue(this.getOsiundue());
						this.agrmnt.setNextInstNumber(this.getNextinstnumber());
						this.agrmnt.setNextInstDate(this.dateformat.parse(this.getNextinstdate()));
						this.agrmnt.setNextInstDueNumber(this.getNextinstduenumber());
						this.agrmnt.setNextInstDueDate(this.dateformat.parse(this.getNextinstduedate()));
						this.agrmnt.setPrepaidAmt(this.getPrepaidamt());
						this.agrmnt.setTenor(this.getTenor());
						this.agrmnt.setCummulativeTenor(this.getCummulativetenor());
						this.agrmnt.setEffectiveDate(this.dateformat.parse(this.getEffectivedate()));
						this.agrmnt.setGoLiveDate(this.dateformat.parse(this.getGolivedate()));
						this.agrmnt.setRrddate(this.dateformat.parse(this.getRrddate()));
						this.agrmnt.setContractStatus(this.getContractstatus());
						this.agrmnt.setDefaultStatus(this.getDefaultstatus());
						this.agrmnt.setPercentagePenalty(this.getPercentagepenalty());
						this.agrmnt.setUsrUpd(BaseAction.sesLoginName());
						
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
		 * @return the serialversionuid
		 */
		public static Long getSerialversionuid()
			{
				return serialVersionUID;
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
			
		public Application getApplication()
			{
				return this.application;
			}
			
		public void setApplication(final Application application)
			{
				this.application = application;
			}
			
		public Currency getCurrency()
			{
				return this.currency;
			}
			
		public void setCurrency(final Currency currency)
			{
				this.currency = currency;
			}
			
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(final Customer customer)
			{
				this.customer = customer;
			}
			
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		public void setAgrmnt(final Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}
			
		public String getAgrmntcode()
			{
				return this.agrmntcode;
			}
			
		public void setAgrmntcode(final String agrmntcode)
			{
				this.agrmntcode = agrmntcode;
			}
			
		public String getCoaschmcode()
			{
				return this.coaschmcode;
			}
			
		public void setCoaschmcode(final String coaschmcode)
			{
				this.coaschmcode = coaschmcode;
			}
			
		public Double getOsp()
			{
				return this.osp;
			}
			
		public void setOsp(final Double osp)
			{
				this.osp = osp;
			}
			
		public Double getOsi()
			{
				return this.osi;
			}
			
		public void setOsi(final Double osi)
			{
				this.osi = osi;
			}
			
		public Double getOspundue()
			{
				return this.ospundue;
			}
			
		public void setOspundue(final Double ospundue)
			{
				this.ospundue = ospundue;
			}
			
		public Double getOsiundue()
			{
				return this.osiundue;
			}
			
		public void setOsiundue(final Double osiundue)
			{
				this.osiundue = osiundue;
			}
			
		public Short getNextinstnumber()
			{
				return this.nextinstnumber;
			}
			
		public void setNextinstnumber(final Short nextinstnumber)
			{
				this.nextinstnumber = nextinstnumber;
			}
			
		public String getNextinstdate()
			{
				return this.nextinstdate;
			}
			
		public void setNextinstdate(final String nextinstdate)
			{
				this.nextinstdate = nextinstdate;
			}
			
		public Short getNextinstduenumber()
			{
				return this.nextinstduenumber;
			}
			
		public void setNextinstduenumber(final Short nextinstduenumber)
			{
				this.nextinstduenumber = nextinstduenumber;
			}
			
		public String getNextinstduedate()
			{
				return this.nextinstduedate;
			}
			
		public void setNextinstduedate(final String nextinstduedate)
			{
				this.nextinstduedate = nextinstduedate;
			}
			
		public Double getPrepaidamt()
			{
				return this.prepaidamt;
			}
			
		public void setPrepaidamt(final Double prepaidamt)
			{
				this.prepaidamt = prepaidamt;
			}
			
		public Short getTenor()
			{
				return this.tenor;
			}
			
		public void setTenor(final Short tenor)
			{
				this.tenor = tenor;
			}
			
		public Short getCummulativetenor()
			{
				return this.cummulativetenor;
			}
			
		public void setCummulativetenor(final Short cummulativetenor)
			{
				this.cummulativetenor = cummulativetenor;
			}
			
		public String getEffectivedate()
			{
				return this.effectivedate;
			}
			
		public void setEffectivedate(final String effectivedate)
			{
				this.effectivedate = effectivedate;
			}
			
		public String getGolivedate()
			{
				return this.golivedate;
			}
			
		public void setGolivedate(final String golivedate)
			{
				this.golivedate = golivedate;
			}
			
		public String getRrddate()
			{
				return this.rrddate;
			}
			
		public void setRrddate(final String rrddate)
			{
				this.rrddate = rrddate;
			}
			
		public String getContractstatus()
			{
				return this.contractstatus;
			}
			
		public void setContractstatus(final String contractstatus)
			{
				this.contractstatus = contractstatus;
			}
			
		public String getDefaultstatus()
			{
				return this.defaultstatus;
			}
			
		public void setDefaultstatus(final String defaultstatus)
			{
				this.defaultstatus = defaultstatus;
			}
			
		public Double getPercentagepenalty()
			{
				return this.percentagepenalty;
			}
			
		public void setPercentagepenalty(final Double percentagepenalty)
			{
				this.percentagepenalty = percentagepenalty;
			}
			
		public Marketing getMarketing()
			{
				return this.marketing;
			}
			
		public void setMarketing(final Marketing marketing)
			{
				this.marketing = marketing;
			}
			
		public Long getProdid()
			{
				return this.prodid;
			}
			
		public void setProdid(final Long prodid)
			{
				this.prodid = prodid;
			}
			
		public Long getPotid()
			{
				return this.potid;
			}
			
		public void setPotid(final Long potid)
			{
				this.potid = potid;
			}
			
		public Short getNumofasset()
			{
				return this.numofasset;
			}
			
		public void setNumofasset(final Short numofasset)
			{
				this.numofasset = numofasset;
			}
			
		public String getInteresttypecode()
			{
				return this.interesttypecode;
			}
			
		public void setInteresttypecode(final String interesttypecode)
			{
				this.interesttypecode = interesttypecode;
			}
			
		public String getInstschemecode()
			{
				return this.instschemecode;
			}
			
		public void setInstschemecode(final String instschemecode)
			{
				this.instschemecode = instschemecode;
			}
			
		public String getGuarantorrelation()
			{
				return this.guarantorrelation;
			}
			
		public void setGuarantorrelation(final String guarantorrelation)
			{
				this.guarantorrelation = guarantorrelation;
			}
			
		public String getWopcode()
			{
				return this.wopcode;
			}
			
		public void setWopcode(final String wopcode)
			{
				this.wopcode = wopcode;
			}
			
		public String getSourceappcode()
			{
				return this.sourceappcode;
			}
			
		public void setSourceappcode(final String sourceappcode)
			{
				this.sourceappcode = sourceappcode;
			}
			
		public String getAgreementdate()
			{
				return this.agreementdate;
			}
			
		public void setAgreementdate(final String agreementdate)
			{
				this.agreementdate = agreementdate;
			}
			
		public String getNotes()
			{
				return this.notes;
			}
			
		public void setNotes(final String notes)
			{
				this.notes = notes;
			}
			
		public Customer getSpouse()
			{
				return this.spouse;
			}
			
		public void setSpouse(final Customer spouse)
			{
				this.spouse = spouse;
			}
			
		public Customer getGuarantor()
			{
				return this.guarantor;
			}
			
		public void setGuarantor(final Customer guarantor)
			{
				this.guarantor = guarantor;
			}
			
		public ApplicationDataService getService()
			{
				return this.service;
			}
			
		public void setService(final ApplicationDataService service)
			{
				this.service = service;
			}
			
		public Long getSpouseid()
			{
				return this.spouseid;
			}
			
		public void setSpouseid(final Long spouseid)
			{
				this.spouseid = spouseid;
			}
			
		public String getSpousename()
			{
				return this.spousename;
			}
			
		public void setSpousename(final String spousename)
			{
				this.spousename = spousename;
			}
			
		public Long getGuarantorid()
			{
				return this.guarantorid;
			}
			
		public void setGuarantorid(final Long guarantorid)
			{
				this.guarantorid = guarantorid;
			}
			
		public String getGuarantorname()
			{
				return this.guarantorname;
			}
			
		public void setGuarantorname(final String guarantorname)
			{
				this.guarantorname = guarantorname;
			}
			
		public Long getCustomerid()
			{
				return this.customerid;
			}
			
		public void setCustomerid(final Long customerid)
			{
				this.customerid = customerid;
			}
			
		public Long getAppid()
			{
				return this.appid;
			}
			
		public void setAppid(final Long appid)
			{
				this.appid = appid;
			}
			
		public Long getCurrencyid()
			{
				return this.currencyid;
			}
			
		public void setCurrencyid(final Long currencyid)
			{
				this.currencyid = currencyid;
			}
			
		public Long getMarketingid()
			{
				return this.marketingid;
			}
			
		public void setMarketingid(final Long marketingid)
			{
				this.marketingid = marketingid;
			}
			
		public String getMarketingname()
			{
				return this.marketingname;
			}
			
		public void setMarketingname(final String marketingname)
			{
				this.marketingname = marketingname;
			}
			
	}
