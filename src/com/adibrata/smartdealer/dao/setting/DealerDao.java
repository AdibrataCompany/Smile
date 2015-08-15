/**
 *
 */

package com.adibrata.smartdealer.dao.setting;

import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Supplier;
import com.adibrata.smartdealer.service.setting.DealerService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

/**
 * @author Henry
 */
public class DealerDao extends DaoBase implements DealerService
	{
		String userupd;
		String strStatement;
		StringBuilder hql = new StringBuilder();
		private int currentpage;
		private Long totalrecord;

		/**
		 *
		 */
		public DealerDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{

						this.strStatement = " from Supplier ";

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
		 * com.adibrata.smartdealer.service.setting.DealerService#SaveAdd(com.adibrata
		 * .smartdealer.model.Supplier)
		 */
		@Override
		public void SaveAdd(final Supplier supplier) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				final StringBuilder fulladdress = new StringBuilder();

				try
					{
						fulladdress.append(supplier.getAddress());
						fulladdress.append(" RT/RW: ");
						fulladdress.append(supplier.getRt());
						fulladdress.append("/");
						fulladdress.append(supplier.getRw());
						fulladdress.append(" Kelurahan: ");
						fulladdress.append(supplier.getKelurahan());
						fulladdress.append(" Kecamatan: ");
						fulladdress.append(supplier.getKecamatan());
						fulladdress.append(" ");
						fulladdress.append(supplier.getCity());
						fulladdress.append(" ");
						fulladdress.append(supplier.getZipcode());
						fulladdress.append(" ");

						supplier.setFullAddress(fulladdress.toString());
						supplier.setDtmCrt(this.dtmupd);
						supplier.setDtmUpd(this.dtmupd);
						this.getSession().save(supplier);

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
		 * com.adibrata.smartdealer.service.setting.DealerService#SaveEdit(com.adibrata
		 * .smartdealer.model.Supplier)
		 */
		@Override
		public void SaveEdit(final Supplier supplier) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				final StringBuilder fulladdress = new StringBuilder();

				try
					{
						fulladdress.append(supplier.getAddress());
						fulladdress.append(" RT/RW: ");
						fulladdress.append(supplier.getRt());
						fulladdress.append("/");
						fulladdress.append(supplier.getRw());
						fulladdress.append(" Kelurahan: ");
						fulladdress.append(supplier.getKelurahan());
						fulladdress.append(" Kecamatan: ");
						fulladdress.append(supplier.getKecamatan());
						fulladdress.append(" ");
						fulladdress.append(supplier.getCity());
						fulladdress.append(" ");
						fulladdress.append(supplier.getZipcode());
						fulladdress.append(" ");

						supplier.setFullAddress(fulladdress.toString());

						supplier.setDtmUpd(this.dtmupd);
						this.getSession().update(supplier);

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
		 * com.adibrata.smartdealer.service.setting.DealerService#SaveDel(com.adibrata
		 * .smartdealer.model.Supplier)
		 */

		@Override
		public void SaveDel(final Supplier supplier) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{

						this.getSession().delete(supplier);

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
		 * @see com.adibrata.smartdealer.service.setting.DealerService#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		@Override
		public List<Supplier> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<Supplier> list = null;
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
		public Supplier View(final Long id) throws Exception
			{
				// TODO Auto-generated method stub
				Supplier supplier = null;
				try
					{
						supplier = (Supplier) this.getSession().get(Supplier.class, id);

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return supplier;
			}

		@Override
		public List<Supplier> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<Supplier> list = null;

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

	}
