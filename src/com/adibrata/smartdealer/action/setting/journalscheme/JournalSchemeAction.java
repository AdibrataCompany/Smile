
package com.adibrata.smartdealer.action.setting.journalscheme;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.setting.JournalSchemeDao;
import com.adibrata.smartdealer.model.CoaSchmDtl;
import com.adibrata.smartdealer.model.CoaSchmHdr;
import com.adibrata.smartdealer.model.ListCoaSchmDtl;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.setting.JournalSchemeService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class JournalSchemeAction extends BaseAction implements SessionAware, Preparable
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
		private List<ListCoaSchmDtl> lstcoaschmdtl;
		private List<CoaSchmHdr> lstcoaschmhdr;
		private Map<String, Object> sescoaschmdtl;
		private String searchcriteria;
		private String searchvalue;
		private int pagenumber;

		private String message;
		private Long id;
		private String coaschmcode;
		private String coaschmdesc;
		private Boolean isactive;

		public JournalSchemeAction() throws Exception
			{
				// TODO Auto-generated constructor stub
				
				this.partner = new Partner();
				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.office = new Office();
				this.setOffice(this.office);

				if (this.pagenumber == 0)
					{
						this.pagenumber = 1;
					}
			}
			
		// @Override
		// public void setSession(final Map<String, Object> session)
		// {
		// // TODO Auto-generated method stub
		// // this.dtl = ActionContext.getContext().getSession();
		// try
		// {
		// this.sescoaschmdtl = session;
		// }
		// catch (final Exception exp)
		// {
		//
		// }
		// }
		
		@Override
		public String execute() throws Exception
			{
				if (this.mode != null)
					{
						switch (this.mode)
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
											this.mode = this.ViewData();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "add" :
									try
										{
											this.InitialAdd();
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
											this.mode = this.SaveDelete();
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
						this.mode = INPUT;
					}
				return this.mode;
			}
			
		public String entry()
			{
				if (this.mode != null)
					{
						switch (this.mode)
							{
								case "save" :
									try
										{
											this.mode = this.SaveJrnlSchm();
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
						try
							{
								this.mode = INPUT;

							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				return this.mode;
			}
			
		private void InitialAdd() throws Exception
			{
				try
					{
						this.coaschmhdr = new CoaSchmHdr();
						this.coaschmhdr.setPartner(this.partner);
						this.coaschmhdr.setId(0);

						this.lstcoaschmdtl = new ArrayList<ListCoaSchmDtl>();
						this.service = new JournalSchemeDao();

						this.lstcoaschmdtl = this.service.ListCoaSchmDtl(this.coaschmhdr);
						
						// if (this.sescoaschmdtl.containsKey("JournalSchemeSetting"))
						// {
						// this.sescoaschmdtl.remove("JournalSchemeSetting");
						// }
						// this.sescoaschmdtl.put("JournalSchemeSetting", this.lstcoaschmdtl);
					}
				catch (final Exception exp)
					{

						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
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
						this.service = new JournalSchemeDao();
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
						this.service = new JournalSchemeDao();
						this.lstcoaschmhdr = this.service.Paging(this.getPagenumber(), this.WhereCond(), "", true);
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
				this.coaschmhdr = new CoaSchmHdr();
				try
					{
						if (this.getId() != null)
							{
								this.service = new JournalSchemeDao();
								this.coaschmhdr = this.service.ViewHeader(this.id);
								this.coaschmcode = this.coaschmhdr.getCoaSchmCode();
								this.coaschmdesc = this.coaschmhdr.getCoaSchmDesc();
								if (this.coaschmhdr.getIsActive() == 1)
									{
										this.isactive = true;
									}
								else
									{
										this.isactive = false;
									}
									
								this.lstcoaschmdtl = this.service.ListCoaSchmDtl(this.coaschmhdr);
								// if (this.sescoaschmdtl.containsKey("JournalSchemeSetting"))
								// {
								// this.sescoaschmdtl.remove("JournalSchemeSetting");
								// }
								// this.sescoaschmdtl.put("JournalSchemeSetting", this.lstcoaschmdtl);
							}
						else
							{
								this.Paging();
								this.mode = INPUT;
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
			
		@SuppressWarnings("unchecked")
		private String SaveJrnlSchm() throws Exception
			{
				try
					{
						this.service = new JournalSchemeDao();
						this.coaschmhdr = new CoaSchmHdr();
						
						// this.lstcoaschmdtl = (List<ListCoaSchmDtl>) this.sescoaschmdtl.get("JournalSchemeSetting");
						this.coaschmhdr.setPartner(this.getPartner());
						this.coaschmhdr.setCoaSchmCode(this.coaschmcode);
						this.coaschmhdr.setCoaSchmDesc(this.coaschmdesc);
						if (this.isactive)
							{
								this.coaschmhdr.setIsActive(1);
							}
						else
							{
								this.coaschmhdr.setIsActive(0);
							}

						this.coaschmhdr.setPartner(this.partner);
						this.coaschmhdr.setUsrCrt(BaseAction.sesLoginName());
						this.coaschmhdr.setUsrUpd(BaseAction.sesLoginName());
						
						this.service = new JournalSchemeDao();
						this.service.Save(BaseAction.sesLoginName(), this.coaschmhdr, this.lstcoaschmdtl);
						this.mode = SUCCESS;

						this.setMessage(BaseAction.SuccessMessage());
						// if (this.sescoaschmdtl.containsKey("JournalSchemeSetting"))
						// {
						// this.sescoaschmdtl.remove("JournalSchemeSetting");
						// }
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
						if (this.getId() != null)
							{
								this.service = new JournalSchemeDao();
								this.coaschmhdr = new CoaSchmHdr();
								this.coaschmhdr.setId(this.getId());
								this.service.Delete(this.coaschmhdr);
								this.setMessage(BaseAction.SuccessMessage());
							}
						else
							{
								this.mode = INPUT;
								this.setMessage(BaseAction.SelectFirst());
							}
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
			
		/**
		 * @return the coaschmdtl
		 */
		public CoaSchmDtl getCoaschmdtl()
			{
				return this.coaschmdtl;
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
		 * @return the coaschmhdr
		 */
		public CoaSchmHdr getCoaschmhdr()
			{
				return this.coaschmhdr;
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
		 * @return the lstcoaschmdtl
		 */
		public List<ListCoaSchmDtl> getLstcoaschmdtl()
			{
				return this.lstcoaschmdtl;
			}
			
		/**
		 * @param lstcoaschmdtl
		 *            the lstcoaschmdtl to set
		 */
		public void setLstcoaschmdtl(final List<ListCoaSchmDtl> lstcoaschmdtl)
			{
				this.lstcoaschmdtl = lstcoaschmdtl;
			}
			
		/**
		 * @return the lstcoaschmhdr
		 */
		public List<CoaSchmHdr> getLstcoaschmhdr()
			{
				return this.lstcoaschmhdr;
			}
			
		/**
		 * @param lstcoaschmhdr
		 *            the lstcoaschmhdr to set
		 */
		public void setLstcoaschmhdr(final List<CoaSchmHdr> lstcoaschmhdr)
			{
				this.lstcoaschmhdr = lstcoaschmhdr;
			}
			
		/**
		 * @return the sescoaschmdtl
		 */
		public Map<String, Object> getSescoaschmdtl()
			{
				return this.sescoaschmdtl;
			}
			
		/**
		 * @param sescoaschmdtl
		 *            the sescoaschmdtl to set
		 */
		public void setSescoaschmdtl(final Map<String, Object> sescoaschmdtl)
			{
				this.sescoaschmdtl = sescoaschmdtl;
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
		 * @return the coaschmcode
		 */
		public String getCoaschmcode()
			{
				return this.coaschmcode;
			}
			
		/**
		 * @param coaschmcode
		 *            the coaschmcode to set
		 */
		public void setCoaschmcode(final String coaschmcode)
			{
				this.coaschmcode = coaschmcode;
			}
			
		/**
		 * @return the coaschmdesc
		 */
		public String getCoaschmdesc()
			{
				return this.coaschmdesc;
			}
			
		/**
		 * @param coaschmdesc
		 *            the coaschmdesc to set
		 */
		public void setCoaschmdesc(final String coaschmdesc)
			{
				this.coaschmdesc = coaschmdesc;
			}
			
		/**
		 * @return the isactive
		 */
		public Boolean getIsactive()
			{
				return this.isactive;
			}
			
		/**
		 * @param isactive
		 *            the isactive to set
		 */
		public void setIsactive(final Boolean isactive)
			{
				this.isactive = isactive;
			}
			
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

			}
	}
