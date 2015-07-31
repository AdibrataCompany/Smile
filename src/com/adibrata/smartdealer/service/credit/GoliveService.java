/**
 *
 */

package com.adibrata.smartdealer.service.credit;

import com.adibrata.smartdealer.model.GoLive;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 */
public interface GoliveService extends SeviceBase
	{
		public void GoLiveSave(String usrUpd, Partner partner, Office office, GoLive golive) throws Exception;

	}
