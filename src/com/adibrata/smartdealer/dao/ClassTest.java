
package com.adibrata.smartdealer.dao;

<<<<<<< Upstream, based on branch 'master' of https://github.com/AdibrataCompany/Smile
import com.adibrata.smartdealer.dao.usermanagement.MenuDao;
=======
import java.text.SimpleDateFormat;
import java.util.Date;

import com.adibrata.smartdealer.dao.setting.JournalSchemeDao;
import com.adibrata.smartdealer.model.CoaSchmHdr;
import com.adibrata.smartdealer.model.ListCoaSchmDtl;
import com.adibrata.smartdealer.model.Partner;
>>>>>>> 5851c81 new Model

import util.adibrata.support.amortization.InstallmentCalc;
import util.adibrata.support.amortization.InstallmentCalc.PaymentAdvance;
import util.adibrata.support.common.CoaInfo;

public class ClassTest
	{

		public static void main(final String[] args) throws Exception
			{
				// TODO Auto-generated method stub
<<<<<<< Upstream, based on branch 'master' of https://github.com/AdibrataCompany/Smile
				
				// new JournalSchemeDao();
				// new ListCoaSchmDtl();
				// final CoaSchmHdr b = new CoaSchmHdr();
				//
				// final Partner p = new Partner();
				// p.setPartnerCode("001");
				// b.setPartner(p);
				// b.setId(1);
				//
				// final SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
				// fmt.parse("20/12/2015");
				//
				// final SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
				// df.parse(df.format(Calendar.getInstance().getTime()));
				//
				// final String dt = "2008-01-01"; // Start date
				//
				// final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				// final Date test = sdf.parse(dt);
				//
				// final Calendar c = Calendar.getInstance();
				// c.setTime(test);
				// c.add(Calendar.DATE, -1); // number of days to add
				//
				// System.out.print(c.getTime());
				final MenuDao a = new MenuDao();

				System.out.println(a.MenuRender((long) 0, (long) 0, (long) 0));

				/*
				 * System.out.println(CoaInfo.GetDescription(p, "INSTALLMENT"));
				 * System.out.println((short) ((valuedate.getTime() - dudate.getTime()) / (24 * 60 * 60 * 1000)));
				 * System.out.println(InstallmentCalc.PMT(8.9 / 1200, 48, -210000000, PaymentAdvance.no));
				 */
=======

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
				System.out.println(InstallmentCalc.PMT(8.9 / 1200, 48, -210000000, PaymentAdvance.no));
>>>>>>> 5851c81 new Model

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
<<<<<<< Upstream, based on branch 'master' of https://github.com/AdibrataCompany/Smile

=======
			
>>>>>>> 5851c81 new Model
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
