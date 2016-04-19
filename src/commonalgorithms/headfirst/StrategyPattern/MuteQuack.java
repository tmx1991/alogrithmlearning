package commonalgorithms.headfirst.StrategyPattern;

public class MuteQuack implements QuackBehavior
{

	@Override
	public void quack()
	{
		System.out.println("<<Silence>>");
	}

}
