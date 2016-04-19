package commonalgorithms.headfirst.StrategyPattern.excise;

public abstract class Character
{

	WeaponBehavior weaponBehavior;

	public void fight()
	{
		weaponBehavior.useWeapon();
	}
	public void setWeapon(WeaponBehavior w)
	{
		weaponBehavior = w;
	}
}
