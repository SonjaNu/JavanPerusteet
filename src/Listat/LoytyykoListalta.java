package Listat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoytyykoListalta {

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

		System.out.println();

		System.out.print("Ketä etsitään? ");
		String etsittava = lukija.nextLine();

		lukija.close();

		boolean onkoListalla = lista.contains(etsittava);

		if (onkoListalla) {
			System.out.println(etsittava + " löytyi!");

		} else {

			System.out.println(etsittava + " ei löytynyt!");

		}

	}
}
