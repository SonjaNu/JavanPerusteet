package Paivamaara;
/*Tee ohjelma Erapaiva, joka kertoo laskun päivämäärän perusteella eräpäivän. 
 * Eräpäivä on 14 päivän päästä laskun päivämäärästä. Tutustu LocalDate luokan plusDays metodiin.*/

import java.util.Scanner;
import java.time.LocalDate;

public class Erapaiva {
	public static void main(String[] args) {
		
		Erapaiva erapaiva = new Erapaiva();
		
		String laskunErapaiva;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Anna laskun päivämäärä (vvvv-kk-pp): ");
		String kayttajanPaivamaara = input.nextLine();
		
		LocalDate paivamaara = LocalDate.parse(kayttajanPaivamaara); 
		
		LocalDate palautettavaPaivamaara = paivamaara.plusDays(14);
	
		
		System.out.println("Eräpäivä on " + palautettavaPaivamaara);
	}
	
}
