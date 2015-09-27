/**
 *
 */

package com.adibrata.smartdealer.dao.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.BankAccountInfo;
import com.adibrata.smartdealer.model.BankMaster;
import com.adibrata.smartdealer.model.Currency;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.BankAccountService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class BankAccountDao extends DaoBase implements BankAccountService
	{
		String userupd;
		String strStatement;
		StringBuilder hql = new StringBuilder();
		private int currentpage;
		private Long totalrecord;
		
		public BankAccountDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						// this.strStatement = " from BankAccount ";
						this.strStatement = "Select a.id, a.BankAccountName, a.BankName, a.BankAccountCode, b.Code as CurrencyId from bankaccount a inner join currency b on a.currencyid = b.Id ";
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
						if (!WhereCond.equals(""))
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
							
						final SQLQuery selectQuery = this.getSession().createSQLQuery(hql.toString());
						selectQuery.setFirstResult((CurrentPage - 1) * this.getPagesize());
						selectQuery.setMaxResults(this.getPagesize());
						selectQuery.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
						
						selectQuery.addScalar("id", new LongType()).addScalar("BankAccountName", new StringType()).addScalar("BankName", new StringType()).addScalar("BankAccountCode", new StringType());
						
						final List lst = selectQuery.list();
						list = new ArrayList<BankAccount>();
						BankAccount ba;
						if (lst.size() != 0)
							{
								for (final Object object : lst)
									{
										final Map row = (Map) object;
										ba = new BankAccount();
										ba.setId((long) row.get("id"));
										ba.setBankAccountName((String) row.get("BankAccountName"));
										ba.setBankName((String) row.get("BankName"));
										ba.setBankAccountCode((String) row.get("BankAccountCode"));
										list.add(ba);
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
			
		@SuppressWarnings("unchecked")
		@Override
		public List<BankAccount> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				final StringBuilder hql = new StringBuilder();
				List<BankAccount> list = null;
				
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
				this.getSession().getTransaction().begin();
				try
					{
						bankAccount.setDtmCrt(this.dtmupd);
						bankAccount.setDtmUpd(this.dtmupd);
						this.getSession().save(bankAccount);
						
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
		 * com.adibrata.smartdealer.service.setting.BankAccount#SaveEdit(com.adibrata
		 * .smartdealer.service.setting.BankAccount)
		 */
		@Override
		public void SaveEdit(final BankAccount bankAccount) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						
						bankAccount.setDtmUpd(this.dtmupd);
						this.getSession().update(bankAccount);
						
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
		 * com.adibrata.smartdealer.service.setting.BankAccount#SaveDel(com.adibrata
		 * .smartdealer.service.setting.BankAccount)
		 */
		@Override
		public void SaveDel(final BankAccount bankAccount) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						
						this.getSession().delete(bankAccount);
						
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
		public BankAccount View(final Long id) throws Exception
			{
				// TODO Auto-generated method stub
				BankAccount bankaccount = null;
				try
					{
						bankaccount = (BankAccount) this.getSession().get(BankAccount.class, id);
						
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
			
		@SuppressWarnings("unchecked")
		@Override
		public List<BankMaster> ListBankMaster(final String partnercode) throws Exception
			{
				final StringBuilder hql = new StringBuilder();
				List<BankMaster> list = null;

				try
					{
						hql.append("from MsTable where partnercode = :partnercode and mastertypecode = 'BANK'");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
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

						selectQuery = this.getSession().createQuery(this.hql.toString());

						selectQuery.setParameter("partnercode", partner.getPartnerCode());
						selectQuery.setParameter("officeid", office.getId());

						list = selectQuery.list();
					}
				catch (final Exception exp)
					{
						this.getSession().getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return list;
			}
			
		@Override
		public BankAccountInfo BankAccountView(final Long id) throws Exception
			{
				// TODO Auto-generated method stub
				String hql;
				List<Object[]> lst;
				hql = "from BankAccount A, Currency C where A.currency = C.id and A.id =:id";
				final Query selectQuery = this.getSession().createQuery(hql.toString());
				selectQuery.setParameter("id", id);
				selectQuery.setCacheable(true);
				final BankAccountInfo info = new BankAccountInfo();
				BankAccount account = new BankAccount();
				Currency currency = new Currency();
				
				lst = selectQuery.list();
				for (final Object[] row : lst)
					{
						account = (BankAccount) row[0];
						currency = (Currency) row[1];
						info.setId(account.getId());
						info.setName(account.getBankAccountName());
						info.setPurpose(account.getPurpose());
						info.setType(account.getType());
						info.setCurrency(currency.getCode());
						info.setCurrencyid(currency.getId());
					}
				return info;
			}

	}
