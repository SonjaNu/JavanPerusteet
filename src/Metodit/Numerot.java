package Metodit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numerot {
	
	public static void main(String[] args) { //voitaisiin tehdä main myös toiseen luokkaan
		List<Integer> opintopisteet = new ArrayList<Integer>();
		
		opintopisteet.add(5);
		opintopisteet.add(5);
		opintopisteet.add(5);
		opintopisteet.add(5);
		opintopisteet.add(10);
		
		
		int pisteitaYhteensa = Numerot.summa(opintopisteet); //opintopisteet - puhutaan samasta asiasta kuin arvot
	
		System.out.println(pisteitaYhteensa);
		
		int suurinLuku = Numerot.suurin(opintopisteet);
		
		System.out.println(suurinLuku);
		
		int pieninLuku = Numerot.pienin(opintopisteet);
		System.out.println(pieninLuku);
	}
	
	public static int pienin(List<Integer> arvot) { //staattista metodia kutsutaan aina luokalle, ei riipu kutsuttavista asioista vaan paranmetrin arvoista
		
		List<Integer> kopio = new ArrayList<Integer>(arvot);
		
		Collections.sort(kopio);
		
		int pienin = kopio.get(0); //lista alkaa nollasta!
		
		int pituus = kopio.size();
		
		for (int i = 0; i < pituus; i++) {
			
			if (kopio.get(i) == pienin) {
				
				
			}
		}
			
		
		
		return pienin;
		
		
	}
	
	public static int suurin(List<Integer> arvot) {
		
		List<Integer> kopio2 = new ArrayList<Integer>(arvot);
		
		Collections.sort(kopio2);
		
		int suurin = kopio2.size();
		
		return kopio2.get(suurin - 1);
		
	}
	
	
	public static int summa(List<Integer> arvot) {
		
		int summa = 0;
		
		for (int luku : arvot) { //tämä on lyhyempi tapa, kun pitää käydä jokin kokoelma läpi - voi käyttää, jos ei tarvitse indeksiä (int i)
			summa += luku;
		}
		
		return summa;
		
	}
	
/*Collections.sort(luvut); //lajitellaan listan luvut luonnolliseen järjestykseen pienimmästä suurimpaan
        
        int pituus = luvut.size(); //otetaan listan koko
        
        System.out.println("Listan suurin luku: " + luvut.get(pituus - 1)); // listan koko - 1 kertoo suurimman luvun, koska se on listassa nyt viimeisenä*/
}
