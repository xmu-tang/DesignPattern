package BuildPattern.Entity;

import BuildPattern.abstractClass.Burger;

public class ChickenBurger extends Burger{

	@Override
	public float price() {
		return 55.0f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}

}
