/**
 * 
 */
package com.adibrata.smartdealer.service.cashtransactions;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
/**
 * @author Henry
 *
 */
public interface AdvanceCashService  extends SeviceBase {
	public void Save (String usrupd, AdvanceCash advancecash)throws Exception;
	public List<AdvanceCash>  Paging(int CurrentPage, String WhereCond, String SortBy)throws Exception;
	public List<AdvanceCash>  Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast)throws Exception;
	
	public AdvanceCash View(long id) throws Exception;
}
