
package com.adibrata.smartdealer.action.setting;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.DealerDao;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.Supplier;
import com.adibrata.smartdealer.service.setting.DealerService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class DealerAction extends BaseAction implements Preparable
	{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private long id;
		private String mode;
		private DealerService dealerService;
		private Supplier supplier;
		private Partner partner;
		private Office office;
		private List<Supplier> lstDealer;
		private int pageNumber;
		private String name;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String city;
		private String zipcode;
		private String type;
		private String areaPhone1;
		private String phoneNo1;
		private String areaPhone2;
		private String phoneNo2;
		private String areaFax;
		private String faxNo;
		private String handphone;
		// private String fullAddress; pindahkan ke service dao untuk simpan full
		// address
		private String searchcriteria;
		private String searchvalue;
		private String usrUpd;
		private String usrCrt;

		private String message;

		public DealerAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());

				this.office = new Office();
				this.setOffice(this.office);

				this.dealerService = new DealerDao();
				this.supplier = new Supplier();
				
				if (this.pageNumber == 0)
					{
						this.pageNumber = 1;
					}
			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

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
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "edit" :
									try
										{
											this.ViewData();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "savedel" :
									try
										{
											strMode = this.SaveDelete();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "saveadd" :
									try
										{
											strMode = this.SaveAdd();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "saveedit" :
									try
										{
											strMode = this.SaveEdit();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "first" :
									this.pageNumber = 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "prev" :
									this.pageNumber -= 1;
									if (this.pageNumber <= 1)
										{
											this.pageNumber = 1;
										}
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "next" :
									this.pageNumber += 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								case "last" :
									try
										{
											this.Paging(1);
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											strMode = ERROR;
											e.printStackTrace();
										}
									break;
								default :
									break;
							}
					}
				else
					{
						this.pageNumber = 1;
						try
							{
								this.Paging();
								strMode = "start";
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								strMode = ERROR;
								e.printStackTrace();
							}
					}
				return strMode;
			}

		private String WhereCond()
			{
				String wherecond = " partnercode = '" + BaseAction.sesPartnerCode() + "'";
				if ((this.getSearchvalue() != null) && !this.getSearchcriteria().equals("") && !this.getSearchcriteria().equals("0"))
					{
						if (this.getSearchcriteria().contains("%"))
							{
								wherecond = this.getSearchvalue() + " like '" + this.getSearchcriteria() + "' ";
							}
						else
							{
								wherecond = this.getSearchcriteria() + " = '" + this.getSearchvalue() + "' ";
							}
					}
				return wherecond;
			}

		private void Paging() throws Exception
			{
				try
					{
						this.lstDealer = this.dealerService.Paging(this.getPageNumber(), this.WhereCond(), "");
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

			}

		private void Paging(final int islast) throws Exception
			{
				try
					{
						this.lstDealer = this.dealerService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
						this.pageNumber = this.dealerService.getCurrentpage();
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}

			}

		public void ViewData() throws Exception
			{
				this.supplier = new Supplier();
				try
					{
						this.supplier = this.dealerService.View(this.id);
						this.partner = this.supplier.getPartner();
						this.name = this.supplier.getName();
						this.address = this.supplier.getAddress();
						this.rt = this.supplier.getRt();
						this.rw = this.supplier.getRw();
						this.kelurahan = this.supplier.getKelurahan();
						this.city = this.supplier.getCity();
						this.zipcode = this.supplier.getZipcode();
						this.type = this.supplier.getType();
						this.areaPhone1 = this.supplier.getAreaPhone1();
						this.phoneNo1 = this.supplier.getPhoneNo1();
						this.areaPhone2 = this.supplier.getAreaPhone2();
						this.phoneNo2 = this.supplier.getPhoneNo2();
						this.areaFax = this.supplier.getAreaFax();
						this.faxNo = this.supplier.getFaxNo();
						this.handphone = this.supplier.getHandphone();
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

		private String SaveAdd() throws Exception
			{
				String status = "";
				try
					{

						final Supplier supplier = new Supplier();
						supplier.setName(this.name);
						supplier.setAddress(this.address);
						supplier.setRt(this.rt);
						supplier.setRw(this.rw);
						supplier.setKelurahan(this.kelurahan);
						supplier.setCity(this.city);
						supplier.setZipcode(this.zipcode);
						supplier.setType(this.type);
						supplier.setAreaPhone1(this.areaPhone1);
						supplier.setAreaPhone2(this.areaPhone2);
						supplier.setPhoneNo1(this.phoneNo1);
						supplier.setPhoneNo2(this.areaPhone2);
						supplier.setAreaFax(this.areaFax);
						supplier.setFaxNo(this.faxNo);
						supplier.setHandphone(this.handphone);
						supplier.setPartner(this.partner);
						this.dealerService.SaveAdd(supplier);
						status = SUCCESS;
						this.setMessage(BaseAction.SuccessMessage());
					}
				catch (final Exception exp)
					{
						status = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}

		private String SaveEdit() throws Exception
			{
				String status = "";
				try
					{

						final Supplier supplier = new Supplier();
						supplier.setId(this.getId());
						supplier.setName(this.getName());
						supplier.setAddress(this.getAddress());
						supplier.setRt(this.getRt());
						supplier.setRw(this.getRw());
						supplier.setKelurahan(this.getKelurahan());
						supplier.setCity(this.getCity());
						supplier.setZipcode(this.getZipcode());
						supplier.setAreaPhone1(this.getAreaPhone1());
						supplier.setAreaPhone2(this.getAreaPhone2());
						supplier.setPhoneNo1(this.getPhoneNo1());
						supplier.setPhoneNo2(this.getPhoneNo2());
						supplier.setAreaFax(this.getAreaFax());
						supplier.setFaxNo(this.getFaxNo());
						supplier.setHandphone(this.getHandphone());
						supplier.setPartner(this.partner);
						supplier.setUsrUpd(this.usrUpd);
						this.dealerService.SaveAdd(supplier);
						status = SUCCESS;
						this.setMessage(BaseAction.SuccessMessage());
					}
				catch (final Exception exp)
					{
						status = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}

		private String SaveDelete() throws Exception
			{
				String status = "";
				try
					{

						final Supplier supplier = new Supplier();
						supplier.setId(this.getId());
						this.dealerService.SaveDel(supplier);
						status = SUCCESS;
						this.setMessage(BaseAction.SuccessMessage());
					}
				catch (final Exception exp)
					{
						status = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

		/**
		 * @return the dealerService
		 */
		public DealerService getDealerService()
			{
				return this.dealerService;
			}

		/**
		 * @return the supplier
		 */
		public Supplier getSupplier()
			{
				return this.supplier;
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
		 * @return the lstDealer
		 */
		public List<Supplier> getLstDealer()
			{
				return this.lstDealer;
			}

		/**
		 * @param dealerService
		 *            the dealerService to set
		 */
		public void setDealerService(final DealerService dealerService)
			{
				this.dealerService = dealerService;
			}

		/**
		 * @param supplier
		 *            the supplier to set
		 */
		public void setSupplier(final Supplier supplier)
			{
				this.supplier = supplier;
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
		 * @param lstDealer
		 *            the lstDealer to set
		 */
		public void setLstDealer(final List<Supplier> lstDealer)
			{
				this.lstDealer = lstDealer;
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
		 * @return the id
		 */
		public long getId()
			{
				return this.id;
			}

		/**
		 * @return the pageNumber
		 */
		public int getPageNumber()
			{
				return this.pageNumber;
			}

		/**
		 * @return the name
		 */
		public String getName()
			{
				return this.name;
			}

		/**
		 * @return the address
		 */
		public String getAddress()
			{
				return this.address;
			}

		/**
		 * @return the rt
		 */
		public String getRt()
			{
				return this.rt;
			}

		/**
		 * @return the rw
		 */
		public String getRw()
			{
				return this.rw;
			}

		/**
		 * @return the kelurahan
		 */
		public String getKelurahan()
			{
				return this.kelurahan;
			}

		/**
		 * @return the city
		 */
		public String getCity()
			{
				return this.city;
			}

		/**
		 * @return the zipcode
		 */
		public String getZipcode()
			{
				return this.zipcode;
			}

		/**
		 * @return the type
		 */
		public String getType()
			{
				return this.type;
			}

		/**
		 * @return the areaPhone1
		 */
		public String getAreaPhone1()
			{
				return this.areaPhone1;
			}

		/**
		 * @return the phoneNo1
		 */
		public String getPhoneNo1()
			{
				return this.phoneNo1;
			}

		/**
		 * @return the areaPhone2
		 */
		public String getAreaPhone2()
			{
				return this.areaPhone2;
			}

		/**
		 * @return the phoneNo2
		 */
		public String getPhoneNo2()
			{
				return this.phoneNo2;
			}

		/**
		 * @return the areaFax
		 */
		public String getAreaFax()
			{
				return this.areaFax;
			}

		/**
		 * @return the faxNo
		 */
		public String getFaxNo()
			{
				return this.faxNo;
			}

		/**
		 * @return the handphone
		 */
		public String getHandphone()
			{
				return this.handphone;
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
		 * @param id
		 *            the id to set
		 */
		public void setId(final long id)
			{
				this.id = id;
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
		 * @param name
		 *            the name to set
		 */
		public void setName(final String name)
			{
				this.name = name;
			}

		/**
		 * @param address
		 *            the address to set
		 */
		public void setAddress(final String address)
			{
				this.address = address;
			}

		/**
		 * @param rt
		 *            the rt to set
		 */
		public void setRt(final String rt)
			{
				this.rt = rt;
			}

		/**
		 * @param rw
		 *            the rw to set
		 */
		public void setRw(final String rw)
			{
				this.rw = rw;
			}

		/**
		 * @param kelurahan
		 *            the kelurahan to set
		 */
		public void setKelurahan(final String kelurahan)
			{
				this.kelurahan = kelurahan;
			}

		/**
		 * @param city
		 *            the city to set
		 */
		public void setCity(final String city)
			{
				this.city = city;
			}

		/**
		 * @param zipcode
		 *            the zipcode to set
		 */
		public void setZipcode(final String zipcode)
			{
				this.zipcode = zipcode;
			}

		/**
		 * @param type
		 *            the type to set
		 */
		public void setType(final String type)
			{
				this.type = type;
			}

		/**
		 * @param areaPhone1
		 *            the areaPhone1 to set
		 */
		public void setAreaPhone1(final String areaPhone1)
			{
				this.areaPhone1 = areaPhone1;
			}

		/**
		 * @param phoneNo1
		 *            the phoneNo1 to set
		 */
		public void setPhoneNo1(final String phoneNo1)
			{
				this.phoneNo1 = phoneNo1;
			}

		/**
		 * @param areaPhone2
		 *            the areaPhone2 to set
		 */
		public void setAreaPhone2(final String areaPhone2)
			{
				this.areaPhone2 = areaPhone2;
			}

		/**
		 * @param phoneNo2
		 *            the phoneNo2 to set
		 */
		public void setPhoneNo2(final String phoneNo2)
			{
				this.phoneNo2 = phoneNo2;
			}

		/**
		 * @param areaFax
		 *            the areaFax to set
		 */
		public void setAreaFax(final String areaFax)
			{
				this.areaFax = areaFax;
			}

		/**
		 * @param faxNo
		 *            the faxNo to set
		 */
		public void setFaxNo(final String faxNo)
			{
				this.faxNo = faxNo;
			}

		/**
		 * @param handphone
		 *            the handphone to set
		 */
		public void setHandphone(final String handphone)
			{
				this.handphone = handphone;
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

		public String getMessage()
			{
				return this.message;
			}

		public void setMessage(final String message)
			{
				this.message = message;
			}

	}
