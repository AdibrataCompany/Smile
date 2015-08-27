/**
 * PaymentReceiveAction.java
 */

package com.adibrata.smartdealer.action.accmnt.payment.receive;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.model.AgreementList;
import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.AgrmntMnt;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PaymentInfo;
import com.adibrata.smartdealer.model.PaymentReceive;
import com.adibrata.smartdealer.service.accmaint.PaymentReceiveService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.ArInfo;

/**
 * @author Henry
 */
public class ReceiveAction extends BaseAction implements Preparable
	{
		
		/**
		 *
		 */
		
		private String mode;
		private String searchcriteria;
		private String searchvalue;
		private final Partner partner;
		private final Office office;
		private static final long serialVersionUID = 1L;
		private Long id;

		private int pageNumber;
		private String message;
		private List<AgreementList> lstAgreement;
		private Agrmnt agrmnt;
		private AgrmntMnt agrmntmnt;
		private PaymentReceive paymentReceive;
		private Double instamount;
		private Double insamount;
		private Double lcinstamount;
		private Double lcinsamount;
		private String valuedate;
		private Date postingdate;
		private Double amountreceive;
		private String wop;
		private Long bankaccountid;
		private String notes;
		private Double prepaidamount;
		private Double currencyrate;
		private Double maximuminstallment;
		private Double maximuminsurance;
		private Double maximumlcinsurance;
		private Double maximumlcinstallment;
		
		private PaymentReceiveService receiveService;

		public ReceiveAction() throws Exception
			{
				// TODO Auto-generated constructor stub

				this.partner = new Partner();
				this.office = new Office();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.office.setId(BaseAction.sesOfficeId());

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
								case "search" :
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								case "edit" :

								case "receive" :
									this.valuedate = this.dateformat.format(Calendar.getInstance().getTime());
									try
										{
											strMode = this.ReceiveAllocation();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								case "allocation" :
									try
										{
											strMode = this.ReceiveAllocation();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								case "save" :
									try
										{
											strMode = this.PaymentReceiveSave();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										
								case "back" :
									;

								case "first" :
									this.pageNumber -= 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
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

		private String ReceiveAllocation() throws Exception
			{
				try
					{
						final ArInfo arinfo = new ArInfo();
						PaymentInfo paymentinfo = new PaymentInfo();
						this.agrmnt.setId(this.getId());
						this.agrmnt.setPartner(this.getPartner());
						this.agrmnt.setOffice(this.getOffice());
						paymentinfo = arinfo.PaymentAllocation(this.getAgrmnt(), this.dateformat.parse(this.getValuedate()), this.getAmountreceive());
						this.instamount = paymentinfo.getInstallmentallocation();

						this.insamount = paymentinfo.getInsuranceallocation();
						this.lcinsamount = paymentinfo.getLcinsuranceallocation();
						this.lcinstamount = paymentinfo.getLcinsuranceallocation();
						this.prepaidamount = paymentinfo.getPrepaidallocation();

						this.maximuminstallment = paymentinfo.getMaximuminstallment();
						this.maximuminsurance = paymentinfo.getMaximuminsurance();
						this.maximumlcinstallment = paymentinfo.getMaximumlcinstall();
						this.maximumlcinsurance = paymentinfo.getMaximumlcinsurance();

						this.mode = "allocation";
					}
				catch (final Exception exp)
					{

						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.mode;
			}

		private String PaymentReceiveSave() throws Exception
			{
				
				try
					{

						this.paymentReceive = new PaymentReceive();
						this.paymentReceive.setAgrmnt(this.getAgrmnt());
						this.paymentReceive.setPostingDate(this.getPostingdate());
						this.paymentReceive.setValueDate(this.dateformat.parse(this.getValuedate()));
						this.paymentReceive.setBankAccId(this.getBankaccountid());
						this.paymentReceive.setCurrencyId(this.agrmnt.getCurrency().getId());
						this.paymentReceive.setCurrencyRate(this.getCurrencyrate());
						this.paymentReceive.setInssAmt(this.getInsamount());
						this.paymentReceive.setInstAmt(this.getInstamount());
						this.paymentReceive.setLcinss(this.getLcinsamount());
						this.paymentReceive.setLcinss(this.getLcinstamount());
						this.paymentReceive.setPrepaidAmt(this.getPrepaidamount());
						this.paymentReceive.setNotes(this.getNotes());
						this.paymentReceive.setWop(this.getWop());
						this.receiveService.PaymentReceiveSave(BaseAction.sesLoginName(), this.getPaymentReceive());
						this.mode = SUCCESS;
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

		private String WhereCond()
			{
				final StringBuilder wherecond = new StringBuilder();
				wherecond.append(" partnercode = '" + BaseAction.sesPartnerCode() + "'");
				if ((this.getSearchvalue() != null) && !this.getSearchcriteria().equals("") && !this.getSearchcriteria().equals("0"))
					{
						wherecond.append(" and ");
						
						if (this.getSearchvalue().contains("%"))
							{
								
								wherecond.append(this.getSearchcriteria() + " like '" + this.getSearchvalue() + "' ");
							}
						else
							{
								wherecond.append(this.getSearchcriteria() + " = '" + this.getSearchvalue() + "' ");
							}
					}
				return wherecond.toString();
			}
			
		private void Paging() throws Exception
			{
				try
					{
						this.lstAgreement = this.receiveService.Paging(this.getPageNumber(), this.WhereCond(), "");
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

						this.lstAgreement = this.receiveService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
						this.pageNumber = this.receiveService.getCurrentpage();
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
		 * @return the lstAgreement
		 */
		public List<AgreementList> getLstAgreement()
			{
				return this.lstAgreement;
			}
			
		/**
		 * @param lstAgreement
		 *            the lstAgreement to set
		 */
		public void setLstAgreement(final List<AgreementList> lstAgreement)
			{
				this.lstAgreement = lstAgreement;
			}
			
		/**
		 * @return the agrmnt
		 */
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		/**
		 * @param agrmnt
		 *            the agrmnt to set
		 */
		public void setAgrmnt(final Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}
			
		/**
		 * @return the agrmntmnt
		 */
		public AgrmntMnt getAgrmntmnt()
			{
				return this.agrmntmnt;
			}
			
		/**
		 * @param agrmntmnt
		 *            the agrmntmnt to set
		 */
		public void setAgrmntmnt(final AgrmntMnt agrmntmnt)
			{
				this.agrmntmnt = agrmntmnt;
			}
			
		/**
		 * @return the paymentReceive
		 */
		public PaymentReceive getPaymentReceive()
			{
				return this.paymentReceive;
			}
			
		/**
		 * @param paymentReceive
		 *            the paymentReceive to set
		 */
		public void setPaymentReceive(final PaymentReceive paymentReceive)
			{
				this.paymentReceive = paymentReceive;
			}

		/**
		 * @return the instamount
		 */
		public Double getInstamount()
			{
				return this.instamount;
			}

		/**
		 * @param instamount
		 *            the instamount to set
		 */
		public void setInstamount(final Double instamount)
			{
				this.instamount = instamount;
			}

		/**
		 * @return the insamount
		 */
		public Double getInsamount()
			{
				return this.insamount;
			}

		/**
		 * @param insamount
		 *            the insamount to set
		 */
		public void setInsamount(final Double insamount)
			{
				this.insamount = insamount;
			}

		/**
		 * @return the lcinstamount
		 */
		public Double getLcinstamount()
			{
				return this.lcinstamount;
			}

		/**
		 * @param lcinstamount
		 *            the lcinstamount to set
		 */
		public void setLcinstamount(final Double lcinstamount)
			{
				this.lcinstamount = lcinstamount;
			}

		/**
		 * @return the lcinsamount
		 */
		public Double getLcinsamount()
			{
				return this.lcinsamount;
			}

		/**
		 * @param lcinsamount
		 *            the lcinsamount to set
		 */
		public void setLcinsamount(final Double lcinsamount)
			{
				this.lcinsamount = lcinsamount;
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
		 * @return the amountreceive
		 */
		public Double getAmountreceive()
			{
				return this.amountreceive;
			}

		/**
		 * @param amountreceive
		 *            the amountreceive to set
		 */
		public void setAmountreceive(final Double amountreceive)
			{
				this.amountreceive = amountreceive;
			}

		/**
		 * @return the wop
		 */
		public String getWop()
			{
				return this.wop;
			}

		/**
		 * @param wop
		 *            the wop to set
		 */
		public void setWop(final String wop)
			{
				this.wop = wop;
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
		 * @return the prepaidamount
		 */
		public Double getPrepaidamount()
			{
				return this.prepaidamount;
			}

		/**
		 * @param prepaidamount
		 *            the prepaidamount to set
		 */
		public void setPrepaidamount(final Double prepaidamount)
			{
				this.prepaidamount = prepaidamount;
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
		 * @return the receiveService
		 */
		public PaymentReceiveService getReceiveService()
			{
				return this.receiveService;
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
		 * @return the maximuminstallment
		 */
		public Double getMaximuminstallment()
			{
				return this.maximuminstallment;
			}

		/**
		 * @param maximuminstallment
		 *            the maximuminstallment to set
		 */
		public void setMaximuminstallment(final Double maximuminstallment)
			{
				this.maximuminstallment = maximuminstallment;
			}

		/**
		 * @return the maximuminsurance
		 */
		public Double getMaximuminsurance()
			{
				return this.maximuminsurance;
			}

		/**
		 * @param maximuminsurance
		 *            the maximuminsurance to set
		 */
		public void setMaximuminsurance(final Double maximuminsurance)
			{
				this.maximuminsurance = maximuminsurance;
			}

		/**
		 * @return the maximumlcinsurance
		 */
		public Double getMaximumlcinsurance()
			{
				return this.maximumlcinsurance;
			}

		/**
		 * @param maximumlcinsurance
		 *            the maximumlcinsurance to set
		 */
		public void setMaximumlcinsurance(final Double maximumlcinsurance)
			{
				this.maximumlcinsurance = maximumlcinsurance;
			}

		/**
		 * @return the maximumlcinstallment
		 */
		public Double getMaximumlcinstallment()
			{
				return this.maximumlcinstallment;
			}

		/**
		 * @param maximumlcinstallment
		 *            the maximumlcinstallment to set
		 */
		public void setMaximumlcinstallment(final Double maximumlcinstallment)
			{
				this.maximumlcinstallment = maximumlcinstallment;
			}
	}
