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
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
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
		public long TotalRecord(final String strStatement, final String WhereCond) throws Exception
			{
				// TODO Auto-generated method stub
				long countResults = 0;
				try
					{
						String countQ = "Select count (id) " + strStatement;
						if (WhereCond != "")
							{
								countQ = " where " + WhereCond;
								
							}
							
						final Query countQuery = this.session.createQuery(countQ);
						countResults = (long) countQuery.uniqueResult();
						
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
				
				accountpayable("APD"), advancerequest("ADV"), advancereturn("ADR"), danatunai("DTN"), entrustout("ENTO"), entrustreceive("ENTR"), otherdisburse(
				
				"OTD"), otherreceive("OTR"), paymentrequest("PYR"), paymentvoucher(
				
				"PVD"), pettycashcorretion("PCO"), pettycashreimburse("PCR"), pettycashtransaction(
				
				"PCT"), prepaidreceive("PRV"), purchaseinvoice("PRI"), purchaseorder(
				
				"PRO"), purchasereturn("PRR"), salesorder("SAO"), salesorderreturn(
				
				"SAR"), service("SVC");
				
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
			
		public static String TransactionNo(final Session session, final TransactionType trans,
		
		final String partnercode, final long officeid) throws Exception
			{
				
				String transno = "";
				
				transno = GetTransNo.GenerateTransactionNo(session, partnercode,
				
				officeid, trans.getTransactionType(), Calendar.getInstance().getTime());
				
				return transno;
				
			}
			
	}
