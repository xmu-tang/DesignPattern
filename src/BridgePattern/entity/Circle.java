package BridgePattern.entity;

import BridgePattern.abstractClass.Shape;
import BridgePattern.api.DrawAPI;

public class Circle extends Shape{

	private int x, y, radius;
	
	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawAPI.drawCircle(radius, x, y);
	}

}
