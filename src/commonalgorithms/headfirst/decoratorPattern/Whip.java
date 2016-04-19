package commonalgorithms.headfirst.decoratorPattern;

public class Whip extends ConditionDecorator
{
	Beverage beverage;

	public Whip(Beverage beverage)
	{
		this.beverage = beverage;
	}

	@Override
	public String getDescription()
	{
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Whip";
	}

	@Override
	public double cost()
	{
		// TODO Auto-generated method stub
		return 0.40+beverage.cost();
	}
}
