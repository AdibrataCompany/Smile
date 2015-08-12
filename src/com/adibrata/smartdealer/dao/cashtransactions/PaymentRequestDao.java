/**
 *
 */

package com.adibrata.smartdealer.dao.cashtransactions;

import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PayReqDtl;
import com.adibrata.smartdealer.model.PayReqHdr;
import com.adibrata.smartdealer.service.cashtransactions.PaymentRequestService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PaymentRequestDao extends DaoBase implements PaymentRequestService
	{
		String userupd;
		
		String strStatement;
		StringBuilder hql = new StringBuilder();
		
		public PaymentRequestDao() throws Exception
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
		 * com.adibrata.smartdealer.service.cashtransactions.PaymentRequestService
		 * #SavePaymentRequest(com.adibrata.smartdealer.model.PayReqHdr,
		 * com.adibrata.smartdealer.model.PayReqDtl)
		 */
		
		@Override
		public void SavePaymentRequest(final String usrupd, final PayReqHdr payReqHdr, final List<PayReqDtl> lstpayReqDtl) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				final Partner partner = payReqHdr.getPartner();
				final Office office = payReqHdr.getOffice();
				
				try
					{
						
						final String transno = TransactionNo(this.getSession(), partner.getPartnerCode(), office.getId(), TransactionType.paymentrequest);
						payReqHdr.setPayReqNo(transno);
						payReqHdr.setDtmCrt(this.dtmupd);
						payReqHdr.setDtmUpd(this.dtmupd);
						for (final PayReqDtl arow : lstpayReqDtl)
							{
								PayReqDtl payReqDtl = new PayReqDtl();
								payReqDtl = arow;
								payReqDtl.setPayReqHdr(payReqHdr);
								payReqDtl.setDtmCrt(this.dtmupd);
								payReqDtl.setDtmUpd(this.dtmupd);
								this.getSession().save(payReqHdr);
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
		 * com.adibrata.smartdealer.service.cashtransactions.PaymentRequestService
		 * #PurchaseInvoicePaging(int, java.lang.String, java.lang.String)
		 */
		@Override
		public List<PayReqHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PayReqHdr> list = null;
				
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						final long totalrecord = this.TotalRecord(this.strStatement, WhereCond);
						selectQuery.setFirstResult((int) ((totalrecord - 1) * this.getPagesize()));
						selectQuery.setMaxResults(this.getPagesize());
						list = selectQuery.list();
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return list;
			}
			
		/*
		 * (non-Javadoc)
		 * @see
		 * com.adibrata.smartdealer.service.cashtransactions.PaymentRequestService
		 * #TotalRecord(java.lang.String)
		 */
		
		@Override
		public List<PayReqHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast)
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public List<PayReqDtl> lstPayReqDtl(final int CurrentPage, final String WhereCond, final String SortBy)
			{
				// TODO Auto-generated method stub
				return null;
			}
			
		@Override
		public PayReqDtl View(final long id)
			{
				// TODO Auto-generated method stub
				return null;
			}
			
	}
