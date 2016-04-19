package commonalgorithms.headfirst.StrategyPattern.excise;

public class Queen extends Character
{
    public Queen()
    {
    	weaponBehavior = new KnifeBehavior();
    }
}
