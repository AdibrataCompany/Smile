
package com.adibrata.smartdealer.action.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.PersCustCcinfo;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PersCustCcinfoAction extends BaseAction implements Preparable
	{

		/**
		*
		*/
		private static final long serialVersionUID = 1L;

		private CustomerMaintService customermaintservice;
		private Customer customer;
		private Map<String, Object> session;
		private List<PersCustCcinfo> lstccinfo;

		private String mode;
		private String message;
		private String usrUpd;
		private String usrCrt;
		private static final long serialVersionUID = 1L; private long id;
		private long customerid;

		private String creditcardno;
		private String creditcardname;
		private String creditcardtype;
		private short creditcardperiodyears;
		private short creditcardperiodmonths;
		private Double creditcardcreditlimit;
		private int seqno;

		public PersCustCcinfoAction() throws Exception
			{
				try
					{
						// TODO Auto-generated constructor stub
						RenderMenu();

						this.customermaintservice = new CustomerDao();
						this.customer = new Customer();
						this.lstccinfo = new ArrayList<PersCustCcinfo>();

						this.customerid = this.customer.getId();
						this.seqno = 1;
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
		@Override
		public void prepare() throws Exception
			{
				try
					{
						// TODO Auto-generated method stub
						this.session = ActionContext.getContext().getSession();
						if (this.session.get("lstCreditCardSession") != null)
							{
								this.lstccinfo = (List<PersCustCcinfo>) this.session.get("lstCreditCardSession");
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

		public void Add() throws Exception
			{
				try
					{
						final PersCustCcinfo ccinfo = new PersCustCcinfo();

						ccinfo.setCreditCardNo(this.getCreditcardno());
						ccinfo.setCreditCardName(this.getCreditcardname());
						ccinfo.setCreditCardType(this.getCreditcardtype());
						ccinfo.setCreditCardPeriodYears(this.getCreditcardperiodyears());
						ccinfo.setCreditCardPeriodMonths(this.getCreditcardperiodmonths());
						ccinfo.setCreditCardCreditLimit(this.getCreditcardcreditlimit());

						this.lstccinfo.add(ccinfo);
						this.session.put("lstCreditCardSession", this.lstccinfo);
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
						this.lstccinfo = (List<PersCustCcinfo>) this.session.get("lstCreditCardSession");
						this.seqno = this.seqno - 1;
						this.lstccinfo.remove(this.seqno);

						this.session.put("lstCreditCardSession", this.lstccinfo);
						this.lstccinfo = (List<PersCustCcinfo>) this.session.get("lstCreditCardSession");
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

		public void Save() throws Exception
			{
				try
					{
						for (final PersCustCcinfo ccinfo : this.lstccinfo)
							{
								ccinfo.setCustomer(this.getCustomer());
								ccinfo.setCreditCardNo(this.getCreditcardno());
								ccinfo.setCreditCardName(this.getCreditcardname());
								ccinfo.setCreditCardType(this.getCreditcardtype());
								ccinfo.setCreditCardPeriodYears(this.getCreditcardperiodyears());
								ccinfo.setCreditCardPeriodMonths(this.getCreditcardperiodmonths());
								ccinfo.setCreditCardCreditLimit(this.getCreditcardcreditlimit());
							}

						this.customermaintservice.SavePersonalCustomerCreditCard(sesLoginName(), this.lstccinfo);
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

		public long getId()
			{
				return this.id;
			}

		public void setId(final long id)
			{
				this.id = id;
			}

		public String getCreditcardno()
			{
				return this.creditcardno;
			}

		public void setCreditcardno(final String creditcardno)
			{
				this.creditcardno = creditcardno;
			}

		public String getCreditcardname()
			{
				return this.creditcardname;
			}

		public void setCreditcardname(final String creditcardname)
			{
				this.creditcardname = creditcardname;
			}

		public String getCreditcardtype()
			{
				return this.creditcardtype;
			}

		public void setCreditcardtype(final String creditcardtype)
			{
				this.creditcardtype = creditcardtype;
			}

		public short getCreditcardperiodyears()
			{
				return this.creditcardperiodyears;
			}

		public void setCreditcardperiodyears(final short creditcardperiodyears)
			{
				this.creditcardperiodyears = creditcardperiodyears;
			}

		public short getCreditcardperiodmonths()
			{
				return this.creditcardperiodmonths;
			}

		public void setCreditcardperiodmonths(final short creditcardperiodmonths)
			{
				this.creditcardperiodmonths = creditcardperiodmonths;
			}

		public Double getCreditcardcreditlimit()
			{
				return this.creditcardcreditlimit;
			}

		public void setCreditcardcreditlimit(final Double creditcardcreditlimit)
			{
				this.creditcardcreditlimit = creditcardcreditlimit;
			}

		public Map<String, Object> getSession()
			{
				return this.session;
			}

		public void setSession(final Map<String, Object> session)
			{
				this.session = session;
			}

		public int getSeqno()
			{
				return this.seqno;
			}

		public void setSeqno(final int seqno)
			{
				this.seqno = seqno;
			}

		public List<PersCustCcinfo> getLstccinfo()
			{
				return this.lstccinfo;
			}

		public void setLstccinfo(final List<PersCustCcinfo> lstccinfo)
			{
				this.lstccinfo = lstccinfo;
			}

		public long getCustomerid()
			{
				return this.customerid;
			}

		public void setCustomerid(final long customerid)
			{
				this.customerid = customerid;
			}

	}
