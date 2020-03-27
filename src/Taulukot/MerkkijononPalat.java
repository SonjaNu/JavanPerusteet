package Taulukot;

import java.util.Scanner;


public class MerkkijononPalat {

	public static void main(String[]args) {
		
		String[] lauseidenPilkkominen = new String[30];
				
		//String lause = "";
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kirjoita lause: ");
		String lause = input.nextLine();
		
		String[] sanat = lause.split(" ");
		
		int indeksi = 0;
		
		while (indeksi < sanat.length ) {
			
			String sana = sanat[indeksi];
			System.out.println(sana);
			
			//System.out.println(lauseidenPilkkominen[sanat.length]);
			//System.out.println(lauseidenPilkkominen[indeksi]);
			indeksi++;
		}
		
		
	}
}
