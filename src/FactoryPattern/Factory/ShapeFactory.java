package FactoryPattern.Factory;

import FactoryPattern.Entity.Circle;
import FactoryPattern.Entity.Rectangle;
import FactoryPattern.Entity.Square;
import FactoryPattern.api.Shape;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if("CIRCLE".equalsIgnoreCase(shapeType)) {
			return new Circle();
		}else if("SQUARE".equalsIgnoreCase(shapeType)) {
			return new Square();
		}else if("RECTANGLE".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		}
		return null;
	}
}
