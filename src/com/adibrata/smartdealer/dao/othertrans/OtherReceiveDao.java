/**
 *
 */

package com.adibrata.smartdealer.dao.othertrans;

/**
 * @author Henry
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.OtherRcvDtl;
import com.adibrata.smartdealer.model.OtherRcvHdr;
import com.adibrata.smartdealer.service.othertransactions.OtherReceiveService;

public class OtherReceiveDao extends DaoBase implements OtherReceiveService
	{
		String userupd;
		Session session;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar dtmupd = Calendar.getInstance();
		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		
		public OtherReceiveDao() throws Exception
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
		 * @see
		 * com.adibrata.smartdealer.service.othertransactions.OtherReceive#Save
		 * (com.adibrata.smartdealer.model.OtherRcvHdr,
		 * com.adibrata.smartdealer.model.OtherRcvDtl)
		 */
		@SuppressWarnings("unused")
		@Override
		public void Save(String usrupd, OtherRcvHdr otherRcvHdr, List<OtherRcvDtl> lstotherRcvDtl) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						final String transno = TransactionNo(this.session, TransactionType.otherreceive, otherRcvHdr.getPartner().getPartnerCode(), otherRcvHdr.getOffice().getId());
						otherRcvHdr.setOtherRcvNo(transno);
						otherRcvHdr.setDtmCrt(this.dtmupd.getTime());
						otherRcvHdr.setDtmUpd(this.dtmupd.getTime());
						this.session.save(otherRcvHdr);
						
						for (final OtherRcvDtl arow : lstotherRcvDtl)
							{
								final OtherRcvDtl otherRcvDtl = new OtherRcvDtl();
								otherRcvDtl.setOtherRcvHdr(otherRcvHdr);
								otherRcvDtl.setDtmCrt(this.dtmupd.getTime());
								otherRcvDtl.setDtmUpd(this.dtmupd.getTime());
								this.session.save(otherRcvDtl);
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
		 * com.adibrata.smartdealer.service.othertransactions.OtherReceive#Paging
		 * (int, java.lang.String, java.lang.String)
		 */
		@SuppressWarnings("unchecked")
		@Override
		public List<OtherRcvHdr> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<OtherRcvHdr> list = null;
				
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						final Query selectQuery = this.session.createQuery(hql.toString());
						final long totalrecord = this.TotalRecord(WhereCond);
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
		
		@SuppressWarnings("unchecked")
		@Override
		public List<OtherRcvHdr> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<OtherRcvHdr> list = null;
				
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						final Query selectQuery = this.session.createQuery(hql.toString());
						final long totalrecord = this.TotalRecord(WhereCond);
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
