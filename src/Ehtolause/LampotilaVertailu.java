package Ehtolause;

import java.util.Scanner;

/*Tee ohjelma LampotilaVertailu, jolle annetaan kaksi lämpötilaa int-tyyppisenä tietona. 
 * Ohjelman pitää pystyä kertomaan kumpi lämpötiloista on suurempi. */

public class LampotilaVertailu {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna ensimmäinen lämpötila: ");
		int ensimmainen = input.nextInt();
		
		System.out.print("Anna toinen lämpötila: ");
		int toinen = input.nextInt();
		
		
		if (ensimmainen > toinen) {
			System.out.println("Suurempi lämpötila on: " + ensimmainen);
			System.out.println("Pienempi lämpötila on: " + toinen);
			
		} else if (toinen > ensimmainen) {
			System.out.println("Suurempi lämpötila on: " + toinen);
			System.out.println("Pienempi lämpötila on: " + ensimmainen);
		}
		
	
		
	
		
		
	}

}
