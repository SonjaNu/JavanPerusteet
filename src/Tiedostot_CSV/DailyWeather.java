package Tiedostot_CSV;

import java.time.LocalDate;

public class DailyWeather {
	
	private LocalDate date;
	
	private double rain;
	
	private double snow;
	
	private double maxTemp;
	
	private double minTemp;
	
	public DailyWeather(LocalDate date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Weather on " + this.date;
		
	}
	

}
