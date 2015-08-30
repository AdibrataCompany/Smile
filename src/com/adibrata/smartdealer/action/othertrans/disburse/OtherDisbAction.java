/**
 *
 */

package com.adibrata.smartdealer.action.othertrans.disburse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.othertrans.OtherDisburseDao;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.BankAccountInfo;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.OtherDsbDtl;
import com.adibrata.smartdealer.model.OtherDsbHdr;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.othertransactions.OtherDisburseService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class OtherDisbAction extends BaseAction implements SessionAware
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
		private OtherDsbDtl otherDsbDtl;
		private List<OtherDsbDtl> lstOtherDisbDtl;
		private OtherDisburseService service;
		
		private String mode;
		private String message;
		private Map<String, Object> dtl;
		
		private Long id;
		private int seqno;

		private Double disbamount;
		private String valuedate;

		private String reffno;
		private String notes;
		private String destination;

		private String coaname;
		private String coacode;
		private Double amount;
		private String description;
		private double totalamount;
		
		private BankAccount bankAccount;
		private Long bankaccountid;
		private String bankaccountname;
		private Long currencyid;
		private String currencycode;

		public OtherDisbAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.partner = new Partner();
						this.partner.setPartnerCode(sesPartnerCode());

						this.office = new Office();
						this.office.setId(sesOfficeId());
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

			}

		@Override
		public void setSession(final Map<String, Object> session)
			{
				// TODO Auto-generated method stub
				// this.dtl = ActionContext.getContext().getSession();
				this.dtl = session;
			}
			
		private void Initialisasi() throws Exception
			{
				this.lstOtherDisbDtl = new ArrayList<OtherDsbDtl>();
				if (this.dtl.containsKey("OtherDisburse"))
					{
						this.dtl.remove("OtherDisburse");
					}
				this.dtl.put("OtherDisburse", this.lstOtherDisbDtl);
				this.seqno = 1;
				this.setDisbamount(0.00);
				this.setAmount(0.00);
				this.setDestination("");
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
											this.DelDetail();
											break;
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
											break;
											
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
											break;
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
						strMode = INPUT;
					}
				return strMode;
			}
			
		@SuppressWarnings("unchecked")
		private void AddDetail() throws Exception
			{
				try
					{
						
						this.lstOtherDisbDtl = (List<OtherDsbDtl>) this.dtl.get("OtherDisburse");
						if (this.lstOtherDisbDtl == null)
							{
								this.lstOtherDisbDtl = new ArrayList<OtherDsbDtl>();
							}
						this.otherDsbDtl = new OtherDsbDtl();
						
						this.otherDsbDtl.setCoaCode(this.getCoacode());
						this.otherDsbDtl.setCoaName(this.getCoaname());
						this.otherDsbDtl.setAmount(this.getAmount());
						this.otherDsbDtl.setDescription(this.getDescription());
						this.otherDsbDtl.setUsrCrt(BaseAction.sesLoginName());
						this.otherDsbDtl.setUsrUpd(BaseAction.sesLoginName());
						
						this.lstOtherDisbDtl.add(this.otherDsbDtl);
						
						this.dtl.put("OtherDisburse", this.lstOtherDisbDtl);
						this.totalamount = 0.00;
						for (final OtherDsbDtl aRow : this.lstOtherDisbDtl)
							{
								this.totalamount += aRow.getAmount();
							}
						this.coaname = "";
						this.coacode = "";
						this.amount = 0.00;
						this.description = "";
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
		private void DelDetail() throws Exception
			{
				try
					{
						this.lstOtherDisbDtl = (List<OtherDsbDtl>) this.dtl.get("OtherDisburse");
						this.seqno = this.seqno - 1;
						this.lstOtherDisbDtl.remove(this.seqno);
						
						this.dtl.put("OtherDisburse", this.lstOtherDisbDtl);
						this.lstOtherDisbDtl = (List<OtherDsbDtl>) this.dtl.get("OtherDisburse");
						this.totalamount = 0.00;
						for (final OtherDsbDtl aRow : this.lstOtherDisbDtl)
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
		private String Save() throws Exception
			{
				this.service = new OtherDisburseDao();
				try
					{

						this.lstOtherDisbDtl = (List<OtherDsbDtl>) this.dtl.get("OtherDisburse");
						this.otherDsbHdr = new OtherDsbHdr();
						this.otherDsbHdr.setPartner(this.getPartner());
						this.otherDsbHdr.setOffice(this.getOffice());
						
						this.otherDsbHdr.setDisbAmount(this.getDisbamount());
						this.otherDsbHdr.setPostingDate(BaseAction.sesBussinessDate());
						this.otherDsbHdr.setValueDate(this.dateformat.parse(this.getValuedate()));
						this.otherDsbHdr.setBankAccountId(this.getBankaccountid());
						this.otherDsbHdr.setRefNo(this.getReffno());
						this.otherDsbHdr.setNotes(this.getNotes());
						this.otherDsbHdr.setDestination(this.getDestination());
						this.otherDsbHdr.setUsrCrt(BaseAction.sesLoginName());
						this.otherDsbHdr.setUsrUpd(BaseAction.sesLoginName());
						
						this.service.Save(sesLoginName(), this.otherDsbHdr, this.lstOtherDisbDtl);
						this.mode = SUCCESS;
						if (this.dtl.containsKey("OtherDisburse"))
							{
								this.dtl.remove("OtherDisburse");
							}
						this.setMessage(BaseAction.SuccessMessage());
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
		 * @return the otherDsbHdr
		 */
		public OtherDsbHdr getOtherDsbHdr()
			{
				return this.otherDsbHdr;
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
		 * @return the otherDsbDtl
		 */
		public OtherDsbDtl getOtherDsbDtl()
			{
				return this.otherDsbDtl;
			}

		/**
		 * @param otherDsbDtl
		 *            the otherDsbDtl to set
		 */
		public void setOtherDsbDtl(final OtherDsbDtl otherDsbDtl)
			{
				this.otherDsbDtl = otherDsbDtl;
			}
			
		/**
		 * @return the service
		 */
		public OtherDisburseService getService()
			{
				return this.service;
			}
			
		/**
		 * @param service
		 *            the service to set
		 */
		public void setService(final OtherDisburseService service)
			{
				this.service = service;
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
		 * @return the disbamount
		 */
		public Double getDisbamount()
			{
				return this.disbamount;
			}
			
		/**
		 * @param disbamount
		 *            the disbamount to set
		 */
		public void setDisbamount(final Double disbamount)
			{
				this.disbamount = disbamount;
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
		 * @return the refno
		 */
		public String getReffno()
			{
				return this.reffno;
			}
			
		/**
		 * @param refno
		 *            the refno to set
		 */
		public void setReffno(final String reffno)
			{
				this.reffno = reffno;
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
		 * @return the destination
		 */
		public String getDestination()
			{
				return this.destination;
			}
			
		/**
		 * @param destination
		 *            the destination to set
		 */
		public void setDestination(final String destination)
			{
				this.destination = destination;
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
		 * @return the lstOtherDisbDtl
		 */
		public List<OtherDsbDtl> getLstOtherDisbDtl()
			{
				return this.lstOtherDisbDtl;
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
			
	}
