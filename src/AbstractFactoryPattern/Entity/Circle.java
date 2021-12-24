package AbstractFactoryPattern.Entity;

import AbstractFactoryPattern.api.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("draw a Circle");
	}

}
