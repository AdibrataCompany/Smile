/**
 *
 */

package com.adibrata.smartdealer.dao.othertrans;

import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.OtherRcvDtl;
import com.adibrata.smartdealer.model.OtherRcvHdr;
import com.adibrata.smartdealer.service.othertransactions.OtherReceiveService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.job.JobPost;

public class OtherReceiveDao extends DaoBase implements OtherReceiveService
	{
		String userupd;
		
		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		private long totalrecord;
		private int currentpage;
		
		public OtherReceiveDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						
						this.strStatement = " from Office ";
						
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
		 * @see com.adibrata.smartdealer.service.othertransactions.OtherReceive#Save(com.adibrata.smartdealer.model.OtherRcvHdr, com.adibrata.smartdealer.model.OtherRcvDtl)
		 */
		@Override
		public void Save(final String usrupd, final OtherRcvHdr otherRcvHdr, final List<OtherRcvDtl> lstotherRcvDtl) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				Long jobid;

				try
					{
						final String transno = TransactionNo(this.getSession(), otherRcvHdr.getPartner().getPartnerCode(), otherRcvHdr.getOffice().getId(), TransactionType.otherreceive);

						jobid = JobPost.JobSave(this.getSession(), otherRcvHdr.getPartner().getPartnerCode(), otherRcvHdr.getOffice().getId(), JobPost.JobCode.otherreceive, "", otherRcvHdr.getValueDate(), otherRcvHdr.getPostingDate(), usrupd)
						        .getId();
						otherRcvHdr.setJobId(jobid);
						
						otherRcvHdr.setOtherRcvCode(transno);
						otherRcvHdr.setDtmCrt(this.dtmupd);
						otherRcvHdr.setDtmUpd(this.dtmupd);
						this.getSession().save(otherRcvHdr);
						for (final OtherRcvDtl arow : lstotherRcvDtl)
							{
								OtherRcvDtl otherRcvDtl = new OtherRcvDtl();
								otherRcvDtl = arow;
								otherRcvDtl.setOtherRcvHdr(otherRcvHdr);

								otherRcvDtl.setDtmCrt(this.dtmupd);
								otherRcvDtl.setDtmUpd(this.dtmupd);

								this.getSession().save(otherRcvDtl);
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

		/*
		 * (non-Javadoc)
		 * @see com.adibrata.smartdealer.service.othertransactions.OtherReceive#Paging(int, java.lang.String, java.lang.String)
		 */
		@Override
		public List<OtherRcvHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<OtherRcvHdr> list = null;
				
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
			
		@Override
		public List<OtherRcvHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<OtherRcvHdr> list = null;
				
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
