
package util.adibrata.support.common;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.model.Partner;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

public class CoaInfo
	{
		public static long GetId(final Partner partner, final String coaschmcode) throws Exception
			{
				long result = 0;
				final Session session = HibernateHelper.getSessionFactory().openSession();
				try
					{
						final Query qryGetID = session.createQuery(" Select id from  CoaSchmHdr Where partnercode =:partnercode and CoaSchmCode = :coaschmcode");
						qryGetID.setParameter("coaschmcode", coaschmcode);
						qryGetID.setParameter("partnercode", partner.getPartnerCode());
						qryGetID.setCacheable(true);
						qryGetID.setCacheRegion("CoaSchmHdrId" + partner.getPartnerCode() + coaschmcode);
						result = (long) qryGetID.uniqueResult();
					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				finally
					{
						session.flush();
						session.clear();
						session.close();
					}

				return result;

			}

		public static String GetDescription(final Partner partner, final String coaname) throws Exception
			{
				String coadesc = "";
				
				final Session session = HibernateHelper.getSessionFactory().openSession();
				try
					{
						final Query qryGetID = session.createQuery(" Select coaDescription from  Coamaster  " + " Where partnercode =:partnercode and Coaname = :coaname");
						qryGetID.setParameter("coaname", coaname);
						qryGetID.setParameter("partnercode", partner.getPartnerCode());
						qryGetID.setCacheable(true);
						qryGetID.setCacheRegion("CoaSchmHdrId" + partner.getPartnerCode() + coaname);

						coadesc = (String) qryGetID.uniqueResult();

					}
				catch (final Exception exp)
					{
						final ExceptionEntities lEntExp = new ExceptionEntities();
						lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
						lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
						ExceptionHelper.WriteException(lEntExp, exp);
					}
				finally
					{
						session.flush();
						session.clear();
						session.close();
					}

				return coadesc;
				
			}
	}
