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

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.SalesOrderDtl;
import com.adibrata.smartdealer.model.SalesOrderHdr;
import com.adibrata.smartdealer.service.sales.SalesOrderService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.job.JobPost;

;

/**
 * @author Henry
 */
public class SalesOrderDao extends DaoBase implements SalesOrderService
	{
		String userupd;
		Session session;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar dtmupd = Calendar.getInstance();
		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		private long totalrecord;
		private int currentpage;
		
		public SalesOrderDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from SalesOrderHdr ";
						
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
			
		/*
		 * (non-Javadoc)
		 * @see com.adibrata.smartdealer.service.sales.SalesTransactions#Save()
		 */
		@Override
		public void Save(final String usrupd, final SalesOrderHdr salesOrderHdr, final List<SalesOrderDtl> lstsalesOrderDtl) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				final Partner partner = salesOrderHdr.getPartner();
				final Office office = salesOrderHdr.getOffice();
				long jobid = 0;
				
				try
					{
						jobid = JobPost.JobSave(this.session, partner.getPartnerCode(), office.getId(), JobPost.JobCode.salesorder, salesOrderHdr.getCoaSchmHdr().getCoaSchmCode(), salesOrderHdr.getValueDate(), salesOrderHdr.getPostingDate(),
						        salesOrderHdr.getUsrCrt()).getId();
								
						salesOrderHdr.setJobId(jobid);
						final String transno = TransactionNo(this.session, partner.getPartnerCode(), office.getId(), TransactionType.salesorder);
						salesOrderHdr.setSono(transno);
						salesOrderHdr.setDtmCrt(this.dtmupd.getTime());
						salesOrderHdr.setDtmUpd(this.dtmupd.getTime());
						this.session.save(salesOrderHdr);
						for (final SalesOrderDtl arow : lstsalesOrderDtl)
							{
								SalesOrderDtl salesOrderDtl = new SalesOrderDtl();
								salesOrderDtl = arow;
								salesOrderDtl.setDtmCrt(this.dtmupd.getTime());
								salesOrderDtl.setDtmUpd(this.dtmupd.getTime());
								this.session.save(salesOrderDtl);
							}
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
			
		/*
		 * (non-Javadoc)
		 * @see com.adibrata.smartdealer.service.sales.SalesTransactions#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		@Override
		public List<Customer> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<Customer> list = null;
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(WhereCond);
							}
							
						final Query selectQuery = this.session.createQuery(hql.toString());
						selectQuery.setFirstResult((CurrentPage - 1) * this.pagesize);
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
			
		@Override
		public SalesOrderHdr viewSalesOrderHdr(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				SalesOrderHdr salesOrderHdr = null;
				try
					{
						salesOrderHdr = (SalesOrderHdr) this.session.get(SalesOrderHdr.class, id);
						
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
		public Customer viewCustomer(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				Customer customer = null;
				try
					{
						customer = (Customer) this.session.get(Customer.class, id);
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return customer;
			}
			
		@Override
		public List<SalesOrderDtl> viewSalesOrderDtls(final SalesOrderHdr salesOrderHdr) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<SalesOrderDtl> list = null;
				try
					{
						hql.append(this.strStatement);
						final Query selectQuery = this.session.createQuery(hql.toString());
						
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
		public List<Customer> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// / TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<Customer> list = null;
				
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						final Query selectQuery = this.session.createQuery(hql.toString());
						this.totalrecord = this.TotalRecord(hql.toString(), WhereCond);
						this.currentpage = (int) ((this.totalrecord / this.pagesize) + 1);
						
						selectQuery.setFirstResult((this.currentpage - 1) * this.pagesize);
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
			
		public int getPagesize()
			{
				return this.pagesize;
			}
			
		public void setPagesize(final int pagesize)
			{
				this.pagesize = pagesize;
			}
			
		public long getTotalrecord()
			{
				return this.totalrecord;
			}
			
		public void setTotalrecord(final long totalrecord)
			{
				this.totalrecord = totalrecord;
			}
			
		@Override
		public int getCurrentpage()
			{
				return this.currentpage;
			}
			
		public void setCurrentpage(final int currentpage)
			{
				this.currentpage = currentpage;
			}
	}
