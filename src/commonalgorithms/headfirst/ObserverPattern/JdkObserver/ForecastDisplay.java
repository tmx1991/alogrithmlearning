package commonalgorithms.headfirst.ObserverPattern.JdkObserver;

import java.util.Observable;
import java.util.Observer;

import commonalgorithms.headfirst.ObserverPattern.DisplayElement;

public class ForecastDisplay implements Observer,DisplayElement
{
	Observable observable;
	private float temperature;
	private float pressure;
	 

	public ForecastDisplay(Observable observable)
	{
		this.observable = observable;
		observable.addObserver(this);
	}
	

	@Override
	public void display()
	{
		System.out.println("Forcast conditions:" + temperature
				+ "F degrees and " + pressure + "% pressure");
		
	}


	@Override
	public void update(Observable paramObservable, Object paramObject)
	{
		if (paramObservable instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData) paramObservable;
			this.temperature = weatherData.getTemperature();
			this.pressure = weatherData.getPressure();
			display();
		}
		
	}



}
