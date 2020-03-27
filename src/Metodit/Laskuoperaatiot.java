package Metodit;

import java.util.ArrayList;

public class Laskuoperaatiot {
	
	public static void main(String[] args) {
		
		 	double eka = 9.0;
	        double toka = 3.0;

	        System.out.println("Suoritetaan testi arvoilla " + eka + " ja " + toka + ":\n");

	        double summa = Laskuoperaatiot.summa(eka, toka);
	        System.out.println(eka + " + " + toka + " = " + summa);

	        double erotus = Laskuoperaatiot.erotus(eka, toka);
	        System.out.println(eka + " - " + toka + " = " + erotus);
		
		
	}
	
	public static double summa(double ensimmainen, double toinen) {
		
		double palautettavaSumma = ensimmainen + toinen;
		
		return palautettavaSumma;
		
	}
	
	public static double erotus(double ensimmainen, double toinen) {
		
		double palautettavaErotus = ensimmainen - toinen;
		
		return palautettavaErotus;
		
	}

}
	
