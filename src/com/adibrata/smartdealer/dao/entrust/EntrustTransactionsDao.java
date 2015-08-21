/**
 *
 */

package com.adibrata.smartdealer.dao.entrust;

/**
 * @author Henry
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.EntrustDtl;
import com.adibrata.smartdealer.model.EntrustHdr;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.entrust.EntrustService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.transno.GetTransNo;

public class EntrustTransactionsDao extends DaoBase implements EntrustService
	{
		String userupd;
		Session session;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar dtmupd = Calendar.getInstance();
		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		
		public EntrustTransactionsDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from Office ";
						
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
		 * @see com.adibrata.smartdealer.service.entrust.EntrustTransactions#Save()
		 */
		@Override
		public void Save(final String usrupd, final EntrustHdr entrustHdr, final List<EntrustDtl> lstentrustDtl) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				final Partner partner = entrustHdr.getPartner();
				final Office office = entrustHdr.getOffice();
				
				try
					{
						final String transno = GetTransNo.GenerateTransactionNo(this.session, partner.getPartnerCode(), office.getId(), "ENTO", this.dtmupd.getTime());
						entrustHdr.setEntrustNo(transno);
						entrustHdr.setDtmCrt(this.dtmupd.getTime());
						entrustHdr.setDtmUpd(this.dtmupd.getTime());
						this.session.save(entrustHdr);
						for (final EntrustDtl arow : lstentrustDtl)
							{
								EntrustDtl entrustDtl = new EntrustDtl();
								entrustDtl = arow;
								entrustDtl.setEntrustHdr(entrustHdr);
								entrustDtl.setDtmCrt(this.dtmupd.getTime());
								entrustDtl.setDtmUpd(this.dtmupd.getTime());
								this.session.save(entrustDtl);
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
		 * @see
		 * com.adibrata.smartdealer.service.entrust.EntrustTransactions#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		@Override
		public List<EntrustHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<EntrustHdr> list = null;
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
		public EntrustHdr viewEntrusHdr(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				EntrustHdr entrustHdr = null;
				try
					{
						entrustHdr = (EntrustHdr) this.session.get(EntrustHdr.class, id);
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return entrustHdr;
			}
			
		@Override
		public List<EntrustDtl> viewEntrusDtl(final EntrustHdr entrustHdr) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<EntrustDtl> list = null;
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
		public List<EntrustHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				final StringBuilder hql = new StringBuilder();
				List<EntrustHdr> list = null;
				
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						final Query selectQuery = this.session.createQuery(hql.toString());
						final long totalrecord = this.TotalRecord(this.strStatement, WhereCond);
						selectQuery.setFirstResult((int) ((totalrecord - 1) * this.pagesize));
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
