package commonalgorithms.headfirst.StrategyPattern;

public abstract class Duck
{
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public void performQuack()
	{
		quackBehavior.quack();
	}

	public void performFly()
	{
		flyBehavior.fly();
	}

	public void swim()
	{
		System.out.println("All ducks float,even decoy!");
	}

	public void setFlyBehavior(FlyBehavior fb)
	{
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb)
	{
		quackBehavior = qb;
	}

}
