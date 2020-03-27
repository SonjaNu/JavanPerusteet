package Listat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListanSuurinLuku {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		List<Integer> luvut = new ArrayList<Integer>();

		System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa):");

		while (true) {
			int syote = lukija.nextInt();

			if (syote == -1) {
				break;
			} else {
				luvut.add(syote);
			}
		}
		lukija.close();

		System.out.println();

		Collections.sort(luvut); // lajitellaan listan luvut luonnolliseen järjestykseen pienimmästä suurimpaan

		int pituus = luvut.size(); // otetaan listan koko

		System.out.println("Listan suurin luku: " + luvut.get(pituus - 1)); // listan koko - 1 kertoo suurimman luvun,
																			// koska se on listassa nyt viimeisenä
	}
}
