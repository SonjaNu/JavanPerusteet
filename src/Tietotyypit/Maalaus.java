package Tietotyypit;

//Tee ohjelma Maalaus, joka kertoo, paljonko maalia on ostettava.
 
//Ohjelma kysyy huoneen leveyden, pituuden ja korkeuden sekä paljonko litralla maalia saadaan maalattua. 
//Ohjelma kertoo tämän jälkeen maalin tarpeen litroina. Muotoile vastaus kahdella desimaalilla.

//Esimerkiksi huoneen leveys on 3.2 metriä, pituus on 3.0 metriä ja korkeus 2.5 metriä.
//Litralla maalia saadaan maalattua 7.0 neliötä. Maalia tarvitaan koko
//huoneen maalaamiseen 4.43 l ((leveys + leveys + pituus + pituus) * korkeus / litralla).

import java.util.Scanner;
//
//importataan desimaaliformaatti, joka mahdollistaa desilukujen tulostuksen

import java.text.DecimalFormat;
//
public class Maalaus {
//	
	public static void main(String[] args) {
		
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		//luodaan muuttujat
		
		double maalilitra;
		double leveys;
		double korkeus;
		double pituus;
		double vastaus;
		
		//luodaan käyttäjälle mahdollisuus syöttää tietoja/muuttujia
		
	
		
		Scanner input = new Scanner(System.in);
		System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
		
		//Pyydetään käyttäjältä seuraavat luvut desimaalilukuina (double)
		
		leveys = input.nextDouble();
		pituus = input.nextDouble();
		korkeus = input.nextDouble();
	
		
		System.out.print("Paljonko litralla saadaan maalattua neliöitä: ");
		
		//pyydetään käyttäjältä maalilitra
		
		maalilitra = input.nextDouble();
		
		
		//tehdään laskutoimitus ja kootaan se vastaukseen
		vastaus = ((leveys + leveys + pituus + pituus) * korkeus / maalilitra);
		
		//tulostetaan vastaus
		
		System.out.print("Maalin tarve on " + desimaalit.format(vastaus) + " litraa");
	
	}

}
