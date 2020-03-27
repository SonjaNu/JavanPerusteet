package Merkkijonot;

import java.util.Scanner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tuotteet {
	
public static void main(String[] args) {
	
	DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		Scanner input = new Scanner(System.in);
		
		int numero;
		String nimi;
		double hinta;
		String kuvaus;
		
		System.out.println("Anna tuotenumero: ");
		numero = input.nextInt(); //lukee numeron, mutta jättää rivinvaihdon tietovirtaan (system.out.print...)
									//tämän vuoksi on laitettava väliin input.nextLine(); mikäli seuraavalla rivilla on vain yksi sana,
		// muuten on laitettava next.Line ja Integer.parseInt("");
		
		//input.nextLine();
		
		String rivi = input.nextLine();
		int kokonaisluku = Integer.parseInt("0");
		
		System.out.println("Anna tuotteen nimi: ");
		nimi = input.nextLine();
		
		
		
		
		System.out.println("Anna tuotteen hinta: ");
		hinta = input.nextDouble();
		
		input.nextLine();
		
		System.out.println("Anna tuotteen kuvaus: ");
		kuvaus = input.nextLine();
		
		System.out.println("Numero: " + numero);
		System.out.println("Nimi: " + nimi.trim().toUpperCase());
		System.out.println("Hinta: " + desimaalit.format(hinta));
		System.out.println("Kuvaus: " + kuvaus.trim());
		
		
		
		
		
		
}

}
