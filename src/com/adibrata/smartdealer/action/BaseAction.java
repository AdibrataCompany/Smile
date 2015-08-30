
package com.adibrata.smartdealer.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.adibrata.smartdealer.dao.setting.BankAccountDao;
import com.adibrata.smartdealer.dao.setting.CurrencyDao;
import com.adibrata.smartdealer.dao.setting.OfficeDao;
import com.adibrata.smartdealer.dao.usermanagement.EmployeeDao;
import com.adibrata.smartdealer.dao.usermanagement.MenuDao;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.BankAccountInfo;
import com.adibrata.smartdealer.model.Currency;
import com.adibrata.smartdealer.model.Employee;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.BankAccountService;
import com.adibrata.smartdealer.service.setting.CurrencyService;
import com.adibrata.smartdealer.service.setting.OfficeService;
import com.adibrata.smartdealer.service.usermanagement.EmployeeService;
import com.adibrata.smartdealer.service.usermanagement.MenuService;
import com.opensymphony.xwork2.ActionSupport;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class BaseAction extends ActionSupport implements SessionAware
	{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String messagedescription;
		private String menu;
		public SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		private static Map<String, Object> objpartner;
		
		private static Map<String, Object> objloginname;
		
		public BaseAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.menu = RenderMenu();
				// this.testsession = BaseAction.sesPartnerCode();
			}

		@Override
		public void setSession(final Map<String, Object> session)
			{
				// TODO Auto-generated method stub
				objpartner = session;
				objloginname = session;
				
			}

		private static String RenderMenu() throws Exception
			{
				final StringBuilder menu = new StringBuilder();
				final MenuService service = new MenuDao();
				menu.append(service.MenuRender((long) 0, (long) 0, (long) 0));

				menu.append("<li class=\"dropdown\"> \n <a href=\"");
				menu.append("/Smile/signin.action");
				menu.append("\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">");
				menu.append("Logout");
				menu.append("</a> \n");
				menu.append("<ul class=\"dropdown-menu\">");
				menu.append("<li><a href=\"/Smile/signin.action\">Logout</a></li>");
				menu.append(" </ul>\n ");
				menu.append("</li>\n ");
				return menu.toString();
			}
			
		public static String ErrorMessage()
			{
				return "Failed on Save";

			}

		public static Long sesCashierHistoryId()
			{
				return (long) 1;
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

				return PartnerCodeInfo();
			}
			
		private static String PartnerCodeInfo()
			{
				Partner partner = new Partner();
				partner = (Partner) objpartner.get("Partner");

				return partner.getPartnerCode();
			}

		public static String sesLoginName()
			{
				return (String) objloginname.get("LoginName");
			}

		public static Long sesEmployeeId()
			{
				return (long) 1;
			}

		public static Long sesUserId()
			{
				return (long) 1;
			}

		public static Date sesBussinessDate() throws ParseException
			{
				final SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
				return df.parse(df.format(Calendar.getInstance().getTime()));

			}

		public BankAccountInfo BankInfo(final Long id) throws Exception
			{
				final BankAccountService service = new BankAccountDao();
				return service.BankAccountView(id);
			}

		public static Long sesOfficeId()
			{
				return (long) 1;
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

		public Map<Long, String> ListCurrency(final Partner partner) throws Exception
			{
				final Map<Long, String> map = new HashMap<Long, String>();
				try
					{
						final CurrencyService service = new CurrencyDao();
						final List<Currency> lst = service.CurrencyList(partner);

						for (final Currency row : lst)
							{
								map.put(row.getId(), row.getCode().trim());
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

		public Map<Long, String> ListOffice(final Partner partner) throws Exception
			{
				final Map<Long, String> map = new HashMap<Long, String>();
				try
					{

						final OfficeService service = new OfficeDao();
						final List<Office> lst = service.ListOffice(partner);

						for (final Office row : lst)
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

		/**
		 * @return the menu
		 */
		public String getMenu()
			{
				return this.menu;
			}

		/**
		 * @param menu
		 *            the menu to set
		 */
		public void setMenu(final String menu)
			{
				this.menu = menu;
			}

		/**
		 * @return the dateformat
		 */
		public SimpleDateFormat getDateformat()
			{
				return this.dateformat;
			}

		/**
		 * @param dateformat
		 *            the dateformat to set
		 */
		public void setDateformat(final SimpleDateFormat dateformat)
			{
				this.dateformat = dateformat;
			}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

		/**
		 * @return the objpartner
		 */
		public static Map<String, Object> getObjpartner()
			{
				return objpartner;
			}

		/**
		 * @param objpartner
		 *            the objpartner to set
		 */
		public static void setObjpartner(final Map<String, Object> objpartner)
			{
				BaseAction.objpartner = objpartner;
			}

		/**
		 * @return the objloginname
		 */
		public static Map<String, Object> getObjloginname()
			{
				return objloginname;
			}

		/**
		 * @param objloginname
		 *            the objloginname to set
		 */
		public static void setObjloginname(final Map<String, Object> objloginname)
			{
				BaseAction.objloginname = objloginname;
			}

	}
