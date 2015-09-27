/**
 *
 */

package util.adibrata.framework.messagehelper;

/**
 * @author Henry
 */
import java.util.Properties;

import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import util.adibrata.framework.configuration.EmailConfig;
import util.adibrata.framework.encryption.EncryptionHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

@SuppressWarnings("unused")
public class EmailHelper implements Runnable
	{
		
		Thread mythread;
		private static String lfrom;
		private static String lto;
		private static String lCC;
		private static String lBCC;
		EmailEntities lEnt = new EmailEntities();
		
		public EmailHelper(final EmailEntities pEnt)
			{
				this.lEnt = pEnt;
				
				this.mythread = new Thread(this, "my runnable thread");
				this.mythread.start();
			}
			
		@Override
		public void run()
			{
				final Properties lprop = new Properties(); // System.getProperties();
				final EmailConfig lEmailConfig;
				try
					{
						lEmailConfig = new EmailConfig();
						lfrom = lEmailConfig.Properties("From");
						lto = this.lEnt.getTo();
						lCC = this.lEnt.getCC();
						lBCC = this.lEnt.getBCC();
						
						// lprop.put("mail.smtp.host", lEnt.getMailServer());
						lprop.put("mail.smtp.host", lEmailConfig.Properties("SmtpServer"));
						
						if (lEmailConfig.Properties("UserName") != null)
							{
								lprop.put("mail.smtp.auth", "true");
								lprop.put("mail.user", lEmailConfig.Properties("UserName"));
							}
							
						if (EncryptionHelper.Decrypt3Des(lEmailConfig.Properties("Password")) != null)
							{
								lprop.put("mail.smtp.auth", "true");
								// lprop.put("mail.password", lEnt.getPassword());
								lprop.put("mail.password", EncryptionHelper.Decrypt3Des(lEmailConfig.Properties("Password")));
							}
						final Session session = Session.getDefaultInstance(lprop, new javax.mail.Authenticator()
							{
								@Override
								protected PasswordAuthentication getPasswordAuthentication()
									{
										PasswordAuthentication p = null;
										try
											{
												p = new PasswordAuthentication(lEmailConfig.Properties("UserName"), EncryptionHelper.Decrypt3Des(lEmailConfig.Properties("Password")));
											}
										catch (final Exception e)
											{
												// TODO Auto-generated catch block
												e.printStackTrace();
												
											}
										return p;
									}
							});
						// Session session = Session.getDefaultInstance(lprop);
						// Create a default MimeMessage object.
						final MimeMessage message = new MimeMessage(session);
						
						// Set From: header field of the header.
						message.setFrom(new InternetAddress(lfrom));
						
						// Set To: header field of the header.
						message.addRecipient(Message.RecipientType.TO, new InternetAddress(lto));
						if (lCC != null)
							{
								message.addRecipient(Message.RecipientType.CC, new InternetAddress(lCC));
							}
							
						if (lBCC != null)
							{
								message.addRecipient(Message.RecipientType.BCC, new InternetAddress(lBCC));
							}
							
						// Set Subject: header field
						message.setSubject(this.lEnt.getSubject());
						
						// Send the actual HTML message, as big as you like
						if (this.lEnt.getBodyMessage() == "")
							{
								message.setContent("", "text/html");
							}
						else
							{
								message.setContent(this.lEnt.getBodyMessage(), "text/html");
							}
							
						// Send message
						// addkan thread mode --> Not Yet
						Transport.send(message);
						
					}
				catch (final MessagingException mex)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						try
							{
								ExceptionHelper.WriteException(lEntExp, mex);
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						mex.printStackTrace();
					}
				catch (final Exception lExcp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						try
							{
								ExceptionHelper.WriteException(lEntExp, lExcp);
							}
						catch (final Exception e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						lExcp.printStackTrace();
					}
			}
			
		public void ReadingEmail()
			{
				
				final Properties props = new Properties();
				props.setProperty("mail.store.protocol", "imaps");
				try
					{
						final Session session = Session.getInstance(props, null);
						final Store store = session.getStore();
						store.connect("imap.gmail.com", "yourEmailId@gmail.com", "password");
						final Folder inbox = store.getFolder("INBOX");
						inbox.open(Folder.READ_ONLY);
						final Message msg = inbox.getMessage(inbox.getMessageCount());
						final Address[] in = msg.getFrom();
						for (final Address address : in)
							{
								System.out.println("FROM:" + address.toString());
							}
						final Multipart mp = (Multipart) msg.getContent();
						final BodyPart bp = mp.getBodyPart(0);
						System.out.println("SENT DATE:" + msg.getSentDate());
						System.out.println("SUBJECT:" + msg.getSubject());
						System.out.println("CONTENT:" + bp.getContent());
					}
				catch (final Exception mex)
					{
						mex.printStackTrace();
					}
					
			}
	}
