
package com.adibrata.smartdealer.action.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.PersCustEntInfo;
import com.adibrata.smartdealer.model.PersCustOmsetInfo;
import com.adibrata.smartdealer.model.PersCustOtherBussinessInfo;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PersCustEntDataAction extends BaseAction implements Preparable
	{
		
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		
		private CustomerMaintService customermaintservice;
		private Customer customer;
		private PersCustEntInfo entinfo;
		private PersCustOtherBussinessInfo otherbussinessinfo;
		private Map<String, Object> session;
		private List<PersCustOmsetInfo> lstomsetinfo;
		
		private String mode;
		private String message;
		
		private Long id;
		private Long customerid;
		
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
		
		public PersCustEntDataAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				
				this.customermaintservice = new CustomerDao();
				this.customer = new Customer();
				this.entinfo = new PersCustEntInfo();
				this.otherbussinessinfo = new PersCustOtherBussinessInfo();
				this.lstomsetinfo = new ArrayList<PersCustOmsetInfo>();
				
				this.customerid = this.customer.getId();
				this.seqno = 1;
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
		 * @return the entinfo
		 */
		public PersCustEntInfo getEntinfo()
			{
				return this.entinfo;
			}

		/**
		 * @param entinfo
		 *            the entinfo to set
		 */
		public void setEntinfo(final PersCustEntInfo entinfo)
			{
				this.entinfo = entinfo;
			}

		/**
		 * @return the otherbussinessinfo
		 */
		public PersCustOtherBussinessInfo getOtherbussinessinfo()
			{
				return this.otherbussinessinfo;
			}

		/**
		 * @param otherbussinessinfo
		 *            the otherbussinessinfo to set
		 */
		public void setOtherbussinessinfo(final PersCustOtherBussinessInfo otherbussinessinfo)
			{
				this.otherbussinessinfo = otherbussinessinfo;
			}

		/**
		 * @return the session
		 */
		public Map<String, Object> getSession()
			{
				return this.session;
			}

		/**
		 * @param session
		 *            the session to set
		 */
		public void setSession(final Map<String, Object> session)
			{
				this.session = session;
			}

		/**
		 * @return the lstomsetinfo
		 */
		public List<PersCustOmsetInfo> getLstomsetinfo()
			{
				return this.lstomsetinfo;
			}

		/**
		 * @param lstomsetinfo
		 *            the lstomsetinfo to set
		 */
		public void setLstomsetinfo(final List<PersCustOmsetInfo> lstomsetinfo)
			{
				this.lstomsetinfo = lstomsetinfo;
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
		 * @return the monthlyfixedincome
		 */
		public Double getMonthlyfixedincome()
			{
				return this.monthlyfixedincome;
			}

		/**
		 * @param monthlyfixedincome
		 *            the monthlyfixedincome to set
		 */
		public void setMonthlyfixedincome(final Double monthlyfixedincome)
			{
				this.monthlyfixedincome = monthlyfixedincome;
			}

		/**
		 * @return the monthlyvariableincome
		 */
		public Double getMonthlyvariableincome()
			{
				return this.monthlyvariableincome;
			}

		/**
		 * @param monthlyvariableincome
		 *            the monthlyvariableincome to set
		 */
		public void setMonthlyvariableincome(final Double monthlyvariableincome)
			{
				this.monthlyvariableincome = monthlyvariableincome;
			}

		/**
		 * @return the fixedincome
		 */
		public Double getFixedincome()
			{
				return this.fixedincome;
			}

		/**
		 * @param fixedincome
		 *            the fixedincome to set
		 */
		public void setFixedincome(final Double fixedincome)
			{
				this.fixedincome = fixedincome;
			}

		/**
		 * @return the variableincome
		 */
		public Double getVariableincome()
			{
				return this.variableincome;
			}

		/**
		 * @param variableincome
		 *            the variableincome to set
		 */
		public void setVariableincome(final Double variableincome)
			{
				this.variableincome = variableincome;
			}

		/**
		 * @return the year
		 */
		public Integer getYear()
			{
				return this.year;
			}

		/**
		 * @param year
		 *            the year to set
		 */
		public void setYear(final Integer year)
			{
				this.year = year;
			}

		/**
		 * @return the month
		 */
		public Integer getMonth()
			{
				return this.month;
			}

		/**
		 * @param month
		 *            the month to set
		 */
		public void setMonth(final Integer month)
			{
				this.month = month;
			}

		/**
		 * @return the amount
		 */
		public Double getAmount()
			{
				return this.amount;
			}

		/**
		 * @param amount
		 *            the amount to set
		 */
		public void setAmount(final Double amount)
			{
				this.amount = amount;
			}

		/**
		 * @return the seqno
		 */
		public int getSeqno()
			{
				return this.seqno;
			}

		/**
		 * @param seqno
		 *            the seqno to set
		 */
		public void setSeqno(final int seqno)
			{
				this.seqno = seqno;
			}

		/**
		 * @return the businessname
		 */
		public String getBusinessname()
			{
				return this.businessname;
			}

		/**
		 * @param businessname
		 *            the businessname to set
		 */
		public void setBusinessname(final String businessname)
			{
				this.businessname = businessname;
			}

		/**
		 * @return the businesstype
		 */
		public String getBusinesstype()
			{
				return this.businesstype;
			}

		/**
		 * @param businesstype
		 *            the businesstype to set
		 */
		public void setBusinesstype(final String businesstype)
			{
				this.businesstype = businesstype;
			}

		/**
		 * @return the businessindustrytypeid
		 */
		public String getBusinessindustrytypeid()
			{
				return this.businessindustrytypeid;
			}

		/**
		 * @param businessindustrytypeid
		 *            the businessindustrytypeid to set
		 */
		public void setBusinessindustrytypeid(final String businessindustrytypeid)
			{
				this.businessindustrytypeid = businessindustrytypeid;
			}

		/**
		 * @return the businessjobtitle
		 */
		public String getBusinessjobtitle()
			{
				return this.businessjobtitle;
			}

		/**
		 * @param businessjobtitle
		 *            the businessjobtitle to set
		 */
		public void setBusinessjobtitle(final String businessjobtitle)
			{
				this.businessjobtitle = businessjobtitle;
			}

		/**
		 * @return the businesssinceyear
		 */
		public Short getBusinesssinceyear()
			{
				return this.businesssinceyear;
			}

		/**
		 * @param businesssinceyear
		 *            the businesssinceyear to set
		 */
		public void setBusinesssinceyear(final Short businesssinceyear)
			{
				this.businesssinceyear = businesssinceyear;
			}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

	}
