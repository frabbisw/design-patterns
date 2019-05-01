package shape;

import java.awt.Graphics;
import java.awt.Polygon;

public class Triangle extends Shape{

	Polygon polygon;
	public Triangle(int x0, int y0, int width, int height) 
	{
		super(x0, y0, width, height);
		
		polygon=new Polygon();
		polygon.addPoint(x0+width/2, y0);
		polygon.addPoint(x0, y0+height);
		polygon.addPoint(x0+width, y0+height);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
		g.setColor(color);
		g.fillPolygon(polygon);
	}
}
