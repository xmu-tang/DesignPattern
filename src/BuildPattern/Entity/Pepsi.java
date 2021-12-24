package BuildPattern.Entity;

import BuildPattern.abstractClass.ColdDrink;

public class Pepsi extends ColdDrink{

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 9.0f;
	}
	
}
