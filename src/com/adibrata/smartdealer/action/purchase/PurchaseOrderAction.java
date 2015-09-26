
package com.adibrata.smartdealer.action.purchase;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.purchase.PurchaseEntryDao;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.PurchaseOrderDtl;
import com.adibrata.smartdealer.model.PurchaseOrderHdr;
import com.adibrata.smartdealer.model.Supplier;
import com.adibrata.smartdealer.service.purchase.PurchaseOrderService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class PurchaseOrderAction extends BaseAction implements Preparable
	{
		
		/**
		 *
		 */
		
		private static final long serialVersionUID = 1L;
		private Partner partner;
		private Office office;
		private String mode;
		private PurchaseOrderService purchaseOrderService;
		
		private List<Supplier> lstSupplier;
		private List<PurchaseOrderHdr> lstPurchaseOrderHdr;
		private List<PurchaseOrderDtl> lstPurchaseOrderDtl;
		private PurchaseOrderHdr purchaseOrderHdr;
		private PurchaseOrderDtl purchaseOrderDtl;
		
		private String searchcriteria;
		private String searchvalue;
		private long id;
		private String usrUpd;
		private String usrCrt;
		private int pageNumber;
		private String message;
		private Map<String, Object> session;
		
		private String assetBrand;
		private String assetType;
		private String assetModel;
		private String bpkbno;
		private String bpkbname;
		private String bpkbaddress;
		private String vehicleColor;
		private String machineNo;
		private String chasisNo;
		private String cylinder;
		private String licensePlate;
		private String manufacturingMonth;
		private String manufacturingYear;
		private double assetPrice;
		
		public PurchaseOrderAction() throws Exception
			{
				try
					{
						final PurchaseOrderService purchaseOrderService = new PurchaseEntryDao();
						
						this.purchaseOrderService = purchaseOrderService;
						final Partner partner = new Partner();
						final Office office = new Office();
						final PurchaseOrderDtl orderDtl = new PurchaseOrderDtl();
						this.session.put("purchaseorder.purchaseorderdtl", orderDtl);
						
						this.setPartner(partner);
						this.setOffice(office);
						
						if (this.pageNumber == 0)
							{
								this.pageNumber = 1;
							}
					}
				catch (final Exception exp)
					{
						
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
					
			}
			
		@Override
		public String execute() throws Exception
			{
				String strMode;
				strMode = this.mode;
				
				if (this.mode != null)
					{
						switch (strMode)
							{
								case "search" :
								default :
									return "failed";
							}
					}
				else
					{
						strMode = "start";
					}
				return strMode;
			}
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
		/**
		 * @return the partner
		 */
		public Partner getPartner()
			{
				return this.partner;
			}
			
		/**
		 * @return the office
		 */
		public Office getOffice()
			{
				return this.office;
			}
			
		/**
		 * @return the purchaseOrderService
		 */
		public PurchaseOrderService getPurchaseOrderService()
			{
				return this.purchaseOrderService;
			}
			
		/**
		 * @param partner
		 *            the partner to set
		 */
		public void setPartner(final Partner partner)
			{
				this.partner = partner;
			}
			
		/**
		 * @param office
		 *            the office to set
		 */
		public void setOffice(final Office office)
			{
				this.office = office;
			}
			
		/**
		 * @param purchaseOrderService
		 *            the purchaseOrderService to set
		 */
		public void setPurchaseOrderService(final PurchaseOrderService purchaseOrderService)
			{
				this.purchaseOrderService = purchaseOrderService;
			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
			}
			
		public String order()
			{
				if (this.mode != null)
					{
						if (this.mode.equals("search"))
							{
								return "search";
							}
						if (this.mode.equals("entry"))
							{
								return "entry";
							}
						if (this.mode.equals("add"))
							{
								return "add";
							}
						if (this.mode.equals("del"))
							{
								return "del";
							}
						if (this.mode.equals("save"))
							{
								return "save";
							}
						if (this.mode.equals("back"))
							{
								return "back";
							}
					}
				else
					{
						return "start";
					}
				return this.mode;
			}
			
		public String getMode()
			{
				return this.mode;
			}
			
		public void setMode(final String mode)
			{
				this.mode = mode;
			}
			
		/**
		 * @return the lstSupplier
		 */
		public List<Supplier> getLstSupplier()
			{
				return this.lstSupplier;
			}
			
		/**
		 * @return the lstPurchaseOrderHdr
		 */
		public List<PurchaseOrderHdr> getLstPurchaseOrderHdr()
			{
				return this.lstPurchaseOrderHdr;
			}
			
		/**
		 * @return the lstPurchaseOrderDtl
		 */
		public List<PurchaseOrderDtl> getLstPurchaseOrderDtl()
			{
				this.lstPurchaseOrderDtl = (List<PurchaseOrderDtl>) this.session.get("purchaseorder.purchaseorderdtl");
				return this.lstPurchaseOrderDtl;
			}
			
		/**
		 * @return the purchaseOrderHdr
		 */
		public PurchaseOrderHdr getPurchaseOrderHdr()
			{
				return this.purchaseOrderHdr;
			}
			
		/**
		 * @return the purchaseOrderDtl
		 */
		public PurchaseOrderDtl getPurchaseOrderDtl()
			{
				
				return this.purchaseOrderDtl;
			}
			
		/**
		 * @return the searchcriteria
		 */
		public String getSearchcriteria()
			{
				return this.searchcriteria;
			}
			
		/**
		 * @return the searchvalue
		 */
		public String getSearchvalue()
			{
				return this.searchvalue;
			}
			
		/**
		 * @return the id
		 */
		public long getId()
			{
				return this.id;
			}
			
		/**
		 * @return the usrUpd
		 */
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		/**
		 * @return the usrCrt
		 */
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		/**
		 * @return the pageNumber
		 */
		public int getPageNumber()
			{
				return this.pageNumber;
			}
			
		/**
		 * @return the message
		 */
		public String getMessage()
			{
				return this.message;
			}
			
		/**
		 * @return the assetBrand
		 */
		public String getAssetBrand()
			{
				return this.assetBrand;
			}
			
		/**
		 * @return the assetType
		 */
		public String getAssetType()
			{
				return this.assetType;
			}
			
		/**
		 * @return the assetModel
		 */
		public String getAssetModel()
			{
				return this.assetModel;
			}
			
		/**
		 * @return the bpkbno
		 */
		public String getBpkbno()
			{
				return this.bpkbno;
			}
			
		/**
		 * @return the bpkbname
		 */
		public String getBpkbname()
			{
				return this.bpkbname;
			}
			
		/**
		 * @return the bpkbaddress
		 */
		public String getBpkbaddress()
			{
				return this.bpkbaddress;
			}
			
		/**
		 * @return the vehicleColor
		 */
		public String getVehicleColor()
			{
				return this.vehicleColor;
			}
			
		/**
		 * @return the machineNo
		 */
		public String getMachineNo()
			{
				return this.machineNo;
			}
			
		/**
		 * @return the chasisNo
		 */
		public String getChasisNo()
			{
				return this.chasisNo;
			}
			
		/**
		 * @return the cylinder
		 */
		public String getCylinder()
			{
				return this.cylinder;
			}
			
		/**
		 * @return the licensePlate
		 */
		public String getLicensePlate()
			{
				return this.licensePlate;
			}
			
		/**
		 * @return the manufacturingMonth
		 */
		public String getManufacturingMonth()
			{
				return this.manufacturingMonth;
			}
			
		/**
		 * @return the manufacturingYear
		 */
		public String getManufacturingYear()
			{
				return this.manufacturingYear;
			}
			
		/**
		 * @return the assetPrice
		 */
		public double getAssetPrice()
			{
				return this.assetPrice;
			}
			
		/**
		 * @param lstSupplier
		 *            the lstSupplier to set
		 */
		public void setLstSupplier(final List<Supplier> lstSupplier)
			{
				this.lstSupplier = lstSupplier;
			}
			
		/**
		 * @param lstPurchaseOrderHdr
		 *            the lstPurchaseOrderHdr to set
		 */
		public void setLstPurchaseOrderHdr(final List<PurchaseOrderHdr> lstPurchaseOrderHdr)
			{
				this.lstPurchaseOrderHdr = lstPurchaseOrderHdr;
			}
			
		/**
		 * @param lstPurchaseOrderDtl
		 *            the lstPurchaseOrderDtl to set
		 */
		public void setLstPurchaseOrderDtl(final List<PurchaseOrderDtl> lstPurchaseOrderDtl)
			{
				this.session.put("purchaseorder.purchaseorderdtl", lstPurchaseOrderDtl);
				this.lstPurchaseOrderDtl = lstPurchaseOrderDtl;
			}
			
		/**
		 * @param purchaseOrderHdr
		 *            the purchaseOrderHdr to set
		 */
		public void setPurchaseOrderHdr(final PurchaseOrderHdr purchaseOrderHdr)
			{
				this.purchaseOrderHdr = purchaseOrderHdr;
			}
			
		/**
		 * @param purchaseOrderDtl
		 *            the purchaseOrderDtl to set
		 */
		public void setPurchaseOrderDtl(final PurchaseOrderDtl purchaseOrderDtl)
			{
				this.purchaseOrderDtl = purchaseOrderDtl;
			}
			
		/**
		 * @param searchcriteria
		 *            the searchcriteria to set
		 */
		public void setSearchcriteria(final String searchcriteria)
			{
				this.searchcriteria = searchcriteria;
			}
			
		/**
		 * @param searchvalue
		 *            the searchvalue to set
		 */
		public void setSearchvalue(final String searchvalue)
			{
				this.searchvalue = searchvalue;
			}
			
		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final long id)
			{
				this.id = id;
			}
			
		/**
		 * @param usrUpd
		 *            the usrUpd to set
		 */
		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}
			
		/**
		 * @param usrCrt
		 *            the usrCrt to set
		 */
		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
			}
			
		/**
		 * @param pageNumber
		 *            the pageNumber to set
		 */
		public void setPageNumber(final int pageNumber)
			{
				this.pageNumber = pageNumber;
			}
			
		/**
		 * @param message
		 *            the message to set
		 */
		public void setMessage(final String message)
			{
				this.message = message;
			}
			
		/**
		 * @param assetBrand
		 *            the assetBrand to set
		 */
		public void setAssetBrand(final String assetBrand)
			{
				this.assetBrand = assetBrand;
			}
			
		/**
		 * @param assetType
		 *            the assetType to set
		 */
		public void setAssetType(final String assetType)
			{
				this.assetType = assetType;
			}
			
		/**
		 * @param assetModel
		 *            the assetModel to set
		 */
		public void setAssetModel(final String assetModel)
			{
				this.assetModel = assetModel;
			}
			
		/**
		 * @param bpkbno
		 *            the bpkbno to set
		 */
		public void setBpkbno(final String bpkbno)
			{
				this.bpkbno = bpkbno;
			}
			
		/**
		 * @param bpkbname
		 *            the bpkbname to set
		 */
		public void setBpkbname(final String bpkbname)
			{
				this.bpkbname = bpkbname;
			}
			
		/**
		 * @param bpkbaddress
		 *            the bpkbaddress to set
		 */
		public void setBpkbaddress(final String bpkbaddress)
			{
				this.bpkbaddress = bpkbaddress;
			}
			
		/**
		 * @param vehicleColor
		 *            the vehicleColor to set
		 */
		public void setVehicleColor(final String vehicleColor)
			{
				this.vehicleColor = vehicleColor;
			}
			
		/**
		 * @param machineNo
		 *            the machineNo to set
		 */
		public void setMachineNo(final String machineNo)
			{
				this.machineNo = machineNo;
			}
			
		/**
		 * @param chasisNo
		 *            the chasisNo to set
		 */
		public void setChasisNo(final String chasisNo)
			{
				this.chasisNo = chasisNo;
			}
			
		/**
		 * @param cylinder
		 *            the cylinder to set
		 */
		public void setCylinder(final String cylinder)
			{
				this.cylinder = cylinder;
			}
			
		/**
		 * @param licensePlate
		 *            the licensePlate to set
		 */
		public void setLicensePlate(final String licensePlate)
			{
				this.licensePlate = licensePlate;
			}
			
		/**
		 * @param manufacturingMonth
		 *            the manufacturingMonth to set
		 */
		public void setManufacturingMonth(final String manufacturingMonth)
			{
				this.manufacturingMonth = manufacturingMonth;
			}
			
		/**
		 * @param manufacturingYear
		 *            the manufacturingYear to set
		 */
		public void setManufacturingYear(final String manufacturingYear)
			{
				this.manufacturingYear = manufacturingYear;
			}
			
		/**
		 * @param assetPrice
		 *            the assetPrice to set
		 */
		public void setAssetPrice(final double assetPrice)
			{
				this.assetPrice = assetPrice;
			}
			
		/**
		 * @param usrUpd
		 *            the usrUpd to set
		 */
		public void setUsrUpd(final Date usrUpd)
			{
			}
			
		/**
		 * @return the session
		 */
		public Map<String, Object> getSession()
			{
				return this.session;
			}
			
		/**
		 * @param session
		 *            the session to set
		 */
		@Override
		public void setSession(final Map<String, Object> session)
			{
				this.session = session;
			}
			
	}
