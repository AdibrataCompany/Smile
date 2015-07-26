
package com.adibrata.smartdealer.action;

import java.text.SimpleDateFormat;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class BaseAction extends ActionSupport implements Preparable
	{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String messagedescription;

		public SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");

		public BaseAction()
			{
				// TODO Auto-generated constructor stub
			}

		@Override
		public void prepare() throws Exception
			{
				// TODO Auto-generated method stub

			}

		public static void RenderMenu()
			{

			}

		public static String ErrorMessage()
			{
				return "Failed on Save";

			}

		public static String SuccessMessage()
			{
				return "Success On Save";

			}
			
		public static String SelectFirst()
			{
				return "Please Select a Data First";

			}
			
		public static String sesPartnerCode()
			{
				return "001";
			}

		public static long sesOfficeId()
			{
				return 1;
			}

		public static String sesLoginName()
			{
				return "Arga";
			}

		public static int PageRecord()
			{
				return 10;
			}

		/**
		 * @return the messagedescription
		 */
		public String getMessagedescription()
			{
				return this.messagedescription;
			}

		/**
		 * @param messagedescription
		 *            the messagedescription to set
		 */
		public void setMessagedescription(final String messagedescription)
			{
				this.messagedescription = messagedescription;
			}

	}
