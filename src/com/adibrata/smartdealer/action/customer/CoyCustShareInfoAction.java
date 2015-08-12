
package com.adibrata.smartdealer.action.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.CoyCustShareInfo;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class CoyCustShareInfoAction extends BaseAction implements Preparable
	{

		/**
		*
		*/
		private static final long serialVersionUID = 1L;

		private CustomerMaintService customermaintservice;
		private Customer customer;
		private Map<String, Object> session;
		private List<CoyCustShareInfo> lstshareinfo;

		private String mode;
		private String message;
		private String usrUpd;
		private String usrCrt;
		private long id;
		private long customerid;

		private String name;
		private String idnumber;
		private String jobpositionid;
		private String address;
		private String phone;
		private Double sharepercentage;
		private int seqno;

		public CoyCustShareInfoAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				RenderMenu();

				this.customermaintservice = new CustomerDao();
				this.customer = new Customer();
				this.lstshareinfo = new ArrayList<CoyCustShareInfo>();

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
						if (this.session.get("lstShareInfoSession") != null)
							{
								this.lstshareinfo = (List<CoyCustShareInfo>) this.session.get("lstShareInfoSession");
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
						final CoyCustShareInfo shareinfo = new CoyCustShareInfo();

						shareinfo.setName(this.getName());
						shareinfo.setIdnumber(this.getIdnumber());
						shareinfo.setJobPositionId(this.getJobpositionid());
						shareinfo.setAddress(this.getAddress());
						shareinfo.setPhone(this.getPhone());
						shareinfo.setSharePercentage(this.getSharepercentage());

						this.lstshareinfo.add(shareinfo);
						this.session.put("lstShareInfoSession", this.lstshareinfo);
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
						this.lstshareinfo = (List<CoyCustShareInfo>) this.session.get("lstShareInfoSession");
						this.seqno = this.seqno - 1;
						this.lstshareinfo.remove(this.seqno);

						this.session.put("lstShareInfoSession", this.lstshareinfo);
						this.lstshareinfo = (List<CoyCustShareInfo>) this.session.get("lstShareInfoSession");
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
						for (final CoyCustShareInfo shareinfo : this.lstshareinfo)
							{
								shareinfo.setCustomer(this.getCustomer());
								shareinfo.setName(this.getName());
								shareinfo.setIdnumber(this.getIdnumber());
								shareinfo.setJobPositionId(this.getJobpositionid());
								shareinfo.setAddress(this.getAddress());
								shareinfo.setPhone(this.getPhone());
								shareinfo.setSharePercentage(this.getSharepercentage());
							}

						this.customermaintservice.SaveCompanyCustomerShare(sesLoginName(), this.lstshareinfo);
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

		public List<CoyCustShareInfo> getLstshareinfo()
			{
				return this.lstshareinfo;
			}

		public void setLstshareinfo(final List<CoyCustShareInfo> lstshareinfo)
			{
				this.lstshareinfo = lstshareinfo;
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

		public String getJobpositionid()
			{
				return this.jobpositionid;
			}

		public void setJobpositionid(final String jobpositionid)
			{
				this.jobpositionid = jobpositionid;
			}

		public String getAddress()
			{
				return this.address;
			}

		public void setAddress(final String address)
			{
				this.address = address;
			}

		public String getPhone()
			{
				return this.phone;
			}

		public void setPhone(final String phone)
			{
				this.phone = phone;
			}

		public Double getSharepercentage()
			{
				return this.sharepercentage;
			}

		public void setSharepercentage(final Double sharepercentage)
			{
				this.sharepercentage = sharepercentage;
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
