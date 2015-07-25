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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.CoaSchmDtl;
import com.adibrata.smartdealer.model.CoaSchmHdr;
import com.adibrata.smartdealer.model.ListCoaSchmDtl;
import com.adibrata.smartdealer.service.setting.JournalSchemeService;

public class JournalSchemeDao extends DaoBase implements JournalSchemeService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	private long totalrecord;
	private int currentpage;

	public JournalSchemeDao() throws Exception {
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from CoaSchmHdr ";

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
	 * com.adibrata.smartdealer.service.setting.JournalScheme#SaveAdd(com.adibrata
	 * .smartdealer.service.setting.JournalScheme)
	 */
	@Override
	public void SaveAddHeader(CoaSchmHdr coaSchmHdr) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			coaSchmHdr.setDtmCrt(dtmupd.getTime());
			coaSchmHdr.setDtmUpd(dtmupd.getTime());
			session.save(coaSchmHdr);

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
	 * com.adibrata.smartdealer.service.setting.JournalScheme#SaveEdit(com.adibrata
	 * .smartdealer.service.setting.JournalScheme)
	 */
	@Override
	public void SaveEditHeader(CoaSchmHdr coaSchmHdr) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			coaSchmHdr.setDtmCrt(dtmupd.getTime());
			coaSchmHdr.setDtmUpd(dtmupd.getTime());
			session.update(coaSchmHdr);
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
	 * @see com.adibrata.smartdealer.service.setting.JournalScheme#SaveDel(com
	 * .adibrata.smartdealer.service.setting.JournalScheme)
	 */
	@Override
	public void SaveDelHeader(CoaSchmHdr coaSchmHdr) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			coaSchmHdr.setDtmCrt(dtmupd.getTime());
			coaSchmHdr.setDtmUpd(dtmupd.getTime());

			session.delete(coaSchmHdr);
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
	 * @see com.adibrata.smartdealer.service.setting.JournalScheme#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CoaSchmHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<CoaSchmHdr> list = null;
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
	public CoaSchmHdr ViewHeader(long id) throws Exception {
		// TODO Auto-generated method stub
		CoaSchmHdr coaSchmHdr = null;
		try {
			coaSchmHdr = (CoaSchmHdr) session.get(CoaSchmHdr.class, id);

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return coaSchmHdr;
	}

	@Override
	public void SaveDetail(CoaSchmHdr coaSchmHdr,
			List<ListCoaSchmDtl> lstCoaSchmDtl, String usrUpd) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		session.getTransaction().begin();
		SQLQuery selectQuery;
		try {

			hql.append("Delete From CoaSchmDtl Where CoaSchmHdrId = :coaschmhdrid ");
			selectQuery = session.createSQLQuery(hql.toString());
			selectQuery.setParameter("coaschmhdrid", coaSchmHdr.getId());
			selectQuery.executeUpdate();

			if (lstCoaSchmDtl.size() != 0) {
				for (ListCoaSchmDtl arow : lstCoaSchmDtl) {

					hql.delete(0, hql.length());

					hql.append("Insert Into CoaSchmDtl (CoaSchmHdrID, CoaMasterID, CoaCode)"
							+ " Values (:coaschmhdrid, :coamasterid, :coacode) ");
					selectQuery = session.createSQLQuery(hql.toString());
					selectQuery
							.setParameter("coaschmhdrid", coaSchmHdr.getId());
					selectQuery.setParameter("coamasterid",
							arow.getCoamasterid());
					selectQuery.setParameter("coacode", arow.getCoacode());
					selectQuery.executeUpdate();

				}
			}
			session.getTransaction().rollback();

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

	@SuppressWarnings({ "rawtypes" })
	@Override
	public List<ListCoaSchmDtl> ListCoaSchmDtl(CoaSchmHdr coaSchmHdr)
			throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();

		List<ListCoaSchmDtl> lstCoaSchmDtl = new ArrayList<ListCoaSchmDtl>();
		SQLQuery selectQuery;
		try {

			hql.append("Select Id, CoaName, CoaDescription, "
					+ "IsNull((Select CoaSchmDtl.CoaCode From CoaSchmDtl Inner Join CoaSchmHdr on CoaSchmDtl.CoaSchmHdrID = CoaSchmHdr.ID "
					+ "where CoaSchmDtl.CoaMasterID = CoaMaster.ID and CoaSchmHdr.Id = :coaschmhdrid "
					+ " and CoaSchmHdr.PartnerCode = :partnercode),'0') as CoaCode "
					+ "from Coamaster "
					+ "where CoaMaster.PartnerCode = :partnercode and IsScheme = 1 and IsActive = 1 ");

			selectQuery = session.createSQLQuery(hql.toString());
			selectQuery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
			selectQuery.setParameter("partnercode", coaSchmHdr.getPartner()
					.getPartnerCode());
			selectQuery.setParameter("coaschmhdrid", coaSchmHdr.getId());
			selectQuery.addScalar("Id", new LongType());
			selectQuery.addScalar("CoaName", new StringType());
			selectQuery.addScalar("CoaDescription", new StringType());
			selectQuery.addScalar("CoaCode", new StringType());

			@SuppressWarnings("unchecked")
			List<CoaSchmHdr> list = selectQuery.list();
			if (list.size() != 0) {
				for (Object object : list) {
					Map row = (Map) object;
					ListCoaSchmDtl listCoaSchmDtl = new ListCoaSchmDtl();
					listCoaSchmDtl.setCoamasterid((long) row.get("Id"));

					listCoaSchmDtl.setCoaname(row.get("CoaName").toString());
					listCoaSchmDtl.setCoadesc(row.get("CoaDescription")
							.toString());
					listCoaSchmDtl.setCoacode(row.get("CoaCode").toString());
					lstCoaSchmDtl.add(listCoaSchmDtl);
					System.out.print((long) row.get("Id"));
				}
			}
		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return lstCoaSchmDtl;
	}

	@Override
	public List<CoaSchmDtl> ViewDetail(CoaSchmHdr coaSchmHdr) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CoaSchmHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<CoaSchmHdr> list = null;
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

}
