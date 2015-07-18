/**
 * 
 */
package util.adibrata.framework.license;

import util.adibrata.framework.configuration.LicenseConfig;
/**
 * @author Henry
 *
 */
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class License {

	private static LicenseConfig lLicenseConfig;

	public static Boolean ExpiredLicense(int intUser) throws Exception {
		try {
			lLicenseConfig.Properties("ExpiredDate");
		} catch (final Exception lExcp) {
			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExcp);
		} finally {

		}
		return false;

	}

	public static Boolean OfficeLicense(int intUser) throws Exception {
		try {
			lLicenseConfig.Properties("OfficeNumber");
		} catch (final Exception lExcp) {
			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExcp);
		} finally {

		}
		return false;

	}

	public static Boolean UserLicense(int intUser) throws Exception {
		try {
			lLicenseConfig.Properties("UserNumber");
		} catch (final Exception lExcp) {
			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExcp);
		} finally {

		}
		return false;

	}

	public License() throws Exception {
		lLicenseConfig = new LicenseConfig();
	}
}
