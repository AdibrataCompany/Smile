
package com.adibrata.smartdealer.action.setting.supplier;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.SupplierDao;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.Supplier;
import com.adibrata.smartdealer.service.setting.SupplierService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class SupplierAction extends BaseAction implements Preparable
	{
		
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private Long id;
		private String mode;
		private SupplierService service;
		private Supplier supplier;
		private Partner partner;
		private Office office;
		private List<Supplier> lstdealer;
		private int pagenumber;
		private String name;
		private String address;
		private String rt;
		private String rw;
		private String kelurahan;
		private String city;
		private String zipcode;
		private String type;
		private String areaphone1;
		private String phoneno1;
		private String areaphone2;
		private String phoneno2;
		private String areafax;
		private String faxno;
		private String handphone;
		// private String fullAddress; pindahkan ke service dao untuk simpan full
		// address
		private String searchcriteria;
		private String searchvalue;
		
		private String message;
		
		public SupplierAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				
				this.office = new Office();
				this.setOffice(this.office);
				
				this.service = new SupplierDao();
				this.supplier = new Supplier();
				
				if (this.pagenumber == 0)
					{
						this.pagenumber = 1;
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
											e.printStackTrace();
										}
									break;
								case "edit" :
									try
										{
											strMode = this.ViewData();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "savedel" :
									try
										{
											strMode = this.SaveDelete();
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "first" :
									this.pagenumber = 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "prev" :
									this.pagenumber -= 1;
									if (this.pagenumber <= 1)
										{
											this.pagenumber = 1;
										}
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "next" :
									this.pagenumber += 1;
									try
										{
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
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
											e.printStackTrace();
										}
									break;
								default :
									break;
							}
					}
				else
					{
						this.pagenumber = 1;
						strMode = INPUT;

					}
				return strMode;
			}
			
		public String save()
			{
				String strMode;
				strMode = this.mode;
				if (this.mode != null)
					{
						switch (strMode)
							{
								case "saveadd" :
									try
										{
											strMode = this.SaveAdd();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "saveedit" :
									try
										{
											strMode = this.SaveEdit();
										}
									catch (final Exception e1)
										{
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									break;
								default :
									break;
							}
					}
				else
					{
						try
							{
								strMode = "input";
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				return strMode;
			}
			
		private String WhereCond()
			{
				final StringBuilder wherecond = new StringBuilder();
				wherecond.append(" partnercode = '" + BaseAction.sesPartnerCode() + "'");
				if ((this.getSearchvalue() != null) && !this.getSearchcriteria().equals("") && !this.getSearchcriteria().equals("0"))
					{
						wherecond.append(" and ");

						if (this.getSearchvalue().contains("%"))
							{

								wherecond.append(this.getSearchcriteria() + " like '" + this.getSearchvalue() + "' ");
							}
						else
							{
								wherecond.append(this.getSearchcriteria() + " = '" + this.getSearchvalue() + "' ");
							}
					}
				return wherecond.toString();
			}
			
		private void Paging() throws Exception
			{
				try
					{
						this.lstdealer = this.service.Paging(this.getPagenumber(), this.WhereCond(), "");
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
						this.lstdealer = this.service.Paging(this.getPagenumber(), this.WhereCond(), "", true);
						this.pagenumber = this.service.getCurrentpage();
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
					
			}
			
		public String ViewData() throws Exception
			{
				this.supplier = new Supplier();
				try
					{
						if (this.getId() != null)
							{
								this.supplier = this.service.View(this.id);
								this.partner = this.supplier.getPartner();
								this.name = this.supplier.getName();
								this.address = this.supplier.getAddress();
								this.rt = this.supplier.getRt();
								this.rw = this.supplier.getRw();
								this.kelurahan = this.supplier.getKelurahan();
								this.city = this.supplier.getCity();
								this.zipcode = this.supplier.getZipcode();
								this.type = this.supplier.getType();
								this.areaphone1 = this.supplier.getAreaPhone1();
								this.phoneno1 = this.supplier.getPhoneNo1();
								this.areaphone2 = this.supplier.getAreaPhone2();
								this.phoneno2 = this.supplier.getPhoneNo2();
								this.areafax = this.supplier.getAreaFax();
								this.faxno = this.supplier.getFaxNo();
								this.handphone = this.supplier.getHandphone();
							}
						else
							{
								this.Paging();
								this.mode = "start";
								this.setMessage(BaseAction.SelectFirst());
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
				return this.mode;
			}
			
		private String SaveAdd() throws Exception
			{
				try
					{
						
						this.supplier = new Supplier();
						this.supplier.setName(this.name);
						this.supplier.setAddress(this.address);
						this.supplier.setRt(this.rt);
						this.supplier.setRw(this.rw);
						this.supplier.setKelurahan(this.kelurahan);
						this.supplier.setCity(this.city);
						this.supplier.setZipcode(this.zipcode);
						this.supplier.setType(this.type);
						this.supplier.setAreaPhone1(this.areaphone1);
						this.supplier.setAreaPhone2(this.areaphone2);
						this.supplier.setPhoneNo1(this.phoneno1);
						this.supplier.setPhoneNo2(this.areaphone2);
						this.supplier.setAreaFax(this.areafax);
						this.supplier.setFaxNo(this.faxno);
						this.supplier.setHandphone(this.handphone);
						this.supplier.setPartner(this.partner);
						this.service.SaveAdd(this.supplier);
						
						this.setMessage(BaseAction.SuccessMessage());
						this.mode = SUCCESS;
					}
				catch (final Exception exp)
					{
						this.mode = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.mode;
			}
			
		private String SaveEdit() throws Exception
			{
				try
					{
						
						this.supplier = new Supplier();
						this.supplier.setId(this.getId());
						this.supplier.setName(this.getName());
						this.supplier.setAddress(this.getAddress());
						this.supplier.setRt(this.getRt());
						this.supplier.setRw(this.getRw());
						this.supplier.setKelurahan(this.getKelurahan());
						this.supplier.setCity(this.getCity());
						this.supplier.setZipcode(this.getZipcode());
						this.supplier.setAreaPhone1(this.getAreaphone1());
						this.supplier.setAreaPhone2(this.getAreaphone2());
						this.supplier.setPhoneNo1(this.getPhoneno1());
						this.supplier.setPhoneNo2(this.getPhoneno2());
						this.supplier.setAreaFax(this.getAreafax());
						this.supplier.setFaxNo(this.getFaxno());
						this.supplier.setHandphone(this.getHandphone());
						this.supplier.setPartner(this.partner);
						this.supplier.setUsrUpd(BaseAction.sesLoginName());
						this.service.SaveAdd(this.supplier);
						this.setMessage(BaseAction.SuccessMessage());
						this.message = SUCCESS;
					}
				catch (final Exception exp)
					{
						this.mode = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.mode;
			}
			
		private String SaveDelete() throws Exception
			{

				try
					{
						
						this.supplier = new Supplier();
						this.supplier.setId(this.getId());
						this.service.SaveDel(this.supplier);
						this.setMessage(BaseAction.SuccessMessage());
						this.mode = SUCCESS;
					}
				catch (final Exception exp)
					{
						this.mode = ERROR;
						this.setMessage(BaseAction.ErrorMessage());
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return this.mode;
			}

		/**
		 * @return the id
		 */
		public Long getId()
			{
				return this.id;
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
		 * @return the mode
		 */
		public String getMode()
			{
				return this.mode;
			}

		/**
		 * @param mode
		 *            the mode to set
		 */
		public void setMode(final String mode)
			{
				this.mode = mode;
			}

		/**
		 * @return the service
		 */
		public SupplierService getService()
			{
				return this.service;
			}

		/**
		 * @param service
		 *            the service to set
		 */
		public void setService(final SupplierService service)
			{
				this.service = service;
			}

		/**
		 * @return the supplier
		 */
		public Supplier getSupplier()
			{
				return this.supplier;
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
		 * @return the partner
		 */
		public Partner getPartner()
			{
				return this.partner;
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
		 * @return the office
		 */
		public Office getOffice()
			{
				return this.office;
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
		 * @return the lstdealer
		 */
		public List<Supplier> getLstdealer()
			{
				return this.lstdealer;
			}

		/**
		 * @param lstdealer
		 *            the lstdealer to set
		 */
		public void setLstdealer(final List<Supplier> lstdealer)
			{
				this.lstdealer = lstdealer;
			}

		/**
		 * @return the pagenumber
		 */
		public int getPagenumber()
			{
				return this.pagenumber;
			}

		/**
		 * @param pagenumber
		 *            the pagenumber to set
		 */
		public void setPagenumber(final int pagenumber)
			{
				this.pagenumber = pagenumber;
			}

		/**
		 * @return the name
		 */
		public String getName()
			{
				return this.name;
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
		 * @return the address
		 */
		public String getAddress()
			{
				return this.address;
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
		 * @return the rt
		 */
		public String getRt()
			{
				return this.rt;
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
		 * @return the rw
		 */
		public String getRw()
			{
				return this.rw;
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
		 * @return the kelurahan
		 */
		public String getKelurahan()
			{
				return this.kelurahan;
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
		 * @return the city
		 */
		public String getCity()
			{
				return this.city;
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
		 * @return the zipcode
		 */
		public String getZipcode()
			{
				return this.zipcode;
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
		 * @return the type
		 */
		public String getType()
			{
				return this.type;
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
		 * @return the areaphone1
		 */
		public String getAreaphone1()
			{
				return this.areaphone1;
			}

		/**
		 * @param areaphone1
		 *            the areaphone1 to set
		 */
		public void setAreaphone1(final String areaphone1)
			{
				this.areaphone1 = areaphone1;
			}

		/**
		 * @return the phoneno1
		 */
		public String getPhoneno1()
			{
				return this.phoneno1;
			}

		/**
		 * @param phoneno1
		 *            the phoneno1 to set
		 */
		public void setPhoneno1(final String phoneno1)
			{
				this.phoneno1 = phoneno1;
			}

		/**
		 * @return the areaphone2
		 */
		public String getAreaphone2()
			{
				return this.areaphone2;
			}

		/**
		 * @param areaphone2
		 *            the areaphone2 to set
		 */
		public void setAreaphone2(final String areaphone2)
			{
				this.areaphone2 = areaphone2;
			}

		/**
		 * @return the phoneno2
		 */
		public String getPhoneno2()
			{
				return this.phoneno2;
			}

		/**
		 * @param phoneno2
		 *            the phoneno2 to set
		 */
		public void setPhoneno2(final String phoneno2)
			{
				this.phoneno2 = phoneno2;
			}

		/**
		 * @return the areafax
		 */
		public String getAreafax()
			{
				return this.areafax;
			}

		/**
		 * @param areafax
		 *            the areafax to set
		 */
		public void setAreafax(final String areafax)
			{
				this.areafax = areafax;
			}

		/**
		 * @return the faxno
		 */
		public String getFaxno()
			{
				return this.faxno;
			}

		/**
		 * @param faxno
		 *            the faxno to set
		 */
		public void setFaxno(final String faxno)
			{
				this.faxno = faxno;
			}

		/**
		 * @return the handphone
		 */
		public String getHandphone()
			{
				return this.handphone;
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
		 * @return the searchcriteria
		 */
		public String getSearchcriteria()
			{
				return this.searchcriteria;
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
		 * @return the searchvalue
		 */
		public String getSearchvalue()
			{
				return this.searchvalue;
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
		 * @return the message
		 */
		public String getMessage()
			{
				return this.message;
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
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

	}
