/**
 * 
 */
package com.adibrata.smartdealer.service.othertransactions;

import java.util.List;

import com.adibrata.smartdealer.model.OtherDsbDtl;
import com.adibrata.smartdealer.model.OtherDsbHdr;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */
public interface OtherDisburseService extends SeviceBase {

	public void Save(String usrupd, OtherDsbHdr otherDsbHdr,
			List<OtherDsbDtl> otherDsbDtl) throws Exception;

}
