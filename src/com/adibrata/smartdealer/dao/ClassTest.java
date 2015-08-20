
package com.adibrata.smartdealer.dao;

import java.util.ArrayList;
import java.util.List;

import util.adibrata.support.file.ExcelUtility;

public class ClassTest
	{
		
		public static void main(final String[] args) throws Exception
			{
				// TODO Auto-generated method stub

				final ExcelUtility a = new ExcelUtility();
				List<List<ExcelUtility>> lst = new ArrayList<List<ExcelUtility>>();

				a.setExcelfile("D:\\Migrasi\\Book1.xls");

				lst = a.ReadExcel();

				for (final List<ExcelUtility> arec : lst)
					{
						for (final ExcelUtility arow : arec)
							{
								if (arow.getSeqno() > 0)
									{
										System.out.print(arow.getSeqno() + "\t\t");
										System.out.print(arow.getColno() + "\t\t");
										System.out.print(arow.getCellvalue() + "\t\t");
									}
							}
						System.out.println("");
					}

				/*
				 * new JournalSchemeDao();
				 * new ListCoaSchmDtl();
				 * final CoaSchmHdr b = new CoaSchmHdr();
				 * final Partner p = new Partner();
				 * p.setPartnerCode("001");
				 * b.setPartner(p);
				 * b.setId(1);
				 * final SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
				 * fmt.parse("20/12/2015");
				 * final SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
				 * df.parse(df.format(Calendar.getInstance().getTime()));
				 * final String dt = "2008-01-01"; // Start date
				 * final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				 * final Date test = sdf.parse(dt);
				 * final Calendar c = Calendar.getInstance();
				 * c.setTime(test);
				 * c.add(Calendar.DATE, -1); // number of days to add
				 * System.out.print(c.getTime());
				 */

				/*
				 * System.out.println(CoaInfo.GetDescription(p, "INSTALLMENT"));
				 * System.out.println((short) ((valuedate.getTime() - dudate.getTime()) / (24 * 60 * 60 * 1000)));
				 * System.out.println(InstallmentCalc.PMT(8.9 / 1200, 48, -210000000, PaymentAdvance.no));
				 */

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
