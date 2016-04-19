package commonalgorithms.headfirst.decoratorPattern;

public class Espresso extends Beverage
{
	public Espresso()
	{
		description = "Espress";
	}

	@Override
	public double cost()
	{
		return 1.99;

	}

}
