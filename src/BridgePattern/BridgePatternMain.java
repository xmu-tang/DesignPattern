package BridgePattern;

import BridgePattern.abstractClass.Shape;
import BridgePattern.entity.Circle;
import BridgePattern.entity.GreenCircle;
import BridgePattern.entity.RedCircle;

public class BridgePatternMain {
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
		redCircle.draw();
		greenCircle.draw();
	}
}
