
package com.adibrata.smartdealer.action.setting.journalscheme;

import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.JournalSchemeDao;
import com.adibrata.smartdealer.model.CoaSchmDtl;
import com.adibrata.smartdealer.model.CoaSchmHdr;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.JournalSchemeService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class JournalSchemeAction extends BaseAction implements Preparable
	{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		private String mode;
		private JournalSchemeService service;
		private CoaSchmDtl coaschmdtl;
		private CoaSchmHdr coaschmhdr;
		private Partner partner;
		private Office office;
		private List<CoaSchmDtl> lstcoaschmdtl;
		private List<CoaSchmHdr> lstcoaschmhdr;
		private String searchcriteria;
		private String searchvalue;
		private int pagenumber;

		private String message;
		private Long id;
		private String coaschmcode;
		private String coaschmdesc;
		private Integer isactive;

		public JournalSchemeAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				this.service = new JournalSchemeDao();
				this.coaschmhdr = new CoaSchmHdr();

				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());

				this.office = new Office();
				this.setOffice(this.office);
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
								case "detail" :
									try
										{
											this.ViewDetail();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "savedetail" :
									try
										{
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
									try
										{
											if (this.pagenumber <= 1)
												{
													this.pagenumber = 1;
												}
											this.Paging();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "next" :
									try
										{
											this.pagenumber += 1;
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
						this.lstcoaschmhdr = this.service.Paging(this.getPagenumber(), this.WhereCond(), "");
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
						this.lstcoaschmhdr = this.service.Paging(this.getPagenumber(), this.WhereCond(), "", true);
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
				this.coaschmhdr = new CoaSchmHdr();
				try
					{
						if (this.getId() != null)
							{
								this.coaschmhdr = this.service.ViewHeader(this.id);
								this.coaschmcode = this.coaschmhdr.getCoaSchmCode();
								this.coaschmdesc = this.coaschmhdr.getCoaSchmDesc();
								this.isactive = this.coaschmhdr.getIsActive();
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

		public void ViewDetail() throws Exception
			{
				this.coaschmhdr = new CoaSchmHdr();
				try
					{
						this.coaschmhdr = this.service.ViewHeader(this.id);
						this.coaschmcode = this.coaschmhdr.getCoaSchmCode();
						this.coaschmdesc = this.coaschmhdr.getCoaSchmDesc();
						this.isactive = this.coaschmhdr.getIsActive();
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
				try
					{
						this.coaschmhdr = new CoaSchmHdr();
						this.coaschmhdr.setPartner(this.getPartner());
						this.coaschmhdr.setCoaSchmCode(this.coaschmcode);
						this.coaschmhdr.setCoaSchmDesc(this.coaschmdesc);
						this.coaschmhdr.setIsActive(this.isactive);
						this.coaschmhdr.setPartner(this.partner);
						this.coaschmhdr.setUsrCrt(BaseAction.sesLoginName());
						this.coaschmhdr.setUsrUpd(BaseAction.sesLoginName());
						this.service.SaveAddHeader(this.coaschmhdr);
						
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
						this.coaschmhdr = new CoaSchmHdr();
						this.coaschmhdr.setId(this.getId());
						this.coaschmhdr.setPartner(this.partner);
						this.coaschmhdr.setCoaSchmCode(this.coaschmcode);
						this.coaschmhdr.setCoaSchmDesc(this.coaschmdesc);
						this.coaschmhdr.setIsActive(this.isactive);
						this.coaschmhdr.setPartner(this.partner);
						
						this.coaschmhdr.setUsrCrt(BaseAction.sesLoginName());
						this.coaschmhdr.setUsrUpd(BaseAction.sesLoginName());
						this.service.SaveAddHeader(this.coaschmhdr);
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
						if (this.getId() != null)
							{
								final CoaSchmHdr coaSchmHdr = new CoaSchmHdr();
								coaSchmHdr.setId(this.getId());
								this.service.SaveDelHeader(coaSchmHdr);
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
		 * @return the coaschmdtl
		 */
		public CoaSchmDtl getCoaschmdtl()
			{
				return this.coaschmdtl;
			}

		/**
		 * @return the coaschmhdr
		 */
		public CoaSchmHdr getCoaschmhdr()
			{
				return this.coaschmhdr;
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
		 * @param coaschmdtl
		 *            the coaschmdtl to set
		 */
		public void setCoaschmdtl(final CoaSchmDtl coaschmdtl)
			{
				this.coaschmdtl = coaschmdtl;
			}

		/**
		 * @param coaschmhdr
		 *            the coaschmhdr to set
		 */
		public void setCoaschmhdr(final CoaSchmHdr coaschmhdr)
			{
				this.coaschmhdr = coaschmhdr;
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

		public JournalSchemeService getJourschemeservice()
			{
				return this.service;
			}

		public void setJourschemeservice(final JournalSchemeService jourschemeservice)
			{
				this.service = jourschemeservice;
			}

		public List<CoaSchmDtl> getLstcoaschmdtl()
			{
				return this.lstcoaschmdtl;
			}

		public void setLstcoaschmdtl(final List<CoaSchmDtl> lstcoaschmdtl)
			{
				this.lstcoaschmdtl = lstcoaschmdtl;
			}

		public List<CoaSchmHdr> getLstcoaschmhdr()
			{
				return this.lstcoaschmhdr;
			}

		public void setLstcoaschmhdr(final List<CoaSchmHdr> lstcoaschmhdr)
			{
				this.lstcoaschmhdr = lstcoaschmhdr;
			}

		public int getPagenumber()
			{
				return this.pagenumber;
			}

		public void setPagenumber(final int pagenumber)
			{
				this.pagenumber = pagenumber;
			}
			
		public String getCoaschmcode()
			{
				return this.coaschmcode;
			}

		public void setCoaschmcode(final String coaschmcode)
			{
				this.coaschmcode = coaschmcode;
			}

		public String getCoaschmdesc()
			{
				return this.coaschmdesc;
			}

		public void setCoaschmdesc(final String coaschmdesc)
			{
				this.coaschmdesc = coaschmdesc;
			}

		public Integer getIsactive()
			{
				return this.isactive;
			}

		public void setIsactive(final Integer isactive)
			{
				this.isactive = isactive;
			}

		public void setId(final Long id)
			{
				this.id = id;
			}

		public Long getId()
			{
				return this.id;
			}

		/**
		 * @return the service
		 */
		public JournalSchemeService getService()
			{
				return this.service;
			}

		/**
		 * @param service
		 *            the service to set
		 */
		public void setService(final JournalSchemeService service)
			{
				this.service = service;
			}

	}
