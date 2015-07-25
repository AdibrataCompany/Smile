
package com.adibrata.smartdealer.action.othertrans;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.othertrans.OtherReceiveDao;
import com.adibrata.smartdealer.dao.setting.BankAccountDao;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.OtherRcvDtl;
import com.adibrata.smartdealer.model.OtherRcvHdr;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.othertransactions.OtherReceiveService;
import com.adibrata.smartdealer.service.setting.BankAccountService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.date.DateConvertion;
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

		private long id;

		private String message;
		private String mode;
		private Map<String, Object> headersession;
		private Map<String, Object> session;
		private String rcvFrom;
		private Double rcvAmount;
		private String reffNo;
		private Date postingDate;
		private String valueDate;
		private Long bankAccountId;
		private String notes;
		private String coaName;
		private String coaCode;
		private Double amount;
		private String description;
		private int SeqNo;
		private double totalAmount;
		
		private List<BankAccount> bankAccounts;
		private BankAccount bankAccount;
		private BankAccountService bankAccountService;
		private Map<Long, String> bankAccountList;

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
						this.Initialisasi();
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
						this.session = ActionContext.getContext().getSession();
						if (this.session.get("lstOtherRcvDtlSession") != null)
							{
								this.lstOtherRcvDtl = (List<OtherRcvDtl>) this.session.get("lstOtherRcvDtlSession");
							}
						this.bankAccountComboBox();
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

						this.Initialisasi();
						strMode = "start";
					}
				return strMode;
			}

		private void Initialisasi()
			{
				RenderMenu();
				this.office.setId(sesOfficeId());
				this.partner.setPartnerCode(sesPartnerCode());
				this.lstOtherRcvDtl = new ArrayList<OtherRcvDtl>();
				this.otherRcvHdr = new OtherRcvHdr();
				this.SeqNo = 1;
			}

		private void SaveAdd() throws Exception
			{
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
			}

		@SuppressWarnings("unchecked")
		private void SaveDel() throws Exception
			{
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
						otherRcvHdr.setRcvFrom(this.rcvFrom);
						otherRcvHdr.setRcvAmount(this.rcvAmount);
						otherRcvHdr.setReffNo(this.reffNo);
						otherRcvHdr.setValueDate(DateConvertion.convertStringToDate(this.valueDate));
						otherRcvHdr.setBankAccountId(this.bankAccountId);
						otherRcvHdr.setNotes(this.notes);

						for (final OtherRcvDtl aRow : this.lstOtherRcvDtl)
							{
								aRow.setCoaName(this.coaName);
								aRow.setCoaCode(this.coaCode);
								aRow.setAmount(this.amount);
								aRow.setDescription(this.description);
							}
							
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

		public void bankAccountComboBox() throws Exception
			{
				try
					{

						this.bankAccounts = this.bankAccountService.list();

						this.bankAccountList = new HashMap<Long, String>();

						for (final Iterator<BankAccount> iterator = this.bankAccounts.iterator(); iterator.hasNext();)
							{
								this.bankAccount = iterator.next();
								this.bankAccountList.put(this.bankAccount.getId(), this.bankAccount.getBankAccountName().trim());
							}
						System.out.println("bankAccountList" + this.bankAccountList);
					}
				catch (final Exception e)
					{
						// TODO: handle exception
						e.printStackTrace();
					}
			}

		public Office getOffice()
			{
				return this.office;
			}

		public void setOffice(final Office office)
			{
				this.office = office;
			}

		public Partner getPartner()
			{
				return this.partner;
			}

		public void setPartner(final Partner partner)
			{
				this.partner = partner;
			}

		public OtherReceiveService getOtherReceiveService()
			{
				return this.otherReceiveService;
			}

		public void setOtherReceiveService(final OtherReceiveService otherReceiveService)
			{
				this.otherReceiveService = otherReceiveService;
			}

		public long getId()
			{
				return this.id;
			}

		public void setId(final long id)
			{
				this.id = id;
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

		public String getRcvFrom()
			{
				return this.rcvFrom;
			}

		public void setRcvFrom(final String rcvFrom)
			{
				this.rcvFrom = rcvFrom;
			}
			
		// @RequiredFieldValidator(message = "The name is required")
		public Double getRcvAmount()
			{
				return this.rcvAmount;
			}

		public void setRcvAmount(final Double rcvAmount)
			{
				this.rcvAmount = rcvAmount;
			}

		public String getReffNo()
			{
				return this.reffNo;
			}

		public void setReffNo(final String reffNo)
			{
				this.reffNo = reffNo;
			}

		public Date getPostingDate()
			{
				return this.postingDate;
			}

		public void setPostingDate(final Date postingDate)
			{
				this.postingDate = postingDate;
			}

		public Long getBankAccountId()
			{
				return this.bankAccountId;
			}

		public void setBankAccountId(final Long bankAccountId)
			{
				this.bankAccountId = bankAccountId;
			}

		public String getNotes()
			{
				return this.notes;
			}

		public void setNotes(final String notes)
			{
				this.notes = notes;
			}

		public String getCoaName()
			{
				return this.coaName;
			}

		public void setCoaName(final String coaName)
			{
				this.coaName = coaName;
			}

		public String getCoaCode()
			{
				return this.coaCode;
			}

		public void setCoaCode(final String coaCode)
			{
				this.coaCode = coaCode;
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

		public String getMode()
			{
				return this.mode;
			}

		public void setMode(final String mode)
			{
				this.mode = mode;
			}

		public List<OtherRcvDtl> getLstOtherRcvDtl()
			{
				return this.lstOtherRcvDtl;
			}

		public void setLstOtherRcvDtl(final List<OtherRcvDtl> lstOtherRcvDtl)
			{
				this.lstOtherRcvDtl = lstOtherRcvDtl;
			}

		public OtherRcvHdr getOtherRcvHdr()
			{
				return this.otherRcvHdr;
			}

		public void setOtherRcvHdr(final OtherRcvHdr otherRcvHdr)
			{

				this.otherRcvHdr = otherRcvHdr;
			}

		public int getSeqNo()
			{
				return this.SeqNo;
			}

		public void setSeqNo(final int seqNo)
			{
				this.SeqNo = seqNo;
			}

		public double getTotalAmount()
			{
				return this.totalAmount;
			}

		public void setTotalAmount(final double totalAmount)
			{
				this.totalAmount = totalAmount;
			}

		public Map<String, Object> getHeadersession()
			{
				return this.headersession;
			}

		public void setHeadersession(final Map<String, Object> headersession)
			{
				this.headersession = headersession;
			}
			
		public BankAccount getBankAccount()
			{
				return this.bankAccount;
			}
			
		public void setBankAccount(final BankAccount bankAccount)
			{
				this.bankAccount = bankAccount;
			}
			
		public List<BankAccount> getBankAccounts()
			{
				return this.bankAccounts;
			}
			
		public void setBankAccounts(final List<BankAccount> bankAccounts)
			{
				this.bankAccounts = bankAccounts;
			}

		public Map<Long, String> getBankAccountList()
			{
				return this.bankAccountList;
			}

		public void setBankAccountList(final Map<Long, String> bankAccountList)
			{
				this.bankAccountList = bankAccountList;
			}

		public BankAccountService getBankAccountService()
			{
				return this.bankAccountService;
			}
			
		public void setBankAccountService(final BankAccountService bankAccountService)
			{
				this.bankAccountService = bankAccountService;
			}

		public String getValueDate()
			{
				return this.valueDate;
			}

		public void setValueDate(final String valueDate)
			{
				this.valueDate = valueDate;
			}

	}
