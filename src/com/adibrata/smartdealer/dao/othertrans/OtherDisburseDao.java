/**
 *
 */

package com.adibrata.smartdealer.dao.othertrans;

import java.util.List;

import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.OtherDsbDtl;
import com.adibrata.smartdealer.model.OtherDsbHdr;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.othertransactions.OtherDisburseService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class OtherDisburseDao extends DaoBase implements OtherDisburseService
	{

		StringBuilder hql = new StringBuilder();
		int pagesize;
		Session session;
		String strStatement;
		String userupd;
		
		public OtherDisburseDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{

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
				Partner partner = new Partner();
				Office office = new Office();
				
				this.session.getTransaction().begin();
				try
					{
						partner = otherDsbHdr.getPartner();
						office = otherDsbHdr.getOffice();
						final String transno = TransactionNo(this.session, partner.getPartnerCode(), office.getId(), TransactionType.otherdisburse);
						
						otherDsbHdr.setOtherDisbNo(transno);
						otherDsbHdr.setDtmCrt(this.dtmupd);
						otherDsbHdr.setDtmUpd(this.dtmupd);
						this.session.save(otherDsbHdr);
						
						for (final OtherDsbDtl arow : lstotherDsbDtl)
							{
								final OtherDsbDtl otherDsbDtl = new OtherDsbDtl();
								otherDsbDtl.setOtherDsbHdr(otherDsbHdr);

								otherDsbDtl.setDtmCrt(this.dtmupd);
								otherDsbDtl.setDtmUpd(this.dtmupd);
								this.session.save(otherDsbDtl);
							}
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

		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.othertransactions.OtherDisburse#Paging
		 * (int, java.lang.String, java.lang.String)
		 */
		
	}
