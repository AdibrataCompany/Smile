/**
 * PaymentReceiveDao.java
 */

package com.adibrata.smartdealer.dao.accmaint;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.job.JobPost;
import util.adibrata.support.payhist.Header;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PaymentReceive;

/**
 * @author Henry
 */
public class PaymentReceiveDao extends DaoBase
{
	Session session;
	Date dtmUpd = Calendar.getInstance().getTime();

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

	public void SavePaymentReceive(final String UsrUpd, final PaymentReceive paymentReceive) throws Exception
		{
			this.session.getTransaction().begin();
			final Header header = new Header();
			Partner partner = new Partner();
			Office office = new Office();
			partner = paymentReceive.getAgrmnt().getPartner();

			office = paymentReceive.getAgrmnt().getOffice();
			try
				{
					JobPost.JobSave(this.session, partner.getPartnerCode(), office.getId(), JobPost.JobCode.salesorder, paymentReceive.getAgrmnt().getCoaSchmCode(), paymentReceive.getValueDate(), paymentReceive.getPostingDate(), UsrUpd).getId();
					paymentReceive.setPayHistSeqNo(header.SavePayHistHeader(UsrUpd, paymentReceive));
					paymentReceive.setDtmUpd(this.dtmUpd);
					paymentReceive.setDtmCrt(this.dtmUpd);

					this.session.save(paymentReceive);
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
