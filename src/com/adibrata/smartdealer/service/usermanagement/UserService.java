/**
 *
 */

package com.adibrata.smartdealer.service.usermanagement;

import java.util.List;

import com.adibrata.smartdealer.model.MsUser;
import com.adibrata.smartdealer.model.UserList;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 */
public interface UserService extends SeviceBase
	{
		public void SaveAdd(MsUser msUser) throws Exception;
		
		public void SaveEdit(MsUser msUser) throws Exception;
		
		public void SaveDel(MsUser msUser) throws Exception;
		
		public List<UserList> Paging(int CurrentPage, String WhereCond, String SortBy) throws Exception;
		
		public List<UserList> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast) throws Exception;
		
		public void ResetPassword(MsUser msUser) throws Exception;
		
		public MsUser View(Long id) throws Exception;
	}
