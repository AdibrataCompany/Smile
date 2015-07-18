package util.adibrata.framework.messagehelper;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.Table;

@SuppressWarnings({ "unused", "serial" })
@Entity
public class EmailEntities implements Serializable{
	private String From;
	private String To;
	private String CC;
	private String BCC;
	private String Subject;
	private String MailServer;
	private String UserName;
	private String Password;
	private String BodyMessage;
	
	
	public String getCC() {
		return CC;
	}

	public void setCC(String cC) {
		CC = cC;
	}

	public String getTo() {
		return To;
	}

	public void setTo(String to) {
		To = to;
	}

	public String getFrom() {
		return From;
	}

	public void setFrom(String from) {
		From = from;
	}

	public String getBCC() {
		return BCC;
	}

	public void setBCC(String bCC) {
		BCC = bCC;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getMailServer() {
		return MailServer;
	}

	public void setMailServer(String mailServer) {
		MailServer = mailServer;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getBodyMessage() {
		return BodyMessage;
	}

	public void setBodyMessage(String bodyMessage) {
		BodyMessage = bodyMessage;
	}


	
}
