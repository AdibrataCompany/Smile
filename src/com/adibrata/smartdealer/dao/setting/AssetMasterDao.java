/**
 *
 */

package com.adibrata.smartdealer.dao.setting;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.AssetMaster;
import com.adibrata.smartdealer.service.setting.AssetMasterService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AssetMasterDao extends DaoBase implements AssetMasterService
	{
		String userupd;
		Session session;

		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		private int currentpage;
		private long totalrecord;

		public AssetMasterDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from AssetMaster ";

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
		 * com.adibrata.smartdealer.service.setting.AssetMaster#Save(com.adibrata
		 * .smartdealer.service.setting.AssetMaster)
		 */

		/*
		 * (non-Javadoc)
		 * @see com.adibrata.smartdealer.service.setting.AssetMaster#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		@Override
		public List<AssetMaster> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{

				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<AssetMaster> list = null;
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
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("AssetMaster" + WhereCond);
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
						hql.setLength(0);
					}
				return list;
			}

		@SuppressWarnings("unchecked")
		@Override
		public List<AssetMaster> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				final StringBuilder hql = new StringBuilder();
				List<AssetMaster> list = null;

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
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("AssetMaster" + WhereCond);
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
				finally
					{
						hql.setLength(0);
					}
				return list;
			}

		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.setting.AssetMaster#SaveAdd(com.adibrata
		 * .smartdealer.service.setting.AssetMaster)
		 */
		@Override
		public void SaveAdd(final AssetMaster assetMaster) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				final StringBuilder assetcode = new StringBuilder();
				try
					{
						assetcode.append(assetMaster.getAssetBrand());
						assetcode.append(".");
						assetcode.append(assetMaster.getAssetType());
						assetcode.append(".");
						assetcode.append(assetMaster.getAssetModel());

						assetMaster.setDtmCrt(this.dtmupd);
						assetMaster.setDtmUpd(this.dtmupd);
						assetMaster.setAssetCode(assetcode.toString());
						this.session.save(assetMaster);
						
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
						assetcode.setLength(0);
					}
			}

		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.setting.AssetMaster#SaveEdit(com.adibrata
		 * .smartdealer.service.setting.AssetMaster)
		 */
		@Override
		public void SaveEdit(final AssetMaster assetMaster) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				final StringBuilder assetcode = new StringBuilder();
				try
					{
						assetcode.append(assetMaster.getAssetBrand());
						assetcode.append(".");
						assetcode.append(assetMaster.getAssetType());
						assetcode.append(".");
						assetcode.append(assetMaster.getAssetModel());
						
						assetMaster.setDtmCrt(this.dtmupd);
						assetMaster.setDtmUpd(this.dtmupd);
						assetMaster.setAssetCode(assetcode.toString());
						
						assetMaster.setDtmUpd(this.dtmupd);
						this.session.update(assetMaster);
						
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
						assetcode.setLength(0);
					}
			}
			
		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.setting.AssetMaster#SaveDel(com.adibrata
		 * .smartdealer.service.setting.AssetMaster)
		 */
		@Override
		public void SaveDel(final AssetMaster assetMaster) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{

						this.session.delete(assetMaster);

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
		public AssetMaster View(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				AssetMaster assetmaster = null;
				try
					{
						assetmaster = (AssetMaster) this.session.get(AssetMaster.class, id);

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return assetmaster;
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
