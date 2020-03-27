package Tietotyypit;

/*Tee ohjelma Juhlat, millä voidaan laskea, montako kuohuviinipulloa juhliin tarvitsee hankkia. Yhdestä pullosta saa 7 lasillista. 
 * Ohjelma kysyy vieraiden määrän ja kertoo
tarvittavien kuohuviinipullojen määrän kokonaislukuna (vinkkinä: etsi tietoa ceil-käskystä)
montako lasia jää yli viimeisestä pullosta
*/

import java.util.Scanner;

//import java.lang.*;
import java.text.DecimalFormat;

public class Juhlat {
	
	public static void main(String[] args) {
		
		DecimalFormat desimaalit = new DecimalFormat("0");
		
		double aikuiset;
		double pullot;
		double ceilPullot;
		double lasit;

		//luodaan käyttäjälle mahdollisuus syöttää tietoja/muuttujia
		Scanner input = new Scanner(System.in);
		System.out.print("Anna juhliin tulevien aikuisten määrä: ");
		
		//Pyydetään käyttäjältä aikuisten määrä
		aikuiset = input.nextInt();
		
		//tehdään laskutoimitus ja kootaan vastaukseen "pullot"
		
		pullot = aikuiset / 7; //saadaan tulokseksi kokonaisluku
		ceilPullot = Math.ceil(pullot);
		lasit = 7 - (aikuiset % 7);
		
		/* Voidaan tehdä myös näin:
		 * // aikuiset / 7 lasketaan ensin, josta saadaan tulokseksi kokonaisluku
        // tuloksen desimaaliosa katkeaa pois, ennen kun se annetaan Math.ceil-metodille
        int pullot = (int) Math.ceil(aikuiset / 7);
        System.out.println(pullot);*/
		
		
		
		//System.out.print(pullot);
		
		System.out.println("Pulloja tarvitaan " + desimaalit.format(ceilPullot) + " kappaletta");
		
		System.out.print("Viimeisestä pullosta jää " + desimaalit.format(lasit) + " lasia");
		
		
	}

}
