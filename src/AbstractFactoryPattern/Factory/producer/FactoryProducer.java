package AbstractFactoryPattern.Factory.producer;

import AbstractFactoryPattern.Factory.ColorFactory;
import AbstractFactoryPattern.Factory.ShapeFactory;
import AbstractFactoryPattern.Factory.abstractFactory.AbstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if("SHAPE".equalsIgnoreCase(choice)) {
			return new ShapeFactory();
		}else if("COLOR".equalsIgnoreCase(choice)) {
			return new ColorFactory();
		}
		return null;
	}
}
