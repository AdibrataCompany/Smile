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

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.AssetMaster;
import com.adibrata.smartdealer.model.PurchaseOrderDtl;
import com.adibrata.smartdealer.model.PurchaseOrderHdr;
import com.adibrata.smartdealer.model.Stock;
import com.adibrata.smartdealer.service.purchase.PurchaseOrderService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PurchaseEntryDao extends DaoBase implements PurchaseOrderService
	{
		String userupd;
		Session session;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar dtmupd = Calendar.getInstance();
		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;

		public PurchaseEntryDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from Supplier ";

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
		public void Save(final String usrupd, final PurchaseOrderHdr purchaseOrderHdr, final List<PurchaseOrderDtl> lstpurchaseOrderDtl) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder assetcode = new StringBuilder();
				this.session.getTransaction().begin();
				try
					{
						final String transno = TransactionNo(this.session, purchaseOrderHdr.getPartner().getPartnerCode(), purchaseOrderHdr.getOffice().getId(), TransactionType.purchaseorder);
						purchaseOrderHdr.setPono(transno);
						purchaseOrderHdr.setDtmCrt(this.dtmupd.getTime());
						purchaseOrderHdr.setDtmUpd(this.dtmupd.getTime());
						this.session.save(purchaseOrderHdr);

						for (final PurchaseOrderDtl arow : lstpurchaseOrderDtl)
							{
								// 1. Save Asset Master
								// 2. Save Stock
								// 3. Save purchase order detail
								final AssetMaster assetmaster = new AssetMaster();
								assetmaster.setPartner(purchaseOrderHdr.getPartner());
								assetmaster.setAssetBrand(arow.getAssetBrand());
								assetmaster.setAssetType(arow.getAssetType());
								assetmaster.setAssetModel(arow.getAssetModel());
								assetmaster.setAssetLevel(3);
								assetcode.append(arow.getAssetBrand());
								assetcode.append(",");
								assetcode.append(arow.getAssetType());
								assetcode.append(",");
								assetcode.append(arow.getAssetModel());
								assetmaster.setDtmCrt(this.dtmupd.getTime());
								assetmaster.setDtmUpd(this.dtmupd.getTime());
								assetmaster.setUsrCrt(purchaseOrderHdr.getUsrCrt());
								assetmaster.setUsrUpd(purchaseOrderHdr.getUsrUpd());

								assetmaster.setAssetCode(assetcode.toString());
								this.session.save(assetmaster);

								final Stock stock = new Stock();
								stock.setPartner(purchaseOrderHdr.getPartner());
								stock.setOffice(purchaseOrderHdr.getOffice());
								stock.setAssetMaster(assetmaster);
								stock.setAssetBrand(arow.getAssetBrand());
								stock.setAssetType(arow.getAssetType());
								stock.setAssetModel(arow.getAssetModel());
								stock.setAssetCode(assetmaster.getAssetCode());
								stock.setBpkbno(arow.getBpkbno());
								stock.setBpkbname(arow.getBpkbname());
								stock.setBpkbaddress(arow.getBpkbaddress());
								stock.setVehicleColor(arow.getVehicleColor());
								stock.setMachineNo(arow.getMachineNo());
								stock.setChasisNo(arow.getChasisNo());
								stock.setCylinder(arow.getCylinder());
								stock.setLicensePlate(arow.getLicensePlate());
								stock.setManufacturingMonth(arow.getManufacturingMonth());
								stock.setManufacturingYear(arow.getManufacturingYear());
								stock.setPurchasePrice(arow.getAssetPrice());
								stock.setPurchaseDate(purchaseOrderHdr.getPodate());
								stock.setStockStatus("NEW");
								stock.setSupplier(purchaseOrderHdr.getSupplier());
								stock.setDtmCrt(this.dtmupd.getTime());
								stock.setDtmUpd(this.dtmupd.getTime());
								stock.setUsrCrt(purchaseOrderHdr.getUsrCrt());
								stock.setUsrUpd(purchaseOrderHdr.getUsrUpd());
								this.session.save(stock);

								PurchaseOrderDtl purchsaeorderdtl = new PurchaseOrderDtl();
								purchsaeorderdtl = arow;
								purchsaeorderdtl.setPurchaseOrderHdr(purchaseOrderHdr);
								purchsaeorderdtl.setDtmCrt(this.dtmupd.getTime());
								purchsaeorderdtl.setDtmUpd(this.dtmupd.getTime());
								this.session.save(purchsaeorderdtl);
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

		@Override
		public List<PurchaseOrderHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{

				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PurchaseOrderHdr> list = null;
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(WhereCond);
							}

						final Query selectQuery = this.session.createQuery(hql.toString());
						selectQuery.setFirstResult((CurrentPage - 1) * this.pagesize);
						selectQuery.setMaxResults(this.pagesize);
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

		@Override
		public List<PurchaseOrderHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PurchaseOrderHdr> list = null;

				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						final Query selectQuery = this.session.createQuery(hql.toString());
						final long totalrecord = this.TotalRecord(this.strStatement, WhereCond);
						selectQuery.setFirstResult((int) ((totalrecord - 1) * this.pagesize));
						selectQuery.setMaxResults(this.pagesize);
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

		@Override
		public List<PurchaseOrderDtl> viewPurchaseOrderDtls(final PurchaseOrderHdr purchaseOrderHdr) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<PurchaseOrderDtl> list = null;

				try
					{
						hql.append("from PurchaseOrderDtl ");

						final Query selectQuery = this.session.createQuery(hql.toString());

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

		@Override
		public PurchaseOrderHdr viewPurchaseOrderHdr(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				PurchaseOrderHdr purchaseOrderHdr = null;
				try
					{
						purchaseOrderHdr = (PurchaseOrderHdr) this.session.get(PurchaseOrderHdr.class, id);

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return purchaseOrderHdr;
			}

	}
