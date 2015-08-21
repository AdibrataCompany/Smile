
package com.adibrata.smartdealer.action.accmnt;

import java.util.List;
import java.util.Map;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.model.AgreementList;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.accmaint.AgreementService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class AgrmntInfoAction extends BaseAction implements Preparable
	{

		/**
		*
		*/
		private String mode;
		private Partner partner;
		private Office office;
		private Long officeid;
		private String officename;
		private Long id;
		private int pagenumber;
		private static final long serialVersionUID = 1L;
		private AgreementService service;
		
		private List<AgreementList> lstagrmnt;
		private Map<Long, String> lstoffice;
		private String searchcriteria;
		private String searchvalue;
		
		public AgrmntInfoAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				try
					{
						this.partner = new Partner();
						this.office = new Office();
						this.partner.setPartnerCode(BaseAction.sesPartnerCode());
						this.office.setId(BaseAction.sesOfficeId());
						this.lstoffice = this.ListOffice(this.partner);
					}
				catch (final Exception exp)
					{

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
						strMode = INPUT;
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
						this.lstagrmnt = this.service.Paging(this.getPagenumber(), this.WhereCond(), "");
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
						this.lstagrmnt = this.service.Paging(this.getPagenumber(), this.WhereCond(), "", true);
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
		 * @return the officeid
		 */
		public Long getOfficeid()
			{
				return this.officeid;
			}
			
		/**
		 * @param officeid
		 *            the officeid to set
		 */
		public void setOfficeid(final Long officeid)
			{
				this.officeid = officeid;
			}
			
		/**
		 * @return the officename
		 */
		public String getOfficename()
			{
				return this.officename;
			}
			
		/**
		 * @param officename
		 *            the officename to set
		 */
		public void setOfficename(final String officename)
			{
				this.officename = officename;
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
		 * @return the service
		 */
		public AgreementService getService()
			{
				return this.service;
			}
			
		/**
		 * @param service
		 *            the service to set
		 */
		public void setService(final AgreementService service)
			{
				this.service = service;
			}
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
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
		 * @return the lstagrmnt
		 */
		public List<AgreementList> getLstagrmnt()
			{
				return this.lstagrmnt;
			}

		/**
		 * @param lstagrmnt
		 *            the lstagrmnt to set
		 */
		public void setLstagrmnt(final List<AgreementList> lstagrmnt)
			{
				this.lstagrmnt = lstagrmnt;
			}

		/**
		 * @return the lstoffice
		 */
		public Map<Long, String> getLstoffice()
			{
				return this.lstoffice;
			}

		/**
		 * @param lstoffice
		 *            the lstoffice to set
		 */
		public void setLstoffice(final Map<Long, String> lstoffice)
			{
				this.lstoffice = lstoffice;
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
	}
