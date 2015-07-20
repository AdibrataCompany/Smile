
package util.adibrata.support.common;

public class Number
{

	public Number()
		{
			// TODO Auto-generated constructor stub
		}
		
		public static double Rounding(final double number, final double rounde)
			{
				return Math.ceil(((number) * 1.0) / rounde) * rounde;
			}

}
