/**
 * 
 */
package com.adibrata.smartdealer.dao.sales;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.job.JobPost;
import util.adibrata.support.transno.GetTransNo;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.dao.DaoBase.TransactionType;
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.sales.*;

;
/**
 * @author Henry
 *
 */
public class SalesReturDao extends DaoBase implements SalesReturnService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public SalesReturDao() throws Exception {
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from SalesOrderHdr ";

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
	 * com.adibrata.smartdealer.service.sales.SalesReturn#TotalRecord(java.lang
	 * .String)
	 */
	
	@Override
	public void Save(String usrupd, ReturSalesHdr returSalesHdr,
			List<ReturSalesDtl> lstreturSalesDtl) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		Partner partner = returSalesHdr.getPartner();
		Office office = returSalesHdr.getOffice();
		long jobid;
		try {
			jobid = JobPost.JobSave(session, partner.getPartnerCode(), 
					office.getId(),
					JobPost.JobCode.salesorder, returSalesHdr.getCoaSchmHdr().getCoaSchmCode(),
					returSalesHdr.getValueDate(),
					returSalesHdr.getPostingDate(), returSalesHdr.getUsrCrt()).getId();

			returSalesHdr.setJobId(jobid);
			String transno = TransactionNo(session, TransactionType.salesorderreturn, 
					partner.getPartnerCode(), office.getId());
			
			returSalesHdr.setDtmCrt(dtmupd.getTime());
			returSalesHdr.setDtmUpd(dtmupd.getTime());
			session.save(returSalesHdr);
			for (ReturSalesDtl arow : lstreturSalesDtl) {
				ReturSalesDtl  returSalesDtl = new ReturSalesDtl();
				returSalesDtl = arow;
				returSalesDtl.setDtmCrt(dtmupd.getTime());
				returSalesDtl.setDtmUpd(dtmupd.getTime());
				session.save(returSalesDtl);
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
	public List<ReturSalesHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<ReturSalesHdr> list = null;
		try {
			hql.append(strStatement);
			if (WhereCond != "")
				hql.append(WhereCond);

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
	public List<ReturSalesHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception {
		// TODO Auto-generated method stub
				StringBuilder hql = new StringBuilder();
				List<ReturSalesHdr> list = null;

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
