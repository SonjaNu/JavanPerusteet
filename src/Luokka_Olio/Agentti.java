package Luokka_Olio;
/*TTässä tehtävässä harjoittelemme toString-metodin määrittelyä muokkaamalla valmista koodia. 
 * Seuraavaksi on esitetty luokka Agentti, jolla on etunimi ja sukunimi:
 * Luokalle on määritelty metodi tulosta, joka luo seuraavanlaisen merkkijonoesityksen:

Agentti bond = new Agentti("James", "Bond");
bond.tulosta(); // Tulostaa: My name is Bond, James Bond
Tallenna luokka itsellesi tiedostoon Agentti.java ja poista luokan metodi tulosta. Luo luokalle 
uusi metodi public String toString(), joka palauttaa edellämainitun merkkijonoesityksen.
 * */

public class Agentti {

    private String etunimi;
    private String sukunimi;

    public Agentti(String etunimi, String sukunimi) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
    }

    @Override
    public String toString() {
        return "My name is " + this.sukunimi + ", " + this.etunimi + " " + this.sukunimi;
    }
    
    
   /* public void tulosta() {
        System.out.println("My name is " + sukunimi + ", " + etunimi + " " + sukunimi);
    }*/
}