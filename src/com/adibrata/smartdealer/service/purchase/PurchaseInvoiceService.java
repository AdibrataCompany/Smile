package com.adibrata.smartdealer.service.purchase;

import java.util.List;

import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.PurchaseInvoice;
import com.adibrata.smartdealer.model.PurchaseOrderHdr;
import com.adibrata.smartdealer.model.SalesOrderHdr;
import com.adibrata.smartdealer.service.SeviceBase;

public interface PurchaseInvoiceService  extends SeviceBase {
	public void Save(String usrupd, PurchaseInvoice purchaseInvoice) throws Exception;

	
	public SalesOrderHdr viewSalesOrderHdr (Long id)throws Exception;

	public PurchaseInvoice View(Long id)throws Exception;


}
