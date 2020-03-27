package Tiedostot_CSV;

import java.util.List;

public class WeatherApp {
	public static void main(String[] args) {
		
		//WeatherApp-luokassa en halua tietää tarkasti, mitä CSV-tiedosto pitää sisällään
		//En halua käsitellä tiedostoihin liittyviä poikkeuksia
		//Ratkaisu: eriytän tiedostonkäsittelyn omaan luokkaansa (fileUtility)
		
		WeatherFileUtility fileUtility = new WeatherFileUtility();
		
		List<DailyWeather> weatherObservations = fileUtility.readFile();
		
		System.out.println("Read " + weatherObservations.size() + " daily observations");
        System.out.println("First observation: " + weatherObservations.get(0));
        System.out.println("Last observation: " + weatherObservations.get(weatherObservations.size() - 1));
		
	
		
	}

}
