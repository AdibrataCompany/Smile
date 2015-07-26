
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

public class Installment
	{
		Session session;
		private final Date dtmUpd = Calendar.getInstance().getTime();

		public Installment()
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
			}

		public Installment(final Session session)
			{
				this.session = session;
			}

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
				final LCInstallment lcinstallment = new LCInstallment(this.session);
				final Query qry;
				try
					{
						// get Installment Receive
						amountreceive = paymentReceive.getInstAmt();
						if (amountreceive > 0)
							{
								qryInst.append("from InstSchedule, Agrmnt where AgrmntId = :agrmntId and instAmt - paidAmt - waivedAmt > 0 Order by dueDate");
								qry = this.session.createQuery(qryInst.toString());

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
										lcamount = lcinstallment.LCCalcAmountperSeqNo(paymentReceive.getAgrmnt(), paymentReceive.getValueDate(), aRow.getInstSeqNo());
										// Calculate LC Days
										lcdays = 0;
										lcdays = lcinstallment.LCCalcDaysperSeqNo(paymentReceive.getAgrmnt(), paymentReceive.getValueDate(), aRow.getInstSeqNo());
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
									}   // end while
							}
					}   // end try
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

			}
	}
