/**
 * 
 */
package util.adibrata.support.common;

/**
 * @author Henry
 *
 */
public class Terbilang {

	/**
	 * 
	 */
	public Terbilang() {
		// TODO Auto-generated constructor stub
	}

	protected static String terbilang(int bilint) {
		/*
		 * Nilai maksimal yang bisa diolah adalah 2147483647;
		 */

		String terbilang = null;
		if (bilint < 0) {
			System.out.println("Bilangan tidak boleh lebih kecil dari nol");
		} else if (bilint > Integer.MAX_VALUE) {
			System.out.println("Bilangan tidak boleh lebih besar dari "
					+ Integer.MAX_VALUE);
		} else {
			String bilangan = String.valueOf(bilint);
			if (bilangan.equals("0")) {
				terbilang = "Nol";
			} else {
				int jumlahDigit = Terbilang.berapaDigit(bilangan);
				switch (jumlahDigit) {
				case 1:
					terbilang = Terbilang.satuDigit(bilangan);
					break;
				case 2:
					terbilang = Terbilang.duaDigit(bilangan);
					break;
				case 3:
					terbilang = Terbilang.tigaDigit(bilangan);
					break;
				case 4:
					terbilang = Terbilang.empatDigit(bilangan);
					break;
				case 5:
					terbilang = Terbilang.limaDigit(bilangan);
					break;
				case 6:
					terbilang = Terbilang.enamDigit(bilangan);
					break;
				case 7:
					terbilang = Terbilang.tujuhDigit(bilangan);
					break;
				case 8:
					terbilang = Terbilang.delapanDigit(bilangan);
					break;
				case 9:
					terbilang = Terbilang.sembilanDigit(bilangan);
					break;
				case 10:
					terbilang = Terbilang.sepuluhDigit(bilangan);
					break;
				}
			}
		}
		return terbilang;
	}

	protected static int berapaDigit(String bilangan) {
		return bilangan.length();
	}

	protected static String satuDigit(String bilangan) {
		String terbilang = null;
		switch (bilangan) {
		case "1":
			terbilang = "Satu";
			break;
		case "2":
			terbilang = "Dua";
			break;
		case "3":
			terbilang = "Tiga";
			break;
		case "4":
			terbilang = "Empat";
			break;
		case "5":
			terbilang = "Lima";
			break;
		case "6":
			terbilang = "Enam";
			break;
		case "7":
			terbilang = "Tujuh";
			break;
		case "8":
			terbilang = "Delapan";
			break;
		case "9":
			terbilang = "Sembilan";
			break;
		}
		return terbilang;
	}

	protected static String duaDigit(String bilangan) {
		String terbilang = null;
		if (bilangan.charAt(0) == '1') {
			if (bilangan.charAt(1) == '0') {
				terbilang = "Sepuluh";
			} else if (bilangan.charAt(1) == '1') {
				terbilang = "Sebelas";
			} else {
				terbilang = Terbilang.satuDigit(String.valueOf(bilangan
						.charAt(1))) + " Belas";
			}
		} else {
			terbilang = Terbilang.satuDigit(bilangan.substring(0, 1))
					+ " Puluh";
			if (bilangan.substring(1).equals("0")) {
			} else {
				terbilang = terbilang + " "
						+ Terbilang.satuDigit(bilangan.substring(1));
			}
		}
		return terbilang;
	}

	protected static String tigaDigit(String bilangan) {
		String terbilang = null;
		if (bilangan.charAt(0) == '1') {
			terbilang = "Seratus";
			if (bilangan.charAt(1) == '0') {
				if (bilangan.charAt(2) == '0') {
				} else {
					terbilang = terbilang
							+ " "
							+ Terbilang.satuDigit(String.valueOf(bilangan
									.charAt(2)));
				}
			} else {
				terbilang = terbilang + " "
						+ Terbilang.duaDigit(bilangan.substring(1));
			}
		} else {
			terbilang = Terbilang.satuDigit(bilangan.substring(0, 1))
					+ " Ratus";
			if (bilangan.charAt(1) == '0') {
				if (bilangan.charAt(2) == '0') {

				} else {
					terbilang = terbilang
							+ " "
							+ Terbilang.satuDigit(String.valueOf(bilangan
									.charAt(2)));
				}
			} else {
				terbilang = terbilang + " "
						+ Terbilang.duaDigit(bilangan.substring(1));
			}
		}
		return terbilang;
	}

