/**
 * ArInfo.java
 */

package util.adibrata.support.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.type.DateType;
import org.hibernate.type.DoubleType;
import org.hibernate.type.ShortType;

import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.AgrmntMnt;
import com.adibrata.smartdealer.model.Currency;
import com.adibrata.smartdealer.model.InstSchedule;
import com.adibrata.smartdealer.model.PaymentInfo;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.payhist.LCInstallment;
import util.adibrata.support.payhist.LCInsurance;

/**
 * @author Henry
 */
public class ArInfo
	{
		Session session;

		public ArInfo() throws Exception
			{
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
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
			
		public ArInfo(final Session session)
			{
				this.session = session;
			}
			
		@SuppressWarnings("unchecked")
		public PaymentInfo GetDetail(final Session session, final long agrmntid, final Date valuedate) throws Exception
			{
				PaymentInfo paymentInfo = new PaymentInfo();
				double totallcinstallment;
				double totallcinsurance;
				final LCInstallment lcinstallment = new LCInstallment(session);

				Query qry;
				StringBuilder sql = new StringBuilder();
				Agrmnt agrmnt = new Agrmnt();
				Currency currency = new Currency();
				try
					{
						agrmnt = AgreementInfo.View(session, agrmntid);
						if ((agrmnt.getContractStatus() == "LIV") || (agrmnt.getContractStatus() == "ICP") || (agrmnt.getContractStatus() == "ICL") || (agrmnt.getContractStatus() == "INV"))
							{
								paymentInfo.setOsinstallment(this.TotalOsInstallment(agrmntid, valuedate));
								paymentInfo.setTotalinstallmentamount(this.TotalInstallment(agrmntid, valuedate));
								paymentInfo = this.GetOsPrincipalandInterest(agrmntid, valuedate, paymentInfo);
								currency = CurrencyInfo.GetCurrencyInfo(session, agrmnt.getPartner(), agrmnt.getCurrencyId());
								paymentInfo.setCurrencyrounded(currency.getRounded());
							}
							
						sql = new StringBuilder();
						sql.append("from AgrmntMnt where AgrmntId = :agrmntid");
						qry = session.createQuery(sql.toString());
						qry.setParameter("agrmntid", agrmntid);
						qry.setCacheable(true);
						qry.setCacheRegion("AgrmntMnt-AgrmntId" + agrmntid);
						final List<AgrmntMnt> lstinfo = qry.list();
						if (lstinfo.size() != 0)
							{
								for (final AgrmntMnt aRow : lstinfo)
									{

										paymentInfo.setAccruedinterest(this.AccruedInfo(agrmnt, valuedate));
										paymentInfo.setLcinstallmentcurrent(lcinstallment.LCCalc(agrmnt, valuedate));
										paymentInfo.setLcinsurancecurrent(LCInsurance.LCCalc(session, agrmnt, valuedate));
										paymentInfo.setOsprincipal(agrmnt.getOsp());
										paymentInfo.setOsinterest(agrmnt.getOsi());
										paymentInfo.setNextinstdate(agrmnt.getNextInstDate());
										paymentInfo.setNextinstnumber(agrmnt.getNextInstNumber());

										paymentInfo.setPrepaid(agrmnt.getPrepaidAmt());

										paymentInfo.setLastlcinstallmentamount(aRow.getLcinstAmt() - aRow.getLcinstPaid() - aRow.getLcinstWaived());
										paymentInfo.setLastlcinsuranceamount(aRow.getLcinsAmt() - aRow.getLcinsPaid() - aRow.getLcinsWaived());

										paymentInfo.setOsinsurance(aRow.getInsAmt() - aRow.getInsPaid() - aRow.getInsWaived());

										totallcinstallment = Number.Rounding(paymentInfo.getLastlcinstallmentamount() + paymentInfo.getLcinstallmentcurrent(), paymentInfo.getCurrencyrounded());
										paymentInfo.setTotallcinstallment(totallcinstallment);
										// Calculate LC Insurance Amount
										totallcinsurance = Number.Rounding(paymentInfo.getLastlcinsuranceamount() + paymentInfo.getLcinstallmentcurrent(), paymentInfo.getCurrencyrounded());
										paymentInfo.setTotallcinsurance(totallcinsurance);
										double totalet;
										totalet = paymentInfo.getOsprincipalundue() + paymentInfo.getOsinterestundue() + paymentInfo.getOsinstallment() + paymentInfo.getOsinsurance() + paymentInfo.getTotallcinstallment()
										        + paymentInfo.getTotallcinsurance() + paymentInfo.getPrepaid();
												
										paymentInfo.setTotalpayment(totalet - (paymentInfo.getOsprincipalundue() + paymentInfo.getOsinterestundue()));
										paymentInfo.setTotalearlytermination(totalet);

										paymentInfo.setEarlyterminationpenalty(Number.Rounding(paymentInfo.getOsprincipalundue() * agrmnt.getPercentagePenalty(), paymentInfo.getCurrencyrounded()));

									}
							}
							
						// Select @InstallmentDue = Sum(InstallmentAmount)
						// from InstallmentSchedule with ( nolock )
						// where BranchID = @branchID
						// and ApplicationID = @ApplicationID
						// And DueDate <= @ValueDate
						// and exists ( Select ''
						// from Agreement with (nolock)
						// where installmentschedule.BranchId = Agreement.BranchID
						// and InstallmentSchedule.ApplicationID = Agreement.ApplicationID
						// and ContractStatus in ( 'LIV', 'ICP', 'INV' ) )

					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return paymentInfo;

			}
			
		@SuppressWarnings(
			{
			        "rawtypes", "unchecked"
			})
		public double AccruedInfo(final Agrmnt agrmnt, final Date valuedate) throws Exception
			{
				SQLQuery selectQuery;
				double result = 0;
				StringBuilder sql = new StringBuilder();
				Date duedate = null;
				Date nextduedate = null;
				Date accrueddate = null;
				double interestamount = 0;
				List<Object[]> lstinfo = new ArrayList<Object[]>();
				try
					{
						sql.append(" Select DueDate, AccruedDate, IntrstAmt from InstSchedule Where AgrmntId = :agrmntid and DueDate <= :valuedate Order By DueDate Desc");
						selectQuery = this.session.createSQLQuery(sql.toString());
						selectQuery.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
						selectQuery.setParameter("agrmntid", agrmnt.getId());
						selectQuery.setParameter("valuedate", valuedate);
						selectQuery.setMaxResults(1);

						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("AccruedInfo-AgrmntId" + agrmnt.getId());
						selectQuery.addScalar("DueDate", new DateType());
						selectQuery.addScalar("AccruedDate", new DateType());
						selectQuery.addScalar("IntrstAmt", new DoubleType());
						lstinfo = selectQuery.list();
						if (lstinfo.size() != 0)
							{
								for (final Object object : lstinfo)
									{
										final Map row = (Map) object;

										accrueddate = (Date) row.get("AccruedDate");
										if (accrueddate != null)
											{
												duedate = (Date) row.get("AccruedDate");
											}
										else
											{
												duedate = (Date) row.get("DueDate");
											}
										interestamount = (double) row.get("IntrstAmt");
									}
							}
						else
							{
								duedate = agrmnt.getEffectiveDate();
							}
						sql = new StringBuilder();
						sql.append(" Select DueDate from InstSchedule Where AgrmntId = :agrmntid and DueDate > :valuedate Order By DueDate ");
						selectQuery = this.session.createSQLQuery(sql.toString());
						selectQuery.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
						selectQuery.setParameter("agrmntid", agrmnt.getId());
						selectQuery.setParameter("valuedate", valuedate);
						selectQuery.setMaxResults(1);

						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("AccruedInfoNextDue-AgrmntId" + agrmnt.getId());
						selectQuery.addScalar("DueDate", new DateType());
						lstinfo = selectQuery.list();
						if (lstinfo.size() != 0)
							{
								for (final Object object : lstinfo)
									{
										final Map row = (Map) object;
										nextduedate = (Date) row.get("DueDate");
									}
							}
						final short period = (short) ((nextduedate.getTime() - duedate.getTime()) / (24 * 60 * 60 * 1000));
						final short diffday = (short) ((valuedate.getTime() - duedate.getTime()) / (24 * 60 * 60 * 1000));

						result = interestamount * (diffday / period);

					}             // (InterestAmount / DATEDIFF(day, PrevDueDate, DueDate)) * (DiffDays + @IncrementDiffDays) as AmountHasToBeRecognize,
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				finally
					{
						sql.setLength(0);
					}
				return result;
			}
			
		public double TotalOsInstallment(final long agrmntid, final Date valuedate) throws Exception
			{
				SQLQuery selectQuery;
				double result = 0;
				final StringBuilder sql = new StringBuilder();
				try
					{
						sql.append(" Select Sum(instAmt-paidAmd-waivedAmt) as InstallmentDue from InstSchedule Where " + "AgrmntId = :agrmntid and DueDate <= :valuedate");
						selectQuery = this.session.createSQLQuery(sql.toString());
						selectQuery.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
						selectQuery.setParameter("agrmntid", agrmntid);
						selectQuery.setParameter("valuedate", valuedate);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("TotalOsInstallment-AgrmntId" + agrmntid);
						selectQuery.addScalar("InstallmentDue", new DoubleType());
						result = (double) selectQuery.uniqueResult();
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				finally
					{
						sql.setLength(0);
					}
				return result;
			}
			
		public double TotalInstallment(final long agrmntid, final Date valuedate) throws Exception
			{
				SQLQuery selectQuery;
				double result = 0;
				final StringBuilder sql = new StringBuilder();
				try
					{
						sql.append(" Select Sum(instAmt) as InstAmount from InstSchedule Where AgrmntId = :agrmntid");
						selectQuery = this.session.createSQLQuery(sql.toString());
						selectQuery.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
						selectQuery.setParameter("agrmntid", agrmntid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("TotalInstallment-AgrmntId" + agrmntid);
						selectQuery.addScalar("InstAmount", new DoubleType());
						result = (double) selectQuery.uniqueResult();
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				finally
					{
						sql.setLength(0);
					}
				return result;
			}
			
		@SuppressWarnings(
			{
			        "unchecked", "rawtypes"
			})
		public PaymentInfo GetOsPrincipalandInterest(final long agrmntid, final Date valuedate, final PaymentInfo paymentinfo) throws Exception
			{
				final SQLQuery selectQuery;
				final StringBuilder sql = new StringBuilder();
				try
					{
						sql.append("Select isnull(Sum(PrincipalAmount), 0) as OSP, isnull(Sum(InterestAmount), 0) as OSI, " + " isnull(Min(Duedate), ( Select Max(DueDate) from InstSchedule Where AgrmntId = :agrmntid)) as NextInstDueDate, "
						        + " isnull(Min(InstSeqNo), ( Select isnull(Max(InstSeqNo), 0) from InstSchedule where AgrmntId = :agrmntid)) as NextInstDueNumber "
						        + " from instSchedule where AgrmntId = :agrmntid and InstSchedule.DueDate > :valuedate");
						selectQuery = this.session.createSQLQuery(sql.toString());
						selectQuery.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
						selectQuery.setParameter("agrmntid", agrmntid);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("GetOsPrincipalandInterest-AgrmntId" + agrmntid);
						selectQuery.addScalar("OSP", new DoubleType());
						selectQuery.addScalar("OSI", new DoubleType());
						selectQuery.addScalar("NextInstDueDate", new DateType());
						selectQuery.addScalar("NextInstDueNumber", new ShortType());

						final List<Object[]> lstinfo = selectQuery.list();
						if (lstinfo.size() != 0)
							{
								for (final Object object : lstinfo)
									{
										final Map row = (Map) object;
										paymentinfo.setOsinterestundue((double) row.get("OSI"));
										paymentinfo.setOsprincipalundue((double) row.get("OSP"));
										paymentinfo.setNextinstduenumber((short) row.get("NextInstDueNumber"));
										paymentinfo.setNextinstduedate((Date) row.get("NextInstDueDate"));
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
				finally
					{
						sql.setLength(0);
					}
				return paymentinfo;
			}
			
		@SuppressWarnings("unchecked")
		public List<InstSchedule> LstInstSchedule(final long agrmntid) throws Exception
			{
				List<InstSchedule> lstresult = new ArrayList<InstSchedule>();
				final StringBuilder sql = new StringBuilder();
				Query qry;
				try
					{
						sql.append("from InstSchedule where AgrmntId = :agrmntid order by dueDate");
						qry = this.session.createQuery(sql.toString());

						qry.setParameter("agrmntid", agrmntid);
						qry.setCacheable(true);
						qry.setCacheRegion("LstInstSchedule-AgrmntId" + agrmntid);
						lstresult = qry.list();
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				finally
					{
						sql.setLength(0);
					}
				return lstresult;

			}

		public int AgrmntDaysOverdue(final long agrmntid, final Date valuedate) throws Exception
			{
				int result = (short) 0;
				final StringBuilder sql = new StringBuilder();
				final SQLQuery selectQuery;
				Date duedate;
				try
					{
						sql.append("Select DueDate from InstSchedule where AgrmntId = :agrmntid and instAmt - PaidAmt - WaivedAmt > 0 order by dueDate");
						selectQuery = this.session.createSQLQuery(sql.toString());
						selectQuery.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
						selectQuery.setParameter("agrmntid", agrmntid);
						selectQuery.setMaxResults(1);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("AgrmntDaysOverdue-AgrmntId" + agrmntid);
						selectQuery.addScalar("DueDate", new DateType());
						duedate = (Date) (selectQuery.uniqueResult());
						result = (short) ((valuedate.getTime() - duedate.getTime()) / (24 * 60 * 60 * 1000));
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				finally
					{
						sql.setLength(0);
					}
				return result;
			}
	}
