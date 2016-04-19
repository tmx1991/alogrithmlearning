package commonalgorithms.headfirst.StrategyPattern.excise;

public class AxeBehavior implements WeaponBehavior
{

	@Override
	public void useWeapon()
	{
		System.out.println("使用斧头砍");
	}

}
