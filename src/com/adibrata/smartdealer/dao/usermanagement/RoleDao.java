/**
 *
 */

package com.adibrata.smartdealer.dao.usermanagement;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.MsRole;
import com.adibrata.smartdealer.service.usermanagement.RoleService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class RoleDao extends DaoBase implements RoleService
	{
		String userupd;
		Session session;

		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		private long totalrecord;
		private int currentpage;

		public RoleDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = "from MsRole ";

					}
				catch (final Exception exp)
					{
						this.session.close();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}

		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.usermanagement.RoleService#SaveAdd(com
		 * .adibrata.smartdealer.model.MsRole)
		 */
		@Override
		public void SaveAdd(final MsRole msRole) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						msRole.setDtmCrt(this.dtmupd);
						msRole.setDtmUpd(this.dtmupd);
						this.session.save(msRole);

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
				finally
					{

						this.session.close();
					}

			}

		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.usermanagement.RoleService#SaveEdit(
		 * com.adibrata.smartdealer.model.MsRole)
		 */
		@Override
		public void SaveEdit(final MsRole msRole) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{

						msRole.setDtmUpd(this.dtmupd);
						this.session.update(msRole);

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
		 * com.adibrata.smartdealer.service.usermanagement.RoleService#SaveDel(com
		 * .adibrata.smartdealer.model.MsRole)
		 */
		@Override
		public void SaveDel(final MsRole msRole) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{

						this.session.delete(msRole);

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
		 * com.adibrata.smartdealer.service.usermanagement.RoleService#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		@Override
		public List<MsRole> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<MsRole> list = null;
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
						list = selectQuery.list();

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				finally
					{
						this.session.close();
						this.hql.setLength(0);
					}
				return list;
			}

		@Override
		public MsRole View(final Long Id) throws Exception
			{
				// TODO Auto-generated method stub
				MsRole msRole = null;
				try
					{
						msRole = (MsRole) this.session.get(MsRole.class, Id);

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return msRole;
			}

		@Override
		public List<MsRole> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<MsRole> list = null;
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" and ");
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

	}
