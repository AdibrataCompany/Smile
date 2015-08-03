/**
 *
 */

package com.adibrata.smartdealer.dao.usermanagement;

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
import com.adibrata.smartdealer.model.MsUser;
import com.adibrata.smartdealer.model.ResetPasswordLog;
import com.adibrata.smartdealer.service.usermanagement.UserService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.encryption.EncryptionHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class UserRegisterDao extends DaoBase implements UserService
	{
		String userupd;
		Session session;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar dtmupd = Calendar.getInstance();
		String strStatement;
		StringBuilder hql = new StringBuilder();
		int pagesize;
		private long totalrecord;
		private int currentpage;
		
		public UserRegisterDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.session = HibernateHelper.getSessionFactory().openSession();
						this.pagesize = HibernateHelper.getPagesize();
						this.strStatement = " from MsUser ";
						
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
		 * com.adibrata.smartdealer.service.usermanagement.UserRegisterService#SaveAdd
		 * (com.adibrata.smartdealer.model.MsUser)
		 */
		@Override
		public void SaveAdd(final MsUser msUser) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						msUser.setDtmCrt(this.dtmupd.getTime());
						msUser.setDtmUpd(this.dtmupd.getTime());
						msUser.setIsActive((short) 1);
						msUser.setPassword(EncryptionHelper.EncryptSHA(msUser.getPassword()));
						this.session.save(msUser);
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
		 * com.adibrata.smartdealer.service.usermanagement.UserRegisterService#SaveEdit
		 * (com.adibrata.smartdealer.model.MsUser)
		 */
		@Override
		public void SaveEdit(final MsUser msUser) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						
						msUser.setDtmUpd(this.dtmupd.getTime());
						msUser.setPassword(EncryptionHelper.EncryptSHA(msUser.getPassword()));
						this.session.update(msUser);
						
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
		 * @see com.adibrata.smartdealer.service.usermanagement.UserRegisterService#
		 * SaveDel(com.adibrata.smartdealer.model.MsUser)
		 */
		@Override
		public void SaveDel(final MsUser msUser) throws Exception
			{
				// TODO Auto-generated method stub
				this.session.getTransaction().begin();
				try
					{
						
						this.session.delete(msUser);
						
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
		 * com.adibrata.smartdealer.service.usermanagement.UserRegisterService#Paging
		 * (int, java.lang.String, java.lang.String)
		 */
		@Override
		public List<MsUser> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<MsUser> list = null;
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
			
		/*
		 * (non-Javadoc)
		 * @see com.adibrata.smartdealer.service.usermanagement.UserService#ResetPassword(com.adibrata.smartdealer.model.MsUser)
		 */
		@Override
		public void ResetPassword(final MsUser msUser) throws Exception
			{
				// TODO Auto-generated method stub
				final ResetPasswordLog resetpasswordlog = new ResetPasswordLog();
				
				this.session.getTransaction().begin();
				try
					{
						
						msUser.setDtmUpd(this.dtmupd.getTime());
						resetpasswordlog.setDtmCrt(this.dtmupd.getTime());
						resetpasswordlog.setDtmUpd(this.dtmupd.getTime());
						msUser.setPassword(EncryptionHelper.EncryptSHA("Password"));
						this.session.update(msUser);
						
						resetpasswordlog.setPartner(msUser.getPartner());
						resetpasswordlog.setUserName(msUser.getUserName());
						resetpasswordlog.setResetPasswordTime(this.dtmupd.getTime());
						resetpasswordlog.setResetBy("Admin");
						resetpasswordlog.setUsrUpd(msUser.getUsrUpd());
						resetpasswordlog.setUsrCrt(msUser.getUsrCrt());
						
						this.session.save(resetpasswordlog);
						
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
		public MsUser View(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				MsUser msUser = null;
				try
					{
						msUser = (MsUser) this.session.get(MsUser.class, id);
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return msUser;
			}
			
		@Override
		public List<MsUser> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<MsUser> list = null;
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" where ");
								hql.append(WhereCond);
							}
							
						final Query selectQuery = this.session.createQuery(hql.toString());
						this.totalrecord = this.TotalRecord(hql.toString(), WhereCond);
						this.currentpage = (int) ((this.totalrecord / this.pagesize) + 1);
						
						selectQuery.setFirstResult((this.currentpage - 1) * this.pagesize);
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
