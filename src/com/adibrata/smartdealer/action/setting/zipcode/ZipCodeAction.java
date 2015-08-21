
package com.adibrata.smartdealer.action.setting.zipcode;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.ZipCodeDao;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.ZipCode;
import com.adibrata.smartdealer.service.setting.ZipCodeService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class ZipCodeAction extends BaseAction implements Preparable
	{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		private String mode;
		private ZipCode zipCode;
		private Partner partner;
		private Office office;
		private List<ZipCode> lstzipcode;

		private ZipCodeService zipcodeservice;
		private String searchcriteria;
		private String searchvalue;
		private int pagenumber;
		
		
		private String message;
		private Long id;
		private String kelurahan;
		private String kecamatan;
		private String city;
		private String zipcode;

		public ZipCodeAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());

				this.office = new Office();
				this.setOffice(this.office);

				this.zipcodeservice = new ZipCodeDao();
				this.zipCode = new ZipCode();

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
				try
					{
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
										strMode = INPUT;
									}
								catch (final Exception e)
									{
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
							}
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
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
				String wherecond = "";
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
						this.lstzipcode = this.zipcodeservice.Paging(this.getPagenumber(), this.WhereCond(), "");
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
						this.lstzipcode = this.zipcodeservice.Paging(this.getPagenumber(), this.WhereCond(), "", true);
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
				this.zipCode = new ZipCode();
				try
					{
						if (this.getId() != null)
							{
								this.zipCode = this.zipcodeservice.View(this.id);
								this.kelurahan = this.zipCode.getKelurahan();
								this.kecamatan = this.zipCode.getKecamatan();
								this.city = this.zipCode.getCity();
								this.zipcode = this.zipCode.getZipCode();
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
						final ZipCode zipcode = new ZipCode();
						zipcode.setId(this.getId());
						zipcode.setKelurahan(this.kelurahan);
						zipcode.setKecamatan(this.kecamatan);
						zipcode.setCity(this.city);
						zipcode.setZipCode(this.getZipcode());
						this.zipcodeservice.SaveDel(zipcode);
						this.setMessage(BaseAction.SuccessMessage());
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

		private String SaveEdit() throws Exception
			{
				try
					{
						this.zipCode = new ZipCode();
						this.zipCode.setId(this.getId());
						this.zipCode.setKelurahan(this.kelurahan);
						this.zipCode.setKecamatan(this.kecamatan);
						this.zipCode.setCity(this.city);
						this.zipCode.setZipCode(this.zipcode);
						this.zipCode.setUsrUpd(this.usrupd);
						this.zipcodeservice.SaveDel(this.zipCode);
						this.setMessage(BaseAction.SuccessMessage());
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

		private String SaveDelete() throws Exception
			{
				String status = "";
				try
					{
						final ZipCode zipcode = new ZipCode();
						zipcode.setId(this.getId());

						this.zipcodeservice.SaveDel(zipcode);
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

		public String getMode()
			{
				return this.mode;
			}

		public void setMode(final String mode)
			{
				this.mode = mode;
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
		 * @return the message
		 */
		public String getMessage()
			{
				return this.message;
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
		 * @param message
		 *            the message to set
		 */
		public void setMessage(final String message)
			{
				this.message = message;
			}

		public Partner getPartner()
			{
				return this.partner;
			}

		public void setPartner(final Partner partner)
			{
				this.partner = partner;
			}

		public Office getOffice()
			{
				return this.office;
			}

		public void setOffice(final Office office)
			{
				this.office = office;
			}

		public String getKelurahan()
			{
				return this.kelurahan;
			}

		public void setKelurahan(final String kelurahan)
			{
				this.kelurahan = kelurahan;
			}

		public String getKecamatan()
			{
				return this.kecamatan;
			}

		public void setKecamatan(final String kecamatan)
			{
				this.kecamatan = kecamatan;
			}

		public String getCity()
			{
				return this.city;
			}

		public void setCity(final String city)
			{
				this.city = city;
			}

		public List<ZipCode> getLstzipcode()
			{
				return this.lstzipcode;
			}

		public void setLstzipcode(final List<ZipCode> lstzipcode)
			{
				this.lstzipcode = lstzipcode;
			}

		public ZipCodeService getZipcodeservice()
			{
				return this.zipcodeservice;
			}

		public void setZipcodeservice(final ZipCodeService zipcodeservice)
			{
				this.zipcodeservice = zipcodeservice;
			}

		public int getPagenumber()
			{
				return this.pagenumber;
			}

		public void setPagenumber(final int pagenumber)
			{
				this.pagenumber = pagenumber;
			}

		public String getUsrupd()
			{
				return this.usrupd;
			}

		public void setUsrupd(final String usrupd)
			{
				this.usrupd = usrupd;
			}

		public String getUsrcrt()
			{
				return this.usrcrt;
			}

		public void setUsrcrt(final String usrcrt)
			{
				this.usrcrt = usrcrt;
			}

		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

		public Long getId()
			{
				return this.id;
			}

		public void setId(final Long id)
			{
				this.id = id;
			}

		public void setZipcode(final String zipcode)
			{
				this.zipcode = zipcode;
			}

		public ZipCode getZipCode()
			{
				return this.zipCode;
			}

		public void setZipCode(final ZipCode zipCode)
			{
				this.zipCode = zipCode;
			}

		public String getZipcode()
			{
				return this.zipcode;
			}

	}
