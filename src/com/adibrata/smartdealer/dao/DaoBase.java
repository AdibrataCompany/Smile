/**
 * 
 */
package com.adibrata.smartdealer.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.hibernate.Query;
import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.transno.GetTransNo;

import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */
public class DaoBase implements SeviceBase {
	public enum TransactionType {
		accountpayable("APD"), advancerequest("ADV"), advancereturn("ADR"), danatunai(
				"DTN"), entrustout("ENTO"), entrustreceive("ENTR"), otherdisburse(
						"OTD"), otherreceive("OTR"), paymentrequest("PYR"), paymentvoucher(
								"PVD"), pettycashcorretion("PCO"), pettycashreimburse("PCR"), pettycashtransaction(
										"PCT"), prepaidreceive("PRV"), purchaseinvoice("PRI"), purchaseorder(
												"PRO"), purchasereturn("PRR"), salesorder("SAO"), salesorderreturn(
														"SAR"), service("SVC");

		private String transactiontype;

		private TransactionType(String s) {
			this.transactiontype = s;
		}

		public String getTransactionType() {
			return this.transactiontype;
		}
	}
	static Calendar dtmupd = Calendar.getInstance();

	public static String TransactionNo(Session session, TransactionType trans,
			String partnercode, long officeid) throws Exception {
		String transno = "";
		transno = GetTransNo.GenerateTransactionNo(session, partnercode,
				officeid, trans.getTransactionType(), dtmupd.getTime());
		return transno;
	}
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	StringBuilder hql = new StringBuilder();
	int pagesize;
	Session session;

	String strStatement;

	String userupd;

	/**
	 * @throws Exception
	 * 
	 */
	public DaoBase() throws Exception {
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
	 * @see com.adibrata.smartdealer.service.SeviceBase#AgrmntInfo()
	 */
	@Override
	public void AgrmntInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public long TotalRecord(String WherCond) throws Exception {
		// TODO Auto-generated method stub
		long countResults = 0;
		try {
			final String countQ = "Select count (id) " + this.strStatement;
			final Query countQuery = this.session.createQuery(countQ);
			countResults = (long) countQuery.uniqueResult();

		} catch (final Exception exp) {

			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return countResults;
	}

}
