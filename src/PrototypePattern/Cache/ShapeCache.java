package PrototypePattern.Cache;

import java.util.Hashtable;

import PrototypePattern.Entity.Circle;
import PrototypePattern.Entity.Rectangle;
import PrototypePattern.abstractClass.Shape;

public class ShapeCache {
	private static Hashtable<String, Shape> shapeMap = new Hashtable<>();
	
	public static Shape getShape(String id) {
		Shape cachedShape = shapeMap.get(id);
		return (Shape)cachedShape.clone();
	}
	
	public static void loadCache() {
		Circle circle = new Circle("1");
		Rectangle rectangle = new Rectangle("2");
		shapeMap.put(circle.getId(), circle);
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
