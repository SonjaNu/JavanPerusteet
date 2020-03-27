package Luokka_Olio;

/*Tässä tehtävässä harjoittelemme oliomuuttujien käyttöä.
 * Seuraavassa esimerkki miten pääohjelma käyttää vähenevää laskuria:

public class Paaohjelma {
    public static void main(String[] args) {
        VahenevaLaskuri laskuri = new VahenevaLaskuri(10);

        laskuri.tulostaArvo();

        laskuri.vahene();
        laskuri.tulostaArvo();

        laskuri.vahene();
        laskuri.tulostaArvo();
    }
}
Pitäisi tulostua:

arvo: 10
arvo: 9
arvo: 8
VahenevaLaskuri-luokan konstruktorille annetaan parametrina alkuarvo. Esimerkin oliota laskuri luodessa laskurille 
välitetään parametrina arvo 10. Esimerkin laskuri-olioon liittyvään oliomuuttujaan arvoasetetaan siis aluksi arvo 10. 
Laskurin arvon voi tulostaa metodilla tulostaArvo(). Laskurilla tulee myös olla metodi vahene() joka vähentää 
laskurin arvoa yhdellä.

 

Osa 1: Metodin vahene() toteutus
Täydennä luokan runkoon metodin vahene() toteutus sellaiseksi, että se vähentää arvo -oliomuuttujaa yhdellä. 
Kun olet toteuttanut metodin vahene(), edellisen esimerkin pääohjelman tulee toimia esimerkkitulosteen mukaan.

Osa 2: Laskurin arvo ei saa olla negatiivinen
Täydennä metodin vahene() toteutus sellaiseksi, ettei laskurin arvo mene koskaan negatiiviseksi. Eli jos laskurin arvo on jo 0, ei vähennys sitä enää vähennä. Ehtolause auttaa tässä.

Osa 3: Laskurin arvon nollaus
Tee laskurille metodi public void nollaa() joka nollaa laskurin arvon, esim:

public class Paaohjelma {
    public static void main(String[] args) {
        VahenevaLaskuri laskuri = new VahenevaLaskuri(100);

        laskuri.tulostaArvo();

        laskuri.nollaa();
        laskuri.tulostaArvo();

        laskuri.vahene();
        laskuri.tulostaArvo();
    }
}
Tulostaa:

arvo: 100
arvo: 0
arvo: 0
 * */

public class VahenevaLaskuri {
    private int arvo;   // oliomuuttuja joka muistaa laskurin arvon

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
    }

    public void tulostaArvo() {
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
    	
    	if (this.arvo > 0) {
    		
    	this.arvo = this.arvo - 1;
    	
    	
    	}
    	
    	
    	
        // kirjoita tänne metodin toteutus
        // laskurin arvon on siis tarkoitus vähentyä yhdellä
    }

    public void nollaa() {
    	
    	this.arvo = 0;
    }
    // ja tänne muut metodit
}