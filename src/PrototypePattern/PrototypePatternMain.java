package PrototypePattern;

import PrototypePattern.Cache.ShapeCache;
import PrototypePattern.abstractClass.Shape;

public class PrototypePatternMain {
	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape cloneShape1 =ShapeCache.getShape("1");
		Shape cloneShape2 =ShapeCache.getShape("1");
		System.out.println(cloneShape1.getType());
		System.out.println(cloneShape1 == cloneShape2);
	}
}
