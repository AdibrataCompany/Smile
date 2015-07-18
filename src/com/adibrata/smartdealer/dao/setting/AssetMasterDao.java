/**
 * 
 */
package com.adibrata.smartdealer.dao.setting;

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
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.setting.AssetMasterService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;
public class AssetMasterDao extends DaoBase implements AssetMasterService{
	String userupd; 
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	
	public AssetMasterDao() throws Exception{
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from AssetMaster ";

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

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.AssetMaster#Save(com.adibrata.smartdealer.service.setting.AssetMaster)
	 */
	

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.AssetMaster#Paging(int, java.lang.String, java.lang.String)
	 */
	@Override
	public List<AssetMaster> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception{

		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<AssetMaster> list = null;
		try {
			hql.append(strStatement);
			if (WhereCond != "") {
				hql.append(" where ");
				hql.append(WhereCond);
			}
			
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
	public List<AssetMaster> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception{
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<AssetMaster> list = null;
		try {
			hql.append(strStatement);
			if (WhereCond != "") {
				hql.append(" where ");
				hql.append(WhereCond);
			}
			
			Query selectQuery = session.createQuery(hql.toString());
			long totalrecord = TotalRecord (WhereCond);
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

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.AssetMaster#SaveAdd(com.adibrata.smartdealer.service.setting.AssetMaster)
	 */
	@Override
	public void SaveAdd(AssetMaster assetMaster) throws Exception{
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			assetMaster.setDtmCrt(dtmupd.getTime());
			assetMaster.setDtmUpd(dtmupd.getTime());
			session.save(assetMaster);
			
			session.getTransaction().commit();

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.AssetMaster#SaveEdit(com.adibrata.smartdealer.service.setting.AssetMaster)
	 */
	@Override
	public void SaveEdit(AssetMaster assetMaster) throws Exception{
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			
			assetMaster.setDtmUpd(dtmupd.getTime());
			session.update(assetMaster);
			
			session.getTransaction().commit();

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.AssetMaster#SaveDel(com.adibrata.smartdealer.service.setting.AssetMaster)
	 */
	@Override
	public void SaveDel(AssetMaster assetMaster) throws Exception{
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			session.delete(assetMaster);
			
			session.getTransaction().commit();

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	
	@Override
	public AssetMaster View(long id) throws Exception{
		// TODO Auto-generated method stub
		AssetMaster assetmaster = null;
		try {
			assetmaster =  (AssetMaster) session.get(AssetMaster.class, id);
			
		} catch (Exception exp) {
			
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return assetmaster;
	}

	

}
