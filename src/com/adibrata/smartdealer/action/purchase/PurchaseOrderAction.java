
package com.adibrata.smartdealer.action.purchase;

/**
 * @author Henry
 */
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
		
		/**
		 * @return the serialversionuid
		 */
		public static Long getSerialversionuid()
			{
				return serialVersionUID;
			}
		private String assetBrand;
		private String assetModel;
		private double assetPrice;
		
		private String assetType;
		private String bpkbaddress;
		private String bpkbname;
		private String bpkbno;
		private String chasisNo;
		
		private String cylinder;
		private Long id;
		private String licensePlate;
		private List<PurchaseOrderDtl> lstPurchaseOrderDtl;
		private List<PurchaseOrderHdr> lstPurchaseOrderHdr;
		private List<Supplier> lstSupplier;
		private String machineNo;
		private String manufacturingMonth;
		
		private String manufacturingYear;
		private String message;
		private String mode;
		private Office office;
		private int pageNumber;
		private Partner partner;
		private PurchaseOrderDtl purchaseOrderDtl;
		private PurchaseOrderHdr purchaseOrderHdr;
		private PurchaseOrderService purchaseOrderService;
		private String searchcriteria;
		private String searchvalue;
		private Map<String, Object> session;
		private String usrCrt;
		private String usrUpd;
		private String vehicleColor;
		
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
		 * @return the assetBrand
		 */
		public String getAssetBrand()
			{
				return this.assetBrand;
			}
			
		/**
		 * @return the assetModel
		 */
		public String getAssetModel()
			{
				return this.assetModel;
			}
			
		/**
		 * @return the assetPrice
		 */
		public double getAssetPrice()
			{
				return this.assetPrice;
			}
			
		/**
		 * @return the assetType
		 */
		public String getAssetType()
			{
				return this.assetType;
			}
			
		/**
		 * @return the bpkbaddress
		 */
		public String getBpkbaddress()
			{
				return this.bpkbaddress;
			}
			
		/**
		 * @return the bpkbname
		 */
		public String getBpkbname()
			{
				return this.bpkbname;
			}
			
		/**
		 * @return the bpkbno
		 */
		public String getBpkbno()
			{
				return this.bpkbno;
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
		 * @return the id
		 */
		public Long getId()
			{
				return this.id;
			}
			
		/**
		 * @return the licensePlate
		 */
		public String getLicensePlate()
			{
				return this.licensePlate;
			}
			
		/**
		 * @return the lstPurchaseOrderDtl
		 */
		@SuppressWarnings("unchecked")
		public List<PurchaseOrderDtl> getLstPurchaseOrderDtl()
			{
				this.lstPurchaseOrderDtl = (List<PurchaseOrderDtl>) this.session.get("purchaseorder.purchaseorderdtl");
				return this.lstPurchaseOrderDtl;
			}
			
		/**
		 * @return the lstPurchaseOrderHdr
		 */
		public List<PurchaseOrderHdr> getLstPurchaseOrderHdr()
			{
				return this.lstPurchaseOrderHdr;
			}
			
		/**
		 * @return the lstSupplier
		 */
		public List<Supplier> getLstSupplier()
			{
				return this.lstSupplier;
			}
			
		/**
		 * @return the machineNo
		 */
		public String getMachineNo()
			{
				return this.machineNo;
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
		 * @return the message
		 */
		public String getMessage()
			{
				return this.message;
			}
			
		public String getMode()
			{
				return this.mode;
			}
			
		/**
		 * @return the office
		 */
		public Office getOffice()
			{
				return this.office;
			}
			
		/**
		 * @return the pageNumber
		 */
		public int getPageNumber()
			{
				return this.pageNumber;
			}
			
		/**
		 * @return the partner
		 */
		public Partner getPartner()
			{
				return this.partner;
			}
			
		/**
		 * @return the purchaseOrderDtl
		 */
		public PurchaseOrderDtl getPurchaseOrderDtl()
			{
				
				return this.purchaseOrderDtl;
			}
			
		/**
		 * @return the purchaseOrderHdr
		 */
		public PurchaseOrderHdr getPurchaseOrderHdr()
			{
				return this.purchaseOrderHdr;
			}
			
		/**
		 * @return the purchaseOrderService
		 */
		public PurchaseOrderService getPurchaseOrderService()
			{
				return this.purchaseOrderService;
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
		 * @return the session
		 */
		public Map<String, Object> getSession()
			{
				return this.session;
			}
			
		/**
		 * @return the usrCrt
		 */
		public String getUsrCrt()
			{
				return this.usrCrt;
			}
			
		/**
		 * @return the usrUpd
		 */
		public String getUsrUpd()
			{
				return this.usrUpd;
			}
			
		/**
		 * @return the vehicleColor
		 */
		public String getVehicleColor()
			{
				return this.vehicleColor;
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
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub
				
			}
			
		public String receive()
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
					}
				else
					{
						return "start";
					}
				return this.mode;
			}
			
		public String retur()
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
			
		/**
		 * @param assetBrand
		 *            the assetBrand to set
		 */
		public void setAssetBrand(final String assetBrand)
			{
				this.assetBrand = assetBrand;
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
		 * @param assetPrice
		 *            the assetPrice to set
		 */
		public void setAssetPrice(final double assetPrice)
			{
				this.assetPrice = assetPrice;
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
		 * @param bpkbaddress
		 *            the bpkbaddress to set
		 */
		public void setBpkbaddress(final String bpkbaddress)
			{
				this.bpkbaddress = bpkbaddress;
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
		 * @param bpkbno
		 *            the bpkbno to set
		 */
		public void setBpkbno(final String bpkbno)
			{
				this.bpkbno = bpkbno;
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
		 * @param id
		 *            the id to set
		 */
		public void setId(final Long id)
			{
				this.id = id;
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
		 * @param lstPurchaseOrderDtl
		 *            the lstPurchaseOrderDtl to set
		 */
		public void setLstPurchaseOrderDtl(final List<PurchaseOrderDtl> lstPurchaseOrderDtl)
			{
				this.session.put("purchaseorder.purchaseorderdtl", lstPurchaseOrderDtl);
				this.lstPurchaseOrderDtl = lstPurchaseOrderDtl;
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
		 * @param lstSupplier
		 *            the lstSupplier to set
		 */
		public void setLstSupplier(final List<Supplier> lstSupplier)
			{
				this.lstSupplier = lstSupplier;
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
		 * @param message
		 *            the message to set
		 */
		public void setMessage(final String message)
			{
				this.message = message;
			}
			
		public void setMode(final String mode)
			{
				this.mode = mode;
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
		 * @param pageNumber
		 *            the pageNumber to set
		 */
		public void setPageNumber(final int pageNumber)
			{
				this.pageNumber = pageNumber;
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
		 * @param purchaseOrderDtl
		 *            the purchaseOrderDtl to set
		 */
		public void setPurchaseOrderDtl(final PurchaseOrderDtl purchaseOrderDtl)
			{
				this.purchaseOrderDtl = purchaseOrderDtl;
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
		 * @param purchaseOrderService
		 *            the purchaseOrderService to set
		 */
		public void setPurchaseOrderService(final PurchaseOrderService purchaseOrderService)
			{
				this.purchaseOrderService = purchaseOrderService;
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
		 * @param session
		 *            the session to set
		 */
		public void setSession(final Map<String, Object> session)
			{
				this.session = session;
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
		 * @param usrUpd
		 *            the usrUpd to set
		 */
		public void setUsrUpd(final Date usrUpd)
			{
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
		 * @param vehicleColor
		 *            the vehicleColor to set
		 */
		public void setVehicleColor(final String vehicleColor)
			{
				this.vehicleColor = vehicleColor;
			}
			
	}
