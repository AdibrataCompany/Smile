/**
 * 
 */
package util.adibrata.framework.messagehelper;

/**
 * @author Henry
 *
 */
import java.util.*;
import java.lang.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

import java.util.Properties;

import util.adibrata.framework.configuration.*;
import util.adibrata.framework.encryption.EncryptionHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.framework.messagehelper.*;

@SuppressWarnings("unused")
public class EmailHelper implements Runnable {

	Thread mythread;
	private static String lfrom;
	private static String lto;
	private static String lCC;
	private static String lBCC;
	private static String lSubject;
	private static String lMailServer;
	private static String lUserName;
	private static String lPassword;
	private static String lBodyMessage;
	private static String lSmtpServer;
	EmailEntities lEnt = new EmailEntities();

	public EmailHelper(EmailEntities pEnt) {
		lEnt = pEnt;

		mythread = new Thread(this, "my runnable thread");
		mythread.start();
	}

	public void run() {
		Properties lprop = new Properties(); // System.getProperties();
		final EmailConfig lEmailConfig;
		try {
			lEmailConfig = new EmailConfig();
			lfrom = lEmailConfig.Properties("From");
			lto = lEnt.getTo();
			lCC = lEnt.getCC();
			lBCC = lEnt.getBCC();

			// lprop.put("mail.smtp.host", lEnt.getMailServer());
			lprop.put("mail.smtp.host", lEmailConfig.Properties("SmtpServer"));

			if (lEnt.getUserName() != null) {
				lprop.put("mail.smtp.auth", "true");
				lprop.put("mail.user", lEmailConfig.Properties("UserName"));
			}

			if (lEnt.getPassword() != null) {
				lprop.put("mail.smtp.auth", "true");
				// lprop.put("mail.password", lEnt.getPassword());
				lprop.put("mail.password", EncryptionHelper
						.Decrypt3Des(lEmailConfig.Properties("Password")));

			}
			Session session = Session.getDefaultInstance(lprop,
					new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							PasswordAuthentication p = null;
							try {
								p = new PasswordAuthentication(
										lEmailConfig.Properties("UserName"),
										EncryptionHelper.Decrypt3Des(lEmailConfig
												.Properties("Password")));
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();

							}
							return p;
						}
					});
			// Session session = Session.getDefaultInstance(lprop);
			// Create a default MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(lfrom));

			// Set To: header field of the header.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					lto));
			if (lCC != null) {
				message.addRecipient(Message.RecipientType.CC,
						new InternetAddress(lCC));
			}

			if (lBCC != null) {
				message.addRecipient(Message.RecipientType.BCC,
						new InternetAddress(lBCC));
			}

			// Set Subject: header field
			message.setSubject(lEnt.getSubject());

			// Send the actual HTML message, as big as you like
			if (lEnt.getBodyMessage() == "") {
				message.setContent("", "text/html");
			} else {
				message.setContent(lEnt.getBodyMessage(), "text/html");
			}

			// Send message
			// addkan thread mode --> Not Yet
			Transport.send(message);

		} catch (MessagingException mex) {
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			try {
				ExceptionHelper.WriteException(lEntExp, mex);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			mex.printStackTrace();
		} catch (Exception lExcp) {
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			try {
				ExceptionHelper.WriteException(lEntExp, lExcp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lExcp.printStackTrace();
		}
	}
}
