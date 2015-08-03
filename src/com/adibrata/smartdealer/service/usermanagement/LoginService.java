/**
 * LoginService.java
 */

package com.adibrata.smartdealer.service.usermanagement;

import com.adibrata.smartdealer.model.Partner;

/**
 * @author Henry
 */
public interface LoginService
	{
		public Boolean PasswordVerification(final String username, final String password) throws Exception;

		public Partner getPartner();
		
	}
