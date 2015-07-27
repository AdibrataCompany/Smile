/**
 *
 */

package com.adibrata.smartdealer.dao.setting;

/**
 * @author Henry
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Workshop;
import com.adibrata.smartdealer.service.setting.WorkshopService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class WorkshopDao extends DaoBase implements WorkshopService
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
		
		public WorkshopDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from Workshop ";
						
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
		 * com.adibrata.smartdealer.service.setting.WorkshopService#SaveAdd(com.
		 * adibrata.smartdealer.model.Workshop)
		 */
		@Override
		public void SaveAdd(final Workshop workshop) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				final StringBuilder fulladdress = new StringBuilder();
				
				try
					{
						fulladdress.append(workshop.getAddress());
						fulladdress.append(" RT/RW: ");
						fulladdress.append(workshop.getRt());
						fulladdress.append("/");
						fulladdress.append(workshop.getRw());
						fulladdress.append(" Kelurahan: ");
						fulladdress.append(workshop.getKelurahan());
						fulladdress.append(" Kecamatan: ");
						fulladdress.append(workshop.getKecamatan());
						fulladdress.append(" ");
						fulladdress.append(workshop.getCity());
						fulladdress.append(" ");
						fulladdress.append(workshop.getZipCode());
						fulladdress.append(" ");
						
						workshop.setFullAddress(fulladdress.toString());
						workshop.setDtmCrt(this.dtmupd.getTime());
						workshop.setDtmUpd(this.dtmupd.getTime());
						this.session.save(workshop);
						
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
		 * com.adibrata.smartdealer.service.setting.WorkshopService#SaveEdit(com
		 * .adibrata.smartdealer.model.Workshop)
		 */
		@Override
		public void SaveEdit(final Workshop workshop) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				final StringBuilder fulladdress = new StringBuilder();
				
				try
					{
						fulladdress.append(workshop.getAddress());
						fulladdress.append(" RT/RW: ");
						fulladdress.append(workshop.getRt());
						fulladdress.append("/");
						fulladdress.append(workshop.getRw());
						fulladdress.append(" Kelurahan: ");
						fulladdress.append(workshop.getKelurahan());
						fulladdress.append(" Kecamatan: ");
						fulladdress.append(workshop.getKecamatan());
						fulladdress.append(" ");
						fulladdress.append(workshop.getCity());
						fulladdress.append(" ");
						fulladdress.append(workshop.getZipCode());
						fulladdress.append(" ");
						
						workshop.setFullAddress(fulladdress.toString());
						workshop.setDtmCrt(this.dtmupd.getTime());
						workshop.setDtmUpd(this.dtmupd.getTime());
						this.session.update(workshop);
						
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
		 * com.adibrata.smartdealer.service.setting.WorkshopService#SaveDel(com.
		 * adibrata.smartdealer.model.Workshop)
		 */
		@Override
		public void SaveDel(final Workshop workshop) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						
						this.session.delete(workshop);
						
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
		 * @see com.adibrata.smartdealer.service.setting.WorkshopService#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		@Override
		public List<Workshop> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<Workshop> list = null;
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
		public Workshop View(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				Workshop workshop = null;
				try
					{
						workshop = (Workshop) this.session.get(Workshop.class, id);
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return workshop;
			}
			
		@Override
		public List<Workshop> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<Workshop> list = null;
				
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
			
		@Override
		public int getCurrentpage() throws Exception
			{
				return this.currentpage;
			}
			
		public void setCurrentpage(final int currentpage)
			{
				this.currentpage = currentpage;
			}
			
		public long getTotalrecord()
			{
				return this.totalrecord;
			}
			
		public void setTotalrecord(final long totalrecord)
			{
				this.totalrecord = totalrecord;
			}
			
	}
