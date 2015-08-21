/**
 *
 */

package com.adibrata.smartdealer.dao.sales;

import java.util.List;
import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.SalesInvoice;
import com.adibrata.smartdealer.model.SalesOrderHdr;
import com.adibrata.smartdealer.model.Taksasi;
import com.adibrata.smartdealer.service.sales.SalesInvoiceService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

/**
 * @author Henry
 */
public class SelesInvoiceDao extends DaoBase implements SalesInvoiceService
	{

		/**
		 *
		 */
		String userupd;

		String strStatement;
		StringBuilder hql = new StringBuilder();

		private Long totalrecord;
		private int currentpage;

		public SelesInvoiceDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.strStatement = " from SalesOrderHdr ";

					}
				catch (final Exception exp)
					{
						this.getSession().getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}

		@Override
		public List<SalesOrderHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub

				final StringBuilder hql = new StringBuilder();
				List<SalesOrderHdr> list = null;
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(WhereCond);
							}

						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setFirstResult((CurrentPage - 1) * this.getPagesize());
						selectQuery.setMaxResults(this.getPagesize());
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
		public void Save(final String usrupd, final SalesInvoice salesInvoice) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{

						salesInvoice.setDtmCrt(this.dtmupd);
						salesInvoice.setDtmUpd(this.dtmupd);
						this.getSession().save(salesInvoice);

						this.getSession().getTransaction().commit();

					}
				catch (final Exception exp)
					{
						this.getSession().getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}

		@Override
		public SalesOrderHdr View(final Long id) throws Exception
			{
				// TODO Auto-generated method stub
				SalesOrderHdr salesOrderHdr = null;
				try
					{
						salesOrderHdr = (SalesOrderHdr) this.getSession().get(Taksasi.class, id);

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return salesOrderHdr;
			}

		@Override
		public List<SalesOrderHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<SalesOrderHdr> list = null;

				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						this.totalrecord = this.TotalRecord(hql.toString(), WhereCond);
						this.currentpage = (int) ((this.totalrecord / this.getPagesize()) + 1);

						selectQuery.setFirstResult((this.currentpage - 1) * this.getPagesize());
						selectQuery.setMaxResults(this.getPagesize());
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
