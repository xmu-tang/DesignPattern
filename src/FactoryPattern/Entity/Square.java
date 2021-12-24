package FactoryPattern.Entity;

import FactoryPattern.api.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("draw a Square");
	}

}
