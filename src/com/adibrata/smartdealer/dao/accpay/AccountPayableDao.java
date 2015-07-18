/**
 * 
 */
package com.adibrata.smartdealer.dao.accpay;

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
import com.adibrata.smartdealer.model.AccountPayable;
import com.adibrata.smartdealer.service.accpay.APSelectionService;

/**
 * @author Henry
 *
 */
public class AccountPayableDao extends DaoBase implements APSelectionService {

	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	StringBuilder hql = new StringBuilder();
	int pagesize;
	Session session;
	String strStatement;
	String userupd;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	public AccountPayableDao() throws Exception {
		try {
			this.session = HibernateHelper.getSessionFactory().openSession();
			this.pagesize = HibernateHelper.getPagesize();
			this.strStatement = " from Office ";

		} catch (final Exception exp) {
			this.session.getTransaction().rollback();
			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adibrata.smartdealer.service.accpay.Selection#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List<AccountPayable> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception {
		// TODO Auto-generated method stub
		final StringBuilder hql = new StringBuilder();
		List<AccountPayable> list = null;
		try {
			hql.append(this.strStatement);
			if (WhereCond != "") {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adibrata.smartdealer.service.accpay.Selection#Save(com.adibrata.
	 * smartdealer.model.Customer)
	 */
	@Override
	public void Save(AccountPayable accountPayable) throws Exception {
		// TODO Auto-generated method stub
		this.session.getTransaction().begin();

		try {
			accountPayable.setDtmCrt(this.dtmupd.getTime());
			accountPayable.setDtmUpd(this.dtmupd.getTime());
			this.session.save(accountPayable);
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
	 * @see
	 * com.adibrata.smartdealer.service.accpay.Selection#TotalRecord(java.lang
	 * .String)
	 */

	@Override
	public AccountPayable View(long id) throws Exception {
		// TODO Auto-generated method stub
		AccountPayable accountPayable = null;
		try {
			accountPayable = (AccountPayable) this.session.get(
					AccountPayable.class, id);

		} catch (final Exception exp) {

			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return accountPayable;
	}

}
