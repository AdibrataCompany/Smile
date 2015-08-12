/**
 *
 */

package com.adibrata.smartdealer.dao.setting;

import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.AssetMaster;
import com.adibrata.smartdealer.service.setting.AssetMasterService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AssetMasterDao extends DaoBase implements AssetMasterService
	{
		String userupd;

		String strStatement;
		StringBuilder hql = new StringBuilder();
		
		private int currentpage;
		private long totalrecord;

		public AssetMasterDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{

						this.strStatement = " from AssetMaster ";

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

						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setFirstResult((CurrentPage - 1) * this.getPagesize());
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("AssetMaster" + WhereCond);
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
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						this.totalrecord = this.TotalRecord(hql.toString(), WhereCond);
						this.currentpage = (int) ((this.totalrecord / this.getPagesize()) + 1);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("AssetMaster" + WhereCond);
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
				this.getSession().getTransaction().begin();
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
						this.getSession().save(assetMaster);
						
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
				this.getSession().getTransaction().begin();
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
						this.getSession().update(assetMaster);
						
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
				this.getSession().getTransaction().begin();
				try
					{

						this.getSession().delete(assetMaster);

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
		public AssetMaster View(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				AssetMaster assetmaster = null;
				try
					{
						assetmaster = (AssetMaster) this.getSession().get(AssetMaster.class, id);
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
