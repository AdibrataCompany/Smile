
package com.adibrata.smartdealer.action.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.PersCustEntInfo;
import com.adibrata.smartdealer.model.PersCustJobInfo;
import com.adibrata.smartdealer.model.PersCustOmsetInfo;
import com.adibrata.smartdealer.model.PersCustOtherBussinessInfo;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PersCustJobDataAction extends BaseAction implements Preparable
	{
		
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		
		private CustomerMaintService customermaintservice;
		private Customer customer;
		private PersCustJobInfo jobinfo;
		private PersCustEntInfo entinfo;
		private PersCustOtherBussinessInfo otherbussinessinfo;
		private Map<String, Object> session;
		private List<PersCustOmsetInfo> lstomsetinfo;
		
		private String mode;
		private String message;
		private String usrUpd;
		private String usrCrt;
		private long id;
		private long customerid;
		
		private String jobtypecode;
		private String jobposition;
		private String companyname;
		private String industrytypeid;
		private String jobtitle;
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
		private Short employmentsinceyear;
		
		private Double monthlyfixedincome;
		private Double monthlyvariableincome;
		private Double fixedincome;
		private Double variableincome;
		
		private Integer year;
		private Integer month;
		private Double amount;
		private int seqno;
		
		private String businessname;
		private String businesstype;
		private String businessindustrytypeid;
		private String businessjobtitle;
		private Short businesssinceyear;
		
		public PersCustJobDataAction() throws Exception
			{
				// TODO Auto-generated constructor stub

				this.customermaintservice = new CustomerDao();
				this.customer = new Customer();
				this.jobinfo = new PersCustJobInfo();
				this.entinfo = new PersCustEntInfo();
				this.otherbussinessinfo = new PersCustOtherBussinessInfo();
				this.lstomsetinfo = new ArrayList<PersCustOmsetInfo>();
				
				this.customer.setId(this.getCustomerid());
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public void prepare() throws Exception
			{
				try
					{
						// TODO Auto-generated method stub
						this.session = ActionContext.getContext().getSession();
						if (this.session.get("lstOmsetInfoSession") != null)
							{
								this.lstomsetinfo = (List<PersCustOmsetInfo>) this.session.get("lstOmsetInfoSession");
							}
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
								case "add" :
									try
										{
											this.Add();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "del" :
									try
										{
											this.Del();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "save" :
									try
										{
											this.SaveJobInfo();
											this.SaveEntInfo();
											this.SaveOtherBussinessInfo();
											this.SaveOmsetInfo();
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
			
		public void Add() throws Exception
			{
				try
					{
						final PersCustOmsetInfo omsetinfo = new PersCustOmsetInfo();
						
						omsetinfo.setYear(this.getYear());
						omsetinfo.setMonth(this.getMonth());
						omsetinfo.setAmount(this.getAmount());
						
						this.lstomsetinfo.add(omsetinfo);
						this.session.put("lstOmsetInfoSession", this.lstomsetinfo);
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
			
		@SuppressWarnings("unchecked")
		public void Del() throws Exception
			{
				try
					{
						this.lstomsetinfo = (List<PersCustOmsetInfo>) this.session.get("lstOmsetInfoSession");
						this.seqno = this.seqno - 1;
						this.lstomsetinfo.remove(this.seqno);
						
						this.session.put("lstOmsetInfoSession", this.lstomsetinfo);
						this.lstomsetinfo = (List<PersCustOmsetInfo>) this.session.get("lstOmsetInfoSession");
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
			
		public void SaveEntInfo() throws Exception
			{
				try
					{
						this.entinfo = new PersCustEntInfo();
						
						this.entinfo.setCustomer(this.getCustomer());
						this.entinfo.setCustomer(this.getCustomer());
						this.entinfo.setMonthlyFixedIncome(this.getMonthlyfixedincome());
						this.entinfo.setFixedIncome(this.getFixedincome());
						this.entinfo.setVariableIncome(this.getVariableincome());
						
						this.customermaintservice.SavePersonalCustomer(sesLoginName(), this.entinfo);
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
			
		public void SaveOtherBussinessInfo() throws Exception
			{
				try
					{
						this.otherbussinessinfo = new PersCustOtherBussinessInfo();
						
						this.otherbussinessinfo.setCustomer(this.getCustomer());
						this.otherbussinessinfo.setBusinessName(this.getBusinessname());
						this.otherbussinessinfo.setBusinessType(this.getBusinesstype());
						this.otherbussinessinfo.setBusinessIndustryTypeId(this.getBusinessindustrytypeid());
						this.otherbussinessinfo.setBusinessJobTitle(this.getBusinessjobtitle());
						this.otherbussinessinfo.setBusinessSinceYear(this.getBusinesssinceyear());
						
						this.customermaintservice.SavePersonalCustomer(sesLoginName(), this.otherbussinessinfo);
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
			
		private void SaveOmsetInfo() throws Exception
			{
				try
					{
						for (final PersCustOmsetInfo omsetinfo : this.lstomsetinfo)
							{
								omsetinfo.setCustomer(this.getCustomer());
								omsetinfo.setYear(this.getYear());
								omsetinfo.setMonth(this.getMonth());
								omsetinfo.setAmount(this.getAmount());
							}
							
						this.customermaintservice.SavePersonalCustomerOmset(sesLoginName(), this.lstomsetinfo);
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
			
		public void SaveJobInfo() throws Exception
			{
				try
					{
						this.jobinfo = new PersCustJobInfo();
						
						this.jobinfo.setCustomer(this.getCustomer());
						this.jobinfo.setJobTypeCode(this.getJobtypecode());
						this.jobinfo.setJobPosition(this.getJobposition());
						this.jobinfo.setCompanyName(this.getCompanyname());
						this.jobinfo.setIndustryTypeId(this.getIndustrytypeid());
						this.jobinfo.setJobTitle(this.getJobtitle());
						this.jobinfo.setAddress(this.getAddress());
						this.jobinfo.setRt(this.getRt());
						this.jobinfo.setRw(this.getRw());
						this.jobinfo.setKelurahan(this.getKelurahan());
						this.jobinfo.setKecamatan(this.getKecamatan());
						this.jobinfo.setCity(this.getCity());
						this.jobinfo.setZipcode(this.getZipcode());
						this.jobinfo.setAreaPhone1(this.getAreaphone1());
						this.jobinfo.setPhoneNo1(this.getPhoneno1());
						this.jobinfo.setAreaPhone2(this.getAreaphone2());
						this.jobinfo.setPhoneNo2(this.getPhoneno2());
						this.jobinfo.setAreaFax(this.getAreafax());
						this.jobinfo.setFaxNo(this.getFaxno());
						this.jobinfo.setHandphone(this.getHandphone());
						this.jobinfo.setEmploymentSinceYear(this.getEmploymentsinceyear());
						
						this.customermaintservice.SavePersonalCustomer(sesLoginName(), this.jobinfo);
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
			
		public PersCustJobInfo getJobinfo()
			{
				return this.jobinfo;
			}
			
		public void setJobinfo(final PersCustJobInfo jobinfo)
			{
				this.jobinfo = jobinfo;
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
			
		public String getJobtypecode()
			{
				return this.jobtypecode;
			}
			
		public void setJobtypecode(final String jobtypecode)
			{
				this.jobtypecode = jobtypecode;
			}
			
		public String getJobposition()
			{
				return this.jobposition;
			}
			
		public void setJobposition(final String jobposition)
			{
				this.jobposition = jobposition;
			}
			
		public String getCompanyname()
			{
				return this.companyname;
			}
			
		public void setCompanyname(final String companyname)
			{
				this.companyname = companyname;
			}
			
		public String getIndustrytypeid()
			{
				return this.industrytypeid;
			}
			
		public void setIndustrytypeid(final String industrytypeid)
			{
				this.industrytypeid = industrytypeid;
			}
			
		public String getJobtitle()
			{
				return this.jobtitle;
			}
			
		public void setJobtitle(final String jobtitle)
			{
				this.jobtitle = jobtitle;
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
			
		public Short getEmploymentsinceyear()
			{
				return this.employmentsinceyear;
			}
			
		public void setEmploymentsinceyear(final Short employmentsinceyear)
			{
				this.employmentsinceyear = employmentsinceyear;
			}
			
		public PersCustEntInfo getEntinfo()
			{
				return this.entinfo;
			}
			
		public void setEntinfo(final PersCustEntInfo entinfo)
			{
				this.entinfo = entinfo;
			}
			
		public PersCustOtherBussinessInfo getOtherbussinessinfo()
			{
				return this.otherbussinessinfo;
			}
			
		public void setOtherbussinessinfo(final PersCustOtherBussinessInfo otherbussinessinfo)
			{
				this.otherbussinessinfo = otherbussinessinfo;
			}
			
		public Map<String, Object> getSession()
			{
				return this.session;
			}
			
		public void setSession(final Map<String, Object> session)
			{
				this.session = session;
			}
			
		public List<PersCustOmsetInfo> getLstomsetinfo()
			{
				return this.lstomsetinfo;
			}
			
		public void setLstomsetinfo(final List<PersCustOmsetInfo> lstomsetinfo)
			{
				this.lstomsetinfo = lstomsetinfo;
			}
			
		public long getCustomerid()
			{
				return this.customerid;
			}
			
		public void setCustomerid(final long customerid)
			{
				this.customerid = customerid;
			}
			
		public Double getMonthlyfixedincome()
			{
				return this.monthlyfixedincome;
			}
			
		public void setMonthlyfixedincome(final Double monthlyfixedincome)
			{
				this.monthlyfixedincome = monthlyfixedincome;
			}
			
		public Double getMonthlyvariableincome()
			{
				return this.monthlyvariableincome;
			}
			
		public void setMonthlyvariableincome(final Double monthlyvariableincome)
			{
				this.monthlyvariableincome = monthlyvariableincome;
			}
			
		public Double getFixedincome()
			{
				return this.fixedincome;
			}
			
		public void setFixedincome(final Double fixedincome)
			{
				this.fixedincome = fixedincome;
			}
			
		public Double getVariableincome()
			{
				return this.variableincome;
			}
			
		public void setVariableincome(final Double variableincome)
			{
				this.variableincome = variableincome;
			}
			
		public Integer getYear()
			{
				return this.year;
			}
			
		public void setYear(final Integer year)
			{
				this.year = year;
			}
			
		public Integer getMonth()
			{
				return this.month;
			}
			
		public void setMonth(final Integer month)
			{
				this.month = month;
			}
			
		public Double getAmount()
			{
				return this.amount;
			}
			
		public void setAmount(final Double amount)
			{
				this.amount = amount;
			}
			
		public int getSeqno()
			{
				return this.seqno;
			}
			
		public void setSeqno(final int seqno)
			{
				this.seqno = seqno;
			}
			
		public String getBusinessname()
			{
				return this.businessname;
			}
			
		public void setBusinessname(final String businessname)
			{
				this.businessname = businessname;
			}
			
		public String getBusinesstype()
			{
				return this.businesstype;
			}
			
		public void setBusinesstype(final String businesstype)
			{
				this.businesstype = businesstype;
			}
			
		public String getBusinessindustrytypeid()
			{
				return this.businessindustrytypeid;
			}
			
		public void setBusinessindustrytypeid(final String businessindustrytypeid)
			{
				this.businessindustrytypeid = businessindustrytypeid;
			}
			
		public String getBusinessjobtitle()
			{
				return this.businessjobtitle;
			}
			
		public void setBusinessjobtitle(final String businessjobtitle)
			{
				this.businessjobtitle = businessjobtitle;
			}
			
		public Short getBusinesssinceyear()
			{
				return this.businesssinceyear;
			}
			
		public void setBusinesssinceyear(final Short businesssinceyear)
			{
				this.businesssinceyear = businesssinceyear;
			}
			
	}
