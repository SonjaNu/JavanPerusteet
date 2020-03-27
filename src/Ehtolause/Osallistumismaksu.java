package Ehtolause;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Tee ohjelma Osallistumismaksu, joka laskee kuvitteellisen tapahtuman osallistujan osallistumismaksun suuruuden. 
 * Maksu määräytyy iän mukaan siten, että 0-17 vuotiaan maksu on 8 euroa ja 18 vuotta täyttäneen maksu on 12,50 euroa.

Osallistumismaksu tulee esittää kahden desimaalin tarkkuudella muodossa: "Osallistumismaksusi on XX,YY euroa."

Käytä numeron muotoilemisessa DecimalFormat-luokkaa: new DecimalFormat("0.00");.*/

public class Osallistumismaksu {
	
	public static void main(String[] args) {
		
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kirjoita ikäsi: ");
		int ika = input.nextInt();
		
		double maksu = 0;
		
		if (ika >= 0 && ika <= 17) {
			maksu = 8;
		} else if (ika > 18) {
			maksu = 12.50;
			
			
		}
		
		System.out.println("Osallistumismaksusi on: " + desimaalit.format(maksu));
		
	}

}
