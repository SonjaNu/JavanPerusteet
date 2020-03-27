package Osoitekirja;

import java.util.Scanner;

public class AddressBookApp {

	public static void main(String[] args) {

		AddressBook book = new AddressBook(); // luodaan olio luokasta AddressBook, jotta voidaan käyttää sen metodeita

		Scanner input = new Scanner(System.in);

		System.out.println("This is an address book application. Available commands:" + "\n" + "list" + "\n" + "help"
				+ "\n" + "add <name>, <email>, <phone>" + "\n" + "search <name>" + "\n" + "exit");

		boolean running = true;
		while (running) {
			System.out.print("> ");
			String command = input.next();
			String theRest = input.nextLine().trim();

			switch (command) { // haarautetaan koodi käyttäjän syötteen perusteella
			case "help":
				System.out.println("This is an address book application. Available commands:" + "\n" + "list" + "\n"
						+ "help" + "\n" + "add <name>, <email>, <phone>" + "\n" + "search <name>" + "\n" + "exit");
				break;

			case "list":
				System.out.println(book);

				// tulostetaan osoitekirjan kaikki yhteystiedot
				break;
			case "add":
				String[] parts = theRest.split(",");

				String name = parts[0].trim();
				String email = parts[1].trim();
				String phone = parts[2].trim();

				Contact contact = new Contact(name, email, phone);

				boolean lisatty = book.add(contact);

				if (lisatty) {

					System.out.println("Added " + contact);

				} else {

					System.out.println("That contact already exists.");
				}

				break;

			case "search":

				Contact etsitty = book.search(theRest);

				if (etsitty != null) { // katso AddressBook-luokka search-metodi: palauttaa joko arvon tai null
					System.out.println(etsitty);
				} else {
					System.out.println(theRest + "does not match any contact.");
				}

				break;
			case "exit":
				System.out.println("Bye!");
				running = false;
				break;
			default:
				// tunnistamaton komento:
				System.out.println("Unknown command");
				break;
			}

		}
	}

	private static Contact search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
