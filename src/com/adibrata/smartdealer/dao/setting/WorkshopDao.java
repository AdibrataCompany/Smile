/**
 *
 */

package com.adibrata.smartdealer.dao.setting;

import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Workshop;
import com.adibrata.smartdealer.service.setting.WorkshopService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class WorkshopDao extends DaoBase implements WorkshopService
	{
		String userupd;
		String strStatement;
		StringBuilder hql = new StringBuilder();
		private int currentpage;
		private long totalrecord;
		
		public WorkshopDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.strStatement = " from Workshop ";
						
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
		 * com.adibrata.smartdealer.service.setting.WorkshopService#SaveAdd(com.
		 * adibrata.smartdealer.model.Workshop)
		 */
		@Override
		public void SaveAdd(final Workshop workshop) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
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
						workshop.setDtmCrt(this.dtmupd);
						workshop.setDtmUpd(this.dtmupd);
						this.getSession().save(workshop);
						
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
		 * com.adibrata.smartdealer.service.setting.WorkshopService#SaveEdit(com
		 * .adibrata.smartdealer.model.Workshop)
		 */
		@Override
		public void SaveEdit(final Workshop workshop) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
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
						workshop.setDtmCrt(this.dtmupd);
						workshop.setDtmUpd(this.dtmupd);
						this.getSession().update(workshop);
						
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
		 * com.adibrata.smartdealer.service.setting.WorkshopService#SaveDel(com.
		 * adibrata.smartdealer.model.Workshop)
		 */
		@Override
		public void SaveDel(final Workshop workshop) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						
						this.getSession().delete(workshop);
						
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
			
		@Override
		public Workshop View(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				Workshop workshop = null;
				try
					{
						workshop = (Workshop) this.getSession().get(Workshop.class, id);
						
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
