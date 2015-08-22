/**
 *
 */

package com.adibrata.smartdealer.action.usermanagement.role;

/**
 * @author Henry
 */
import java.util.List;

import com.adibrata.smartdealer.model.MsRole;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.usermanagement.RoleService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class RoleAction extends ActionSupport implements Preparable
	{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String mode;
		private RoleService roleService;
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

		private String Paging() throws Exception
			{

				String status = "";
				try
					{
						String wherecond = "";
						if (this.getSearchcriteria().contains("%"))
							{
								wherecond = this.getSearchvalue() + " like " + this.getSearchcriteria();
							}
						else
							{
								wherecond = this.getSearchvalue() + " = " + this.getSearchcriteria();
							}

						this.lstRole = this.roleService.Paging(this.getPageNumber(), wherecond, "");

						status = "Success";
					}
				catch (final Exception exp)
					{
						status = "Failed";
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return status;
			}

		private String SaveAdd() throws Exception
			{
				String status = "";
				try
					{
						final MsRole msRole = new MsRole();
						/*
						 * bankAccount.setBankAccountCode(this.getBankAccountCode());
						 * bankAccount.setBankAccountName(this.getBankAccountName());
						 * bankAccount.setCoacode(this.getCoacode());
						 */

						this.roleService.SaveAdd(msRole);
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
				String status = "";
				try
					{
						final MsRole msRole = new MsRole();
						msRole.setId(this.getId());

						/*
						 * bankAccount.setBankAccountCode(this.getBankAccountCode());
						 * bankAccount.setBankAccountName(this.getBankAccountName());
						 * bankAccount.setCoacode(this.getCoacode());
						 */

						this.roleService.SaveEdit(msRole);
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

		private String SaveDelete() throws Exception
			{
				String status = "";
				try
					{
						final MsRole msRole = new MsRole();
						msRole.setId(this.getId());
						this.roleService.SaveDel(msRole);
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
		 * @return the roleService
		 */
		public RoleService getRoleService()
			{
				return this.roleService;
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
		 * @return the msRole
		 */
		public MsRole getMsRole()
			{
				return this.msRole;
			}

		/**
		 * @return the lstRole
		 */
		public List<MsRole> getLstRole()
			{
				return this.lstRole;
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
		 * @param roleService
		 *            the roleService to set
		 */
		public void setRoleService(final RoleService roleService)
			{
				this.roleService = roleService;
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
		 * @param msRole
		 *            the msRole to set
		 */
		public void setMsRole(final MsRole msRole)
			{
				this.msRole = msRole;
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
		 *
		 */
		public RoleAction()
			{
				// TODO Auto-generated constructor stub
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
									strMode = this.Paging();
								case "edit" :

								case "del" :
									return this.SaveDelete();
								case "add" :

									strMode = this.SaveAdd();
								case "saveadd" :
									strMode = this.SaveAdd();
								case "saveedit" :
									strMode = this.SaveEdit();
								case "back" :

								default :
									return "failed";
							}
					}
				else
					{
						strMode = "start";
					}
				return strMode;
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

	}
