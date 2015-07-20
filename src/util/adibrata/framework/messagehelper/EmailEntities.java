
package util.adibrata.framework.messagehelper;


public class EmailEntities
	{
		private String From;
		private String To;
		private String CC;
		private String BCC;
		private String Subject;
		private String MailServer;
		private String UserName;
		private String Password;
		private String BodyMessage;
		
		public String getCC()
			{
				return this.CC;
			}
		
		public void setCC(final String cC)
			{
				this.CC = cC;
			}
		
		public String getTo()
			{
				return this.To;
			}
		
		public void setTo(final String to)
			{
				this.To = to;
			}
		
		public String getFrom()
			{
				return this.From;
			}
		
		public void setFrom(final String from)
			{
				this.From = from;
			}
		
		public String getBCC()
			{
				return this.BCC;
			}
		
		public void setBCC(final String bCC)
			{
				this.BCC = bCC;
			}
		
		public String getSubject()
			{
				return this.Subject;
			}
		
		public void setSubject(final String subject)
			{
				this.Subject = subject;
			}
		
		public String getMailServer()
			{
				return this.MailServer;
			}
		
		public void setMailServer(final String mailServer)
			{
				this.MailServer = mailServer;
			}
		
		public String getUserName()
			{
				return this.UserName;
			}
		
		public void setUserName(final String userName)
			{
				this.UserName = userName;
			}
		
		public String getPassword()
			{
				return this.Password;
			}
		
		public void setPassword(final String password)
			{
				this.Password = password;
			}
		
		public String getBodyMessage()
			{
				return this.BodyMessage;
			}
		
		public void setBodyMessage(final String bodyMessage)
			{
				this.BodyMessage = bodyMessage;
			}
		
	}
