package AbstractFactoryPattern;

import AbstractFactoryPattern.Factory.abstractFactory.AbstractFactory;
import AbstractFactoryPattern.Factory.producer.FactoryProducer;
import AbstractFactoryPattern.api.Color;
import AbstractFactoryPattern.api.Shape;

public class AbstractFactoryPatternMain {

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		Shape shape1 = shapeFactory.getShape("SQUARE");
		
		shape1.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Color color1 = colorFactory.getColor("YELLOW");
		
		color1.fill();

	}

}
