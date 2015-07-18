/**
 * 
 */
package com.adibrata.smartdealer.dao.purchase;

/**
 * @author Henry
 *
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.dao.DaoBase.TransactionType;
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.purchase.*;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

public class PurchaseEntryDao extends DaoBase implements PurchaseOrderService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public PurchaseEntryDao() throws Exception {
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from Supplier ";

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
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
	 * @see com.adibrata.smartdealer.service.purchase.PurchaseOrder#Save()
	 */
	@Override
	public void Save(String usrupd, PurchaseOrderHdr purchaseOrderHdr,
			List<PurchaseOrderDtl> lstpurchaseOrderDtl) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder assetcode = new StringBuilder();
		String pono;
		session.getTransaction().begin();
		try {
			String transno = TransactionNo(session, TransactionType.purchaseorder, purchaseOrderHdr
					.getPartner().getPartnerCode(), purchaseOrderHdr.getOffice()
					.getId());
			purchaseOrderHdr.setPono(transno);
			purchaseOrderHdr.setDtmCrt(dtmupd.getTime());
			purchaseOrderHdr.setDtmUpd(dtmupd.getTime());
			session.save(purchaseOrderHdr);

			for (PurchaseOrderDtl arow : lstpurchaseOrderDtl) {
				// 1. Save Asset Master
				// 2. Save Stock
				// 3. Save purchase order detail
				AssetMaster assetmaster = new AssetMaster();
				assetmaster.setPartner(purchaseOrderHdr.getPartner());
				assetmaster.setAssetBrand(arow.getAssetBrand());
				assetmaster.setAssetType(arow.getAssetType());
				assetmaster.setAssetModel(arow.getAssetModel());
				assetmaster.setAssetLevel((int) 3);
				assetcode.append(arow.getAssetBrand());
				assetcode.append(",");
				assetcode.append(arow.getAssetType());
				assetcode.append(",");
				assetcode.append(arow.getAssetModel());
				assetmaster.setDtmCrt(dtmupd.getTime());
				assetmaster.setDtmUpd(dtmupd.getTime());
				assetmaster.setUsrCrt(purchaseOrderHdr.getUsrCrt());
				assetmaster.setUsrUpd(purchaseOrderHdr.getUsrUpd());

				assetmaster.setAssetCode(assetcode.toString());
				session.save(assetmaster);

				Stock stock = new Stock();
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
				stock.setDtmCrt(dtmupd.getTime());
				stock.setDtmUpd(dtmupd.getTime());
				stock.setUsrCrt(purchaseOrderHdr.getUsrCrt());
				stock.setUsrUpd(purchaseOrderHdr.getUsrUpd());
				session.save(stock);

				PurchaseOrderDtl purchsaeorderdtl = new PurchaseOrderDtl();
				purchsaeorderdtl = arow;
				purchsaeorderdtl.setPurchaseOrderHdr(purchaseOrderHdr);
				purchsaeorderdtl.setDtmCrt(dtmupd.getTime());
				purchsaeorderdtl.setDtmUpd(dtmupd.getTime());
				session.save(purchsaeorderdtl);
			}

			session.getTransaction().commit();

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	
	@Override
	public List<PurchaseOrderHdr> Paging(int CurrentPage,
			String WhereCond, String SortBy) throws Exception {
		
		// TODO Auto-generated method stub
				StringBuilder hql = new StringBuilder();
				List<PurchaseOrderHdr> list = null;
				try {
					hql.append(strStatement);
					if (WhereCond != "")
						hql.append(WhereCond);

					Query selectQuery = session.createQuery(hql.toString());
					selectQuery.setFirstResult((CurrentPage - 1) * pagesize);
					selectQuery.setMaxResults(pagesize);
					list = selectQuery.list();

				} catch (Exception exp) {

					ExceptionEntities lEntExp = new ExceptionEntities();
					lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
							.getClassName());
					lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
							.getMethodName());
					ExceptionHelper.WriteException(lEntExp, exp);
				}
				return list;
	}

	@Override
	public List<PurchaseOrderHdr> Paging(int CurrentPage,
			String WhereCond, String SortBy, boolean islast) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<PurchaseOrderHdr> list = null;

		try {
			hql.append(strStatement);
			if (WhereCond != "") {
				hql.append(" where ");
				hql.append(WhereCond);
			}
			Query selectQuery = session.createQuery(hql.toString());
			long totalrecord = TotalRecord(WhereCond);
			selectQuery.setFirstResult((int) ((totalrecord - 1) * pagesize));
			selectQuery.setMaxResults(pagesize);
			list = selectQuery.list();

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return list;
	}

	@Override
	public List<PurchaseOrderDtl> viewPurchaseOrderDtls(
			PurchaseOrderHdr purchaseOrderHdr) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<PurchaseOrderDtl> list = null;

		try {
			hql.append("from PurchaseOrderDtl " );
			
			Query selectQuery = session.createQuery(hql.toString());
			
			list = selectQuery.list();

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return list;
	}

	@Override
	public PurchaseOrderHdr viewPurchaseOrderHdr(long id) throws Exception {
		// TODO Auto-generated method stub
		PurchaseOrderHdr purchaseOrderHdr = null;
		try {
			purchaseOrderHdr = (PurchaseOrderHdr) session.get(PurchaseOrderHdr.class, id);

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return purchaseOrderHdr;
	}

}
