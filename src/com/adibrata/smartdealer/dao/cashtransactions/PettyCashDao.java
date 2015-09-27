/**
 *
 */

package com.adibrata.smartdealer.dao.cashtransactions;

import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PettyCashDtl;
import com.adibrata.smartdealer.model.PettyCashHdr;
import com.adibrata.smartdealer.model.PettyCashList;
import com.adibrata.smartdealer.service.cashtransactions.PettyCashService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.job.JobPost;

public class PettyCashDao extends DaoBase implements PettyCashService
	{
		String userupd;
		
		String strStatement;
		StringBuilder hql = new StringBuilder();
		
		public PettyCashDao() throws Exception
			{
				
				// TODO Auto-generated constructor stub
				try
					{
						this.strStatement = "from PettyCashHdr ";
						
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
		 * @see com.adibrata.smartdealer.service.cashtransactions.PettyCashService#
		 * SavePettyCash(com.adibrata.smartdealer.model.PettyCashHdr,
		 * com.adibrata.smartdealer.model.PettyCashDtl)
		 */
		@Override
		public void SavePettyCash(final String usrupd, final Partner partner, final Office office, final PettyCashHdr pettycashhdr, final List<PettyCashDtl> lstpettycashdtl) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				int counter = 1;
				final Long jobid;
				PettyCashDtl pettyCashDtl;
				try
					{
						
						final String transno = TransactionNo(this.getSession(), partner.getPartnerCode(), office.getId(), TransactionType.pettycashtransaction);
						jobid = JobPost.JobSave(this.getSession(), partner.getPartnerCode(), office.getId(), JobPost.JobCode.pettycashtransaction, "", pettycashhdr.getValueDate(), pettycashhdr.getPostingDate(), usrupd).getId();
						pettycashhdr.setPettyCashCode(transno);
						pettycashhdr.setJobId(jobid);
						pettycashhdr.setPartner(partner);
						pettycashhdr.setOffice(office);
						pettycashhdr.setUsrCrt(usrupd);
						pettycashhdr.setUsrUpd(usrupd);
						pettycashhdr.setDtmCrt(this.dtmupd);
						pettycashhdr.setDtmUpd(this.dtmupd);
						this.getSession().save(pettycashhdr);
						for (final PettyCashDtl arow : lstpettycashdtl)
							{
								pettyCashDtl = new PettyCashDtl();
								pettyCashDtl = arow;
								pettyCashDtl.setSeqNo(counter);
								pettyCashDtl.setPettyCashHdr(pettycashhdr);
								pettyCashDtl.setDtmCrt(this.dtmupd);
								pettyCashDtl.setDtmUpd(this.dtmupd);
								pettyCashDtl.setUsrCrt(usrupd);
								pettyCashDtl.setUsrUpd(usrupd);
								this.getSession().save(pettyCashDtl);
								counter += 1;
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
		public List<PettyCashList> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PettyCashList> list = null;
				
				try
					{
						hql.append(this.strStatement);
						if (!WhereCond.equals(""))
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						this.TotalRecord(this.strStatement, WhereCond);
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
		public List<PettyCashList> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PettyCashList> list = null;
				
				try
					{
						hql.append(this.strStatement);
						if (!WhereCond.equals(""))
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						final Long totalrecord = this.TotalRecord(this.strStatement, WhereCond);
						selectQuery.setFirstResult((int) ((totalrecord - 1) * this.getPagesize()));
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
		public PettyCashHdr View(final Long id)
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
						
						final Query selectQuery = this.getSession().createQuery(hql.toString());
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
