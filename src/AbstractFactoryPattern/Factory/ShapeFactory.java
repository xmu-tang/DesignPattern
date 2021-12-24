package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Entity.Circle;
import AbstractFactoryPattern.Entity.Rectangle;
import AbstractFactoryPattern.Entity.Square;
import AbstractFactoryPattern.Factory.abstractFactory.AbstractFactory;
import AbstractFactoryPattern.api.Color;
import AbstractFactoryPattern.api.Shape;


public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shape) {
		if("CIRCLE".equalsIgnoreCase(shape)) {
			return new Circle();
		}else if("SQUARE".equalsIgnoreCase(shape)) {
			return new Square();
		}else if("RECTANGLE".equalsIgnoreCase(shape)) {
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
