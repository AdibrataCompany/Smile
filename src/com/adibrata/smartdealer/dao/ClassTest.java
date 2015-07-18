package com.adibrata.smartdealer.dao;

import java.text.ParseException;
import java.util.List;

import com.adibrata.smartdealer.dao.setting.AssetDocMasterDao;
import com.adibrata.smartdealer.dao.setting.DealerDao;
import com.adibrata.smartdealer.dao.setting.JournalSchemeDao;
import com.adibrata.smartdealer.dao.setting.OfficeDao;
import com.adibrata.smartdealer.model.*;

public class ClassTest {

	public ClassTest() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * public static void main(String[] args) throws ParseException { // TODO
	 * Auto-generated method stub
	 * 
	 * 
	 * DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	 * Calendar dtmupd = Calendar.getInstance();
	 * System.out.println(dtmupd.getTime().toString()); int i = 1; while (i <
	 * 1000) { Partner p = new Partner(); AssetDocMasterDao a = new
	 * AssetDocMasterDao(); AssetDocMaster c = new AssetDocMaster();
	 * 
	 * p.setPartnerCode("001"); c.setId(1); c.setPartner(p);
	 * c.setDocumentCode("BPKB");
	 * c.setDocumentName("Bukti Pemilik Kendaraan Bermotor");
	 * 
	 * c.setUsrUpd("Sudarma"); c.setUsrCrt("Henry");
	 * 
	 * a.SaveAdd(c); i += 1; } dtmupd = Calendar.getInstance();
	 * System.out.println(dtmupd.getTime().toString());
	 * 
	 * }
	 */

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		@SuppressWarnings("unused")
		/* Session session = HibernateHelper.getSessionFactory().openSession(); */
	
		
		JournalSchemeDao c = new JournalSchemeDao();
		ListCoaSchmDtl a = new ListCoaSchmDtl();
		CoaSchmHdr b = new CoaSchmHdr();
		
		Partner p = new Partner();
		p.setPartnerCode("001");
		b.setPartner(p);
		b.setId(1);
		
		/*
		List<AssetDocMaster> lst = (List<AssetDocMaster>) c.Paging(1, "documentCode = 'STNK'", "");

		for (AssetDocMaster aRow : lst) {
			System.out.println(aRow.getDocumentCode());
		}
		double g = a.TotalRecord("");*/

		/* System.out.println(g); */

	}
}
