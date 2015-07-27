
package com.adibrata.smartdealer.dao.accmaint;

import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.SuspendReceive;
import com.adibrata.smartdealer.service.accmaint.SuspendEntryService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.job.JobPost;

public class SuspendEntryDao extends DaoBase implements SuspendEntryService
	{
		Session session;
		
		public SuspendEntryDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.session = HibernateHelper.getSessionFactory().openSession();
			}
			
		@Override
		public void SuspendEntrySave(final String usrupd, final Partner partner, final Office office, final SuspendReceive suspend) throws Exception
			{
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				long jobid;
				this.session.getTransaction().begin();
				try
					{
						
						jobid = JobPost.JobSave(this.session, partner.getPartnerCode(), office.getId(), JobPost.JobCode.suspendentry, "", suspend.getValueDate(), suspend.getPostingDate(), usrupd).getId();
						
						suspend.setJobId(jobid);
						suspend.setDtmUpd(this.dtmupd);
						suspend.setDtmCrt(this.dtmupd);
						suspend.setStatus("NE");
						this.session.save(suspend);
						this.session.flush();
						this.session.clear();
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
