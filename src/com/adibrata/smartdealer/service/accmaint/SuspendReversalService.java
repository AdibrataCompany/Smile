/**
 *
 */

package com.adibrata.smartdealer.service.accmaint;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.SuspendReverse;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 */
public interface SuspendReversalService extends SeviceBase
	{
		public void SuspendReversalSave(final String usrupd, final Partner partner, final Office office, final SuspendReverse suspendReverse) throws Exception;
	}
