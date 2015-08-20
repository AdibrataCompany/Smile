/**
 *
 */

package com.adibrata.smartdealer.dao.purchase;

/**
 * @author Henry
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.PurchaseOrderHdr;
import com.adibrata.smartdealer.model.ReturPurchaseDtl;
import com.adibrata.smartdealer.model.ReturPurchaseHdr;
import com.adibrata.smartdealer.model.Stock;
import com.adibrata.smartdealer.service.purchase.PurchaseReturnService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PurchaseReturnDao extends DaoBase implements PurchaseReturnService
	{
		String userupd;
		Session session;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar dtmupd = Calendar.getInstance();
		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;

		public PurchaseReturnDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from PurchaseOrderHdr ";

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
		 * @see com.adibrata.smartdealer.service.purchase.PurchaseOrder#Save()
		 */
		@Override
		public void Save(final String usrupd, final ReturPurchaseHdr returPurchaseHdr, final List<ReturPurchaseDtl> returPurchaseDtl) throws Exception
			{
				// TODO Auto-generated method stub
				
				this.session.getTransaction().begin();
				try
					{
						final String transno = TransactionNo(this.session, returPurchaseHdr.getPartner().getPartnerCode(), returPurchaseHdr.getOffice().getId(), TransactionType.purchasereturn);
						
						returPurchaseHdr.setReturPurchaseNo(transno);
						
						returPurchaseHdr.setDtmCrt(this.dtmupd.getTime());
						returPurchaseHdr.setDtmUpd(this.dtmupd.getTime());
						
						this.session.save(returPurchaseHdr);
						
						for (final ReturPurchaseDtl arow : returPurchaseDtl)
							{
								// 1.No Impact Asset Master
								// 2. Save Stock update Status
								// 3. Save purchase order detail
								
								final Stock stock = new Stock();
								stock.setPartner(returPurchaseHdr.getPartner());
								stock.setOffice(returPurchaseHdr.getOffice());
								stock.setId(arow.getStock().getId());
								
								stock.setStockStatus("RET");
								stock.setSupplier(returPurchaseHdr.getSupplier());
								stock.setDtmCrt(this.dtmupd.getTime());
								stock.setDtmUpd(this.dtmupd.getTime());
								stock.setUsrCrt(returPurchaseHdr.getUsrCrt());
								stock.setUsrUpd(returPurchaseHdr.getUsrUpd());
								this.session.save(stock);
								
								ReturPurchaseDtl returpurchasedtl = new ReturPurchaseDtl();
								returpurchasedtl = arow;
								returpurchasedtl.setReturPurchaseHdr(returPurchaseHdr);
								returpurchasedtl.setDtmCrt(this.dtmupd.getTime());
								returpurchasedtl.setDtmUpd(this.dtmupd.getTime());
								this.session.save(returpurchasedtl);
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
		 * @see com.adibrata.smartdealer.service.purchase.PurchaseOrder#Paging(int,
		 * java.lang.String, java.lang.String)
		 */

		@Override
		public List<PurchaseOrderHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy)
			{
				// TODO Auto-generated method stub
				return null;
			}

		@Override
		public List<PurchaseOrderHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast)
			{
				// TODO Auto-generated method stub
				return null;
			}

		@Override
		public PurchaseOrderHdr viewPurchaseOrderHdr(final Long id)
			{
				// TODO Auto-generated method stub
				return null;
			}

	}
