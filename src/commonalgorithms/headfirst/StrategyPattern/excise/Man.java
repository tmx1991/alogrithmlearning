package commonalgorithms.headfirst.StrategyPattern.excise;

public class Man
{

	public static void main(String[] args)
	{
	 Character woman = new Queen();
	 woman.fight();
	 woman.setWeapon(new BowAndArrowBehavior());
	 woman.fight();
	}

}
