package Listat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListanLukujenSumma {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		List<Integer> luvut = new ArrayList<Integer>();

		int summa = 0;
		int lkm = 0;

		System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa):");

		while (true) {
			int syote = lukija.nextInt();

			if (syote == -1) {
				break;
			} else {
				luvut.add(syote);

				summa += syote; // kokooja-muuttuja - arvo kerääntyy kaikista siihen mennessä läpikäydyistä
								// arvoista
				lkm++;

			}
		}
		lukija.close();

		System.out.println();

		System.out.println("Summa: " + summa);
	}
}
