package Osoitekirja;

import java.util.ArrayList;

import java.util.List;


public class AddressBook {

	private List<Contact> contacts;

	public AddressBook() {
		this.contacts = new ArrayList<>();
	}

	public boolean add(Contact newContact) {
		// TODO: tarkista, ettei annettu yhteystieto ole jo listalla

		if (this.contacts.contains(newContact)) { // tarkistus, ettei ole listalla
			return false;

		} else {
			this.contacts.add(newContact);
			return true;
		}

	}

	public Contact search(String keyword) {
		for (Contact current : this.contacts) {
			String name = current.getName();
			if (name != null && name.toLowerCase().contains(keyword.toLowerCase())) {
				return current; // palautetaan löytynyt arvo heti
			}
		}
		return null; // palautetaan null, jos ei löytynyt
	}

	@Override
	public String toString() {

		String rivit = ""; // tehdään kokoojamuuttuja

		for (int i = 0; i < contacts.size(); i++) {
			Contact rivi = contacts.get(i); // i+1, koska indeksit lähtevät nollasta ja me haluamme aloittaa ykkösestä
			rivit = rivit + rivi + "\n";
		}
		return rivit;

		// TODO: toteuta tämä metodi. Metodin tulee muodostaa merkkijono,
		// joka sisältää kaikki yhteystiedot omilla riveillään.

	}
}
