/**
 *
 */

package com.adibrata.smartdealer.dao.sales;

import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.ReturSalesDtl;
import com.adibrata.smartdealer.model.ReturSalesHdr;
import com.adibrata.smartdealer.service.sales.SalesReturnService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.job.JobPost;

;

/**
 * @author Henry
 */
public class SalesReturDao extends DaoBase implements SalesReturnService
	{
		String userupd;

		String strStatement;
		StringBuilder hql = new StringBuilder();
		private Long totalrecord;
		private int currentpage;

		public SalesReturDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{

						this.strStatement = " from SalesOrderHdr ";

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
		 * com.adibrata.smartdealer.service.sales.SalesReturn#TotalRecord(java.lang
		 * .String)
		 */

		@Override
		public void Save(final String usrupd, final ReturSalesHdr returSalesHdr, final List<ReturSalesDtl> lstreturSalesDtl) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				final Partner partner = returSalesHdr.getPartner();
				final Office office = returSalesHdr.getOffice();
				Long jobid;
				try
					{
						jobid = JobPost.JobSave(this.getSession(), partner.getPartnerCode(), office.getId(), JobPost.JobCode.salesorder, returSalesHdr.getCoaSchmHdr().getCoaSchmCode(), returSalesHdr.getValueDate(), returSalesHdr.getPostingDate(),
						        returSalesHdr.getUsrCrt()).getId();

						returSalesHdr.setJobId(jobid);
						TransactionNo(this.getSession(), partner.getPartnerCode(), office.getId(), TransactionType.salesorderreturn);

						returSalesHdr.setDtmCrt(this.dtmupd);
						returSalesHdr.setDtmUpd(this.dtmupd);
						this.getSession().save(returSalesHdr);
						for (final ReturSalesDtl arow : lstreturSalesDtl)
							{
								ReturSalesDtl returSalesDtl = new ReturSalesDtl();
								returSalesDtl = arow;
								returSalesDtl.setDtmCrt(this.dtmupd);
								returSalesDtl.setDtmUpd(this.dtmupd);
								this.getSession().save(returSalesDtl);
							}
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
		public List<ReturSalesHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<ReturSalesHdr> list = null;
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
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
		public List<ReturSalesHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<ReturSalesHdr> list = null;

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

	}
