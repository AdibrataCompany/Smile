/**
 * 
 */
package com.adibrata.smartdealer.dao.othertrans;

/**
 * @author Henry
 *
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.OtherDsbDtl;
import com.adibrata.smartdealer.model.OtherDsbHdr;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.othertransactions.OtherDisburseService;

public class OtherDisburseDao extends DaoBase implements OtherDisburseService {
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	StringBuilder hql = new StringBuilder();
	int pagesize;
	Session session;
	String strStatement;
	String userupd;

	public OtherDisburseDao() throws Exception {
		// TODO Auto-generated constructor stub
		try {
			this.session = HibernateHelper.getSessionFactory().openSession();
			this.pagesize = HibernateHelper.getPagesize();
			this.strStatement = " from Office ";

		} catch (final Exception exp) {
			this.session.getTransaction().rollback();
			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.othertransactions.OtherDisburse#Save
	 * (com.adibrata.smartdealer.model.OtherDsbHdr,
	 * com.adibrata.smartdealer.model.OtherDsbDtl)
	 */
	@SuppressWarnings("unused")
	@Override
	public void Save(String usrupd, OtherDsbHdr otherDsbHdr,
			List<OtherDsbDtl> lstotherDsbDtl) throws Exception {
		// TODO Auto-generated method stub
		final Partner partner = otherDsbHdr.getPartner();
		final Office office = otherDsbHdr.getOffice();

		this.session.getTransaction().begin();
		try {
			final String transno = TransactionNo(this.session,
					TransactionType.otherdisburse, partner.getPartnerCode(),
					office.getId());
			otherDsbHdr.setOtherDisbNo(transno);
			otherDsbHdr.setDtmCrt(this.dtmupd.getTime());
			otherDsbHdr.setDtmUpd(this.dtmupd.getTime());
			this.session.save(otherDsbHdr);

			for (final OtherDsbDtl arow : lstotherDsbDtl) {
				final OtherDsbDtl otherDsbDtl = new OtherDsbDtl();
				otherDsbDtl.setDtmCrt(this.dtmupd.getTime());
				otherDsbDtl.setDtmUpd(this.dtmupd.getTime());
				this.session.save(otherDsbDtl);
			}
			this.session.getTransaction().commit();

		} catch (final Exception exp) {
			this.session.getTransaction().rollback();
			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.othertransactions.OtherDisburse#Paging
	 * (int, java.lang.String, java.lang.String)
	 */

}
