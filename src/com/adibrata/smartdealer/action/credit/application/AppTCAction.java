
package com.adibrata.smartdealer.action.credit.application;

import com.adibrata.smartdealer.action.BaseAction;
import com.opensymphony.xwork2.Preparable;

public class AppTCAction extends BaseAction implements Preparable
	{

		/**
		*
		*/
		private static final long serialVersionUID = 1L;

		private String message;
		private String mode;
		private String usrUpd;
		private String usrCrt;

		private static final long serialVersionUID = 1L; private long id;

		public AppTCAction() throws Exception
			{
				// TODO Auto-generated constructor stub
			}

		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

			}

		public String getMessage()
			{
				return this.message;
			}

		public void setMessage(final String message)
			{
				this.message = message;
			}

		public String getMode()
			{
				return this.mode;
			}

		public void setMode(final String mode)
			{
				this.mode = mode;
			}

		public String getUsrUpd()
			{
				return this.usrUpd;
			}

		public void setUsrUpd(final String usrUpd)
			{
				this.usrUpd = usrUpd;
			}

		public String getUsrCrt()
			{
				return this.usrCrt;
			}

		public void setUsrCrt(final String usrCrt)
			{
				this.usrCrt = usrCrt;
			}

		public Long getId()
			{
				return this.id;
			}

		public void setId(final Long id)
			{
				this.id = id;
			}

		public static long getSerialversionuid()
			{
				return serialVersionUID;
			}

	}
