package Merkkijonot;

//Tee ohjelma Lento, jolla voidaan selvittää lennon numerosta, onko kyseessä Finnairin lento. 
//Jos lennon numeron alussa on AY, 
//kyseessä on Finnairin lento. Jos kyseessä on Finnairin lento, selvitetään lisäksi, onko kyseessä kaukolento, kotimaan lento vai 
//Venäjän lento. Jos lennon numeron kolmas merkki on 1, kyseessä on kaukolento, 2-6 kotimaan lento, 7 Venäjän lento. Merkkijonon voi muuntaa numeroksi

//int numero = Integer.parseInt(merkkijono);

//Ohjelman sallitut tulosteet ovat: "Kaukolento", "Kotimaan lento", "Venäjän lento" tai "Ei ole Finnairin lento".

import java.util.Scanner;

public class Lento {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);				
		System.out.println("Anna lennon numero: ");
		String lento = input.nextLine();
		
		String lennonAlkukirjaimetAY = lento.substring(0,2); // otetaan käyttäjältä kysytyn lentonumeron alusta kaksi ensimmäistä merkkiä
															//substring-metodilla
															// ja laitetaan tieto talteen muutuujaan String lennonAlkukirjaimetAY
															 // jos merkit ovat AY, niin sitten on Finnairin lento
		String numerotLento = lento.substring(2,3); // otetaan kolmas merkki ja laitetaan tieto talteen muuttujaan String numerotLento 
													// (jos 1 niin kaukolento, 2-6 kotimaan lento, 7 Venäjän lento)
		
		int numero = Integer.parseInt(numerotLento); // Komento Integer.parseInt muuttaa sille annetussa tekstimuuttujassa (numerotLento) olevan 
													//kokonaisluvun kokonaislukumuuttujaksi (int numero). Eli komennolle annetaan tekstimuuttuja
													//ja se palauttaa kokonaisluvun.
		
		//Itse tein if-ehdon equalsIgnoreCase-metodilla, mutta boolean toimii myös!
		if(!lennonAlkukirjaimetAY.equalsIgnoreCase("ay")) { // ! equalsIgnoreCase (! kumoaa ehdon eli jos lennonAlkukirjaimetAY ei ole sama kuin 
															//merkkijono "ay", niin tulostetaan "Ei ole Finnairin lento")
			System.out.println("Ei ole Finnairin lento");		
		
		} else if (numero == 1) {								//jos lennonAlkukirjaimetAY on ay, mennään else if -ehtoon: jos käyttäjän syöttämän
															//lennon koodin kolmas merkki on numero 1, tulostetaan "Kaukolento"
			System.out.println("Kaukolento");		
		
		} else if (numero == 7) {								//jos numero on 7 niin tulostetaan "Venäjän lento"
			System.out.println("Venäjän lento");
							
		
		} else if(numero >= 2 && numero <= 6) {				// jos numero on välillä 2-6, tulostetaan "Kotimaan lento"
			System.out.println("Kotimaan lento");
			
		}
					
			
		}	
		
}
//String lento = "ay105";
//boolean finnairinlento = lento.startsWith("ay");
// if (finnairinlento == false) { (sama kuin finnairinlento != true)
// System.out.println("Ei ole finnairin lento");
// }
	
	


