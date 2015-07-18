package util.adibrata.support.jourmal;

import util.adibrata.framework.dataaccess.HibernateHelper;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.TransJob;
import com.adibrata.smartdealer.model.TrxConfigDtl;
import com.adibrata.smartdealer.model.TrxConfigHdr;

public class JournalPostTest {

	public static void main(String[] args) throws Exception {
		final TransJob transjob = new TransJob();
		new TrxConfigHdr();
		new TrxConfigDtl();
		HibernateHelper.getSessionFactory().openSession();
		new Office();
		final Partner partner = new Partner();
		partner.setPartnerCode("001");
		transjob.setTrxConfigCode("PRO");
		final JournalPosting jp = new JournalPosting("Henry");
		/*
		 * System.out.print(CoaRetrieve.CoaCode(session, "001", "CoaMaster",
		 * "INSTALLRCV"));
		 */
		jp.JobPost();
		// jp.GetConfHdrDtl(session, transjob, office, partner);

	}

}
