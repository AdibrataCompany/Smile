package util.adibrata.framework.exceptionhelper;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Date;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@SuppressWarnings("unused")
public class ExceptionHelper extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Logger logger = Logger.getLogger(ExceptionHelper.class);
	
	public static void WriteException(ExceptionEntities _ent, Exception pException) throws Exception{
		BasicConfigurator.configure();
		ExceptionHelper obj = new ExceptionHelper();
		String Message;
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		StringBuilder strMessage = new StringBuilder();
		strMessage.append ("Error Log at ");
		strMessage.append(df.format(dateobj));
		strMessage.append(";\n");
		strMessage.append(" Error @Class: ");
		strMessage.append(_ent.getJavaClass());
		strMessage.append("; \n");
		strMessage.append(" Method: ");
		strMessage.append(_ent.getMethodName());
		strMessage.append("; \n");
		strMessage.append ("Error String:");
		strMessage.append(pException.getMessage());
		Message = strMessage.toString();
		logger.error(Message, pException);
		throw new ExceptionHelper();
		/*
		switch (_ent.getExceptionType().toLowerCase()) {
		case "warning":
			logger.warn(Message);
				
			break;
		case "error":
			logger.error(Message, t);
			break;
			
		case "fatal":
			logger.fatal(Message, t);
			break;
			
		case "info":
			logger.info(Message, t);
			break;

		default:
			logger.info(Message, t);
			break;
		}
*/ 
	}
}
