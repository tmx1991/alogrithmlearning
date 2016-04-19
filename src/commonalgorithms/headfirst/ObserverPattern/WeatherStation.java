package commonalgorithms.headfirst.ObserverPattern;

public class WeatherStation
{

	public static void main(String[] args)
	{
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65,30.4f);
		
		weatherData.setMeasurements(82, 70,29.3f);
		

	}

}
