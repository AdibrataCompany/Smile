
package com.adibrata.smartdealer.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import util.adibrata.support.common.CoaInfo;

import com.adibrata.smartdealer.dao.setting.JournalSchemeDao;
import com.adibrata.smartdealer.model.CoaSchmHdr;
import com.adibrata.smartdealer.model.ListCoaSchmDtl;
import com.adibrata.smartdealer.model.Partner;

public class ClassTest
	{
		
		public static void main(final String[] args) throws Exception
			{
				// TODO Auto-generated method stub
				
				new JournalSchemeDao();
				new ListCoaSchmDtl();
				final CoaSchmHdr b = new CoaSchmHdr();
				
				final Partner p = new Partner();
				p.setPartnerCode("001");
				b.setPartner(p);
				b.setId(1);
				
				final SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
				final Date dudate = fmt.parse("2015-01-06");
				final Date valuedate = fmt.parse("2015-01-20");
				
				System.out.println(CoaInfo.GetDescription(p, "INSTALLMENT"));
				System.out.println((short) ((valuedate.getTime() - dudate.getTime()) / (24 * 60 * 60 * 1000)));
				
				// System.out.println(CoaInfo.GetDescription(p, "INSTALLMENT"));
				// System.out.println(CoaInfo.GetDescription(p, "INSTALLMENT"));
				// System.out.println(CoaInfo.GetDescription(p, "INSTALLMENT"));
				// System.out.println(CoaInfo.GetDescription(p, "INSTALLMENT"));
				// System.out.println(CoaInfo.GetDescription(p, "INSTALLMENT"));
				// System.out.println(CoaInfo.GetDescription(p, "INSTALLMENT"));
				// System.out.println(CoaInfo.GetDescription(p, "INSTALLMENT"));
				// System.out.println(CoaInfo.GetDescription(p, "INSTALLMENT"));
				
				/*
				 * final List<AssetDocMaster> lst = (List<AssetDocMaster>) c
				 * .Paging(1, "documentCode = 'STNK'", "");
				 * for (final AssetDocMaster aRow : lst)
				 * {
				 * System.out.println(aRow.getDocumentCode());
				 * }
				 * final double g = a.TotalRecord("");
				 */
				
				/* System.out.println(g); */
				
			}
		
		/*
		 * public static void main(String[] args) throws ParseException { //
		 * TODO
		 * Auto-generated method stub
		 * DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 * Calendar dtmupd = Calendar.getInstance();
		 * System.out.println(dtmupd.getTime().toString()); int i = 1; while (i
		 * <
		 * 1000) { Partner p = new Partner(); AssetDocMasterDao a = new
		 * AssetDocMasterDao(); AssetDocMaster c = new AssetDocMaster();
		 * p.setPartnerCode("001"); c.setId(1); c.setPartner(p);
		 * c.setDocumentCode("BPKB");
		 * c.setDocumentName("Bukti Pemilik Kendaraan Bermotor");
		 * c.setUsrUpd("Sudarma"); c.setUsrCrt("Henry");
		 * a.SaveAdd(c); i += 1; } dtmupd = Calendar.getInstance();
		 * System.out.println(dtmupd.getTime().toString());
		 * }
		 */
		
		public ClassTest()
			{
				// TODO Auto-generated constructor stub
			}
	}
