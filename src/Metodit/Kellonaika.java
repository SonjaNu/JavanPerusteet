package Metodit;

import java.util.Scanner;

public class Kellonaika {

	public static void main(String[] args) {

		String kello = kysyKellonaika(); // metodin parametrin välitys: meni kelloon
		boolean ok = tarkastaKellonaika(kello);

		if (ok) {
			System.out.println("Kellonaika on oikein");

		} else {
			System.out.println("Kellonaika on  väärin");
		}

	}

	private static String kysyKellonaika() { // koska on staattinen, ei tarvitse luoda oliota, kun metodia kutsutaan
		Scanner input = new Scanner(System.in);
		System.out.print("Anna kellonaika muodossa tt:mm: ");
		String aika = input.nextLine();

		return aika;

	}

	private static boolean tarkastaKellonaika(String kellonaika) {
		String[] osat = kellonaika.split(":");
		if (osat.length != 2) {
			return false;
		}
		try {
			int tunnit = Integer.parseInt(osat[0]);
			int minuutit = Integer.parseInt(osat[1]);

			if (tunnit >= 0 && tunnit <= 23 && minuutit >= 0 && minuutit <= 59) {
				return true;
			} else {
				return false;
			}

		} catch (NumberFormatException poikkeus) {
			return false;

		}

	}

}
