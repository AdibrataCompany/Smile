/**
 * 
 */
package com.adibrata.smartdealer.dao.setting;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.setting.DealerService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

/**
 * @author Henry
 *
 */
public class DealerDao extends DaoBase implements DealerService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	private int currentpage;
	private long totalrecord;

	/**
	 * 
	 */
	public DealerDao() throws Exception{
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
	 * @see
	 * com.adibrata.smartdealer.service.setting.DealerService#SaveAdd(com.adibrata
	 * .smartdealer.model.Supplier)
	 */
	@Override
	public void SaveAdd(Supplier supplier)throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		StringBuilder fulladdress = new StringBuilder();

		try {
			fulladdress.append(supplier.getAddress());
			fulladdress.append(" RT/RW: ");
			fulladdress.append(supplier.getRt());
			fulladdress.append("/");
			fulladdress.append(supplier.getRw());
			fulladdress.append(" Kelurahan: ");
			fulladdress.append(supplier.getKelurahan());
			fulladdress.append(" Kecamatan: ");
			fulladdress.append(supplier.getKecamatan());
			fulladdress.append(" ");
			fulladdress.append(supplier.getCity());
			fulladdress.append(" ");
			fulladdress.append(supplier.getZipcode());
			fulladdress.append(" ");

			supplier.setFullAddress(fulladdress.toString());
			supplier.setDtmCrt(dtmupd.getTime());
			supplier.setDtmUpd(dtmupd.getTime());
			session.save(supplier);

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.setting.DealerService#SaveEdit(com.adibrata
	 * .smartdealer.model.Supplier)
	 */
	@Override
	public void SaveEdit(Supplier supplier) throws Exception{
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		StringBuilder fulladdress = new StringBuilder();

		try {
			fulladdress.append(supplier.getAddress());
			fulladdress.append(" RT/RW: ");
			fulladdress.append(supplier.getRt());
			fulladdress.append("/");
			fulladdress.append(supplier.getRw());
			fulladdress.append(" Kelurahan: ");
			fulladdress.append(supplier.getKelurahan());
			fulladdress.append(" Kecamatan: ");
			fulladdress.append(supplier.getKecamatan());
			fulladdress.append(" ");
			fulladdress.append(supplier.getCity());
			fulladdress.append(" ");
			fulladdress.append(supplier.getZipcode());
			fulladdress.append(" ");

			supplier.setFullAddress(fulladdress.toString());

			supplier.setDtmUpd(dtmupd.getTime());
			session.update(supplier);

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.setting.DealerService#SaveDel(com.adibrata
	 * .smartdealer.model.Supplier)
	 */

	@Override
	public void SaveDel(Supplier supplier)throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			session.delete(supplier);

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adibrata.smartdealer.service.setting.DealerService#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List<Supplier> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception{
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<Supplier> list = null;
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
	public Supplier View(long id)throws Exception {
		// TODO Auto-generated method stub
		Supplier supplier = null;
		try {
			supplier = (Supplier) session.get(Supplier.class, id);

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return supplier;
	}

	@Override
	public List<Supplier> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception{
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<Supplier> list = null;

		try {
			hql.append(strStatement);
			if (WhereCond != "") {
				hql.append(" where ");
				hql.append(WhereCond);
			}
			Query selectQuery = session.createQuery(hql.toString());
			this.totalrecord = TotalRecord(hql.toString(), WhereCond);
			this.currentpage = (int) ((this.totalrecord / pagesize) + 1);

			selectQuery.setFirstResult((this.currentpage - 1) * pagesize);
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
	public int getCurrentpage() {
		return currentpage;
	}

	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}

}
