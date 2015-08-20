/**
 * OpenCashierDao.java
 */

package com.adibrata.smartdealer.dao.accmaint;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.CashierHistory;
import com.adibrata.smartdealer.model.Currency;
import com.adibrata.smartdealer.model.Employee;
import com.adibrata.smartdealer.model.HeadCashier;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.accmaint.OpenCashierService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

/**
 * @author Henry
 */
public class OpenCashierDao extends DaoBase implements OpenCashierService
	{

		/**
		 *
		 */
		public OpenCashierDao() throws Exception
			{
				// TODO Auto-generated constructor stub

			}

		@Override
		public void CashierOpen(final CashierHistory cashierHistory) throws Exception
			{
				// TODO Auto-generated method stub
				Transaction trx;
				trx = this.getSession().beginTransaction();
				Short lastsequence;
				Partner partner;
				Office office;
				Employee employee;
				Currency currency;
				try
					{
						partner = cashierHistory.getPartner();
						office = cashierHistory.getOffice();
						employee = cashierHistory.getEmployee();
						currency = cashierHistory.getCurrency();
						cashierHistory.setOpeningDtm(this.dtmupd);

						cashierHistory.setDtmCrt(this.dtmupd);
						cashierHistory.setDtmUpd(this.dtmupd);
						this.getSession().save(cashierHistory);
						lastsequence = this.LastOpenSequence(partner, office, employee, currency, cashierHistory.getOpenDate());
						if ((lastsequence == null) || (lastsequence == 0))
							{
								lastsequence = 1;
							}
						cashierHistory.setOpenSeqNo(lastsequence);

						trx.commit();
					}
				catch (final Exception exp)
					{
						trx.rollback();
						this.getSession().getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

			}

		private Short LastOpenSequence(final Partner partner, final Office office, final Employee employee, final Currency currency, final Date valuedate) throws Exception
			{
				Short result = null;
				try
					{
						final Query qryGetID = this.getSession().createQuery("Select openSeqNo from  CashierHistory  Where id = :id");

						qryGetID.setParameter("id", this.IdCashierOpen(partner, office, employee, currency, valuedate));

						qryGetID.setCacheable(true);
						qryGetID.setCacheRegion("LastOpenSequence");
						result = (Short) qryGetID.uniqueResult();
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return result;
			}

		@Override
		public Long IdCashierOpen(final Partner partner, final Office office, final Employee employee, final Currency currency, final Date valuedate) throws Exception
			{
				Long result = null;
				try
					{
						final Query qryGetID = this.getSession()
						        .createQuery("Select id from  CashierHistory  Where partnercode =:partnercode " + "and office = :office and employee = :employee and currency = :currency  and opendate = :opendate order by Id desc");

						qryGetID.setParameter("partnercode", partner.getPartnerCode());
						qryGetID.setParameter("office", office.getId());
						qryGetID.setParameter("employee", employee.getId());
						qryGetID.setParameter("currency", currency.getId());
						qryGetID.setParameter("opendate", valuedate);

						qryGetID.setCacheable(true);
						qryGetID.setCacheRegion("IdCashierOpen");
						result = (Long) qryGetID.uniqueResult();
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return result;
			}

		@SuppressWarnings("unchecked")
		@Override

		public List<HeadCashier> ListCashierStatus(final Partner partner, final Office office, final Date valuedate) throws Exception
			{
				// TODO Auto-generated method stub
				
				final List<HeadCashier> lstcashierstatus = new ArrayList<HeadCashier>();
				List<Object[]> lst = new ArrayList<Object[]>();
				String hql;
				CashierHistory history;
				Employee employee;
				Currency currency;
				
				try
					{
						hql = "from CashierHistory A, Partner B, Office C, Employee D, Currency E where A.partner = B.partnercode and A.office = C.id and A.employee = D.id and A.currency = E.id and partner = :partner and office =:office and A.openDate = :opendate order by id";
						
						final Query qry = this.getSession().createQuery(hql);
						qry.setParameter("partner", partner.getPartnerCode());
						qry.setParameter("office", office.getId());
						qry.setParameter("opendate", valuedate);
						qry.setCacheable(true);
						qry.setCacheRegion("ListCashier");
						lst = qry.list();
						for (final Object[] row : lst)
							{
								history = (CashierHistory) row[0];
								employee = (Employee) row[3];
								currency = (Currency) row[4];
								
								final HeadCashier head = new HeadCashier();
								head.setOpeningDate(history.getOpeningDtm());
								head.setCloseDate(history.getClosingDtm());
								head.setCashierStatus(history.getCashierStatus());
								head.setCurrencyCode(currency.getCode());
								head.setOpeningAmount(history.getOpeningAmount());
								head.setEmployeeName(employee.getName());
								head.setOnHandAmount(history.getBalanceAmount());
								lstcashierstatus.add(head);
							}

					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return lstcashierstatus;
			}

		@Override
		public void CashierClose(final CashierHistory cashierhistory) throws Exception
			{
				Partner partner;
				Office office;
				Employee employee;
				Currency currency;
				final Transaction trx = this.getSession().beginTransaction();
				try
					{
						partner = cashierhistory.getPartner();
						office = cashierhistory.getOffice();
						employee = cashierhistory.getEmployee();
						currency = cashierhistory.getCurrency();
						
						cashierhistory.setClosingDtm(this.dtmupd);
						cashierhistory.setId(this.IdCashierOpen(partner, office, employee, currency, cashierhistory.getOpenDate()));
						cashierhistory.setDtmUpd(this.dtmupd);
						this.getSession().update(cashierhistory);
						trx.commit();
					}
				catch (final Exception exp)
					{
						trx.rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
			
		@Override
		public Boolean CheckCashierClose(final Partner partner, final Office office, final Currency currency, final Employee employee, final Date valuedate) throws Exception
			{
				// TODO Auto-generated method stub
				Boolean result = null;
				Short lastsequence;
				try
					{
						lastsequence = this.LastOpenSequence(partner, office, employee, currency, valuedate);
						if ((lastsequence == null) || (lastsequence == 0))
							{
								result = true;
							}
						else
							{
								result = false;
							}
							
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return result;
			}

		@Override
		public Boolean CheckCashierOpen(final Partner partner, final Office office, final Currency currency, final Employee employee, final Date valuedate) throws Exception
			{
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				Boolean result = null;
				Short lastsequence;
				try
					{
						lastsequence = this.LastOpenSequence(partner, office, employee, currency, valuedate);
						if ((lastsequence == null) || (lastsequence == 0))
							{
								result = false;
							}
						else
							{
								result = true;
							}
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return result;
			}

		@Override
		public Boolean CheckHeadCashier(final Employee employee) throws Exception
			{
				// TODO Auto-generated method stub
				Boolean result = null;
				String position;
				try
					{
						final Query qryGetID = this.getSession().createQuery("Select position from  Employee  Where id =:id ");
						qryGetID.setParameter("id", employee.getId());
						qryGetID.setCacheable(true);
						qryGetID.setCacheRegion("CheckHeadCashier");
						position = (String) qryGetID.uniqueResult();
						if (position.equals("CashierHead"))
							{
								result = true;
							}
						else
							{
								result = false;
							}

					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return result;
			}

		@SuppressWarnings("unchecked")
		@Override
		public List<Employee> ListCashier(final Partner partner, final Office office) throws Exception
			{
				// TODO Auto-generated method stub
				
				List<Employee> lstemployee = new ArrayList<Employee>();
				String hql;
				try
					{
						hql = "from Employee where partner = :partner and office =:office and position = 'CashierHead' order by name";

						final Query qry = this.getSession().createQuery(hql);
						qry.setParameter("partner", partner.getPartnerCode());
						qry.setParameter("office", office.getId());

						qry.setCacheable(true);
						qry.setCacheRegion("ListCashier");
						lstemployee = qry.list();
						
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return lstemployee;
			}

		@Override
		public CashierHistory View(final Long id) throws Exception
			{
				// TODO Auto-generated method stub
				CashierHistory history = new CashierHistory();
				try
					{
						history = (CashierHistory) this.getSession().get(CashierHistory.class, id);

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return history;
			}
			
		@Override
		public List<HeadCashier> ListCashierStatus(final String partnercode, final String officeId) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public Boolean CheckHeadCashier(final String partnercode, final String officeid, final long employeeid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
	}