	protected static String empatDigit(String bilangan) {
		String terbilang = null;
		if (bilangan.charAt(0) == '1') {
			if (bilangan.charAt(1) == '0') {
				if (bilangan.charAt(2) == '0') {
					if (bilangan.charAt(3) == '0') {
						terbilang = "Seribu";
					} else {
						terbilang = "Seribu "
								+ Terbilang.satuDigit(String.valueOf(bilangan
										.charAt(3)));
					}
				} else {
					terbilang = "Seribu "
							+ Terbilang.duaDigit(bilangan.substring(2));
				}
			} else {
				terbilang = "Seribu "
						+ Terbilang.tigaDigit(bilangan.substring(1));
			}
		} else {
			if (bilangan.charAt(1) == '0') {
				if (bilangan.charAt(2) == '0') {
					if (bilangan.charAt(3) == '0') {
						terbilang = Terbilang.satuDigit(String.valueOf(bilangan
								.charAt(0))) + " Ribu";
					} else {
						terbilang = Terbilang.satuDigit(String.valueOf(bilangan
								.charAt(0)))
								+ " Ribu "
								+ Terbilang.satuDigit(String.valueOf(bilangan
										.charAt(3)));
					}
				} else {
					terbilang = Terbilang.satuDigit(String.valueOf(bilangan
							.charAt(0)))
							+ " Ribu "
							+ Terbilang.duaDigit(bilangan.substring(2));
				}
			} else {
				terbilang = Terbilang.satuDigit(String.valueOf(bilangan
						.charAt(0)))
						+ " Ribu "
						+ Terbilang.tigaDigit(bilangan.substring(1));
			}
		}
		return terbilang;
	}

	protected static String limaDigit(String bilangan) {
		String terbilang = Terbilang.duaDigit(bilangan.substring(0, 2))
				+ " Ribu";
		if (bilangan.substring(2, 5).equals("000")) {

		} else {
			if (bilangan.charAt(2) == '0') {
				if (bilangan.charAt(3) == '0') {
					terbilang = terbilang + " "
							+ Terbilang.satuDigit(bilangan.substring(4));
				} else {
					terbilang = terbilang + " "
							+ Terbilang.duaDigit(bilangan.substring(3));
				}
			} else {
				terbilang = terbilang + " "
						+ Terbilang.tigaDigit(bilangan.substring(2));
			}
		}
		return terbilang;
	}

	protected static String enamDigit(String bilangan) {
		String terbilang = Terbilang.tigaDigit(bilangan.substring(0, 3))
				+ " Ribu";
		if (bilangan.substring(2, 6).equals("0000")) {
		} else {
			terbilang = terbilang + " "
					+ Terbilang.tigaDigit(bilangan.substring(3, 6));
		}
		return terbilang;
	}

	protected static String tujuhDigit(String bilangan) {
		String terbilang = Terbilang.satuDigit(bilangan.substring(0, 1))
				+ " Juta";
		if (bilangan.substring(1).equals("000000")) {
		} else {
			terbilang = terbilang + " "
					+ Terbilang.enamDigit(bilangan.substring(1));
		}
		return terbilang;
	}

	protected static String delapanDigit(String bilangan) {
		String terbilang = Terbilang.duaDigit(bilangan.substring(0, 2))
				+ " Juta";
		if (bilangan.substring(2).equals("000000")) {
		} else {
			terbilang = terbilang + " "
					+ Terbilang.enamDigit(bilangan.substring(2));
		}
		return terbilang;
	}

	protected static String sembilanDigit(String bilangan) {
		String terbilang = Terbilang.tigaDigit(bilangan.substring(0, 3))
				+ " Juta";
		if (bilangan.substring(3).equals("000000")) {
		} else {
			terbilang = terbilang + " "
					+ Terbilang.enamDigit(bilangan.substring(3));
		}
		return terbilang;
	}

	protected static String sepuluhDigit(String bilangan) {
		String terbilang = Terbilang.satuDigit(bilangan.substring(0, 1))
				+ " Miliar";
		if (bilangan.substring(1).equals("000000000")) {

		} else {
			terbilang = terbilang + " "
					+ Terbilang.sembilanDigit(bilangan.substring(1));
		}
		return terbilang;
	}

}
