
package com.adibrata.smartdealer.action.accmnt.cashieropen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.accmaint.OpenCashierDao;
import com.adibrata.smartdealer.model.CashierHistory;
import com.adibrata.smartdealer.model.Currency;
import com.adibrata.smartdealer.model.Employee;
import com.adibrata.smartdealer.model.HeadCashier;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.accmaint.OpenCashierService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class CashierOpenAction extends BaseAction implements Preparable
	{
		
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		private String mode;
		private String searchcriteria;
		private String searchvalue;
		private String usrUpd;
		private String usrCrt;
		private int pageNumber;
		private String message;
		private Long id;
		private Double openamount;
		private Double closeamount;
		private Long currencyid;
		private String cashiername;
		private Long employeeid;
		private String employeename;
		private OpenCashierService service;
		private CashierHistory history;
		private Map<Long, String> lstcashier;
		private Map<Long, String> lstcurrency;
		private final List<HeadCashier> lstheadstatus;
		Partner partner;
		Office office;
		String isHeadCashier;
		Employee employee = new Employee();
		
		public CashierOpenAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.office = new Office();

				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.office.setId(BaseAction.sesOfficeId());
				this.service = new OpenCashierDao();
				this.lstcurrency = this.ListCurrency(this.partner);
				this.lstcashier = this.ListCashier(this.partner, this.office);
				this.lstheadstatus = this.service.ListCashierStatus(this.partner, this.office, BaseAction.sesBussinessDate());
				this.history = new CashierHistory();
				
				this.employee.setId(BaseAction.sesEmployeeId());

				if (this.service.CheckHeadCashier(this.employee))
					{
						this.isHeadCashier = "1";

					}
				else
					{
						this.isHeadCashier = "0";

					}
			}

		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
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
			
		public Map<Long, String> ListCashier(final Partner partner, final Office office) throws Exception
			{
				final Map<Long, String> map = new HashMap<Long, String>();
				try
					{
						this.service = new OpenCashierDao();
						
						final List<Employee> lst = this.service.ListCashier(partner, office);
						
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
			
		public String OpenCashier() throws Exception
			{
				try
					{

						final Currency currency = new Currency();
						this.employee.setId(this.getEmployeeid());
						currency.setId(this.getCurrencyid());
						if (!this.service.CheckCashierOpen(this.partner, this.office, currency, this.employee, BaseAction.sesBussinessDate()))
							{
								final CashierHistory history = new CashierHistory();
								history.setEmployee(this.employee);
								history.setPartner(this.getPartner());
								history.setOffice(this.getOffice());
								history.setCurrency(currency);
								history.setOpeningAmount(this.getOpenamount());
								history.setUsrCrt(BaseAction.sesLoginName());
								history.setUsrUpd(BaseAction.sesLoginName());
								history.setOpenDate(BaseAction.sesBussinessDate());
								
								this.service.CashierOpen(history);
								this.mode = SUCCESS;
							}
						else
							{
								this.message = "Cashier Already Open";

							}
					}
				catch (final Exception exp)
					{
						this.mode = ERROR;
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.mode;
			}
			
		public String CloseCashier() throws Exception
			{
				try
					{
						
						final Currency currency = new Currency();
						this.employee.setId(this.getEmployeeid());

						currency.setId(this.getCurrencyid());
						if (!this.service.CheckCashierClose(this.partner, this.office, currency, this.employee, BaseAction.sesBussinessDate()))
							{
								this.history = this.service.View(this.service.IdCashierOpen(this.partner, this.office, this.employee, currency, BaseAction.sesBussinessDate()));
								this.history.setEmployee(this.employee);
								this.history.setPartner(this.getPartner());
								this.history.setOffice(this.getOffice());
								this.history.setCurrency(currency);
								this.history.setOpeningAmount(this.getOpenamount());
								this.history.setUsrCrt(BaseAction.sesLoginName());
								this.history.setUsrUpd(BaseAction.sesLoginName());
								this.history.setOpenDate(BaseAction.sesBussinessDate());

								this.service.CashierOpen(this.history);
								this.mode = SUCCESS;
							}
						else
							{
								this.message = "Cashier Already Close";

							}

					}
				catch (final Exception exp)
					{
						this.mode = ERROR;
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.mode;
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
		 * @return the usrUpd
		 */
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		/**
		 * @param usrUpd
		 *            the usrUpd to set
		 */
		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
			
		/**
		 * @return the usrCrt
		 */
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		/**
		 * @param usrCrt
		 *            the usrCrt to set
		 */
		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
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
		 * @return the partner
		 */
		public Partner getPartner()
			{
				return this.partner;
			}
			
		/**
		 * @param partner
		 *            the partner to set
		 */
		public void setPartner(final Partner partner)
			{
				this.partner = partner;
			}
			
		/**
		 * @return the office
		 */
		public Office getOffice()
			{
				return this.office;
			}
			
		/**
		 * @param office
		 *            the office to set
		 */
		public void setOffice(final Office office)
			{
				this.office = office;
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
		 * @return the openamount
		 */
		public Double getOpenamount()
			{
				return this.openamount;
			}
			
		/**
		 * @param openamount
		 *            the openamount to set
		 */
		public void setOpenamount(final Double openamount)
			{
				this.openamount = openamount;
			}
			
		/**
		 * @return the closeamount
		 */
		public Double getCloseamount()
			{
				return this.closeamount;
			}
			
		/**
		 * @param closeamount
		 *            the closeamount to set
		 */
		public void setCloseamount(final Double closeamount)
			{
				this.closeamount = closeamount;
			}
			
		/**
		 * @return the currencyid
		 */
		public Long getCurrencyid()
			{
				return this.currencyid;
			}
			
		/**
		 * @param currencyid
		 *            the currencyid to set
		 */
		public void setCurrencyid(final Long currencyid)
			{
				this.currencyid = currencyid;
			}
			
		/**
		 * @return the cashiername
		 */
		public String getCashiername()
			{
				return this.cashiername;
			}
			
		/**
		 * @param cashiername
		 *            the cashiername to set
		 */
		public void setCashiername(final String cashiername)
			{
				this.cashiername = cashiername;
			}
			
		/**
		 * @return the employeeid
		 */
		public Long getEmployeeid()
			{
				return this.employeeid;
			}
			
		/**
		 * @param employeeid
		 *            the employeeid to set
		 */
		public void setEmployeeid(final Long employeeid)
			{
				this.employeeid = employeeid;
			}
			
		/**
		 * @return the employeename
		 */
		public String getEmployeename()
			{
				return this.employeename;
			}
			
		/**
		 * @param employeename
		 *            the employeename to set
		 */
		public void setEmployeename(final String employeename)
			{
				this.employeename = employeename;
			}
			
		/**
		 * @param lstcashier
		 *            the lstcashier to set
		 */
		public void setLstcashier(final Map<Long, String> lstcashier)
			{
				this.lstcashier = lstcashier;
			}
			
		/**
		 * @param lstcurrency
		 *            the lstcurrency to set
		 */
		public void setLstcurrency(final Map<Long, String> lstcurrency)
			{
				this.lstcurrency = lstcurrency;
			}
			
		/**
		 * @return the service
		 */
		public OpenCashierService getService()
			{
				return this.service;
			}
			
		/**
		 * @param service
		 *            the service to set
		 */
		public void setService(final OpenCashierService service)
			{
				this.service = service;
			}
			
		/**
		 * @return the lstcashier
		 */
		public Map<Long, String> getLstcashier()
			{
				return this.lstcashier;
			}
			
		/**
		 * @return the lstcurrency
		 */
		public Map<Long, String> getLstcurrency()
			{
				return this.lstcurrency;
			}

		/**
		 * @return the isHeadCashier
		 */
		public String getIsHeadCashier()
			{
				return this.isHeadCashier;
			}

		/**
		 * @param isHeadCashier
		 *            the isHeadCashier to set
		 */
		public void setIsHeadCashier(final String isHeadCashier)
			{
				this.isHeadCashier = isHeadCashier;
			}

		/**
		 * @return the employee
		 */
		public Employee getEmployee()
			{
				return this.employee;
			}

		/**
		 * @param employee
		 *            the employee to set
		 */
		public void setEmployee(final Employee employee)
			{
				this.employee = employee;
			}

		/**
		 * @return the lstheadstatus
		 */
		public List<HeadCashier> getLstheadstatus()
			{
				return this.lstheadstatus;
			}

		/**
		 * @return the history
		 */
		public CashierHistory getHistory()
			{
				return this.history;
			}

		/**
		 * @param history
		 *            the history to set
		 */
		public void setHistory(final CashierHistory history)
			{
				this.history = history;
			}
			
	}
