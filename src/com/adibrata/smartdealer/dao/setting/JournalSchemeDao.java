/**
 *
 */

package com.adibrata.smartdealer.dao.setting;

/**
 * @author Henry
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaSpecification;
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

public class JournalSchemeDao extends DaoBase implements JournalSchemeService
	{
		String userupd;
		Session session;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar dtmupd = Calendar.getInstance();
		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		
		public JournalSchemeDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from CoaSchmHdr ";
						
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
		 * @see
		 * com.adibrata.smartdealer.service.setting.JournalScheme#SaveAdd(com.adibrata
		 * .smartdealer.service.setting.JournalScheme)
		 */
		@Override
		public void SaveAddHeader(final CoaSchmHdr coaSchmHdr) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						coaSchmHdr.setDtmCrt(this.dtmupd.getTime());
						coaSchmHdr.setDtmUpd(this.dtmupd.getTime());
						this.session.save(coaSchmHdr);
						
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
		 * @see
		 * com.adibrata.smartdealer.service.setting.JournalScheme#SaveEdit(com.adibrata
		 * .smartdealer.service.setting.JournalScheme)
		 */
		@Override
		public void SaveEditHeader(final CoaSchmHdr coaSchmHdr) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						coaSchmHdr.setDtmCrt(this.dtmupd.getTime());
						coaSchmHdr.setDtmUpd(this.dtmupd.getTime());
						this.session.update(coaSchmHdr);
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
		 * @see com.adibrata.smartdealer.service.setting.JournalScheme#SaveDel(com
		 * .adibrata.smartdealer.service.setting.JournalScheme)
		 */
		@Override
		public void SaveDelHeader(final CoaSchmHdr coaSchmHdr) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						coaSchmHdr.setDtmCrt(this.dtmupd.getTime());
						coaSchmHdr.setDtmUpd(this.dtmupd.getTime());
						
						this.session.delete(coaSchmHdr);
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
		 * @see com.adibrata.smartdealer.service.setting.JournalScheme#Paging(int,
		 * java.lang.String, java.lang.String)
		 */
		@SuppressWarnings("unchecked")
		@Override
		public List<CoaSchmHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<CoaSchmHdr> list = null;
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
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
		public CoaSchmHdr ViewHeader(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				CoaSchmHdr coaSchmHdr = null;
				try
					{
						coaSchmHdr = (CoaSchmHdr) this.session.get(CoaSchmHdr.class, id);
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return coaSchmHdr;
			}
		
		@Override
		public void SaveDetail(final CoaSchmHdr coaSchmHdr, final List<ListCoaSchmDtl> lstCoaSchmDtl, final String usrUpd) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				this.session.getTransaction().begin();
				SQLQuery selectQuery;
				try
					{
						
						hql.append("Delete From CoaSchmDtl Where CoaSchmHdrId = :coaschmhdrid ");
						selectQuery = this.session.createSQLQuery(hql.toString());
						selectQuery.setParameter("coaschmhdrid", coaSchmHdr.getId());
						selectQuery.executeUpdate();
						
						if (lstCoaSchmDtl.size() != 0)
							{
								for (final ListCoaSchmDtl arow : lstCoaSchmDtl)
									{
										
										hql.delete(0, hql.length());
										
										hql.append("Insert Into CoaSchmDtl (CoaSchmHdrID, CoaMasterID, CoaCode)" + " Values (:coaschmhdrid, :coamasterid, :coacode) ");
										selectQuery = this.session.createSQLQuery(hql.toString());
										selectQuery.setParameter("coaschmhdrid", coaSchmHdr.getId());
										selectQuery.setParameter("coamasterid", arow.getCoamasterId());
										selectQuery.setParameter("coacode", arow.getCoaCode());
										selectQuery.executeUpdate();
										
										/*
										 * coaSchmDtl.setCoaSchmHdr(coaSchmHdr);
										 * coaSchmDtl.setCoacode(arow.getCoacode());
										 * coamaster.setId(arow.getCoamasterid());
										 * coaSchmDtl.setCoamaster(coamaster);
										 * coaSchmDtl.setUsrUpd(usrUpd);
										 * coaSchmDtl.setUsrCrt(usrUpd);
										 * coaSchmDtl.setDtmCrt(dtmupd.getTime());
										 * coaSchmDtl.setDtmUpd(dtmupd.getTime());
										 * session.merge(coaSchmDtl);
										 */
										
									}
							}
						this.session.getTransaction().rollback();
						
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
		
		@SuppressWarnings("rawtypes")
		@Override
		public List<ListCoaSchmDtl> ListCoaSchmDtl(final CoaSchmHdr coaSchmHdr) throws Exception
			{
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				
				final List<ListCoaSchmDtl> lstCoaSchmDtl = new ArrayList<ListCoaSchmDtl>();
				SQLQuery selectQuery;
				try
					{
						
						hql.append("Select Id, CoaName, CoaDescription, " + "IsNull((Select CoaSchmDtl.CoaCode From CoaSchmDtl Inner Join CoaSchmHdr on CoaSchmDtl.CoaSchmHdrID = CoaSchmHdr.ID " + "where CoaSchmDtl.CoaMasterID = CoaMaster.ID and CoaSchmHdr.Id = :coaschmhdrid "
						        + " and CoaSchmHdr.PartnerCode = :partnercode),'0') as CoaCode " + "from Coamaster " + "where CoaMaster.PartnerCode = :partnercode and IsScheme = 1 and IsActive = 1 ");
						
						selectQuery = this.session.createSQLQuery(hql.toString());
						selectQuery.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
						selectQuery.setParameter("partnercode", coaSchmHdr.getPartner().getPartnerCode());
						selectQuery.setParameter("coaschmhdrid", coaSchmHdr.getId());
						selectQuery.addScalar("Id", new LongType());
						selectQuery.addScalar("CoaName", new StringType());
						selectQuery.addScalar("CoaDescription", new StringType());
						selectQuery.addScalar("CoaCode", new StringType());
						selectQuery.setCacheable(true);
						
						final List list = selectQuery.list();
						if (list.size() != 0)
							{
								for (final Object object : list)
									{
										final Map row = (Map) object;
										final ListCoaSchmDtl listCoaSchmDtl = new ListCoaSchmDtl();
										listCoaSchmDtl.setCoamasterId((long) row.get("Id"));
										
										listCoaSchmDtl.setCoaName(row.get("CoaName").toString());
										listCoaSchmDtl.setCoaDesc(row.get("CoaDescription").toString());
										listCoaSchmDtl.setCoaCode(row.get("CoaCode").toString());
										lstCoaSchmDtl.add(listCoaSchmDtl);
										System.out.print((long) row.get("Id"));
									}
							}
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return lstCoaSchmDtl;
			}
		
		@Override
		public List<CoaSchmDtl> ViewDetail(final CoaSchmHdr coaSchmHdr) throws Exception
			{
				// TODO Auto-generated method stub
				return null;
			}
		
		@SuppressWarnings("unchecked")
		@Override
		public List<CoaSchmHdr> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<CoaSchmHdr> list = null;
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
						
						final Query selectQuery = this.session.createQuery(hql.toString());
						final long totalrecord = this.TotalRecord(WhereCond);
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
		
	}
