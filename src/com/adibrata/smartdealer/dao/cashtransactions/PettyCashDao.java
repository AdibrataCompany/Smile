/**
 *
 */

package com.adibrata.smartdealer.dao.cashtransactions;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PettyCashDtl;
import com.adibrata.smartdealer.model.PettyCashHdr;
import com.adibrata.smartdealer.model.PettyCashList;
import com.adibrata.smartdealer.service.cashtransactions.PettyCashService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PettyCashDao extends DaoBase implements PettyCashService
	{
		String userupd;
		Session session;

		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;

		public PettyCashDao() throws Exception
			{

				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from PettyCashHdr ";

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
		 * @see com.adibrata.smartdealer.service.cashtransactions.PettyCashService#
		 * SavePettyCash(com.adibrata.smartdealer.model.PettyCashHdr,
		 * com.adibrata.smartdealer.model.PettyCashDtl)
		 */
		@Override
		public void SavePettyCash(final String usrupd, final Partner partner, final Office office, final PettyCashHdr pettycashhdr, final List<PettyCashDtl> lstpettycashdtl) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				int counter = 1;
				try
					{

						final String transno = TransactionNo(this.session, partner.getPartnerCode(), office.getId(), TransactionType.pettycashtransaction);
						pettycashhdr.setPettyCashCode(transno);
						pettycashhdr.setPartner(partner);
						pettycashhdr.setOffice(office);
						pettycashhdr.setUsrCrt(usrupd);
						pettycashhdr.setUsrUpd(usrupd);
						pettycashhdr.setDtmCrt(this.dtmupd);
						pettycashhdr.setDtmUpd(this.dtmupd);
						this.session.save(pettycashhdr);
						for (final PettyCashDtl arow : lstpettycashdtl)
							{
								PettyCashDtl pettyCashDtl = new PettyCashDtl();
								pettyCashDtl = arow;
								pettyCashDtl.setSeqNo(counter);
								pettyCashDtl.setPettyCashHdr(pettycashhdr);
								pettyCashDtl.setDtmCrt(this.dtmupd);
								pettyCashDtl.setDtmUpd(this.dtmupd);
								pettyCashDtl.setUsrCrt(usrupd);
								pettyCashDtl.setUsrUpd(usrupd);
								this.session.save(pettyCashDtl);
								counter += 1;
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

		@Override
		public List<PettyCashList> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PettyCashList> list = null;

				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						final Query selectQuery = this.session.createQuery(hql.toString());
						this.TotalRecord(this.strStatement, WhereCond);
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
		public List<PettyCashList> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PettyCashList> list = null;

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

		@Override
		public PettyCashHdr View(final long id)
			{
				// TODO Auto-generated method stub

				return null;
			}

		@Override
		public List<PettyCashDtl> ViewDetail(final PettyCashHdr pettyCashHdr) throws Exception
			{
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PettyCashDtl> list = null;

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

	}
