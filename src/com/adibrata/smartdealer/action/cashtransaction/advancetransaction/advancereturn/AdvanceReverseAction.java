
package com.adibrata.smartdealer.action.cashtransaction.advancetransaction.advancereturn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.cashtransactions.AdvanceCashDao;
import com.adibrata.smartdealer.dao.setting.BankAccountDao;
import com.adibrata.smartdealer.model.AdvanceCash;
import com.adibrata.smartdealer.model.AdvanceCashReversal;
import com.adibrata.smartdealer.model.AdvanceTransaction;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.cashtransactions.AdvanceCashService;
import com.adibrata.smartdealer.service.setting.BankAccountService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AdvanceReverseAction extends BaseAction implements Preparable
	{
		
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		private Partner partner;
		private Office office;
		
		private String mode;
		private String searchcriteria;
		private String searchvalue;
		private Long id;
		private String usrUpd;
		private String usrCrt;
		private int pageNumber;
		private String message;
		
		private String valuedate;
		private String postingdate;
		private String notes;
		private Long bankaccountid;
		private List<AdvanceTransaction> lstadvance;
		private Map<Long, String> lstbankaccount;
		private AdvanceCashService service;
		private AdvanceCash advancecash;
		private AdvanceCashReversal reversal;
		private int agingdays;
		private Double amount;
		
		public AdvanceReverseAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.office = new Office();
						this.office.setId(BaseAction.sesOfficeId());
						this.partner = new Partner();
						this.partner.setPartnerCode(BaseAction.sesPartnerCode());
						this.service = new AdvanceCashDao();
						this.advancecash = new AdvanceCash();
						this.lstbankaccount = new HashMap<Long, String>();
						this.lstbankaccount = this.ListBankAccount(this.getPartner(), this.getOffice(), "", "");
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
		public String execute() throws Exception
			{
				String strMode;
				strMode = this.mode;
				
				if (this.mode != null)
					{
						
						switch (strMode)
							{
								case "search" :
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
								case "save" :
									strMode = this.SaveAdvanceReversal();
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
								case "entry" :
									try
										{
											strMode = this.ViewData();
											break;
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
			
		private String WhereCond()
			{
				final StringBuilder sql = new StringBuilder();
				
				sql.append(" P.partnerCode = '" + BaseAction.sesPartnerCode() + "' and O.id = " + BaseAction.sesOfficeId() + " and A.status = 'NE' ");
				
				if (this.getBankaccountid() != null)
					{
						sql.append(" and  B.id = " + this.getBankaccountid());
						
					}
					
				if (!this.valuedate.equals(""))
					{
						sql.append(" and  A.valueDate  <= " + this.valuedate);
					}
					
				if (!this.postingdate.equals(""))
					{
						sql.append(" and  A.postingDate  <= " + this.postingdate);
						
					}
					
				if ((this.getSearchvalue() != null) && !this.getSearchcriteria().equals("") && !this.getSearchcriteria().equals("0"))
					{
						if (this.getSearchcriteria().contains("%"))
							{
								sql.append(" and " + this.getSearchvalue() + " like '" + this.getSearchcriteria() + "' ");
							}
						else
							{
								sql.append(" and " + this.getSearchcriteria() + " = '" + this.getSearchvalue() + "' ");
							}
					}
				return sql.toString();
			}
			
		private void Paging() throws Exception
			{
				try
					{
						final AdvanceCashService entryService = new AdvanceCashDao();
						this.lstadvance = entryService.Paging(this.getPageNumber(), this.WhereCond(), "");
						
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
						final AdvanceCashService entryService = new AdvanceCashDao();
						this.lstadvance = entryService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
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
			
		private String ViewData() throws Exception
			{
				String status = "";
				
				try
					{
						
						if (this.getId() != null)
							{
								final AdvanceCashService entryService = new AdvanceCashDao();
								final BankAccountService baservice = new BankAccountDao();
								this.advancecash = new AdvanceCash();
								this.advancecash = entryService.View(this.getId());
								
								this.setValuedate(this.dateformat.format(this.advancecash.getValueDate()));
								this.setPostingdate(this.dateformat.format(this.advancecash.getPostingDate()));
								this.setAmount(this.advancecash.getAdvanceAmount());
								this.setBankaccountname(baservice.View(this.advancecash.getBankAccount().getId()).getBankAccountName());
								
								status = "entry";
								
							}
						else
							{
								status = "search";
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
			
		private void setBankaccountname(final String bankAccountName)
			{
				// TODO Auto-generated method stub
				
			}
			
		private String SaveAdvanceReversal() throws Exception
			{
				String status = "";
				this.reversal = new AdvanceCashReversal();
				try
					{
						final BankAccount bank = new BankAccount();
						bank.setId(this.getBankaccountid());
						this.reversal.setAdvanceCash(this.advancecash);
						
						this.reversal.setReverseAmount(this.getAmount());
						
						this.reversal.setBankAccount(bank);
						this.reversal.setValueDate(this.dateformat.parse(this.getValuedate()));
						this.reversal.setPostingDate(BaseAction.sesBussinessDate());
						this.reversal.setCurrencyRate(1.00);
						this.reversal.setNotes(this.getNotes());
						this.reversal.setUsrUpd(BaseAction.sesLoginName());
						this.reversal.setUsrCrt(BaseAction.sesLoginName());
						this.service.Save(BaseAction.sesLoginName(), this.reversal);
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
		 * @return the lstadvance
		 */
		public List<AdvanceTransaction> getLstadvance()
			{
				return this.lstadvance;
			}
			
		/**
		 * @param lstadvance
		 *            the lstadvance to set
		 */
		public void setLstadvance(final List<AdvanceTransaction> lstadvance)
			{
				this.lstadvance = lstadvance;
			}
			
		/**
		 * @return the lstbankaccount
		 */
		public Map<Long, String> getLstbankaccount()
			{
				return this.lstbankaccount;
			}
			
		/**
		 * @param lstbankaccount
		 *            the lstbankaccount to set
		 */
		public void setLstbankaccount(final Map<Long, String> lstbankaccount)
			{
				this.lstbankaccount = lstbankaccount;
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
		 * @return the advancecash
		 */
		public AdvanceCash getAdvancecash()
			{
				return this.advancecash;
			}
			
		/**
		 * @param advancecash
		 *            the advancecash to set
		 */
		public void setAdvancecash(final AdvanceCash advancecash)
			{
				this.advancecash = advancecash;
			}
			
		/**
		 * @return the reversal
		 */
		public AdvanceCashReversal getReversal()
			{
				return this.reversal;
			}
			
		/**
		 * @param reversal
		 *            the reversal to set
		 */
		public void setReversal(final AdvanceCashReversal reversal)
			{
				this.reversal = reversal;
			}
			
		/**
		 * @return the agingdays
		 */
		public int getAgingdays()
			{
				return this.agingdays;
			}
			
		/**
		 * @param agingdays
		 *            the agingdays to set
		 */
		public void setAgingdays(final int agingdays)
			{
				this.agingdays = agingdays;
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
		 * @return the serialversionuid
		 */
		public static Long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
	}
