/**
 *
 */

package com.adibrata.smartdealer.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.service.SeviceBase;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.transno.GetTransNo;

/**
 * @author Henry
 */
public class DaoBase implements SeviceBase
	{
		String userupd;
		Session session;

		public DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		public Date dtmupd = Calendar.getInstance().getTime();
		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;

		/**
		 * @throws Exception
		 */
		public DaoBase() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();

					}
				catch (final Exception exp)
					{
						this.session.getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}

		@Override
		public Long TotalRecord(final String strStatement, final String WhereCond) throws Exception
			{
				// TODO Auto-generated method stub
				Long countResults = (long) 0;
				try
					{
						String countQ = "Select count (id) " + strStatement;
						if (WhereCond != "")
							{
								countQ = " where " + WhereCond;

							}

						final Query countQuery = this.session.createQuery(countQ);
						countResults = (Long) countQuery.uniqueResult();

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return countResults;
			}

		@Override
		public int getCurrentpage() throws Exception
			{
				// TODO Auto-generated method stub
				return 0;
			}

		public enum TransactionType
			{

				accountpayable("APD"), advancerequest("ADV"), advancereturn("ADR"), danatunai("DTN"), entrustout("ENTO"), entrustreceive("ENTR"), otherdisburse("OTD"), otherreceive("OTR"), paymentrequest("PYR"), paymentvoucher(
				        "PVD"), pettycashcorretion("PCO"), pettycashreimburse("PCR"), pettycashtransaction("PCT"), prepaidreceive("PRV"), purchaseinvoice("PRI"), purchaseorder("PRO"), purchasereturn("PRR"), salesorder("SAO"), salesorderreturn(
				                "SAR"), service("SVC"), suspendallocation("SUA"), suspendreverse("SUC"), suspendreceive("SUR"), paymentreceive("PAR"), paymentreverse("PAC"), PDCClearing("PDC"), GoLive("GLV");
								
				private String transactiontype;

				private TransactionType(final String s)
					{

						this.transactiontype = s;

					}

				public String getTransactionType()
					{

						return this.transactiontype;

					}
			}

		public static String TransactionNo(final Session session, final String partnercode, final Long officeid, final TransactionType trans

		) throws Exception
			{

				String transno = "";

				transno = GetTransNo.GenerateTransactionNo(session, partnercode,

				officeid, trans.getTransactionType(), Calendar.getInstance().getTime());

				return transno;

			}
			
		/**
		 * @return the userupd
		 */
		public String getUserupd()
			{
				return this.userupd;
			}
			
		/**
		 * @param userupd
		 *            the userupd to set
		 */
		public void setUserupd(final String userupd)
			{
				this.userupd = userupd;
			}
			
		/**
		 * @return the session
		 */
		public Session getSession()
			{
				return this.session;
			}
			
		/**
		 * @param session
		 *            the session to set
		 */
		public void setSession(final Session session)
			{
				this.session = session;
			}
			
		/**
		 * @return the dateFormat
		 */
		public DateFormat getDateFormat()
			{
				return this.dateFormat;
			}
			
		/**
		 * @param dateFormat
		 *            the dateFormat to set
		 */
		public void setDateFormat(final DateFormat dateFormat)
			{
				this.dateFormat = dateFormat;
			}
			
		/**
		 * @return the dtmupd
		 */
		public Date getDtmupd()
			{
				return this.dtmupd;
			}
			
		/**
		 * @param dtmupd
		 *            the dtmupd to set
		 */
		public void setDtmupd(final Date dtmupd)
			{
				this.dtmupd = dtmupd;
			}
			
		/**
		 * @return the strStatement
		 */
		public String getStrStatement()
			{
				return this.strStatement;
			}
			
		/**
		 * @param strStatement
		 *            the strStatement to set
		 */
		public void setStrStatement(final String strStatement)
			{
				this.strStatement = strStatement;
			}
			
		/**
		 * @return the hql
		 */
		public StringBuilder getHql()
			{
				return this.hql;
			}
			
		/**
		 * @param hql
		 *            the hql to set
		 */
		public void setHql(final StringBuilder hql)
			{
				this.hql = hql;
			}
			
		/**
		 * @return the pagesize
		 */
		public int getPagesize()
			{
				return this.pagesize;
			}
			
		/**
		 * @param pagesize
		 *            the pagesize to set
		 */
		public void setPagesize(final int pagesize)
			{
				this.pagesize = pagesize;
			}
	}
