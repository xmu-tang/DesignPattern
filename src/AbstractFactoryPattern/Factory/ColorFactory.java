package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Entity.Red;
import AbstractFactoryPattern.Entity.Yellow;
import AbstractFactoryPattern.Factory.abstractFactory.AbstractFactory;
import AbstractFactoryPattern.api.Color;
import AbstractFactoryPattern.api.Shape;

public class ColorFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shape) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if("RED".equalsIgnoreCase(color)) {
			return new Red();
		}else if("YELLOW".equalsIgnoreCase(color)) {
			return new Yellow();
		}
		return null;
	}

}
