package BuildPattern.Entity;

import BuildPattern.api.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}

}
