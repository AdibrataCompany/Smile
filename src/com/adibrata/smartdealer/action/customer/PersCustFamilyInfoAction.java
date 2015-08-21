
package com.adibrata.smartdealer.action.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.PersCustFamilyInfo;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PersCustFamilyInfoAction extends BaseAction implements Preparable
	{

		/**
		*
		*/
		private static final long serialVersionUID = 1L;

		private CustomerMaintService customermaintservice;
		private Customer customer;
		private Map<String, Object> session;
		private List<PersCustFamilyInfo> lstfamilyinfo;

		private String mode;
		private String message;
		private String usrUpd;
		private String usrCrt;
		private long id;
		private long customerid;

		private int seqno;
		private String name;
		private String idnumber;
		private String birthdate;
		private String familyrelationcode;

		public PersCustFamilyInfoAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				RenderMenu();

				this.customermaintservice = new CustomerDao();
				this.customer = new Customer();
				this.lstfamilyinfo = new ArrayList<PersCustFamilyInfo>();

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
						if (this.session.get("lstFamilyInfoSession") != null)
							{
								this.lstfamilyinfo = (List<PersCustFamilyInfo>) this.session.get("lstFamilyInfoSession");
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
											this.Save();
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

		public void Add() throws Exception
			{
				try
					{
						final PersCustFamilyInfo familyinfo = new PersCustFamilyInfo();

						familyinfo.setName(this.getName());
						familyinfo.setIdnumber(this.getIdnumber());
						familyinfo.setBirthDate(this.dateformat.parse(this.getBirthdate()));
						familyinfo.setFamilyRelationCode(this.getFamilyrelationcode());

						this.lstfamilyinfo.add(familyinfo);
						this.session.put("lstFamilyInfoSession", this.lstfamilyinfo);
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
						this.lstfamilyinfo = (List<PersCustFamilyInfo>) this.session.get("lstFamilyInfoSession");
						this.seqno = this.seqno - 1;
						this.lstfamilyinfo.remove(this.seqno);

						this.session.put("lstCreditCardSession", this.lstfamilyinfo);
						this.lstfamilyinfo = (List<PersCustFamilyInfo>) this.session.get("lstFamilyInfoSession");
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
						for (final PersCustFamilyInfo familyinfo : this.lstfamilyinfo)
							{
								familyinfo.setCustomer(this.getCustomer());
								familyinfo.setName(this.getName());
								familyinfo.setIdnumber(this.getIdnumber());
								familyinfo.setBirthDate(this.dateformat.parse(this.getBirthdate()));
								familyinfo.setFamilyRelationCode(this.getFamilyrelationcode());
							}

						this.customermaintservice.SavePersonalCustomerFamily(sesLoginName(), this.lstfamilyinfo);
						;
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

		public List<PersCustFamilyInfo> getLstfamilyinfo()
			{
				return this.lstfamilyinfo;
			}

		public void setLstfamilyinfo(final List<PersCustFamilyInfo> lstfamilyinfo)
			{
				this.lstfamilyinfo = lstfamilyinfo;
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

		public String getName()
			{
				return this.name;
			}

		public void setName(final String name)
			{
				this.name = name;
			}

		public String getIdnumber()
			{
				return this.idnumber;
			}

		public void setIdnumber(final String idnumber)
			{
				this.idnumber = idnumber;
			}

		public String getFamilyrelationcode()
			{
				return this.familyrelationcode;
			}

		public void setFamilyrelationcode(final String familyrelationcode)
			{
				this.familyrelationcode = familyrelationcode;
			}

		public String getBirthdate()
			{
				return this.birthdate;
			}

		public void setBirthdate(final String birthdate)
			{
				this.birthdate = birthdate;
			}

		public long getCustomerid()
			{
				return this.customerid;
			}

		public void setCustomerid(final long customerid)
			{
				this.customerid = customerid;
			}

		public int getSeqno()
			{
				return this.seqno;
			}

		public void setSeqno(final int seqno)
			{
				this.seqno = seqno;
			}

	}
