/**
 *
 */

package com.adibrata.smartdealer.dao.repair;

/**
 * @author Henry
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.ServiceDtl;
import com.adibrata.smartdealer.model.ServiceHdr;
import com.adibrata.smartdealer.model.ServiceItem;
import com.adibrata.smartdealer.model.Workshop;
import com.adibrata.smartdealer.service.repair.RepairService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class RepairEntryDao extends DaoBase implements RepairService
	{

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date dtmupd = Calendar.getInstance().getTime();
		StringBuilder hql = new StringBuilder();
		int pagesize;
		Session session;
		String strStatement;
		/**
		 *
		 */
		String userupd;

		public RepairEntryDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from ServiceHdr ";

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

		@SuppressWarnings("unchecked")
		@Override
		public List<ServiceHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy)
			{
				// TODO Auto-generated method stub
				return null;
			}

		@Override
		public List<Workshop> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// / TODO Auto-generated method stub
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
						final long totalrecord = this.TotalRecord(this.strStatement, WhereCond);
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

		@Override
		public void Save(final String usrupd, final ServiceHdr serviceHdr, final List<ServiceDtl> lstserviceDtls, final List<ServiceItem> lstserviceItem) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						final String transno = TransactionNo(this.session, serviceHdr.getPartner().getPartnerCode(), serviceHdr.getOffice().getId(), TransactionType.service);
						serviceHdr.setServiceNo(transno);
						serviceHdr.setDtmCrt(this.dtmupd);
						serviceHdr.setDtmUpd(this.dtmupd);
						this.session.save(serviceHdr);
						for (final ServiceDtl arow : lstserviceDtls)
							{
								ServiceDtl serviceDtl = new ServiceDtl();

								serviceDtl = arow;
								serviceDtl.setServiceHdr(serviceHdr);
								serviceDtl.setDtmCrt(this.dtmupd);
								serviceDtl.setDtmUpd(this.dtmupd);
								this.session.save(serviceDtl);
								for (final ServiceItem arow1 : lstserviceItem)
									{
										ServiceItem serviceItem = new ServiceItem();
										serviceItem = arow1;
										serviceItem.setServiceDtl(serviceDtl);
										serviceItem.setDtmCrt(this.dtmupd);
										serviceItem.setDtmUpd(this.dtmupd);
										this.session.save(serviceItem);
									}
							}
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
		public ServiceHdr View(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				ServiceHdr serviceHdr = null;
				try
					{
						serviceHdr = (ServiceHdr) this.session.get(ServiceHdr.class, id);

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return serviceHdr;
			}

	}
