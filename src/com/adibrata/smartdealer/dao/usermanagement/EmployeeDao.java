/**
 *
 */

package com.adibrata.smartdealer.dao.usermanagement;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Employee;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.usermanagement.EmployeeService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class EmployeeDao extends DaoBase implements EmployeeService
	{
		String userupd;

		String strStatement;
		StringBuilder hql = new StringBuilder();
		private int currentpage;
		private Long totalrecord;

		public EmployeeDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.strStatement = " from Employee ";
					}
				catch (final Exception exp)
					{
						this.getSession().getTransaction().rollback();
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
				this.getSession().getTransaction().begin();
				try
					{
						employee.setDtmCrt(this.dtmupd);
						employee.setDtmUpd(this.dtmupd);
						this.getSession().save(employee);

						this.getSession().getTransaction().commit();

					}
				catch (final Exception exp)
					{
						this.getSession().getTransaction().rollback();
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
				this.getSession().getTransaction().begin();
				try
					{
						employee.setDtmCrt(this.dtmupd);
						employee.setDtmUpd(this.dtmupd);
						this.getSession().update(employee);

						this.getSession().getTransaction().commit();

					}
				catch (final Exception exp)
					{
						this.getSession().getTransaction().rollback();
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
				this.getSession().getTransaction().begin();
				try
					{

						this.getSession().delete(employee);

						this.getSession().getTransaction().commit();

					}
				catch (final Exception exp)
					{
						this.getSession().getTransaction().rollback();
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

						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setFirstResult((CurrentPage - 1) * this.getPagesize());
						selectQuery.setMaxResults(this.getPagesize());
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
		public Employee View(final Long id) throws Exception
			{
				// TODO Auto-generated method stub
				Employee employee = null;
				try
					{
						employee = (Employee) this.getSession().get(Employee.class, id);

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

						final Query selectQuery = this.getSession().createQuery(hql.toString());
						this.totalrecord = this.TotalRecord(hql.toString(), WhereCond);
						this.currentpage = (int) ((this.totalrecord / this.getPagesize()) + 1);

						selectQuery.setFirstResult((this.currentpage - 1) * this.getPagesize());
						selectQuery.setMaxResults(this.getPagesize());
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

						final Query selectQuery = this.getSession().createQuery(hql.toString());
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
			
	}
