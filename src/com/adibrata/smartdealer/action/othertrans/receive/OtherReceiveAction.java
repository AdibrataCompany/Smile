
package com.adibrata.smartdealer.action.othertrans.receive;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.othertrans.OtherReceiveDao;
import com.adibrata.smartdealer.dao.setting.BankAccountDao;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.BankAccountInfo;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.OtherRcvDtl;
import com.adibrata.smartdealer.model.OtherRcvHdr;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.othertransactions.OtherReceiveService;
import com.adibrata.smartdealer.service.setting.BankAccountService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class OtherReceiveAction extends BaseAction implements Preparable
	{
		
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		/**
		 *
		 */
		private Office office;
		private Partner partner;
		private OtherReceiveService otherReceiveService;
		
		private List<OtherRcvDtl> lstOtherRcvDtl;
		private OtherRcvHdr otherRcvHdr;
		
		private Long id;
		
		private String message;
		private String mode;
		
		private Map<String, Object> dtl;
		private String rcvfrom;
		private Double rcvamount;
		private String reffno;
		private Date postingdate;
		private String valuedate;
		private Long bankaccountid;
		private String bankaccountname;
		private String notes;
		private String coaname;
		private String coacode;
		private Double amount;
		private String description;
		private String bankpurpose;
		private int seqno;
		private double totalamount;
		private String Wop;
		private String currency;
		
		private BankAccount bankAccount;
		private BankAccountService bankAccountService;
		
		public OtherReceiveAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						final OtherReceiveService otherReceiveService = new OtherReceiveDao();
						
						this.otherReceiveService = otherReceiveService;
						
						final BankAccountService bankAccountService = new BankAccountDao();
						
						this.bankAccountService = bankAccountService;
						
						final Partner partner = new Partner();
						final Office office = new Office();
						
						this.setPartner(partner);
						this.setOffice(office);
						this.partner.setPartnerCode(BaseAction.sesPartnerCode());

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
								this.lstOtherRcvDtl = (List<OtherRcvDtl>) this.dtl.get("dtl");
							}
						else
							{
								this.lstOtherRcvDtl = new ArrayList<OtherRcvDtl>();
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
		public String execute()
			{
				String strMode;
				strMode = this.mode;
				if (this.mode != null)
					{
						switch (strMode)
							{
								
								case "deldetail" :
									try
										{
											this.DeleteDetail();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "adddetail" :
									try
										{
											this.AddDetail();
											
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
						
						try
							{
								this.Initialisasi();
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						strMode = "input";
					}
				return strMode;
			}
			
		private void Initialisasi() throws Exception
			{
				
				this.office.setId(sesOfficeId());
				this.partner.setPartnerCode(sesPartnerCode());
				this.lstOtherRcvDtl = new ArrayList<OtherRcvDtl>();
				this.otherRcvHdr = new OtherRcvHdr();
				this.seqno = 1;
				if (this.getBankaccountid() != null)
					{
						BankAccountInfo info = new BankAccountInfo();
						info = this.BankInfo(this.getBankaccountid());
						this.bankaccountname = info.getName();
						this.currency = info.getCurrency();
						
					}
			}
			
		private void AddDetail() throws Exception
			{
				try
					{
						
						final OtherRcvDtl otherRcvDtl = new OtherRcvDtl();
						
						otherRcvDtl.setCoaName(this.coaname);
						otherRcvDtl.setCoaCode(this.coacode);
						otherRcvDtl.setAmount(this.amount);
						otherRcvDtl.setDescription(this.description);
						
						this.lstOtherRcvDtl.add(otherRcvDtl);
						
						this.dtl.put("dtl", this.lstOtherRcvDtl);
						this.totalamount = 0.00;
						for (final OtherRcvDtl aRow : this.lstOtherRcvDtl)
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
		private void DeleteDetail() throws Exception
			{
				try
					{
						this.lstOtherRcvDtl = (List<OtherRcvDtl>) this.dtl.get("dtl");
						this.seqno = this.seqno - 1;
						this.lstOtherRcvDtl.remove(this.seqno);
						
						this.dtl.put("dtl", this.lstOtherRcvDtl);
						this.lstOtherRcvDtl = (List<OtherRcvDtl>) this.dtl.get("dtl");
						
						this.totalamount = 0.00;
						for (final OtherRcvDtl aRow : this.lstOtherRcvDtl)
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
			
		private String Save() throws Exception
			{
				String status;
				try
					{
						status = "";
						final OtherRcvHdr otherRcvHdr = new OtherRcvHdr();
						otherRcvHdr.setPartner(this.partner);
						otherRcvHdr.setOffice(this.office);
						otherRcvHdr.setRcvFrom(this.rcvfrom);
						otherRcvHdr.setRcvAmount(this.rcvamount);
						otherRcvHdr.setReffNo(this.reffno);
						otherRcvHdr.setValueDate(this.dateformat.parse(this.valuedate));
						otherRcvHdr.setBankAccountId(this.bankaccountid);
						otherRcvHdr.setNotes(this.notes);
						//
						// for (final OtherRcvDtl aRow : this.lstOtherRcvDtl)
						// {
						// aRow.setCoaName(this.coaName);
						// aRow.setCoaCode(this.coaCode);
						// aRow.setAmount(this.amount);
						// aRow.setDescription(this.description);
						// }
						
						this.otherReceiveService.Save(sesLoginName(), otherRcvHdr, this.lstOtherRcvDtl);
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
		 * @return the otherReceiveService
		 */
		public OtherReceiveService getOtherReceiveService()
			{
				return this.otherReceiveService;
			}
			
		/**
		 * @param otherReceiveService
		 *            the otherReceiveService to set
		 */
		public void setOtherReceiveService(final OtherReceiveService otherReceiveService)
			{
				this.otherReceiveService = otherReceiveService;
			}
			
		/**
		 * @return the lstOtherRcvDtl
		 */
		public List<OtherRcvDtl> getLstOtherRcvDtl()
			{
				return this.lstOtherRcvDtl;
			}
			
		/**
		 * @param lstOtherRcvDtl
		 *            the lstOtherRcvDtl to set
		 */
		public void setLstOtherRcvDtl(final List<OtherRcvDtl> lstOtherRcvDtl)
			{
				this.lstOtherRcvDtl = lstOtherRcvDtl;
			}
			
		/**
		 * @return the otherRcvHdr
		 */
		public OtherRcvHdr getOtherRcvHdr()
			{
				return this.otherRcvHdr;
			}
			
		/**
		 * @param otherRcvHdr
		 *            the otherRcvHdr to set
		 */
		public void setOtherRcvHdr(final OtherRcvHdr otherRcvHdr)
			{
				this.otherRcvHdr = otherRcvHdr;
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
		 * @return the rcvfrom
		 */
		public String getRcvfrom()
			{
				return this.rcvfrom;
			}
			
		/**
		 * @param rcvfrom
		 *            the rcvfrom to set
		 */
		public void setRcvfrom(final String rcvfrom)
			{
				this.rcvfrom = rcvfrom;
			}
			
		/**
		 * @return the rcvamount
		 */
		public Double getRcvamount()
			{
				return this.rcvamount;
			}
			
		/**
		 * @param rcvamount
		 *            the rcvamount to set
		 */
		public void setRcvamount(final Double rcvamount)
			{
				this.rcvamount = rcvamount;
			}
			
		/**
		 * @return the reffno
		 */
		public String getReffno()
			{
				return this.reffno;
			}
			
		/**
		 * @param reffno
		 *            the reffno to set
		 */
		public void setReffno(final String reffno)
			{
				this.reffno = reffno;
			}
			
		/**
		 * @return the postingdate
		 */
		public Date getPostingdate()
			{
				return this.postingdate;
			}
			
		/**
		 * @param postingdate
		 *            the postingdate to set
		 */
		public void setPostingdate(final Date postingdate)
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
		 * @return the bankpurpose
		 */
		public String getBankpurpose()
			{
				return this.bankpurpose;
			}
			
		/**
		 * @param bankpurpose
		 *            the bankpurpose to set
		 */
		public void setBankpurpose(final String bankpurpose)
			{
				this.bankpurpose = bankpurpose;
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
		 * @return the totalamount
		 */
		public double getTotalamount()
			{
				return this.totalamount;
			}
			
		/**
		 * @param totalamount
		 *            the totalamount to set
		 */
		public void setTotalamount(final double totalamount)
			{
				this.totalamount = totalamount;
			}
			
		/**
		 * @return the wop
		 */
		public String getWop()
			{
				return this.Wop;
			}
			
		/**
		 * @param wop
		 *            the wop to set
		 */
		public void setWop(final String wop)
			{
				this.Wop = wop;
			}
			
		/**
		 * @return the currency
		 */
		public String getCurrency()
			{
				return this.currency;
			}
			
		/**
		 * @param currency
		 *            the currency to set
		 */
		public void setCurrency(final String currency)
			{
				this.currency = currency;
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
		 * @return the bankAccountService
		 */
		public BankAccountService getBankAccountService()
			{
				return this.bankAccountService;
			}
			
		/**
		 * @param bankAccountService
		 *            the bankAccountService to set
		 */
		public void setBankAccountService(final BankAccountService bankAccountService)
			{
				this.bankAccountService = bankAccountService;
			}
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
	}
