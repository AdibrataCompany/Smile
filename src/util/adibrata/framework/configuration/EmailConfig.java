/**
 * 
 */
package util.adibrata.framework.configuration;

import java.io.File;
import java.util.Properties;

import util.adibrata.framework.cachehelper.Caching;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

/**
 * @author Henry
 *
 */
public class EmailConfig {
	private Properties symbolmap;

	public EmailConfig() throws Exception {
		this.symbolmap = new Properties();
		File file;
		final Caching<String, Properties> cache = new Caching<String, Properties>();
		try {
			/*
			 * file = new File("Config/email.config"); symbolmap.loadFromXML(
			 * file.toURI().toURL().openStream() );
			 */
			// Populate the symbol map from the XML file
			if (cache.get("EmailConfig") == null) {
				file = new File("Config/email.config");
				this.symbolmap.loadFromXML(file.toURI().toURL().openStream());
				cache.put("EmailConfig", this.symbolmap);
			} else {
				this.symbolmap = cache.get("EmailConfig");
			}

		} catch (final Exception lExcp) {
			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExcp);
		} finally {
		}
	}

	// variable length arguments are packed into an array
	// which can be accessed and passed just like any array
	public String Properties(String symbol, String... variables)
			throws Exception {
		// Retrieve the value of the associated key
		String message = null;
		final Caching<String, String> cache = new Caching<String, String>();
		try {
			if (cache.get(symbol) == null) {
				message = this.symbolmap.getProperty(symbol);
				cache.put(symbol, message);
			} else {
				message = cache.get(symbol);
			}
			if (message == null) {
				return "";
			}
		} catch (final Exception lExcp) {
			final ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExcp);
		}
		// Interpolate parameters if necessary
		// and return the message
		finally {
			return String.format(message, variables);
		}

	}
}
