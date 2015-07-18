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
import com.adibrata.smartdealer.dao.DaoBase.TransactionType;
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.cashtransactions.PaymentRequestService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

public class PaymentRequestDao extends DaoBase implements PaymentRequestService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public PaymentRequestDao() throws Exception{

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
	 * @see
	 * com.adibrata.smartdealer.service.cashtransactions.PaymentRequestService
	 * #SavePaymentRequest(com.adibrata.smartdealer.model.PayReqHdr,
	 * com.adibrata.smartdealer.model.PayReqDtl)
	 */

	@Override
	public void SavePaymentRequest(String usrupd, PayReqHdr payReqHdr,
			List<PayReqDtl> lstpayReqDtl) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		Partner partner = payReqHdr.getPartner();
		Office office = payReqHdr.getOffice();

		try {
			
			String transno = TransactionNo(session, TransactionType.paymentrequest, 
					partner.getPartnerCode(), office.getId());
			payReqHdr.setPayReqNo(transno);
			payReqHdr.setDtmCrt(dtmupd.getTime());
			payReqHdr.setDtmUpd(dtmupd.getTime());
			for (PayReqDtl arow : lstpayReqDtl) {
				PayReqDtl payReqDtl = new PayReqDtl();
				payReqDtl = arow;
				payReqDtl.setPayReqHdr(payReqHdr);
				payReqDtl.setDtmCrt(dtmupd.getTime());
				payReqDtl.setDtmUpd(dtmupd.getTime());
				session.save(payReqHdr);
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.cashtransactions.PaymentRequestService
	 * #PurchaseInvoicePaging(int, java.lang.String, java.lang.String)
	 */
	@Override
	public List<PayReqHdr> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				StringBuilder hql = new StringBuilder();
				List<PayReqHdr> list = null;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.cashtransactions.PaymentRequestService
	 * #TotalRecord(java.lang.String)
	 */
	

	@Override
	public List<PayReqHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PayReqDtl> lstPayReqDtl(int CurrentPage, String WhereCond,
			String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PayReqDtl View(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
