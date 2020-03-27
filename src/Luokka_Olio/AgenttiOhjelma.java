package Luokka_Olio;

public class AgenttiOhjelma {
	public static void main(String[] args) {
		
	
	
	Agentti bond = new Agentti("James", "Bond");

	bond.toString(); // ei tulosta mitään
	System.out.println(bond); // Tulostaa: My name is Bond, James Bond

	Agentti ionic = new Agentti("Ionic", "Bond");
	System.out.println(ionic); // Tulostaa: My name is Bond, Ionic Bond
	
	}
}
