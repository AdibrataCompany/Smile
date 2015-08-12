/**
 *
 */

package com.adibrata.smartdealer.dao.usermanagement;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.Employee;
import com.adibrata.smartdealer.model.MsUser;
import com.adibrata.smartdealer.model.ResetPasswordLog;
import com.adibrata.smartdealer.model.UserList;
import com.adibrata.smartdealer.service.usermanagement.UserService;

import util.adibrata.framework.encryption.EncryptionHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class UserRegisterDao extends DaoBase implements UserService
	{
		String userupd;
		
		String strStatement;
		StringBuilder hql = new StringBuilder();
		private long totalrecord;
		private int currentpage;
		
		public UserRegisterDao() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.strStatement = "from MsUser A, Employee B, Partner C where A.employeeId = B.id and A.partner = C.partnerCode ";
						
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
		 * com.adibrata.smartdealer.service.usermanagement.UserRegisterService#SaveAdd
		 * (com.adibrata.smartdealer.model.MsUser)
		 */
		@Override
		public void SaveAdd(final MsUser msUser) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						msUser.setDtmCrt(this.dtmupd);
						msUser.setDtmUpd(this.dtmupd);
						msUser.setIsActive((short) 1);
						msUser.setPassword(EncryptionHelper.EncryptSHA(msUser.getPassword()));
						this.getSession().save(msUser);
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
		 * com.adibrata.smartdealer.service.usermanagement.UserRegisterService#SaveEdit
		 * (com.adibrata.smartdealer.model.MsUser)
		 */
		@Override
		public void SaveEdit(final MsUser msUser) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						
						msUser.setDtmUpd(this.dtmupd);
						msUser.setPassword(EncryptionHelper.EncryptSHA(msUser.getPassword()));
						this.getSession().update(msUser);
						
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
		 * @see com.adibrata.smartdealer.service.usermanagement.UserRegisterService#
		 * SaveDel(com.adibrata.smartdealer.model.MsUser)
		 */
		@Override
		public void SaveDel(final MsUser msUser) throws Exception
			{
				// TODO Auto-generated method stub
				this.getSession().getTransaction().begin();
				try
					{
						
						this.getSession().delete(msUser);
						
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
		 * @see com.adibrata.smartdealer.service.usermanagement.UserService#ResetPassword(com.adibrata.smartdealer.model.MsUser)
		 */
		@Override
		public void ResetPassword(final MsUser msUser) throws Exception
			{
				// TODO Auto-generated method stub
				final ResetPasswordLog resetpasswordlog = new ResetPasswordLog();
				
				this.getSession().getTransaction().begin();
				try
					{
						
						msUser.setDtmUpd(this.dtmupd);
						resetpasswordlog.setDtmCrt(this.dtmupd);
						resetpasswordlog.setDtmUpd(this.dtmupd);
						msUser.setPassword(EncryptionHelper.EncryptSHA("Password"));
						this.getSession().update(msUser);
						
						resetpasswordlog.setPartner(msUser.getPartner());
						resetpasswordlog.setUserName(msUser.getUserName());
						resetpasswordlog.setResetPasswordTime(this.dtmupd);
						resetpasswordlog.setResetBy("Admin");
						resetpasswordlog.setUsrUpd(msUser.getUsrUpd());
						resetpasswordlog.setUsrCrt(msUser.getUsrCrt());
						
						this.getSession().save(resetpasswordlog);
						
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
			
		@Override
		public MsUser View(final long id) throws Exception
			{
				// TODO Auto-generated method stub
				MsUser msUser = null;
				try
					{
						msUser = (MsUser) this.getSession().get(MsUser.class, id);
						
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

		@SuppressWarnings("unchecked")
		@Override
		public List<UserList> Paging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception
			{

				// TODO Auto-generated method stub
				final StringBuilder hql = new StringBuilder();
				List<UserList> list = null;
				MsUser msuser = new MsUser();
				Employee employee = new Employee();
				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" and ");
								hql.append(WhereCond);
							}

						final Query selectQuery = this.getSession().createQuery(hql.toString());
						selectQuery.setFirstResult((CurrentPage - 1) * this.getPagesize());
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("UserList" + WhereCond);
						selectQuery.setMaxResults(this.getPagesize());

						final List<Object[]> lst = selectQuery.list();
						list = new ArrayList<UserList>();
						if (lst.size() != 0)
							{
								for (final Object[] aRow : lst)
									{
										msuser = (MsUser) aRow[0];
										employee = (Employee) aRow[1];
										
										final UserList userlist = new UserList();
										userlist.setId(msuser.getId());
										userlist.setEmployeeName(employee.getName());
										userlist.setUserName(msuser.getUserName());
										list.add(userlist);
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
				finally
					{
						hql.setLength(0);
					}
				return list;
			}

		@SuppressWarnings("unchecked")
		@Override
		public List<UserList> Paging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception
			{
				final StringBuilder hql = new StringBuilder();
				List<UserList> list = null;

				try
					{
						hql.append(this.strStatement);
						if (WhereCond != "")
							{
								hql.append(" and ");
								hql.append(WhereCond);
							}
						final Query selectQuery = this.getSession().createQuery(hql.toString());
						this.totalrecord = this.TotalRecord(hql.toString(), WhereCond);
						this.currentpage = (int) ((this.totalrecord / this.getPagesize()) + 1);
						selectQuery.setCacheable(true);
						selectQuery.setCacheRegion("UserList" + WhereCond);
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
				finally
					{
						hql.setLength(0);
					}
				return list;
			}

		@Override
		public int getCurrentpage()
			{
				return this.currentpage;
			}

		public void setCurrentpage(final int currentpage)
			{
				this.currentpage = currentpage;
			}
	}
