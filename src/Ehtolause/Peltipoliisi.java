package Ehtolause;

/*Peltipoliisi on 80 nopeusrajoitusalueella. Jos alueella ajaa ylinopeutta korkeintaan 20 kilometriä tunnissa, saa rikesakon. 
 * Jos ylinopeus on yli 20 kilometriä, tulee päiväsakkoa. 
 * Päiväsakon rahamäärä määräytyy vähentämällä nettokuukausituloista peruskulutusvähennys 255 euroa ja jakamalla saatu erotus luvulla 60 eli 
 * (nettotulo-255)/60. Päiväsakon alin euromäärä on vähintään 6 euroa. 

Tee ohjelma Peltipoliisi, joka kertoo, menikö ajetulla nopeudella rikesakolle vai päiväsakolle. Jos meni päiväsakolle, 
kerro yhden päiväsakon määrä.  Jos annettu nopeus ei ole ylinopeutta, tulostaa ohjelma "Ei sakkoja". Jos tulee vain rikesakko, 
tulostaa ohjelmasi vain tekstin "Rikesakko".

Mikäli ylinopeus on yli 20 km/h, täytyy ohjelmasi tulostaa teksti "Päiväsakko" ja kysyä kuljettajan kuukausitulot. 
Lopuksi tulosta yhden päiväsakon määrä annetuilla tuloilla esimerkkisuorituksen mukaisesti.*/

import java.util.Scanner;

import java.text.DecimalFormat;

public class Peltipoliisi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		DecimalFormat desimaalit = new DecimalFormat("0.00");

		System.out.println("Anna nopeutesi: ");
		int nopeus = input.nextInt();

		if (nopeus > 100) {
			System.out.println("Päiväsakko");

			System.out.println("Anna nettokuukausitulosi: ");
			double tulot = input.nextDouble();

			double sakko = (tulot - 255) / 60;

			if (sakko < 6) {

				System.out.println("Päiväsakon määrä on 6,00 euroa");
			} else {

				System.out.println("Päiväsakon määrä on " + desimaalit.format(sakko) + " euroa");

			}

		} else if (nopeus > 80 && nopeus <= 100) {
			System.out.println("Rikesakko");
		}else {
			System.out.println("Ei sakkoja");
		}
	}
}
