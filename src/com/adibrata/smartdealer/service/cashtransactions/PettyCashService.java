/**
 * 
 */
package com.adibrata.smartdealer.service.cashtransactions;

import java.util.List;

/**
 * @author Henry
 *
 */
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

public interface PettyCashService extends SeviceBase {
	public void SavePettyCash(String usrupd, PettyCashHdr pettycashhdr,
			List<PettyCashDtl> pettycashdtl) throws Exception;

	public List<PettyCashHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<PettyCashHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public PettyCashHdr View(long id) throws Exception;

	public List<PettyCashDtl> ViewDetail(PettyCashHdr pettyCashHdr)
			throws Exception;

}
