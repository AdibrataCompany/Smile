/**
 * 
 */
package util.adibrata.support.common;

import org.hibernate.Query;
import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;

/**
 * @author Henry
 *
 */
public class GetOffice {

	
	public static long GetId (String officecode)
	{
		long officeid = 0;
		Session session = HibernateHelper.getSessionFactory().openSession();
		Query qryTrxSeqNo = session
				/*
				 * .createQuery(
				 * "Select a from  TrxSeqNo a inner join  Office b WITH " +
				 * " a.officeId = b.id " + "inner join " +
				 * " Partner c WITH a.partner = c.partnerCode and b.partner = c.partnerCode "
				 * );
				 */
				.createQuery(
						" Select id from  Office  "
								+ " Where officeCode = :officecode")
				.setParameter("officecode", officecode);
		
		officeid = (long) qryTrxSeqNo.uniqueResult();
		
		return officeid; 
		
	}

	public static String GetCode (long officeid)
	{
		String officecode;
		Session session = HibernateHelper.getSessionFactory().openSession();
		Query qryTrxSeqNo = session
				/*
				 * .createQuery(
				 * "Select a from  TrxSeqNo a inner join  Office b WITH " +
				 * " a.officeId = b.id " + "inner join " +
				 * " Partner c WITH a.partner = c.partnerCode and b.partner = c.partnerCode "
				 * );
				 */
				.createQuery(
						" Select officeCode from  Office  "
								+ " Where id = :id")
				.setParameter("id", officeid);
		
		officecode = (String) qryTrxSeqNo.uniqueResult();
		
		return officecode; 
		
	}
}
