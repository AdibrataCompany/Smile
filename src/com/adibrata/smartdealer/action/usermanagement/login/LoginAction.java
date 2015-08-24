
package com.adibrata.smartdealer.action.usermanagement.login;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.usermanagement.LoginDao;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.usermanagement.LoginService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

public class LoginAction extends BaseAction implements Preparable
	{
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		Partner partner;
		Office office;
		LoginService service;
		String username;
		String password;
		String mode;
		String message;

		public LoginAction() throws Exception
			{
				
				// TODO Auto-generated constructor stub
			}
			
		public String signin() throws Exception
			{
				
				this.service = new LoginDao();

				if (((this.username != null) & !this.username.equals("")) && ((this.password != null) & !this.password.equals("")))
					{
						if (this.service.PasswordVerification(this.username, this.password))
							{
								this.mode = SUCCESS;
								this.partner = this.service.getPartner();
								BaseAction.setObjpartner(ActionContext.getContext().getSession());
								BaseAction.getObjpartner().put("Partner", this.partner);

								BaseAction.setObjloginname(ActionContext.getContext().getSession());
								BaseAction.getObjloginname().put("LoginName", this.username);

							}
						else
							{
								this.mode = INPUT;
								this.message = "Login Failed";
							}
					}

				return this.mode;

			}

		public String home() throws Exception
			{
				return INPUT;
				
			}
			
		public String dashboard() throws Exception
			{
				return INPUT;
			}
		// @Override
		// public void validate()
		// {
		// if (this.getUsername().length() == 0)
		// {
		// this.addFieldError("userName", "UserName.required");
		// }
		// else if (!this.getUsername().equals("Arpit"))
		// {
		// this.addFieldError("userName", "Invalid User");
		// }
		// if (this.getPassword().length() == 0)
		// {
		// this.addFieldError("password", this.getText("password.required"));
		// }
		// }
		
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
		 * @return the service
		 */
		public LoginService getService()
			{
				return this.service;
			}
			
		/**
		 * @param service
		 *            the service to set
		 */
		public void setService(final LoginService service)
			{
				this.service = service;
			}
			
		/**
		 * @return the username
		 */
		public String getUsername()
			{
				return this.username;
			}
			
		/**
		 * @param username
		 *            the username to set
		 */
		public void setUsername(final String username)
			{
				this.username = username;
			}
			
		/**
		 * @return the password
		 */
		public String getPassword()
			{
				return this.password;
			}
			
		/**
		 * @param password
		 *            the password to set
		 */
		public void setPassword(final String password)
			{
				this.password = password;
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
