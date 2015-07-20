/**
 * AgreementInfo.java
 */

package util.adibrata.support.common;

import org.hibernate.Session;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.model.Agrmnt;

/**
 * @author Henry
 */
public class AgreementInfo
{

	/**
	 *
	 */
	public AgreementInfo()
		{
			// TODO Auto-generated constructor stub
		}

	public static Agrmnt View(final Session session, final long id) throws Exception
		{
			Agrmnt agrmnt = null;
			try
				{
					agrmnt = (Agrmnt) session.get(Agrmnt.class, id);

				}
			catch (final Exception exp)
				{

					final ExceptionEntities lEntExp = new ExceptionEntities();
					lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
					lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
					ExceptionHelper.WriteException(lEntExp, exp);
				}
			return agrmnt;
		}

}
