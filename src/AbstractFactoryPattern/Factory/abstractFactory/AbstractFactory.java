package AbstractFactoryPattern.Factory.abstractFactory;

import AbstractFactoryPattern.api.Color;
import AbstractFactoryPattern.api.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape(String shape);
	public abstract Color getColor(String color);
}
