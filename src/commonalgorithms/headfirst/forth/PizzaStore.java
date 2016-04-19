package commonalgorithms.headfirst.forth;

public abstract class PizzaStore
{
	SimplePizzaFactory factory;

//	public PizzaStore(SimplePizzaFactory factory)
//	{
//		this.factory = factory;
//	}

	public Pizza orderPizza(String type)
	{
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.cut();
		pizza.bake();
		pizza.box();
		return null;

	}

	abstract Pizza createPizza(String type);
	
}
