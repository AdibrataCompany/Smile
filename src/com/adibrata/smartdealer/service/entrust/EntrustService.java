/**
 * 
 */
package com.adibrata.smartdealer.service.entrust;

import java.util.List;

import com.adibrata.smartdealer.model.EntrustDtl;
import com.adibrata.smartdealer.model.EntrustHdr;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */

public interface EntrustService extends SeviceBase {
	public List<EntrustHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<EntrustHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public void Save(String usrupd, EntrustHdr entrustHdr,
			List<EntrustDtl> lstentrustDtl) throws Exception;

	public List<EntrustDtl> viewEntrusDtl(EntrustHdr entrustHdr)
			throws Exception;

	public EntrustHdr viewEntrusHdr(Long id) throws Exception;

}
