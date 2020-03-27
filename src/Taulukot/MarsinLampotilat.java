package Taulukot;

/*Toteuta ohjelma Mars-planeetan lämpötilamittausten tarkasteluun. Marsin alin lämpötila (pinnalla) on -140 astetta, 
 * korkein lämpötila on 20 astetta. Ohjelmalle tulee syöttää 10 hyväksyttyä mittaustulosta, 
 * jotka ohjelma kerää int[]-tyyppiseen taulukkoon, jonka pituus on 10. Jos käyttäjä syöttää luvun, 
 * joka on pienempi kuin -140 tai suurempi kuin 20, lukua ei laiteta taulukkoon vaan se pyydetään uudelleen 
 * esimerkkisuorituksen mukaisesti.

Lopuksi ohjelman tulee tulostaa lämpötilamittausten keskiarvo sekä minimi- ja maksimiarvot. */

import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

public class MarsinLampotilat {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// luodaan taulukko, laitetaan kooksi 10
		int[] lampotilat = new int[10];

		// keskiarvoa varten lukuja pitää kerryttää, joten kootaan ne summa-muuttujaan
		int summa = 0;

		// käydään taulukkoa läpi ja kerätään käyttäjän syöttämiä arvoja
		for (int i = 0; i < lampotilat.length; i++) {
			System.out.println("Syötä mittaus " + (i + 1) + "/10: ");
			int lampotila = input.nextInt();

			// ehtolause, miten arvoja tallennetaan taulukkoon
			if (lampotila < -140 || lampotila > 20) {
				System.out.println("Anna lämpötila väliltä -140 - +20!");

				i--; // jos annetaan väärä lämpötila, sitä ei tule lisätä taulukkoon, joten
						// vähennetään i--
			} else {
				lampotilat[i] = lampotila;
				// päivitetään summamuuttujaan lämpötiloja joka kierroksella
				summa = summa + lampotila;
			}
		}

		// sortataan taulukko pienintä ja suurinta arvoa varten
		Arrays.sort(lampotilat);

		System.out.println("Mittausten keskiarvo: " + summa / 10.0); // Pitää laittaa 10.0, jotta tulee desimaali
																		// vastaukseen
		System.out.println("Pienin mkittaustulos: " + lampotilat[0]); // sorttauksen jälkeen taulukon indeksissä 0 on
																		// pienin arvo
		System.out.println("Suurin mittaustulos: " + lampotilat[9]); // ja pienin indeksissä 9
	}

}
