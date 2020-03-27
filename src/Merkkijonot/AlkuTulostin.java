package Merkkijonot;

/*Kirjoita luokka AlkuTulostin ja siihen main-metodi, joka kysyy käyttäjältä sanan ja joka tulostaa annetun sanan alkuosaa toistuvasti. 
 * Ensimmäisellä kerralla tulostetaan vain ensimmäinen kirjain ja jokaiseen seuraavaan tulosteeseen otetaan yksi kirjain lisää. Sanan 
 * tulostaminen lopetetaan, kun annettu sana on tulostettu kokonaisena. */

import java.util.Scanner;

public class AlkuTulostin {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Kirjoita sana: ");
		String sana = input.nextLine();			//käyttäjä kirjoittaa sanan
		
		int pituus = sana.length();				//otetaan syötetyn merkkijonon pituus talteen length-metodilla muuttujaan int pituus,
												//näin meillä on tiedossa, kuinka monta merkkiä sanassa on
		
		for (int i = 0; i < pituus; i++) {		//tehdään for-silmukka, jonka avulla käydään läpi annettua sanaa niin kauan, kuin 
												//ehto i < pituus; (eli i on pienempi kuin annetun sanan merkkien määrä) on totta
			
			int loppuindeksi = i + 1; 			// tehdään summa-muuttuja, joka kasvattaa i:n arvoa aina yhdellä,
												// arvoa on kasvatettava joka kierroksella, jotta silmukka kulkee eteenpäin ja pääsee loppuun asti
			
			String osamerkkijono = sana.substring(0, loppuindeksi); //tehdään muuttuja String osamerkkijono, johon otetaan talteen annetun sanan
																	//merkit halutulta väliltä eli aina indeksistä 0 siihen loppuindeksiin, joka
																	//milläkin kierroksella on: 1. kierroksella loppuindeksi on 0, seuraavalla 1...
			System.out.println(osamerkkijono);	//joka kierroksen lopuksi tulostetaan osamerkkijono
		}
		
	
		
		
	}
}
//System.out.println(pituus); (tulostaa rivin pituuden numeroina)