
package com.adibrata.smartdealer.action.cashtransaction.pettycash.transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.cashtransactions.PettyCashDao;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.Employee;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PettyCashDtl;
import com.adibrata.smartdealer.model.PettyCashHdr;
import com.adibrata.smartdealer.service.cashtransactions.PettyCashService;
import com.adibrata.smartdealer.service.setting.BankAccountService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PettyCashTransactionAction extends BaseAction implements Preparable
	{
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private Long id;
		private String mode;
		private Office office;
		private Partner partner;
		private PettyCashService pettCashService;
		private BankAccount bankaccount;
		private Employee employee;
		private String searchcriteria;
		private String searchvalue;

		private Map<String, Object> dtl;
		private List<PettyCashDtl> lstdtl;

		private List<BankAccount> lstbankaccount;
		private Map<Long, String> lstemployee;

		private int pageNumber;

		private String message;
		private Long bankaccountid;
		private String notes;
		private Double amount;
		private String valuedate;
		private Long employeeid;
		private Double currencyrate;
		private Long currencyid;
		private final PettyCashService service;
		private Double amountdetail;
		private String descdetail;
		private String coacode;
		private String coaname;
		private Double totalamount;
		private int seqno;
		private String bankaccountname;

		private List<BankAccount> lstBankAccount;
		private BankAccountService bankaccountservice;

		public PettyCashTransactionAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.office = new Office();
				this.office.setId(BaseAction.sesOfficeId());
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.lstemployee = new HashMap<Long, String>();
				this.lstemployee = this.ListEmployee(this.partner, this.office);

				this.lstdtl = new ArrayList<PettyCashDtl>();
				this.service = new PettyCashDao();

				this.employee = new Employee();
				this.bankaccount = new BankAccount();

			}

		@SuppressWarnings("unchecked")
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				try
					{
						this.dtl = ActionContext.getContext().getSession();
						if (this.dtl.get("dtl") != null)
							{
								this.lstdtl = (List<PettyCashDtl>) this.dtl.get("dtl");
							}

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
									strMode = this.SavePettyCash();
									break;
								case "adddetail" :
									strMode = this.AddDetail();
									break;

								case "deldetail" :
									strMode = this.DeleteDetail();
									break;
								case "first" :
									this.pageNumber = 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "prev" :
									this.pageNumber -= 1;
									if (this.pageNumber <= 1)
										{
											this.pageNumber = 1;
										}
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "next" :
									this.pageNumber += 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "last" :
									try
										{
											this.Paging(1);
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								default :
									return "failed";

							}
					}
				else
					{
						strMode = "start";
					}
				return strMode;
			}

		private String AddDetail() throws Exception
			{
				final String status = this.mode;
				try
					{
						if ((this.totalamount + this.amountdetail) > this.amount)
							{
								this.message = "Amount Detail > Petty Cash Amount";
							}
						else
							{
								final PettyCashDtl pettycashdtl = new PettyCashDtl();
								pettycashdtl.setAmount(this.amountdetail);
								pettycashdtl.setCoaName(this.coaname);
								pettycashdtl.setDescription(this.descdetail);
								this.lstdtl.add(pettycashdtl);

								this.dtl.put("dtl", pettycashdtl);
								this.totalamount = 0.00;
								for (final PettyCashDtl aRow : this.lstdtl)
									{
										this.totalamount += aRow.getAmount();
									}
							}

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}

		@SuppressWarnings("unchecked")
		private String DeleteDetail() throws Exception
			{
				final String status = this.getMode();
				try
					{
						this.lstdtl = (List<PettyCashDtl>) this.dtl.get("dtl");
						this.seqno = this.seqno - 1;
						this.lstdtl.remove(this.seqno);

						this.dtl.put("dtl", this.lstdtl);
						this.lstdtl = (List<PettyCashDtl>) this.dtl.get("dtl");
						this.totalamount = 0.00;
						for (final PettyCashDtl aRow : this.lstdtl)
							{
								this.totalamount += aRow.getAmount();
							}

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}

		private String SavePettyCash() throws Exception
			{
				String status = this.mode;

				final PettyCashHdr pettycashhdr = new PettyCashHdr();
				try
					{

						pettycashhdr.setPcamount(this.getAmount());
						pettycashhdr.setValueDate(this.dateformat.parse(this.getValuedate()));
						this.bankaccount.setId(this.getBankaccountid());
						this.employee.setId(this.getEmployeeid());

						pettycashhdr.setBankAccount(this.getBankaccount());
						pettycashhdr.setEmployee(this.getEmployee());
						
						pettycashhdr.setPostingDate(BaseAction.sesBussinessDate());

						pettycashhdr.setPartner(this.getPartner());
						pettycashhdr.setOffice(this.getOffice());
						pettycashhdr.setCurrencyRate(this.getCurrencyrate());
						pettycashhdr.setNotes(this.getNotes());
						pettycashhdr.setUsrUpd(BaseAction.sesLoginName());
						pettycashhdr.setUsrCrt(BaseAction.sesLoginName());
						this.service.SavePettyCash(BaseAction.sesLoginName(), this.getPartner(), this.getOffice(), pettycashhdr, this.lstdtl);
						status = SUCCESS;

						this.setMessage(SuccessMessage());
					}
				catch (final Exception exp)
					{
						status = ERROR;

						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				finally
					{

					}
				return status;
			}

		public String ViewData() throws Exception
			{
				this.bankaccount = new BankAccount();
				String status = this.mode;
				try
					{
						if (this.getId() != null)
							{
								this.bankaccount = this.bankaccountservice.View(this.getId());
								this.bankaccountname = this.bankaccount.getBankAccountName();
								this.bankaccountid = this.getId();
							}
						else
							{
								status = "end";
								this.setMessage(BaseAction.SelectFirst());
							}
					}
				catch (final Exception exp)
					{
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}

		private String WhereCond()
			{
				String wherecond = "";
				if ((this.getSearchvalue() != null) && !this.getSearchcriteria().equals("") && !this.getSearchcriteria().equals("0"))
					{
						if (this.getSearchcriteria().contains("%"))
							{
								wherecond = this.getSearchvalue() + " like '" + this.getSearchcriteria() + "' ";
							}
						else
							{
								wherecond = this.getSearchcriteria() + " = '" + this.getSearchvalue() + "' ";
							}
					}
				return wherecond;
			}

		private void Paging() throws Exception
			{
				try
					{
						this.lstBankAccount = this.bankaccountservice.Paging(this.getPageNumber(), this.WhereCond(), "");
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

			}

		private void Paging(final int islast) throws Exception
			{
				try
					{
						this.lstBankAccount = this.bankaccountservice.Paging(this.getPageNumber(), this.WhereCond(), "", true);
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

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
		 * @return the pettCashService
		 */
		public PettyCashService getPettCashService()
			{
				return this.pettCashService;
			}

		/**
		 * @param pettCashService
		 *            the pettCashService to set
		 */
		public void setPettCashService(final PettyCashService pettCashService)
			{
				this.pettCashService = pettCashService;
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
		 * @return the searchcriteria
		 */
		public String getSearchcriteria()
			{
				return this.searchcriteria;
			}

		/**
		 * @param searchcriteria
		 *            the searchcriteria to set
		 */
		public void setSearchcriteria(final String searchcriteria)
			{
				this.searchcriteria = searchcriteria;
			}

		/**
		 * @return the searchvalue
		 */
		public String getSearchvalue()
			{
				return this.searchvalue;
			}

		/**
		 * @param searchvalue
		 *            the searchvalue to set
		 */
		public void setSearchvalue(final String searchvalue)
			{
				this.searchvalue = searchvalue;
			}

		/**
		 * @return the dtl
		 */
		public Map<String, Object> getDtl()
			{
				return this.dtl;
			}

		/**
		 * @param dtl
		 *            the dtl to set
		 */
		public void setDtl(final Map<String, Object> dtl)
			{
				this.dtl = dtl;
			}

		/**
		 * @return the lstdtl
		 */
		public List<PettyCashDtl> getLstdtl()
			{
				return this.lstdtl;
			}

		/**
		 * @param lstdtl
		 *            the lstdtl to set
		 */
		public void setLstdtl(final List<PettyCashDtl> lstdtl)
			{
				this.lstdtl = lstdtl;
			}

		/**
		 * @return the lstbankaccount
		 */
		public List<BankAccount> getLstbankaccount()
			{
				return this.lstbankaccount;
			}

		/**
		 * @param lstbankaccount
		 *            the lstbankaccount to set
		 */
		public void setLstbankaccount(final List<BankAccount> lstbankaccount)
			{
				this.lstbankaccount = lstbankaccount;
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
		 * @return the pageNumber
		 */
		public int getPageNumber()
			{
				return this.pageNumber;
			}

		/**
		 * @param pageNumber
		 *            the pageNumber to set
		 */
		public void setPageNumber(final int pageNumber)
			{
				this.pageNumber = pageNumber;
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
		 * @return the currencyrate
		 */
		public Double getCurrencyrate()
			{
				return this.currencyrate;
			}

		/**
		 * @param currencyrate
		 *            the currencyrate to set
		 */
		public void setCurrencyrate(final Double currencyrate)
			{
				this.currencyrate = currencyrate;
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
		 * @return the amountdetail
		 */
		public Double getAmountdetail()
			{
				return this.amountdetail;
			}

		/**
		 * @param amountdetail
		 *            the amountdetail to set
		 */
		public void setAmountdetail(final Double amountdetail)
			{
				this.amountdetail = amountdetail;
			}

		/**
		 * @return the descdetail
		 */
		public String getDescdetail()
			{
				return this.descdetail;
			}

		/**
		 * @param descdetail
		 *            the descdetail to set
		 */
		public void setDescdetail(final String descdetail)
			{
				this.descdetail = descdetail;
			}

		/**
		 * @return the coacode
		 */
		public String getCoacode()
			{
				return this.coacode;
			}

		/**
		 * @param coacode
		 *            the coacode to set
		 */
		public void setCoacode(final String coacode)
			{
				this.coacode = coacode;
			}

		/**
		 * @return the coaname
		 */
		public String getCoaname()
			{
				return this.coaname;
			}

		/**
		 * @param coaname
		 *            the coaname to set
		 */
		public void setCoaname(final String coaname)
			{
				this.coaname = coaname;
			}

		/**
		 * @return the totalamount
		 */
		public Double getTotalamount()
			{
				return this.totalamount;
			}

		/**
		 * @param totalamount
		 *            the totalamount to set
		 */
		public void setTotalamount(final Double totalamount)
			{
				this.totalamount = totalamount;
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
		 * @return the lstBankAccount
		 */
		public List<BankAccount> getLstBankAccount()
			{
				return this.lstBankAccount;
			}

		/**
		 * @param lstBankAccount
		 *            the lstBankAccount to set
		 */
		public void setLstBankAccount(final List<BankAccount> lstBankAccount)
			{
				this.lstBankAccount = lstBankAccount;
			}

		/**
		 * @return the bankaccountservice
		 */
		public BankAccountService getBankaccountservice()
			{
				return this.bankaccountservice;
			}

		/**
		 * @param bankaccountservice
		 *            the bankaccountservice to set
		 */
		public void setBankaccountservice(final BankAccountService bankaccountservice)
			{
				this.bankaccountservice = bankaccountservice;
			}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

		/**
		 * @return the service
		 */
		public PettyCashService getService()
			{
				return this.service;
			}

	}
