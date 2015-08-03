
package com.adibrata.smartdealer.action.cashtransaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.cashtransactions.PettyCashDao;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.OtherRcvDtl;
import com.adibrata.smartdealer.model.OtherRcvHdr;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PettyCashDtl;
import com.adibrata.smartdealer.model.PettyCashHdr;
import com.adibrata.smartdealer.service.cashtransactions.PettyCashService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.date.DateConvertion;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PettyCashAction extends BaseAction implements Preparable
	{
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		String mode;
		private Office office;
		private Partner partner;
		private PettyCashDtl dtl;
		private PettyCashService pettCashService;
		private PettyCashHdr hdr;
		private Map<Long, String> lstbankaccount;
		private List<PettyCashDtl> lstdtl;
		private String message;
		private Long bankaccountid;
		private String notes;
		private Double amount;
		private String valuedate;
		private Map<Long, String> lstemployee;
		private Long employeeid;
		private Double currencyrate;
		private Long currencyid;
		private final PettyCashService service;
		
		public PettyCashAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.office = new Office();
				this.office.setId(BaseAction.sesOfficeId());
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.lstbankaccount = new HashMap<Long, String>();
				this.lstbankaccount = this.ListBankAccount(this.partner, this.office, "CA", "PETTYCASH");
				this.lstemployee = new HashMap<Long, String>();
				this.lstemployee = this.ListEmployee(this.partner, this.office);
				this.lstdtl = new ArrayList<PettyCashDtl>();
				this.service = new PettyCashDao();
				
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
						final OtherRcvHdr otherRcvHdr = new OtherRcvHdr();
						otherRcvHdr.setRcvFrom(this.rcvFrom);
						otherRcvHdr.setRcvAmount(this.rcvAmount);
						otherRcvHdr.setReffNo(this.reffNo);
						otherRcvHdr.setValueDate(DateConvertion.convertStringToDate(this.valueDate));
						otherRcvHdr.setBankAccountId(this.bankAccountId);
						otherRcvHdr.setNotes(this.notes);

						final OtherRcvDtl otherRcvDtl = new OtherRcvDtl();

						otherRcvDtl.setCoaName(this.coaName);
						otherRcvDtl.setCoaCode(this.coaCode);
						otherRcvDtl.setAmount(this.amount);
						otherRcvDtl.setDescription(this.description);

						this.lstOtherRcvDtl.add(otherRcvDtl);

						this.session.put("lstOtherRcvDtlSession", this.lstOtherRcvDtl);
						this.totalAmount = 0.00;
						for (final OtherRcvDtl aRow : this.lstOtherRcvDtl)
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
				return status;
			}

		@SuppressWarnings("unchecked")
		private String DeleteDetail() throws Exception
			{
				final String status = this.mode;
				try
					{
						this.lstOtherRcvDtl = (List<OtherRcvDtl>) this.session.get("lstOtherRcvDtlSession");
						this.SeqNo = this.SeqNo - 1;
						this.lstOtherRcvDtl.remove(this.SeqNo);

						this.session.put("lstOtherRcvDtlSession", this.lstOtherRcvDtl);
						this.lstOtherRcvDtl = (List<OtherRcvDtl>) this.session.get("lstOtherRcvDtlSession");
						this.totalAmount = 0.00;
						for (final OtherRcvDtl aRow : this.lstOtherRcvDtl)
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
				return status;
			}

		private String SavePettyCash() throws Exception
			{
				String status = this.mode;

				this.hdr = new PettyCashHdr();
				try
					{
						final BankAccount ba = new BankAccount();
						ba.setId(this.bankaccountid);

						this.hdr.setPcamount(this.getAmount());
						this.hdr.setValueDate(this.dateformat.parse(this.getValuedate()));
						this.hdr.setBankAccount(ba);
						this.hdr.setPostingDate(BaseAction.sesBussinessDate());
						this.hdr.setPartner(this.getPartner());
						this.hdr.setOffice(this.getOffice());
						this.hdr.setCurrencyRate(this.getCurrencyrate());
						this.hdr.setNotes(this.getNotes());
						this.hdr.setUsrUpd(BaseAction.sesLoginName());
						this.hdr.setUsrCrt(BaseAction.sesLoginName());
						this.service.SavePettyCash(BaseAction.sesLoginName(), this.getPartner(), this.getOffice(), this.hdr, this.lstdtl);
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
		 * @return the dtl
		 */
		public PettyCashDtl getDtl()
			{
				return this.dtl;
			}
			
		/**
		 * @param dtl
		 *            the dtl to set
		 */
		public void setDtl(final PettyCashDtl dtl)
			{
				this.dtl = dtl;
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
		 * @return the hdr
		 */
		public PettyCashHdr getHdr()
			{
				return this.hdr;
			}
			
		/**
		 * @param hdr
		 *            the hdr to set
		 */
		public void setHdr(final PettyCashHdr hdr)
			{
				this.hdr = hdr;
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
