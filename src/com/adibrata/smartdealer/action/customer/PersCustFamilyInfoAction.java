
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
		
		private Long id;
		private Long customerid;
		
		private int seqno;
		private String name;
		private String idnumber;
		private String birthdate;
		private String familyrelationcode;
		
		public PersCustFamilyInfoAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				
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

		/**
		 * @return the customermaintservice
		 */
		public CustomerMaintService getCustomermaintservice()
			{
				return this.customermaintservice;
			}

		/**
		 * @param customermaintservice
		 *            the customermaintservice to set
		 */
		public void setCustomermaintservice(final CustomerMaintService customermaintservice)
			{
				this.customermaintservice = customermaintservice;
			}

		/**
		 * @return the customer
		 */
		public Customer getCustomer()
			{
				return this.customer;
			}

		/**
		 * @param customer
		 *            the customer to set
		 */
		public void setCustomer(final Customer customer)
			{
				this.customer = customer;
			}

		/**
		 * @return the session
		 */
		public Map<String, Object> getSession()
			{
				return this.session;
			}

		/**
		 * @param session
		 *            the session to set
		 */
		public void setSession(final Map<String, Object> session)
			{
				this.session = session;
			}

		/**
		 * @return the lstfamilyinfo
		 */
		public List<PersCustFamilyInfo> getLstfamilyinfo()
			{
				return this.lstfamilyinfo;
			}

		/**
		 * @param lstfamilyinfo
		 *            the lstfamilyinfo to set
		 */
		public void setLstfamilyinfo(final List<PersCustFamilyInfo> lstfamilyinfo)
			{
				this.lstfamilyinfo = lstfamilyinfo;
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
		 * @return the customerid
		 */
		public Long getCustomerid()
			{
				return this.customerid;
			}

		/**
		 * @param customerid
		 *            the customerid to set
		 */
		public void setCustomerid(final Long customerid)
			{
				this.customerid = customerid;
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
		 * @return the name
		 */
		public String getName()
			{
				return this.name;
			}

		/**
		 * @param name
		 *            the name to set
		 */
		public void setName(final String name)
			{
				this.name = name;
			}

		/**
		 * @return the idnumber
		 */
		public String getIdnumber()
			{
				return this.idnumber;
			}

		/**
		 * @param idnumber
		 *            the idnumber to set
		 */
		public void setIdnumber(final String idnumber)
			{
				this.idnumber = idnumber;
			}

		/**
		 * @return the birthdate
		 */
		public String getBirthdate()
			{
				return this.birthdate;
			}

		/**
		 * @param birthdate
		 *            the birthdate to set
		 */
		public void setBirthdate(final String birthdate)
			{
				this.birthdate = birthdate;
			}

		/**
		 * @return the familyrelationcode
		 */
		public String getFamilyrelationcode()
			{
				return this.familyrelationcode;
			}

		/**
		 * @param familyrelationcode
		 *            the familyrelationcode to set
		 */
		public void setFamilyrelationcode(final String familyrelationcode)
			{
				this.familyrelationcode = familyrelationcode;
			}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

	}
