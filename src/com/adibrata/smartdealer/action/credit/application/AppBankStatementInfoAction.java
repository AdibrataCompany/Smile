
package com.adibrata.smartdealer.action.credit.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.credit.ApplicationDataDao;
import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.AgrmntBankStatInfoDtl;
import com.adibrata.smartdealer.model.AgrmntBankStatementInfo;
import com.adibrata.smartdealer.service.credit.ApplicationDataService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AppBankStatementInfoAction extends BaseAction implements Preparable
	{
		
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		
		private String message;
		private String mode;
		private String usrUpd;
		private String usrCrt;
		
		private Agrmnt agrmnt;
		private AgrmntBankStatementInfo bankinfo;
		private List<AgrmntBankStatInfoDtl> lstbankdetail;
		
		private ApplicationDataService service;
		private Map<String, Object> dtl;
		
		private long id;
		private Long agrmntid;
		
		private String bankcode;
		private String bankbranch;
		private String accountno;
		private String accountname;
		private Double creditceiling;
		private String typeofcredit;
		private Double interest;
		private String security;
		private Double startingbalance;
		private Double deposito;
		
		private Short seqno;
		private Byte bankmonth;
		private Short bankyear;
		private Double bankdebit;
		private Double bankbalance;
		private Double hidebitcredit;
		private Double lodebitcredit;
		private Short mutasidebit;
		private Short mutasicredit;
		private Short avgbalance;
		
		public AppBankStatementInfoAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.service = new ApplicationDataDao();
				
				this.agrmnt = new Agrmnt();
				this.agrmnt.setId(this.getAgrmntid());
				
				this.lstbankdetail = new ArrayList<AgrmntBankStatInfoDtl>();
				this.seqno = 1;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				this.dtl = ActionContext.getContext().getSession();
				if (this.dtl.get("dtl") != null)
					{
						this.lstbankdetail = (List<AgrmntBankStatInfoDtl>) this.dtl.get("dtl");
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
								case "deldetail" :
									try
										{
											this.DelDetail();
											
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
								strMode = "start";
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				return strMode;
			}
			
		private void AddDetail() throws Exception
			{
				try
					{
						final AgrmntBankStatInfoDtl bankdetail = new AgrmntBankStatInfoDtl();
						bankdetail.setSeqNo(this.getSeqno());
						bankdetail.setBankMonth(this.getBankmonth());
						bankdetail.setBankYear(this.getBankyear());
						bankdetail.setBankDebit(this.getBankdebit());
						bankdetail.setBankBalance(this.getBankbalance());
						bankdetail.setHiDebitCredit(this.getHidebitcredit());
						bankdetail.setLoDebitCredit(this.getLodebitcredit());
						bankdetail.setMutasiDebit(this.getMutasidebit());
						bankdetail.setMutasiCredit(this.getMutasicredit());
						bankdetail.setAvgBalance(this.getAvgbalance());
						this.dtl.put("dtl", this.lstbankdetail);
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
						this.lstbankdetail = (List<AgrmntBankStatInfoDtl>) this.dtl.get("dtl");
						this.seqno = (short) (this.seqno - 1);
						this.lstbankdetail.remove(this.seqno);
						
						this.dtl.put("dtl", this.lstbankdetail);
						this.lstbankdetail = (List<AgrmntBankStatInfoDtl>) this.dtl.get("dtl");
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
			
		public String Save() throws Exception
			{
				try
					{
						this.bankinfo = new AgrmntBankStatementInfo();
						this.bankinfo.setAgrmnt(this.getAgrmnt());
						this.bankinfo.setBankCode(this.getBankcode());
						this.bankinfo.setBankBranch(this.getBankbranch());
						this.bankinfo.setAccountNo(this.getAccountno());
						this.bankinfo.setAccountName(this.getAccountname());
						this.bankinfo.setCreditCeiling(this.getCreditceiling());
						this.bankinfo.setTypeOfCredit(this.getTypeofcredit());
						this.bankinfo.setInterest(this.getInterest());
						this.bankinfo.setSecurity(this.getSecurity());
						this.bankinfo.setStartingBalance(this.getStartingbalance());
						this.bankinfo.setDeposito(this.getDeposito());
						this.bankinfo.setUsrUpd(BaseAction.sesLoginName());
						
						this.setMessage(BaseAction.SuccessMessage());
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
			
		public String getMessage()
			{
				return this.message;
			}
			
		public void setMessage(final String message)
			{
				this.message = message;
			}
			
		public String getMode()
			{
				return this.mode;
			}
			
		public void setMode(final String mode)
			{
				this.mode = mode;
			}
			
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
			
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
			}
			
		public Agrmnt getAgrmnt()
			{
				return this.agrmnt;
			}
			
		public void setAgrmnt(final Agrmnt agrmnt)
			{
				this.agrmnt = agrmnt;
			}
			
		public AgrmntBankStatementInfo getBankinfo()
			{
				return this.bankinfo;
			}
			
		public void setBankinfo(final AgrmntBankStatementInfo bankinfo)
			{
				this.bankinfo = bankinfo;
			}
			
		public List<AgrmntBankStatInfoDtl> getLstbankdetail()
			{
				return this.lstbankdetail;
			}
			
		public void setLstbankdetail(final List<AgrmntBankStatInfoDtl> lstbankdetail)
			{
				this.lstbankdetail = lstbankdetail;
			}
			
		public ApplicationDataService getService()
			{
				return this.service;
			}
			
		public void setService(final ApplicationDataService service)
			{
				this.service = service;
			}
			
		public long getId()
			{
				return this.id;
			}
			
		public void setId(final long id)
			{
				this.id = id;
			}
			
		public Long getAgrmntid()
			{
				return this.agrmntid;
			}
			
		public void setAgrmntid(final Long agrmntid)
			{
				this.agrmntid = agrmntid;
			}
			
		public String getBankcode()
			{
				return this.bankcode;
			}
			
		public void setBankcode(final String bankcode)
			{
				this.bankcode = bankcode;
			}
			
		public String getBankbranch()
			{
				return this.bankbranch;
			}
			
		public void setBankbranch(final String bankbranch)
			{
				this.bankbranch = bankbranch;
			}
			
		public String getAccountno()
			{
				return this.accountno;
			}
			
		public void setAccountno(final String accountno)
			{
				this.accountno = accountno;
			}
			
		public String getAccountname()
			{
				return this.accountname;
			}
			
		public void setAccountname(final String accountname)
			{
				this.accountname = accountname;
			}
			
		public Double getCreditceiling()
			{
				return this.creditceiling;
			}
			
		public void setCreditceiling(final Double creditceiling)
			{
				this.creditceiling = creditceiling;
			}
			
		public String getTypeofcredit()
			{
				return this.typeofcredit;
			}
			
		public void setTypeofcredit(final String typeofcredit)
			{
				this.typeofcredit = typeofcredit;
			}
			
		public Double getInterest()
			{
				return this.interest;
			}
			
		public void setInterest(final Double interest)
			{
				this.interest = interest;
			}
			
		public String getSecurity()
			{
				return this.security;
			}
			
		public void setSecurity(final String security)
			{
				this.security = security;
			}
			
		public Double getStartingbalance()
			{
				return this.startingbalance;
			}
			
		public void setStartingbalance(final Double startingbalance)
			{
				this.startingbalance = startingbalance;
			}
			
		public Double getDeposito()
			{
				return this.deposito;
			}
			
		public void setDeposito(final Double deposito)
			{
				this.deposito = deposito;
			}
			
		public Byte getBankmonth()
			{
				return this.bankmonth;
			}
			
		public void setBankmonth(final Byte bankmonth)
			{
				this.bankmonth = bankmonth;
			}
			
		public Short getBankyear()
			{
				return this.bankyear;
			}
			
		public void setBankyear(final Short bankyear)
			{
				this.bankyear = bankyear;
			}
			
		public Double getBankdebit()
			{
				return this.bankdebit;
			}
			
		public void setBankdebit(final Double bankdebit)
			{
				this.bankdebit = bankdebit;
			}
			
		public Double getBankbalance()
			{
				return this.bankbalance;
			}
			
		public void setBankbalance(final Double bankbalance)
			{
				this.bankbalance = bankbalance;
			}
			
		public Double getHidebitcredit()
			{
				return this.hidebitcredit;
			}
			
		public void setHidebitcredit(final Double hidebitcredit)
			{
				this.hidebitcredit = hidebitcredit;
			}
			
		public Double getLodebitcredit()
			{
				return this.lodebitcredit;
			}
			
		public void setLodebitcredit(final Double lodebitcredit)
			{
				this.lodebitcredit = lodebitcredit;
			}
			
		public Short getMutasidebit()
			{
				return this.mutasidebit;
			}
			
		public void setMutasidebit(final Short mutasidebit)
			{
				this.mutasidebit = mutasidebit;
			}
			
		public Short getMutasicredit()
			{
				return this.mutasicredit;
			}
			
		public void setMutasicredit(final Short mutasicredit)
			{
				this.mutasicredit = mutasicredit;
			}
			
		public Short getAvgbalance()
			{
				return this.avgbalance;
			}
			
		public void setAvgbalance(final Short avgbalance)
			{
				this.avgbalance = avgbalance;
			}
			
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
		public Map<String, Object> getDtl()
			{
				return this.dtl;
			}
			
		public void setDtl(final Map<String, Object> dtl)
			{
				this.dtl = dtl;
			}
			
		public Short getSeqno()
			{
				return this.seqno;
			}
			
		public void setSeqno(final Short seqno)
			{
				this.seqno = seqno;
			}
			
	}
