/**
 *
 */

package com.adibrata.smartdealer.service.accmaint.pdcmaint;

import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 */
public interface PDCReceiveService extends SeviceBase
	{
		public void SavePDC(PdcHdr hdr, List<PdcDtl> dtl) throws Exception;
		
	}
