package Luokka_Olio;

/*Tässä tehtävässä harjoitellaan olioiden luomista ja niiden metodien kutsumista käyttäen apuna alla olevaa 
 * valmista Auto-luokkaa. Tallenna tehtävänannon lopussa oleva luokka itsellesi tiedostoon Auto.java 
 * ja luo uusi luokka AutoOhjelma, jonka main-metodissa teet seuraavat toimenpiteet:

Luo uusi "Tesla"-merkkinen auto ja laita viittaus tähän olioon talteen muuttujaan
Luo toinen "BMW"-merkkinen auto ja laita viittaus tähän olioon talteen eri muuttujaan
Kutsu Teslan aja-metodia arvolla 100.
Kutsu BMW:n aja-metodia arvolla 98.
Kutsu Teslan aja-metodia arvolla 23.
Tulosta Teslan merkkijonoesitys (toString) omalle rivilleen
Tulosta BMW:n merkkijonoesitys (toString) omalle rivilleen
 

🚗 Huom! Koska kilometrit on yksityinen muuttuja, sen arvoa ei voida muuttaa luokan ulkopuolelta. 
Sinun on siis muutettava arvoa julkisen aja-metodin kautta. 🚗*/

public class AutoOhjelma {
	
	public static void main(String[] args) {
		
	
	
	Auto tesla = new Auto("Tesla");
	Auto bmw = new Auto("BMW");
	
	tesla.aja(100);
	bmw.aja(98);
	tesla.aja(23);
	
	String merkkijonokutsu = tesla.toString();
	
	System.out.println(merkkijonokutsu);
	
	String merkkijonokutsu2 = bmw.toString();
	
	System.out.println(merkkijonokutsu2);
	
	
	
	}

}
