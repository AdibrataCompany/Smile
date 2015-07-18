package util.adibrata.support.common;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.model.Partner;

import util.adibrata.framework.dataaccess.HibernateHelper;

public class GetCoaInfo {
	public static long GetId (String coaschmcode)
	{
		long officeid = 0;
		Session session = HibernateHelper.getSessionFactory().openSession();
		Query qryGetID = session
				.createQuery(
						" Select id from  CoaSchmHdr  "
								+ " Where CoaSchmCode = :coaschmcode")
				.setParameter("coaschmcode", coaschmcode);
		
		officeid = (long) qryGetID.uniqueResult();
		
		return officeid; 
		
	}
	
	public static String GetDescription (Partner partner, String coaname)
	{
		String coadesc = "";
		Session session = HibernateHelper.getSessionFactory().openSession();
		Query qryGetID = session
				.createQuery(
						" Select coaDescription from  Coamaster  "
								+ " Where partnercode =:partnercode and Coaname = :coaname")
				.setParameter("coaname", coaname)
				.setParameter("partnercode", partner.getPartnerCode());
			
		
		coadesc = (String) qryGetID.uniqueResult();
		
		return coadesc; 
		
	}
}
