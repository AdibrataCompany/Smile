/**
 *
 */

package com.adibrata.smartdealer.dao.cashtransactions;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.AdvanceCash;
import com.adibrata.smartdealer.model.AdvanceCashReversal;
import com.adibrata.smartdealer.model.AdvanceTransaction;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.Currency;
import com.adibrata.smartdealer.model.Employee;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.cashtransactions.AdvanceCashService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AdvanceCashDao extends DaoBase implements AdvanceCashService
	{
		String userupd;
		Session session;

		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;

		public AdvanceCashDao() throws Exception
			{
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = "from AdvanceCash A, BankAccount B, Partner P, Office O, Currency C, Employee E where A.bankAccount = B.id and A.partner = P.partnerCode and A.office = O.id and B.currency = C.id and A.employee = E.id";
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
		 * com.adibrata.smartdealer.service.cashtransactions.AdvanceCashService#
		 * Save(com.adibrata.smartdealer.model.AdvanceCash)
		 */
		@Override
		public void Save(final String usrupd, final AdvanceCash advancecash) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				final Partner partner = advancecash.getPartner();
				final Office office = advancecash.getOffice();
				try
					{
						final String transno = TransactionNo(this.session, partner.getPartnerCode(), office.getId(), TransactionType.advancerequest);
						advancecash.setAdvanceCode(transno);
						advancecash.setDtmCrt(this.dtmupd);
						advancecash.setDtmUpd(this.dtmupd);
						this.session.save(advancecash);
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
		 * com.adibrata.smartdealer.service.cashtransactions.AdvanceCashService#
		 * Paging(int, java.lang.String, java.lang.String)
		 */

		@Override
		public AdvanceCash View(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				AdvanceCash advanceCash = new AdvanceCash();
				try
					{
						advanceCash = (AdvanceCash) this.session.get(AdvanceCash.class, id);

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return advanceCash;
			}

		@Override
		public List<AdvanceTransaction> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				final List<AdvanceTransaction> list = null;
				AdvanceCash advanceCash;
				BankAccount bankaccount;
				Currency currency;
				Employee employee;
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
						selectQuery.setCacheable(true);

						selectQuery.setFirstResult((int) ((totalrecord - 1) * this.pagesize));
						selectQuery.setMaxResults(this.pagesize);
						final List<Object[]> lst = selectQuery.list();

						if (lst.size() != 0)
							{
								for (final Object[] aRow : lst)
									{
										advanceCash = (AdvanceCash) aRow[0];
										bankaccount = (BankAccount) aRow[1];
										currency = (Currency) aRow[4];
										employee = (Employee) aRow[5];

										final AdvanceTransaction advance = new AdvanceTransaction();
										advance.setId(advanceCash.getId());
										advance.setAdvanceCode(advanceCash.getAdvanceCode());
										advance.setBankAccountName(bankaccount.getBankAccountName());
										advance.setValuedate(this.dateFormat.format(advanceCash.getValueDate()));
										advance.setPostingdate(this.dateFormat.format(advanceCash.getPostingDate()));
										advance.setAmount(advanceCash.getAdvanceAmount());
										advance.setCurrency(currency.getCode());
										advance.setCurrencyRate(advanceCash.getCurrencyRate());

										advance.setEmployeeName(employee.getName());
										list.add(advance);
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
				return list;
			}

		@Override
		public List<AdvanceTransaction> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				final List<AdvanceTransaction> list = null;
				AdvanceCash advanceCash;
				BankAccount bankaccount;
				Currency currency;
				Employee employee;
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
						final List<Object[]> lst = selectQuery.list();

						if (lst.size() != 0)
							{
								for (final Object[] aRow : lst)
									{
										advanceCash = (AdvanceCash) aRow[0];
										bankaccount = (BankAccount) aRow[1];
										currency = (Currency) aRow[4];
										employee = (Employee) aRow[5];

										final AdvanceTransaction advance = new AdvanceTransaction();
										advance.setId(advanceCash.getId());
										advance.setAdvanceCode(advanceCash.getAdvanceCode());
										advance.setBankAccountName(bankaccount.getBankAccountName());
										advance.setValuedate(this.dateFormat.format(advanceCash.getValueDate()));
										advance.setPostingdate(this.dateFormat.format(advanceCash.getPostingDate()));
										advance.setAmount(advanceCash.getAdvanceAmount());
										advance.setCurrency(currency.getCode());
										advance.setCurrencyRate(advanceCash.getCurrencyRate());

										advance.setEmployeeName(employee.getName());
										list.add(advance);
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
				return list;
			}

		@Override
		public void Save(final String usrupd, final AdvanceCashReversal advancecash) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						advancecash.setDtmCrt(this.dtmupd);
						advancecash.setDtmUpd(this.dtmupd);
						this.session.save(advancecash);
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

	}
