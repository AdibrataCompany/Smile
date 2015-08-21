
package com.adibrata.smartdealer.dao.eod;

import java.util.Date;

import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Transaction;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.AgrmntMnt;
import com.adibrata.smartdealer.model.DailyAraging;
import com.adibrata.smartdealer.model.Office;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.ArInfo;

public class DailyAgingDao extends DaoBase
	{

		public DailyAgingDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				
			}
			
		public DailyAgingDao(final Date valuedate) throws Exception
			{
				// TODO Auto-generated constructor stub

				this.DailyAgingEOD(valuedate);
				
			}
			
		public DailyAgingDao(final Date valuedate, final Office office) throws Exception
			{
				// TODO Auto-generated constructor stub
				
				this.DailyAgingEOD(valuedate);
				this.DailyAgingEOM(valuedate);
				
			}
			
		// getSession() getSession() = getSession()Factory.opengetSession()();
		// Transaction tx = getSession().beginTransaction();
		//
		// ScrollableResults customers = getSession().getNamedQuery("GetCustomers")
		// .setCacheMode(CacheMode.IGNORE)
		// .scroll(ScrollMode.FORWARD_ONLY);
		// int count=0;
		// while ( customers.next() ) {
		// Customer customer = (Customer) customers.get(0);
		// customer.updateStuff(...);
		// if ( ++count % 20 == 0 ) {
		// //flush a batch of updates and release memory:
		// getSession().flush();
		// getSession().clear();
		// }
		// }
		//
		// tx.commit();
		// getSession().close();
		
		private void DailyAgingEOD(final Date valuedate) throws Exception
			{
				final StringBuilder hql = new StringBuilder();
				hql.append("from Agrmnt where ContractStatus In ('LIV', 'ICP', 'ICL') ");
				this.getSession().createQuery(hql.toString());
				final Transaction tx = this.getSession().beginTransaction();
				final ArInfo arInfo = new ArInfo();
				ScrollableResults qry;
				try
					{
						hql.append("from Agrmnt, AgrmntMnt where Agrmnt.id = AgrmntMnt.agrmnt and ContractStatus In ('LIV', 'ICP', 'ICL') ");
						qry = this.getSession().createQuery(hql.toString()).scroll(ScrollMode.FORWARD_ONLY);
						while (qry.next())
							
							{
								final Agrmnt agrmnt = (Agrmnt) qry.get(0);
								final AgrmntMnt mnt = (AgrmntMnt) qry.get(1);
								
								final DailyAraging araging = new DailyAraging();
								araging.setDailyMonthly("D");
								araging.setAgingDate(valuedate);
								araging.setAgrmnt(agrmnt);
								araging.setCustomer(agrmnt.getCustomerByCustomerId());
								araging.setCurrency(agrmnt.getCurrency());
								araging.setAmountOverDueGross(0.00);
								araging.setAmountOverDuePrinciple(0.00);
								
								araging.setDaysOverdue(arInfo.AgrmntDaysOverdue(agrmnt.getId(), valuedate));
								araging.setOsp(agrmnt.getOsP());
								araging.setOsi(agrmnt.getOsI());
								araging.setOspundue(agrmnt.getOsPundue());
								
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
								
								// AgrmntDaysOverdue(final Long agrmntid, final Date valuedate)
								this.getSession().update(agrmnt);
							}
						tx.commit();
						this.getSession().close();
					}
				catch (final Exception exp)
					{
						tx.rollback();
						this.getSession().getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}

		private void DailyAgingEOM(final Date valuedate) throws Exception
			{
				final StringBuilder hql = new StringBuilder();
				hql.append("from Agrmnt where ContractStatus In ('LIV', 'ICP', 'ICL') ");
				this.getSession().createQuery(hql.toString());
				final Transaction tx = this.getSession().beginTransaction();
				final ArInfo arInfo = new ArInfo();
				ScrollableResults qry;
				try
					{
						hql.append("from Agrmnt, AgrmntMnt where Agrmnt.id = AgrmntMnt.agrmnt and ContractStatus In ('LIV', 'ICP', 'ICL') ");
						qry = this.getSession().createQuery(hql.toString()).scroll(ScrollMode.FORWARD_ONLY);
						
						while (qry.next())
							{
								final Agrmnt agrmnt = (Agrmnt) qry.get(0);
								final AgrmntMnt mnt = (AgrmntMnt) qry.get(1);
								
								final DailyAraging araging = new DailyAraging();
								araging.setDailyMonthly("M");
								araging.setAgingDate(valuedate);
								araging.setAgrmnt(agrmnt);
								araging.setCustomer(agrmnt.getCustomerByCustomerId());
								araging.setCurrency(agrmnt.getCurrency());
								araging.setAmountOverDueGross(0.00);
								araging.setAmountOverDuePrinciple(0.00);
								
								araging.setDaysOverdue(arInfo.AgrmntDaysOverdue(agrmnt.getId(), valuedate));
								araging.setOsp(agrmnt.getOsP());
								araging.setOsi(agrmnt.getOsI());
								araging.setOspundue(agrmnt.getOsPundue());
								
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
								
								// AgrmntDaysOverdue(final Long agrmntid, final Date valuedate)
								this.getSession().update(agrmnt);
							}
						tx.commit();
						this.getSession().close();
					}
				catch (final Exception exp)
					{
						tx.rollback();
						this.getSession().getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}
	}
