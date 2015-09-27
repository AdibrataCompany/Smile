/**
 *
 */

package com.adibrata.smartdealer.dao.setting;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.MasterType;
import com.adibrata.smartdealer.model.MsTable;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.MasterService;

import util.adibrata.framework.cachehelper.Caching;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class MasterDao extends DaoBase implements MasterService
	{
		String userupd;
		String strStatement;
		StringBuilder hql = new StringBuilder();
		private int currentpage;
		private Long totalrecord;

		public MasterDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.strStatement = "from MsTable ";

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
		 * com.adibrata.smartdealer.service.setting.Master#SaveAdd(com.adibrata.
		 * smartdealer.model.MasterType, com.adibrata.smartdealer.model.MsTable)
		 */
		@Override
		public void SaveAdd(final MsTable MsTable) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						MsTable.setDtmCrt(this.dtmupd);
						MsTable.setDtmUpd(this.dtmupd);
						this.getSession().save(MsTable);

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

		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.setting.Master#SaveEdit(com.adibrata
		 * .smartdealer.model.MasterType,
		 * com.adibrata.smartdealer.model.MsTable)
		 */
		@Override
		public void SaveEdit(final MsTable MsTable) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{

						MsTable.setDtmUpd(this.dtmupd);
						this.getSession().update(MsTable);

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

		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.setting.Master#SaveDel(com.adibrata.
		 * smartdealer.model.MsTable)
		 */
		@Override
		public void SaveDel(final MsTable MsTable) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{

						this.getSession().delete(MsTable);

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

		/*
		 * (non-Javadoc)
		 * @see com.adibrata.smartdealer.service.setting.Master#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		@Override
		public List<MsTable> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<MsTable> list = null;
				try
					{
						hql.append(this.strStatement);
						if (!WhereCond.equals(""))
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}

						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setFirstResult((CurrentPage - 1) * this.getPagesize());
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("MsTable" + WhereCond);
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

		@SuppressWarnings("null")
		@Override
		public List<MasterType> ListMasterType() throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<MasterType> list = new ArrayList<MasterType>();
				final Query selectQuery;

				try
					{
						hql.append("from MasterType");

						// selectQuery = this.getSession().createQuery(hql.toString());
						// selectQuery.setCacheable(true);
						// selectQuery.setCacheRegion("MasterType");
						// list = selectQuery.list();

						// cache.put("MasterType", list);

						selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("MasterType");
						final Caching<String, List<MasterType>> cache = new Caching<String, List<MasterType>>();
						if (cache.get("MasterTypeCache") == null)
							{
								list = selectQuery.list();
								cache.put("MasterTypeCache", list);
							}
						else
							{
								list = cache.get("MasterTypeCache");
							}

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
		public MsTable View(final Long id) throws Exception
			{
				MsTable MsTable = null;
				try
					{
						MsTable = (MsTable) this.getSession().get(MsTable.class, id);
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return MsTable;
			}

		@Override
		public List<MsTable> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<MsTable> list = null;
				
				try
					{
						hql.append(this.strStatement);
						if (!WhereCond.equals(""))
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						this.totalrecord = this.TotalRecord(hql.toString(), WhereCond);
						this.currentpage = (int) ((this.totalrecord / this.getPagesize()) + 1);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("MsTable" + WhereCond);
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

		@Override
		public int getCurrentpage()
			{
				return this.currentpage;
			}

		public void setCurrentpage(final int currentpage)
			{
				this.currentpage = currentpage;
			}
			
		@Override
		public List<MsTable> ListMaster(final Partner partner, final String MasterType) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<MsTable> list = new ArrayList<MsTable>();
				try
					{
						hql.append("from MsTable A, Partner B where A.partner = B.partnerCode and A.masterTypeCode =:mastertype and B.partnerCode = :partnercode and A.isActive =1");
						
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("mastertype", MasterType);
						selectQuery.setParameter("partnercode", partner.getPartnerCode());

						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("MsTable" + MasterType);
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
