package Ehtolause;
/*Kirjoita luokka Tervehdys ja siihen main-metodi, joka tulostaa kellonajasta riippuen erilaisen tervehdyksen. 
 * Ohjelmasi ei saa pyytää käyttäjältä lainkaan syötteitä ja sen tulee päättyä heti oikean tervehdystekstin tulostamisen jälkeen.

Tervehdysteksti on kellonajasta riippuen jokin seuraavista:

Aikaväli

Tervehdys

7:00-9:59

Hyvää huomenta!

10:00-16:59

Hyvää päivää!

17:00-21:59

Hyvää iltaa!

22:00-6:59

Hyvää yötä!

Vinkki: Koska tässä tehtävässä tervehdys muuttuu aina tasatunnein, sinun ei tarvitse ottaa minuutteja lainkaan huomioon ehtorakenteessasi.
Kellonajan selvittäminen
Kellonajan selvittämiseksi tarvitset Javan valmista LocalTime-luokkaa. LocalTime-luokan käyttäminen muistuttaa monilta osin Scanner-luokan käyttöä: ensin tarvitaan olio, joka sijoitetaan muuttujaan. 
Metodeita kutsumalla puolestaan saadaan pyydettyä arvoja: vertaa esim nextInt() ja getHour().

Seuraava esimerkki näyttää, miten voit ensin luoda LocalTime-tyyppisen muuttujan, johon sijoitetaan nykyhetkeä vastaava LocalTime-olio. Tämän jälkeen muuttujan kautta voidaan kutsua getHour-metodia, 
joka palauttaa tunnit kokonaislukuna:

// Luodaan olio ja asetetaan se uuteen muuttujaan:
LocalTime nykyhetki = LocalTime.now();

// Kutsutaan metodia ja otetaan vastaus talteen:
int tunnit = nykyhetki.getHour();
 

LocalTime-luokan käyttämiseksi omassa koodissasi se täytyy ottaa käyttöön import-komennolla tiedostosi alussa:

import java.time.LocalTime; // poista tämä rivi Viopessa
*/

import java.time.LocalTime;

import java.util.Scanner;


public class Tervehdys {
	
	public static void main(String[] args) {
		
		LocalTime nykyhetki = LocalTime.now();
		
		int tunnit = nykyhetki.getHour();
		
		
		
		if (tunnit < 10 && tunnit >= 7) {
			System.out.print("Hyvää huomenta!");
		}
		
		else if (tunnit < 17 && tunnit >= 10) {
			System.out.print("Hyvää päivää!");
		}
		
		else if (tunnit < 22 && tunnit >= 17) {
			System.out.print("Hyvää iltaa!");
		}
		else {
			System.out.print("Hyvää yötä!");
		}
	}

}