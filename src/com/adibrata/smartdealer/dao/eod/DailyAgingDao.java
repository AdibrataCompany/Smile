
package com.adibrata.smartdealer.dao.eod;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;

import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.AgrmntMnt;
import com.adibrata.smartdealer.model.DailyAraging;
import com.adibrata.smartdealer.model.Office;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.ArInfo;

public class DailyAgingDao
	{
		private final StatelessSession session;
		Date dtmupd = Calendar.getInstance().getTime();
		
		public DailyAgingDao()
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openStatelessSession();
				
			}
			
		public DailyAgingDao(final Date valuedate) throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openStatelessSession();
				this.DailyAgingEOD(valuedate);
				
			}
			
		public DailyAgingDao(final Date valuedate, final Office office) throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openStatelessSession();
				this.DailyAgingEOD(valuedate);
				
			}
			
		// Session session = sessionFactory.openSession();
		// Transaction tx = session.beginTransaction();
		//
		// ScrollableResults customers = session.getNamedQuery("GetCustomers")
		// .setCacheMode(CacheMode.IGNORE)
		// .scroll(ScrollMode.FORWARD_ONLY);
		// int count=0;
		// while ( customers.next() ) {
		// Customer customer = (Customer) customers.get(0);
		// customer.updateStuff(...);
		// if ( ++count % 20 == 0 ) {
		// //flush a batch of updates and release memory:
		// session.flush();
		// session.clear();
		// }
		// }
		//
		// tx.commit();
		// session.close();
		
		private void DailyAgingEOD(final Date valuedate) throws Exception
			{
				final StringBuilder hql = new StringBuilder();
				hql.append("from Agrmnt where ContractStatus In ('LIV', 'ICP', 'ICL') ");
				this.session.createQuery(hql.toString());
				final Transaction tx = this.session.beginTransaction();
				final ArInfo arInfo = new ArInfo();
				ScrollableResults qry;
				try
					{
						hql.append("from Agrmnt, AgrmntMnt where Agrmnt.id = AgrmntMnt.agrmnt and ContractStatus In ('LIV', 'ICP', 'ICL') ");
						qry = this.session.createQuery(hql.toString()).scroll(ScrollMode.FORWARD_ONLY);
						
						//
						// private final Date nadate;
						// private final Double naamount;
						// private final Double napaid;
						// private final Double naother;
						// private final Date wodate;
						// private final Double woamount;
						// private final Double wopaid;
						// private final Double woother;
						// private final Short collStatus;
						// private final Short exRepo;
						// private final Short installmentNo;
						// private final Date installmentDate;
						// private final String contractStatus;
						// private final String defaultStatus;
						// private final Integer numOfAssetUnit;
						// private final Integer collectibilityId;
						// private final Short nextInstallmentDueNumber;
						// private final Date nextInstallmentDueDate;
						// private final Short isFpd;
						// private final Long productId;
						// private final Long productOfferingId;
						// private final Double ntf;
						
						while (qry.next())
							
							{
								final Agrmnt agrmnt = (Agrmnt) qry.get(0);
								final AgrmntMnt mnt = (AgrmntMnt) qry.get(1);
								
								final DailyAraging araging = new DailyAraging();
								
								araging.setAgingDate(valuedate);
								araging.setAgrmntId(agrmnt.getId());
								araging.setCustomerId(agrmnt.getCustomer().getId());
								araging.setCurrencyId(agrmnt.getCurrencyId());
								araging.setAmountOverDueGross(0.00);
								araging.setAmountOverDuePrinciple(0.00);
								
								araging.setDaysOverdue(arInfo.AgrmntDaysOverdue(agrmnt.getId(), valuedate));
								araging.setOsp(agrmnt.getOsp());
								araging.setOsi(agrmnt.getOsi());
								araging.setOspundue(agrmnt.getOspundue());
								
								araging.setInstDue(mnt.getInstAmt());
								araging.setInstDuePaid(mnt.getInstPaid());
								araging.setInstDueWaived(mnt.getInstWaived());
								
								araging.setInsDue(mnt.getInsAmt());
								araging.setInsDuePaid(mnt.getInsPaid());
								araging.setInsDueWaived(mnt.getInsWaived());
								
								araging.setLcinst(mnt.getLcinstAmt());
								araging.setLcinstPaid(mnt.getLcinstPaid());
								araging.setLcinstWaived(mnt.getLcinstWaived());
								araging.setLastLcinstCalcDate(mnt.getLastLccalcInstDate());
								
								araging.setLcins(mnt.getLcinsAmt());
								araging.setLcinsPaid(mnt.getLcinsPaid());
								araging.setLcinsWaived(mnt.getLcinsWaived());
								araging.setLastLcinsCalcDate(mnt.getLastLccalcInsDate());
								
								araging.setPrepaidAmount(agrmnt.getPrepaidAmt());
								
								araging.setDtmCrt(this.dtmupd);
								araging.setDtmUpd(this.dtmupd);
								
								// AgrmntDaysOverdue(final long agrmntid, final Date valuedate)
								this.session.update(agrmnt);
							}
						tx.commit();
						this.session.close();
					}
				catch (final Exception exp)
					{
						tx.rollback();
						this.session.getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
	}
