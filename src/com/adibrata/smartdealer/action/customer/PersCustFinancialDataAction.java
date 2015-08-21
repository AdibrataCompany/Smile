
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
		 * @return the financialdata
		 */
		public PersCustFinancialData getFinancialdata()
			{
				return this.financialdata;
			}

		/**
		 * @param financialdata
		 *            the financialdata to set
		 */
		public void setFinancialdata(final PersCustFinancialData financialdata)
			{
				this.financialdata = financialdata;
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
		 * @return the spouseincome
		 */
		public Double getSpouseincome()
			{
				return this.spouseincome;
			}

		/**
		 * @param spouseincome
		 *            the spouseincome to set
		 */
		public void setSpouseincome(final Double spouseincome)
			{
				this.spouseincome = spouseincome;
			}

		/**
		 * @return the avgbalanceaccount
		 */
		public Double getAvgbalanceaccount()
			{
				return this.avgbalanceaccount;
			}

		/**
		 * @param avgbalanceaccount
		 *            the avgbalanceaccount to set
		 */
		public void setAvgbalanceaccount(final Double avgbalanceaccount)
			{
				this.avgbalanceaccount = avgbalanceaccount;
			}

		/**
		 * @return the bankaccounttype
		 */
		public String getBankaccounttype()
			{
				return this.bankaccounttype;
			}

		/**
		 * @param bankaccounttype
		 *            the bankaccounttype to set
		 */
		public void setBankaccounttype(final String bankaccounttype)
			{
				this.bankaccounttype = bankaccounttype;
			}

		/**
		 * @return the averagedebittransaction
		 */
		public Double getAveragedebittransaction()
			{
				return this.averagedebittransaction;
			}

		/**
		 * @param averagedebittransaction
		 *            the averagedebittransaction to set
		 */
		public void setAveragedebittransaction(final Double averagedebittransaction)
			{
				this.averagedebittransaction = averagedebittransaction;
			}

		/**
		 * @return the averagecredittransaction
		 */
		public Double getAveragecredittransaction()
			{
				return this.averagecredittransaction;
			}

		/**
		 * @param averagecredittransaction
		 *            the averagecredittransaction to set
		 */
		public void setAveragecredittransaction(final Double averagecredittransaction)
			{
				this.averagecredittransaction = averagecredittransaction;
			}

		/**
		 * @return the averagebalance
		 */
		public Double getAveragebalance()
			{
				return this.averagebalance;
			}

		/**
		 * @param averagebalance
		 *            the averagebalance to set
		 */
		public void setAveragebalance(final Double averagebalance)
			{
				this.averagebalance = averagebalance;
			}

		/**
		 * @return the deposito
		 */
		public Double getDeposito()
			{
				return this.deposito;
			}

		/**
		 * @param deposito
		 *            the deposito to set
		 */
		public void setDeposito(final Double deposito)
			{
				this.deposito = deposito;
			}

		/**
		 * @return the livingcostamount
		 */
		public Double getLivingcostamount()
			{
				return this.livingcostamount;
			}

		/**
		 * @param livingcostamount
		 *            the livingcostamount to set
		 */
		public void setLivingcostamount(final Double livingcostamount)
			{
				this.livingcostamount = livingcostamount;
			}

		/**
		 * @return the otherloaninstallment
		 */
		public Double getOtherloaninstallment()
			{
				return this.otherloaninstallment;
			}

		/**
		 * @param otherloaninstallment
		 *            the otherloaninstallment to set
		 */
		public void setOtherloaninstallment(final Double otherloaninstallment)
			{
				this.otherloaninstallment = otherloaninstallment;
			}

		/**
		 * @return the additionalcollateraltype
		 */
		public String getAdditionalcollateraltype()
			{
				return this.additionalcollateraltype;
			}

		/**
		 * @param additionalcollateraltype
		 *            the additionalcollateraltype to set
		 */
		public void setAdditionalcollateraltype(final String additionalcollateraltype)
			{
				this.additionalcollateraltype = additionalcollateraltype;
			}

		/**
		 * @return the additionalcollateralamount
		 */
		public Double getAdditionalcollateralamount()
			{
				return this.additionalcollateralamount;
			}

		/**
		 * @param additionalcollateralamount
		 *            the additionalcollateralamount to set
		 */
		public void setAdditionalcollateralamount(final Double additionalcollateralamount)
			{
				this.additionalcollateralamount = additionalcollateralamount;
			}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
	}
