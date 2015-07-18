package util.adibrata.framework.configuration;

import java.io.File;
import java.util.Properties;

import util.adibrata.framework.cachehelper.Caching;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class WebConfig {
	
	private Properties symbolmap;

	public WebConfig() throws Exception {
		symbolmap = new Properties();
		Caching<String, Properties> cache = new Caching<String, Properties>();
		File file;
		try {

			//Populate the symbol map from the XML file
			if (cache.get("WebConfig") == null)
			{
				file = new File("Config/web.config");
				symbolmap.loadFromXML( file.toURI().toURL().openStream() );
				cache.put("WebConfig", symbolmap);
			}
			else
			{
				symbolmap = cache.get("WebConfig");
			}
		}
		catch (Exception lExcp)
		{
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExcp);
		}
		finally {
		}
	}

	//variable length arguments are packed into an array
	//which can be accessed and passed just like any array
	public String Properties(String symbol, String... variables) throws Exception {
		//Retrieve the value of the associated key
		String message = null;
		Caching<String, String> cache = new Caching<String, String>();
		try{
			if (cache.get(symbol) == null)
			{
				message = symbolmap.getProperty(symbol);
				cache.put(symbol, message);
			}
			else
			{
				message = cache.get(symbol);
			}
			if(message == null)
				return "";
		}
		catch (Exception lExcp)
		{
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, lExcp);
		}
		//Interpolate parameters if necessary
		//and return the message
		
		return String.format(message, variables);
	}
}
