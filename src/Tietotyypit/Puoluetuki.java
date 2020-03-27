package Tietotyypit;

/*Tee ohjelma Puoluetuki, joka laskee puolueen puoluetuen määrän vuodessa. 
 * Yhden kansanedustajan puoluetuki on 148 175 euroa.*/

import java.util.Scanner;

public class Puoluetuki {

	public static void main(String[] args) {
		int tuki;
		int lukumaara;
		Scanner input = new Scanner(System.in);
		System.out.print("Anna kansanedustajien lukumäärä: ");
		lukumaara = input.nextInt();
		tuki = lukumaara * 148175;
				
		System.out.println("Puoluetuen määrä on " + tuki + " euroa");
	}

}
