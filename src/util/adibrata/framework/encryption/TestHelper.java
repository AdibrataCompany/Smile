/**
 * 
 */
package util.adibrata.framework.encryption;

/**
 * @author Henry
 *
 */
import util.adibrata.framework.encryption.*;

@SuppressWarnings("unused")
public class TestHelper {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String a = EncryptionHelper.Encrypt3Des("Hs6265287");
		String b = EncryptionHelper.Decrypt3Des(a);
		System.out.println(a);
		System.out.println(b);
		System.out.println (EncryptionHelper.EncryptSHA("Henry Sudarma"));
	}
}
