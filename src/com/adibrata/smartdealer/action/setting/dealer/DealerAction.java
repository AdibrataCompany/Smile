
package com.adibrata.smartdealer.action.setting.dealer;

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
		private Long id;
		private String mode;
		private DealerService dealerservice;
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

				this.dealerservice = new DealerDao();
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
						try
							{
								this.Paging();
								strMode = "start";
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
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
						this.lstdealer = this.dealerservice.Paging(this.getPagenumber(), this.WhereCond(), "");
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
						this.lstdealer = this.dealerservice.Paging(this.getPagenumber(), this.WhereCond(), "", true);
						this.pagenumber = this.dealerservice.getCurrentpage();
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
								this.supplier = this.dealerservice.View(this.id);
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

						final Supplier supplier = new Supplier();
						supplier.setName(this.name);
						supplier.setAddress(this.address);
						supplier.setRt(this.rt);
						supplier.setRw(this.rw);
						supplier.setKelurahan(this.kelurahan);
						supplier.setCity(this.city);
						supplier.setZipcode(this.zipcode);
						supplier.setType(this.type);
						supplier.setAreaPhone1(this.areaphone1);
						supplier.setAreaPhone2(this.areaphone2);
						supplier.setPhoneNo1(this.phoneno1);
						supplier.setPhoneNo2(this.areaphone2);
						supplier.setAreaFax(this.areafax);
						supplier.setFaxNo(this.faxno);
						supplier.setHandphone(this.handphone);
						supplier.setPartner(this.partner);
						this.dealerservice.SaveAdd(supplier);
						this.setMessage(BaseAction.SuccessMessage());
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

						final Supplier supplier = new Supplier();
						supplier.setId(this.getId());
						supplier.setName(this.getName());
						supplier.setAddress(this.getAddress());
						supplier.setRt(this.getRt());
						supplier.setRw(this.getRw());
						supplier.setKelurahan(this.getKelurahan());
						supplier.setCity(this.getCity());
						supplier.setZipcode(this.getZipcode());
						supplier.setAreaPhone1(this.getAreaphone1());
						supplier.setAreaPhone2(this.getAreaphone2());
						supplier.setPhoneNo1(this.getPhoneno1());
						supplier.setPhoneNo2(this.getPhoneno2());
						supplier.setAreaFax(this.getAreafax());
						supplier.setFaxNo(this.getFaxno());
						supplier.setHandphone(this.getHandphone());
						supplier.setPartner(this.partner);
						supplier.setUsrUpd(this.usrUpd);
						this.dealerservice.SaveAdd(supplier);
						this.setMessage(BaseAction.SuccessMessage());
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
				String status = "";
				try
					{

						final Supplier supplier = new Supplier();
						supplier.setId(this.getId());
						this.dealerservice.SaveDel(supplier);
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

		public String getMode()
			{
				return this.mode;
			}

		public void setMode(final String mode)
			{
				this.mode = mode;
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

		public void setId(final Long id)
			{
				this.id = id;
			}

		public Long getId()
			{
				return this.id;
			}

		public String getAreaphone1()
			{
				return this.areaphone1;
			}

		public void setAreaphone1(final String areaphone1)
			{
				this.areaphone1 = areaphone1;
			}

		public String getPhoneno1()
			{
				return this.phoneno1;
			}

		public void setPhoneno1(final String phoneno1)
			{
				this.phoneno1 = phoneno1;
			}

		public String getAreaphone2()
			{
				return this.areaphone2;
			}

		public void setAreaphone2(final String areaphone2)
			{
				this.areaphone2 = areaphone2;
			}

		public String getPhoneno2()
			{
				return this.phoneno2;
			}

		public void setPhoneno2(final String phoneno2)
			{
				this.phoneno2 = phoneno2;
			}

		public String getAreafax()
			{
				return this.areafax;
			}

		public void setAreafax(final String areafax)
			{
				this.areafax = areafax;
			}

		public String getFaxno()
			{
				return this.faxno;
			}

		public void setFaxno(final String faxno)
			{
				this.faxno = faxno;
			}

		public DealerService getDealerservice()
			{
				return this.dealerservice;
			}

		public void setDealerservice(final DealerService dealerservice)
			{
				this.dealerservice = dealerservice;
			}

		public List<Supplier> getLstdealer()
			{
				return this.lstdealer;
			}

		public void setLstdealer(final List<Supplier> lstdealer)
			{
				this.lstdealer = lstdealer;
			}

		public int getPagenumber()
			{
				return this.pagenumber;
			}

		public void setPagenumber(final int pagenumber)
			{
				this.pagenumber = pagenumber;
			}

	}
