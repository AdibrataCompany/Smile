/**
 *
 */

package com.adibrata.smartdealer.dao.customer;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.CoyCust;
import com.adibrata.smartdealer.model.CoyCustComptInfo;
import com.adibrata.smartdealer.model.CoyCustShareInfo;
import com.adibrata.smartdealer.model.CoyCustWhInfo;
import com.adibrata.smartdealer.model.Customer;
import com.adibrata.smartdealer.model.PersCust;
import com.adibrata.smartdealer.model.PersCustCcinfo;
import com.adibrata.smartdealer.model.PersCustEmergencyInfo;
import com.adibrata.smartdealer.model.PersCustEntInfo;
import com.adibrata.smartdealer.model.PersCustFamilyInfo;
import com.adibrata.smartdealer.model.PersCustFinancialData;
import com.adibrata.smartdealer.model.PersCustJobInfo;
import com.adibrata.smartdealer.model.PersCustLegalInfo;
import com.adibrata.smartdealer.model.PersCustOmsetInfo;
import com.adibrata.smartdealer.model.PersCustOtherBussinessInfo;
import com.adibrata.smartdealer.model.PersCustResidenceInfo;
import com.adibrata.smartdealer.model.PersCustTrusteeInfo;
import com.adibrata.smartdealer.service.customer.CustomerMaintService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class CustomerDao extends DaoBase implements CustomerMaintService
	{
		StringBuilder hql = new StringBuilder();
		int pagesize;
		Session session;
		String strStatement;
		String userupd;
		
		public CustomerDao() throws Exception
			{
				
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from Customer ";
						
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
		 * com.adibrata.smartdealer.service.customer.CustomerMaintenance#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		@SuppressWarnings("unchecked")
		@Override
		public List<Customer> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<Customer> list = null;
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
			
		@SuppressWarnings("unchecked")
		@Override
		public List<Customer> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<Customer> list = null;
				
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						final Query selectQuery = this.session.createQuery(hql.toString());
						final long totalrecord = this.TotalRecord(WhereCond);
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
			
		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.customer.CustomerMaintenance#Save(com
		 * .adibrata.smartdealer.model.Customer)
		 */
		@Override
		public void SaveCustomer(final String usrupd, final Customer customer) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder fulladdress = new StringBuilder();
				this.session.getTransaction().begin();
				try
					{
						fulladdress.append(customer.getAddress());
						if ((customer.getRt() != null) || (customer.getRt() != ""))
							{
								fulladdress.append(" RT: ");
								fulladdress.append(customer.getRt());
							}
						if ((customer.getRw() != null) || (customer.getRw() != ""))
							{
								fulladdress.append(" / RW:");
								fulladdress.append(customer.getRw());
							}

						if ((customer.getKelurahan() != null) || (customer.getKelurahan() != ""))
							{
								fulladdress.append(" Kelurahan: ");
								fulladdress.append(customer.getKelurahan());
							}

						if ((customer.getKecamatan() != null) || (customer.getKecamatan() != ""))
							{
								fulladdress.append(" Kecamatan: ");
								fulladdress.append(customer.getKecamatan());
							}

						if ((customer.getCity() != null) || (customer.getCity() != ""))
							{
								fulladdress.append("'; ");
								fulladdress.append(customer.getCity());
							}
						if ((customer.getZipcode() != null) || (customer.getZipcode() != ""))
							{
								fulladdress.append(customer.getZipcode());
								fulladdress.append(" ");
							}

						customer.setFullAddress(fulladdress.toString());
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.session.save(customer);
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
		 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
		 * SaveCompanyCustomer(java.lang.String,
		 * com.adibrata.smartdealer.model.CoyCust)
		 */
		@Override
		public void SaveCompanyCustomer(final String usrupd, final CoyCust customer) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.session.getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.session.save(customer);
						
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
		 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
		 * SaveCompanyCustomer(java.lang.String,
		 * com.adibrata.smartdealer.model.CoyCustWhInfo)
		 */
		@Override
		public void SaveCompanyCustomer(final String usrupd, final CoyCustWhInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.session.getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.session.save(customer);
						
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
		 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
		 * SavePersonalCustomer(java.lang.String,
		 * com.adibrata.smartdealer.model.PersCust)
		 */
		@Override
		public void SavePersonalCustomer(final String usrupd, final PersCust customer) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.session.getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.session.save(customer);
						
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
		 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
		 * SavePersonalCustomer(java.lang.String,
		 * com.adibrata.smartdealer.model.PersCustEmergencyInfo)
		 */
		@Override
		public void SavePersonalCustomer(final String usrupd, final PersCustEmergencyInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.session.getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.session.save(customer);
						
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
		 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
		 * SavePersonalCustomer(java.lang.String,
		 * com.adibrata.smartdealer.model.PersCustJobInfo)
		 */
		@Override
		public void SavePersonalCustomer(final String usrupd, final PersCustJobInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.session.getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.session.save(customer);
						
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
		 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
		 * SavePersonalCustomer(java.lang.String,
		 * com.adibrata.smartdealer.model.PersCustLegalInfo)
		 */
		@Override
		public void SavePersonalCustomer(final String usrupd, final PersCustLegalInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.session.getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.session.save(customer);
						
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
		 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
		 * SavePersonalCustomer(java.lang.String,
		 * com.adibrata.smartdealer.model.PersCustResidenceInfo)
		 */
		@Override
		public void SavePersonalCustomer(final String usrupd, final PersCustResidenceInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.session.getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.session.save(customer);
						
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
		 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
		 * SavePersonalCustomer(java.lang.String,
		 * com.adibrata.smartdealer.model.PersCustTrusteeInfo)
		 */
		@Override
		public void SavePersonalCustomer(final String usrupd, final PersCustTrusteeInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.session.getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.session.save(customer);
						
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
		public Customer ViewCustomer(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				Customer customer = null;
				try
					{
						customer = (Customer) this.session.get(Customer.class, id);
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return customer;
			}

		@Override
		public void SaveCompanyCustomerCompetitor(final String usrupd, final List<CoyCustComptInfo> customer) throws Exception
			{
				// TODO Auto-generated method stub
				
			}

		@Override
		public void SaveCompanyCustomerShare(final String usrupd, final List<CoyCustShareInfo> customer) throws Exception
			{
				// TODO Auto-generated method stub
				
			}

		@Override
		public void SavePersonalCustomerFamily(final String usrupd, final List<PersCustFamilyInfo> customer) throws Exception
			{
				// TODO Auto-generated method stub
				
			}

		@Override
		public void SavePersonalCustomerCreditCard(final String usrupd, final List<PersCustCcinfo> customer) throws Exception
			{
				// TODO Auto-generated method stub
				
			}

		@Override
		public void SavePersonalCustomer(final String usrupd, final PersCustEntInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				
			}

		@Override
		public void SavePersonalCustomer(final String usrupd, final PersCustFinancialData customer) throws Exception
			{
				// TODO Auto-generated method stub
				
			}

		@Override
		public void SavePersonalCustomerOmset(final String usrupd, final List<PersCustOmsetInfo> customer) throws Exception
			{
				// TODO Auto-generated method stub
				
			}

		@Override
		public void SavePersonalCustomer(final String usrupd, final PersCustOtherBussinessInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				
			}

		@Override
		public PersCust ViewPersonalCustomerTrusteeInfo(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				PersCust customer = null;
				try
					{
						customer = (PersCust) this.session.get(PersCust.class, id);
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return customer;
				
			}
			
		@Override
		public CoyCust ViewCompanyCustomer(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public List<CoyCustComptInfo> ViewCompanyCustomerCompetitorInfo(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public CoyCustWhInfo ViewCompanyCustomerWereHouse(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public List<CoyCustShareInfo> ViewCompanyShareInfo(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public PersCust ViewPersonalCustomer(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public PersCustEmergencyInfo ViewPersonalCustomerEmeregencyInfo(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public PersCustJobInfo ViewPersonalCustomerJobInfo(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public PersCustLegalInfo ViewPersonalCustomerLegalInfo(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public PersCustOtherBussinessInfo ViewPersonalCustomerOtherBussinessInfo(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public PersCustResidenceInfo ViewPersonalCustomerResidenceInfo(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public List<PersCustFamilyInfo> ViewPersonalCustomerFamilyInfo(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public List<PersCustCcinfo> ViewPersonalCustomerCcInfo(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public PersCustEntInfo ViewPersonalCustomerEnterpreneurInfo(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public PersCustFinancialData ViewPersonalCustomerFinancialData(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public List<PersCustOmsetInfo> ViewPersonalCustomerOmset(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public PersCustOtherBussinessInfo ViewPersonalCustomerBussinessInfo(final long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}

	}
