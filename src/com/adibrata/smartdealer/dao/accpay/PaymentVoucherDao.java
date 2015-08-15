/**
 *
 */

package com.adibrata.smartdealer.dao.accpay;

import java.util.List;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.PaymentVoucher;
import com.adibrata.smartdealer.service.accpay.PVDisbursementService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PaymentVoucherDao extends DaoBase implements PVDisbursementService
	{
		String userupd;
		String strStatement;
		StringBuilder hql = new StringBuilder();
		
		public PaymentVoucherDao() throws Exception
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
		 * @see com.adibrata.smartdealer.service.accpay.PVDisbursement#Save()
		 */
		@Override
		public void Save(final PaymentVoucher paymentVoucher) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						paymentVoucher.setDtmCrt(this.dtmupd);
						paymentVoucher.setDtmUpd(this.dtmupd);

						this.getSession().save(paymentVoucher);
						/*
						 * JobPost jobpost = new JobPost(getSession()); String PartnerCode;
						 */

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
		 * @see com.adibrata.smartdealer.service.accpay.PVDisbursement#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		@Override
		public List<PaymentVoucher> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}

		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.accpay.PVDisbursement#TotalRecord(java
		 * .lang.String)
		 */

		@Override
		public PaymentVoucher View(final Long id) throws Exception
			{
				// TODO Auto-generated method stub
				PaymentVoucher paymentVoucher = null;
				try
					{
						paymentVoucher = (PaymentVoucher) this.getSession().get(PaymentVoucher.class, id);

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return paymentVoucher;
			}

	}
