
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

/**
 * @author Henry
 */
public class LCInstallment
{
	static Session session;

	public LCInstallment()
		{
			// TODO Auto-generated constructor stub
			session = HibernateHelper.getSessionFactory().openSession();
		}

	/**
	 * @param session
	 */
	public LCInstallment(Session session)
		{
			LCInstallment.session = session;
		}

	@SuppressWarnings("unchecked")
	public static double LCCalcAmountperSeqNo(Session session, Agrmnt agrmnt, Date valueDate, Short instseqno) throws Exception
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
							LCInstallment.LCCalcDaysperSeqNo(session, agrmnt, valueDate, instseqno);

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
	public static short LCCalcDaysperSeqNo(Session session, Agrmnt agrmnt, Date valueDate, Short instseqno) throws Exception
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
									lcdays = (short) ((valueDate.getTime() - duedate.getTime()) / (24 * 60 * 60 * 1000));
								}
							else
								{
									if (aRow.getPaidDate().compareTo(aRow.getDueDate()) < 0)
										{
											paiddate = aRow.getPaidDate();
											lcdays = (short) ((valueDate.getTime() - paiddate.getTime()) / (24 * 60 * 60 * 1000));
										}
									else
										{
											duedate = aRow.getDueDate();
											lcdays = (short) ((valueDate.getTime() - duedate.getTime()) / (24 * 60 * 60 * 1000));
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

	@SuppressWarnings(
				{
					"unchecked"
				})
	public static double LCCalcInst(Session session, Agrmnt agrmnt, Date valueDate) throws Exception
		{
			final StringBuilder qryInst = new StringBuilder();
			long lcdays = 0;
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

							lcdays = LCInstallment.LCCalcDaysperSeqNo(session, agrmnt, valueDate, aRow.getInstSeqNo());
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

// Declare @NextInstallmentNumber AS Int,
// @NextInstallmentDate as Datetime
//
// Select @GracePeriods = graceperiodlatecharges,
// @LastLCInstallmentCalcDate = LastLCInstallmentCalcDate,
// @percentagepenalty = Percentagepenalty,
// @lccalcmethod = LCCalcMethod
// From Agreement with (nolock) Where BranchID = @BranchID and ApplicationID =
// @ApplicationID
// Set @Error = @@Error
// if @Error > 0
// goto exitsp
//
// If @PaidDate Is Null
// Begin
// set @LCDays = datediff(day,@duedate,@BusinessDate)
// Set @StartDate = @DueDate
// End
// else if @PaidDate > @duedate
// Begin
// set @LCDays = datediff(day,@PaidDate, @BusinessDate)
// Set @StartDate = @PaidDate
// End
// else
// Begin
// set @LCDays = datediff(day,@duedate,@BusinessDate)
// Set @StartDate = @DueDate
// End
//
// Set @LCDays = isnull(@LCDays,0)
//
// -------------------------------------------------------------
// -- Yovita Nov 16 2006 : Add cek @lccalcmethod for define @HolidayRange
// -------------------------------------------------------------
// if @lccalcmethod = 'CD'
// begin
// set @HolidayRange = 0
// end
// else if @lccalcmethod = 'WD'
// begin
// set @HolidayRange = dbo.fnHolidayRange(@StartDate,@BusinessDate)
// end
// else
// begin
// set @HolidayRange = 0
// end
// -------------------------------------------------------------
// -- Yovita Nov 16 06 : Add + @HolidayRange ------------------------
// -------------------------------------------------------------
// if (@LCDays > @GracePeriods + @HolidayRange)
// Begin
// set @LCAmount = ceiling(((@LCDays * @OSInstallment) *
// (@percentagepenalty/1000))* 1.0/@CurrencyRounded)*@CurrencyRounded
// -- Added By Herri YAnto, 12 Maret 2008 : Cek jika @LCAmount < LCMinAMount
// yang ditentukan di ProductOffering maka pakai yang LCMin
// If @LCAmount <= @LCMinAMount
// Set @LCAmount = @LCMinAMount
// -- End Added By Herri YAnto, 12 Maret 2008
// End
// else
// Begin
// set @LCAmount = 0
// End
