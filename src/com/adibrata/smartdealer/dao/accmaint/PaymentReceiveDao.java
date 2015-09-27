/**
 * PaymentReceiveDao.java
 */

package com.adibrata.smartdealer.dao.accmaint;

import java.util.Date;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.AgreementList;
import com.adibrata.smartdealer.model.Agrmnt;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PaymentInfo;
import com.adibrata.smartdealer.model.PaymentReceive;
import com.adibrata.smartdealer.service.accmaint.PaymentReceiveService;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.ArInfo;
import util.adibrata.support.job.JobPost;
import util.adibrata.support.payhist.Header;

/**
 * @author Henry
 */
public class PaymentReceiveDao extends DaoBase implements PaymentReceiveService
	{
		
		String userupd;
		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		String strCountStatement;
		
		/**
		*
		*/
		public PaymentReceiveDao() throws Exception
			{
				// TODO Auto-generated constructor stub

				this.strStatement = "Select Agrmnt.id as AgrmntId, Agrmnt.AgrmntCode, Customer.Name as CustomerName, Customer.FullAddress as Address,	" + "Currency.Code as Currency from agrmnt "
				        + "inner join customer on agrmnt.CustomerId = customer.id " + "inner join currency on agrmnt.CurrencyID = currency.id ";
				this.strCountStatement = "Select Count(1) as total from agrmnt " + "inner join customer on agrmnt.CustomerId = customer.id " + "inner join currency on agrmnt.CurrencyID = currency.id ";
			}

		@Override
		public PaymentInfo PaymentAllocation(final Long AgrmntId, final double amountreceive, final Date valuedate) throws Exception
			{
				PaymentInfo info = new PaymentInfo();
				// TODO Auto-generated method stub
				try
					{

						final ArInfo arinfo = new ArInfo();
						final Agrmnt agrmnt = new Agrmnt();
						agrmnt.setId(AgrmntId);
						info = arinfo.PaymentAllocation(agrmnt, valuedate, amountreceive);
					}
				catch (final Exception exp)
					{
						this.getSession().getTransaction().rollback();
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return info;
			}
			
		@Override
		public void PaymentReceiveSave(final String usrupd, final PaymentReceive paymentreceive) throws Exception
			{
				this.getSession().getTransaction().begin();
				final Header header = new Header();
				Partner partner = new Partner();
				Office office = new Office();
				partner = paymentreceive.getAgrmnt().getPartner();
				Long jobid;
				office = paymentreceive.getAgrmnt().getOffice();
				try
					{
						jobid = JobPost
						        .JobSave(this.getSession(), partner.getPartnerCode(), office.getId(), JobPost.JobCode.paymentreceive, paymentreceive.getAgrmnt().getCoaSchmCode(), paymentreceive.getValueDate(), paymentreceive.getPostingDate(), usrupd)
						        .getId();
						paymentreceive.setPayHistSeqNo(header.SavePayHistHeader(usrupd, paymentreceive));
						paymentreceive.setJobId(jobid);
						paymentreceive.setDtmUpd(this.dtmupd);
						paymentreceive.setDtmCrt(this.dtmupd);
						
						this.getSession().save(paymentreceive);
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
			
		@SuppressWarnings("unchecked")
		@Override
		public List<AgreementList> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder sql = new StringBuilder();
				List<AgreementList> list = null;
				final SQLQuery selectQuery;
				try
					{
						this.hql.append(this.strStatement);
						if (!WhereCond.equals(""))
							{
								this.hql.append(" where ");
								this.hql.append(WhereCond);
							}
						selectQuery = this.getSession().createSQLQuery(sql.toString());
						selectQuery.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
						selectQuery.setCacheable(true);
						selectQuery.setFirstResult((CurrentPage - 1) * this.pagesize);
						selectQuery.setMaxResults(this.pagesize);
						selectQuery.setCacheRegion("ListAgrmntId" + WhereCond);
						selectQuery.addScalar("AgrmntId", new LongType());
						selectQuery.addScalar("AgrmntCode", new StringType());
						selectQuery.addScalar("CustomerName", new StringType());
						selectQuery.addScalar("Address", new StringType());
						selectQuery.addScalar("Currency", new StringType());

						list = selectQuery.list();
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				finally
					{
						sql.setLength(0);
					}
				return list;
			}
			
		@SuppressWarnings("unchecked")
		@Override
		public List<AgreementList> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				final StringBuilder sql = new StringBuilder();
				final StringBuilder sqlcount = new StringBuilder();
				
				List<AgreementList> list = null;
				SQLQuery selectQuery;
				SQLQuery selectQueryCount;
				
				Long totalrecord;
				int currentpage;
				try
					{
						sql.append(this.strStatement);
						if (!WhereCond.equals(""))
							{
								sql.append(" where ");
								sql.append(WhereCond);
							}

						sqlcount.append(this.strCountStatement);
						if (!WhereCond.equals(""))
							{
								sqlcount.append(" where ");
								sqlcount.append(WhereCond);
							}

						selectQueryCount = this.getSession().createSQLQuery(sqlcount.toString());
						selectQueryCount.setCacheable(true);
						selectQueryCount.setCacheRegion("CountListAgrmnt" + WhereCond);
						totalrecord = (Long) selectQueryCount.uniqueResult();
						
						selectQuery = this.getSession().createSQLQuery(sql.toString());
						selectQuery.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
						selectQuery.setCacheable(true);
						currentpage = (int) ((totalrecord / this.pagesize) + 1);
						selectQuery.setFirstResult((currentpage - 1) * this.pagesize);
						selectQuery.setMaxResults(this.pagesize);
						selectQuery.setCacheRegion("ListAgrmnt" + WhereCond);
						selectQuery.addScalar("AgrmntId", new LongType());
						selectQuery.addScalar("AgrmntCode", new StringType());
						selectQuery.addScalar("CustomerName", new StringType());
						selectQuery.addScalar("Address", new StringType());
						selectQuery.addScalar("Currency", new StringType());
						
						list = selectQuery.list();

					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				finally
					{
						this.hql.setLength(0);
					}
				return list;
			}

	}
