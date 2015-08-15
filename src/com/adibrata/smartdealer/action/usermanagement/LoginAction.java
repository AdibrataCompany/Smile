
package com.adibrata.smartdealer.action.usermanagement;

/**
 * @author Henry
 */
import java.util.List;

import com.adibrata.smartdealer.action.BaseAction;
import com.adibrata.smartdealer.dao.usermanagement.LoginDao;
import com.adibrata.smartdealer.model.MsUser;
import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.service.usermanagement.LoginService;
import com.opensymphony.xwork2.Preparable;

public class LoginAction extends BaseAction implements Preparable
	{
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		private String mode;
		private LoginService service;
		private Partner partner;
		private Office office;
		private List<MsUser> lstMsUser;
		private String searchcriteria;
		private String searchvalue;
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private String message;

		private String username;
		private String password;

		public LoginAction() throws Exception
			{
				
				// TODO Auto-generated constructor stub
			}

		@Override
		public String execute() throws Exception
			{
				return "start";

			}

		public String signin() throws Exception
			{
				this.service = new LoginDao();
				String status;
				if (this.service.PasswordVerification(this.username, this.password))
					{
						status = SUCCESS;
					}
				else
					{
						status = "input";
					}
				return status;
				
			}
			
		public String home() throws Exception
			{
				return "start";
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
		 * @return the serialversionuid
		 */
		public static Long getSerialversionuid()
			{
				return serialVersionUID;
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
		 * @return the lstMsUser
		 */
		public List<MsUser> getLstMsUser()
			{
				return this.lstMsUser;
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
		 * @param lstMsUser
		 *            the lstMsUser to set
		 */
		public void setLstMsUser(final List<MsUser> lstMsUser)
			{
				this.lstMsUser = lstMsUser;
			}

		public String getMode()
			{
				return this.mode;
			}

		public void setMode(final String mode)
			{

				this.mode = mode;
			}

		@Override
		public void prepare() throws Exception
			{

				// TODO Auto-generated method stub

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

		public String getPassword()
			{
				return this.password;
			}

		public void setPassword(final String password)
			{
				this.password = password;
			}

		public String getUsername()
			{
				return this.username;
			}

		public void setUsername(final String username)
			{
				this.username = username;
			}

	}
