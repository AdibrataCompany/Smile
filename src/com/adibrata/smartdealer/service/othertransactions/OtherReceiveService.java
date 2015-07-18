/**
 * 
 */
package com.adibrata.smartdealer.service.othertransactions;

/**
 * @author Henry
 *
 */

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

public interface OtherReceiveService extends SeviceBase {
	public void Save(String usrupd, OtherRcvHdr otherRcvHdr,
			List<OtherRcvDtl> otherRcvDtl) throws Exception;

	public List<OtherRcvHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<OtherRcvHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

}
