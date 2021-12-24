package AbstractFactoryPattern.Entity;

import AbstractFactoryPattern.api.Color;

public class Yellow implements Color{

	@Override
	public void fill() {
		System.out.println("fill yellow");
	}
	
}
