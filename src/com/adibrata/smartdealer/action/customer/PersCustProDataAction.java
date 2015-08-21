
package com.adibrata.smartdealer.action.customer;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.PersCustEntInfo;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PersCustProDataAction extends BaseAction implements Preparable
	{

		/**
		*
		*/
		private static final long serialVersionUID = 1L;

		private CustomerMaintService customermaintservice;
		private Customer customer;
		private PersCustEntInfo entinfo;

		private String mode;
		private String message;
		private String usrUpd;
		private String usrCrt;
		private long id;
		private long customerid;

		private Double monthlyfixedincome;
		private Double monthlyvariableincome;
		private Double fixedincome;
		private Double variableincome;

		public PersCustProDataAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				RenderMenu();

				this.customermaintservice = new CustomerDao();
				this.customer = new Customer();
				this.entinfo = new PersCustEntInfo();

				this.customerid = this.customer.getId();
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
											this.Save();
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

		public void Save() throws Exception
			{
				try
					{
						this.entinfo = new PersCustEntInfo();

						this.entinfo.setCustomer(this.getCustomer());
						this.entinfo.setMonthlyFixedIncome(this.getMonthlyfixedincome());
						this.entinfo.setMonthlyVariableIncome(this.getMonthlyvariableincome());
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

		public PersCustEntInfo getEntinfo()
			{
				return this.entinfo;
			}

		public void setEntinfo(final PersCustEntInfo entinfo)
			{
				this.entinfo = entinfo;
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

	}
