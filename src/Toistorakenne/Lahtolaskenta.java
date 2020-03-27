package Toistorakenne;

public class Lahtolaskenta {

	public static void main(String[] args) {
		// asetetaan toistossa käytettävän apumuuttujan luku arvoksi aluksi 101 ja
		// vähennetään muuttujan arvoa yhdellä toiston sisällä

		int luku = 101; // lisätään lukuun 100 1, koska while-loopissa sadasta vähennetään 1 joka
						// kierroksella, myös ensimmäisellä

		while (luku > 0) {

			luku = luku - 1; // vähennetään lukua joka kierroksella ykkösellä

			if (luku % 3 != 0) {

				System.out.println(luku);

			}

		}
	}
}

