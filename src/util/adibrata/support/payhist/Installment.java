
package util.adibrata.support.payhist;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.AgrmntMnt;
import com.adibrata.smartdealer.model.InstSchedule;
import com.adibrata.smartdealer.model.PayHistDtl;
import com.adibrata.smartdealer.model.PayHistHdr;
import com.adibrata.smartdealer.model.PaymentReceive;

public class Installment
	{
		static Session session;
		private final Date dtmUpd = Calendar.getInstance().getTime();
		
		public Installment()
			{
				// TODO Auto-generated constructor stub
				session = HibernateHelper.getSessionFactory().openSession();
			}
		
		public Installment(Session session)
			{
				Header.session = session;
			}
		
		@SuppressWarnings("unchecked")
		public void SaveDetail(String usrUpd, PaymentReceive paymentReceive, PayHistHdr hdr) throws Exception
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
								qry = session.createQuery(qryInst.toString());
								
								qry.setParameter("agrmntId", paymentReceive.getAgrmnt().getId());
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
										lcamount = LCInstallment.LCCalcAmountperSeqNo(session, paymentReceive.getAgrmnt(), paymentReceive.getValueDate(), aRow.getInstSeqNo());
										// Calculate LC Days
										lcdays = 0;
										lcdays = LCInstallment.LCCalcDaysperSeqNo(session, paymentReceive.getAgrmnt(), paymentReceive.getValueDate(), aRow.getInstSeqNo());
										inst.setPaidAmt(inst.getPaidAmt() - amountallocation);
										inst.setLcamt(inst.getLcamt() + lcamount);
										inst.setUsrUpd(usrUpd);
										inst.setDtmUpd(this.dtmUpd);
										
										final PayHistDtl dtl = new PayHistDtl();
										dtl.setPayHistHdr(hdr);
										dtl.setInstSeqNo(aRow.getInstSeqNo());
										dtl.setAssetSeqNo((short) 0);
										dtl.setYearNum((short) 0);
										dtl.setCoaName("INSTALLMENT");
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
										session.save(dtl);
										session.update(inst);
										session.update(mnt);
										
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
										session.update(agrmnt);
									} // end while
							}
					} // end try
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				
			}
		/*
		 * Set @AmountPrincipal = 0
		 * Set @AmountInterest = 0
		 * Set @AmountIterasiInterest = @TempPaid
		 * Set @MaximumInterest = @OutstandingInterest_Agreement -
		 * @OutStandingInterest_InstallmentSchedule
		 * Set @MaximumPrincipal = @OutstandingPrincipal_Agreement-
		 * @OutStandingPrincipal_InstallmentSchedule
		 * set @DateRange = datediff(day,@duedate,@BusinessDate) -- Fazar
		 * 11/13/2012
		 * If @AmountIterasiInterest > @MaximumPrincipal
		 * Begin
		 * Set @AmountPrincipal = @MaximumPrincipal
		 * Set @AmountInterest = @AmountIterasiInterest - @MaximumPrincipal
		 * End
		 * Else
		 * Begin
		 * --------------- begin Leonita 11 Juni 2008 perbaiki jika pembayaran
		 * partial dilakukan untuk agreement yang sebelumnya memiliki history
		 * pembayaran partial
		 * if @principalamount >= @paidamount
		 * begin
		 * if @AmountIterasiInterest > (@principalamount - @paidamount)
		 * begin
		 * set @AmountPrincipal = @principalamount - @paidamount
		 * set @AmountInterest = @AmountIterasiInterest - (@principalamount -
		 * @paidamount)
		 * -- Set @AmountPrincipal= @AmountIterasiInterest
		 * -- Set @AmountInterest = 0
		 * end
		 * else
		 * begin
		 * set @AmountPrincipal = @AmountIterasiInterest
		 * set @AmountInterest = 0
		 * end
		 * end
		 * else
		 * begin
		 * Set @AmountPrincipal= 0
		 * Set @AmountInterest = @AmountIterasiInterest
		 * end
		 * End
		 */
	}
