
package com.adibrata.smartdealer.action.customer;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.PersCustFinancialData;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PersCustFinancialDataAction extends BaseAction implements Preparable
	{
		
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		
		private CustomerMaintService customermaintservice;
		private Customer customer;
		private PersCustFinancialData financialdata;
		
		private String mode;
		private String message;
		private String usrUpd;
		private String usrCrt;
		private Long id;
		private Long customerid;
		
		private Double spouseincome;
		private Double avgbalanceaccount;
		private String bankaccounttype;
		private Double averagedebittransaction;
		private Double averagecredittransaction;
		private Double averagebalance;
		private Double deposito;
		private Double livingcostamount;
		private Double otherloaninstallment;
		private String additionalcollateraltype;
		private Double additionalcollateralamount;
		
		public PersCustFinancialDataAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				
				this.customermaintservice = new CustomerDao();
				this.customer = new Customer();
				this.financialdata = new PersCustFinancialData();
				
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
						this.financialdata = new PersCustFinancialData();
						
						this.financialdata.setCustomer(this.getCustomer());
						this.financialdata.setSpouseIncome(this.getSpouseincome());
						this.financialdata.setAvgBalanceAccount(this.getAvgbalanceaccount());
						this.financialdata.setBankAccountType(this.getBankaccounttype());
						this.financialdata.setAverageDebitTransaction(this.getAveragedebittransaction());
						this.financialdata.setAverageCreditTransaction(this.getAveragecredittransaction());
						this.financialdata.setAverageBalance(this.getAveragebalance());
						this.financialdata.setDeposito(this.getDeposito());
						this.financialdata.setLivingCostAmount(this.getLivingcostamount());
						this.financialdata.setOtherLoanInstallment(this.getOtherloaninstallment());
						this.financialdata.setAdditionalCollateralType(this.getAdditionalcollateraltype());
						this.financialdata.setAdditionalCollateralAmount(this.getAdditionalcollateralamount());
						
						this.customermaintservice.SavePersonalCustomer(sesLoginName(), this.financialdata);
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
			
		public PersCustFinancialData getFinancialdata()
			{
				return this.financialdata;
			}
			
		public void setFinancialdata(final PersCustFinancialData financialdata)
			{
				this.financialdata = financialdata;
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
			
		public Double getSpouseincome()
			{
				return this.spouseincome;
			}
			
		public void setSpouseincome(final Double spouseincome)
			{
				this.spouseincome = spouseincome;
			}
			
		public Double getAvgbalanceaccount()
			{
				return this.avgbalanceaccount;
			}
			
		public void setAvgbalanceaccount(final Double avgbalanceaccount)
			{
				this.avgbalanceaccount = avgbalanceaccount;
			}
			
		public String getBankaccounttype()
			{
				return this.bankaccounttype;
			}
			
		public void setBankaccounttype(final String bankaccounttype)
			{
				this.bankaccounttype = bankaccounttype;
			}
			
		public Double getAveragedebittransaction()
			{
				return this.averagedebittransaction;
			}
			
		public void setAveragedebittransaction(final Double averagedebittransaction)
			{
				this.averagedebittransaction = averagedebittransaction;
			}
			
		public Double getAveragecredittransaction()
			{
				return this.averagecredittransaction;
			}
			
		public void setAveragecredittransaction(final Double averagecredittransaction)
			{
				this.averagecredittransaction = averagecredittransaction;
			}
			
		public Double getAveragebalance()
			{
				return this.averagebalance;
			}
			
		public void setAveragebalance(final Double averagebalance)
			{
				this.averagebalance = averagebalance;
			}
			
		public Double getDeposito()
			{
				return this.deposito;
			}
			
		public void setDeposito(final Double deposito)
			{
				this.deposito = deposito;
			}
			
		public Double getLivingcostamount()
			{
				return this.livingcostamount;
			}
			
		public void setLivingcostamount(final Double livingcostamount)
			{
				this.livingcostamount = livingcostamount;
			}
			
		public Double getOtherloaninstallment()
			{
				return this.otherloaninstallment;
			}
			
		public void setOtherloaninstallment(final Double otherloaninstallment)
			{
				this.otherloaninstallment = otherloaninstallment;
			}
			
		public String getAdditionalcollateraltype()
			{
				return this.additionalcollateraltype;
			}
			
		public void setAdditionalcollateraltype(final String additionalcollateraltype)
			{
				this.additionalcollateraltype = additionalcollateraltype;
			}
			
		public Double getAdditionalcollateralamount()
			{
				return this.additionalcollateralamount;
			}
			
		public void setAdditionalcollateralamount(final Double additionalcollateralamount)
			{
				this.additionalcollateralamount = additionalcollateralamount;
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
