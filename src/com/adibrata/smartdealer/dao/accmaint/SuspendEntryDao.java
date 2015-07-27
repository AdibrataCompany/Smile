
package com.adibrata.smartdealer.dao.accmaint;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.SuspendReceive;
import com.adibrata.smartdealer.service.accmaint.SuspendEntryService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.job.JobPost;

public class SuspendEntryDao extends DaoBase implements SuspendEntryService
	{
		Session session;
		String userupd;
		
		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		int currentpage;
		private long totalrecord;
		
		public SuspendEntryDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
				
				this.pagesize = HibernateHelper.getPagesize();
				this.strStatement = "from SuspendReceive ";
			}
			
		@Override
		public void SuspendEntrySave(final String usrupd, final Partner partner, final Office office, final SuspendReceive suspend) throws Exception
			{
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				long jobid;
				this.session.getTransaction().begin();
				try
					{
						
						jobid = JobPost.JobSave(this.session, partner.getPartnerCode(), office.getId(), JobPost.JobCode.suspendentry, "", suspend.getValueDate(), suspend.getPostingDate(), usrupd).getId();
						
						suspend.setJobId(jobid);
						suspend.setDtmUpd(this.dtmupd);
						suspend.setDtmCrt(this.dtmupd);
						suspend.setStatus("NE");
						this.session.save(suspend);
						this.session.flush();
						this.session.clear();
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

		@SuppressWarnings("unchecked")
		@Override
		public List<SuspendReceive> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				this.currentpage = CurrentPage;

				List<SuspendReceive> list = null;
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						final Query selectQuery = this.session.createQuery(hql.toString());
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
			
		@SuppressWarnings("unchecked")
		@Override
		public List<SuspendReceive> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<SuspendReceive> list = null;

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
			
		@Override
		public SuspendReceive View(final Long id) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
	}
