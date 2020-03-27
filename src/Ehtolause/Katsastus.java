package Ehtolause;

//Tee ohjelma Katsastus, jolla voidaan selvittää katsastusasemalla käynnin hinta.
//pelkkä jälkitarkastus maksaa 30
//katsastus maksaa 50
//jos mitataan päästö, bensiiniautolla se on 22 ja dieselautolla 31

import java.util.Scanner;

public class Katsastus {

	public static void main(String[] args) {

		int katsastus = 50;
		int jalkitarkastus = 30;
		int vastaus;
		int vastaus2;
		int vastaus3;
		int hinta1;
		int hinta2;

		Scanner input = new Scanner(System.in);
		System.out.print("Onko 1=katsastus, 2=jälkitarkastus: ");

		vastaus = input.nextInt();

		if (vastaus == 2) {
			System.out.println("Hinta on " + jalkitarkastus);

		} else if (vastaus == 1) {

			System.out.print("Mitataanko päästöt 0=ei, 1=kyllä: ");
			vastaus2 = input.nextInt();
			if (vastaus2 == 0) {
				System.out.println("Hinta on " + katsastus);
			} else if (vastaus2 == 1) {
				System.out.print("Onko auto 0=bensa, 1=diesel: ");
				vastaus3 = input.nextInt();

				if (vastaus3 == 1) {
					hinta1 = katsastus + 31;
					System.out.println("Hinta on : " + hinta1);

				} else if (vastaus3 == 0) {
					hinta2 = katsastus + 22;
					System.out.print("Hinta on: " + hinta2);
				}
			}
		}
	}

}
