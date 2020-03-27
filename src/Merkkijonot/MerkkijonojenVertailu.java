package Merkkijonot;


	import java.util.Scanner;

	public class MerkkijonojenVertailu {
	    public static void main(String[] args) {
	        Scanner lukija = new Scanner(System.in);

	        System.out.println("Syötä kaksi merkkijonoa:");
	        String eka = lukija.nextLine();
	        String toka = lukija.nextLine();
	        
	        //vertailu yhtäsuuruus ei vertaile merkkijonojen sisältöä
	        //kun tämä halutaan korjata, on vertailtava merkkijonoja eli olioita, kaikilla olioilla on metodi equals
	        //equalsilla voi vertailla listoja, mitä vain

	        if (eka.equals(toka)) {
	            System.out.println("Syötetyt merkkijonot olivat samat!");
	        } else {
	            System.out.println("Syötetyt merkkijonot eivät olleet samat!");
	        }
	    }
	}


