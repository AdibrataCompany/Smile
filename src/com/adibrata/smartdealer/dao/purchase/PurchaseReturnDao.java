/**
 * 
 */
package com.adibrata.smartdealer.dao.purchase;

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
import com.adibrata.smartdealer.service.purchase.*;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

public class PurchaseReturnDao extends DaoBase implements PurchaseReturnService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public PurchaseReturnDao() throws Exception{
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from PurchaseOrderHdr ";

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
	 * @see com.adibrata.smartdealer.service.purchase.PurchaseOrder#Save()
	 */
	@Override
	public void Save(String usrupd, ReturPurchaseHdr returPurchaseHdr,
			List<ReturPurchaseDtl> returPurchaseDtl) throws Exception {
		// TODO Auto-generated method stub

		String retpurchaseno;
		session.getTransaction().begin();
		try {
			String transno = TransactionNo(session, TransactionType.purchasereturn, returPurchaseHdr
					.getPartner().getPartnerCode(), returPurchaseHdr.getOffice()
					.getId());

			returPurchaseHdr.setReturPurchaseNo(transno);

			returPurchaseHdr.setDtmCrt(dtmupd.getTime());
			returPurchaseHdr.setDtmUpd(dtmupd.getTime());

			session.save(returPurchaseHdr);

			for (ReturPurchaseDtl arow : returPurchaseDtl) {
				// 1.No Impact Asset Master
				// 2. Save Stock update Status
				// 3. Save purchase order detail

				Stock stock = new Stock();
				stock.setPartner(returPurchaseHdr.getPartner());
				stock.setOffice(returPurchaseHdr.getOffice());
				stock.setId(arow.getStock().getId());

				stock.setStockStatus("RET");
				stock.setSupplier(returPurchaseHdr.getSupplier());
				stock.setDtmCrt(dtmupd.getTime());
				stock.setDtmUpd(dtmupd.getTime());
				stock.setUsrCrt(returPurchaseHdr.getUsrCrt());
				stock.setUsrUpd(returPurchaseHdr.getUsrUpd());
				session.save(stock);

				ReturPurchaseDtl returpurchasedtl = new ReturPurchaseDtl();
				returpurchasedtl = arow;
				returpurchasedtl.setReturPurchaseHdr(returPurchaseHdr);
				returpurchasedtl.setDtmCrt(dtmupd.getTime());
				returpurchasedtl.setDtmUpd(dtmupd.getTime());
				session.save(returpurchasedtl);
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
	 * @see com.adibrata.smartdealer.service.purchase.PurchaseOrder#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	
	@Override
	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseOrderHdr viewPurchaseOrderHdr(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
