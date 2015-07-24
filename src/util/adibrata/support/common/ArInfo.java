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
import com.adibrata.smartdealer.model.BucketAgingReport;
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
		Double bucket1_principle, bucket1_gross, bucket2_principle, bucket2_gross, bucket3_principle, bucket3_gross, bucket4_principle, bucket4_gross, bucket5_principle, bucket5_gross, bucket6_principle, bucket6_gross, bucket7_principle,
		        bucket7_gross, bucket8_principle, bucket8_gross, bucket9_principle, bucket9_gross, bucket10_principle, bucket10_gross;
				
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
		public PaymentInfo GetDetail(final long agrmntid, final Date valuedate) throws Exception
			{
				PaymentInfo paymentInfo = new PaymentInfo();
				double totallcinstallment;
				double totallcinsurance;
				final LCInstallment lcinstallment = new LCInstallment(this.session);
				
				Query qry;
				StringBuilder sql = new StringBuilder();
				Agrmnt agrmnt = new Agrmnt();
				Currency currency = new Currency();
				try
					{
						agrmnt = AgreementInfo.View(this.session, agrmntid);
						if ((agrmnt.getContractStatus() == "LIV") || (agrmnt.getContractStatus() == "ICP") || (agrmnt.getContractStatus() == "ICL") || (agrmnt.getContractStatus() == "INV"))
							{
								paymentInfo.setOsinstallment(this.TotalOsInstallment(agrmntid, valuedate));
								paymentInfo.setTotalinstallmentamount(this.TotalInstallment(agrmntid, valuedate));
								paymentInfo = this.GetOsPrincipalandInterest(agrmntid, valuedate, paymentInfo);
								currency = CurrencyInfo.GetCurrencyInfo(this.session, agrmnt.getPartner(), agrmnt.getCurrencyId());
								paymentInfo.setCurrencyrounded(currency.getRounded());
							}
							
						sql = new StringBuilder();
						sql.append("from AgrmntMnt where AgrmntId = :agrmntid");
						qry = this.session.createQuery(sql.toString());
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
										paymentInfo.setLcinsurancecurrent(LCInsurance.LCCalc(this.session, agrmnt, valuedate));
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
										paymentInfo.setMaximuminstallment(paymentInfo.getOsinstallment());
										paymentInfo.setMaximuminsurance(paymentInfo.getOsinsurance());
										paymentInfo.setMaximumlcinstall(totallcinstallment);
										paymentInfo.setMaximumlcinsurance(totallcinsurance);
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
			
		public PaymentInfo PaymentAllocation(final Agrmnt agrmnt, final Date valuedate, Double amountreceive) throws Exception
			{
				PaymentInfo info = new PaymentInfo();
				int counter = 1;
				try
					{
						
						info = this.GetDetail(agrmnt.getId(), valuedate);
						while ((amountreceive > 0) && (counter < 4))
							{
								if ((info.getMaximuminstallment() > 0) && (counter == 1))
									{
										if ((amountreceive > info.getMaximuminstallment()))
											{
												info.setInstallmentallocation(info.getMaximuminstallment());
												amountreceive -= info.getMaximuminstallment();
											}
										else
											{
												info.setInstallmentallocation(amountreceive);
												amountreceive = (double) 0;
											}
									}
								else if ((info.getMaximumlcinstall() > 0) && (counter == 2))
									{
										if ((amountreceive > info.getMaximumlcinstall()))
											{
												info.setLcinstallallocation(info.getMaximumlcinstall());
												amountreceive -= info.getMaximumlcinstall();
											}
										else
											{
												info.setLcinstallallocation(amountreceive);
												amountreceive = (double) 0;
											}
									}
								else if ((info.getMaximuminsurance() > 0) && (counter == 3))
									{
										if ((amountreceive > info.getMaximuminsurance()))
											{
												info.setInsuranceallocation(info.getMaximuminsurance());
												amountreceive -= info.getMaximuminsurance();
											}
										else
											{
												info.setInsuranceallocation(amountreceive);
												amountreceive = (double) 0;
											}
									}
								else if ((info.getMaximumlcinsurance() > 0) && (counter == 4))
									{
										if ((amountreceive > info.getMaximumlcinsurance()))
											{
												info.setLcinsuranceallocation(info.getMaximumlcinsurance());
												amountreceive -= info.getMaximumlcinsurance();
											}
										else
											{
												info.setLcinsuranceallocation(amountreceive);
												amountreceive = (double) 0;
											}
									}
								else if ((amountreceive > 0) && (counter == 5))
									{
										info.setPrepaidallocation(amountreceive);
										amountreceive = 0.00;
									}
								counter -= 1;
							}
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return info;
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
						
					}                                                                                                      // (InterestAmount / DATEDIFF(day, PrevDueDate, DueDate)) * (DiffDays + @IncrementDiffDays) as AmountHasToBeRecognize,
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
				int result = 0;
				final int counter = 1;
				final StringBuilder sql = new StringBuilder();
				final SQLQuery selectQuery;
				Date duedate;
				try
					{
						sql.append("Select DueDate, instAmt, paidAmt, waivedAmt, princAmt, intrstAmt from InstSchedule where AgrmntId = :agrmntid and instAmt - PaidAmt - WaivedAmt > 0 and duedate < :valuedate order by dueDate desc");
						selectQuery = this.session.createSQLQuery(sql.toString());
						selectQuery.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
						selectQuery.setParameter("agrmntid", agrmntid);
						selectQuery.setParameter("valuedate", valuedate);
						
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("AgrmntDaysOverdue-AgrmntId" + agrmntid);
						selectQuery.addScalar("DueDate", new DateType());
						selectQuery.addScalar("instAmt", new DoubleType());
						selectQuery.addScalar("paidAmt", new DoubleType());
						selectQuery.addScalar("waivedAmt", new DoubleType());
						selectQuery.addScalar("princAmt", new DoubleType());
						selectQuery.addScalar("intrstAmt", new DoubleType());
						final List<Object[]> lstinfo = selectQuery.list();
						if (lstinfo.size() != 0)
							{
								for (final Object object : lstinfo)
									{
										final Map row = (Map) object;
										duedate = (Date) row.get("DueDate");
										if (counter == 1)
											{
											
											}
										// overduesum +=
										
									}
							}
						duedate = (Date) (selectQuery.uniqueResult());
						result = (int) ((valuedate.getTime() - duedate.getTime()) / (24 * 60 * 60 * 1000));
						this.CalculateBucket(agrmntid, result);
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
			
		private void CalculateBucket(final long agrmntid, final int daysoverdue) throws Exception
			{
				final StringBuilder sql = new StringBuilder();
				final Query qry;
				String partnercode;
				try
					{
						partnercode = AgreementInfo.View(this.session, agrmntid).getPartner().getPartnerCode();
						sql.append("BucketAgingReport where partnercode = :partnercode and id = 1");
						qry = this.session.createSQLQuery(sql.toString());
						qry.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
						qry.setParameter("agrmntid", agrmntid);
						qry.setParameter("partnercode", partnercode);
						qry.setMaxResults(1);
						qry.setCacheable(true);
						qry.setCacheRegion("CalculateBucket");
						final List<BucketAgingReport> lst = qry.list();
						for (final BucketAgingReport bucket : lst)
							{
								if ((daysoverdue >= bucket.getBucket1From()) && (daysoverdue <= bucket.getBucket1To()))
									{
										this.setBucket1_principle(this.bucket1_principle);
										this.setBucket1_gross(this.bucket1_gross);
									}
								else if ((daysoverdue >= bucket.getBucket2From()) && (daysoverdue <= bucket.getBucket2To()))
									{
										this.setBucket2_principle(this.bucket1_principle);
										this.setBucket2_gross(this.bucket1_gross);
									}
								if ((daysoverdue >= bucket.getBucket3From()) && (daysoverdue <= bucket.getBucket3To()))
									{
										this.setBucket3_principle(this.bucket1_principle);
										this.setBucket3_gross(this.bucket1_gross);
									}
								if ((daysoverdue >= bucket.getBucket4From()) && (daysoverdue <= bucket.getBucket4To()))
									{
										this.setBucket4_principle(this.bucket1_principle);
										this.setBucket4_gross(this.bucket1_gross);
									}
								if ((daysoverdue >= bucket.getBucket5From()) && (daysoverdue <= bucket.getBucket5To()))
									{
										this.setBucket5_principle(this.bucket1_principle);
										this.setBucket5_gross(this.bucket1_gross);
									}
								if ((daysoverdue >= bucket.getBucket6From()) && (daysoverdue <= bucket.getBucket6To()))
									{
										this.setBucket6_principle(this.bucket1_principle);
										this.setBucket6_gross(this.bucket1_gross);
									}
								if ((daysoverdue >= bucket.getBucket7From()) && (daysoverdue <= bucket.getBucket7To()))
									{
										this.setBucket7_principle(this.bucket1_principle);
										this.setBucket7_gross(this.bucket1_gross);
									}
								if ((daysoverdue >= bucket.getBucket8From()) && (daysoverdue <= bucket.getBucket8To()))
									{
										this.setBucket8_principle(this.bucket1_principle);
										this.setBucket8_gross(this.bucket1_gross);
									}
								if ((daysoverdue >= bucket.getBucket9From()) && (daysoverdue <= bucket.getBucket9To()))
									{
										this.setBucket9_principle(this.bucket1_principle);
										this.setBucket9_gross(this.bucket1_gross);
									}
								if ((daysoverdue >= bucket.getBucket10From()) && (daysoverdue <= bucket.getBucket10To()))
									{
										this.setBucket10_principle(this.bucket1_principle);
										this.setBucket10_gross(this.bucket1_gross);
									}
									
							}
							
						// Sum(Case When DaysOverDue >= @Bucket1_from and DaysOverDue <= @Bucket1_to Then AgingPrinciple Else 0 End) AS Bucket1_principle,
						// Sum(Case When DaysOverDue >= @Bucket1_from and DaysOverDue <= @Bucket1_to Then AgingGross Else 0 End) AS Bucket1_gross,
						// Sum(Case When DaysOverDue >= @Bucket2_from and DaysOverDue <= @Bucket2_to Then AgingPrinciple Else 0 End) AS Bucket2_principle,
						// Sum(Case When DaysOverDue >= @Bucket2_from and DaysOverDue <= @Bucket2_to Then AgingGross Else 0 End) AS Bucket2_gross,
						// Sum(Case When DaysOverDue >= @Bucket3_from and DaysOverDue <= @Bucket3_to Then AgingPrinciple Else 0 End) AS Bucket3_principle,
						// Sum(Case When DaysOverDue >= @Bucket3_from and DaysOverDue <= @Bucket3_to Then AgingGross Else 0 End) AS Bucket3_gross,
						// Sum(Case When DaysOverDue >= @Bucket4_from and DaysOverDue <= @Bucket4_to Then AgingPrinciple Else 0 End) AS Bucket4_principle,
						// Sum(Case When DaysOverDue >= @Bucket4_from and DaysOverDue <= @Bucket4_to Then AgingGross Else 0 End) AS Bucket4_gross,
						// Sum(Case When DaysOverDue >= @Bucket5_from and DaysOverDue <= @Bucket5_to Then AgingPrinciple Else 0 End) AS Bucket5_principle,
						// Sum(Case When DaysOverDue >= @Bucket5_from and DaysOverDue <= @Bucket5_to Then AgingGross Else 0 End) AS Bucket5_gross,
						// Sum(Case When DaysOverDue >= @Bucket6_from and DaysOverDue <= @Bucket6_to Then AgingPrinciple Else 0 End) AS Bucket6_principle,
						// Sum(Case When DaysOverDue >= @Bucket6_from and DaysOverDue <= @Bucket6_to Then AgingGross Else 0 End) AS Bucket6_gross,
						// Sum(Case When DaysOverDue >= @Bucket7_from and DaysOverDue <= @Bucket7_to Then AgingPrinciple Else 0 End) AS Bucket7_principle,
						// Sum(Case When DaysOverDue >= @Bucket7_from and DaysOverDue <= @Bucket7_to Then AgingGross Else 0 End) AS Bucket7_gross,
						// Sum(Case When DaysOverDue >= @Bucket8_from and DaysOverDue <= @Bucket8_to Then AgingPrinciple Else 0 End) AS Bucket8_principle,
						// Sum(Case When DaysOverDue >= @Bucket8_from and DaysOverDue <= @Bucket8_to Then AgingGross Else 0 End) AS Bucket8_gross,
						// Sum(Case When DaysOverDue >= @Bucket9_from and DaysOverDue <= @Bucket9_to Then AgingPrinciple Else 0 End) AS Bucket9_principle,
						// Sum(Case When DaysOverDue >= @Bucket9_from and DaysOverDue <= @Bucket9_to Then AgingGross Else 0 End) AS Bucket9_gross,
						// Sum(Case When DaysOverDue >= @Bucket10_from and DaysOverDue <= @Bucket10_to Then AgingPrinciple Else 0 End) AS Bucket10_principle,
						// Sum(Case When DaysOverDue >= @Bucket10_from and DaysOverDue <= @Bucket10_to Then AgingGross Else 0 End) AS Bucket10_gross
						
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
			}
			
		/**
		 * @return the session
		 */
		public Session getSession()
			{
				return this.session;
			}
			
		/**
		 * @param session
		 *            the session to set
		 */
		public void setSession(final Session session)
			{
				this.session = session;
			}
			
		/**
		 * @return the bucket1_principle
		 */
		public Double getBucket1_principle()
			{
				return this.bucket1_principle;
			}
			
		/**
		 * @param bucket1_principle
		 *            the bucket1_principle to set
		 */
		public void setBucket1_principle(final Double bucket1_principle)
			{
				this.bucket1_principle = bucket1_principle;
			}
			
		/**
		 * @return the bucket1_gross
		 */
		public Double getBucket1_gross()
			{
				return this.bucket1_gross;
			}
			
		/**
		 * @param bucket1_gross
		 *            the bucket1_gross to set
		 */
		public void setBucket1_gross(final Double bucket1_gross)
			{
				this.bucket1_gross = bucket1_gross;
			}
			
		/**
		 * @return the bucket2_principle
		 */
		public Double getBucket2_principle()
			{
				return this.bucket2_principle;
			}
			
		/**
		 * @param bucket2_principle
		 *            the bucket2_principle to set
		 */
		public void setBucket2_principle(final Double bucket2_principle)
			{
				this.bucket2_principle = bucket2_principle;
			}
			
		/**
		 * @return the bucket2_gross
		 */
		public Double getBucket2_gross()
			{
				return this.bucket2_gross;
			}
			
		/**
		 * @param bucket2_gross
		 *            the bucket2_gross to set
		 */
		public void setBucket2_gross(final Double bucket2_gross)
			{
				this.bucket2_gross = bucket2_gross;
			}
			
		/**
		 * @return the bucket3_principle
		 */
		public Double getBucket3_principle()
			{
				return this.bucket3_principle;
			}
			
		/**
		 * @param bucket3_principle
		 *            the bucket3_principle to set
		 */
		public void setBucket3_principle(final Double bucket3_principle)
			{
				this.bucket3_principle = bucket3_principle;
			}
			
		/**
		 * @return the bucket3_gross
		 */
		public Double getBucket3_gross()
			{
				return this.bucket3_gross;
			}
			
		/**
		 * @param bucket3_gross
		 *            the bucket3_gross to set
		 */
		public void setBucket3_gross(final Double bucket3_gross)
			{
				this.bucket3_gross = bucket3_gross;
			}
			
		/**
		 * @return the bucket4_principle
		 */
		public Double getBucket4_principle()
			{
				return this.bucket4_principle;
			}
			
		/**
		 * @param bucket4_principle
		 *            the bucket4_principle to set
		 */
		public void setBucket4_principle(final Double bucket4_principle)
			{
				this.bucket4_principle = bucket4_principle;
			}
			
		/**
		 * @return the bucket4_gross
		 */
		public Double getBucket4_gross()
			{
				return this.bucket4_gross;
			}
			
		/**
		 * @param bucket4_gross
		 *            the bucket4_gross to set
		 */
		public void setBucket4_gross(final Double bucket4_gross)
			{
				this.bucket4_gross = bucket4_gross;
			}
			
		/**
		 * @return the bucket5_principle
		 */
		public Double getBucket5_principle()
			{
				return this.bucket5_principle;
			}
			
		/**
		 * @param bucket5_principle
		 *            the bucket5_principle to set
		 */
		public void setBucket5_principle(final Double bucket5_principle)
			{
				this.bucket5_principle = bucket5_principle;
			}
			
		/**
		 * @return the bucket5_gross
		 */
		public Double getBucket5_gross()
			{
				return this.bucket5_gross;
			}
			
		/**
		 * @param bucket5_gross
		 *            the bucket5_gross to set
		 */
		public void setBucket5_gross(final Double bucket5_gross)
			{
				this.bucket5_gross = bucket5_gross;
			}
			
		/**
		 * @return the bucket6_principle
		 */
		public Double getBucket6_principle()
			{
				return this.bucket6_principle;
			}
			
		/**
		 * @param bucket6_principle
		 *            the bucket6_principle to set
		 */
		public void setBucket6_principle(final Double bucket6_principle)
			{
				this.bucket6_principle = bucket6_principle;
			}
			
		/**
		 * @return the bucket6_gross
		 */
		public Double getBucket6_gross()
			{
				return this.bucket6_gross;
			}
			
		/**
		 * @param bucket6_gross
		 *            the bucket6_gross to set
		 */
		public void setBucket6_gross(final Double bucket6_gross)
			{
				this.bucket6_gross = bucket6_gross;
			}
			
		/**
		 * @return the bucket7_principle
		 */
		public Double getBucket7_principle()
			{
				return this.bucket7_principle;
			}
			
		/**
		 * @param bucket7_principle
		 *            the bucket7_principle to set
		 */
		public void setBucket7_principle(final Double bucket7_principle)
			{
				this.bucket7_principle = bucket7_principle;
			}
			
		/**
		 * @return the bucket7_gross
		 */
		public Double getBucket7_gross()
			{
				return this.bucket7_gross;
			}
			
		/**
		 * @param bucket7_gross
		 *            the bucket7_gross to set
		 */
		public void setBucket7_gross(final Double bucket7_gross)
			{
				this.bucket7_gross = bucket7_gross;
			}
			
		/**
		 * @return the bucket8_principle
		 */
		public Double getBucket8_principle()
			{
				return this.bucket8_principle;
			}
			
		/**
		 * @param bucket8_principle
		 *            the bucket8_principle to set
		 */
		public void setBucket8_principle(final Double bucket8_principle)
			{
				this.bucket8_principle = bucket8_principle;
			}
			
		/**
		 * @return the bucket8_gross
		 */
		public Double getBucket8_gross()
			{
				return this.bucket8_gross;
			}
			
		/**
		 * @param bucket8_gross
		 *            the bucket8_gross to set
		 */
		public void setBucket8_gross(final Double bucket8_gross)
			{
				this.bucket8_gross = bucket8_gross;
			}
			
		/**
		 * @return the bucket9_principle
		 */
		public Double getBucket9_principle()
			{
				return this.bucket9_principle;
			}
			
		/**
		 * @param bucket9_principle
		 *            the bucket9_principle to set
		 */
		public void setBucket9_principle(final Double bucket9_principle)
			{
				this.bucket9_principle = bucket9_principle;
			}
			
		/**
		 * @return the bucket9_gross
		 */
		public Double getBucket9_gross()
			{
				return this.bucket9_gross;
			}
			
		/**
		 * @param bucket9_gross
		 *            the bucket9_gross to set
		 */
		public void setBucket9_gross(final Double bucket9_gross)
			{
				this.bucket9_gross = bucket9_gross;
			}
			
		/**
		 * @return the bucket10_principle
		 */
		public Double getBucket10_principle()
			{
				return this.bucket10_principle;
			}
			
		/**
		 * @param bucket10_principle
		 *            the bucket10_principle to set
		 */
		public void setBucket10_principle(final Double bucket10_principle)
			{
				this.bucket10_principle = bucket10_principle;
			}
			
		/**
		 * @return the bucket10_gross
		 */
		public Double getBucket10_gross()
			{
				return this.bucket10_gross;
			}
			
		/**
		 * @param bucket10_gross
		 *            the bucket10_gross to set
		 */
		public void setBucket10_gross(final Double bucket10_gross)
			{
				this.bucket10_gross = bucket10_gross;
			}
			
	}
