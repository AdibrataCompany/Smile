/**
 * 
 */
package com.adibrata.smartdealer.dao.cashtransactions;

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

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.cashtransactions.PettyCashService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;

public class PettyCashDao extends DaoBase implements PettyCashService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public PettyCashDao() throws Exception {

		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from Office ";

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
	 * @see com.adibrata.smartdealer.service.cashtransactions.PettyCashService#
	 * SavePettyCash(com.adibrata.smartdealer.model.PettyCashHdr,
	 * com.adibrata.smartdealer.model.PettyCashDtl)
	 */
	@Override
	public void SavePettyCash(String usrupd, PettyCashHdr pettycashhdr,
			List<PettyCashDtl> lstpettycashdtl) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		Partner partner = pettycashhdr.getPartner();
		Office office = pettycashhdr.getOffice();

		try {

			String transno = TransactionNo(session,
					TransactionType.pettycashtransaction,
					partner.getPartnerCode(), office.getId());
			pettycashhdr.setPcno(transno);
			pettycashhdr.setDtmCrt(dtmupd.getTime());
			pettycashhdr.setDtmUpd(dtmupd.getTime());
			session.save(pettycashhdr);
			for (PettyCashDtl arow : lstpettycashdtl) {
				PettyCashDtl pettyCashDtl = new PettyCashDtl();
				pettyCashDtl = arow;

				pettyCashDtl.setPettyCashHdr(pettycashhdr);
				pettyCashDtl.setDtmCrt(dtmupd.getTime());
				pettyCashDtl.setDtmUpd(dtmupd.getTime());
				session.save(pettyCashDtl);
			}
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

	@Override
	public List<PettyCashHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<PettyCashHdr> list = null;

		try {
			hql.append(strStatement);
			if (WhereCond != "") {
				hql.append(" where ");
				hql.append(WhereCond);
			}
			Query selectQuery = session.createQuery(hql.toString());
			long totalrecord = TotalRecord(WhereCond);
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
	public List<PettyCashHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<PettyCashHdr> list = null;

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

	@Override
	public PettyCashHdr View(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PettyCashDtl> ViewDetail(PettyCashHdr pettyCashHdr) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<PettyCashDtl> list = null;

		try {
			hql.append(strStatement);

			Query selectQuery = session.createQuery(hql.toString());
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
