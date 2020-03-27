package Ehtolause;
/*Tee ohjelma Ylinopeus.java, joka kysyy käyttäjältä kokonaisluvun ja tulostaa merkkijonon "Ylinopeussakko!" 
 * jos luku on suurempi kuin 120.

Jos annettu luku on 120 tai vähemmän, ohjelmasi ei tule tulostaa mitään.*/

import java.util.Scanner;

public class Ylinopeus {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Kerro nopeus: ");
		int nopeus = input.nextInt();
		
		if (nopeus > 120) {
			System.out.println("Ylinopeussakko!");
		}
		
	}

}
