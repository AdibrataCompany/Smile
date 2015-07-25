/**
 * 
 */
package com.adibrata.smartdealer.service;

/**
 * @author Henry
 *
 */
public interface SeviceBase {
	public long TotalRecord(String statement, String wherecond)
			throws Exception;

	public int getCurrentpage() throws Exception;
}
