package PrototypePattern.Entity;

import PrototypePattern.abstractClass.Shape;

public class Rectangle extends Shape{
	public Rectangle(String id) {
		this.setId(id);
		type = "RECTANGLE";
	}

	@Override
	public void draw() {
		System.out.println("draw a " + type);
	}
}
