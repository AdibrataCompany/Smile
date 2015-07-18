/**
 * 
 */
package com.adibrata.smartdealer.service.usermanagement;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */
public interface EmployeeService extends SeviceBase {
	public void SaveAdd(Employee employee) throws Exception;

	public void SaveEdit(Employee employee) throws Exception;

	public void SaveDel(Employee employee) throws Exception;

	public List<Employee> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<Employee> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public Employee View(long id) throws Exception;
}
