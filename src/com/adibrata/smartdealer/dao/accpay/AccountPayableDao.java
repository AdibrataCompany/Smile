/**
 *
 */

package com.adibrata.smartdealer.dao.accpay;

import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.AccountPayable;
import com.adibrata.smartdealer.service.accpay.APSelectionService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

/**
 * @author Henry
 */
public class AccountPayableDao extends DaoBase implements APSelectionService
	{
		
		StringBuilder hql = new StringBuilder();
		String strStatement;
		String userupd;
		
		/*
		 * (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		
		public AccountPayableDao() throws Exception
			{
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
				// TODO Auto-generated constructor stub
			}
			
		/*
		 * (non-Javadoc)
		 * @see com.adibrata.smartdealer.service.accpay.Selection#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		@Override
		public List<AccountPayable> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<AccountPayable> list = null;
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
			
		/*
		 * (non-Javadoc)
		 * @see com.adibrata.smartdealer.service.accpay.Selection#Save(com.adibrata.
		 * smartdealer.model.Customer)
		 */
		@Override
		public void Save(final AccountPayable accountPayable) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				
				try
					{
						accountPayable.setDtmCrt(this.dtmupd);
						accountPayable.setDtmUpd(this.dtmupd);
						this.getSession().save(accountPayable);
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
		 * com.adibrata.smartdealer.service.accpay.Selection#TotalRecord(java.lang
		 * .String)
		 */
		
		@Override
		public AccountPayable View(final Long id) throws Exception
			{
				// TODO Auto-generated method stub
				AccountPayable accountPayable = null;
				try
					{
						accountPayable = (AccountPayable) this.getSession().get(AccountPayable.class, id);
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return accountPayable;
			}
			
	}
