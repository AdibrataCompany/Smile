/**
 * AccruedService.java
 */

package com.adibrata.smartdealer.service.eod;

import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 */
public interface AccruedService extends SeviceBase
	{
		public void AccruedOnEom();

		public void AccruedOnEod();

	}
