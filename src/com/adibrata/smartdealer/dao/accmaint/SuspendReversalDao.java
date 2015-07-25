
package com.adibrata.smartdealer.dao.accmaint;

import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.Suspend;
import com.adibrata.smartdealer.model.SuspendReverse;
import com.adibrata.smartdealer.service.accmaint.SuspendReversalService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.job.JobPost;

public class SuspendReversalDao extends DaoBase implements SuspendReversalService
	{
		Session session;
		
		public SuspendReversalDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
			}
			
		@Override
		public void SuspendReversalSave(final String usrupd, final Partner partner, final Office office, final SuspendReverse suspendReverse) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				long jobid;
				final Suspend suspend = new Suspend();
				try
					{

						jobid = JobPost.JobSave(this.session, partner.getPartnerCode(), office.getId(), JobPost.JobCode.suspendreverse, "", suspendReverse.getValueDate(), suspendReverse.getPostingDate(), usrupd).getId();

						suspendReverse.setJobId(jobid);
						suspendReverse.setDtmUpd(this.dtmupd);
						suspendReverse.setDtmCrt(this.dtmupd);

						this.session.save(suspendReverse);
						this.session.flush();

						suspend.setId(suspendReverse.getSuspend().getId());
						suspend.setStatus("RE");
						this.session.update(suspend);
						this.session.flush();

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
