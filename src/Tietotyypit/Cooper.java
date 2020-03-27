package Tietotyypit;

/*Tee ohjelma Cooper, joka kysyy Cooperissa juostun matkan. Ohjelma kertoo, 
 * montako kokonaista 400 metrin kierrosta juostiin. Kierroksien määrän lasketaan matka / 400.*/

import java.util.Scanner;

public class Cooper {

	public static void main(String[] args) {
		int matka;
		int kierros;
		Scanner input = new Scanner(System.in);
		System.out.print("Anna juostu matka: ");
		matka = input.nextInt();
		kierros = matka / 400;

		System.out.println("Kokonaisia 400 metrin kierroksia oli " + kierros);

	}
}
