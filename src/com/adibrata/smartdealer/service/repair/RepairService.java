/**
 * 
 */
package com.adibrata.smartdealer.service.repair;

import java.util.List;

import com.adibrata.smartdealer.model.ServiceDtl;
import com.adibrata.smartdealer.model.ServiceHdr;
import com.adibrata.smartdealer.model.ServiceItem;
import com.adibrata.smartdealer.model.Workshop;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry Setiap perbaikan menyimpan account payable untuk ditagih
 *
 */
public interface RepairService extends SeviceBase {
	public List<ServiceHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<Workshop> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public void Save(String usrupd, ServiceHdr serviceHdr,
			List<ServiceDtl> lstserviceDtls, List<ServiceItem> lstServiceItem)
					throws Exception;

	public ServiceHdr View(Long id) throws Exception;
}
