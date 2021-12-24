package FactoryPattern;

import FactoryPattern.Factory.ShapeFactory;
import FactoryPattern.api.Shape;

public class FactoryPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("SQUARE");
		shape1.draw();
	}
}
