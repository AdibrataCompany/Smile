/**
 *
 */

package com.adibrata.smartdealer.dao.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.CoaSchmDtl;
import com.adibrata.smartdealer.model.CoaSchmHdr;
import com.adibrata.smartdealer.model.ListCoaSchmDtl;
import com.adibrata.smartdealer.service.setting.JournalSchemeService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class JournalSchemeDao extends DaoBase implements JournalSchemeService
	{
		String userupd;
		String strStatement;
		StringBuilder hql = new StringBuilder();
		private long totalrecord;
		private int currentpage;

		public JournalSchemeDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.strStatement = " from CoaSchmHdr ";

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
		 * com.adibrata.smartdealer.service.setting.JournalScheme#SaveAdd(com.adibrata
		 * .smartdealer.service.setting.JournalScheme)
		 */
		@Override
		public void SaveAddHeader(final CoaSchmHdr coaSchmHdr) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						coaSchmHdr.setDtmCrt(this.dtmupd);
						coaSchmHdr.setDtmUpd(this.dtmupd);
						this.getSession().save(coaSchmHdr);

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
		 * com.adibrata.smartdealer.service.setting.JournalScheme#SaveEdit(com.adibrata
		 * .smartdealer.service.setting.JournalScheme)
		 */
		@Override
		public void SaveEditHeader(final CoaSchmHdr coaSchmHdr) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						coaSchmHdr.setDtmCrt(this.dtmupd);
						coaSchmHdr.setDtmUpd(this.dtmupd);
						this.getSession().update(coaSchmHdr);
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
		 * @see com.adibrata.smartdealer.service.setting.JournalScheme#SaveDel(com
		 * .adibrata.smartdealer.service.setting.JournalScheme)
		 */
		@Override
		public void SaveDelHeader(final CoaSchmHdr coaSchmHdr) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						coaSchmHdr.setDtmCrt(this.dtmupd);
						coaSchmHdr.setDtmUpd(this.dtmupd);

						this.getSession().delete(coaSchmHdr);
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

						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setFirstResult((CurrentPage - 1) * this.getPagesize());
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

		@Override
		public CoaSchmHdr ViewHeader(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				CoaSchmHdr coaSchmHdr = null;
				try
					{
						coaSchmHdr = (CoaSchmHdr) this.getSession().get(CoaSchmHdr.class, id);

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
				this.getSession().getTransaction().begin();
				SQLQuery selectQuery;
				try
					{

						hql.append("Delete From CoaSchmDtl Where CoaSchmHdrId = :coaschmhdrid ");
						selectQuery = this.getSession().createSQLQuery(hql.toString());
						selectQuery.setParameter("coaschmhdrid", coaSchmHdr.getId());
						selectQuery.executeUpdate();

						if (lstCoaSchmDtl.size() != 0)
							{
								for (final ListCoaSchmDtl arow : lstCoaSchmDtl)
									{

										hql.delete(0, hql.length());

										hql.append("Insert Into CoaSchmDtl (CoaSchmHdrID, CoaMasterID, CoaCode)" + " Values (:coaschmhdrid, :coamasterid, :coacode) ");
										selectQuery = this.getSession().createSQLQuery(hql.toString());
										selectQuery.setParameter("coaschmhdrid", coaSchmHdr.getId());
										selectQuery.setParameter("coamasterid", arow.getCoamasterid());
										selectQuery.setParameter("coacode", arow.getCoacode());
										selectQuery.executeUpdate();

									}
							}
						this.getSession().getTransaction().rollback();

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

		@SuppressWarnings(
			{
			        "rawtypes"
			})
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

						hql.append("Select Id, CoaName, CoaDescription, " + "IsNull((Select CoaSchmDtl.CoaCode From CoaSchmDtl Inner Join CoaSchmHdr on CoaSchmDtl.CoaSchmHdrID = CoaSchmHdr.ID "
						        + "where CoaSchmDtl.CoaMasterID = CoaMaster.ID and CoaSchmHdr.Id = :coaschmhdrid " + " and CoaSchmHdr.PartnerCode = :partnercode),'0') as CoaCode " + "from Coamaster "
						        + "where CoaMaster.PartnerCode = :partnercode and IsScheme = 1 and IsActive = 1 ");

						selectQuery = this.getSession().createSQLQuery(hql.toString());
						selectQuery.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
						selectQuery.setParameter("partnercode", coaSchmHdr.getPartner().getPartnerCode());
						selectQuery.setParameter("coaschmhdrid", coaSchmHdr.getId());
						selectQuery.addScalar("Id", new LongType());
						selectQuery.addScalar("CoaName", new StringType());
						selectQuery.addScalar("CoaDescription", new StringType());
						selectQuery.addScalar("CoaCode", new StringType());

						@SuppressWarnings("unchecked")
						final List<CoaSchmHdr> list = selectQuery.list();
						if (list.size() != 0)
							{
								for (final Object object : list)
									{
										final Map row = (Map) object;
										final ListCoaSchmDtl listCoaSchmDtl = new ListCoaSchmDtl();
										listCoaSchmDtl.setCoamasterid((long) row.get("Id"));

										listCoaSchmDtl.setCoaname(row.get("CoaName").toString());
										listCoaSchmDtl.setCoadesc(row.get("CoaDescription").toString());
										listCoaSchmDtl.setCoacode(row.get("CoaCode").toString());
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

						final Query selectQuery = this.getSession().createQuery(hql.toString());
						this.totalrecord = this.TotalRecord(hql.toString(), WhereCond);
						this.currentpage = (int) ((this.totalrecord / this.getPagesize()) + 1);

						selectQuery.setFirstResult((this.currentpage - 1) * this.getPagesize());
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

	}
