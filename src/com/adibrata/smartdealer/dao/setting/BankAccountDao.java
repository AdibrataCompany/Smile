/**
 *
 */

package com.adibrata.smartdealer.dao.setting;

/**
 * @author Henry
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.BankMaster;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.BankAccountService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class BankAccountDao extends DaoBase implements BankAccountService
	{
		String userupd;
		Session session;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar dtmupd = Calendar.getInstance();
		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		private int currentpage;
		private long totalrecord;
		
		public BankAccountDao() throws Exception
			{
				
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from BankAccount ";
						
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
		 * @see com.adibrata.smartdealer.service.setting.BankAccount#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		@Override
		public List<BankAccount> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<BankAccount> list = null;
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
		public List<BankAccount> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				final StringBuilder hql = new StringBuilder();
				List<BankAccount> list = null;
				
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
			
		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.setting.BankAccount#SaveAdd(com.adibrata
		 * .smartdealer.service.setting.BankAccount)
		 */
		@Override
		public void SaveAdd(final BankAccount bankAccount) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						bankAccount.setDtmCrt(this.dtmupd.getTime());
						bankAccount.setDtmUpd(this.dtmupd.getTime());
						this.session.save(bankAccount);
						
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
			
		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.setting.BankAccount#SaveEdit(com.adibrata
		 * .smartdealer.service.setting.BankAccount)
		 */
		@Override
		public void SaveEdit(final BankAccount bankAccount) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						
						bankAccount.setDtmUpd(this.dtmupd.getTime());
						this.session.update(bankAccount);
						
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
			
		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.setting.BankAccount#SaveDel(com.adibrata
		 * .smartdealer.service.setting.BankAccount)
		 */
		@Override
		public void SaveDel(final BankAccount bankAccount) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						
						this.session.delete(bankAccount);
						
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
		public BankAccount View(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				BankAccount bankaccount = null;
				try
					{
						bankaccount = (BankAccount) this.session.get(BankAccount.class, id);
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return bankaccount;
			}
			
		@Override
		public List<BankMaster> ListBankMaster(final String partnercode) throws Exception
			{
				final StringBuilder hql = new StringBuilder();
				List<BankMaster> list = null;

				try
					{
						hql.append("from MsTable where partnercode = :partnercode and mastertypecode = 'BANK'");
						final Query selectQuery = this.session.createQuery(hql.toString());
						selectQuery.setParameter("partnercode", partnercode);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("BankMaster" + partnercode);

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
			
		@SuppressWarnings("unchecked")
		@Override
		public List<BankAccount> listBankAccount(final Partner partner, final Office office, final String type, final String purpose) throws Exception
			{
				// TODO Auto-generated method stub
				List<BankAccount> list = new ArrayList<BankAccount>();
				Query selectQuery = null;
				try
					{

						this.hql.append(this.strStatement);
						this.hql.append(" Where partnercode = :partnercode and officeid = :officeid");
						if (!type.equals(""))
							{
								this.hql.append(" and type = '" + type + "' ");

							}
						else if (!purpose.equals(""))
							{
								this.hql.append(" and purpose = '" + purpose + "' ");
							}

						selectQuery = this.session.createQuery(this.hql.toString());

						selectQuery.setParameter("partnercode", partner.getPartnerCode());
						selectQuery.setParameter("officeid", office.getId());

						list = selectQuery.list();
					}
				catch (final Exception exp)
					{
						this.session.getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return list;
			}

	}
