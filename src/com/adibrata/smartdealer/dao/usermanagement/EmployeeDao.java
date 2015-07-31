/**
 *
 */

package com.adibrata.smartdealer.dao.usermanagement;

/**
 * @author Henry
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Employee;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.usermanagement.EmployeeService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class EmployeeDao extends DaoBase implements EmployeeService
	{
		String userupd;
		Session session;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar dtmupd = Calendar.getInstance();
		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		private int currentpage;
		private long totalrecord;
		
		public EmployeeDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from Employee ";
						
					}
				catch (final Exception exp)
					{
						this.session.getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
			
		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.usermanagement.EmployeeService#SaveAdd
		 * (com.adibrata.smartdealer.model.Employee)
		 */
		@Override
		public void SaveAdd(final Employee employee) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						employee.setDtmCrt(this.dtmupd.getTime());
						employee.setDtmUpd(this.dtmupd.getTime());
						this.session.save(employee);
						
						this.session.getTransaction().commit();
						
					}
				catch (final Exception exp)
					{
						this.session.getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
			
		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.usermanagement.EmployeeService#SaveEdit
		 * (com.adibrata.smartdealer.model.Employee)
		 */
		@Override
		public void SaveEdit(final Employee employee) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						employee.setDtmCrt(this.dtmupd.getTime());
						employee.setDtmUpd(this.dtmupd.getTime());
						this.session.update(employee);
						
						this.session.getTransaction().commit();
						
					}
				catch (final Exception exp)
					{
						this.session.getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
			
		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.usermanagement.EmployeeService#SaveDel
		 * (com.adibrata.smartdealer.model.Employee)
		 */
		@Override
		public void SaveDel(final Employee employee) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						
						this.session.delete(employee);
						
						this.session.getTransaction().commit();
						
					}
				catch (final Exception exp)
					{
						this.session.getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
			
		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.usermanagement.EmployeeService#Paging
		 * (int, java.lang.String, java.lang.String)
		 */
		@Override
		public List<Employee> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<Employee> list = null;
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
							
						final Query selectQuery = this.session.createQuery(hql.toString());
						selectQuery.setFirstResult((CurrentPage - 1) * this.pagesize);
						selectQuery.setMaxResults(this.pagesize);
						list = selectQuery.list();
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return list;
			}
			
		@Override
		public Employee View(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				Employee employee = null;
				try
					{
						employee = (Employee) this.session.get(Employee.class, id);
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return employee;
			}
			
		@Override
		public List<Employee> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				
				final StringBuilder hql = new StringBuilder();
				List<Employee> list = null;
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
							
						final Query selectQuery = this.session.createQuery(hql.toString());
						this.totalrecord = this.TotalRecord(hql.toString(), WhereCond);
						this.currentpage = (int) ((this.totalrecord / this.pagesize) + 1);
						
						selectQuery.setFirstResult((this.currentpage - 1) * this.pagesize);
						selectQuery.setMaxResults(this.pagesize);
						list = selectQuery.list();
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return list;
			}
			
		@Override
		public List<Employee> ListEmployee(final Partner partner, final Office office) throws Exception
			{
				// TODO Auto-generated method stub
				
				final StringBuilder hql = new StringBuilder();
				final List<Employee> list = new ArrayList<Employee>();
				try
					{
						
						hql.append("from Employee E, Partner P, Office O where E.partner = P.partnerCode and E.office = O.id and P.partnerCode = :partnercode and O.id = :officeid and E.isActive = 1");
						
						final Query selectQuery = this.session.createQuery(hql.toString());
						selectQuery.setParameter("partnercode", partner.getPartnerCode());
						selectQuery.setParameter("officeid", office.getId());
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("ListEmployee" + partner.getPartnerCode() + office.getId());
						final List<Object[]> lst = selectQuery.list();
						for (final Object[] aRow : lst)
							{
								list.add((Employee) aRow[0]);
							}
							
					}
				catch (final Exception exp)
					
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return list;
				
			}
			
		public String getUserupd()
			{
				return this.userupd;
			}
			
		public void setUserupd(final String userupd)
			{
				this.userupd = userupd;
			}
			
		public Session getSession()
			{
				return this.session;
			}
			
		public void setSession(final Session session)
			{
				this.session = session;
			}
			
		public DateFormat getDateFormat()
			{
				return this.dateFormat;
			}
			
		public void setDateFormat(final DateFormat dateFormat)
			{
				this.dateFormat = dateFormat;
			}
			
		public Calendar getDtmupd()
			{
				return this.dtmupd;
			}
			
		public void setDtmupd(final Calendar dtmupd)
			{
				this.dtmupd = dtmupd;
			}
			
		public String getStrStatement()
			{
				return this.strStatement;
			}
			
		public void setStrStatement(final String strStatement)
			{
				this.strStatement = strStatement;
			}
			
		public StringBuilder getHql()
			{
				return this.hql;
			}
			
		public void setHql(final StringBuilder hql)
			{
				this.hql = hql;
			}
			
		public int getPagesize()
			{
				return this.pagesize;
			}
			
		public void setPagesize(final int pagesize)
			{
				this.pagesize = pagesize;
			}
			
		@Override
		public int getCurrentpage()
			{
				return this.currentpage;
			}
			
		public void setCurrentpage(final int currentpage)
			{
				this.currentpage = currentpage;
			}
			
		public long getTotalrecord()
			{
				return this.totalrecord;
			}
			
		public void setTotalrecord(final long totalrecord)
			{
				this.totalrecord = totalrecord;
			}
			
	}
