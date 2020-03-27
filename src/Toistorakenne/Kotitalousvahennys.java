package Toistorakenne;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Kotitalousvahennys {
	
public static void main(String[] args) {
		
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		double korvaus;
		double summa = 0; //alustetaan nämä kaksi nolliksi, 
		int lkm = 0;	//koska yhtään lukua ei ole annettu vielä
		double maara;
		
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
	korvaus = input.nextDouble();
	
	while (korvaus > 0) {
		summa = summa + korvaus;
		lkm = lkm + 1; // tai lkm++;
		System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
		korvaus = input.nextDouble();
		
	}
	
	
	maara = summa * 50 / 100.0 - 100;
	
	if (maara > 2400) {
		maara = 2400;
		System.out.println("Kotitalousvähennyksen määrä on " + desimaalit.format(maara) + " euroa");
	}
	
	else if (maara <= 100) {
		maara = 0;
		System.out.println("Kotitalousvähennyksen määrä on " + desimaalit.format(maara) + " euroa");
	}
	else {
		
		System.out.println("Kotitalousvähennyksen määrä on " + desimaalit.format(maara) + " euroa");
		
	}
	
	

}
}
