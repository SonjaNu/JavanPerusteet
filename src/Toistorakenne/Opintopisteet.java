package Toistorakenne;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Opintopisteet {

	public static void main(String[] args) {

		DecimalFormat desimaalit = new DecimalFormat("0.00");

		int kaudet;
		int i = 0;
		int summa = 0; // alustetaan nämä kaksi nolliksi,
		int lkm = 0; // koska yhtään lukua ei ole annettu vielä
		int maara;
		int opintopisteet;
		int tutkinnostaPuuttuu;

		Scanner input = new Scanner(System.in);
		System.out.print("Anna lukukausien määrä: ");
		kaudet = input.nextInt();

		while (i < kaudet) {
			System.out.print("Anna " + (i + 1) + ". lukukauden opintopisteesi: ");
			opintopisteet = input.nextInt();
			summa = summa + opintopisteet;
			i++;

		}

		maara = kaudet * 30;

		System.out.println("Sinulla pitäisi olla tähän mennessä " + desimaalit.format(maara) + " opintopistettä.");

		System.out.println("Sinulla on " + desimaalit.format(summa) + " opintopistettä.");

		if (maara >= summa) {
			System.out.println("Olet jäljessä tavoitteesta.");

		} else if (maara < summa) {
			System.out.println("Olet edellä tavoitteesta.");
		}

		tutkinnostaPuuttuu = 210 - summa;

		System.out.println("Tutkinnosta puuttuu vielä " + desimaalit.format(tutkinnostaPuuttuu) + " opintopistettä.");

	}

}
