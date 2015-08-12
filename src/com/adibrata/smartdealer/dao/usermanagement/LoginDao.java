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
				hqluser.append(" from MsUser  Where userName = :username and isActive = 1 ");
				final Query qryuser = this.getSession().createQuery(hqluser.toString());

				qryuser.setParameter("username", username);
				final List<MsUser> lstuser = qryuser.list();

				for (final MsUser userrow : lstuser)
					{
						this.setPartner(userrow.getPartner());

						if (userrow.getPassword().equals(encrypt))
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
			
	}
