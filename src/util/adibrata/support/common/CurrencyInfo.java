/**
 * CurrencyInfo.java
 */

package util.adibrata.support.common;

import java.util.Currency;

import org.hibernate.Session;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.model.Partner;

/**
 * @author Henry
 */
public class CurrencyInfo
	{
		
		/**
	 *
	 */
		public CurrencyInfo()
			{
				// TODO Auto-generated constructor stub
			}
		
		public static Currency GetCurrencyInfo(Session session, Partner partner, long id) throws Exception
			{
				Currency currency = null;
				try
					{
						currency = (Currency) session.get(Currency.class, id);
						
					}
				catch (final Exception exp)
					{
						
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				return currency;

		}
	}
