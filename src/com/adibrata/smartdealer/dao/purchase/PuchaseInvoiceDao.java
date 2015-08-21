/**
 *
 */

package com.adibrata.smartdealer.dao.purchase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.PurchaseInvoice;
import com.adibrata.smartdealer.model.SalesOrderHdr;
import com.adibrata.smartdealer.service.purchase.PurchaseInvoiceService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

/**
 * @author Henry
 */
public class PuchaseInvoiceDao extends DaoBase implements PurchaseInvoiceService
	{

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar dtmupd = Calendar.getInstance();
		StringBuilder hql = new StringBuilder();
		int pagesize;
		Session session;
		String strStatement;
		/**
		 *
		 */
		String userupd;

		public PuchaseInvoiceDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from Supplier ";

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
		public void Save(final String usrupd, final PurchaseInvoice purchaseInvoice) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						final String transno = TransactionNo(this.session, purchaseInvoice.getPartner().getPartnerCode(), purchaseInvoice.getOffice().getId(), TransactionType.purchaseinvoice);
						purchaseInvoice.setPoinvNo(transno);
						purchaseInvoice.setDtmCrt(this.dtmupd.getTime());
						purchaseInvoice.setDtmUpd(this.dtmupd.getTime());
						this.session.save(purchaseInvoice);
						
						this.session.getTransaction().commit();
						
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
		public PurchaseInvoice View(final Long id)
			{
				// TODO Auto-generated method stub
				return null;
			}

		@Override
		public SalesOrderHdr viewSalesOrderHdr(final Long id)
			{
				// TODO Auto-generated method stub
				return null;
			}

	}
