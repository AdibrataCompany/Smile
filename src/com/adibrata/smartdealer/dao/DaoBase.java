/**
 *
 */

package com.adibrata.smartdealer.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.adibrata.smartdealer.model.AgreementList;
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
			
		public static String TransactionNo(final Session session, final String partnercode, final long officeid, final TransactionType trans
		
		) throws Exception
			{
				
				String transno = "";
				
				transno = GetTransNo.GenerateTransactionNo(session, partnercode,
				
				officeid, trans.getTransactionType(), Calendar.getInstance().getTime());
				
				return transno;
				
			}
			
		@Override
		public List<AgreementList> AgreementPaging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				List<AgreementList> list = null;
				try
					{
						this.hql.append(this.strStatement);
						if (WhereCond != "")
							{
								this.hql.append(" where ");
								this.hql.append(WhereCond);
							}
						final SQLQuery selectQuery = this.session.createSQLQuery(this.hql.toString());
						selectQuery.setFirstResult((CurrentPage - 1) * this.pagesize);
						selectQuery.setMaxResults(this.pagesize);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("SuspendList" + WhereCond);
						list = selectQuery.list();
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return list;
			}

		@Override
		public List<AgreementList> AgreementPaging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				this.hql = new StringBuilder();
				List<AgreementList> list = null;
				final StringBuilder hqlcount = new StringBuilder();
				Long totalrecord;
				int currentpage;
				try
					{
						this.hql.append("Select A.Id, A.AgrmntCode, C.Id as CustomerId, C.Name, C.FullAddress From agrmnt A inner join customer C on A.CustomerID = C.id ");
						hqlcount.append("Select Count(1) From agrmnt A inner join customer C on A.CustomerID = C.id ");
						this.hql.append(this.strStatement);
						if (WhereCond != "")
							{
								this.hql.append(" where ");
								this.hql.append(WhereCond);
							}
						final SQLQuery selectQuery = this.session.createSQLQuery(this.hql.toString());
						totalrecord = this.TotalRecord(hqlcount.toString(), WhereCond);
						currentpage = (int) ((totalrecord / this.pagesize) + 1);
						
						selectQuery.setFirstResult((currentpage - 1) * this.pagesize);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("SuspendList" + WhereCond);
						selectQuery.setMaxResults(this.pagesize);
						list = selectQuery.list();
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return list;
			}
	}
