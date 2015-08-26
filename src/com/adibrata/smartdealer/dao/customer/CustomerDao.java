/**
 *
 */

package com.adibrata.smartdealer.dao.customer;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

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

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class CustomerDao extends DaoBase implements CustomerMaintService
	{
		StringBuilder hql = new StringBuilder();

		String strStatement;
		String userupd;
		
		public CustomerDao() throws Exception
			{
				
				// TODO Auto-generated constructor stub
				try
					{
						this.strStatement = " from Customer ";
						
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
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setFirstResult((CurrentPage - 1) * this.getPagesize());
						selectQuery.setMaxResults(this.getPagesize());
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("CustomerPaging");
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
				
				this.getSession().getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.getSession().save(customer);
						
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
		 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
		 * SaveCompanyCustomer(java.lang.String,
		 * com.adibrata.smartdealer.model.CoyCustWhInfo)
		 */
		@Override
		public void SaveCompanyCustomer(final String usrupd, final CoyCustWhInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.getSession().getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.getSession().save(customer);
						
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
		public void SaveCompanyCustomerCompetitor(final String usrupd, final List<CoyCustComptInfo> customer) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						for (final CoyCustComptInfo row : customer)
							{
								CoyCustComptInfo info = new CoyCustComptInfo();
								info = row;
								info.setDtmCrt(this.dtmupd);
								info.setDtmUpd(this.dtmupd);
								this.getSession().save(info);
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
		public void SaveCompanyCustomerShare(final String usrupd, final List<CoyCustShareInfo> customer) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						for (final CoyCustShareInfo row : customer)
							{
								CoyCustShareInfo info = new CoyCustShareInfo();
								info = row;
								info.setDtmCrt(this.dtmupd);
								info.setDtmUpd(this.dtmupd);
								this.getSession().save(info);
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
		 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
		 * SavePersonalCustomer(java.lang.String,
		 * com.adibrata.smartdealer.model.PersCust)
		 */
		
		private String FullAddressCustomer(final Customer customer)
			{
				final StringBuilder fulladdress = new StringBuilder();
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
				return fulladdress.toString();

			}

		@Override
		public Long SaveCustomer(final String usrupd, final Customer customer, final PersCust perscust, final PersCustLegalInfo perscustlegainfo, final PersCustResidenceInfo persCustResidenceInfo) throws Exception
			{
				// TODO Auto-generated method stub

				this.getSession().getTransaction().begin();
				try
					{
						
						customer.setAddress(perscustlegainfo.getAddress());
						customer.setRt(perscustlegainfo.getRt());
						customer.setRw(perscustlegainfo.getRw());
						customer.setKelurahan(perscustlegainfo.getKelurahan());
						customer.setKecamatan(perscustlegainfo.getKecamatan());
						customer.setCity(perscustlegainfo.getCity());
						customer.setZipcode(perscustlegainfo.getZipcode());
						customer.setAreaPhone1(persCustResidenceInfo.getAreaPhone1());
						customer.setAreaPhone2(persCustResidenceInfo.getAreaPhone2());
						customer.setPhoneNo1(persCustResidenceInfo.getPhoneNo1());
						customer.setPhoneNo2(persCustResidenceInfo.getPhoneNo2());
						customer.setAreaFax(persCustResidenceInfo.getAreaFax());
						customer.setFaxNo(persCustResidenceInfo.getFaxNo());
						customer.setUsrCrt(usrupd);
						customer.setUsrUpd(usrupd);
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						customer.setFullAddress(this.FullAddressCustomer(customer));

						this.getSession().save(customer);

						perscust.setId(customer.getId());
						perscust.setDtmCrt(this.dtmupd);
						perscust.setDtmUpd(this.dtmupd);
						this.getSession().save(perscust);

						perscustlegainfo.setId(customer.getId());
						perscustlegainfo.setDtmCrt(this.dtmupd);
						perscustlegainfo.setDtmUpd(this.dtmupd);
						this.getSession().save(perscustlegainfo);

						persCustResidenceInfo.setId(customer.getId());
						persCustResidenceInfo.setDtmCrt(this.dtmupd);
						persCustResidenceInfo.setDtmUpd(this.dtmupd);
						this.getSession().save(perscustlegainfo);

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
				return customer.getId();
			}

		@Override
		public Long SaveCustomer(final String usrupd, final Customer customer, final CoyCust coycust) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.getSession().getTransaction().begin();
				try
					{
						customer.setFullAddress(this.FullAddressCustomer(customer));
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						customer.setUsrCrt(usrupd);
						customer.setUsrUpd(usrupd);
						this.getSession().save(customer);

						coycust.setId(customer.getId());
						coycust.setDtmCrt(this.dtmupd);
						coycust.setDtmUpd(this.dtmupd);
						this.getSession().save(coycust);
						
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
				return customer.getId();
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
				
				this.getSession().getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.getSession().save(customer);
						
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
		public void SavePersonalCustomer(final String usrupd, final PersCustEntInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.getSession().save(customer);
						
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
		public void SavePersonalCustomer(final String usrupd, final PersCustFinancialData customer) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.getSession().save(customer);

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
		 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
		 * SavePersonalCustomer(java.lang.String,
		 * com.adibrata.smartdealer.model.PersCustJobInfo)
		 */
		@Override
		public void SavePersonalCustomer(final String usrupd, final PersCustJobInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.getSession().getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.getSession().save(customer);
						
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
		 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
		 * SavePersonalCustomer(java.lang.String,
		 * com.adibrata.smartdealer.model.PersCustLegalInfo)
		 */
		@Override
		public void SavePersonalCustomer(final String usrupd, final PersCustLegalInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.getSession().getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.getSession().save(customer);
						
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
		public void SavePersonalCustomer(final String usrupd, final PersCustOtherBussinessInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.getSession().save(customer);
						
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
		 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
		 * SavePersonalCustomer(java.lang.String,
		 * com.adibrata.smartdealer.model.PersCustResidenceInfo)
		 */
		@Override
		public void SavePersonalCustomer(final String usrupd, final PersCustResidenceInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.getSession().getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.getSession().save(customer);
						
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
		 * @see com.adibrata.smartdealer.service.customer.CustomerMaintService#
		 * SavePersonalCustomer(java.lang.String,
		 * com.adibrata.smartdealer.model.PersCustTrusteeInfo)
		 */
		@Override
		public void SavePersonalCustomer(final String usrupd, final PersCustTrusteeInfo customer) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.getSession().getTransaction().begin();
				try
					{
						customer.setDtmCrt(this.dtmupd);
						customer.setDtmUpd(this.dtmupd);
						this.getSession().save(customer);
						
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
		public void SavePersonalCustomerCreditCard(final String usrupd, final List<PersCustCcinfo> customer) throws Exception
			{
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						for (final PersCustCcinfo row : customer)
							{
								PersCustCcinfo info = new PersCustCcinfo();
								info = row;
								info.setDtmCrt(this.dtmupd);
								info.setDtmUpd(this.dtmupd);
								this.getSession().save(info);
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
		public void SavePersonalCustomerFamily(final String usrupd, final List<PersCustFamilyInfo> customer) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						for (final PersCustFamilyInfo row : customer)
							{
								PersCustFamilyInfo info = new PersCustFamilyInfo();
								info = row;
								info.setDtmCrt(this.dtmupd);
								info.setDtmUpd(this.dtmupd);
								this.getSession().save(info);
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
		public void SavePersonalCustomerOmset(final String usrupd, final List<PersCustOmsetInfo> customer) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						for (final PersCustOmsetInfo row : customer)
							{
								PersCustOmsetInfo info = new PersCustOmsetInfo();
								info = row;
								info.setDtmCrt(this.dtmupd);
								info.setDtmUpd(this.dtmupd);
								this.getSession().save(info);
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
			
		@SuppressWarnings("unchecked")
		@Override
		public CoyCust ViewCompanyCustomer(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<CoyCust> list = null;
				CoyCust cust = new CoyCust();
				try
					{
						hql.append(" from CoyCust where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("CoyCust" + customerid);
						
						list = selectQuery.list();
						for (final CoyCust row : list)
							{
								cust = row;
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return cust;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public List<CoyCustComptInfo> ViewCompanyCustomerCompetitorInfo(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<CoyCustComptInfo> list = new ArrayList<CoyCustComptInfo>();
				
				try
					{
						hql.append(" from CoyCustComptInfo where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("CoyCust" + customerid);
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
		public CoyCustWhInfo ViewCompanyCustomerWereHouse(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<CoyCustWhInfo> list = null;
				CoyCustWhInfo cust = new CoyCustWhInfo();
				try
					{
						hql.append(" from CoyCustWhInfo where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("CoyCustWhInfo" + customerid);
						list = selectQuery.list();
						for (final CoyCustWhInfo row : list)
							{
								cust = row;
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return cust;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public List<CoyCustShareInfo> ViewCompanyShareInfo(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<CoyCustShareInfo> list = new ArrayList<CoyCustShareInfo>();
				
				try
					{
						hql.append(" from PersCustCcinfo where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("CoyCust" + customerid);
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
		public Customer ViewCustomer(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<Customer> list = new ArrayList<Customer>();
				Customer cust = new Customer();
				try
					{
						hql.append(" from Customer where Id = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("Customer" + customerid);
						list = selectQuery.list();
						for (final Customer row : list)
							{
								cust = row;
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return cust;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public PersCust ViewPersonalCustomer(final Long customerid) throws Exception
			{
				
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PersCust> list = null;
				PersCust cust = new PersCust();
				try
					{
						hql.append(" from PersCust where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("PersCust" + customerid);
						list = selectQuery.list();
						for (final PersCust row : list)
							{
								cust = row;
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return cust;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public PersCustOtherBussinessInfo ViewPersonalCustomerBussinessInfo(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PersCustOtherBussinessInfo> list = null;
				PersCustOtherBussinessInfo cust = new PersCustOtherBussinessInfo();
				try
					{
						hql.append(" from PersCustOtherBussinessInfo where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("PersCustOtherBussinessInfo" + customerid);
						list = selectQuery.list();
						for (final PersCustOtherBussinessInfo row : list)
							{
								cust = row;
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return cust;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public List<PersCustCcinfo> ViewPersonalCustomerCcInfo(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PersCustCcinfo> list = new ArrayList<PersCustCcinfo>();
				
				try
					{
						hql.append(" from PersCustCcinfo where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("PersCustCcinfo" + customerid);
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
		public PersCustEmergencyInfo ViewPersonalCustomerEmeregencyInfo(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PersCustEmergencyInfo> list = null;
				PersCustEmergencyInfo cust = new PersCustEmergencyInfo();
				try
					{
						hql.append(" from PersCustEmergencyInfo where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("PersCustEmergencyInfo" + customerid);
						list = selectQuery.list();
						for (final PersCustEmergencyInfo row : list)
							{
								cust = row;
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return cust;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public PersCustEntInfo ViewPersonalCustomerEnterpreneurInfo(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PersCustEntInfo> list = null;
				PersCustEntInfo cust = new PersCustEntInfo();
				try
					{
						hql.append(" from PersCustEmergencyInfo where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("PersCustEntInfo" + customerid);
						list = selectQuery.list();
						for (final PersCustEntInfo row : list)
							{
								cust = row;
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return cust;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public List<PersCustFamilyInfo> ViewPersonalCustomerFamilyInfo(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PersCustFamilyInfo> list = new ArrayList<PersCustFamilyInfo>();
				
				try
					{
						hql.append(" from PersCustFamilyInfo where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("PersCustFamilyInfo" + customerid);
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
		public PersCustFinancialData ViewPersonalCustomerFinancialData(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PersCustFinancialData> list = null;
				PersCustFinancialData cust = new PersCustFinancialData();
				try
					{
						hql.append(" from PersCustFinancialData where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("PersCustFinancialData" + customerid);
						list = selectQuery.list();
						for (final PersCustFinancialData row : list)
							{
								cust = row;
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return cust;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public PersCustJobInfo ViewPersonalCustomerJobInfo(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PersCustJobInfo> list = null;
				PersCustJobInfo cust = new PersCustJobInfo();
				try
					{
						hql.append(" from PersCustJobInfo where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("PersCustJobInfo" + customerid);
						list = selectQuery.list();
						for (final PersCustJobInfo row : list)
							{
								cust = row;
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return cust;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public PersCustLegalInfo ViewPersonalCustomerLegalInfo(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PersCustLegalInfo> list = null;
				PersCustLegalInfo cust = new PersCustLegalInfo();
				try
					{
						hql.append(" from PersCustLegalInfo where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("PersCustLegalInfo" + customerid);
						list = selectQuery.list();
						for (final PersCustLegalInfo row : list)
							{
								cust = row;
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return cust;
			}
			
		@Override
		public List<PersCustOmsetInfo> ViewPersonalCustomerOmset(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public PersCustOtherBussinessInfo ViewPersonalCustomerOtherBussinessInfo(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PersCustOtherBussinessInfo> list = null;
				PersCustOtherBussinessInfo cust = new PersCustOtherBussinessInfo();
				try
					{
						hql.append(" from PersCustOtherBussinessInfo where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("PersCustOtherBussinessInfo" + customerid);
						list = selectQuery.list();
						for (final PersCustOtherBussinessInfo row : list)
							{
								cust = row;
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return cust;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public PersCustResidenceInfo ViewPersonalCustomerResidenceInfo(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PersCustResidenceInfo> list = null;
				PersCustResidenceInfo cust = new PersCustResidenceInfo();
				try
					{
						hql.append(" from PersCustResidenceInfo where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("PersCustResidenceInfo" + customerid);
						list = selectQuery.list();
						for (final PersCustResidenceInfo row : list)
							{
								cust = row;
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return cust;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public PersCust ViewPersonalCustomerTrusteeInfo(final Long customerid) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PersCust> list = null;
				PersCust cust = new PersCust();
				try
					{
						hql.append(" from PersCust where CustomerId = :customerid");
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setParameter("customerid", customerid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("PersCust" + customerid);
						list = selectQuery.list();
						for (final PersCust row : list)
							{
								cust = row;
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return cust;
			}
	}
