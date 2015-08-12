/**
 * PaymentReversalDao.java
 */

package com.adibrata.smartdealer.dao.accmaint;

import java.util.List;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PayHistDtl;
import com.adibrata.smartdealer.model.PayHistHdr;
import com.adibrata.smartdealer.model.PaymentReversal;
import com.adibrata.smartdealer.service.accmaint.PaymentReversalService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.job.JobPost;
import util.adibrata.support.payhist.Header;

/**
 * @author Henry
 */
public class PaymentReversalDao extends DaoBase implements PaymentReversalService
	{
		
		/**
		 *
		 */
		public PaymentReversalDao() throws Exception
			{
				// TODO Auto-generated constructor stub

			}

		@Override
		public void PaymentReversalSave(final String usrupd, final Agrmnt agrmnt, final PayHistHdr payHistHdr, final PaymentReversal paymentReversal) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				new Header(this.getSession());
				Partner partner = new Partner();
				Office office = new Office();
				partner = agrmnt.getPartner();
				office = agrmnt.getOffice();
				try
					{
						JobPost.JobSave(this.getSession(), partner.getPartnerCode(), office.getId(), JobPost.JobCode.paymentreverse, agrmnt.getCoaSchmCode(), paymentReversal.getValueDate(), paymentReversal.getPostingDate(), usrupd).getId();
						// paymentReversal.setPayHistSeqNo(header.SavePayHistHeader(usrupd, payHistHdr));
						// paymentReversal.setJobId(jobid);
						paymentReversal.setDtmUpd(this.dtmupd);
						paymentReversal.setDtmCrt(this.dtmupd);
						
						this.getSession().save(paymentReversal);
						this.getSession().getTransaction().commit();
					}
				catch (final Exception exp)
					{
						this.getSession().getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
			}

		@Override
		public List<PayHistHdr> PaymentHistoryHeader(final Agrmnt agrmnt) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}

		@Override
		public List<PayHistDtl> PaymentHistoryDetail(final PayHistHdr payhistdtl) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
			
	}
