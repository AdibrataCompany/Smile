/**
 * 
 */
package com.adibrata.smartdealer.dao.setting;

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
import com.adibrata.smartdealer.service.setting.WorkshopService;

public class WorkshopDao extends DaoBase implements WorkshopService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public WorkshopDao() throws Exception {
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from Workshop ";

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
	 * com.adibrata.smartdealer.service.setting.WorkshopService#SaveAdd(com.
	 * adibrata.smartdealer.model.Workshop)
	 */
	@Override
	public void SaveAdd(Workshop workshop) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		StringBuilder fulladdress = new StringBuilder();

		try {
			fulladdress.append(workshop.getAddress());
			fulladdress.append(" RT/RW: ");
			fulladdress.append(workshop.getRt());
			fulladdress.append("/");
			fulladdress.append(workshop.getRw());
			fulladdress.append(" Kelurahan: ");
			fulladdress.append(workshop.getKelurahan());
			fulladdress.append(" Kecamatan: ");
			fulladdress.append(workshop.getKecamatan());
			fulladdress.append(" ");
			fulladdress.append(workshop.getCity());
			fulladdress.append(" ");
			fulladdress.append(workshop.getZipCode());
			fulladdress.append(" ");

			workshop.setFullAddress(fulladdress.toString());
			workshop.setDtmCrt(dtmupd.getTime());
			workshop.setDtmUpd(dtmupd.getTime());
			session.save(workshop);

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
	 * com.adibrata.smartdealer.service.setting.WorkshopService#SaveEdit(com
	 * .adibrata.smartdealer.model.Workshop)
	 */
	@Override
	public void SaveEdit(Workshop workshop) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		StringBuilder fulladdress = new StringBuilder();

		try {
			fulladdress.append(workshop.getAddress());
			fulladdress.append(" RT/RW: ");
			fulladdress.append(workshop.getRt());
			fulladdress.append("/");
			fulladdress.append(workshop.getRw());
			fulladdress.append(" Kelurahan: ");
			fulladdress.append(workshop.getKelurahan());
			fulladdress.append(" Kecamatan: ");
			fulladdress.append(workshop.getKecamatan());
			fulladdress.append(" ");
			fulladdress.append(workshop.getCity());
			fulladdress.append(" ");
			fulladdress.append(workshop.getZipCode());
			fulladdress.append(" ");

			workshop.setFullAddress(fulladdress.toString());
			workshop.setDtmCrt(dtmupd.getTime());
			workshop.setDtmUpd(dtmupd.getTime());
			session.update(workshop);

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
	 * com.adibrata.smartdealer.service.setting.WorkshopService#SaveDel(com.
	 * adibrata.smartdealer.model.Workshop)
	 */
	@Override
	public void SaveDel(Workshop workshop) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			session.delete(workshop);

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
	 * @see com.adibrata.smartdealer.service.setting.WorkshopService#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List<Workshop> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<Workshop> list = null;
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
	public Workshop View(long id) throws Exception {
		// TODO Auto-generated method stub
		Workshop workshop = null;
		try {
			workshop = (Workshop) session.get(Workshop.class, id);

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return workshop;
	}

	@Override
	public List<Workshop> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<Workshop> list = null;
		try {
			hql.append(strStatement);
			if (WhereCond != "") {
				hql.append(" where ");
				hql.append(WhereCond);
			}

			Query selectQuery = session.createQuery(hql.toString());
			long totalrecord = TotalRecord(WhereCond);
			selectQuery.setFirstResult((int) ((totalrecord - 1) * pagesize));
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

}
