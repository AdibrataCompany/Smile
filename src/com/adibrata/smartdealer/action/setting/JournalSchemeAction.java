
package com.adibrata.smartdealer.action.setting;

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
		private JournalSchemeService jourSchemeService;
		private CoaSchmDtl coaschmdtl;
		private CoaSchmHdr coaschmhdr;
		private Partner partner;
		private Office office;
		private List<CoaSchmDtl> lstCoaSchmDtl;
		private List<CoaSchmHdr> lstcoaSchmHdr;
		private String searchcriteria;
		private String searchvalue;
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private String message;
		private long id;
		private String coaSchmCode;
		private String coaSchmDesc;
		private Integer isActive;

		public JournalSchemeAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				final JournalSchemeService jourschemeservice = new JournalSchemeDao();

				this.jourSchemeService = jourschemeservice;
				final Partner partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				final Office office = new Office();
				final CoaSchmHdr coaSchmHdr = new CoaSchmHdr();

				this.setPartner(partner);
				this.setOffice(office);
				this.setCoaschmhdr(coaSchmHdr);
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
									this.Paging();
									break;
								case "edit" :
									this.ViewData();
									break;
								case "savedel" :
									strMode = this.SaveDelete();
									break;
								case "saveadd" :
									strMode = this.SaveAdd();
									break;
								case "saveedit" :
									strMode = this.SaveEdit();
									break;
								case "detail" :
									this.ViewDetail();
									break;
								case "savedetail" :

									break;
								case "first" :
									this.pageNumber = 1;
									this.Paging();
									break;
								case "prev" :
									this.pageNumber -= 1;
									if (this.pageNumber <= 1)
										{
											this.pageNumber = 1;
										}
									this.Paging();
									break;
								case "next" :
									this.pageNumber += 1;
									this.Paging();
									break;
								case "last" :
									this.Paging(1);
									break;
								default :
									break;
							}
					}
				else
					{
						this.pageNumber = 1;
						this.Paging();
						strMode = "start";
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
						this.lstcoaSchmHdr = this.jourSchemeService.Paging(this.getPageNumber(), this.WhereCond(), "");
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
						this.lstcoaSchmHdr = this.jourSchemeService.Paging(this.getPageNumber(), this.WhereCond(), "", true);
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
				this.coaschmhdr = new CoaSchmHdr();
				try
					{
						this.coaschmhdr = this.jourSchemeService.ViewHeader(this.id);
						this.coaSchmCode = this.coaschmhdr.getCoaSchmCode();
						this.coaSchmDesc = this.coaschmhdr.getCoaSchmDesc();
						this.isActive = this.coaschmhdr.getIsActive();
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

		public void ViewDetail() throws Exception
			{
				this.coaschmhdr = new CoaSchmHdr();
				try
					{
						this.coaschmhdr = this.jourSchemeService.ViewHeader(this.id);
						this.coaSchmCode = this.coaschmhdr.getCoaSchmCode();
						this.coaSchmDesc = this.coaschmhdr.getCoaSchmDesc();
						this.isActive = this.coaschmhdr.getIsActive();
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
						final CoaSchmHdr coaSchmHdr = new CoaSchmHdr();
						coaSchmHdr.setCoaSchmCode(this.coaSchmCode);
						coaSchmHdr.setCoaSchmDesc(this.coaSchmDesc);
						coaSchmHdr.setIsActive(this.isActive);
						coaSchmHdr.setPartner(this.partner);
						this.jourSchemeService.SaveAddHeader(coaSchmHdr);
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
						final CoaSchmHdr coaSchmHdr = new CoaSchmHdr();
						coaSchmHdr.setId(this.getId());
						coaSchmHdr.setCoaSchmCode(this.coaSchmCode);
						coaSchmHdr.setCoaSchmDesc(this.coaSchmDesc);
						coaSchmHdr.setIsActive(this.isActive);
						coaSchmHdr.setPartner(this.partner);
						coaSchmHdr.setUsrUpd(this.usrUpd);
						this.jourSchemeService.SaveAddHeader(coaSchmHdr);
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
						final CoaSchmHdr coaSchmHdr = new CoaSchmHdr();
						coaSchmHdr.setId(this.getId());
						this.jourSchemeService.SaveDelHeader(coaSchmHdr);
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
		 * @return the jourSchemeService
		 */
		public JournalSchemeService getJourSchemeService()
			{
				return this.jourSchemeService;
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
		 * @return the lstCoaSchmDtl
		 */
		public List<CoaSchmDtl> getLstCoaSchmDtl()
			{
				return this.lstCoaSchmDtl;
			}

		/**
		 * @return the lstcoaSchmHdr
		 */
		public List<CoaSchmHdr> getLstcoaSchmHdr()
			{
				return this.lstcoaSchmHdr;
			}

		/**
		 * @param jourSchemeService
		 *            the jourSchemeService to set
		 */
		public void setJourSchemeService(final JournalSchemeService jourSchemeService)
			{
				this.jourSchemeService = jourSchemeService;
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

		/**
		 * @param lstCoaSchmDtl
		 *            the lstCoaSchmDtl to set
		 */
		public void setLstCoaSchmDtl(final List<CoaSchmDtl> lstCoaSchmDtl)
			{
				this.lstCoaSchmDtl = lstCoaSchmDtl;
			}

		/**
		 * @param lstcoaSchmHdr
		 *            the lstcoaSchmHdr to set
		 */
		public void setLstcoaSchmHdr(final List<CoaSchmHdr> lstcoaSchmHdr)
			{
				this.lstcoaSchmHdr = lstcoaSchmHdr;
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
		 * @return the pageNumber
		 */
		public int getPageNumber()
			{
				return this.pageNumber;
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
		 * @param pageNumber
		 *            the pageNumber to set
		 */
		public void setPageNumber(final int pageNumber)
			{
				this.pageNumber = pageNumber;
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
		 * @param message
		 *            the message to set
		 */
		public void setMessage(final String message)
			{
				this.message = message;
			}

		/**
		 * @return the id
		 */
		public long getId()
			{
				return this.id;
			}

		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(final long id)
			{
				this.id = id;
			}

		public String getCoaSchmCode()
			{
				return this.coaSchmCode;
			}

		public void setCoaSchmCode(final String coaSchmCode)
			{
				this.coaSchmCode = coaSchmCode;
			}

		public String getCoaSchmDesc()
			{
				return this.coaSchmDesc;
			}

		public void setCoaSchmDesc(final String coaSchmDesc)
			{
				this.coaSchmDesc = coaSchmDesc;
			}

		public Integer getIsActive()
			{
				return this.isActive;
			}

		public void setIsActive(final Integer isActive)
			{
				this.isActive = isActive;
			}

	}
