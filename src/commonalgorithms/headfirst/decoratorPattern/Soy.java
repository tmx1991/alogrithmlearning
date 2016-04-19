package commonalgorithms.headfirst.decoratorPattern;

public class Soy extends ConditionDecorator
{
	Beverage beverage;

	public Soy(Beverage beverage)
	{
		this.beverage = beverage;
	}

	@Override
	public String getDescription()
	{
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Soy";
	}

	@Override
	public double cost()
	{
		// TODO Auto-generated method stub
		return 0.30+beverage.cost();
	}
}
