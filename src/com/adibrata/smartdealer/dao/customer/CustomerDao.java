/**
 * 
 */
package com.adibrata.smartdealer.dao.customer;

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
import com.adibrata.smartdealer.model.CoyCust;
import com.adibrata.smartdealer.model.CoyCustWhInfo;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.PersCust;
import com.adibrata.smartdealer.model.PersCustEmergencyInfo;
import com.adibrata.smartdealer.model.PersCustJobInfo;
import com.adibrata.smartdealer.model.PersCustLegalInfo;
import com.adibrata.smartdealer.model.PersCustResidenceInfo;
import com.adibrata.smartdealer.model.PersCustTrusteeInfo;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;

public class CustomerDao extends DaoBase implements CustomerMaintService {
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();

	StringBuilder hql = new StringBuilder();
	int pagesize;
	Session session;
	String strStatement;
	String userupd;

	public CustomerDao() throws Exception {

		// TODO Auto-generated constructor stub
		try {
			this.session = HibernateHelper.getSessionFactory().openSession();
			this.pagesize = HibernateHelper.getPagesize();
			this.strStatement = " from Customer ";

		} catch (final Exception exp) {
			this.session.getTransaction().rollback();
			final ExceptionEntities lEntExp = new ExceptionEntities();
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
	 * com.adibrata.smartdealer.service.customer.CustomerMaintenance#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception {
		// TODO Auto-generated method stub
		final StringBuilder hql = new StringBuilder();
		List<Customer> list = null;
		try {
			hql.append(this.strStatement);
			if (WhereCond != "") {
				hql.append(" where ");
				hql.append(WhereCond);
			}
			final Query selectQuery = this.session.createQuery(hql.toString());
			selectQuery.setFirstResult((CurrentPage - 1) * this.pagesize);
			selectQuery.setMaxResults(this.pagesize);
			list = selectQuery.list();

		} catch (final Exception exp) {

			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception {
		// TODO Auto-generated method stub
		final StringBuilder hql = new StringBuilder();
		List<Customer> list = null;

		try {
			hql.append(this.strStatement);
			if (WhereCond != "") {
				hql.append(" where ");
				hql.append(WhereCond);
			}
			final Query selectQuery = this.session.createQuery(hql.toString());
			final long totalrecord = this.TotalRecord(WhereCond);
			selectQuery
					.setFirstResult((int) ((totalrecord - 1) * this.pagesize));
			selectQuery.setMaxResults(this.pagesize);
			list = selectQuery.list();

		} catch (final Exception exp) {

			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.customer.CustomerMaintenance#Save(com
	 * .adibrata.smartdealer.model.Customer)
	 */
	@Override
	public void Save(String usrupd, Customer customer) throws Exception {
		// TODO Auto-generated method stub

		this.session.getTransaction().begin();
		try {
			customer.setDtmCrt(this.dtmupd.getTime());
			customer.setDtmUpd(this.dtmupd.getTime());
			this.session.save(customer);

			this.session.getTransaction().commit();

		} catch (final Exception exp) {
			this.session.getTransaction().rollback();
			final ExceptionEntities lEntExp = new ExceptionEntities();
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
	 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
	 * SaveCompanyCustomer(java.lang.String,
	 * com.adibrata.smartdealer.model.CoyCust)
	 */
	@Override
	public void SaveCompanyCustomer(String usrupd, CoyCust customer)
			throws Exception {
		// TODO Auto-generated method stub

		this.session.getTransaction().begin();
		try {
			customer.setDtmCrt(this.dtmupd.getTime());
			customer.setDtmUpd(this.dtmupd.getTime());
			this.session.save(customer);

			this.session.getTransaction().commit();

		} catch (final Exception exp) {
			this.session.getTransaction().rollback();
			final ExceptionEntities lEntExp = new ExceptionEntities();
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
	 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
	 * SaveCompanyCustomer(java.lang.String,
	 * com.adibrata.smartdealer.model.CoyCustWhInfo)
	 */
	@Override
	public void SaveCompanyCustomer(String usrupd, CoyCustWhInfo customer)
			throws Exception {
		// TODO Auto-generated method stub

		this.session.getTransaction().begin();
		try {
			customer.setDtmCrt(this.dtmupd.getTime());
			customer.setDtmUpd(this.dtmupd.getTime());
			this.session.save(customer);

			this.session.getTransaction().commit();

		} catch (final Exception exp) {
			this.session.getTransaction().rollback();
			final ExceptionEntities lEntExp = new ExceptionEntities();
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
	 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
	 * SavePersonalCustomer(java.lang.String,
	 * com.adibrata.smartdealer.model.PersCust)
	 */
	@Override
	public void SavePersonalCustomer(String usrupd, PersCust customer)
			throws Exception {
		// TODO Auto-generated method stub

		this.session.getTransaction().begin();
		try {
			customer.setDtmCrt(this.dtmupd.getTime());
			customer.setDtmUpd(this.dtmupd.getTime());
			this.session.save(customer);

			this.session.getTransaction().commit();

		} catch (final Exception exp) {
			this.session.getTransaction().rollback();
			final ExceptionEntities lEntExp = new ExceptionEntities();
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
	 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
	 * SavePersonalCustomer(java.lang.String,
	 * com.adibrata.smartdealer.model.PersCustEmergencyInfo)
	 */
	@Override
	public void SavePersonalCustomer(String usrupd,
			PersCustEmergencyInfo customer) throws Exception {
		// TODO Auto-generated method stub

		this.session.getTransaction().begin();
		try {
			customer.setDtmCrt(this.dtmupd.getTime());
			customer.setDtmUpd(this.dtmupd.getTime());
			this.session.save(customer);

			this.session.getTransaction().commit();

		} catch (final Exception exp) {
			this.session.getTransaction().rollback();
			final ExceptionEntities lEntExp = new ExceptionEntities();
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
	 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
	 * SavePersonalCustomer(java.lang.String,
	 * com.adibrata.smartdealer.model.PersCustJobInfo)
	 */
	@Override
	public void SavePersonalCustomer(String usrupd, PersCustJobInfo customer)
			throws Exception {
		// TODO Auto-generated method stub

		this.session.getTransaction().begin();
		try {
			customer.setDtmCrt(this.dtmupd.getTime());
			customer.setDtmUpd(this.dtmupd.getTime());
			this.session.save(customer);

			this.session.getTransaction().commit();

		} catch (final Exception exp) {
			this.session.getTransaction().rollback();
			final ExceptionEntities lEntExp = new ExceptionEntities();
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
	 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
	 * SavePersonalCustomer(java.lang.String,
	 * com.adibrata.smartdealer.model.PersCustLegalInfo)
	 */
	@Override
	public void SavePersonalCustomer(String usrupd, PersCustLegalInfo customer)
			throws Exception {
		// TODO Auto-generated method stub

		this.session.getTransaction().begin();
		try {
			customer.setDtmCrt(this.dtmupd.getTime());
			customer.setDtmUpd(this.dtmupd.getTime());
			this.session.save(customer);

			this.session.getTransaction().commit();

		} catch (final Exception exp) {
			this.session.getTransaction().rollback();
			final ExceptionEntities lEntExp = new ExceptionEntities();
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
	 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
	 * SavePersonalCustomer(java.lang.String,
	 * com.adibrata.smartdealer.model.PersCustResidenceInfo)
	 */
	@Override
	public void SavePersonalCustomer(String usrupd,
			PersCustResidenceInfo customer) throws Exception {
		// TODO Auto-generated method stub

		this.session.getTransaction().begin();
		try {
			customer.setDtmCrt(this.dtmupd.getTime());
			customer.setDtmUpd(this.dtmupd.getTime());
			this.session.save(customer);

			this.session.getTransaction().commit();

		} catch (final Exception exp) {
			this.session.getTransaction().rollback();
			final ExceptionEntities lEntExp = new ExceptionEntities();
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
	 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
	 * SavePersonalCustomer(java.lang.String,
	 * com.adibrata.smartdealer.model.PersCustTrusteeInfo)
	 */
	@Override
	public void SavePersonalCustomer(String usrupd, PersCustTrusteeInfo customer)
			throws Exception {
		// TODO Auto-generated method stub

		this.session.getTransaction().begin();
		try {
			customer.setDtmCrt(this.dtmupd.getTime());
			customer.setDtmUpd(this.dtmupd.getTime());
			this.session.save(customer);

			this.session.getTransaction().commit();

		} catch (final Exception exp) {
			this.session.getTransaction().rollback();
			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	@Override
	public Customer View(long id) throws Exception {
		// TODO Auto-generated method stub
		Customer customer = null;
		try {
			customer = (Customer) this.session.get(Customer.class, id);

		} catch (final Exception exp) {

			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return customer;
	}

}
