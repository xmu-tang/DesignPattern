package BuildPattern.Entity;

import BuildPattern.abstractClass.ColdDrink;

public class Coke extends ColdDrink{

	@Override
	public String name() {
		return "coke";
	}

	@Override
	public float price() {
		return 9.0f;
	}
	
}
