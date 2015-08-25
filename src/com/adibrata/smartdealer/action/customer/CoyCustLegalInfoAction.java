
package com.adibrata.smartdealer.action.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.CoyCustLegalInfo;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class CoyCustLegalInfoAction extends BaseAction implements Preparable
	{
		
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		
		private CustomerMaintService customermaintservice;
		private Customer customer;
		private Map<String, Object> session;
		private List<CoyCustLegalInfo> lstlegalinfo;
		
		private String mode;
		private String message;
		private String usrUpd;
		private String usrCrt;
		private long id;
		private long customerid;
		
		private int seqno;
		private String documenttype;
		private String documentno;
		private String documentdate;
		private String documentexpireddate;
		private String documentnotes;
		
		public CoyCustLegalInfoAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				
				this.customermaintservice = new CustomerDao();
				this.customer = new Customer();
				this.lstlegalinfo = new ArrayList<CoyCustLegalInfo>();
				
				this.customerid = this.customer.getId();
				this.seqno = 1;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public void prepare() throws Exception
			{
				try
					{
						// TODO Auto-generated method stub
						this.session = ActionContext.getContext().getSession();
						if (this.session.get("lstLegalInfoSession") != null)
							{
								this.lstlegalinfo = (List<CoyCustLegalInfo>) this.session.get("lstLegalInfoSession");
							}
					}
				catch (final Exception e)
					{
						// TODO: handle exception
						e.printStackTrace();
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
								case "add" :
									try
										{
											this.Add();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "del" :
									try
										{
											this.Del();
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
								strMode = INPUT;
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				return strMode;
			}
			
		public void Add() throws Exception
			{
				try
					{
						final CoyCustLegalInfo legalinfo = new CoyCustLegalInfo();
						
						legalinfo.setDocumentType(this.getDocumenttype());
						legalinfo.setDocumentNo(this.getDocumentno());
						legalinfo.setDocumentDate(this.dateformat.parse(this.getDocumentdate()));
						legalinfo.setDocumentExpiredDate(this.dateformat.parse(this.getDocumentexpireddate()));
						legalinfo.setDocumentNotes(this.getDocumentnotes());
						
						this.lstlegalinfo.add(legalinfo);
						this.session.put("lstLegalInfoSession", this.lstlegalinfo);
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
		public void Del() throws Exception
			{
				try
					{
						this.lstlegalinfo = (List<CoyCustLegalInfo>) this.session.get("lstLegalInfoSession");
						this.seqno = this.seqno - 1;
						this.lstlegalinfo.remove(this.seqno);
						
						this.session.put("lstLegalInfoSession", this.lstlegalinfo);
						this.lstlegalinfo = (List<CoyCustLegalInfo>) this.session.get("lstLegalInfoSession");
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
			
		public void Save() throws Exception
			{
				try
					{
						for (final CoyCustLegalInfo legalinfo : this.lstlegalinfo)
							{
								legalinfo.setCustomer(this.getCustomer());
								legalinfo.setDocumentType(this.getDocumenttype());
								legalinfo.setDocumentNo(this.getDocumentno());
								legalinfo.setDocumentDate(this.dateformat.parse(this.getDocumentdate()));
								legalinfo.setDocumentExpiredDate(this.dateformat.parse(this.getDocumentexpireddate()));
								legalinfo.setDocumentNotes(this.getDocumentnotes());
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
			
		public CustomerMaintService getCustomermaintservice()
			{
				return this.customermaintservice;
			}
			
		public void setCustomermaintservice(final CustomerMaintService customermaintservice)
			{
				this.customermaintservice = customermaintservice;
			}
			
		public Customer getCustomer()
			{
				return this.customer;
			}
			
		public void setCustomer(final Customer customer)
			{
				this.customer = customer;
			}
			
		public Map<String, Object> getSession()
			{
				return this.session;
			}
			
		public void setSession(final Map<String, Object> session)
			{
				this.session = session;
			}
			
		public List<CoyCustLegalInfo> getLstlegalinfo()
			{
				return this.lstlegalinfo;
			}
			
		public void setLstlegalinfo(final List<CoyCustLegalInfo> lstlegalinfo)
			{
				this.lstlegalinfo = lstlegalinfo;
			}
			
		public String getMode()
			{
				return this.mode;
			}
			
		public void setMode(final String mode)
			{
				this.mode = mode;
			}
			
		public String getMessage()
			{
				return this.message;
			}
			
		public void setMessage(final String message)
			{
				this.message = message;
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
			
		public long getId()
			{
				return this.id;
			}
			
		public void setId(final long id)
			{
				this.id = id;
			}
			
		public String getDocumenttype()
			{
				return this.documenttype;
			}
			
		public void setDocumenttype(final String documenttype)
			{
				this.documenttype = documenttype;
			}
			
		public String getDocumentno()
			{
				return this.documentno;
			}
			
		public void setDocumentno(final String documentno)
			{
				this.documentno = documentno;
			}
			
		public String getDocumentdate()
			{
				return this.documentdate;
			}
			
		public void setDocumentdate(final String documentdate)
			{
				this.documentdate = documentdate;
			}
			
		public String getDocumentexpireddate()
			{
				return this.documentexpireddate;
			}
			
		public void setDocumentexpireddate(final String documentexpireddate)
			{
				this.documentexpireddate = documentexpireddate;
			}
			
		public String getDocumentnotes()
			{
				return this.documentnotes;
			}
			
		public void setDocumentnotes(final String documentnotes)
			{
				this.documentnotes = documentnotes;
			}
			
		public int getSeqno()
			{
				return this.seqno;
			}
			
		public void setSeqno(final int seqno)
			{
				this.seqno = seqno;
			}
			
		public long getCustomerid()
			{
				return this.customerid;
			}
			
		public void setCustomerid(final long customerid)
			{
				this.customerid = customerid;
			}
			
	}
