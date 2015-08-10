/**
 *
 */

package com.adibrata.smartdealer.action.usermanagement;

/**
 * @author Henry
 */
import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.usermanagement.RoleDao;
import com.adibrata.smartdealer.model.MsRole;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.usermanagement.RoleService;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class RoleAction extends BaseAction implements Preparable
	{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String mode;
		private RoleService service;
		private MsRole role;
		private Partner partner;
		private Office office;
		private MsRole msRole;
		private List<MsRole> lstRole;
		private String searchcriteria;
		private String searchvalue;
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private String message;
		private Long id;
		private Boolean isactive;
		private String rolename;

		public RoleAction() throws Exception
			{
				this.partner = new Partner();
				this.office = new Office();

				this.partner.setPartnerCode(BaseAction.sesPartnerCode());
				this.office.setId(BaseAction.sesOfficeId());

				if (this.pageNumber == 0)
					{
						this.pageNumber = 1;
					}

				this.service = new RoleDao();
				this.role = new MsRole();
			}

		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

			}

		@Override
		public String execute()
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
											this.ViewData();
										}
									catch (final Exception e1)
										{
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									break;
								case "savedel" :
									try
										{
											strMode = this.SaveDelete();
											break;
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
								case "saveadd" :
									try
										{
											strMode = this.SaveAdd();
											break;
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
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
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
						this.pageNumber = 1;
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

		/**
		 *
		 */

		private String WhereCond()
			{
				final StringBuilder wherecond = new StringBuilder();
				wherecond.append("partnerCode = '" + BaseAction.sesPartnerCode() + "'");
				if ((this.getSearchvalue() != null) && !this.getSearchcriteria().equals("") && !this.getSearchcriteria().equals("0"))
					{
						wherecond.append(" and ");
						if (this.getSearchcriteria().contains("%"))
							{
								wherecond.append(this.getSearchvalue() + " like '" + this.getSearchcriteria() + "' ");
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
						this.lstRole = this.service.Paging(this.getPageNumber(), this.WhereCond(), "");
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

						this.lstRole = this.service.Paging(this.getPageNumber(), this.WhereCond(), "", true);
						this.pageNumber = this.service.getCurrentpage();
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

				try
					{
						if (this.getId() != null)
							{
								this.role = new MsRole();
								this.role = this.service.View(this.getId());
								this.rolename = this.role.getRoleName();
								if (this.role.getIsActive() == 1)
									{
										this.isactive = true;
									}
								else
									{
										this.isactive = false;
									}
							}
						else
							{
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
			}

		private String SaveAdd() throws Exception
			{
				String status = this.mode;
				try
					{
						this.role = new MsRole();
						this.role.setPartner(this.getPartner());
						this.role.setRoleName(this.getRolename());
						if (this.isactive)
							{
								this.role.setIsActive((short) 1);
							}
						else
							{
								this.role.setIsActive((short) 0);
							}
						this.role.setUsrCrt(BaseAction.sesLoginName());
						this.role.setUsrUpd(BaseAction.sesLoginName());
						this.service.SaveAdd(this.role);
						status = SUCCESS;

					}
				catch (final Exception exp)

					{
						status = ERROR;
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;

			}

		private String SaveEdit() throws Exception
			{
				String status = this.mode;
				try
					{
						if (this.getId() != null)
							{
								this.role = this.service.View(this.getId());
								this.role.setId(this.getId());
								this.role.setPartner(this.getPartner());
								this.role.setRoleName(this.getRolename());
								if (this.isactive)
									{
										this.role.setIsActive((short) 1);
									}
								else
									{
										this.role.setIsActive((short) 0);
									}
								this.role.setUsrCrt(BaseAction.sesLoginName());
								this.role.setUsrUpd(BaseAction.sesLoginName());
								this.service.SaveEdit(this.role);
								status = SUCCESS;
							}
						else
							{
								this.setMessage(BaseAction.SelectFirst());
							}
					}
				catch (final Exception exp)
					{
						status = ERROR;
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}
			
		private String SaveDelete() throws Exception
			{
				String status = this.mode;
				try
					{
						this.role.setId(this.getId());
						this.service.SaveDel(this.role);
						status = SUCCESS;
					}
				catch (final Exception exp)
					{
						status = ERROR;
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
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
		public RoleService getService()
			{
				return this.service;
			}

		/**
		 * @param service
		 *            the service to set
		 */
		public void setService(final RoleService service)
			{
				this.service = service;
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
		 * @return the msRole
		 */
		public MsRole getMsRole()
			{
				return this.msRole;
			}

		/**
		 * @param msRole
		 *            the msRole to set
		 */
		public void setMsRole(final MsRole msRole)
			{
				this.msRole = msRole;
			}

		/**
		 * @return the lstRole
		 */
		public List<MsRole> getLstRole()
			{
				return this.lstRole;
			}

		/**
		 * @param lstRole
		 *            the lstRole to set
		 */
		public void setLstRole(final List<MsRole> lstRole)
			{
				this.lstRole = lstRole;
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
		 * @return the pageNumber
		 */
		public int getPageNumber()
			{
				return this.pageNumber;
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
		 * @return the usrUpd
		 */
		public String getUsrUpd()
			{
				return this.usrUpd;
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
		 * @return the usrCrt
		 */
		public String getUsrCrt()
			{
				return this.usrCrt;
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
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
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
		 * @return the rolename
		 */
		public String getRolename()
			{
				return this.rolename;
			}

		/**
		 * @param rolename
		 *            the rolename to set
		 */
		public void setRolename(final String rolename)
			{
				this.rolename = rolename;
			}

		/**
		 * @return the role
		 */
		public MsRole getRole()
			{
				return this.role;
			}

		/**
		 * @param role
		 *            the role to set
		 */
		public void setRole(final MsRole role)
			{
				this.role = role;
			}

	}
