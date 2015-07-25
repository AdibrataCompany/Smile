/**
 * PaymentReceiveDao.java
 */

package com.adibrata.smartdealer.dao.accmaint;

import java.util.Date;

import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PaymentInfo;
import com.adibrata.smartdealer.model.PaymentReceive;
import com.adibrata.smartdealer.service.accmaint.PaymentReceiveService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.ArInfo;
import util.adibrata.support.job.JobPost;
import util.adibrata.support.payhist.Header;

/**
 * @author Henry
 */
public class PaymentReceiveDao extends DaoBase implements PaymentReceiveService
	{
		Session session;
		
		/**
		*
		*/
		public PaymentReceiveDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
			}

		public PaymentReceiveDao(final Session session) throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = session;
			}
			
		@Override
		public PaymentInfo PaymentAllocation(final long AgrmntId, final double amountreceive, final Date valuedate) throws Exception
			{
				PaymentInfo info = new PaymentInfo();
				// TODO Auto-generated method stub
				try
					{
						
						final ArInfo arinfo = new ArInfo();
						final Agrmnt agrmnt = new Agrmnt();
						agrmnt.setId(AgrmntId);
						info = arinfo.PaymentAllocation(agrmnt, valuedate, amountreceive);
					}
				catch (final Exception exp)
					{
						this.session.getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return info;
			}

		@Override
		public void PaymentReceiveSave(final String usrupd, final PaymentReceive paymentreceive) throws Exception
			{
				this.session.getTransaction().begin();
				final Header header = new Header();
				Partner partner = new Partner();
				Office office = new Office();
				partner = paymentreceive.getAgrmnt().getPartner();
				long jobid;
				office = paymentreceive.getAgrmnt().getOffice();
				try
					{
						jobid = JobPost
						        .JobSave(this.session, partner.getPartnerCode(), office.getId(), JobPost.JobCode.paymentreceive, paymentreceive.getAgrmnt().getCoaSchmCode(), paymentreceive.getValueDate(), paymentreceive.getPostingDate(), usrupd)
						        .getId();
						paymentreceive.setPayHistSeqNo(header.SavePayHistHeader(usrupd, paymentreceive));
						paymentreceive.setJobId(jobid);
						paymentreceive.setDtmUpd(this.dtmupd);
						paymentreceive.setDtmCrt(this.dtmupd);

						this.session.save(paymentreceive);
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
