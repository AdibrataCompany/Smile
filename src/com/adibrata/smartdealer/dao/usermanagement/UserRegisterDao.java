/**
 * 
 */
package com.adibrata.smartdealer.dao.usermanagement;

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

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.encryption.EncryptionHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.usermanagement.UserService;

public class UserRegisterDao extends DaoBase implements UserService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	private long totalrecord;
	private int currentpage;
	public UserRegisterDao() throws Exception {
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from MsUser ";

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
	 * com.adibrata.smartdealer.service.usermanagement.UserRegisterService#SaveAdd
	 * (com.adibrata.smartdealer.model.MsUser)
	 */
	@Override
	public void SaveAdd(MsUser msUser) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			msUser.setDtmCrt(dtmupd.getTime());
			msUser.setDtmUpd(dtmupd.getTime());
			msUser.setIsActive((short) 1);
			msUser.setPassword(EncryptionHelper.EncryptSHA(msUser.getPassword()));
			session.save(msUser);
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
	 * com.adibrata.smartdealer.service.usermanagement.UserRegisterService#SaveEdit
	 * (com.adibrata.smartdealer.model.MsUser)
	 */
	@Override
	public void SaveEdit(MsUser msUser) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			msUser.setDtmUpd(dtmupd.getTime());
			msUser.setPassword(EncryptionHelper.EncryptSHA(msUser.getPassword()));
			session.update(msUser);

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
	 * @see com.adibrata.smartdealer.service.usermanagement.UserRegisterService#
	 * SaveDel(com.adibrata.smartdealer.model.MsUser)
	 */
	@Override
	public void SaveDel(MsUser msUser) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			session.delete(msUser);

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
	 * com.adibrata.smartdealer.service.usermanagement.UserRegisterService#Paging
	 * (int, java.lang.String, java.lang.String)
	 */
	@Override
	public List<MsUser> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<MsUser> list = null;
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

	public boolean PasswordVerification(MsUser msUser) throws Exception {
		boolean isValid = false;

		String unVerifiedPassowrd = EncryptionHelper.EncryptSHA(msUser
				.getPassword());
		StringBuilder hqluser = new StringBuilder();
		hqluser.append(" from MsUser  "
				+ " Where PartnerCode = :partnercode and "
				+ " UserName = :username and isActive = 1 ");
		Query qryuser = session.createQuery(hqluser.toString());

		qryuser.setParameter("partnercode",
				msUser.getPartner().getPartnerCode()).setParameter("username",
				msUser.getUserName());
		List<MsUser> lstuser = (List<MsUser>) qryuser.list();

		for (MsUser userrow : lstuser) {

			if (userrow.getPassword().equals(unVerifiedPassowrd)) {
				isValid = true;
			} else {
				isValid = false;
			}

		}
		return isValid;
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.usermanagement.UserService#ResetPassword(com.adibrata.smartdealer.model.MsUser)
	 */
	@Override
	public void ResetPassword(MsUser msUser) throws Exception {
		// TODO Auto-generated method stub
		ResetPasswordLog resetpasswordlog =new ResetPasswordLog();
		
		session.getTransaction().begin();
		try {

			msUser.setDtmUpd(dtmupd.getTime());
			resetpasswordlog.setDtmCrt(dtmupd.getTime());
			resetpasswordlog.setDtmUpd(dtmupd.getTime());
			msUser.setPassword(EncryptionHelper.EncryptSHA("Password"));
			session.update(msUser);
	
			resetpasswordlog.setPartner(msUser.getPartner());
			resetpasswordlog.setUserName(msUser.getUserName());
			resetpasswordlog.setResetPasswordTime(dtmupd.getTime());
			resetpasswordlog.setResetBy("Admin");
			resetpasswordlog.setUsrUpd(msUser.getUsrUpd());
			resetpasswordlog.setUsrCrt(msUser.getUsrCrt());
			
			session.save(resetpasswordlog);
			
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
	public MsUser View(long id) throws Exception {
		// TODO Auto-generated method stub
		MsUser msUser = null;
		try {
			msUser =  (MsUser) session.get(MsUser.class, id);
			
		} catch (Exception exp) {
			
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return msUser;
	}

	@Override
	public List<MsUser> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception {
		// TODO Auto-generated method stub
				StringBuilder hql = new StringBuilder();
				List<MsUser> list = null;
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
