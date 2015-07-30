
package com.adibrata.smartdealer.dao.accmaint;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.dao.setting.BankAccountDao;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.Currency;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.SuspendList;
import com.adibrata.smartdealer.model.SuspendReceive;
import com.adibrata.smartdealer.service.accmaint.SuspendEntryService;
import com.adibrata.smartdealer.service.setting.BankAccountService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.job.JobPost;

public class SuspendEntryDao extends DaoBase implements SuspendEntryService
	{
		
		Session session;
		String userupd;

		String strStatement;
		String strStatementCount;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		int currentpage;
		private long totalrecord;

		public SuspendEntryDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();

				this.pagesize = HibernateHelper.getPagesize();
				/*
				 * this.strStatement =
				 * "select A.Id, A.ValueDate, A.SuspendCode, A.PostingDate, A.Amount, C.Code as Currency, A.CurrencyRate, A.Notes, B.bankAccountName As BankAccountName From SuspendReceive A Inner Join BankAccount B on A.BankAccountId = B.ID inner join Currency C on A.CurrencyId = C.ID";
				 * this.strStatementCount = "select Count(1) From SuspendReceive A Inner Join BankAccount B on A.BankAccountId = B.ID inner join Currency C on A.CurrencyId = C.ID";
				 */
				this.strStatement = "From SuspendReceive A, BankAccount B, Currency C  where  A.bankAccountId = B.id and A.currencyId = C.id ";
				
			}

		@Override
		public void SuspendEntrySave(final String usrupd, final Partner partner, final Office office, final SuspendReceive suspend) throws Exception
			{
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				long jobid;
				this.session.getTransaction().begin();
				try
					{
						final BankAccountService baservice = new BankAccountDao();
						jobid = JobPost.JobSave(this.session, partner.getPartnerCode(), office.getId(), JobPost.JobCode.suspendreceive, "", suspend.getValueDate(), suspend.getPostingDate(), usrupd).getId();
						suspend.setSuspendCode(DaoBase.TransactionNo(this.session, partner.getPartnerCode(), office.getId(), TransactionType.suspendreceive));
						suspend.setCurrencyId(baservice.View(suspend.getBankAccountId()).getCurrency().getId());
						suspend.setJobId(jobid);
						suspend.setDtmUpd(this.dtmupd);
						suspend.setDtmCrt(this.dtmupd);
						suspend.setStatus("NE");
						this.session.save(suspend);
						
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
			
		@SuppressWarnings(
			{
			        "unchecked", "unused", "rawtypes"
			})
		@Override
		public List<SuspendList> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				this.currentpage = CurrentPage;
				SuspendReceive receive = new SuspendReceive();
				BankAccount bankaccount = new BankAccount();
				Currency currency = new Currency();
				
				final List<SuspendList> suspendlist = new ArrayList<SuspendList>();
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
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("SuspendList" + WhereCond);
						
						/*
						 * selectQuery.addScalar("Id", new LongType());
						 * selectQuery.addScalar("SuspendCode", new StringType());
						 * selectQuery.addScalar("ValueDate", new DateType());
						 * selectQuery.addScalar("PostingDate", new DateType());
						 * selectQuery.addScalar("BankAccountName", new StringType());
						 * selectQuery.addScalar("Amount", new DoubleType());
						 * selectQuery.addScalar("Currency", new StringType());
						 * selectQuery.addScalar("CurrencyRate", new DoubleType());
						 * selectQuery.addScalar("Notes", new StringType());
						 */
						final List<Object[]> lst = selectQuery.list();
						
						if (lst.size() != 0)
							{
								for (final Object[] aRow : lst)
									{
										receive = (SuspendReceive) aRow[0];
										bankaccount = (BankAccount) aRow[1];
										currency = (Currency) aRow[2];
										
										final SuspendList suspend = new SuspendList();
										suspend.setId(receive.getId());
										suspend.setSuspendCode(receive.getSuspendCode());
										suspend.setBankAccountName(bankaccount.getBankAccountName());
										suspend.setValuedate(this.dateFormat.format(receive.getValueDate()));
										suspend.setPostingdate(this.dateFormat.format(receive.getPostingDate()));
										suspend.setAmount(receive.getAmount());
										suspend.setCurrencyCode(currency.getCode());
										suspend.setCurrencyRate(receive.getCurrencyRate());
										suspendlist.add(suspend);
									}
							}
							
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
				return suspendlist;
			}
			
		@SuppressWarnings(
			{
			        "unchecked", "null"
			})
		@Override
		public List<SuspendList> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				final List<SuspendList> suspendlist = null;
				SuspendReceive receive = new SuspendReceive();
				BankAccount bankaccount = new BankAccount();
				Currency currency = new Currency();
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						final SQLQuery selectQuery = this.session.createSQLQuery(hql.toString());
						this.totalrecord = this.TotalRecord(hql.toString(), WhereCond);
						this.currentpage = (int) ((this.totalrecord / this.pagesize) + 1);
						
						selectQuery.setFirstResult((this.currentpage - 1) * this.pagesize);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("SuspendList" + WhereCond);
						selectQuery.setMaxResults(this.pagesize);
						// selectQuery.addScalar("Id", new LongType());
						// selectQuery.addScalar("SuspendCode", new StringType());
						// selectQuery.addScalar("ValueDate", new DateType());
						// selectQuery.addScalar("PostingDate", new DateType());
						// selectQuery.addScalar("BankAccountName", new StringType());
						// selectQuery.addScalar("Amount", new DoubleType());
						// selectQuery.addScalar("Currency", new StringType());
						// selectQuery.addScalar("CurrencyRate", new DoubleType());
						// selectQuery.addScalar("Notes", new StringType());
						final List<Object[]> lst = selectQuery.list();

						if (lst.size() != 0)
							{
								for (final Object[] aRow : lst)
									{
										receive = (SuspendReceive) aRow[0];
										bankaccount = (BankAccount) aRow[1];
										currency = (Currency) aRow[2];

										final SuspendList suspend = new SuspendList();
										suspend.setId(receive.getId());
										suspend.setSuspendCode(receive.getSuspendCode());
										suspend.setBankAccountName(bankaccount.getBankAccountName());
										suspend.setValuedate(this.dateFormat.format(receive.getValueDate()));
										suspend.setPostingdate(this.dateFormat.format(receive.getPostingDate()));
										suspend.setAmount(receive.getAmount());
										suspend.setCurrencyCode(currency.getCode());
										suspend.setCurrencyRate(receive.getCurrencyRate());
										suspendlist.add(suspend);
									}
							}
						/*
						 * final List lst = selectQuery.list();
						 * if (lst.size() != 0)
						 * {
						 * for (final Object object : lst)
						 * {
						 * final Map row = (Map) object;
						 * final SuspendList suspend = new SuspendList();
						 * suspend.setId((Long) row.get("Id"));
						 * suspend.setSuspendCode((String) row.get("SuspendCode"));
						 * suspend.setBankAccountName((String) row.get("BankAccountName"));
						 * suspend.setValuedate((Date) row.get("ValueDate"));
						 * suspend.setPostingdate((Date) row.get("PostingDate"));
						 * suspend.setAmount((Double) row.get("Amount"));
						 * suspend.setCurrencyCode((String) row.get("Currency"));
						 * suspend.setCurrencyRate((Double) row.get("CurrencyRate"));
						 * suspendlist.add(suspend);
						 * }
						 * }
						 */
						
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
				return suspendlist;
			}

		@Override
		public SuspendReceive View(final Long id) throws Exception
			{
				SuspendReceive receive = null;
				try
					{
						receive = (SuspendReceive) this.session.get(SuspendReceive.class, id);

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return receive;
			}
	}
