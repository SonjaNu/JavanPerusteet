package Merkkijonot;

import java.util.Scanner;

public class RekisterinumeronTarkastin {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String syote = "";

		while (true) {

			System.out.println("Syötä rekisterinumero (q-kirjain lopettaa): ");
			syote = input.nextLine();

			if (syote.equals("q")) {
				break;

			} else {

				// tarkista kalvolta Säännölliset lausekkeet
				// $ merkkijonon tunnistus loppuu, merkitsee rivin loppua
				// ctrl + shift + f --> sisentää

				if (syote.matches("^[\\w\\-äöåÄÖÅ]{2,3}\\-\\d{1,3}$")) {

					System.out.println(syote + " on kelvollinen rekisterinumero.\n");

				} else {

					System.out.println(syote + " ei ole kelvollinen rekisterinumero.\n");

				}

			}

		}
	}
}
