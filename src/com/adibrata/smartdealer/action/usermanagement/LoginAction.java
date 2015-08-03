
package com.adibrata.smartdealer.action.usermanagement;

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
		private MsUser msuser;
		private int pageNumber;
		private String usrUpd;
		private String usrCrt;
		private String message;
		private String username;
		private String password;
		
		@Override
		public String execute()
			{
				String strMode;
				strMode = this.mode;
				
				if (this.mode != null)
					{
						switch (strMode)
							{
								case "login" :
									try
										{
											strMode = this.Checklogin();
										}
									catch (final Exception e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									break;
									
								default :
									return ERROR;
							}
					}
				else
					{
						strMode = "login";
						this.username = "";
						this.password = "";
						
					}
				return strMode;
			}
			
		@Override
		public void prepare()
			{
				try
					{
						this.service = new LoginDao();
					}
				catch (final Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}

		private String Checklogin() throws Exception
			{
				String status = "login";
				if (this.getUsername().equals(""))
					{
						this.setMessage("Please input User Name");
					}
				else if (this.getPassword().equals(""))
					{
						this.setMessage("Please input password");
					}
				else
					{
						this.service = new LoginDao();
						if (this.service.PasswordVerification(this.getUsername(), this.getPassword()))
							{
								status = SUCCESS;
							}
						else
							{
								this.setMessage("Please verify your username and password");
							}
							
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
		 * @return the msuser
		 */
		public MsUser getMsuser()
			{
				return this.msuser;
			}
			
		/**
		 * @param msuser
		 *            the msuser to set
		 */
		public void setMsuser(final MsUser msuser)
			{
				this.msuser = msuser;
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
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}
			
	}
