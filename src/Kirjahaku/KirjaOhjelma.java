package Kirjahaku;

import java.util.Scanner;
import java.text.DecimalFormat;

public class KirjaOhjelma {

	public static void main(String[] args) {

		Kirja kirja = new Kirja();

		Scanner input = new Scanner(System.in);

		System.out.println("Anna nimi: ");
		String nimi = input.nextLine();

		System.out.println("Anna isbn: ");
		String isbn = input.nextLine();

		System.out.println("Anna hinta: ");
		double hinta = input.nextDouble();

		System.out.println("Anna julkaisuvuosi: ");
		int julkaisuvuosi = input.nextInt();

		kirja.setNimi(nimi);
		kirja.setIsbn(isbn);
		kirja.setHinta(hinta);
		kirja.setJulkaisuvuosi(julkaisuvuosi);

		System.out.println(kirja.toString());

		System.out.println("Nimi: " + kirja.getNimi());
		System.out.println("Isbn: " + kirja.getIsbn());
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Hinta: " + desimaalit.format(kirja.getHinta()));
		System.out.println("Julkaisuvuosi: " + kirja.getJulkaisuvuosi());

	}

}
