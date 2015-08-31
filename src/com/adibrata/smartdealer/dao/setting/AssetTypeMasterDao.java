
package com.adibrata.smartdealer.dao.setting;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.AssetDocMaster;
import com.adibrata.smartdealer.model.AssetType;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.AssetTypeService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AssetTypeMasterDao extends DaoBase implements AssetTypeService
	{
		String strStatement;
		StringBuilder hql = new StringBuilder();
		
		private int currentpage;
		private Long totalrecord;
		
		public AssetTypeMasterDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{

						this.strStatement = "from AssetType ";
						
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
		public void SaveAdd(final AssetDocMaster assetDocMaster) throws Exception
			{
				// TODO Auto-generated method stub

			}
			
		@Override
		public void Save(final AssetType assettype) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						assettype.setDtmCrt(this.dtmupd);
						assettype.setDtmUpd(this.dtmupd);
						this.getSession().saveOrUpdate(assettype);

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
		public void SaveDel(final AssetType assettype) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						
						this.getSession().delete(assettype);
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
		public List<AssetType> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				this.currentpage = CurrentPage;
				
				List<AssetType> list = null;
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
						selectQuery.setMaxResults(this.getPagesize());
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("AssetType" + WhereCond);
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
		public List<AssetType> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				this.currentpage = CurrentPage;
				
				List<AssetType> list = new ArrayList<AssetType>();
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
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("AssetDocMaster" + WhereCond);
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
		public AssetType View(final Long id) throws Exception
			{
				// TODO Auto-generated method stub
				AssetType assettype = null;
				try
					{
						assettype = (AssetType) this.getSession().get(AssetType.class, id);
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return assettype;
			}

		@SuppressWarnings("unchecked")
		@Override
		public List<AssetType> ListAssetType(final Partner partner) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();

				List<AssetType> list = new ArrayList<AssetType>();
				try
					{
						hql.append(this.strStatement);
						
						hql.append(" where ");
						hql.append(" partnerCode = :partnercode and isActive = 1 ");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("partnercode", partner.getPartnerCode());
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("AssetType" + partner);
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
		public int getCurrentpage()
			{
				return this.currentpage;
			}

		public void setCurrentpage(final int currentpage)
			{
				this.currentpage = currentpage;
			}
	}
