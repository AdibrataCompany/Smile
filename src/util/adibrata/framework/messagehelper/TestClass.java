/**
 * 
 */
package util.adibrata.framework.messagehelper;

/**
 * @author Henry
 *
 */
import util.adibrata.framework.configuration.EmailConfig;
import util.adibrata.framework.configuration.WebConfig;
import util.adibrata.framework.messagehelper.*;

import java.io.File;
import java.util.Properties;

@SuppressWarnings("unused")
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			EmailConfig lEmailConfig= new EmailConfig();
//			System.out.println(lEmailConfig.Properties("SmtpServer"));
			EmailEntities _ent = new EmailEntities();
			_ent.setTo("henry.sudarma@adibrata.co.id");
			
					
			_ent.setSubject("Test Email");
			_ent.setBodyMessage("test");
			EmailHelper sendemail = new EmailHelper(_ent);
			System.out.println("Sukses");
		}
		catch (Exception e) {
			System.out.println(e.toString());

		}

	}
}


