package Tietotyypit;

/*Kirjoita luokka HeiEtunimi. Toteuta luokkaan main-metodi, jossa kysytään ensin käyttäjän etunimi, ja sen jälkeen tervehditään käyttäjää nimeltä. Tarvitset 
 * tehtävässä Javan Scanner-luokkaa syötteen lukemiseksi.*/

import java.util.Scanner;

public class HeiEtunimi {

    public static void main(String[] args) {
    	
    	
       
    	Scanner input = new Scanner(System.in);
		System.out.println("Syötä etunimi: ");
		String nimi = input.nextLine();
		
		System.out.print("Hei " + nimi + "!");
    }
}