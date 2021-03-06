
package com.adibrata.smartdealer.action.cashtransaction.advancetransaction.advancerequest;

import java.util.HashMap;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.cashtransactions.AdvanceCashDao;
import com.adibrata.smartdealer.model.AdvanceCash;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.BankAccountInfo;
import com.adibrata.smartdealer.model.Currency;
import com.adibrata.smartdealer.model.Employee;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.cashtransactions.AdvanceCashService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AdvanceRequestAction extends BaseAction implements Preparable
	{
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String mode;
		private AdvanceCashService service;
		private Partner partner;
		private Office office;
		private AdvanceCash advanceCash;
		private BankAccount bankaccount;
		private Map<Long, String> lstemployee;
		private Currency currency;
		private Employee employee;
		private Long employeeid;
		private String employeename;
		private Long bankaccountid;
		private String bankaccountname;
		private String postingdate;
		private String valuedate;
		private Double amount;
		private String message;
		private String notes;
		private Long currencyid;
		private String currencycode;
		
		public AdvanceRequestAction() throws Exception
			{
				try
					{
						// TODO Auto-generated constructor stub
						this.office = new Office();
						this.office.setId(BaseAction.sesOfficeId());
						this.partner = new Partner();
						this.partner.setPartnerCode(BaseAction.sesPartnerCode());

						this.lstemployee = new HashMap<Long, String>();
						this.lstemployee = this.ListEmployee(this.getPartner(), this.getOffice());
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				finally
					{
					
					}
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
											
											strMode = this.SaveSuspend();
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
						strMode = "input";
						try
							{
								this.InitiallInput();
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				return strMode;
			}
			
		private void InitiallInput() throws Exception
			{
				try
					{
						this.setAmount(0.00);
						this.setValuedate(this.dateformat.format(BaseAction.sesBussinessDate()));
						this.setNotes("");
						if (this.getBankaccountid() != null)
							{
								// this.bankaccount = this.bankaccountservice.View(this.getBankAccountId());
								// this.bankaccountname = this.bankaccount.getBankAccountName();
								BankAccountInfo info = new BankAccountInfo();
								info = this.BankInfo(this.getBankaccountid());
								this.bankaccountname = info.getName();
								this.currencycode = info.getCurrency();
								this.currencyid = info.getCurrencyid();
							}

					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				finally
					{

					}
			}

		private String SaveSuspend() throws Exception
			{

				this.advanceCash = new AdvanceCash();
				try
					{
						this.bankaccount = new BankAccount();
						this.currency = new Currency();
						this.employee = new Employee();

						this.bankaccount.setId(this.getBankaccountid());
						this.currency.setId(this.getCurrencyid());
						this.employee.setId(this.getEmployeeid());
						
						this.advanceCash.setAdvanceAmount(this.getAmount());

						this.advanceCash.setBankAccount(this.bankaccount);
						this.advanceCash.setEmployee(this.employee);
						this.advanceCash.setCurrency(this.currency);

						this.advanceCash.setValueDate(this.dateformat.parse(this.getValuedate()));
						this.advanceCash.setPostingDate(BaseAction.sesBussinessDate());
						this.advanceCash.setPartner(this.getPartner());
						this.advanceCash.setOffice(this.getOffice());
						this.advanceCash.setCurrencyRate(1.00);
						this.advanceCash.setNotes(this.getNotes());
						this.advanceCash.setUsrUpd(BaseAction.sesLoginName());
						this.advanceCash.setUsrCrt(BaseAction.sesLoginName());
						this.service = new AdvanceCashDao();
						this.service.Save(BaseAction.sesLoginName(), this.advanceCash);
						this.mode = SUCCESS;
						this.InitiallInput();
						this.setMessage(SuccessMessage());
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
				finally
					{
					
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
		 * @return the service
		 */
		public AdvanceCashService getService()
			{
				return this.service;
			}
			
		/**
		 * @param service
		 *            the service to set
		 */
		public void setService(final AdvanceCashService service)
			{
				this.service = service;
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
			
		/**
		 * @return the advanceCash
		 */
		public AdvanceCash getAdvanceCash()
			{
				return this.advanceCash;
			}
			
		/**
		 * @param advanceCash
		 *            the advanceCash to set
		 */
		public void setAdvanceCash(final AdvanceCash advanceCash)
			{
				this.advanceCash = advanceCash;
			}
			
		/**
		 * @return the lstemployee
		 */
		public Map<Long, String> getLstemployee()
			{
				return this.lstemployee;
			}
			
		/**
		 * @param lstemployee
		 *            the lstemployee to set
		 */
		public void setLstemployee(final Map<Long, String> lstemployee)
			{
				this.lstemployee = lstemployee;
			}
			
		/**
		 * @return the currency
		 */
		public Currency getCurrency()
			{
				return this.currency;
			}
			
		/**
		 * @param currency
		 *            the currency to set
		 */
		public void setCurrency(final Currency currency)
			{
				this.currency = currency;
			}
			
		/**
		 * @return the employee
		 */
		public Employee getEmployee()
			{
				return this.employee;
			}
			
		/**
		 * @param employee
		 *            the employee to set
		 */
		public void setEmployee(final Employee employee)
			{
				this.employee = employee;
			}
			
		/**
		 * @return the employeeid
		 */
		public Long getEmployeeid()
			{
				return this.employeeid;
			}
			
		/**
		 * @param employeeid
		 *            the employeeid to set
		 */
		public void setEmployeeid(final Long employeeid)
			{
				this.employeeid = employeeid;
			}
			
		/**
		 * @return the employeename
		 */
		public String getEmployeename()
			{
				return this.employeename;
			}
			
		/**
		 * @param employeename
		 *            the employeename to set
		 */
		public void setEmployeename(final String employeename)
			{
				this.employeename = employeename;
			}
			
		/**
		 * @return the bankaccountid
		 */
		public Long getBankaccountid()
			{
				return this.bankaccountid;
			}
			
		/**
		 * @param bankaccountid
		 *            the bankaccountid to set
		 */
		public void setBankaccountid(final Long bankaccountid)
			{
				this.bankaccountid = bankaccountid;
			}
			
		/**
		 * @return the bankaccountname
		 */
		public String getBankaccountname()
			{
				return this.bankaccountname;
			}
			
		/**
		 * @param bankaccountname
		 *            the bankaccountname to set
		 */
		public void setBankaccountname(final String bankaccountname)
			{
				this.bankaccountname = bankaccountname;
			}
			
		/**
		 * @return the postingdate
		 */
		public String getPostingdate()
			{
				return this.postingdate;
			}
			
		/**
		 * @param postingdate
		 *            the postingdate to set
		 */
		public void setPostingdate(final String postingdate)
			{
				this.postingdate = postingdate;
			}
			
		/**
		 * @return the valuedate
		 */
		public String getValuedate()
			{
				return this.valuedate;
			}
			
		/**
		 * @param valuedate
		 *            the valuedate to set
		 */
		public void setValuedate(final String valuedate)
			{
				this.valuedate = valuedate;
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
		 * @return the currencycode
		 */
		public String getCurrencycode()
			{
				return this.currencycode;
			}
			
		/**
		 * @param currencycode
		 *            the currencycode to set
		 */
		public void setCurrencycode(final String currencycode)
			{
				this.currencycode = currencycode;
			}
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
		/**
		 * @return the currencyid
		 */
		public Long getCurrencyid()
			{
				return this.currencyid;
			}
			
		/**
		 * @param currencyid
		 *            the currencyid to set
		 */
		public void setCurrencyid(final Long currencyid)
			{
				this.currencyid = currencyid;
			}
			
		/**
		 * @return the bankaccount
		 */
		public BankAccount getBankaccount()
			{
				return this.bankaccount;
			}
			
		/**
		 * @param bankaccount
		 *            the bankaccount to set
		 */
		public void setBankaccount(final BankAccount bankaccount)
			{
				this.bankaccount = bankaccount;
			}
			
	}
