
package com.adibrata.smartdealer.action.customer;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.CoyCustFinancialInfo;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class CoyCustFinancialInfoAction extends BaseAction implements Preparable
	{

		/**
		*
		*/
		private static final long serialVersionUID = 1L;

		private CustomerMaintService customermaintservice;
		private Customer customer;
		private CoyCustFinancialInfo financialinfo;

		private String mode;
		private String message;
		
		private long id;
		private long customerid;

		private String rentfinishdate;
		private Double currentratio;
		private Double roi;
		private Double der;
		private double modaldasar;
		private double modaldisetor;
		private double netprofitmargin;
		private String bankaccounttype;
		private double allowanceavailable;
		private Double averagedebittransaction;
		private Double averagecredittransaction;
		private Double averagebalance;
		private Double deposito;
		private String additionalcollateraltype;
		private Double additionalcollateralamount;
		private String companystatus;
		private Short companystatussinceyear;

		public CoyCustFinancialInfoAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				
				this.customermaintservice = new CustomerDao();
				this.customer = new Customer();
				this.financialinfo = new CoyCustFinancialInfo();

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

		public void Save() throws Exception
			{
				try
					{
						this.financialinfo = new CoyCustFinancialInfo();

						this.financialinfo.setCustomer(this.getCustomer());
						this.financialinfo.setRentFinishDate(this.dateformat.parse(this.getRentfinishdate()));
						this.financialinfo.setCurrentRatio(this.getCurrentratio());
						this.financialinfo.setRoi(this.getRoi());
						this.financialinfo.setDer(this.getDer());
						this.financialinfo.setModalDasar(this.getModaldasar());
						this.financialinfo.setModalDisetor(this.getModaldisetor());
						this.financialinfo.setNetProfitMargin(this.getNetprofitmargin());
						this.financialinfo.setBankAccountType(this.getBankaccounttype());
						this.financialinfo.setAllowanceAvailable(this.getAllowanceavailable());
						this.financialinfo.setAverageDebitTransaction(this.getAveragedebittransaction());
						this.financialinfo.setAverageCreditTransaction(this.getAveragecredittransaction());
						this.financialinfo.setAverageBalance(this.getAveragebalance());
						this.financialinfo.setDeposito(this.getDeposito());
						this.financialinfo.setAdditionalCollateralType(this.getAdditionalcollateraltype());
						this.financialinfo.setAdditionalCollateralAmount(this.getAdditionalcollateralamount());
						this.financialinfo.setCompanyStatus(this.getCompanystatus());
						this.financialinfo.setCompanyStatusSinceYear(this.getCompanystatussinceyear());
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

		public CoyCustFinancialInfo getFinancialinfo()
			{
				return this.financialinfo;
			}

		public void setFinancialinfo(final CoyCustFinancialInfo financialinfo)
			{
				this.financialinfo = financialinfo;
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
			
		public long getId()
			{
				return this.id;
			}

		public void setId(final long id)
			{
				this.id = id;
			}

		public String getRentfinishdate()
			{
				return this.rentfinishdate;
			}

		public void setRentfinishdate(final String rentfinishdate)
			{
				this.rentfinishdate = rentfinishdate;
			}

		public Double getCurrentratio()
			{
				return this.currentratio;
			}

		public void setCurrentratio(final Double currentratio)
			{
				this.currentratio = currentratio;
			}

		public Double getRoi()
			{
				return this.roi;
			}

		public void setRoi(final Double roi)
			{
				this.roi = roi;
			}

		public Double getDer()
			{
				return this.der;
			}

		public void setDer(final Double der)
			{
				this.der = der;
			}

		public double getModaldasar()
			{
				return this.modaldasar;
			}

		public void setModaldasar(final double modaldasar)
			{
				this.modaldasar = modaldasar;
			}

		public double getModaldisetor()
			{
				return this.modaldisetor;
			}

		public void setModaldisetor(final double modaldisetor)
			{
				this.modaldisetor = modaldisetor;
			}

		public double getNetprofitmargin()
			{
				return this.netprofitmargin;
			}

		public void setNetprofitmargin(final double netprofitmargin)
			{
				this.netprofitmargin = netprofitmargin;
			}

		public String getBankaccounttype()
			{
				return this.bankaccounttype;
			}

		public void setBankaccounttype(final String bankaccounttype)
			{
				this.bankaccounttype = bankaccounttype;
			}

		public double getAllowanceavailable()
			{
				return this.allowanceavailable;
			}

		public void setAllowanceavailable(final double allowanceavailable)
			{
				this.allowanceavailable = allowanceavailable;
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

		public String getCompanystatus()
			{
				return this.companystatus;
			}

		public void setCompanystatus(final String companystatus)
			{
				this.companystatus = companystatus;
			}

		public Short getCompanystatussinceyear()
			{
				return this.companystatussinceyear;
			}

		public void setCompanystatussinceyear(final Short companystatussinceyear)
			{
				this.companystatussinceyear = companystatussinceyear;
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
