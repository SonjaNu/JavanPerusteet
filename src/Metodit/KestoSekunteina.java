package Metodit;

import java.util.Scanner;

/*
kestoSekunteina-metodi saa parametriarvoinaan 3 kokonaislukua: tunnit, minuutit ja sekunnit. Metodin 
tulee laskea annettujen aikayksiköiden kesto yhteensä sekunteina ja palauttaa laskun tulos kokonaislukuna. 
Huomaa, että metodi ei saa kysyä syötettä eikä tulostaa mitään, vaan sen täytyy saada kesto parametriarvoina 
ja palauttaa laskun tulos paluuarvona.

Ohjelmasi tulee kysyä main-metodissa käyttäjältä erikseen tunnit, minuutit ja sekunnit, ja sen jälkeen 
kutsua kestoSekunteina-metodia saaduilla arvoilla. Tulosta lopuksi saamasi tulos.
*/
public class KestoSekunteina {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Anna tunnit: ");
		int ensimmainen = input.nextInt();

		System.out.print("Anna minuutit ");
		int toinen = input.nextInt();

		System.out.print("Anna sekunnit: ");
		int kolmas = input.nextInt();

		int vastaus = kestoSekunteina(ensimmainen, toinen, kolmas);

		System.out.println("Yhteensä " + vastaus + " sekuntia.");

	}

	private static int kestoSekunteina(int luku1, int luku2, int luku3) {

		int vastaus = (luku1 * 60 * 60) + (luku2 * 60) + luku3;
		return vastaus;
	}

}
