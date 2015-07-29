
package com.adibrata.smartdealer.action.accmnt;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.accmaint.SuspendEntryDao;
import com.adibrata.smartdealer.dao.setting.BankAccountDao;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.SuspendReceive;
import com.adibrata.smartdealer.service.accmaint.SuspendEntryService;
import com.adibrata.smartdealer.service.setting.BankAccountService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class SuspendReceiveAction extends BaseAction implements Preparable
	{
		private static final long serialVersionUID = 1L;
		private String mode;
		private String searchcriteria;
		private String searchvalue;
		private long id;
		private String usrUpd;
		private String usrCrt;
		private int pageNumber;
		private String message;
		private SuspendReceive receive;
		private Map<Long, String> lstBankAccount;
		private final SuspendEntryService service;
		private Office office;
		private Partner partner;
		private Date postingDate;
		private Double amount;
		private Long currencyid;
		private Double currencyrate;
		private Long bankAccountid;
		private String status;
		private String valuedate;
		private String bankaccountname;
		private String notes;

		public SuspendReceiveAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.office = new Office();
				this.office.setId(BaseAction.sesOfficeId());
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				
				this.service = new SuspendEntryDao();
				this.receive = new SuspendReceive();
				this.ListBankAccount();
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
									strMode = this.SaveSuspend();
									break;

								default :
									return ERROR;
							}
					}
				else
					{
						strMode = "start";
						this.InitiallInput();
					}
				return strMode;
			}

		private void InitiallInput() throws ParseException
			{
				this.setAmount(0.00);
				this.setValuedate(this.dateformat.format(BaseAction.sesBussinessDate()));
				this.setNotes("");
				this.setCurrencyrate(1.00);

			}

		private String SaveSuspend() throws Exception
			{
				String status = "";
				this.receive = new SuspendReceive();
				try
					{
						this.receive.setAmount(this.getAmount());
						this.receive.setValueDate(this.dateformat.parse(this.getValuedate()));
						this.receive.setBankAccountId(this.getBankAccountId());
						this.receive.setPostingDate(BaseAction.sesBussinessDate());
						this.receive.setPartner(this.getPartner());
						this.receive.setOffice(this.getOffice());
						this.receive.setCurrencyRate(this.getCurrencyrate());
						this.receive.setNotes(this.getNotes());
						this.receive.setUsrUpd(BaseAction.sesLoginName());
						this.receive.setUsrCrt(BaseAction.sesLoginName());
						this.service.SuspendEntrySave(BaseAction.sesLoginName(), this.getPartner(), this.getOffice(), this.receive);
						status = SUCCESS;
						this.InitiallInput();
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
		 * @return the id
		 */
		public long getId()
			{
				return this.id;
			}
			
		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final long id)
			{
				this.id = id;
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
				return this.currencyid;
			}
			
		/**
		 * @param currencyId
		 *            the currencyId to set
		 */
		public void setCurrencyId(final Long currencyId)
			{
				this.currencyid = currencyId;
			}
			
		/**
		 * @return the bankAccountId
		 */
		public Long getBankAccountId()
			{
				return this.bankAccountid;
			}
			
		/**
		 * @param bankAccountId
		 *            the bankAccountId to set
		 */
		public void setBankAccountId(final Long bankAccountId)
			{
				this.bankAccountid = bankAccountId;
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
		 * @param valueDate
		 *            the valueDate to set
		 */
		public void setValueDate(final String valueDate)
			{
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
		 * @return the service
		 */
		public SuspendEntryService getService()
			{
				return this.service;
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
		 * @return the bankAccountid
		 */
		public Long getBankAccountid()
			{
				return this.bankAccountid;
			}

		/**
		 * @param bankAccountid
		 *            the bankAccountid to set
		 */
		public void setBankAccountid(final Long bankAccountid)
			{
				this.bankAccountid = bankAccountid;
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
