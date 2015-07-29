/**
 *
 */

package com.adibrata.smartdealer.service;

import java.util.List;

import com.adibrata.smartdealer.model.AgreementList;

/**
 * @author Henry
 */
public interface SeviceBase
	{
		public long TotalRecord(String statement, String wherecond) throws Exception;

		public int getCurrentpage() throws Exception;

		public List<AgreementList> AgreementPaging(final int CurrentPage, final String WhereCond, final String SortBy) throws Exception;

		public List<AgreementList> AgreementPaging(final int CurrentPage, final String WhereCond, final String SortBy, final boolean islast) throws Exception;
	}
