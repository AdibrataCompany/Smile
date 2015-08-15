package util.adibrata.utility.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertion {
	public static String convertDateIntoString(Date date) {
		try {
			String DATE_FORMAT = "dd/MM/yyyy";
			String returnDate;
			SimpleDateFormat sdft = new SimpleDateFormat(DATE_FORMAT);
			returnDate = sdft.format(date);
			return returnDate;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static Date convertStringToDate(String inputDate) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();

			try {
					date = df.parse(inputDate);
			} catch (Exception e) {
				e.printStackTrace();
			}

		return date;
		}

	public static Date convertStringToDateLast(String inputDate) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy 23:59:59");
		Date date = new Date();

			try {
					date = df.parse(inputDate);
			} catch (Exception e) {
				e.printStackTrace();
			}

		return date;
		}
}
