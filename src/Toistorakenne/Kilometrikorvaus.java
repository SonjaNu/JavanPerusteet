package Toistorakenne;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Kilometrikorvaus {

	public static void main(String[] args) {

		DecimalFormat desimaalit = new DecimalFormat("0.00");

		int kilometrit;
		int summa = 0; // alustetaan nämä kaksi nolliksi,
		int lkm = 0; // koska yhtään lukua ei ole annettu vielä
		double korvaus;

		Scanner input = new Scanner(System.in);
		System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
		kilometrit = input.nextInt();

		while (kilometrit > 0) {
			summa = summa + kilometrit;
			lkm = lkm + 1; // tai lkm++;
			System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
			kilometrit = input.nextInt();

		}

		System.out.println("Yhteensä " + summa + " kilometriä");

		korvaus = summa * 0.43;
		System.out.println("Korvaus on " + desimaalit.format(korvaus) + " euroa");

	}

}
