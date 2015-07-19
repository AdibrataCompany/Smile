/**
 * Insurance.java
 */

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

/**
 * @author Henry
 */
public class Insurance
	{
		
		/**
	 *
	 */
		static Session session;
		
		private final Date dtmUpd = Calendar.getInstance().getTime();
		
		public Insurance()
			{
				// TODO Auto-generated constructor stub
				session = HibernateHelper.getSessionFactory().openSession();
			}
		
		public Insurance(Session session)
			{
				Header.session = session;
			}
		
		@SuppressWarnings("unchecked")
		public void SaveDetail(String usrUpd, PaymentReceive paymentReceive, PayHistHdr hdr) throws Exception
			{
				final StringBuilder qryInst = new StringBuilder();
				final StringBuilder strqryagrmnt = new StringBuilder();
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
				double interestallocation = 0.00;
				final Query qry;
				try
					{
						// get Installment Receive
						
						if (paymentReceive.getInssAmt() > 0)
							{
								amountreceive = paymentReceive.getInssAmt();
								qryInst.append("from InstSchedule, Agrmnt where InstSchedule.AgrmntId = Agrmnt.Id and AgrmntId = :agrmntId and instAmt - paidAmt - waivedAmt > 0 Order by dueDate");
								qry = session.createQuery(qryInst.toString());
								
								qry.setParameter("agrmntId", paymentReceive.getAgrmnt().getId());
								final List<InstSchedule> lst = qry.list();
								final Iterator<InstSchedule> it = lst.iterator();
								
								while (it.hasNext() && (amountreceive > 0))
									{
										final InstSchedule aRow = it.next();
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
										inst.setPaidAmt(inst.getPaidAmt() - amountallocation);
										
										// Calculate LC Amount
										lcamount = LCInstallment.LCCalcAmountperSeqNo(session, paymentReceive.getAgrmnt(), paymentReceive.getValueDate(), aRow.getInstSeqNo());
										// Calculate LC Days
										lcdays = LCInstallment.LCCalcDaysperSeqNo(session, paymentReceive.getAgrmnt(), paymentReceive.getValueDate(), aRow.getInstSeqNo());
										inst.setLcamt(inst.getLcamt() + lcamount);
										
										final PayHistDtl dtl = new PayHistDtl();
										dtl.setPayHistHdr(hdr);
										dtl.setInstSeqNo(aRow.getInstSeqNo());
										dtl.setAssetSeqNo((short) 0);
										dtl.setYearNum((short) 0);
										dtl.setCoaName("INSSURANCE");
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
										strqryagrmnt.append("from Agrmnt where AgrmntId = :agrmntId ");
										final Query qryagrmnt = session.createQuery(strqryagrmnt.toString());
										
										qry.setParameter("agrmntId", paymentReceive.getAgrmnt().getId());
										final List<Agrmnt> lstagrmnt = qryagrmnt.list();
										final Iterator<Agrmnt> itagrmnt = lstagrmnt.iterator();
										
										interestallocation = amountallocation;
										
										while (itagrmnt.hasNext())
											{
												final Agrmnt arowagrmnt = itagrmnt.next();
												
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
											}
										
										agrmnt.setOsp(agrmnt.getOsp() - principal);
										agrmnt.setOsi(agrmnt.getOsi() - interest);
										
										agrmnt.setNextInstNumber(aRow.getInstSeqNo());
										agrmnt.setNextInstDate(aRow.getDueDate());
										//
										session.save(dtl);
										session.update(inst);
										session.update(mnt);
										
										final List<InstSchedule> lstinst = qry.list();
										final Iterator<InstSchedule> itInst = lstinst.iterator();
										
										while (itInst.hasNext())
											{
												final InstSchedule rowInst = it.next();
												if ((rowInst.getInstAmt() - rowInst.getPaidAmt() - rowInst.getWaivedAmt()) > 0)
													{
														agrmnt.setNextInstDate(aRow.getDueDate());
														agrmnt.setNextInstNumber(aRow.getInstSeqNo());
													}
												
											}
										session.update(agrmnt);
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
				
			}
	}