
package com.adibrata.smartdealer.action.setting.taksasi;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.TaksasiDao;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.Taksasi;
import com.adibrata.smartdealer.service.setting.TaksasiService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class TaksasiAction extends BaseAction implements Preparable
	{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		private String mode;
		private Taksasi taksasi;
		private TaksasiService taksasiservice;
		private Partner partner;
		private Office office;
		private List<Taksasi> lsttaksasi;
		private String searchcriteria;
		private String searchvalue;
		private int pagenumber;
		private String usrupd;
		private String usrcrt;
		private String message;
		private Long id;

		private String assetmastercode;
		private String taksasicode;
		private String taksasiname;
		private double taksasipricemin;

		public TaksasiAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());

				this.office = new Office();
				this.setOffice(this.office);

				this.taksasiservice = new TaksasiDao();
				this.taksasi = new Taksasi();

				if (this.pagenumber == 0)
					{
						this.pagenumber = 1;
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
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						strMode = "start";
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
						this.lsttaksasi = this.taksasiservice.Paging(this.getPagenumber(), this.WhereCond(), "");
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
						this.lsttaksasi = this.taksasiservice.Paging(this.getPagenumber(), this.WhereCond(), "", true);
						this.pagenumber = this.taksasiservice.getCurrentpage();
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
				this.taksasi = new Taksasi();
				try
					{
						if (this.getId() != null)
							{
								this.taksasi = this.taksasiservice.View(this.id);
								this.partner = this.office.getPartner();
								this.taksasicode = this.taksasi.getTaksasiCode();
								this.taksasiname = this.taksasi.getTaksasiName();
								this.taksasipricemin = this.taksasi.getTaksasiPriceMin();
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
						final Taksasi taksasi = new Taksasi();
						taksasi.setTaksasiCode(this.getTaksasicode());
						taksasi.setTaksasiName(this.getTaksasiname());
						taksasi.setTaksasiPriceMin(this.getTaksasipricemin());
						taksasi.setPartner(this.partner);
						this.taksasiservice.SaveAdd(taksasi);
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
						final Taksasi taksasi = new Taksasi();
						taksasi.setTaksasiCode(this.getTaksasicode());
						taksasi.setTaksasiName(this.getTaksasiname());
						taksasi.setTaksasiPriceMin(this.getTaksasipricemin());
						taksasi.setUsrUpd(this.usrupd);
						taksasi.setPartner(this.partner);
						this.taksasiservice.SaveEdit(taksasi);
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
				final String status = "";
				try
					{
						if (this.getId() != null)
							{
								final Taksasi taksasi = new Taksasi();
								this.office.setId(this.getId());
								this.taksasiservice.SaveDel(taksasi);
								this.setMessage(BaseAction.SuccessMessage());
							}
						else
							{
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
		 * @return the taksasi
		 */
		public Taksasi getTaksasi()
			{
				return this.taksasi;
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
		 * @param taksasi
		 *            the taksasi to set
		 */
		public void setTaksasi(final Taksasi taksasi)
			{
				this.taksasi = taksasi;
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

		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

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

		public TaksasiService getTaksasiservice()
			{
				return this.taksasiservice;
			}

		public void setTaksasiservice(final TaksasiService taksasiservice)
			{
				this.taksasiservice = taksasiservice;
			}

		public List<Taksasi> getLsttaksasi()
			{
				return this.lsttaksasi;
			}

		public void setLsttaksasi(final List<Taksasi> lsttaksasi)
			{
				this.lsttaksasi = lsttaksasi;
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

		public Long getId()
			{
				return this.id;
			}

		public void setId(final Long id)
			{
				this.id = id;
			}

		public String getAssetmastercode()
			{
				return this.assetmastercode;
			}

		public void setAssetmastercode(final String assetmastercode)
			{
				this.assetmastercode = assetmastercode;
			}

		public String getTaksasicode()
			{
				return this.taksasicode;
			}

		public void setTaksasicode(final String taksasicode)
			{
				this.taksasicode = taksasicode;
			}

		public String getTaksasiname()
			{
				return this.taksasiname;
			}

		public void setTaksasiname(final String taksasiname)
			{
				this.taksasiname = taksasiname;
			}

		public double getTaksasipricemin()
			{
				return this.taksasipricemin;
			}

		public void setTaksasipricemin(final double taksasipricemin)
			{
				this.taksasipricemin = taksasipricemin;
			}

	}
