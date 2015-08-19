package util.adibrata.support.common;

import org.hibernate.Query;
import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;

public class GetCoaScheme {
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
	
}
