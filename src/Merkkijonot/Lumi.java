package Merkkijonot;

import java.util.Scanner;

public class Lumi {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int summa = 0;
		int lkm = 0;
		int lkm2 = 0;
		String vastaus = "";
		
		while (vastaus.equals("LOPPU") == false) {
			
			

			lkm = lkm + 1; // tai lkm++;
			System.out.println("Anna nimi: ");
			vastaus = input.nextLine();
			
			if (vastaus.equalsIgnoreCase("lumi") == true) {
				
		
				
				lkm2 = lkm2 + 1;
			}
			
			
		}
		
		System.out.println("Nimiä oli: " + (lkm - 1) + " kappaletta.");
		System.out.println("Nimi Lumi esiintyi : " + lkm2 + " kertaa.");
		
		
		
		

	}

}
