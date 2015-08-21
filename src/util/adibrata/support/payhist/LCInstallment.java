
package util.adibrata.support.payhist;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.AgrmntMnt;
import com.adibrata.smartdealer.model.InstSchedule;
import com.adibrata.smartdealer.model.PayHistDtl;
import com.adibrata.smartdealer.model.PayHistHdr;
import com.adibrata.smartdealer.model.PaymentReceive;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

/**
 * @author Henry
 */
public class LCInstallment
	{
<<<<<<< Upstream, based on branch 'master' of https://github.com/AdibrataCompany/Smile
		
		Session session;
		private final Date dtmUpd = Calendar.getInstance().getTime();
		
		public LCInstallment()
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
			}
			
=======

		Session session;
		private final Date dtmUpd = Calendar.getInstance().getTime();

		public LCInstallment()
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
			}

>>>>>>> 5851c81 new Model
		/**
		 * @param session
		 */
		public LCInstallment(final Session session)
			{
				this.session = session;
			}
<<<<<<< Upstream, based on branch 'master' of https://github.com/AdibrataCompany/Smile
			
		@SuppressWarnings("unchecked")
		public void SaveDetail(final String usrUpd, final PaymentReceive paymentReceive, final PayHistHdr hdr) throws Exception
			{
				final StringBuilder qryInst = new StringBuilder();
				new StringBuilder();
				double amountreceive;
				double osinstallment = 0.00;
				double amountallocation = 0.00;
				double lcamount = 0.00;
				short lcdays = 0;
				final AgrmntMnt mnt = new AgrmntMnt();
				final Agrmnt agrmnt = new Agrmnt();
				double osp = 0.00;
				double principal = 0.00;
				double interest = 0.00;
				final double interestallocation = 0.00;
				final Query qry;
				try
					{
						// get Installment Receive
						amountreceive = paymentReceive.getInstAmt();
						if (amountreceive > 0)
							{
								qryInst.append("from InstSchedule, Agrmnt where AgrmntId = :agrmntId and instAmt - paidAmt - waivedAmt > 0 Order by dueDate");
								qry = this.session.createQuery(qryInst.toString());
								final List<Object[]> lst = qry.list();
								final Iterator<Object[]> it = lst.iterator();
								
								while (it.hasNext() && (amountreceive > 0))
									{
										final Object[] objrow = it.next();
										final InstSchedule aRow = (InstSchedule) objrow[0];
										final Agrmnt arowagrmnt = (Agrmnt) objrow[1];
										
										osinstallment = aRow.getInstAmt() - aRow.getPaidAmt() - aRow.getWaivedAmt();
										if (osinstallment > 0)
											{
												if (amountreceive >= osinstallment)
													{
														amountreceive -= osinstallment;
														amountallocation = osinstallment;
													}
												else
													{
														amountallocation = amountreceive;
														amountreceive = 0;
													}
											}
											
										final InstSchedule inst = new InstSchedule();
										lcamount = 0.00;
										// Calculate LC Amount
										lcamount = this.LCCalcAmountperSeqNo(paymentReceive.getAgrmnt(), paymentReceive.getValueDate(), aRow.getInstSeqNo());
										// Calculate LC Days
										lcdays = 0;
										lcdays = this.LCCalcDaysperSeqNo(paymentReceive.getAgrmnt(), paymentReceive.getValueDate(), aRow.getInstSeqNo());
										inst.setPaidAmt(inst.getPaidAmt() - amountallocation);
										inst.setLcamt(inst.getLcamt() + lcamount);
										inst.setUsrUpd(usrUpd);
										inst.setDtmUpd(this.dtmUpd);
										
										final PayHistDtl dtl = new PayHistDtl();
										dtl.setPayHistHdr(hdr);
										dtl.setInstSeqNo(aRow.getInstSeqNo());
										dtl.setAssetSeqNo((short) 0);
										dtl.setYearNum((short) 0);
										dtl.setCoaName("LCINSTA");
										dtl.setDebitAmt(amountallocation);
										dtl.setCreditAmt(0.00);
										dtl.setLcamt(lcamount);
										dtl.setLcdays(lcdays);
										dtl.setDescription(paymentReceive.getNotes());
										dtl.setUsrUpd(usrUpd);
										dtl.setUsrCrt(usrUpd);
										dtl.setDtmCrt(this.dtmUpd);
										dtl.setDtmUpd(this.dtmUpd);
										
										mnt.setInstPaid(mnt.getInstPaid() + amountallocation);
										mnt.setLcinstAmt(mnt.getLcinstAmt() + lcamount);
										mnt.setLastLccalcInstDate(paymentReceive.getValueDate());
										// need more code in here
										mnt.setUsrUpd(usrUpd);
										mnt.setDtmUpd(this.dtmUpd);
										
										osp = arowagrmnt.getOsP() - aRow.getOsPamt();
										if (interestallocation > osp)
											{
												principal = osp;
												interest = interestallocation - osp;
											}
										else
											{
												if (interest >= paymentReceive.getInstAmt())
													{
														if (interestallocation > (interest - paymentReceive.getInstAmt()))
															{
																interest -= paymentReceive.getInstAmt();
																principal = interestallocation - interest;
															}
														else
															{
																principal = 0;
																interest = interestallocation;
															}
													}
												else
													{
														principal = interestallocation;
														interest = 0;
													}
											}
											
										agrmnt.setOsP(agrmnt.getOsP() - principal);
										agrmnt.setOsI(agrmnt.getOsI() - interest);
										
										//
										this.session.save(dtl);
										this.session.update(inst);
										this.session.update(mnt);
										
										final List<InstSchedule> lstinst = qry.list();
										final Iterator<InstSchedule> itInst = lstinst.iterator();
										
										while (itInst.hasNext())
											{
												final InstSchedule rowInst = itInst.next();
												if ((rowInst.getInstAmt() - rowInst.getPaidAmt() - rowInst.getWaivedAmt()) > 0)
													{
														agrmnt.setNextInstDate(aRow.getDueDate());
														agrmnt.setNextInstNumber(aRow.getInstSeqNo());
													}
											}
										this.session.update(agrmnt);
									}          // end while
							}
					}          // end try
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
					
			}
			
		@SuppressWarnings("unchecked")
		public double LCCalcAmountperSeqNo(final Agrmnt agrmnt, final Date valueDate, final Short instseqno) throws Exception
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
						qry = this.session.createQuery(qryInst.toString());
						qry.setParameter("agrmntid", agrmnt.getId());
						qry.setParameter("instseqno", instseqno);
						qry.setCacheable(true);
						qry.setCacheRegion("LCCalcAmountperSeqNo" + agrmnt.getId() + instseqno);
						final List<Object[]> lst = qry.list();
						final Iterator<Object[]> it = lst.iterator();
						while (it.hasNext())
							{
								final Object[] objrow = it.next();
								final InstSchedule aRow = (InstSchedule) objrow[0];
								this.LCCalcDaysperSeqNo(agrmnt, valueDate, instseqno);
								
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
		public short LCCalcDaysperSeqNo(final Agrmnt agrmnt, final Date valuedate, final Short instseqno) throws Exception
			{
				final StringBuilder qryInst = new StringBuilder();
				short lcdays = 0;
				final Query qry;
				try
					{
						qryInst.append("from InstSchedule, Agrmnt where InstSchedule.AgrmntId = Agrmnt.Id and AgrmntId = :agrmntid and instAmt - paidAmt - waivedAmt > 0 and instSeqNo = :instseqno");
						qry = this.session.createQuery(qryInst.toString());
						qry.setParameter("agrmntid", agrmnt.getId());
						qry.setParameter("instseqno", instseqno);
						qry.setCacheable(true);
						qry.setCacheRegion("LCCalcDaysperSeqNo" + agrmnt.getId() + instseqno);
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
		public double LCCalc(final Agrmnt agrmnt, final Date valuedate) throws Exception
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
						qry = this.session.createQuery(qryInst.toString());
						qry.setParameter("agrmntid", agrmnt.getId());
						qry.setCacheable(true);
						qry.setCacheRegion("LCCalc" + agrmnt.getId() + valuedate);
						final List<Object[]> lst = qry.list();
						final Iterator<Object[]> it = lst.iterator();
						while (it.hasNext())
							{
								final Object[] objrow = it.next();
								final InstSchedule aRow = (InstSchedule) objrow[0];
								
								lcdays = this.LCCalcDaysperSeqNo(agrmnt, valuedate, aRow.getInstSeqNo());
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
	
=======

		@SuppressWarnings("unchecked")
		public void SaveDetail(final String usrUpd, final PaymentReceive paymentReceive, final PayHistHdr hdr) throws Exception
			{
				final StringBuilder qryInst = new StringBuilder();
				new StringBuilder();
				double amountreceive;
				double osinstallment = 0.00;
				double amountallocation = 0.00;
				double lcamount = 0.00;
				short lcdays = 0;
				final AgrmntMnt mnt = new AgrmntMnt();
				final Agrmnt agrmnt = new Agrmnt();
				double osp = 0.00;
				double principal = 0.00;
				double interest = 0.00;
				final double interestallocation = 0.00;
				final Query qry;
				try
					{
						// get Installment Receive
						amountreceive = paymentReceive.getInstAmt();
						if (amountreceive > 0)
							{
								qryInst.append("from InstSchedule, Agrmnt where AgrmntId = :agrmntId and instAmt - paidAmt - waivedAmt > 0 Order by dueDate");
								qry = this.session.createQuery(qryInst.toString());
								final List<Object[]> lst = qry.list();
								final Iterator<Object[]> it = lst.iterator();

								while (it.hasNext() && (amountreceive > 0))
									{
										final Object[] objrow = it.next();
										final InstSchedule aRow = (InstSchedule) objrow[0];
										final Agrmnt arowagrmnt = (Agrmnt) objrow[1];

										osinstallment = aRow.getInstAmt() - aRow.getPaidAmt() - aRow.getWaivedAmt();
										if (osinstallment > 0)
											{
												if (amountreceive >= osinstallment)
													{
														amountreceive -= osinstallment;
														amountallocation = osinstallment;
													}
												else
													{
														amountallocation = amountreceive;
														amountreceive = 0;
													}
											}

										final InstSchedule inst = new InstSchedule();
										lcamount = 0.00;
										// Calculate LC Amount
										lcamount = this.LCCalcAmountperSeqNo(paymentReceive.getAgrmnt(), paymentReceive.getValueDate(), aRow.getInstSeqNo());
										// Calculate LC Days
										lcdays = 0;
										lcdays = this.LCCalcDaysperSeqNo(paymentReceive.getAgrmnt(), paymentReceive.getValueDate(), aRow.getInstSeqNo());
										inst.setPaidAmt(inst.getPaidAmt() - amountallocation);
										inst.setLcamt(inst.getLcamt() + lcamount);
										inst.setUsrUpd(usrUpd);
										inst.setDtmUpd(this.dtmUpd);

										final PayHistDtl dtl = new PayHistDtl();
										dtl.setPayHistHdr(hdr);
										dtl.setInstSeqNo(aRow.getInstSeqNo());
										dtl.setAssetSeqNo((short) 0);
										dtl.setYearNum((short) 0);
										dtl.setCoaName("LCINSTA");
										dtl.setDebitAmt(amountallocation);
										dtl.setCreditAmt(0.00);
										dtl.setLcamt(lcamount);
										dtl.setLcdays(lcdays);
										dtl.setDescription(paymentReceive.getNotes());
										dtl.setUsrUpd(usrUpd);
										dtl.setUsrCrt(usrUpd);
										dtl.setDtmCrt(this.dtmUpd);
										dtl.setDtmUpd(this.dtmUpd);

										mnt.setInstPaid(mnt.getInstPaid() + amountallocation);
										mnt.setLcinstAmt(mnt.getLcinstAmt() + lcamount);
										mnt.setLastLccalcInstDate(paymentReceive.getValueDate());
										// need more code in here
										mnt.setUsrUpd(usrUpd);
										mnt.setDtmUpd(this.dtmUpd);

										osp = arowagrmnt.getOsp() - aRow.getOsPamt();
										if (interestallocation > osp)
											{
												principal = osp;
												interest = interestallocation - osp;
											}
										else
											{
												if (interest >= paymentReceive.getInstAmt())
													{
														if (interestallocation > (interest - paymentReceive.getInstAmt()))
															{
																interest -= paymentReceive.getInstAmt();
																principal = interestallocation - interest;
															}
														else
															{
																principal = 0;
																interest = interestallocation;
															}
													}
												else
													{
														principal = interestallocation;
														interest = 0;
													}
											}

										agrmnt.setOsp(agrmnt.getOsp() - principal);
										agrmnt.setOsi(agrmnt.getOsi() - interest);

										//
										this.session.save(dtl);
										this.session.update(inst);
										this.session.update(mnt);

										final List<InstSchedule> lstinst = qry.list();
										final Iterator<InstSchedule> itInst = lstinst.iterator();

										while (itInst.hasNext())
											{
												final InstSchedule rowInst = itInst.next();
												if ((rowInst.getInstAmt() - rowInst.getPaidAmt() - rowInst.getWaivedAmt()) > 0)
													{
														agrmnt.setNextInstDate(aRow.getDueDate());
														agrmnt.setNextInstNumber(aRow.getInstSeqNo());
													}
											}
										this.session.update(agrmnt);
									}         // end while
							}
					}         // end try
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

			}

		@SuppressWarnings("unchecked")
		public double LCCalcAmountperSeqNo(final Agrmnt agrmnt, final Date valueDate, final Short instseqno) throws Exception
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
						qry = this.session.createQuery(qryInst.toString());
						qry.setParameter("agrmntid", agrmnt.getId());
						qry.setParameter("instseqno", instseqno);
						qry.setCacheable(true);
						qry.setCacheRegion("LCCalcAmountperSeqNo" + agrmnt.getId() + instseqno);
						final List<Object[]> lst = qry.list();
						final Iterator<Object[]> it = lst.iterator();
						while (it.hasNext())
							{
								final Object[] objrow = it.next();
								final InstSchedule aRow = (InstSchedule) objrow[0];
								this.LCCalcDaysperSeqNo(agrmnt, valueDate, instseqno);

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
		public short LCCalcDaysperSeqNo(final Agrmnt agrmnt, final Date valuedate, final Short instseqno) throws Exception
			{
				final StringBuilder qryInst = new StringBuilder();
				short lcdays = 0;
				final Query qry;
				try
					{
						qryInst.append("from InstSchedule, Agrmnt where InstSchedule.AgrmntId = Agrmnt.Id and AgrmntId = :agrmntid and instAmt - paidAmt - waivedAmt > 0 and instSeqNo = :instseqno");
						qry = this.session.createQuery(qryInst.toString());
						qry.setParameter("agrmntid", agrmnt.getId());
						qry.setParameter("instseqno", instseqno);
						qry.setCacheable(true);
						qry.setCacheRegion("LCCalcDaysperSeqNo" + agrmnt.getId() + instseqno);
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
		public double LCCalc(final Agrmnt agrmnt, final Date valuedate) throws Exception
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
						qry = this.session.createQuery(qryInst.toString());
						qry.setParameter("agrmntid", agrmnt.getId());
						qry.setCacheable(true);
						qry.setCacheRegion("LCCalc" + agrmnt.getId() + valuedate);
						final List<Object[]> lst = qry.list();
						final Iterator<Object[]> it = lst.iterator();
						while (it.hasNext())
							{
								final Object[] objrow = it.next();
								final InstSchedule aRow = (InstSchedule) objrow[0];

								lcdays = this.LCCalcDaysperSeqNo(agrmnt, valuedate, aRow.getInstSeqNo());
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

>>>>>>> 5851c81 new Model
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
