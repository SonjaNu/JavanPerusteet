package Ehtolause;
//Tee ohjelma Palkka, joka kysy käyttäjältä bruttopalkan, veroprosentin ja iän. Ohjelma laskee käteen jäävän 
//osuuden palkasta sekä verojen, työttömyysvakuutuksen (1.5%) ja työeläkemaksun suuruuden. 
//Työeläkemaksu on 53-62 vuotiaalla 8.25% ja muilla 6.75%.
//
//Veron osuus on palkka * veroprosentti / 100.0
//
//Työttömyysvakuutuksen osuus on palkka * 0.015
//
//Työeläkemaksun osuus on palkka * XX, missä XX on joko 0.0825 tai 0.0675 riippuen iästä
//
//Käteen jäävä osuus on palkka - vero - työttömyysvakuutus - työeläkemaksu

import java.text.DecimalFormat;

import java.util.Scanner;

public class Palkka {
	
public static void main(String[] args) {
		
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		int brutto;
		double veroprosentti;
		double ika;
		double vero;
		double tyoelake;
		double vakuutus;
		double kateenJaa;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna palkka: ");
		brutto = input.nextInt();
		
		System.out.print("Anna veroprosentti: ");
		veroprosentti = input.nextDouble();
		
		System.out.print("Anna ikä: ");
		ika = input.nextDouble();
		
		System.out.println("Bruttopalkka " + brutto);
		
		vero = brutto * veroprosentti / 100.0;
		
		System.out.println("Veron osuus " + desimaalit.format(vero));
		
		if (ika >= 53 && ika <= 62) {
			tyoelake = brutto * 0.0825;
			System.out.println("Työeläkevakuutusmaksun osuus " + desimaalit.format(tyoelake));
		}
		else {
			tyoelake = brutto * 0.0675;
			System.out.println("Työeläkevakuutusmaksun osuus " + desimaalit.format(tyoelake));
		}
		
		
		vakuutus = brutto * 0.015;
		System.out.println("Työttömyysvakuutuksen osuus " + desimaalit.format(vakuutus));
		
		kateenJaa = brutto - vero - vakuutus - tyoelake;
		System.out.println("Käteen jää " + desimaalit.format(kateenJaa));
		
		
		
}

}
