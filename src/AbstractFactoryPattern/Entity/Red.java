package AbstractFactoryPattern.Entity;

import AbstractFactoryPattern.api.Color;

public class Red implements Color{

	@Override
	public void fill() {
		System.out.println("fill red");
	}

}
