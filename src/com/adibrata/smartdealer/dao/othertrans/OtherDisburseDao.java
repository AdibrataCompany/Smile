/**
 *
 */

package com.adibrata.smartdealer.dao.othertrans;

import java.util.List;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.OtherDsbDtl;
import com.adibrata.smartdealer.model.OtherDsbHdr;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.othertransactions.OtherDisburseService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.job.JobPost;

public class OtherDisburseDao extends DaoBase implements OtherDisburseService
	{
		
		StringBuilder hql = new StringBuilder();
		int pagesize;

		String strStatement;
		String userupd;
		
		public OtherDisburseDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						
						this.strStatement = " from Office ";
						
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

		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.othertransactions.OtherDisburse#Save
		 * (com.adibrata.smartdealer.model.OtherDsbHdr,
		 * com.adibrata.smartdealer.model.OtherDsbDtl)
		 */
		@SuppressWarnings("unused")
		@Override
		public void Save(final String usrupd, final OtherDsbHdr otherDsbHdr, final List<OtherDsbDtl> lstotherDsbDtl) throws Exception
			{
				// TODO Auto-generated method stub
				final Partner partner = otherDsbHdr.getPartner();
				final Office office = otherDsbHdr.getOffice();
				Long jobid;
				this.getSession().getTransaction().begin();
				
				try
					{
						final String transno = TransactionNo(this.getSession(), partner.getPartnerCode(), office.getId(), TransactionType.otherdisburse);

						jobid = JobPost.JobSave(this.getSession(), otherDsbHdr.getPartner().getPartnerCode(), otherDsbHdr.getOffice().getId(), JobPost.JobCode.otherdisburse, "", otherDsbHdr.getValueDate(), otherDsbHdr.getPostingDate(),
						        otherDsbHdr.getUsrUpd()).getId();
						otherDsbHdr.setJobId(jobid);
						otherDsbHdr.setOtherDisbCode(transno);
						otherDsbHdr.setDtmCrt(this.dtmupd);
						otherDsbHdr.setDtmUpd(this.dtmupd);
						this.getSession().save(otherDsbHdr);
						
						for (final OtherDsbDtl arow : lstotherDsbDtl)
							{
								OtherDsbDtl otherDsbDtl = new OtherDsbDtl();
								otherDsbDtl = arow;
								otherDsbDtl.setOtherDsbHdr(otherDsbHdr);

								otherDsbDtl.setDtmCrt(this.dtmupd);
								otherDsbDtl.setDtmUpd(this.dtmupd);
								this.getSession().save(otherDsbDtl);
							}
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

		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.othertransactions.OtherDisburse#Paging
		 * (int, java.lang.String, java.lang.String)
		 */
		
	}
