/**
 * LoginDao.java
 */

package com.adibrata.smartdealer.dao.usermanagement;

import java.util.List;

import org.hibernate.Query;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.MsUser;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.usermanagement.LoginService;

import util.adibrata.framework.encryption.EncryptionHelper;

/**
 * @author Henry
 */
public class LoginDao extends DaoBase implements LoginService
	{
		
		/**
		 *
		 */

		Partner partner;
		Long userid;

		public LoginDao() throws Exception
			{
				// TODO Auto-generated constructor stub
			}

		@Override
		public Boolean PasswordVerification(final String username, final String password) throws Exception
			{
				Boolean isValid = false;
				
				final String encrypt = EncryptionHelper.EncryptSHA(password);
				final StringBuilder hqluser = new StringBuilder();
				hqluser.append(" from MsUser A, Partner B  Where A.partner = B.partnerCode and A.userName = :username and A.isActive = 1 ");
				final Query qryuser = this.getSession().createQuery(hqluser.toString());
				
				qryuser.setParameter("username", username);
				final List<Object[]> lstuser = qryuser.list();
				MsUser user;
				
				for (final Object[] userrow : lstuser)
					{
						user = (MsUser) userrow[0];
						this.partner = (Partner) userrow[1];
						
						if (user.getPassword().equals(encrypt))
							{
								isValid = true;
							}
						else
							{
								isValid = false;
							}
							
					}
				return isValid;
			}
			
		/**
		 * @return the partner
		 */
		@Override
		public Partner getPartner()
			{
				return this.partner;
			}
			
		/**
		 * @param partner
		 *            the partner to set
		 */
		public void setPartner(final Partner partner)
			{
				this.partner = partner;
			}
			
		/**
		 * @return the userid
		 */
		@Override
		public Long getUserid()
			{
				return this.userid;
			}
			
		/**
		 * @param userid
		 *            the userid to set
		 */
		public void setUserid(final Long userid)
			{
				this.userid = userid;
			}

	}
