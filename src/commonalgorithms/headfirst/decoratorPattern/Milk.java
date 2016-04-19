package commonalgorithms.headfirst.decoratorPattern;

public class Milk extends ConditionDecorator
{

	Beverage beverage;

	public Milk(Beverage beverage)
	{
		this.beverage = beverage;
	}

	@Override
	public String getDescription()
	{
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Milk";
	}

	@Override
	public double cost()
	{
		// TODO Auto-generated method stub
		return 0.50+beverage.cost();
	}

}
