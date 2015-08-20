/**
 *
 */

package com.adibrata.smartdealer.dao.setting;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.OfficeService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class OfficeDao extends DaoBase implements OfficeService
	{
		String userupd;
		String strStatement;
		StringBuilder hql = new StringBuilder();
		private int currentpage;
		private Long totalrecord;
		
		public OfficeDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						
						this.strStatement = "from Office";
						
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
		 * @see com.adibrata.smartdealer.service.setting.Office#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		@Override
		public List<Office> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<Office> list = null;
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
		 * com.adibrata.smartdealer.service.setting.OfficeService#SaveAdd(com.adibrata
		 * .smartdealer.model.Office)
		 */
		@Override
		public void SaveAdd(final Office office) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				final StringBuilder fulladdress = new StringBuilder();
				
				try
					{
						fulladdress.append(office.getAddress());
						fulladdress.append(" RT/RW: ");
						fulladdress.append(office.getRt());
						fulladdress.append("/");
						fulladdress.append(office.getRw());
						fulladdress.append(" Kelurahan: ");
						fulladdress.append(office.getKelurahan());
						fulladdress.append(" Kecamatan: ");
						fulladdress.append(office.getKecamatan());
						fulladdress.append(" ");
						fulladdress.append(office.getCity());
						fulladdress.append(" ");
						fulladdress.append(office.getZipcode());
						fulladdress.append(" ");
						
						office.setFullAddress(fulladdress.toString());
						office.setDtmCrt(this.dtmupd);
						office.setDtmUpd(this.dtmupd);
						this.getSession().save(office);
						
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
		 * com.adibrata.smartdealer.service.setting.OfficeService#SaveEdit(com.adibrata
		 * .smartdealer.model.Office)
		 */
		@Override
		public void SaveEdit(final Office office) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				final StringBuilder fulladdress = new StringBuilder();
				
				try
					{
						fulladdress.append(office.getAddress());
						fulladdress.append(" RT/RW: ");
						fulladdress.append(office.getRt());
						fulladdress.append("/");
						fulladdress.append(office.getRw());
						fulladdress.append(" Kelurahan: ");
						fulladdress.append(office.getKelurahan());
						fulladdress.append(" Kecamatan: ");
						fulladdress.append(office.getKecamatan());
						fulladdress.append(" ");
						fulladdress.append(office.getCity());
						fulladdress.append(" ");
						fulladdress.append(office.getZipcode());
						fulladdress.append(" ");
						
						office.setFullAddress(fulladdress.toString());
						
						office.setDtmUpd(this.dtmupd);
						this.getSession().update(office);
						
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
		 * @see com.adibrata.smartdealer.service.setting.OfficeService#SaveDel(com
		 * .adibrata.smartdealer.model.Office)
		 */
		@Override
		public void SaveDel(final Office office) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						
						this.getSession().delete(office);
						
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
		public Office View(final Long id) throws Exception
			{
				// TODO Auto-generated method stub
				Office office = null;
				try
					{
						office = (Office) this.getSession().get(Office.class, id);
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return office;
			}
			
		@Override
		public List<Office> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<Office> list = null;
				
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
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
		public List<Office> ListOffice(final Partner partner) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<Office> list = new ArrayList<Office>();
				
				try
					{
						hql.append("from Office A, Partner B where A.partner = B.partnerCode and B.partnercCode = :partnercode and isActive = 1");
						
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("ListOffice" + partner);
						selectQuery.setParameter("partnercode", partner.getPartnerCode());

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
