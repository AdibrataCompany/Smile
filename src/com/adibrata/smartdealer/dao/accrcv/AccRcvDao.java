package com.adibrata.smartdealer.dao.accrcv;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AccRcvDao {
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	StringBuilder hql = new StringBuilder();
	int pagesize;
	Session session;
	String strStatement;
	String userupd;
	public AccRcvDao() throws Exception {
		// TODO Auto-generated constructor stub
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
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	public AccRcvDao(String userupd) throws Exception {
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

}
