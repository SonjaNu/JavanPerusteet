package Tietotyypit;

/*Tee ohjelma Pikavippi, joka kertoo paljonko lainatusta rahasta pitää maksaa. 
 * Ohjelmalle kerrotaan yhtiön laittama korko ja vuosimäärä, jonka jälkeen maksuja takaisinmaksu vasta tehtäisiin – yksi tai kaksi vuotta. Ohjelmalle annetaan myös korkoprosentti: 
 * Nordax pankki tarjoaa pikavippejä 41 prosentin korolla vuodeksi ja Viikinkilaina 37 prosentin korolla kahdeksi vuodeksi.

Käytännössä vuoden lainakoroksi annetaan aina 41 ja kahden vuoden koroksi 37 prosenttia. Tässä tehtävässä ei huomioida korkoa korolle -ilmiötä tai lainan maksamista takaisin osissa.

Huom 1! Tässä tehtävässä et saa pyöristää etkä muotoilla lopputulosta, vaan double-arvo tulee tulostaa sellaisenaan.

Huom 2! Tehtävä ei laske oikein korkoa korolle ilmiötä kahden vuoden tapauksessa, vaan ainoastaan kerrotaan ensimmäisen vuoden korko kahdella. Ohjelmaan ei tule tehdä if-rakenteita.*/

import java.util.Scanner;

public class Pikavippi {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Anna pikavipin määrä euroissa: ");
		double maara = input.nextDouble();
		
		System.out.println("Moneksiko vuodeksi raha halutaan (1 tai 2): ");
		int vuosi = input.nextInt();
		
		System.out.println("Lainakorko kahdesta yleisestä (41% tai 37%): ");
		double prosentti = input.nextDouble();
		
		
		double tulos = maara * (prosentti / 100) * vuosi;
		
		
		
		System.out.println("Lainatut rahat maksavat eli korko " + tulos);
		
		

}
}