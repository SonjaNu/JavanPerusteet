package Toistorakenne;

import java.util.Scanner;

public class Alkuluku {
	
	//muuttujien luonteet, roolit - samassa ratkaisussa voi olla sama muuttuja eri rooleissa
	//kiintoarvo - muuttujan arvoa ei ole aikomusta muuttaa
	
	public static void main(String[]args) {
		int luku = 93; //kiintoarvo, ei ole alkuluku, tätä ei muuteta
		
		// käydään lukuja läpi kakkossta ylöspäin (anyway jaollinen ykkösellä ja itsellään)
		
		boolean onAlkuluku = true; //"yksisuuntainen lippu"
		
		int jakaja = 2; //askeltaja: 2, 3,3 4
		
		Scanner input = new Scanner(System.in);
		System.out.print("Syötä jokin positiivinen kokonaisluku: ");
		luku = input.nextInt();
		
	
		
		while(jakaja < luku) {
			if (luku % jakaja == 0 ) {
				//jos jako menee tasan , ei ole alkuluku
			
				onAlkuluku = false;
				
			}
			jakaja++;
			
		}
		if (onAlkuluku) {
			System.out.println("Luku " + luku + " on alkuluku.");
		}else {
			System.out.println("Luku " + luku + " ei ole alkuluku.");
		}
		
		
	}
	
	


}
