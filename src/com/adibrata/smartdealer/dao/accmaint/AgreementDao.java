
package com.adibrata.smartdealer.dao.accmaint;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.AgreementList;
import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.service.accmaint.AgreementService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AgreementDao extends DaoBase implements AgreementService
	{
		String strStatement;
		
		public AgreementDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.strStatement = "from Agrmnt A, Customer C where A.customerByCustomerId = C.Id ";
			}

		@Override
		public List<AgreementList> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				final List<AgreementList> list = new ArrayList<AgreementList>();
				Agrmnt agrmnt;
				Customer customer;
				AgreementList agrmntlist;

				try
					{
						hql.append(this.strStatement);
						if (!WhereCond.equals(""))
							{
								hql.append(" and ");
								hql.append(WhereCond);
							}
						final SQLQuery selectQuery = this.getSession().createSQLQuery(hql.toString());
						selectQuery.setFirstResult((CurrentPage - 1) * this.getPagesize());
						selectQuery.setMaxResults(this.getPagesize());
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("AgreementList" + WhereCond);
						final List<Object[]> lst = selectQuery.list();
						for (final Object[] row : lst)
							{
								agrmnt = (Agrmnt) row[0];
								customer = (Customer) row[1];
								agrmntlist = new AgreementList();
								agrmntlist.setId(agrmnt.getId());
								agrmntlist.setAgmntCode(agrmnt.getAgrmntCode());
								agrmntlist.setAgreementDate(agrmnt.getAgreementDate());
								agrmntlist.setCustomerName(customer.getName());
								agrmntlist.setCustomerAddress(customer.getFullAddress());
								agrmntlist.setContractStatus(agrmnt.getContractStatus());
								agrmntlist.setDefaultStatus(agrmnt.getDefaultStatus());
								list.add(agrmntlist);
								
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
		public List<AgreementList> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				final List<AgreementList> list = null;
				final StringBuilder hqlcount = new StringBuilder();
				Long totalrecord;
				int currentpage;
				Agrmnt agrmnt;
				Customer customer;
				AgreementList agrmntlist;
				try
					{
						hql.append(this.strStatement);
						if (!WhereCond.equals(""))
							{
								hql.append(" and ");
								hql.append(WhereCond);
							}
						final SQLQuery selectQuery = this.getSession().createSQLQuery(hql.toString());
						totalrecord = this.TotalRecord(hqlcount.toString(), WhereCond);
						currentpage = (int) ((totalrecord / this.getPagesize()) + 1);
						
						selectQuery.setFirstResult((currentpage - 1) * this.getPagesize());
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("AgreementList" + WhereCond);
						selectQuery.setMaxResults(this.getPagesize());
						final List<Object[]> lst = selectQuery.list();
						for (final Object[] row : lst)
							{
								agrmnt = (Agrmnt) row[0];
								customer = (Customer) row[1];
								agrmntlist = new AgreementList();
								agrmntlist.setId(agrmnt.getId());
								agrmntlist.setAgmntCode(agrmnt.getAgrmntCode());
								agrmntlist.setAgreementDate(agrmnt.getAgreementDate());
								agrmntlist.setCustomerName(customer.getName());
								agrmntlist.setCustomerAddress(customer.getFullAddress());
								agrmntlist.setContractStatus(agrmnt.getContractStatus());
								agrmntlist.setDefaultStatus(agrmnt.getDefaultStatus());
								list.add(agrmntlist);
								
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
		public AgreementList AgreementInfo(final Long id) throws Exception
			{
				// TODO Auto-generated method stub
				List<AgreementList> lst;
				final StringBuilder hql = new StringBuilder();
				AgreementList agrmntinfo = new AgreementList();
				try
					{
						hql.append(this.strStatement);
						final SQLQuery selectQuery = this.getSession().createSQLQuery(hql.toString());
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("AgreementList" + id);
						
						lst = selectQuery.list();
						for (final AgreementList arow : lst)
							{
								agrmntinfo = new AgreementList();
								agrmntinfo = arow;

							}
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
					
				return agrmntinfo;
			}
			
	}
