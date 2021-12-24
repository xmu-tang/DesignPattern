package PrototypePattern.Entity;

import PrototypePattern.abstractClass.Shape;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("draw a " + type);
	}
	
	public Circle(String id) {
		this.setId(id);
		type = "CIRCLE";
	}
}
