/**
 * 
 */
package com.adibrata.smartdealer.dao.usermanagement;

/**
 * @author Henry
 *
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.usermanagement.EmployeeService;

public class EmployeeDao extends DaoBase implements EmployeeService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	private int currentpage;
	private long totalrecord;

	public EmployeeDao() throws Exception {
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from Employee ";

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.usermanagement.EmployeeService#SaveAdd
	 * (com.adibrata.smartdealer.model.Employee)
	 */
	@Override
	public void SaveAdd(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			employee.setDtmCrt(dtmupd.getTime());
			employee.setDtmUpd(dtmupd.getTime());
			session.save(employee);

			session.getTransaction().commit();

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.usermanagement.EmployeeService#SaveEdit
	 * (com.adibrata.smartdealer.model.Employee)
	 */
	@Override
	public void SaveEdit(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			employee.setDtmCrt(dtmupd.getTime());
			employee.setDtmUpd(dtmupd.getTime());
			session.update(employee);

			session.getTransaction().commit();

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.usermanagement.EmployeeService#SaveDel
	 * (com.adibrata.smartdealer.model.Employee)
	 */
	@Override
	public void SaveDel(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			session.delete(employee);

			session.getTransaction().commit();

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.usermanagement.EmployeeService#Paging
	 * (int, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Employee> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<Employee> list = null;
		try {
			hql.append(strStatement);
			if (WhereCond != "") {
				hql.append(" where ");
				hql.append(WhereCond);
			}

			Query selectQuery = session.createQuery(hql.toString());
			selectQuery.setFirstResult((CurrentPage - 1) * pagesize);
			selectQuery.setMaxResults(pagesize);
			list = selectQuery.list();

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return list;
	}

	@Override
	public Employee View(long id) throws Exception {
		// TODO Auto-generated method stub
		Employee employee = null;
		try {
			employee = (Employee) session.get(Employee.class, id);

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return employee;
	}

	@Override
	public List<Employee> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception {
		// TODO Auto-generated method stub

		StringBuilder hql = new StringBuilder();
		List<Employee> list = null;
		try {
			hql.append(strStatement);
			if (WhereCond != "") {
				hql.append(" where ");
				hql.append(WhereCond);
			}

			Query selectQuery = session.createQuery(hql.toString());
			this.totalrecord = TotalRecord(hql.toString(), WhereCond);
			this.currentpage = (int) ((this.totalrecord / pagesize) + 1);

			selectQuery.setFirstResult((this.currentpage - 1) * pagesize);
			selectQuery.setMaxResults(pagesize);
			list = selectQuery.list();

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return list;
	}

	public String getUserupd() {
		return userupd;
	}

	public void setUserupd(String userupd) {
		this.userupd = userupd;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public DateFormat getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public Calendar getDtmupd() {
		return dtmupd;
	}

	public void setDtmupd(Calendar dtmupd) {
		this.dtmupd = dtmupd;
	}

	public String getStrStatement() {
		return strStatement;
	}

	public void setStrStatement(String strStatement) {
		this.strStatement = strStatement;
	}

	public StringBuilder getHql() {
		return hql;
	}

	public void setHql(StringBuilder hql) {
		this.hql = hql;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	@Override
	public int getCurrentpage() {
		return currentpage;
	}

	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}

	public long getTotalrecord() {
		return totalrecord;
	}

	public void setTotalrecord(long totalrecord) {
		this.totalrecord = totalrecord;
	}

}
