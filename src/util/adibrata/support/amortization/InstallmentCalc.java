/**
 * InstallmentCalc.java
 */

package util.adibrata.support.amortization;

import org.apache.poi.ss.formula.functions.FinanceLib;
import org.apache.poi.ss.formula.functions.Irr;

public class InstallmentCalc
	{
		
		/**
		 * http://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
		 * Parameters:
		 * r - rate
		 * n - num of periods
		 * y - pmt per period
		 * p - future value
		 * t - type (true=pmt at end of period, false=pmt at begining of period)
		 * public static double pv(double r, double n, double y, double f, boolean t)
		 * public static double npv(double r, double[] cfs);
		 * public static double pmt(double r, double n, double p, double f, boolean t)
		 * public static double nper(double r, double y, double p, double f, boolean t)
		 */

		double rate;
		double tenor;
		
		public enum PaymentAdvance
			{
				yes(true), no(false);
				
				private boolean statusCode;

				private PaymentAdvance(final boolean s)
					{
						this.statusCode = s;
					}

				public boolean getpaymentadvance()
					{
						return this.statusCode;
					}
					
			}
			
		public InstallmentCalc()
			{
				// TODO Auto-generated constructor stub
			}
			
		public static double PMT(final double rate, final int tenor, final double ntf, final PaymentAdvance isPaymentAdvance)
			{
				// D7 = Finance Amount
				// D9 = Rate
				// D11 = Term
				// public static final double pmt(final double r, final double n, final double p, final double f, final boolean t)
				final double result = FinanceLib.pmt(rate, tenor, ntf, 0, isPaymentAdvance.getpaymentadvance());
				
				return result;
			}

		public static double IRR(final double[] installment, final double guess)
			{
				// D7 = Finance Amount
				// D9 = Rate
				// D11 = Term
				// public static final double pmt(final double r, final double n, final double p, final double f, final boolean t)
				final double result = Irr.irr(installment, guess);
				
				return result;
			}
	}
