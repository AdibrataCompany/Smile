
package com.adibrata.smartdealer.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.dao.setting.BankAccountDao;
import com.adibrata.smartdealer.dao.usermanagement.EmployeeDao;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.Employee;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.BankAccountService;
import com.adibrata.smartdealer.service.usermanagement.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class BaseAction extends ActionSupport implements Preparable
	{
		
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String messagedescription;
		
		public SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		
		public BaseAction()
			{
				// TODO Auto-generated constructor stub
			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
			}
			
		public static void RenderMenu()
			{
			
			}
			
		public static String ErrorMessage()
			{
				return "Failed on Save";
				
			}
			
		public static String SuccessMessage()
			{
				return "Success On Save";
				
			}

		public static String SelectFirst()
			{
				return "Please Select a Data First";
				
			}

		public static String sesPartnerCode()
			{
				return "001";
			}
			
		public static Date sesBussinessDate() throws ParseException
			{
				final SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
				return df.parse(df.format(Calendar.getInstance().getTime()));
				
			}
			
		public static long sesOfficeId()
			{
				return 1;
			}
			
		public static String sesLoginName()
			{
				return "Arga";
			}
			
		public static int PageRecord()
			{
				return 10;
			}
			
		/**
		 * @return the messagedescription
		 */
		public String getMessagedescription()
			{
				return this.messagedescription;
			}
			
		/**
		 * @param messagedescription
		 *            the messagedescription to set
		 */
		public void setMessagedescription(final String messagedescription)
			{
				this.messagedescription = messagedescription;
			}

		public Map<Long, String> ListBankAccount(final Partner partner, final Office office, final String type, final String purpose) throws Exception
			{
				final Map<Long, String> map = new HashMap<Long, String>();
				try
					{
						final BankAccountService bankaccountservice = new BankAccountDao();
						final List<BankAccount> lst = bankaccountservice.listBankAccount(partner, office, type, purpose);
						
						for (final BankAccount row : lst)
							{
								map.put(row.getId(), row.getBankAccountName().trim());
							}
					}
				catch (final Exception exp)
					{
						// TODO: handle exception
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
						exp.printStackTrace();
					}
				return map;
			}
			
		public Map<Long, String> ListEmployee(final Partner partner, final Office office) throws Exception
			{
				final Map<Long, String> map = new HashMap<Long, String>();
				try
					{
						
						final EmployeeService service = new EmployeeDao();
						final List<Employee> lst = service.ListEmployee(partner, office);
						
						for (final Employee row : lst)
							{
								map.put(row.getId(), row.getName().trim());
							}
					}
				catch (final Exception exp)
					{
						// TODO: handle exception
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
						exp.printStackTrace();
					}
				return map;
			}

		public Date DateAdd(final int add, final Date valuedate)
			{
				final Calendar c = Calendar.getInstance();
				c.setTime(valuedate);
				c.add(Calendar.DATE, add);
				return c.getTime();
			}
			
	}
