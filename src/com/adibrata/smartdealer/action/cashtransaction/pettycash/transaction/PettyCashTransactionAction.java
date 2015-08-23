
package com.adibrata.smartdealer.action.cashtransaction.pettycash.transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.cashtransactions.PettyCashDao;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.BankAccountInfo;
import com.adibrata.smartdealer.model.Employee;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PettyCashDtl;
import com.adibrata.smartdealer.model.PettyCashHdr;
import com.adibrata.smartdealer.service.cashtransactions.PettyCashService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.utility.date.DateConvertion;

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

		private BankAccount bankaccount;
		private Employee employee;
		
		private PettyCashDtl pettyCashDtl;
		private PettyCashHdr pettyCashHdr;
		private Map<String, Object> dtl;
		private List<PettyCashDtl> lstdtl;
		
		private Map<Long, String> lstemployee;
		private Map<String, Object> emplses;
		private String message;

		private String notes;
		private Double amount;
		private String valuedate;
		private Double pcamount;
		private Long employeeid;
		private String employeename;
		private Double currencyrate;

		private PettyCashService service;

		private String description;
		private String coacode;
		private String coaname;
		private Double totalamount;
		private int seqno;
		private String refno;
		private BankAccount bankAccount;
		private Long bankaccountid;
		private String bankaccountname;
		private Long currencyid;
		private String currencycode;
		
		public PettyCashTransactionAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.office = new Office();
				this.office.setId(BaseAction.sesOfficeId());
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());

			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				try
					{
						this.dtl = ActionContext.getContext().getSession();
						this.emplses = ActionContext.getContext().getSession();
						this.lstemployee = (Map<Long, String>) this.emplses.get("Employee");
						if (this.lstemployee == null)
							{
								this.lstemployee = new HashMap<Long, String>();
								this.lstemployee = this.ListEmployee(this.partner, this.office);
								this.emplses.put("Employee", this.lstemployee);
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
									this.AddDetail();
									break;
									
								case "deldetail" :
									this.DeleteDetail();
									break;
									
								default :
									break;
									
							}
					}
				else
					{
						strMode = INPUT;
						try
							{
								this.Initialisasi();
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				return strMode;
			}
			
		@SuppressWarnings("unchecked")
		private void Initialisasi() throws Exception
			{
				this.lstdtl = new ArrayList<PettyCashDtl>();
				this.dtl.clear();
				this.dtl.put("PettyCash", this.lstdtl);
				this.lstemployee = (Map<Long, String>) this.emplses.get("Employee");
				if (this.lstemployee == null)
					{
						this.lstemployee = new HashMap<Long, String>();
						this.lstemployee = this.ListEmployee(this.partner, this.office);
						this.emplses.put("Employee", this.lstemployee);
					}
				this.seqno = 1;

				this.setAmount(0.00);
				this.setValuedate(this.dateformat.format(BaseAction.sesBussinessDate()));
				this.setNotes("");
				if (this.getBankaccountid() != null)
					{
						BankAccountInfo info = new BankAccountInfo();
						info = this.BankInfo(this.getBankaccountid());
						this.bankaccountname = info.getName();
						this.currencycode = info.getCurrency();
						this.currencyid = info.getCurrencyid();
					}

			}
			
		@SuppressWarnings("unchecked")
		private void AddDetail() throws Exception
			{
				try
					{
						// if (this.totalamount != null && this.amountdetail)
						// if ((this.totalamount + this.amountdetail) > this.amount)
						// {
						// this.message = "Amount Detail > Petty Cash Amount";
						// }
						// else
						// {
						this.lstdtl = (List<PettyCashDtl>) this.dtl.get("PettyCash");
						if (this.lstdtl == null)
							{
								this.lstdtl = new ArrayList<PettyCashDtl>();
							}
						final PettyCashDtl pettycashdtl = new PettyCashDtl();
						pettycashdtl.setAmount(this.amount);
						pettycashdtl.setCoaName(this.coaname);
						pettycashdtl.setDescription(this.description);
						this.lstdtl.add(pettycashdtl);
						
						this.dtl.put("PettyCash", this.lstdtl);
						this.totalamount = 0.00;
						for (final PettyCashDtl aRow : this.lstdtl)
							{
								this.totalamount += aRow.getAmount();
							}

						// }
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
					
			}
			
		@SuppressWarnings("unchecked")
		private void DeleteDetail() throws Exception
			{
				this.getMode();
				try
					{
						this.lstdtl = (List<PettyCashDtl>) this.dtl.get("PettyCash");
						this.seqno = this.seqno - 1;
						this.lstdtl.remove(this.seqno);
						
						this.dtl.put("PettyCash", this.lstdtl);
						this.lstdtl = (List<PettyCashDtl>) this.dtl.get("PettyCash");
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
					
			}
			
		@SuppressWarnings("unchecked")
		private String SavePettyCash() throws Exception
			{
				
				this.service = new PettyCashDao();
				try
					{
						this.lstdtl = (List<PettyCashDtl>) this.dtl.get("PettyCash");
						this.pettyCashHdr = new PettyCashHdr();
						this.bankaccount = new BankAccount();
						this.employee = new Employee();
						this.pettyCashHdr.setPcamount(this.getAmount());
						this.pettyCashHdr.setValueDate(this.dateformat.parse(this.getValuedate()));
						this.pettyCashHdr.setPartner(this.partner);
						this.pettyCashHdr.setOffice(this.office);
						
						this.bankaccount.setId(this.getBankaccountid());
						this.employee.setId(this.getEmployeeid());
						
						this.pettyCashHdr.setBankAccount(this.getBankaccount());
						this.pettyCashHdr.setEmployee(this.getEmployee());
						this.pettyCashHdr.setValueDate(DateConvertion.convertStringToDate(this.valuedate));
						this.pettyCashHdr.setPostingDate(BaseAction.sesBussinessDate());
						
						this.pettyCashHdr.setCurrencyRate((double) 1);
						this.pettyCashHdr.setNotes(this.getNotes());
						this.pettyCashHdr.setUsrUpd(BaseAction.sesLoginName());
						this.pettyCashHdr.setUsrCrt(BaseAction.sesLoginName());
						
						this.service.SavePettyCash(BaseAction.sesLoginName(), this.getPartner(), this.getOffice(), this.pettyCashHdr, this.lstdtl);
						this.mode = SUCCESS;
						
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
		// Getter Setter
		
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
		 * @return the pettyCashDtl
		 */
		public PettyCashDtl getPettyCashDtl()
			{
				return this.pettyCashDtl;
			}
			
		/**
		 * @param pettyCashDtl
		 *            the pettyCashDtl to set
		 */
		public void setPettyCashDtl(final PettyCashDtl pettyCashDtl)
			{
				this.pettyCashDtl = pettyCashDtl;
			}
			
		/**
		 * @return the pettyCashHdr
		 */
		public PettyCashHdr getPettyCashHdr()
			{
				return this.pettyCashHdr;
			}
			
		/**
		 * @param pettyCashHdr
		 *            the pettyCashHdr to set
		 */
		public void setPettyCashHdr(final PettyCashHdr pettyCashHdr)
			{
				this.pettyCashHdr = pettyCashHdr;
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
		 * @return the pcamount
		 */
		public Double getPcamount()
			{
				return this.pcamount;
			}
			
		/**
		 * @param pcamount
		 *            the pcamount to set
		 */
		public void setPcamount(final Double pcamount)
			{
				this.pcamount = pcamount;
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
		 * @return the service
		 */
		public PettyCashService getService()
			{
				return this.service;
			}
			
		/**
		 * @param service
		 *            the service to set
		 */
		public void setService(final PettyCashService service)
			{
				this.service = service;
			}
			
		/**
		 * @return the description
		 */
		public String getDescription()
			{
				return this.description;
			}
			
		/**
		 * @param description
		 *            the description to set
		 */
		public void setDescription(final String description)
			{
				this.description = description;
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
		 * @return the bankAccount
		 */
		public BankAccount getBankAccount()
			{
				return this.bankAccount;
			}
			
		/**
		 * @param bankAccount
		 *            the bankAccount to set
		 */
		public void setBankAccount(final BankAccount bankAccount)
			{
				this.bankAccount = bankAccount;
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
		 * @return the refno
		 */
		public String getRefno()
			{
				return this.refno;
			}

		/**
		 * @param refno
		 *            the refno to set
		 */
		public void setRefno(final String refno)
			{
				this.refno = refno;
			}
			
		/**
		 * @return the emplses
		 */
		public Map<String, Object> getEmplses()
			{
				return this.emplses;
			}
			
		/**
		 * @param emplses
		 *            the emplses to set
		 */
		public void setEmplses(final Map<String, Object> emplses)
			{
				this.emplses = emplses;
			}
			
	}
