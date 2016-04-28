package commonalgorithms.headfirst.StrategyPattern.excise;

public class Queen extends myCharacter
{
    public Queen()
    {
    	weaponBehavior = new KnifeBehavior();
    }
}
