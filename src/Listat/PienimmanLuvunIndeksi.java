package Listat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		List<Integer> luvut = new ArrayList<Integer>();

		System.out.println("Syötä kokonaislukuja listalle (9999 lopettaa):");

		while (true) {
			int syote = lukija.nextInt();

			if (syote == 9999) {
				break;
			} else {
				luvut.add(syote);
			}
		}
		lukija.close();

		System.out.println();

		List<Integer> kopio = new ArrayList<Integer>(luvut);

		Collections.sort(kopio);

		int pienin = kopio.get(0);

		int pituus = luvut.size();

		for (int i = 0; i < pituus; i++)

			if (luvut.get(i) == pienin) {

				System.out.println(i);
			}

	}
}
