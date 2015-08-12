
package com.adibrata.smartdealer.action.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.customer.CustomerDao;
import com.adibrata.smartdealer.model.CoyCustComptInfo;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class CoyCustComptInfoAction extends BaseAction implements Preparable
	{

		/**
		*
		*/
		private static final long serialVersionUID = 1L;

		private CustomerMaintService customermaintservice;
		private Customer customer;
		private Map<String, Object> session;
		private List<CoyCustComptInfo> lstcomptinfo;

		private String mode;
		private String message;
		private String usrUpd;
		private String usrCrt;
		private long id;
		private long customerid;

		private int seqno;
		private String maincompetitor;
		private String location;
		private String concernedgoods;
		private double marketshare;

		public CoyCustComptInfoAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				RenderMenu();

				this.customermaintservice = new CustomerDao();
				this.customer = new Customer();
				this.lstcomptinfo = new ArrayList<CoyCustComptInfo>();

				this.customer.setId(this.getCustomerid());
				this.seqno = 0;
			}

		@SuppressWarnings("unchecked")
		@Override
		public void prepare() throws Exception
			{
				try
					{
						// TODO Auto-generated method stub
						this.session = ActionContext.getContext().getSession();
						if (this.session.get("lstComptInfoSession") != null)
							{
								this.lstcomptinfo = (List<CoyCustComptInfo>) this.session.get("lstComptInfoSession");
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
						final CoyCustComptInfo comptinfo = new CoyCustComptInfo();

						comptinfo.setMainCompetitor(this.getMaincompetitor());
						comptinfo.setLocation(this.getLocation());
						comptinfo.setConcernedGoods(this.getConcernedgoods());
						comptinfo.setMarketShare(this.getMarketshare());

						this.lstcomptinfo.add(comptinfo);
						this.session.put("lstComptInfoSession", this.lstcomptinfo);
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
						this.lstcomptinfo = (List<CoyCustComptInfo>) this.session.get("lstComptInfoSession");
						this.seqno = this.seqno - 1;
						this.lstcomptinfo.remove(this.seqno);

						this.session.put("lstCreditCardSession", this.lstcomptinfo);
						this.lstcomptinfo = (List<CoyCustComptInfo>) this.session.get("lstComptInfoSession");
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
						for (final CoyCustComptInfo comptinfo : this.lstcomptinfo)
							{
								comptinfo.setCustomer(this.getCustomer());
								comptinfo.setSeqNo((short) this.getSeqno());
								comptinfo.setMainCompetitor(this.getMaincompetitor());
								comptinfo.setLocation(this.getLocation());
								comptinfo.setConcernedGoods(this.getConcernedgoods());
								comptinfo.setMarketShare(this.getMarketshare());
							}

						this.customermaintservice.SaveCompanyCustomerCompetitor(sesLoginName(), this.lstcomptinfo);
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

		public List<CoyCustComptInfo> getLstcomptinfo()
			{
				return this.lstcomptinfo;
			}

		public void setLstcomptinfo(final List<CoyCustComptInfo> lstcomptinfo)
			{
				this.lstcomptinfo = lstcomptinfo;
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

		public String getMaincompetitor()
			{
				return this.maincompetitor;
			}

		public void setMaincompetitor(final String maincompetitor)
			{
				this.maincompetitor = maincompetitor;
			}

		public String getLocation()
			{
				return this.location;
			}

		public void setLocation(final String location)
			{
				this.location = location;
			}

		public String getConcernedgoods()
			{
				return this.concernedgoods;
			}

		public void setConcernedgoods(final String concernedgoods)
			{
				this.concernedgoods = concernedgoods;
			}

		public double getMarketshare()
			{
				return this.marketshare;
			}

		public void setMarketshare(final double marketshare)
			{
				this.marketshare = marketshare;
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
