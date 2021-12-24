package BuildPattern.abstractClass;

import BuildPattern.Entity.Bottle;
import BuildPattern.api.Item;
import BuildPattern.api.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
