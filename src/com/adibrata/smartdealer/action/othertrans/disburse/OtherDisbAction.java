/**
 *
 */

package com.adibrata.smartdealer.action.othertrans.disburse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.othertrans.OtherDisburseDao;
import com.adibrata.smartdealer.dao.setting.BankAccountDao;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.OtherDsbDtl;
import com.adibrata.smartdealer.model.OtherDsbHdr;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.othertransactions.OtherDisburseService;
import com.adibrata.smartdealer.service.setting.BankAccountService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class OtherDisbAction extends BaseAction implements Preparable
	{
		
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		/**
		 *
		 */
		private Partner partner;
		private Office office;
		private OtherDsbHdr otherDsbHdr;
		private List<OtherDsbDtl> lstOtherDisbDtl;
		private OtherDisburseService otherDisburseService;
		
		private String mode;
		private String message;
		private Map<String, Object> session;
		
		private long id;
		private int seqno;
		private String bankpurpose;
		private String Wop;
		
		private String otherdisbno;
		private Double disbamount;
		private String postingdate;
		private String valuedate;
		private Long bankaccountid;
		private String refno;
		private String notes;
		private String destination;
		private Long jobid;
		
		private String coaname;
		private String coacode;
		private Double amount;
		private String description;
		private double totalAmount;
		
		private List<BankAccount> bankAccounts;
		private BankAccount bankAccount;
		private BankAccountService bankAccountService;
		private Map<Long, String> lstBankAccount;
		
		public OtherDisbAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.partner.setPartnerCode(sesPartnerCode());
				
				this.office = new Office();
				this.office.setId(sesOfficeId());
				
				this.otherDisburseService = new OtherDisburseDao();
				this.bankAccountService = new BankAccountDao();
				
				this.lstOtherDisbDtl = new ArrayList<OtherDsbDtl>();
				this.otherDsbHdr = new OtherDsbHdr();
				this.seqno = 1;
				this.lstBankAccount = this.ListBankAccount(this.partner, this.office, "", "");
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				try
					{
						this.session = ActionContext.getContext().getSession();
						if (this.session.get("lstOtherDisbDtlSession") != null)
							{
								this.lstOtherDisbDtl = (List<OtherDsbDtl>) this.session.get("lstOtherDisbDtlSession");
							}
					}
				catch (final Exception e)
					{
						// TODO: handle exception
						e.printStackTrace();
					}
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
								
								case "savedel" :
									try
										{
											this.SaveDel();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "saveadd" :
									try
										{
											this.SaveAdd();
											
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "save" :
									try
										{
											strMode = this.Save();
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
						strMode = "start";
					}
				return strMode;
			}
			
		private void SaveAdd() throws Exception
			{
				try
					{
						this.otherDsbHdr = new OtherDsbHdr();
						this.otherDsbHdr.setOtherDisbNo(this.getOtherdisbno());
						this.otherDsbHdr.setDisbAmount(this.getDisbamount());
						this.otherDsbHdr.setPostingDate(this.dateformat.parse(this.getPostingdate()));
						this.otherDsbHdr.setValueDate(this.dateformat.parse(this.getValuedate()));
						this.otherDsbHdr.setBankAccountId(this.getBankaccountid());
						this.otherDsbHdr.setRefNo(this.getRefno());
						this.otherDsbHdr.setNotes(this.getNotes());
						this.otherDsbHdr.setDestination(this.getDestination());
						this.otherDsbHdr.setJobId(this.getJobid());
						
						final OtherDsbDtl otherDsbDtl = new OtherDsbDtl();
						
						otherDsbDtl.setCoaCode(this.getCoacode());
						otherDsbDtl.setCoaName(this.getCoaname());
						otherDsbDtl.setAmount(this.getAmount());
						otherDsbDtl.setDescription(this.getDescription());
						
						this.lstOtherDisbDtl.add(otherDsbDtl);
						
						this.session.put("lstOtherRcvDtlSession", this.lstOtherDisbDtl);
						this.totalAmount = 0.00;
						for (final OtherDsbDtl aRow : this.lstOtherDisbDtl)
							{
								this.totalAmount += aRow.getAmount();
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
		private void SaveDel() throws Exception
			{
				try
					{
						this.lstOtherDisbDtl = (List<OtherDsbDtl>) this.session.get("lstOtherDisbDtlSession");
						this.seqno = this.seqno - 1;
						this.lstOtherDisbDtl.remove(this.seqno);
						
						this.session.put("lstOtherDisbDtlSession", this.lstOtherDisbDtl);
						this.lstOtherDisbDtl = (List<OtherDsbDtl>) this.session.get("lstOtherDisbDtlSession");
						this.totalAmount = 0.00;
						for (final OtherDsbDtl aRow : this.lstOtherDisbDtl)
							{
								this.totalAmount += aRow.getAmount();
								
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
			
		private String Save() throws Exception
			{
				String status;
				try
					{
						status = "";
						this.otherDsbHdr = new OtherDsbHdr();
						this.otherDsbHdr.setOtherDisbNo(this.getOtherdisbno());
						this.otherDsbHdr.setDisbAmount(this.getDisbamount());
						this.otherDsbHdr.setPostingDate(this.dateformat.parse(this.getPostingdate()));
						this.otherDsbHdr.setValueDate(this.dateformat.parse(this.getValuedate()));
						this.otherDsbHdr.setBankAccountId(this.getBankaccountid());
						this.otherDsbHdr.setRefNo(this.getRefno());
						this.otherDsbHdr.setNotes(this.getNotes());
						this.otherDsbHdr.setDestination(this.getDestination());
						this.otherDsbHdr.setJobId(this.getJobid());
						
						for (final OtherDsbDtl aRow : this.lstOtherDisbDtl)
							{
								aRow.setCoaName(this.getCoaname());
								aRow.setCoaCode(this.getCoacode());
								aRow.setAmount(this.getAmount());
								aRow.setDescription(this.getDescription());
							}
							
						this.otherDisburseService.Save(sesLoginName(), this.otherDsbHdr, this.lstOtherDisbDtl);
						status = SUCCESS;
						this.setMessage(BaseAction.SuccessMessage());
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
				return status;
			}
			
		/**
		 * @return the mode
		 */
		public String getMode()
			{
				return this.mode;
			}
			
		/**
		 * @return the partner
		 */
		public Partner getPartner()
			{
				return this.partner;
			}
			
		/**
		 * @return the office
		 */
		public Office getOffice()
			{
				return this.office;
			}
			
		/**
		 * @return the otherDsbHdr
		 */
		public OtherDsbHdr getOtherDsbHdr()
			{
				return this.otherDsbHdr;
			}
			
		/**
		 * @return the lstOtherDisbDtl
		 */
		public List<OtherDsbDtl> getLstOtherDisbDtl()
			{
				return this.lstOtherDisbDtl;
			}
			
		/**
		 * @return the otherDisburseService
		 */
		public OtherDisburseService getOtherDisburseService()
			{
				return this.otherDisburseService;
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
		 * @param partner
		 *            the partner to set
		 */
		public void setPartner(final Partner partner)
			{
				this.partner = partner;
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
		 * @param otherDsbHdr
		 *            the otherDsbHdr to set
		 */
		public void setOtherDsbHdr(final OtherDsbHdr otherDsbHdr)
			{
				this.otherDsbHdr = otherDsbHdr;
			}
			
		/**
		 * @param lstOtherDisbDtl
		 *            the lstOtherDisbDtl to set
		 */
		public void setLstOtherDisbDtl(final List<OtherDsbDtl> lstOtherDisbDtl)
			{
				this.lstOtherDisbDtl = lstOtherDisbDtl;
			}
			
		/**
		 * @param otherDisburseService
		 *            the otherDisburseService to set
		 */
		public void setOtherDisburseService(final OtherDisburseService otherDisburseService)
			{
				this.otherDisburseService = otherDisburseService;
			}
			
		public String getMessage()
			{
				return this.message;
			}
			
		public void setMessage(final String message)
			{
				this.message = message;
			}
			
		public Map<String, Object> getSession()
			{
				return this.session;
			}
			
		public void setSession(final Map<String, Object> session)
			{
				this.session = session;
			}
			
		public long getId()
			{
				return this.id;
			}
			
		public void setId(final long id)
			{
				this.id = id;
			}
			
		public int getSeqno()
			{
				return this.seqno;
			}
			
		public void setSeqno(final int seqno)
			{
				this.seqno = seqno;
			}
			
		public List<BankAccount> getBankAccounts()
			{
				return this.bankAccounts;
			}
			
		public void setBankAccounts(final List<BankAccount> bankAccounts)
			{
				this.bankAccounts = bankAccounts;
			}
			
		public BankAccount getBankAccount()
			{
				return this.bankAccount;
			}
			
		public void setBankAccount(final BankAccount bankAccount)
			{
				this.bankAccount = bankAccount;
			}
			
		public BankAccountService getBankAccountService()
			{
				return this.bankAccountService;
			}
			
		public void setBankAccountService(final BankAccountService bankAccountService)
			{
				this.bankAccountService = bankAccountService;
			}
			
		public String getOtherdisbno()
			{
				return this.otherdisbno;
			}
			
		public void setOtherdisbno(final String otherdisbno)
			{
				this.otherdisbno = otherdisbno;
			}
			
		public Double getDisbamount()
			{
				return this.disbamount;
			}
			
		public void setDisbamount(final Double disbamount)
			{
				this.disbamount = disbamount;
			}
			
		public String getPostingdate()
			{
				return this.postingdate;
			}
			
		public void setPostingdate(final String postingdate)
			{
				this.postingdate = postingdate;
			}
			
		public String getValuedate()
			{
				return this.valuedate;
			}
			
		public void setValuedate(final String valuedate)
			{
				this.valuedate = valuedate;
			}
			
		public Long getBankaccountid()
			{
				return this.bankaccountid;
			}
			
		public void setBankaccountid(final Long bankaccountid)
			{
				this.bankaccountid = bankaccountid;
			}
			
		public String getRefno()
			{
				return this.refno;
			}
			
		public void setRefno(final String refno)
			{
				this.refno = refno;
			}
			
		public String getNotes()
			{
				return this.notes;
			}
			
		public void setNotes(final String notes)
			{
				this.notes = notes;
			}
			
		public String getDestination()
			{
				return this.destination;
			}
			
		public void setDestination(final String destination)
			{
				this.destination = destination;
			}
			
		public Long getJobid()
			{
				return this.jobid;
			}
			
		public void setJobid(final Long jobid)
			{
				this.jobid = jobid;
			}
			
		public String getCoaname()
			{
				return this.coaname;
			}
			
		public void setCoaname(final String coaname)
			{
				this.coaname = coaname;
			}
			
		public String getCoacode()
			{
				return this.coacode;
			}
			
		public void setCoacode(final String coacode)
			{
				this.coacode = coacode;
			}
			
		public Double getAmount()
			{
				return this.amount;
			}
			
		public void setAmount(final Double amount)
			{
				this.amount = amount;
			}
			
		public String getDescription()
			{
				return this.description;
			}
			
		public void setDescription(final String description)
			{
				this.description = description;
			}
			
		public String getBankpurpose()
			{
				return this.bankpurpose;
			}
			
		public void setBankpurpose(final String bankpurpose)
			{
				this.bankpurpose = bankpurpose;
			}
			
		public String getWop()
			{
				return this.Wop;
			}
			
		public void setWop(final String wop)
			{
				this.Wop = wop;
			}
			
		public double getTotalAmount()
			{
				return this.totalAmount;
			}
			
		public void setTotalAmount(final double totalAmount)
			{
				this.totalAmount = totalAmount;
			}
			
		public Map<Long, String> getLstBankAccount()
			{
				return this.lstBankAccount;
			}
			
		public void setLstBankAccount(final Map<Long, String> lstBankAccount)
			{
				this.lstBankAccount = lstBankAccount;
			}
			
	}
