/**
 *
 */

package com.adibrata.smartdealer.dao.setting;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.AssetDocMaster;
import com.adibrata.smartdealer.service.setting.AssetDocMasterService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AssetDocMasterDao extends DaoBase implements AssetDocMasterService
	{
		String userupd;
		Session session;

		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		private int currentpage;
		private long totalrecord;

		public AssetDocMasterDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = "from AssetDocMaster ";

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
		 * @see com.adibrata.smartdealer.service.setting.AssetDocument#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		@Override
		public List<AssetDocMaster> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				this.currentpage = CurrentPage;

				List<AssetDocMaster> list = null;
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
						selectQuery.setCacheRegion("AssetDocMaster" + WhereCond);
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
		public List<AssetDocMaster> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<AssetDocMaster> list = null;

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
						selectQuery.setCacheRegion("AssetDocMaster" + WhereCond);
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

		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.setting.AssetDocument#SaveAdd(com.adibrata
		 * .smartdealer.service.setting.AssetDocument)
		 */
		@Override
		public void SaveAdd(final AssetDocMaster assetDocMaster) throws Exception
			{
				// TODO Auto-generated method stub

				this.session.getTransaction().begin();
				try
					{
						assetDocMaster.setDtmCrt(this.dtmupd);
						assetDocMaster.setDtmUpd(this.dtmupd);
						this.session.save(assetDocMaster);

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
		 * com.adibrata.smartdealer.service.setting.AssetDocument#SaveEdit(com.adibrata
		 * .smartdealer.service.setting.AssetDocument)
		 */
		@Override
		public void SaveEdit(final AssetDocMaster assetDocMaster) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{

						assetDocMaster.setDtmUpd(this.dtmupd);
						this.session.update(assetDocMaster);

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
		 * @see com.adibrata.smartdealer.service.setting.AssetDocument#SaveDel(com
		 * .adibrata.smartdealer.service.setting.AssetDocument)
		 */
		@Override
		public void SaveDel(final AssetDocMaster assetDocMaster) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{

						this.session.delete(assetDocMaster);
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
		public AssetDocMaster View(final long id) throws Exception
			{
				AssetDocMaster assetDocMaster = null;
				try
					{
						assetDocMaster = (AssetDocMaster) this.session.get(AssetDocMaster.class, id);

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return assetDocMaster;
			}

		@Override
		public int getCurrentpage() throws Exception
			{
				return this.currentpage;
			}

		public void setCurrentpage(final int currentpage)
			{
				this.currentpage = currentpage;
			}

		public long getTotalrecord()
			{
				return this.totalrecord;
			}

		public void setTotalrecord(final long totalrecord)
			{
				this.totalrecord = totalrecord;
			}

	}
