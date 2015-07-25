/**
 *
 */

package com.adibrata.smartdealer.service.accmaint;

import com.adibrata.smartdealer.model.SuspendAllocation;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 */
public interface SuspendAllocationService extends SeviceBase
	{

		public void SuspendAllocationSave(String usrupd, SuspendAllocation allocation) throws Exception;
		
	}
