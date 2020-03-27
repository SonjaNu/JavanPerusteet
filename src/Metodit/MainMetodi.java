package Metodit;

public class MainMetodi {

	public static void main(String[] args) { //julkinen metodi (public) eli tätä metodia voidaan kutsua mistä vain, esim.
		//math.round
		double a = Math.round(7.2);
		
		//näkyvyyden vaihtoehdot: public, protected, private ja "oletus" (jätetään kokonaan määrittelemättä, esim. static void...)
		
		//static eli staattinen luokkametodi, kutsutaan aina luokan nimellä (esim. MainMetodi)
		
		double b = Math.round(6.2);
		
		String hello = "Hello";
		hello.toUpperCase(); // (laittaa merkkijonon isoille kirjaimille (HELLO) ei-staattinen eli oliometodi - oliometodit liittyvät aina tiettyyn olioon, tässä Hello-merkkijonoon
		//void tarkoittaa, että metodi ei palauta mitään
		//esim. Math.round() palauttaa merkkijonon
		
		//main on metodin nimi, omat metodit voi nimetä vapaasti
		
		//(String[] args) - metodin muuttujat määritellään sulkujen sisällä
		
	}
}
