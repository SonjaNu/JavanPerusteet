package Tietotyypit;

/*Tee ohjelma Bitcoin, joka laskee Bitcoinin tuoton vuodessa, jos tuottoennusteena pidetään 
vuoden 2017 tulosta. 
 * Vuonna 2017 Bitcoiniin sijoitetun rahan arvo 15,06 kertaisti itsensä. Ota huomioon, että investoitua rahasummaa ei 
 * lasketa sijoituksen tuottoon mukaan.
 * 
Huom! Tässä tehtävässä et saa pyöristää etkä muotoilla lopputulosta, vaan double-arvo tulee tulostaa sellaisenaan.

Huom! Tehtävässä kysytään sijoituksen tuottoa, eli sijoituksen loppuarvosta vähennetään sijoitettu alkupääoma.
 * 
 * */

import java.util.Scanner;

public class Bitcoin {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Anna Bitcoineihin investoidun rahan määrä: ");
		int maara = input.nextInt();

		double tulos = maara * 15.06;

		double vastaus = tulos - maara;

		System.out.println("Bitcoin tuotti vuodessa " + vastaus + " euroa.");

	}

}
