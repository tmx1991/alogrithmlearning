package commonalgorithms.headfirst.ObserverPattern;

public class StatisticDisplay implements Observer,DisplayElement
{

	private float temperature;
	private float humidity;
	private Subject weatherData;

	public StatisticDisplay(Subject weatherData)
	{
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float temp, float humidity, float pressure)
	{
		// TODO Auto-generated method stub
		
	}


}
