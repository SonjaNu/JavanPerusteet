package Listat; // Poista tämä rivi Viopessa!

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnsimmainenJaViimeinenArvo {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();

		System.out.println("Syötä sanoja listalle. Tyhjä tai yhdysviiva (-) lopettaa:");

		while (true) {
			String syote = lukija.nextLine();

			if ("".equals(syote) || "-".equals(syote)) {
				break;
			} else {
				lista.add(syote);
			}
		}
		lukija.close();

		System.out.println();

		int pituus = lista.size();

		System.out.println(lista.get(0));
		System.out.println(lista.get(pituus - 1));

	}
}
