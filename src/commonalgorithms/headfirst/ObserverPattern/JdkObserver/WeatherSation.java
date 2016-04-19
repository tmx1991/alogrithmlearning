package commonalgorithms.headfirst.ObserverPattern.JdkObserver;

import java.util.Observable;

import commonalgorithms.headfirst.ObserverPattern.JdkObserver.WeatherData;

public class WeatherSation
{
	public static void main(String[] args)
	{
		WeatherData weatherData = new WeatherData();
		Observable o1 = new Observable();
		Observable o2 = new Observable();
		
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(o1);
		ForecastDisplay fd = new ForecastDisplay(o2);
		weatherData.addObserver(ccd);
		weatherData.addObserver(fd);
		weatherData.setMeasurements(80, 80, 80);
		weatherData.setMeasurements(60, 86, 87);
	}
}
