
package util.adibrata.support.payhist;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.InstSchedule;

public class LCInsurance
{
	Session session;
		
		public LCInsurance()
		{
			// TODO Auto-generated constructor stub
			this.session = HibernateHelper.getSessionFactory().openSession();
		}
		
		public LCInsurance(final Session session)
			{
				this.session = session;
			}
		
		@SuppressWarnings("unchecked")
	public static double LCCalcAmountperSeqNo(final Session session, final Agrmnt agrmnt, final Date valueDate, final Short instseqno) throws Exception
		{
			final StringBuilder qryInst = new StringBuilder();
			final long lcdays = 0;
			double lcamount = 0;
			final Query qry;
			double osinstallment;
			final double currencyrouded = 0;
			try
				{
					qryInst.append("from InstSchedule, Agrmnt where AgrmntId = :agrmntid and instAmt - paidAmt - waivedAmt > 0 and instSeqNo = :instseqno");
					qry = session.createQuery(qryInst.toString());
					qry.setParameter("agrmntid", agrmnt.getId());
					qry.setParameter("instseqno", instseqno);
						
						final List<Object[]> lst = qry.list();
					final Iterator<Object[]> it = lst.iterator();
					while (it.hasNext())
						{
							final Object[] objrow = it.next();
							final InstSchedule aRow = (InstSchedule) objrow[0];
							// LCInstallment.LCCalcDaysperSeqNo(session, agrmnt, valueDate, instseqno);
								
								osinstallment = aRow.getInstAmt() - aRow.getPaidAmt() - aRow.getWaivedAmt();
							lcamount = Math.ceil((((lcdays * osinstallment) * (agrmnt.getPercentagePenalty() / 1000)) * 1.0) / currencyrouded) * currencyrouded;
								
							}
				}
			catch (final Exception exp)
				{
					final ExceptionEntities lEntExp = new ExceptionEntities();
					lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
					lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
					ExceptionHelper.WriteException(lEntExp, exp);
				}
			return lcamount;
				
			}
		
		@SuppressWarnings("unchecked")
	public static short LCCalcDaysperSeqNo(final Session session, final Agrmnt agrmnt, final Date valuedate, final Short instseqno) throws Exception
		{
			final StringBuilder qryInst = new StringBuilder();
			short lcdays = 0;
			final Query qry;
			try
				{
					qryInst.append("from InstSchedule, Agrmnt where AgrmntId = :agrmntid and instAmt - paidAmt - waivedAmt > 0 and instSeqNo = :instseqno");
					qry = session.createQuery(qryInst.toString());
					qry.setParameter("agrmntid", agrmnt.getId());
					qry.setParameter("instseqno", instseqno);
						
						final List<Object[]> lst = qry.list();
					final Iterator<Object[]> it = lst.iterator();
					Date paiddate;
					Date duedate;
						
						while (it.hasNext())
						{
							final Object[] objrow = it.next();
							final InstSchedule aRow = (InstSchedule) objrow[0];
								
								if (aRow.getPaidDate() == null)
								{
									duedate = aRow.getDueDate();
									lcdays = (short) ((valuedate.getTime() - duedate.getTime()) / (24 * 60 * 60 * 1000));
								}
							else
								{
									if (aRow.getPaidDate().compareTo(aRow.getDueDate()) < 0)
										{
											paiddate = aRow.getPaidDate();
											lcdays = (short) ((valuedate.getTime() - paiddate.getTime()) / (24 * 60 * 60 * 1000));
										}
									else
										{
											duedate = aRow.getDueDate();
											lcdays = (short) ((valuedate.getTime() - duedate.getTime()) / (24 * 60 * 60 * 1000));
										}
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
				
				return lcdays;
				
			}
		
		@SuppressWarnings("unchecked")
	public static double LCCalc(final Session session, final Agrmnt agrmnt, final Date valuedate) throws Exception
		{
			final StringBuilder qryInst = new StringBuilder();
			final long lcdays = 0;
			double lcamount = 0;
			final Query qry;
			double osinstallment;
			final double currencyrouded = 0;
				
				try
				{
					qryInst.append("from InstSchedule, Agrmnt where AgrmntId = :agrmntid and instAmt - paidAmt - waivedAmt > 0 order by duedate");
					qry = session.createQuery(qryInst.toString());
					qry.setParameter("agrmntid", agrmnt.getId());
						
						final List<Object[]> lst = qry.list();
					final Iterator<Object[]> it = lst.iterator();
					while (it.hasNext())
						{
							final Object[] objrow = it.next();
							final InstSchedule aRow = (InstSchedule) objrow[0];
								
								// lcdays = LCInstallment.LCCalcDaysperSeqNo(session, agrmnt, valuedate, aRow.getInstSeqNo());
							osinstallment = aRow.getInstAmt() - aRow.getPaidAmt() - aRow.getWaivedAmt();
							lcamount += Math.ceil((((lcdays * osinstallment) * (agrmnt.getPercentagePenalty() / 1000)) * 1.0) / currencyrouded) * currencyrouded;
						}
				}
			catch (final Exception exp)
				{
					final ExceptionEntities lEntExp = new ExceptionEntities();
					lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
					lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
					ExceptionHelper.WriteException(lEntExp, exp);
				}
				
				return lcamount;
				
			}
}
