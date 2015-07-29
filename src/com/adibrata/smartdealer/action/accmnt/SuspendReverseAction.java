
package com.adibrata.smartdealer.action.accmnt;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.accmaint.SuspendEntryDao;
import com.adibrata.smartdealer.dao.accmaint.SuspendReversalDao;
import com.adibrata.smartdealer.dao.setting.BankAccountDao;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.SuspendList;
import com.adibrata.smartdealer.model.SuspendReceive;
import com.adibrata.smartdealer.model.SuspendReverse;
import com.adibrata.smartdealer.service.accmaint.SuspendEntryService;
import com.adibrata.smartdealer.service.accmaint.SuspendReversalService;
import com.adibrata.smartdealer.service.setting.BankAccountService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class SuspendReverseAction extends BaseAction implements Preparable
	{
		private static final long serialVersionUID = 1L;
		private String mode;
		private String searchcriteria;
		private String searchvalue;
		private Long id;
		private Partner partner;
		private Office office;
		private Map<Long, String> lstBankAccount;

		private String usrUpd;
		private String usrCrt;
		private int pageNumber;
		private String message;
		private SuspendReceive receive;
		private SuspendReverse reverse;
		private SuspendReversalService service;
		private List<SuspendList> lstSuspendReceive;

		private String valuedatesearch;
		private String postingdatesearch;
		private String amountstart;
		private String amountend;
		private Date postingDate;
		private Double amount;
		private Long currencyId;
		private Double currencyRate;
		private Long bankaccountId;
		private String bankaccountname;
		private String status;
		private String valuedate;
		private String strStatement;
		private StringBuilder hql = new StringBuilder();
		int pagesize;
		private int currentpage;
		private long totalrecord;
		private String notes;

		public SuspendReverseAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.office = new Office();
				this.office.setId(BaseAction.sesOfficeId());
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.service = new SuspendReversalDao();
				this.reverse = new SuspendReverse();
			}

		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

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
									strMode = this.SaveSuspendReverse();
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
								case "entry" :
									try
										{
											this.ViewData();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;

								default :
									return ERROR;
							}
					}
				else
					{
						strMode = "start";
					}
				return strMode;
			}

		private String SaveSuspendReverse() throws Exception
			{
				String status = "";
				this.reverse = new SuspendReverse();
				try
					{

						this.reverse.setSuspendReceive(this.getReceive());
						this.reverse.setAmount(this.receive.getAmount());
						this.reverse.setValueDate(this.receive.getValueDate());
						this.reverse.setPostingDate(BaseAction.sesBussinessDate());
						this.reverse.setBankAccountId(this.receive.getBankAccountId());
						this.reverse.setCurrencyRate(this.receive.getCurrencyRate());
						this.reverse.setUsrUpd(BaseAction.sesLoginName());
						this.reverse.setUsrCrt(BaseAction.sesLoginName());
						this.reverse.setNotes(this.getNotes());
						this.service.SuspendReversalSave(BaseAction.sesLoginName(), this.getPartner(), this.getOffice(), this.reverse);
						status = SUCCESS;
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

		private String WhereCond()
			{
				final StringBuilder sql = new StringBuilder();
				
				sql.append(" partnercode = '" + BaseAction.sesPartnerCode() + "' and office = '" + BaseAction.sesOfficeId() + "' and status = 'NE' ");
				
				if (this.getBankaccountId() != null)
					{
						sql.append(" and  bankaccountid = " + this.getBankaccountId());
						
					}

				if (!this.valuedatesearch.equals(""))
					{
						sql.append(" and  valuedate  <= " + this.valuedatesearch);
					}
					
				if (!this.postingdatesearch.equals(""))
					{
						sql.append(" and  valuedate  <= " + this.postingdatesearch);
						
					}
				if (!this.amountstart.equals(""))
					{
						sql.append(" and amount > " + this.amountstart);
					}
				if (!this.amountend.equals(""))
					{
						sql.append(" and amount <= " + this.amountend);
					}

				if ((this.getSearchvalue() != null) && !this.getSearchcriteria().equals("") && !this.getSearchcriteria().equals("0"))
					{
						if (this.getSearchcriteria().contains("%"))
							{
								sql.append(" and " + this.getSearchvalue() + " like '" + this.getSearchcriteria() + "' ");
							}
						else
							{
								sql.append("and " + this.getSearchcriteria() + " = '" + this.getSearchvalue() + "' ");
							}
					}
				return sql.toString();
			}
			
		private void Paging() throws Exception
			{
				try
					{
						final SuspendEntryService entryService = new SuspendEntryDao();
						this.lstSuspendReceive = entryService.Paging(this.getPageNumber(), this.WhereCond(), "");
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
						final SuspendEntryService entryService = new SuspendEntryDao();
						this.lstSuspendReceive = entryService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
						this.pageNumber = entryService.getCurrentpage();
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}

		private void ViewData() throws Exception
			{
				try
					{
						final SuspendEntryService entryService = new SuspendEntryDao();
						if (this.getId() != null)
							{
								this.receive = entryService.View(this.getId());
								this.setValuedate(this.dateformat.format(this.receive.getValueDate()));
								this.setPostingDate(this.dateformat.parse(this.dateformat.format(this.receive.getPostingDate())));
								this.setAmount(this.receive.getAmount());
								this.setBankaccountId(this.receive.getBankAccountId());
								this.setCurrencyId(this.receive.getCurrencyId());
								this.setCurrencyRate(this.receive.getCurrencyRate());
							}
							
						this.lstSuspendReceive = entryService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
						this.pageNumber = entryService.getCurrentpage();
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
			
		public void ListBankAccount() throws Exception
			{
				try
					{
						final BankAccountService bankaccountservice = new BankAccountDao();
						final List<BankAccount> lst = bankaccountservice.listBankAccount(this.getPartner(), this.getOffice(), "BA", "");

						this.lstBankAccount = new HashMap<Long, String>();
						for (final BankAccount row : lst)
							{
								this.lstBankAccount.put(row.getId(), row.getBankAccountName().trim());
							}
					}
				catch (final Exception exp)
					{
						// TODO: handle exception
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
						exp.printStackTrace();
					}
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
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
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

		/**
		 * @return the reverse
		 */
		public SuspendReverse getReverse()
			{
				return this.reverse;
			}

		/**
		 * @param reverse
		 *            the reverse to set
		 */
		public void setReverse(final SuspendReverse reverse)
			{
				this.reverse = reverse;
			}

		/**
		 * @return the service
		 */
		public SuspendReversalService getService()
			{
				return this.service;
			}

		/**
		 * @param service
		 *            the service to set
		 */
		public void setService(final SuspendReversalService service)
			{
				this.service = service;
			}

		/**
		 * @return the lstSuspendReceive
		 */
		public List<SuspendList> getLstSuspendReceive()
			{
				return this.lstSuspendReceive;
			}

		/**
		 * @param lstSuspendReceive
		 *            the lstSuspendReceive to set
		 */
		public void setLstSuspendReceive(final List<SuspendList> lstSuspendReceive)
			{
				this.lstSuspendReceive = lstSuspendReceive;
			}

		/**
		 * @return the strStatement
		 */
		public String getStrStatement()
			{
				return this.strStatement;
			}

		/**
		 * @param strStatement
		 *            the strStatement to set
		 */
		public void setStrStatement(final String strStatement)
			{
				this.strStatement = strStatement;
			}

		/**
		 * @return the hql
		 */
		public StringBuilder getHql()
			{
				return this.hql;
			}

		/**
		 * @param hql
		 *            the hql to set
		 */
		public void setHql(final StringBuilder hql)
			{
				this.hql = hql;
			}

		/**
		 * @return the pagesize
		 */
		public int getPagesize()
			{
				return this.pagesize;
			}

		/**
		 * @param pagesize
		 *            the pagesize to set
		 */
		public void setPagesize(final int pagesize)
			{
				this.pagesize = pagesize;
			}

		/**
		 * @return the currentpage
		 */
		public int getCurrentpage()
			{
				return this.currentpage;
			}

		/**
		 * @param currentpage
		 *            the currentpage to set
		 */
		public void setCurrentpage(final int currentpage)
			{
				this.currentpage = currentpage;
			}

		/**
		 * @return the totalrecord
		 */
		public long getTotalrecord()
			{
				return this.totalrecord;
			}

		/**
		 * @param totalrecord
		 *            the totalrecord to set
		 */
		public void setTotalrecord(final long totalrecord)
			{
				this.totalrecord = totalrecord;
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
		 * @return the postingDate
		 */
		public Date getPostingDate()
			{
				return this.postingDate;
			}

		/**
		 * @param postingDate
		 *            the postingDate to set
		 */
		public void setPostingDate(final Date postingDate)
			{
				this.postingDate = postingDate;
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
		 * @return the currencyId
		 */
		public Long getCurrencyId()
			{
				return this.currencyId;
			}

		/**
		 * @param currencyId
		 *            the currencyId to set
		 */
		public void setCurrencyId(final Long currencyId)
			{
				this.currencyId = currencyId;
			}

		/**
		 * @return the currencyRate
		 */
		public Double getCurrencyRate()
			{
				return this.currencyRate;
			}

		/**
		 * @param currencyRate
		 *            the currencyRate to set
		 */
		public void setCurrencyRate(final Double currencyRate)
			{
				this.currencyRate = currencyRate;
			}

		/**
		 * @return the status
		 */
		public String getStatus()
			{
				return this.status;
			}

		/**
		 * @param status
		 *            the status to set
		 */
		public void setStatus(final String status)
			{
				this.status = status;
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
		 * @return the receive
		 */
		public SuspendReceive getReceive()
			{
				return this.receive;
			}

		/**
		 * @param receive
		 *            the receive to set
		 */
		public void setReceive(final SuspendReceive receive)
			{
				this.receive = receive;
			}

		/**
		 * @return the lstBankAccount
		 */
		public Map<Long, String> getLstBankAccount()
			{
				return this.lstBankAccount;
			}

		/**
		 * @param lstBankAccount
		 *            the lstBankAccount to set
		 */
		public void setLstBankAccount(final Map<Long, String> lstBankAccount)
			{
				this.lstBankAccount = lstBankAccount;
			}

		/**
		 * @return the bankaccountId
		 */
		public Long getBankaccountId()
			{
				return this.bankaccountId;
			}

		/**
		 * @param bankaccountId
		 *            the bankaccountId to set
		 */
		public void setBankaccountId(final Long bankaccountId)
			{
				this.bankaccountId = bankaccountId;
			}

		/**
		 * @return the valuedatesearch
		 */
		public String getValuedatesearch()
			{
				return this.valuedatesearch;
			}

		/**
		 * @param valuedatesearch
		 *            the valuedatesearch to set
		 */
		public void setValuedatesearch(final String valuedatesearch)
			{
				this.valuedatesearch = valuedatesearch;
			}

		/**
		 * @return the postingdatesearch
		 */
		public String getPostingdatesearch()
			{
				return this.postingdatesearch;
			}

		/**
		 * @param postingdatesearch
		 *            the postingdatesearch to set
		 */
		public void setPostingdatesearch(final String postingdatesearch)
			{
				this.postingdatesearch = postingdatesearch;
			}

		/**
		 * @return the amountstart
		 */
		public String getAmountstart()
			{
				return this.amountstart;
			}

		/**
		 * @param amountstart
		 *            the amountstart to set
		 */
		public void setAmountstart(final String amountstart)
			{
				this.amountstart = amountstart;
			}
			
		/**
		 * @param amountend
		 *            the amountend to set
		 */
		public void setAmountend(final String amountend)
			{
				this.amountend = amountend;
			}

		/**
		 * @return the amountend
		 */
		public String getAmountend()
			{
				return this.amountend;
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
	}
