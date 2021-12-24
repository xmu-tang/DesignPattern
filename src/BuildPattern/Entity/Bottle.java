package BuildPattern.Entity;

import BuildPattern.api.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}
