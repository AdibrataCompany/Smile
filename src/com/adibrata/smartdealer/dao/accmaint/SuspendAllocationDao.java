/**
 * SuspendAllocationDao.java
 */

package com.adibrata.smartdealer.dao.accmaint;

import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PaymentReceive;
import com.adibrata.smartdealer.model.Suspend;
import com.adibrata.smartdealer.model.SuspendAllocation;
import com.adibrata.smartdealer.service.accmaint.SuspendAllocationService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.job.JobPost;
import util.adibrata.support.payhist.Header;

/**
 * @author Henry
 */
public class SuspendAllocationDao extends DaoBase implements SuspendAllocationService
	{

		/**
		 *
		 */
		Session session;

		public SuspendAllocationDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
			}

		@Override
		public void SuspendAllocationSave(final String usrupd, final SuspendAllocation allocation) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				final Header header = new Header();
				Partner partner = new Partner();
				Office office = new Office();
				partner = allocation.getAgrmnt().getPartner();
				long jobid;
				office = allocation.getAgrmnt().getOffice();
				final PaymentReceive paymentReceive = new PaymentReceive();
				final Suspend suspend = new Suspend();

				try
					{
						paymentReceive.setAgrmnt(allocation.getAgrmnt());
						paymentReceive.setBankAccId(allocation.getBankAccountId());
						paymentReceive.setCurrencyRate(allocation.getCurrencyRate());
						paymentReceive.setCurrencyId(allocation.getCurrencyId());
						paymentReceive.setTotalPayment(allocation.getTotalPayment());

						paymentReceive.setInssAmt(allocation.getInssAmt());
						paymentReceive.setInstAmt(allocation.getInstAmt());
						paymentReceive.setLcamt(allocation.getLcamt());
						paymentReceive.setLcinss(allocation.getLcinss());
						paymentReceive.setPrepaidAmt(allocation.getPrepaidAmt());

						jobid = JobPost.JobSave(this.session, partner.getPartnerCode(), office.getId(), JobPost.JobCode.suspendallocation, allocation.getAgrmnt().getCoaSchmCode(), allocation.getValueDate(), allocation.getPostingDate(), usrupd)
						        .getId();
						allocation.setPayHistSeqNo(header.SavePayHistHeader(usrupd, paymentReceive));
						allocation.setJobId(jobid);
						allocation.setDtmUpd(this.dtmupd);
						allocation.setDtmCrt(this.dtmupd);

						this.session.save(allocation);
						suspend.setId(allocation.getSuspend().getId());
						suspend.setStatus("AL");
						this.session.update(suspend);
						this.session.getTransaction().commit();
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

	}
