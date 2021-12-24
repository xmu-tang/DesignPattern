package AbstractFactoryPattern.Entity;

import AbstractFactoryPattern.api.Shape;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("draw a Rectangle");
	}
	
}
