package Tiedostot_CSV;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WeatherFileUtility {
	//ei sisällä main-metodia ( ei ole ohjelmaluokka)
	//ei sisällä oliomuuttujia (ei ole "dataluokka")

	public List<DailyWeather> readFile() {
		Path filePath = Paths.get("CSV", "Saatietoja.csv");
		try {
			
			List<String> rows = Files.readAllLines(filePath, StandardCharsets.UTF_8);
			String headers = rows.get(0);
			
			//palautetaan lista DailyWeather-olioita
			//1. luodaan tyhjä lista
			//laitetaan siihen tyypiksi DailyWeather
			
			List<DailyWeather> observations = new ArrayList<>();
			
			//2. luodaan jokaista riviä kohden uusi olio
			//lähdetään liikkeelle riviltä 1, koska
			
			for (int i = 1; i < rows.size(); i++) { //Pitää lähteä liikkeelle riviltä 1, koska rivillä nolla sijaitsevat otsikot
				//halutaan lukea riviltä i päivämäärä
				
				String row = rows.get(i);
				
				String[] data = row.split(",");
				//parsitaan päivämäärä
				int year = Integer.parseInt(data[0]);
				int month = Integer.parseInt(data[1]);
				int dayOfMonth = Integer.parseInt(data[2]);
				
				double maxTemp;
			
				LocalDate observationDate = LocalDate.of(year, month, dayOfMonth);
				
				//3. asetetaan olio kerrallaan listalle
				DailyWeather currentDay = new DailyWeather(observationDate);
				
				observations.add(currentDay);
				
			}
		return observations;
			
		} catch (IOException exception) {
			String errorMessage = exception.getMessage();
			System.out.println(errorMessage);
			
			
		}
		return new ArrayList<DailyWeather>();
		//tehdään
	//private DailyWeather parseDailyWeather(String)
		
		
	}
	


}
