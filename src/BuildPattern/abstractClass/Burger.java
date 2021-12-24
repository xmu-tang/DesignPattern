package BuildPattern.abstractClass;

import BuildPattern.Entity.Wrapper;
import BuildPattern.api.Item;
import BuildPattern.api.Packing;

public abstract class Burger implements Item{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
	
}
